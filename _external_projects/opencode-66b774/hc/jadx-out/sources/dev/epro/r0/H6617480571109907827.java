package dev.epro.r0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H6617480571109907827 {
    public static final BigInteger g;
    public static final BigInteger h;
    public Integer a;
    public BigInteger b;
    public P11201002968880096560 c;
    public P11201002968880096560 d;
    public Integer e;
    public D14731132657808549702 f;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        g = bigIntegerValueOf;
        h = bigIntegerValueOf.pow(256);
    }

    public final M5876618289820536996 a() {
        Integer num = this.a;
        if (num == null) {
            W4415201450379021245.c("key size is not set");
            return null;
        }
        if (this.b == null) {
            W4415201450379021245.c("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            W4415201450379021245.c("signature hash type is not set");
            return null;
        }
        if (this.d == null) {
            W4415201450379021245.c("mgf1 hash type is not set");
            return null;
        }
        if (this.f == null) {
            W4415201450379021245.c("variant is not set");
            return null;
        }
        if (this.e == null) {
            W4415201450379021245.c("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.a, 2048));
        }
        if (this.c != this.d) {
            W4415201450379021245.c("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(M5876618289820536996.g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new M5876618289820536996(this.a.intValue(), this.b, this.f, this.c, this.d, this.e.intValue());
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }
}
