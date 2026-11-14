package dev.epro.r0;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O3621706490995371622 implements A8947685337014270457 {
    public final RSAPublicKey a;
    public final S14062146164092607729 b;
    public final S14062146164092607729 c;
    public final int d;
    public final byte[] e;
    public final byte[] f;

    public O3621706490995371622(RSAPublicKey rSAPublicKey, S14062146164092607729 s14062146164092607729, S14062146164092607729 s140621461640926077292, int i, byte[] bArr, byte[] bArr2) {
        if (I7816358627352036208.a()) {
            W4415201450379021245.c("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        M3250598633778217966.d(s14062146164092607729);
        if (!s14062146164092607729.equals(s140621461640926077292)) {
            W4415201450379021245.c("sigHash and mgf1Hash must be the same");
            throw null;
        }
        M3250598633778217966.b(rSAPublicKey.getModulus().bitLength());
        M3250598633778217966.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = s14062146164092607729;
        this.c = s140621461640926077292;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.e;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else if (Z12670897225348479586.b(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        } else {
            W4415201450379021245.c("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if (bitLength != bArr.length) {
            W4415201450379021245.c("invalid signature's length");
            return;
        }
        BigInteger A = G16660188620551127941.A(bArr);
        if (A.compareTo(modulus) >= 0) {
            W4415201450379021245.c("signature out of range");
            return;
        }
        byte[] M = G16660188620551127941.M(A.modPow(publicExponent, modulus), bitLength2);
        byte b = 1;
        int bitLength3 = modulus.bitLength() - 1;
        S14062146164092607729 s14062146164092607729 = this.b;
        M3250598633778217966.d(s14062146164092607729);
        MessageDigest messageDigest = (MessageDigest) W8357658991043002609.e.a.a(E7125458317232359087.r(s14062146164092607729));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = M.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            W4415201450379021245.c("inconsistent");
            return;
        }
        if (M[M.length - 1] != -68) {
            W4415201450379021245.c("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = Arrays.copyOf(M, i3);
        byte[] copyOfRange = Arrays.copyOfRange(M, copyOf.length, copyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            byte b2 = b;
            int i5 = i4;
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                    W4415201450379021245.c("inconsistent");
                    return;
                } else {
                    i4 = i5 + 1;
                    b = b2;
                }
            } else {
                MessageDigest messageDigest2 = (MessageDigest) W8357658991043002609.e.a.a(E7125458317232359087.r(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i6 = 0;
                int i7 = 0;
                while (i6 <= (i3 - 1) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    long j2 = j;
                    messageDigest2.update(G16660188620551127941.M(BigInteger.valueOf(i6), 4));
                    byte[] digest2 = messageDigest2.digest();
                    System.arraycopy(digest2, 0, bArr4, i7, Math.min(digest2.length, i3 - i7));
                    i7 += digest2.length;
                    i6++;
                    j = j2;
                }
                long j3 = j;
                int length2 = bArr4.length;
                byte[] bArr5 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr5[i8] = (byte) (bArr4[i8] ^ copyOf[i8]);
                }
                for (int i9 = 0; i9 <= j3; i9++) {
                    int i10 = i9 / 8;
                    bArr5[i10] = (byte) ((~(b2 << (7 - (i9 % 8)))) & bArr5[i10]);
                }
                int i11 = 0;
                while (true) {
                    int i12 = (i2 - i) - 2;
                    if (i11 >= i12) {
                        if (bArr5[i12] != b2) {
                            W4415201450379021245.c("inconsistent");
                            return;
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, length2 - i, length2);
                        int i13 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i13];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i13, copyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            return;
                        }
                        W4415201450379021245.c("inconsistent");
                        return;
                    }
                    if (bArr5[i11] != 0) {
                        W4415201450379021245.c("inconsistent");
                        return;
                    }
                    i11++;
                }
            }
        }
    }
}
