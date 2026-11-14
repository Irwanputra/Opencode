package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.digest.SHA1;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8626815837691735180;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import dev.epro.r0.Z17301329922361444493;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DSASHA1Verify {
    private static final Z17301329922361444493 log = Z17301329922361444493.a(DSASHA1Verify.class);

    @Deprecated
    public static DSAPublicKey decodeSSHDSAPublicKey(byte[] bArr) throws IOException {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        String strG = c9142879380583651391.g();
        if (!strG.equals("ssh-dss")) {
            throw new I8626815837691735180(G6547577305291411977.s("Unsupported key format found '", strG, "' while expecting ssh-dss"));
        }
        BigInteger bigIntegerE = c9142879380583651391.e();
        BigInteger bigIntegerE2 = c9142879380583651391.e();
        BigInteger bigIntegerE3 = c9142879380583651391.e();
        BigInteger bigIntegerE4 = c9142879380583651391.e();
        if (c9142879380583651391.j() == 0) {
            return new DSAPublicKey(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4);
        }
        Q11088980322693754445.h("Padding in DSA public key!");
        return null;
    }

    @Deprecated
    public static DSASignature decodeSSHDSASignature(byte[] bArr) throws IOException {
        if (bArr.length != 40) {
            C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
            if (!c9142879380583651391.g().equals("ssh-dss")) {
                Q11088980322693754445.h("Peer sent wrong signature format");
                return null;
            }
            bArr = c9142879380583651391.c();
            if (bArr.length != 40) {
                Q11088980322693754445.h("Peer sent corrupt signature");
                return null;
            }
            if (c9142879380583651391.j() != 0) {
                Q11088980322693754445.h("Padding in DSA signature!");
                return null;
            }
        }
        byte[] bArr2 = new byte[20];
        System.arraycopy(bArr, 0, bArr2, 0, 20);
        BigInteger bigInteger = new BigInteger(1, bArr2);
        System.arraycopy(bArr, 20, bArr2, 0, 20);
        return new DSASignature(bigInteger, new BigInteger(1, bArr2));
    }

    @Deprecated
    public static byte[] encodeSSHDSAPublicKey(DSAPublicKey dSAPublicKey) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t("ssh-dss");
        t17032536773975598836.q(dSAPublicKey.getP());
        t17032536773975598836.q(dSAPublicKey.getQ());
        t17032536773975598836.q(dSAPublicKey.getG());
        t17032536773975598836.q(dSAPublicKey.getY());
        return t17032536773975598836.f();
    }

    @Deprecated
    public static byte[] encodeSSHDSASignature(DSASignature dSASignature) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t("ssh-dss");
        byte[] byteArray = dSASignature.getR().toByteArray();
        byte[] byteArray2 = dSASignature.getS().toByteArray();
        byte[] bArr = new byte[40];
        int length = byteArray.length < 20 ? byteArray.length : 20;
        int length2 = byteArray2.length < 20 ? byteArray2.length : 20;
        System.arraycopy(byteArray, byteArray.length - length, bArr, 20 - length, length);
        System.arraycopy(byteArray2, byteArray2.length - length2, bArr, 40 - length2, length2);
        t17032536773975598836.s(0, bArr, 40);
        return t17032536773975598836.f();
    }

    @Deprecated
    public static DSASignature generateSignature(byte[] bArr, DSAPrivateKey dSAPrivateKey, SecureRandom secureRandom) {
        BigInteger bigInteger;
        SHA1 sha1 = new SHA1();
        sha1.update(bArr);
        byte[] bArr2 = new byte[sha1.getDigestLength()];
        sha1.digest(bArr2);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        int iBitLength = dSAPrivateKey.getQ().bitLength();
        do {
            bigInteger = new BigInteger(iBitLength, secureRandom);
        } while (bigInteger.compareTo(dSAPrivateKey.getQ()) >= 0);
        BigInteger bigIntegerMod = dSAPrivateKey.getG().modPow(bigInteger, dSAPrivateKey.getP()).mod(dSAPrivateKey.getQ());
        return new DSASignature(bigIntegerMod, bigInteger.modInverse(dSAPrivateKey.getQ()).multiply(bigInteger2.add(dSAPrivateKey.getX().multiply(bigIntegerMod))).mod(dSAPrivateKey.getQ()));
    }

    @Deprecated
    public static boolean verifySignature(byte[] bArr, DSASignature dSASignature, DSAPublicKey dSAPublicKey) {
        SHA1 sha1 = new SHA1();
        sha1.update(bArr);
        byte[] bArr2 = new byte[sha1.getDigestLength()];
        sha1.digest(bArr2);
        BigInteger bigInteger = new BigInteger(1, bArr2);
        BigInteger r = dSASignature.getR();
        BigInteger s = dSASignature.getS();
        BigInteger g = dSAPublicKey.getG();
        BigInteger p = dSAPublicKey.getP();
        BigInteger q = dSAPublicKey.getQ();
        BigInteger y = dSAPublicKey.getY();
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (bigInteger2.compareTo(r) >= 0 || q.compareTo(r) <= 0) {
            log.getClass();
            return false;
        }
        if (bigInteger2.compareTo(s) >= 0 || q.compareTo(s) <= 0) {
            log.getClass();
            return false;
        }
        BigInteger bigIntegerModInverse = s.modInverse(q);
        return g.modPow(bigInteger.multiply(bigIntegerModInverse).mod(q), p).multiply(y.modPow(r.multiply(bigIntegerModInverse).mod(q), p)).mod(p).mod(q).equals(r);
    }
}
