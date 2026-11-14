package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L17430828668570684240 {

    @O7462376509978667369("width")
    public final int a;

    @O7462376509978667369("height")
    public final int b;

    @O7462376509978667369("is_fluid_height")
    public final boolean c;

    public L17430828668570684240(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L17430828668570684240)) {
            return false;
        }
        L17430828668570684240 l17430828668570684240 = (L17430828668570684240) obj;
        return this.a == l17430828668570684240.a && this.b == l17430828668570684240.b && this.c == l17430828668570684240.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iH = U1554499319261669842.h(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iH + r2;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return E12098517352909843120.o(E12098517352909843120.p(i, i2, "AdSizeBundle(width=", ", height=", ", isFluid="), this.c, ")");
    }
}
