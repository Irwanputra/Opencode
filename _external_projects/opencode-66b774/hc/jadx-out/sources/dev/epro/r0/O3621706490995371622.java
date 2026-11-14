package dev.epro.r0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3621706490995371622 implements A8947685337014270457 {
    public final RSAPublicKey a;
    public final S14062146164092607729 b;
    public final S14062146164092607729 c;
    public final int d;
    public final byte[] e;
    public final byte[] f;

    public O3621706490995371622(RSAPublicKey rSAPublicKey, S14062146164092607729 s14062146164092607729, S14062146164092607729 s140621461640926077292, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else if (Z12670897225348479586.b(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        } else {
            W4415201450379021245.c("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            W4415201450379021245.c("invalid signature's length");
            return;
        }
        BigInteger bigIntegerA = G16660188620551127941.A(bArr);
        if (bigIntegerA.compareTo(modulus) >= 0) {
            W4415201450379021245.c("signature out of range");
            return;
        }
        byte[] bArrM = G16660188620551127941.M(bigIntegerA.modPow(publicExponent, modulus), iBitLength2);
        byte b = 1;
        int iBitLength3 = modulus.bitLength() - 1;
        S14062146164092607729 s14062146164092607729 = this.b;
        M3250598633778217966.d(s14062146164092607729);
        MessageDigest messageDigest = (MessageDigest) W8357658991043002609.e.a.a(E7125458317232359087.r(s14062146164092607729));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrM.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            W4415201450379021245.c("inconsistent");
            return;
        }
        if (bArrM[bArrM.length - 1] != -68) {
            W4415201450379021245.c("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrM, i3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            byte b2 = b;
            int i5 = i4;
            long j = (((long) length) * 8) - ((long) iBitLength3);
            if (i4 < j) {
                if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
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
                int length2 = 0;
                while (i6 <= (i3 - 1) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    long j2 = j;
                    messageDigest2.update(G16660188620551127941.M(BigInteger.valueOf(i6), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    System.arraycopy(bArrDigest2, 0, bArr4, length2, Math.min(bArrDigest2.length, i3 - length2));
                    length2 += bArrDigest2.length;
                    i6++;
                    j = j2;
                }
                long j3 = j;
                int length3 = bArr4.length;
                byte[] bArr5 = new byte[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j3; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) ((~(b2 << (7 - (i8 % 8)))) & bArr5[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != b2) {
                            W4415201450379021245.c("inconsistent");
                            return;
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, length3 - i, length3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i12];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i12, bArrCopyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            return;
                        }
                        W4415201450379021245.c("inconsistent");
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        W4415201450379021245.c("inconsistent");
                        return;
                    }
                    i10++;
                }
            }
        }
    }
}
