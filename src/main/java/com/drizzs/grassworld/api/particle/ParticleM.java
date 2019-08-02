package com.drizzs.grassworld.api.particle;

import com.google.common.base.Charsets;
import com.google.common.collect.*;
import com.mojang.blaze3d.platform.GlStateManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.MissingTextureSprite;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.Entity;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IFutureReloadListener;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.Direction;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParticleM implements IFutureReloadListener
{

    private static final List<IParticleRenderType> TYPES;
    protected World world;
    private final Map<IParticleRenderType, Queue<Particle>> byType = Maps.newIdentityHashMap();
    private final Queue<EmitterParticle> particleEmitters = Queues.newArrayDeque();
    private final TextureManager renderer;
    private final Random rand = new Random();
    private final Int2ObjectMap<IParticleFactory<?>> factories = new Int2ObjectOpenHashMap();
    private final Queue<Particle> queue = Queues.newArrayDeque();
    private final Map<ResourceLocation, ParticleM.AnimatedSpriteImpl> sprites = Maps.newHashMap();
    private final AtlasTexture atlas = new AtlasTexture("textures/particle");

    public ParticleM(World worldIn, TextureManager rendererIn) {
        rendererIn.loadTickableTexture(AtlasTexture.LOCATION_PARTICLES_TEXTURE, this.atlas);
        this.world = worldIn;
        this.renderer = rendererIn;
        this.registerFactories();
    }

    private void registerFactories() {
     }

    public <T extends IParticleData> void registerFactory(ParticleType<T> particleTypeIn, IParticleFactory<T> particleFactoryIn) {
        this.factories.put(Registry.PARTICLE_TYPE.getId(particleTypeIn), particleFactoryIn);
    }

    public <T extends IParticleData> void registerFactory(ParticleType<T> particleTypeIn, ParticleM.IParticleMetaFactory<T> particleMetaFactoryIn) {
        ParticleM.AnimatedSpriteImpl particlemanager$animatedspriteimpl = new ParticleM.AnimatedSpriteImpl();
        this.sprites.put(Registry.PARTICLE_TYPE.getKey(particleTypeIn), particlemanager$animatedspriteimpl);
        this.factories.put(Registry.PARTICLE_TYPE.getId(particleTypeIn), particleMetaFactoryIn.create(particlemanager$animatedspriteimpl));
    }

    public CompletableFuture reload(IStage stage, IResourceManager resourceManager, IProfiler preparationsProfiler, IProfiler reloadProfiler, Executor backgroundExecutor, Executor gameExecutor) {
        Map<ResourceLocation, List<ResourceLocation>> map = Maps.newConcurrentMap();
        CompletableFuture<?>[] completablefuture = (CompletableFuture[])Registry.PARTICLE_TYPE.keySet().stream().map((p_215228_4_) -> {
            return CompletableFuture.runAsync(() -> {
                this.loadTextureLists(resourceManager, p_215228_4_, map);
            }, backgroundExecutor);
        }).toArray((p_215239_0_) -> {
            return new CompletableFuture[p_215239_0_];
        });
        CompletableFuture var10000 = CompletableFuture.allOf(completablefuture).thenApplyAsync((p_215230_4_) -> {
            preparationsProfiler.startTick();
            preparationsProfiler.startSection("stitching");
            Set<ResourceLocation> set = (Set)map.values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
            AtlasTexture.SheetData atlastexture$sheetdata = this.atlas.stitch(resourceManager, set, preparationsProfiler);
            preparationsProfiler.endSection();
            preparationsProfiler.endTick();
            return atlastexture$sheetdata;
        }, backgroundExecutor);
        stage.getClass();
        return var10000.thenCompose(stage::markCompleteAwaitingOthers).thenAcceptAsync((p_215260_1_) -> {
            reloadProfiler.startTick();
            reloadProfiler.startSection("upload");
            this.atlas.upload(p_215260_1_);
            reloadProfiler.endStartSection("bindSpriteSets");
            TextureAtlasSprite textureatlassprite = this.atlas.getSprite(MissingTextureSprite.getLocation());
            map.forEach((p_215227_2_, p_215227_3_) -> {
                ImmutableList i1;
                if (p_215227_3_.isEmpty()) {
                    i1 = ImmutableList.of(textureatlassprite);
                } else {
                    Stream stream = p_215227_3_.stream();
                    AtlasTexture var10001 = this.atlas;
                    var10001.getClass();
                    i1 = (ImmutableList)stream.map(var10001::getSprite).collect(ImmutableList.toImmutableList());
                }

                ImmutableList<TextureAtlasSprite> immutablelist = i1;
                ((AnimatedSpriteImpl)this.sprites.get(p_215227_2_)).setSprites(immutablelist);
            });
            reloadProfiler.endSection();
            reloadProfiler.endTick();
        }, gameExecutor);
    }

    public void func_215232_a() {
        this.atlas.clear();
    }

    private void loadTextureLists(IResourceManager manager, ResourceLocation particleId, Map<ResourceLocation, List<ResourceLocation>> textures) {
        ResourceLocation resourcelocation = new ResourceLocation(particleId.getNamespace(), "particles/" + particleId.getPath() + ".json");

        try {
            IResource iresource = manager.getResource(resourcelocation);
            Throwable var6 = null;

            try {
                Reader reader = new InputStreamReader(iresource.getInputStream(), Charsets.UTF_8);
                Throwable var8 = null;

                try {
                    TexturesParticle texturesparticle = TexturesParticle.deserialize(JSONUtils.fromJson(reader));
                    List<ResourceLocation> list = texturesparticle.getTextures();
                    boolean flag = this.sprites.containsKey(particleId);
                    if (list == null) {
                        if (flag) {
                            throw new IllegalStateException("Missing texture list for particle " + particleId);
                        }
                    } else {
                        if (!flag) {
                            throw new IllegalStateException("Redundant texture list for particle " + particleId);
                        }

                        textures.put(particleId, list);
                    }
                } catch (Throwable var35) {
                    var8 = var35;
                    throw var35;
                } finally {
                    if (reader != null) {
                        if (var8 != null) {
                            try {
                                reader.close();
                            } catch (Throwable var34) {
                                var8.addSuppressed(var34);
                            }
                        } else {
                            reader.close();
                        }
                    }

                }
            } catch (Throwable var37) {
                var6 = var37;
                throw var37;
            } finally {
                if (iresource != null) {
                    if (var6 != null) {
                        try {
                            iresource.close();
                        } catch (Throwable var33) {
                            var6.addSuppressed(var33);
                        }
                    } else {
                        iresource.close();
                    }
                }

            }

        } catch (IOException var39) {
            throw new IllegalStateException("Failed to load description for particle " + particleId, var39);
        }
    }

    public void addParticleEmitter(Entity entityIn, IParticleData particleData) {
        this.particleEmitters.add(new EmitterParticle(this.world, entityIn, particleData));
    }

    public void emitParticleAtEntity(Entity entityIn, IParticleData dataIn, int lifetimeIn) {
        this.particleEmitters.add(new EmitterParticle(this.world, entityIn, dataIn, lifetimeIn));
    }

    @Nullable
    public Particle addParticle(IParticleData particleData, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        Particle particle = this.makeParticle(particleData, x, y, z, xSpeed, ySpeed, zSpeed);
        if (particle != null) {
            this.addEffect(particle);
            return particle;
        } else {
            return null;
        }
    }

    @Nullable
    private <T extends IParticleData> Particle makeParticle(T particleData, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        IParticleFactory<T> iparticlefactory = (IParticleFactory)this.factories.get(Registry.PARTICLE_TYPE.getId(particleData.getType()));
        return iparticlefactory == null ? null : iparticlefactory.makeParticle(particleData, this.world, x, y, z, xSpeed, ySpeed, zSpeed);
    }

    public void addEffect(Particle effect) {
        if (effect != null) {
            this.queue.add(effect);
        }
    }

    public void tick() {
        this.byType.forEach((p_215235_1_, p_215235_2_) -> {
            this.world.getProfiler().startSection(p_215235_1_.toString());
            this.tickParticleList(p_215235_2_);
            this.world.getProfiler().endSection();
        });
        if (!this.particleEmitters.isEmpty()) {
            List<EmitterParticle> list = Lists.newArrayList();
            Iterator var2 = this.particleEmitters.iterator();

            while(var2.hasNext()) {
                EmitterParticle emitterparticle = (EmitterParticle)var2.next();
                emitterparticle.tick();
                if (!emitterparticle.isAlive()) {
                    list.add(emitterparticle);
                }
            }

            this.particleEmitters.removeAll(list);
        }

        Particle particle;
        if (!this.queue.isEmpty()) {
            while((particle = (Particle)this.queue.poll()) != null) {
                ((Queue)this.byType.computeIfAbsent(particle.getRenderType(), (p_215231_0_) -> {
                    return EvictingQueue.create(16384);
                })).add(particle);
            }
        }

    }

    private void tickParticleList(Collection<Particle> particlesIn) {
        if (!particlesIn.isEmpty()) {
            Iterator iterator = particlesIn.iterator();

            while(iterator.hasNext()) {
                Particle particle = (Particle)iterator.next();
                this.tickParticle(particle);
                if (!particle.isAlive()) {
                    iterator.remove();
                }
            }
        }

    }

    private void tickParticle(Particle particle) {
        try {
            particle.tick();
        } catch (Throwable var6) {
            CrashReport crashreport = CrashReport.makeCrashReport(var6, "Ticking Particle");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Particle being ticked");
            crashreportcategory.addDetail("Particle", particle::toString);
            IParticleRenderType iparticlerendertype = particle.getRenderType();
            crashreportcategory.addDetail("Particle Type", iparticlerendertype::toString);
            throw new ReportedException(crashreport);
        }
    }

    public void renderParticles(ActiveRenderInfo p_215233_1_, float p_215233_2_) {
        float f = MathHelper.cos(p_215233_1_.getYaw() * 0.017453292F);
        float f1 = MathHelper.sin(p_215233_1_.getYaw() * 0.017453292F);
        float f2 = -f1 * MathHelper.sin(p_215233_1_.getPitch() * 0.017453292F);
        float f3 = f * MathHelper.sin(p_215233_1_.getPitch() * 0.017453292F);
        float f4 = MathHelper.cos(p_215233_1_.getPitch() * 0.017453292F);
        Particle.interpPosX = p_215233_1_.getProjectedView().x;
        Particle.interpPosY = p_215233_1_.getProjectedView().y;
        Particle.interpPosZ = p_215233_1_.getProjectedView().z;
        Iterator var8 = TYPES.iterator();

        while(true) {
            IParticleRenderType iparticlerendertype;
            Iterable iterable;
            do {
                if (!var8.hasNext()) {
                    GlStateManager.depthMask(true);
                    GlStateManager.disableBlend();
                    GlStateManager.alphaFunc(516, 0.1F);
                    return;
                }

                iparticlerendertype = (IParticleRenderType)var8.next();
                iterable = (Iterable)this.byType.get(iparticlerendertype);
            } while(iterable == null);

            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();
            iparticlerendertype.beginRender(bufferbuilder, this.renderer);
            Iterator var13 = iterable.iterator();

            while(var13.hasNext()) {
                Particle particle = (Particle)var13.next();

                try {
                    particle.renderParticle(bufferbuilder, p_215233_1_, p_215233_2_, f, f4, f1, f2, f3);
                } catch (Throwable var18) {
                    CrashReport crashreport = CrashReport.makeCrashReport(var18, "Rendering Particle");
                    CrashReportCategory crashreportcategory = crashreport.makeCategory("Particle being rendered");
                    crashreportcategory.addDetail("Particle", particle::toString);
                    crashreportcategory.addDetail("Particle Type", iparticlerendertype::toString);
                    throw new ReportedException(crashreport);
                }
            }

            iparticlerendertype.finishRender(tessellator);
        }
    }

    public void clearEffects(@Nullable World worldIn) {
        this.world = worldIn;
        this.byType.clear();
        this.particleEmitters.clear();
    }


    public void addBlockHitEffects(BlockPos pos, Direction side) {
        BlockState blockstate = this.world.getBlockState(pos);
        if (blockstate.getRenderType() != BlockRenderType.INVISIBLE) {
            int i = pos.getX();
            int j = pos.getY();
            int k = pos.getZ();
            float f = 0.1F;
            AxisAlignedBB axisalignedbb = blockstate.getShape(this.world, pos).getBoundingBox();
            double d0 = (double)i + this.rand.nextDouble() * (axisalignedbb.maxX - axisalignedbb.minX - 0.20000000298023224D) + 0.10000000149011612D + axisalignedbb.minX;
            double d1 = (double)j + this.rand.nextDouble() * (axisalignedbb.maxY - axisalignedbb.minY - 0.20000000298023224D) + 0.10000000149011612D + axisalignedbb.minY;
            double d2 = (double)k + this.rand.nextDouble() * (axisalignedbb.maxZ - axisalignedbb.minZ - 0.20000000298023224D) + 0.10000000149011612D + axisalignedbb.minZ;
            if (side == Direction.DOWN) {
                d1 = (double)j + axisalignedbb.minY - 0.10000000149011612D;
            }

            if (side == Direction.UP) {
                d1 = (double)j + axisalignedbb.maxY + 0.10000000149011612D;
            }

            if (side == Direction.NORTH) {
                d2 = (double)k + axisalignedbb.minZ - 0.10000000149011612D;
            }

            if (side == Direction.SOUTH) {
                d2 = (double)k + axisalignedbb.maxZ + 0.10000000149011612D;
            }

            if (side == Direction.WEST) {
                d0 = (double)i + axisalignedbb.minX - 0.10000000149011612D;
            }

            if (side == Direction.EAST) {
                d0 = (double)i + axisalignedbb.maxX + 0.10000000149011612D;
            }

            this.addEffect((new DiggingParticle(this.world, d0, d1, d2, 0.0D, 0.0D, 0.0D, blockstate)).setBlockPos(pos).multiplyVelocity(0.2F).multipleParticleScaleBy(0.6F));
        }

    }

    public String getStatistics() {
        return String.valueOf(this.byType.values().stream().mapToInt(Collection::size).sum());
    }



    static {
        TYPES = ImmutableList.of(IParticleRenderType.TERRAIN_SHEET, IParticleRenderType.PARTICLE_SHEET_OPAQUE, IParticleRenderType.PARTICLE_SHEET_LIT, IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT, IParticleRenderType.CUSTOM);
    }

    @FunctionalInterface
    @OnlyIn(Dist.CLIENT)
    interface IParticleMetaFactory<T extends IParticleData> {
        IParticleFactory<T> create(IAnimatedSprite var1);
    }

    @OnlyIn(Dist.CLIENT)
    class AnimatedSpriteImpl implements IAnimatedSprite {
        private List<TextureAtlasSprite> field_217594_b;

        private AnimatedSpriteImpl() {
        }

        public TextureAtlasSprite get(int particleAge, int particleMaxAge) {
            return (TextureAtlasSprite)this.field_217594_b.get(particleAge * (this.field_217594_b.size() - 1) / particleMaxAge);
        }

        public TextureAtlasSprite get(Random p_217590_1_) {
            return (TextureAtlasSprite)this.field_217594_b.get(p_217590_1_.nextInt(this.field_217594_b.size()));
        }

        public void setSprites(List<TextureAtlasSprite> p_217592_1_) {
            this.field_217594_b = ImmutableList.copyOf(p_217592_1_);
        }
    }
}





