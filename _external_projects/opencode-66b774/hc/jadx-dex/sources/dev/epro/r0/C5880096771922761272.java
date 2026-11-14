package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C5880096771922761272 extends dev.epro.r0.H5732944296146006561 {
    public static final java.math.BigInteger e = java.math.BigInteger.valueOf(65537);
    public final int a;
    public final java.math.BigInteger b;
    public final dev.epro.r0.D14731132657808549702 c;
    public final dev.epro.r0.V11865174435555805371 d;

    public C5880096771922761272(int i, java.math.BigInteger bigInteger, dev.epro.r0.D14731132657808549702 d14731132657808549702, dev.epro.r0.V11865174435555805371 v11865174435555805371) {
        this.a = i;
        this.b = bigInteger;
        this.c = d14731132657808549702;
        this.d = v11865174435555805371;
    }

    public static dev.epro.r0.M14296037792602877869 b() {
        dev.epro.r0.M14296037792602877869 m14296037792602877869 = new dev.epro.r0.M14296037792602877869();
        m14296037792602877869.a = null;
        m14296037792602877869.b = e;
        m14296037792602877869.c = null;
        m14296037792602877869.d = dev.epro.r0.D14731132657808549702.s0;
        return m14296037792602877869;
    }

    public final boolean a() {
        return this.c != dev.epro.r0.D14731132657808549702.s0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.C5880096771922761272)) {
            return false;
        }
        dev.epro.r0.C5880096771922761272 c5880096771922761272 = (dev.epro.r0.C5880096771922761272) obj;
        return c5880096771922761272.a == this.a && java.util.Objects.equals(c5880096771922761272.b, this.b) && c5880096771922761272.c == this.c && c5880096771922761272.d == this.d;
    }

    public final int hashCode() {
        return java.util.Objects.hash(dev.epro.r0.C5880096771922761272.class, java.lang.Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.d);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.b);
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", publicExponent: ");
        sbY.append(strValueOf3);
        sbY.append(", and ");
        sbY.append(this.a);
        sbY.append("-bit modulus)");
        return sbY.toString();
    }
}
