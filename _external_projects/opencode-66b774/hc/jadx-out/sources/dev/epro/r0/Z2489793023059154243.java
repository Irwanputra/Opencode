package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z2489793023059154243 {
    public final R8360857824092671497 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public Z2489793023059154243(R8360857824092671497 r8360857824092671497, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = r8360857824092671497;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final S6349823729575121924 a(S6349823729575121924 s6349823729575121924) {
        return s6349823729575121924.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = F12478849263529740365.b;
            if (F12478849263529740365.c(j, j2)) {
                return j2;
            }
        }
        int i = F12478849263529740365.c;
        int i2 = this.b;
        return T1335862270807194835.d(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final S6349823729575121924 c(S6349823729575121924 s6349823729575121924) {
        float f = -this.f;
        return s6349823729575121924.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return W7808703833045379622.q(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z2489793023059154243) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) obj;
            if (this.a == z2489793023059154243.a && this.b == z2489793023059154243.b && this.c == z2489793023059154243.c && this.d == z2489793023059154243.d && this.e == z2489793023059154243.e && Float.compare(this.f, z2489793023059154243.f) == 0 && Float.compare(this.g, z2489793023059154243.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + E12098517352909843120.e(this.f, X2485016533998461232.f(this.e, X2485016533998461232.f(this.d, X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        G6547577305291411977.A(sb, this.c, ", startLineIndex=", this.d, ", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
