package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O2311549625018100601 implements E13332886634652933381 {
    public final A4300800680137755387 a;
    public final A4300800680137755387 b;
    public final int c;

    public O2311549625018100601(A4300800680137755387 a4300800680137755387, A4300800680137755387 a43008006801377553872, int i) {
        this.a = a4300800680137755387;
        this.b = a43008006801377553872;
        this.c = i;
    }

    @Override // dev.epro.r0.E13332886634652933381
    public final int a(I11366018238968599357 i11366018238968599357, long j, int i, F10342546226345611902 f10342546226345611902) {
        int iA = this.b.a(0, i11366018238968599357.d(), f10342546226345611902);
        int i2 = -this.a.a(0, i, f10342546226345611902);
        F10342546226345611902 f103425462263456119022 = F10342546226345611902.a;
        int i3 = this.c;
        if (f10342546226345611902 != f103425462263456119022) {
            i3 = -i3;
        }
        return L11610354117192841236.e(i11366018238968599357.a, iA, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2311549625018100601)) {
            return false;
        }
        O2311549625018100601 o2311549625018100601 = (O2311549625018100601) obj;
        return this.a.equals(o2311549625018100601.a) && this.b.equals(o2311549625018100601.b) && this.c == o2311549625018100601.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + E12098517352909843120.e(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
