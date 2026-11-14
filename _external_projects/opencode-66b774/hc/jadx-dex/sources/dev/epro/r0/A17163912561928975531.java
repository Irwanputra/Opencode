package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A17163912561928975531 extends dev.epro.r0.V6719956433280724295 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final dev.epro.r0.D14731132657808549702 e;
    public final dev.epro.r0.D14731132657808549702 f;

    public A17163912561928975531(int i, int i2, int i3, int i4, dev.epro.r0.D14731132657808549702 d14731132657808549702, dev.epro.r0.D14731132657808549702 d147311326578085497022) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = d14731132657808549702;
        this.f = d147311326578085497022;
    }

    public static dev.epro.r0.B16853324304735504143 b() {
        dev.epro.r0.B16853324304735504143 b16853324304735504143 = new dev.epro.r0.B16853324304735504143();
        b16853324304735504143.a = null;
        b16853324304735504143.b = null;
        b16853324304735504143.c = null;
        b16853324304735504143.d = null;
        b16853324304735504143.e = null;
        b16853324304735504143.f = dev.epro.r0.D14731132657808549702.n;
        return b16853324304735504143;
    }

    public final boolean a() {
        return this.e != dev.epro.r0.D14731132657808549702.n;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.A17163912561928975531)) {
            return false;
        }
        dev.epro.r0.A17163912561928975531 a17163912561928975531 = (dev.epro.r0.A17163912561928975531) obj;
        return a17163912561928975531.a == this.a && a17163912561928975531.b == this.b && a17163912561928975531.c == this.c && a17163912561928975531.d == this.d && a17163912561928975531.e == this.e && a17163912561928975531.f == this.f;
    }

    public final int hashCode() {
        return java.util.Objects.hash(dev.epro.r0.A17163912561928975531.class, java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), this.e, this.f);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("AesCtrHmacAead Parameters (variant: ", java.lang.String.valueOf(this.e), ", hashType: ", java.lang.String.valueOf(this.f), ", ");
        dev.epro.r0.G6547577305291411977.A(sbY, this.c, "-byte IV, and ", this.d, "-byte tags, and ");
        sbY.append(this.a);
        sbY.append("-byte AES key, and ");
        sbY.append(this.b);
        sbY.append("-byte HMAC key)");
        return sbY.toString();
    }
}
