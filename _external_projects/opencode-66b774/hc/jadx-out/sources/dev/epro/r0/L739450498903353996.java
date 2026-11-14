package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L739450498903353996 implements G15527156457921655762 {
    public final float a;
    public final float b;

    public L739450498903353996(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.G15527156457921655762
    public final long a(long j, long j2, F10342546226345611902 f10342546226345611902) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        F10342546226345611902 f103425462263456119022 = F10342546226345611902.a;
        float f3 = this.a;
        if (f10342546226345611902 != f103425462263456119022) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L739450498903353996)) {
            return false;
        }
        L739450498903353996 l739450498903353996 = (L739450498903353996) obj;
        return Float.compare(this.a, l739450498903353996.a) == 0 && Float.compare(this.b, l739450498903353996.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
