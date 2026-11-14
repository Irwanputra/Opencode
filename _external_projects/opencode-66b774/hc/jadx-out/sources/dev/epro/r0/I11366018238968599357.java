package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I11366018238968599357 {
    public static final I11366018238968599357 e = new I11366018238968599357(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public I11366018238968599357(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I11366018238968599357)) {
            return false;
        }
        I11366018238968599357 i11366018238968599357 = (I11366018238968599357) obj;
        return this.a == i11366018238968599357.a && this.b == i11366018238968599357.b && this.c == i11366018238968599357.c && this.d == i11366018238968599357.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + X2485016533998461232.f(this.c, X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = E12098517352909843120.p(this.a, this.b, "IntRect.fromLTRB(", ", ", ", ");
        sbP.append(this.c);
        sbP.append(", ");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
