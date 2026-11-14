package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@java.lang.Deprecated
public class DSASHA1Verify {
    private static final dev.epro.r0.Z17301329922361444493 log = dev.epro.r0.Z17301329922361444493.a(com.trilead.ssh2.signature.DSASHA1Verify.class);

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.DSAPublicKey decodeSSHDSAPublicKey(byte[] bArr) throws dev.epro.r0.I8626815837691735180 {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        java.lang.String strG = c9142879380583651391.g();
        if (!strG.equals("ssh-dss")) {
            throw new dev.epro.r0.I8626815837691735180(dev.epro.r0.G6547577305291411977.s("Unsupported key format found '", strG, "' while expecting ssh-dss"));
        }
        java.math.BigInteger bigIntegerE = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE3 = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE4 = c9142879380583651391.e();
        if (c9142879380583651391.j() == 0) {
            return new com.trilead.ssh2.signature.DSAPublicKey(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4);
        }
        dev.epro.r0.Q11088980322693754445.h("Padding in DSA public key!");
        return null;
    }

    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.DSASignature decodeSSHDSASignature(byte[] bArr) {
        if (bArr.length != 40) {
            dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
            if (!c9142879380583651391.g().equals("ssh-dss")) {
                dev.epro.r0.Q11088980322693754445.h("Peer sent wrong signature format");
                return null;
            }
            bArr = c9142879380583651391.c();
            if (bArr.length != 40) {
                dev.epro.r0.Q11088980322693754445.h("Peer sent corrupt signature");
                return null;
            }
            if (c9142879380583651391.j() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in DSA signature!");
                return null;
            }
        }
        byte[] bArr2 = new byte[20];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 20);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr2);
        java.lang.System.arraycopy(bArr, 20, bArr2, 0, 20);
        return new com.trilead.ssh2.signature.DSASignature(bigInteger, new java.math.BigInteger(1, bArr2));
    }

    @java.lang.Deprecated
    public static byte[] encodeSSHDSAPublicKey(com.trilead.ssh2.signature.DSAPublicKey dSAPublicKey) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t("ssh-dss");
        t17032536773975598836.q(dSAPublicKey.getP());
        t17032536773975598836.q(dSAPublicKey.getQ());
        t17032536773975598836.q(dSAPublicKey.getG());
        t17032536773975598836.q(dSAPublicKey.getY());
        return t17032536773975598836.f();
    }

    @java.lang.Deprecated
    public static byte[] encodeSSHDSASignature(com.trilead.ssh2.signature.DSASignature dSASignature) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t("ssh-dss");
        byte[] byteArray = dSASignature.getR().toByteArray();
        byte[] byteArray2 = dSASignature.getS().toByteArray();
        byte[] bArr = new byte[40];
        int length = byteArray.length < 20 ? byteArray.length : 20;
        int length2 = byteArray2.length < 20 ? byteArray2.length : 20;
        java.lang.System.arraycopy(byteArray, byteArray.length - length, bArr, 20 - length, length);
        java.lang.System.arraycopy(byteArray2, byteArray2.length - length2, bArr, 40 - length2, length2);
        t17032536773975598836.s(0, bArr, 40);
        return t17032536773975598836.f();
    }

    @java.lang.Deprecated
    public static com.trilead.ssh2.signature.DSASignature generateSignature(byte[] bArr, com.trilead.ssh2.signature.DSAPrivateKey dSAPrivateKey, java.security.SecureRandom secureRandom) {
        java.math.BigInteger bigInteger;
        com.trilead.ssh2.crypto.digest.SHA1 sha1 = new com.trilead.ssh2.crypto.digest.SHA1();
        sha1.update(bArr);
        byte[] bArr2 = new byte[sha1.getDigestLength()];
        sha1.digest(bArr2);
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, bArr2);
        int iBitLength = dSAPrivateKey.getQ().bitLength();
        do {
            bigInteger = new java.math.BigInteger(iBitLength, secureRandom);
        } while (bigInteger.compareTo(dSAPrivateKey.getQ()) >= 0);
        java.math.BigInteger bigIntegerMod = dSAPrivateKey.getG().modPow(bigInteger, dSAPrivateKey.getP()).mod(dSAPrivateKey.getQ());
        return new com.trilead.ssh2.signature.DSASignature(bigIntegerMod, bigInteger.modInverse(dSAPrivateKey.getQ()).multiply(bigInteger2.add(dSAPrivateKey.getX().multiply(bigIntegerMod))).mod(dSAPrivateKey.getQ()));
    }

    @java.lang.Deprecated
    public static boolean verifySignature(byte[] bArr, com.trilead.ssh2.signature.DSASignature dSASignature, com.trilead.ssh2.signature.DSAPublicKey dSAPublicKey) {
        com.trilead.ssh2.crypto.digest.SHA1 sha1 = new com.trilead.ssh2.crypto.digest.SHA1();
        sha1.update(bArr);
        byte[] bArr2 = new byte[sha1.getDigestLength()];
        sha1.digest(bArr2);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr2);
        java.math.BigInteger r = dSASignature.getR();
        java.math.BigInteger s = dSASignature.getS();
        java.math.BigInteger g = dSAPublicKey.getG();
        java.math.BigInteger p = dSAPublicKey.getP();
        java.math.BigInteger q = dSAPublicKey.getQ();
        java.math.BigInteger y = dSAPublicKey.getY();
        java.math.BigInteger bigInteger2 = java.math.BigInteger.ZERO;
        if (bigInteger2.compareTo(r) >= 0 || q.compareTo(r) <= 0) {
            log.getClass();
            return false;
        }
        if (bigInteger2.compareTo(s) >= 0 || q.compareTo(s) <= 0) {
            log.getClass();
            return false;
        }
        java.math.BigInteger bigIntegerModInverse = s.modInverse(q);
        return g.modPow(bigInteger.multiply(bigIntegerModInverse).mod(q), p).multiply(y.modPow(r.multiply(bigIntegerModInverse).mod(q), p)).mod(p).mod(q).equals(r);
    }
}
