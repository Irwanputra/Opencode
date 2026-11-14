package dev.epro.r0;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M14296037792602877869 {
    public static final BigInteger e;
    public static final BigInteger f;
    public Integer a;
    public BigInteger b;
    public V11865174435555805371 c;
    public D14731132657808549702 d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        e = bigIntegerValueOf;
        f = bigIntegerValueOf.pow(256);
    }

    public final C5880096771922761272 a() {
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
            W4415201450379021245.c("hash type is not set");
            return null;
        }
        if (this.d == null) {
            W4415201450379021245.c("variant is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.a));
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(C5880096771922761272.e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new C5880096771922761272(this.a.intValue(), this.b, this.d, this.c);
    }
}
