package dev.epro.r0;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M5876618289820536996 extends H5732944296146006561 {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final D14731132657808549702 c;
    public final P11201002968880096560 d;
    public final P11201002968880096560 e;
    public final int f;

    public M5876618289820536996(int i, BigInteger bigInteger, D14731132657808549702 d14731132657808549702, P11201002968880096560 p11201002968880096560, P11201002968880096560 p112010029688800965602, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = d14731132657808549702;
        this.d = p11201002968880096560;
        this.e = p112010029688800965602;
        this.f = i2;
    }

    public static H6617480571109907827 b() {
        H6617480571109907827 h6617480571109907827 = new H6617480571109907827();
        h6617480571109907827.a = null;
        h6617480571109907827.b = g;
        h6617480571109907827.c = null;
        h6617480571109907827.d = null;
        h6617480571109907827.e = null;
        h6617480571109907827.f = D14731132657808549702.w0;
        return h6617480571109907827;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.c != D14731132657808549702.w0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M5876618289820536996)) {
            return false;
        }
        M5876618289820536996 m5876618289820536996 = (M5876618289820536996) obj;
        return m5876618289820536996.a == this.a && Objects.equals(m5876618289820536996.b, this.b) && m5876618289820536996.c == this.c && m5876618289820536996.d == this.d && m5876618289820536996.e == this.e && m5876618289820536996.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(M5876618289820536996.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.b);
        StringBuilder y = G6547577305291411977.y("RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2, ", mgf1 hashType: ");
        X2485016533998461232.k(y, valueOf3, ", saltLengthBytes: ", this.f, ", publicExponent: ");
        y.append(valueOf4);
        y.append(", and ");
        y.append(this.a);
        y.append("-bit modulus)");
        return y.toString();
    }
}
