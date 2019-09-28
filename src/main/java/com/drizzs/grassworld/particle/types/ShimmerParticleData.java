package com.drizzs.grassworld.particle.types;

import com.drizzs.grassworld.particle.GrassParticleRegistry;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;

import javax.annotation.Nonnull;
import java.util.Locale;

public class ShimmerParticleData implements IParticleData {
    public final float size;
    public final float r, g, b;
    public final float maxAge;
    public final boolean depthTest;

    public static ShimmerParticleData shimmer(float size, float r, float g, float b) {
        return shimmer(size, r, g, b, 1);
    }

    public static ShimmerParticleData shimmer(float size, float r, float g, float b, float maxAge) {
        return shimmer(size, r, g, b, maxAge, true);
    }

    public static ShimmerParticleData shimmer(float size, float r, float g, float b, boolean depth) {
        return shimmer(size, r, g, b, 1, depth);
    }

    public static ShimmerParticleData shimmer(float size, float r, float g, float b, float maxAge, boolean depthTest) {
        return new ShimmerParticleData(size, r, g, b, maxAge, depthTest);
    }

    private ShimmerParticleData(float size, float r, float g, float b, float maxAge, boolean depthTest) {
        this.size = size;
        this.r = r;
        this.g = g;
        this.b = b;
        this.maxAge = maxAge;
        this.depthTest = depthTest;
    }


    @Nonnull
    @Override
    public ParticleType<ShimmerParticleData> getType() {
        return GrassParticleRegistry.SHIMMER;
    }

    @Override
    public void write(PacketBuffer buf) {
        buf.writeFloat(size);
        buf.writeFloat(r);
        buf.writeFloat(g);
        buf.writeFloat(b);
        buf.writeFloat(maxAge);
        buf.writeBoolean(depthTest);
    }

    @Nonnull
    @Override
    public String getParameters() {
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %s",
                this.getType().getRegistryName(), this.size, this.r, this.g, this.b, this.maxAge, this.depthTest);
    }

    public static final IDeserializer<ShimmerParticleData> DESERIALIZER = new IDeserializer<ShimmerParticleData>() {
        @Nonnull
        @Override
        public ShimmerParticleData deserialize(@Nonnull ParticleType<ShimmerParticleData> type, @Nonnull StringReader reader) throws CommandSyntaxException {
            reader.expect(' ');
            float size = reader.readFloat();
            reader.expect(' ');
            float r = reader.readFloat();
            reader.expect(' ');
            float g = reader.readFloat();
            reader.expect(' ');
            float b = reader.readFloat();
            reader.expect(' ');
            float mam = reader.readFloat();
            boolean depth = true;
            if (reader.canRead()) {
                reader.expect(' ');
                depth = reader.readBoolean();
            }
            return new ShimmerParticleData(size, r, g, b, mam, depth);
        }

        @Override
        public ShimmerParticleData read(@Nonnull ParticleType<ShimmerParticleData> type, PacketBuffer buf) {
            return new ShimmerParticleData(buf.readFloat(), buf.readFloat(), buf.readFloat(), buf.readFloat(), buf.readFloat(), buf.readBoolean());
        }
    };
}