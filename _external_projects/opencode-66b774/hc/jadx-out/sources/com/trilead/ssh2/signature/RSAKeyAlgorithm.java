package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8626815837691735180;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class RSAKeyAlgorithm extends KeyAlgorithm<java.security.interfaces.RSAPublicKey, java.security.interfaces.RSAPrivateKey> {
    private static final String SSH_RSA = "ssh-rsa";

    public RSAKeyAlgorithm() {
        this("SHA1WithRSA", SSH_RSA);
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.security.interfaces.RSAPublicKey decodePublicKey(byte[] bArr) throws IOException {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        String strG = c9142879380583651391.g();
        if (!strG.equals(SSH_RSA)) {
            throw new I8626815837691735180(G6547577305291411977.t("Unsupported key format found '", strG, "' while expecting ", getKeyFormat()));
        }
        BigInteger bigIntegerE = c9142879380583651391.e();
        BigInteger bigIntegerE2 = c9142879380583651391.e();
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Padding in RSA public key!");
            return null;
        }
        try {
            return (java.security.interfaces.RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigIntegerE2, bigIntegerE));
        } catch (GeneralSecurityException e) {
            Z3383101362411723454.q("Could not generate RSA key", e);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) throws IOException {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(getKeyFormat())) {
            Q11088980322693754445.h("Peer sent wrong signature format");
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (bArrC.length == 0) {
            Q11088980322693754445.h("Error in RSA signature, S is empty.");
            return null;
        }
        if (c9142879380583651391.j() == 0) {
            return bArrC;
        }
        Q11088980322693754445.h("Padding in RSA signature!");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(SSH_RSA);
        t17032536773975598836.q(rSAPublicKey.getPublicExponent());
        t17032536773975598836.q(rSAPublicKey.getModulus());
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        if (bArr.length <= 1 || bArr[0] != 0) {
            t17032536773975598836.s(0, bArr, bArr.length);
        } else {
            t17032536773975598836.s(1, bArr, bArr.length - 1);
        }
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public List<CertificateDecoder> getCertificateDecoders() {
        return Arrays.asList(new RSACertificateDecoder(0), new OpenSshCertificateDecoder(SSH_RSA) { // from class: com.trilead.ssh2.signature.RSAKeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public KeyPair generateKeyPair(C9142879380583651391 c9142879380583651391) throws NoSuchAlgorithmException, IOException {
                KeySpec rSAPrivateKeySpec;
                BigInteger bigIntegerE = c9142879380583651391.e();
                BigInteger bigIntegerE2 = c9142879380583651391.e();
                BigInteger bigIntegerE3 = c9142879380583651391.e();
                BigInteger bigIntegerE4 = c9142879380583651391.e();
                BigInteger bigIntegerE5 = c9142879380583651391.e();
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigIntegerE, bigIntegerE2);
                if (bigIntegerE5 == null || bigIntegerE4 == null) {
                    rSAPrivateKeySpec = new RSAPrivateKeySpec(bigIntegerE, bigIntegerE3);
                } else {
                    BigInteger bigIntegerModInverse = bigIntegerE4.modInverse(bigIntegerE5);
                    BigInteger bigInteger = BigInteger.ONE;
                    rSAPrivateKeySpec = new RSAPrivateCrtKeySpec(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE5, bigIntegerModInverse, bigIntegerE3.mod(bigIntegerE5.subtract(bigInteger)), bigIntegerE3.mod(bigIntegerModInverse.subtract(bigInteger)), bigIntegerE4);
                }
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateKeySpec));
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class RSACertificateDecoder extends CertificateDecoder {
        public /* synthetic */ RSACertificateDecoder(int i) {
            this();
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) throws IOException {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(BigInteger.ZERO) != 0 && bigInteger.compareTo(BigInteger.ONE) != 0) {
                Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(bigInteger), ") in RSA PRIVATE KEY DER stream."));
                return null;
            }
            BigInteger bigInteger2 = simpleDERReader.readInt();
            BigInteger bigInteger3 = simpleDERReader.readInt();
            try {
                RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigInteger2, bigInteger3, simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt());
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(bigInteger2, bigInteger3);
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateCrtKeySpec));
            } catch (GeneralSecurityException unused) {
                Q11088980322693754445.h("Could not decode RSA Key Pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return "-----END RSA PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return "-----BEGIN RSA PRIVATE KEY-----";
        }

        private RSACertificateDecoder() {
        }
    }

    public RSAKeyAlgorithm(String str, String str2) {
        super(str, str2, java.security.interfaces.RSAPrivateKey.class);
    }
}
