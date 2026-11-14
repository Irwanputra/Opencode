package dev.epro.r0;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C5880096771922761272 extends H5732944296146006561 {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final D14731132657808549702 c;
    public final V11865174435555805371 d;

    public C5880096771922761272(int i, BigInteger bigInteger, D14731132657808549702 d14731132657808549702, V11865174435555805371 v11865174435555805371) {
        this.a = i;
        this.b = bigInteger;
        this.c = d14731132657808549702;
        this.d = v11865174435555805371;
    }

    public static M14296037792602877869 b() {
        M14296037792602877869 m14296037792602877869 = new M14296037792602877869();
        m14296037792602877869.a = null;
        m14296037792602877869.b = e;
        m14296037792602877869.c = null;
        m14296037792602877869.d = D14731132657808549702.s0;
        return m14296037792602877869;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.c != D14731132657808549702.s0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5880096771922761272)) {
            return false;
        }
        C5880096771922761272 c5880096771922761272 = (C5880096771922761272) obj;
        return c5880096771922761272.a == this.a && Objects.equals(c5880096771922761272.b, this.b) && c5880096771922761272.c == this.c && c5880096771922761272.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(C5880096771922761272.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        StringBuilder sbY = G6547577305291411977.y("RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2, ", publicExponent: ");
        sbY.append(strValueOf3);
        sbY.append(", and ");
        sbY.append(this.a);
        sbY.append("-bit modulus)");
        return sbY.toString();
    }
}
