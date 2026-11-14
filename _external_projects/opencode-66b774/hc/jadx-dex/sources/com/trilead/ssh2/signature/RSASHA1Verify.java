package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@java.lang.Deprecated
public class RSASHA1Verify {
    private static final dev.epro.r0.Z17301329922361444493 log = dev.epro.r0.Z17301329922361444493.a(com.trilead.ssh2.signature.RSASHA1Verify.class);

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.RSAPublicKey decodeSSHRSAPublicKey(byte[] bArr) throws dev.epro.r0.I8626815837691735180 {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        java.lang.String strG = c9142879380583651391.g();
        if (!strG.equals("ssh-rsa")) {
            throw new dev.epro.r0.I8626815837691735180(dev.epro.r0.G6547577305291411977.s("Unsupported key format found '", strG, "' while expecting ssh-rsa"));
        }
        java.math.BigInteger bigIntegerE = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
        if (c9142879380583651391.j() == 0) {
            return new com.trilead.ssh2.signature.RSAPublicKey(bigIntegerE, bigIntegerE2);
        }
        dev.epro.r0.Q11088980322693754445.h("Padding in RSA public key!");
        return null;
    }

    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.RSASignature decodeSSHRSASignature(byte[] bArr) {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals("ssh-rsa")) {
            dev.epro.r0.Q11088980322693754445.h("Peer sent wrong signature format");
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (bArrC.length == 0) {
            dev.epro.r0.Q11088980322693754445.h("Error in RSA signature, S is empty.");
            return null;
        }
        if (c9142879380583651391.j() == 0) {
            return new com.trilead.ssh2.signature.RSASignature(new java.math.BigInteger(1, bArrC));
        }
        dev.epro.r0.Q11088980322693754445.h("Padding in RSA signature!");
        return null;
    }

    @java.lang.Deprecated
    public static byte[] encodeSSHRSAPublicKey(com.trilead.ssh2.signature.RSAPublicKey rSAPublicKey) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t("ssh-rsa");
        t17032536773975598836.q(rSAPublicKey.getE());
        t17032536773975598836.q(rSAPublicKey.getN());
        return t17032536773975598836.f();
    }

    @java.lang.Deprecated
    public static byte[] encodeSSHRSASignature(com.trilead.ssh2.signature.RSASignature rSASignature) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t("ssh-rsa");
        byte[] byteArray = rSASignature.getS().toByteArray();
        if (byteArray.length <= 1 || byteArray[0] != 0) {
            t17032536773975598836.s(0, byteArray, byteArray.length);
        } else {
            t17032536773975598836.s(1, byteArray, byteArray.length - 1);
        }
        return t17032536773975598836.f();
    }

    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.RSASignature generateSignature(byte[] bArr, com.trilead.ssh2.signature.RSAPrivateKey rSAPrivateKey) {
        com.trilead.ssh2.crypto.digest.SHA1 sha1 = new com.trilead.ssh2.crypto.digest.SHA1();
        sha1.update(bArr);
        int digestLength = sha1.getDigestLength();
        byte[] bArr2 = new byte[digestLength];
        sha1.digest(bArr2);
        byte[] bArr3 = {48, 33, 48, 9, 6, 5, 43, 14, 3, 2, 26, 5, 0, 4, 20};
        int iBitLength = ((rSAPrivateKey.getN().bitLength() + 7) / 8) - (17 + digestLength);
        int i = iBitLength - 1;
        if (i < 8) {
            dev.epro.r0.Q11088980322693754445.h("Cannot sign with RSA, message too long");
            return null;
        }
        byte[] bArr4 = new byte[digestLength + 17 + i];
        bArr4[0] = 1;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            bArr4[i2] = -1;
        }
        bArr4[iBitLength] = 0;
        java.lang.System.arraycopy(bArr3, 0, bArr4, iBitLength + 1, 15);
        java.lang.System.arraycopy(bArr2, 0, bArr4, iBitLength + 16, digestLength);
        return new com.trilead.ssh2.signature.RSASignature(new java.math.BigInteger(1, bArr4).modPow(rSAPrivateKey.getD(), rSAPrivateKey.getN()));
    }

    @java.lang.Deprecated
    public static boolean verifySignature(byte[] bArr, com.trilead.ssh2.signature.RSASignature rSASignature, com.trilead.ssh2.signature.RSAPublicKey rSAPublicKey) {
        com.trilead.ssh2.crypto.digest.SHA1 sha1 = new com.trilead.ssh2.crypto.digest.SHA1();
        sha1.update(bArr);
        int digestLength = sha1.getDigestLength();
        byte[] bArr2 = new byte[digestLength];
        sha1.digest(bArr2);
        java.math.BigInteger n = rSAPublicKey.getN();
        java.math.BigInteger e = rSAPublicKey.getE();
        java.math.BigInteger s = rSASignature.getS();
        if (n.compareTo(s) <= 0) {
            log.getClass();
            return false;
        }
        int iBitLength = (n.bitLength() + 7) / 8;
        if (iBitLength < 1) {
            log.getClass();
            return false;
        }
        byte[] byteArray = s.modPow(e, n).toByteArray();
        int i = (byteArray.length <= 0 || byteArray[0] != 0) ? 0 : 1;
        if (byteArray.length - i != iBitLength - 1) {
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
                com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(byteArray, i4, byteArray.length - i4);
                byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
                if (simpleDERReader.available() != 0) {
                    log.getClass();
                    return false;
                }
                simpleDERReader.resetInput(sequenceAsByteArray);
                byte[] sequenceAsByteArray2 = simpleDERReader.readSequenceAsByteArray();
                if (sequenceAsByteArray2.length < 8 || sequenceAsByteArray2.length > 9) {
                    log.getClass();
                    return false;
                }
                byte[] bArr3 = {6, 5, 43, 14, 3, 2, 26, 5, 0};
                for (int i5 = 0; i5 < sequenceAsByteArray2.length; i5++) {
                    if (sequenceAsByteArray2[i5] != bArr3[i5]) {
                        log.getClass();
                        return false;
                    }
                }
                byte[] octetString = simpleDERReader.readOctetString();
                if (simpleDERReader.available() != 0) {
                    log.getClass();
                    return false;
                }
                if (octetString.length != digestLength) {
                    log.getClass();
                    return false;
                }
                for (int i6 = 0; i6 < digestLength; i6++) {
                    if (bArr2[i6] != octetString[i6]) {
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
