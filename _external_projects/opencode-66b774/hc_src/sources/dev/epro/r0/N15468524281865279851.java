package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N15468524281865279851 implements R8540738700654750557 {
    public final float a;
    public final float b;
    public final V15138624659649446319 c;

    public N15468524281865279851(float f, float f2, V15138624659649446319 v15138624659649446319) {
        this.a = f;
        this.b = f2;
        this.c = v15138624659649446319;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return V3311072669930093336.n(this.c.a(f), 4294967296L);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        if (E6417708602094478350.a(J5593409210068682756.b(j), 4294967296L)) {
            return this.c.b(J5593409210068682756.c(j));
        }
        S10973172697741180971.m("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N15468524281865279851)) {
            return false;
        }
        N15468524281865279851 n15468524281865279851 = (N15468524281865279851) obj;
        return Float.compare(this.a, n15468524281865279851.a) == 0 && Float.compare(this.b, n15468524281865279851.b) == 0 && this.c.equals(n15468524281865279851.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder k = G11450220448113054352.k("DensityWithConverter(density=", this.a, ", fontScale=", this.b, ", converter=");
        k.append(this.c);
        k.append(")");
        return k.toString();
    }
}
