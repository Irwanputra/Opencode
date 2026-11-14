package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.SimpleDERReader;
import com.trilead.ssh2.crypto.digest.SHA1;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8626815837691735180;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import dev.epro.r0.Z17301329922361444493;
import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@Deprecated
/* loaded from: classes.dex */
public class RSASHA1Verify {
    private static final Z17301329922361444493 log = Z17301329922361444493.a(RSASHA1Verify.class);

    @Deprecated
    public static RSAPublicKey decodeSSHRSAPublicKey(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        String g = c9142879380583651391.g();
        if (!g.equals("ssh-rsa")) {
            throw new I8626815837691735180(G6547577305291411977.s("Unsupported key format found '", g, "' while expecting ssh-rsa"));
        }
        BigInteger e = c9142879380583651391.e();
        BigInteger e2 = c9142879380583651391.e();
        if (c9142879380583651391.j() == 0) {
            return new RSAPublicKey(e, e2);
        }
        Q11088980322693754445.h("Padding in RSA public key!");
        return null;
    }

    @Deprecated
    public static RSASignature decodeSSHRSASignature(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals("ssh-rsa")) {
            Q11088980322693754445.h("Peer sent wrong signature format");
            return null;
        }
        byte[] c = c9142879380583651391.c();
        if (c.length == 0) {
            Q11088980322693754445.h("Error in RSA signature, S is empty.");
            return null;
        }
        if (c9142879380583651391.j() == 0) {
            return new RSASignature(new BigInteger(1, c));
        }
        Q11088980322693754445.h("Padding in RSA signature!");
        return null;
    }

    @Deprecated
    public static byte[] encodeSSHRSAPublicKey(RSAPublicKey rSAPublicKey) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t("ssh-rsa");
        t17032536773975598836.q(rSAPublicKey.getE());
        t17032536773975598836.q(rSAPublicKey.getN());
        return t17032536773975598836.f();
    }

    @Deprecated
    public static byte[] encodeSSHRSASignature(RSASignature rSASignature) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t("ssh-rsa");
        byte[] byteArray = rSASignature.getS().toByteArray();
        if (byteArray.length <= 1 || byteArray[0] != 0) {
            t17032536773975598836.s(0, byteArray, byteArray.length);
        } else {
            t17032536773975598836.s(1, byteArray, byteArray.length - 1);
        }
        return t17032536773975598836.f();
    }

    @Deprecated
    public static RSASignature generateSignature(byte[] bArr, RSAPrivateKey rSAPrivateKey) {
        SHA1 sha1 = new SHA1();
        sha1.update(bArr);
        int digestLength = sha1.getDigestLength();
        byte[] bArr2 = new byte[digestLength];
        sha1.digest(bArr2);
        byte[] bArr3 = {48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20};
        int bitLength = ((rSAPrivateKey.getN().bitLength() + 7) / 8) - (17 + digestLength);
        int i = bitLength - 1;
        if (i < 8) {
            Q11088980322693754445.h("Cannot sign with RSA, message too long");
            return null;
        }
        byte[] bArr4 = new byte[digestLength + 17 + i];
        bArr4[0] = 1;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            bArr4[i2] = -1;
        }
        bArr4[bitLength] = 0;
        System.arraycopy(bArr3, 0, bArr4, bitLength + 1, 15);
        System.arraycopy(bArr2, 0, bArr4, bitLength + 16, digestLength);
        return new RSASignature(new BigInteger(1, bArr4).modPow(rSAPrivateKey.getD(), rSAPrivateKey.getN()));
    }

    @Deprecated
    public static boolean verifySignature(byte[] bArr, RSASignature rSASignature, RSAPublicKey rSAPublicKey) {
        SHA1 sha1 = new SHA1();
        sha1.update(bArr);
        int digestLength = sha1.getDigestLength();
        byte[] bArr2 = new byte[digestLength];
        sha1.digest(bArr2);
        BigInteger n = rSAPublicKey.getN();
        BigInteger e = rSAPublicKey.getE();
        BigInteger s = rSASignature.getS();
        if (n.compareTo(s) <= 0) {
            log.getClass();
            return false;
        }
        int bitLength = (n.bitLength() + 7) / 8;
        if (bitLength < 1) {
            log.getClass();
            return false;
        }
        byte[] byteArray = s.modPow(e, n).toByteArray();
        int i = (byteArray.length <= 0 || byteArray[0] != 0) ? 0 : 1;
        if (byteArray.length - i != bitLength - 1) {
            log.getClass();
            return false;
        }
        if (byteArray[i] != 1) {
            log.getClass();
            return false;
        }
        int i2 = i + 1;
        for (int i3 = i2; i3 < byteArray.length; i3++) {
            byte b = byteArray[i3];
            if (b == 0) {
                if (i3 - i2 < 8) {
                    log.getClass();
                    return false;
                }
                int i4 = i3 + 1;
                if (i4 >= byteArray.length) {
                    log.getClass();
                    return false;
                }
                SimpleDERReader simpleDERReader = new SimpleDERReader(byteArray, i4, byteArray.length - i4);
                byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
                if (simpleDERReader.available() != 0) {
                    log.getClass();
                    return false;
                }
                simpleDERReader.resetInput(readSequenceAsByteArray);
                byte[] readSequenceAsByteArray2 = simpleDERReader.readSequenceAsByteArray();
                if (readSequenceAsByteArray2.length < 8 || readSequenceAsByteArray2.length > 9) {
                    log.getClass();
                    return false;
                }
                byte[] bArr3 = {6, 5, 43, 14, 3, 2, 26, 5, 0};
                for (int i5 = 0; i5 < readSequenceAsByteArray2.length; i5++) {
                    if (readSequenceAsByteArray2[i5] != bArr3[i5]) {
                        log.getClass();
                        return false;
                    }
                }
                byte[] readOctetString = simpleDERReader.readOctetString();
                if (simpleDERReader.available() != 0) {
                    log.getClass();
                    return false;
                }
                if (readOctetString.length != digestLength) {
                    log.getClass();
                    return false;
                }
                for (int i6 = 0; i6 < digestLength; i6++) {
                    if (bArr2[i6] != readOctetString[i6]) {
                        log.getClass();
                        return false;
                    }
                }
                return true;
            }
            if (b != -1) {
                log.getClass();
                return false;
            }
        }
        log.getClass();
        return false;
    }
}
