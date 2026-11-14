package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class RSAKeyAlgorithm extends com.trilead.ssh2.signature.KeyAlgorithm<java.security.interfaces.RSAPublicKey, java.security.interfaces.RSAPrivateKey> {
    private static final java.lang.String SSH_RSA = "ssh-rsa";

    public RSAKeyAlgorithm() {
        this("SHA1WithRSA", SSH_RSA);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.security.interfaces.RSAPublicKey decodePublicKey(byte[] bArr) throws dev.epro.r0.I8626815837691735180 {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        java.lang.String strG = c9142879380583651391.g();
        if (!strG.equals(SSH_RSA)) {
            throw new dev.epro.r0.I8626815837691735180(dev.epro.r0.G6547577305291411977.t("Unsupported key format found '", strG, "' while expecting ", getKeyFormat()));
        }
        java.math.BigInteger bigIntegerE = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
        if (c9142879380583651391.j() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Padding in RSA public key!");
            return null;
        }
        try {
            return (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(bigIntegerE2, bigIntegerE));
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not generate RSA key", e);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(getKeyFormat())) {
            dev.epro.r0.Q11088980322693754445.h("Peer sent wrong signature format");
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (bArrC.length == 0) {
            dev.epro.r0.Q11088980322693754445.h("Error in RSA signature, S is empty.");
            return null;
        }
        if (c9142879380583651391.j() == 0) {
            return bArrC;
        }
        dev.epro.r0.Q11088980322693754445.h("Padding in RSA signature!");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(SSH_RSA);
        t17032536773975598836.q(rSAPublicKey.getPublicExponent());
        t17032536773975598836.q(rSAPublicKey.getModulus());
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        if (bArr.length <= 1 || bArr[0] != 0) {
            t17032536773975598836.s(0, bArr, bArr.length);
        } else {
            t17032536773975598836.s(1, bArr, bArr.length - 1);
        }
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
        return java.util.Arrays.asList(new com.trilead.ssh2.signature.RSAKeyAlgorithm.RSACertificateDecoder(0), new com.trilead.ssh2.signature.OpenSshCertificateDecoder(SSH_RSA) { // from class: com.trilead.ssh2.signature.RSAKeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public java.security.KeyPair generateKeyPair(dev.epro.r0.C9142879380583651391 c9142879380583651391) throws java.security.NoSuchAlgorithmException {
                java.security.spec.KeySpec rSAPrivateKeySpec;
                java.math.BigInteger bigIntegerE = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE3 = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE4 = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE5 = c9142879380583651391.e();
                java.security.spec.RSAPublicKeySpec rSAPublicKeySpec = new java.security.spec.RSAPublicKeySpec(bigIntegerE, bigIntegerE2);
                if (bigIntegerE5 == null || bigIntegerE4 == null) {
                    rSAPrivateKeySpec = new java.security.spec.RSAPrivateKeySpec(bigIntegerE, bigIntegerE3);
                } else {
                    java.math.BigInteger bigIntegerModInverse = bigIntegerE4.modInverse(bigIntegerE5);
                    java.math.BigInteger bigInteger = java.math.BigInteger.ONE;
                    rSAPrivateKeySpec = new java.security.spec.RSAPrivateCrtKeySpec(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE5, bigIntegerModInverse, bigIntegerE3.mod(bigIntegerE5.subtract(bigInteger)), bigIntegerE3.mod(bigIntegerModInverse.subtract(bigInteger)), bigIntegerE4);
                }
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                return new java.security.KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateKeySpec));
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class RSACertificateDecoder extends com.trilead.ssh2.crypto.CertificateDecoder {
        public /* synthetic */ RSACertificateDecoder(int i) {
            this();
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure) {
            com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(pEMStructure.getData());
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            java.math.BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(java.math.BigInteger.ZERO) != 0 && bigInteger.compareTo(java.math.BigInteger.ONE) != 0) {
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Wrong version (", java.lang.String.valueOf(bigInteger), ") in RSA PRIVATE KEY DER stream."));
                return null;
            }
            java.math.BigInteger bigInteger2 = simpleDERReader.readInt();
            java.math.BigInteger bigInteger3 = simpleDERReader.readInt();
            try {
                java.security.spec.RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new java.security.spec.RSAPrivateCrtKeySpec(bigInteger2, bigInteger3, simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt());
                java.security.spec.RSAPublicKeySpec rSAPublicKeySpec = new java.security.spec.RSAPublicKeySpec(bigInteger2, bigInteger3);
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                return new java.security.KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateCrtKeySpec));
            } catch (java.security.GeneralSecurityException unused) {
                dev.epro.r0.Q11088980322693754445.h("Could not decode RSA Key Pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getEndLine() {
            return "-----END RSA PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getStartLine() {
            return "-----BEGIN RSA PRIVATE KEY-----";
        }

        private RSACertificateDecoder() {
        }
    }

    public RSAKeyAlgorithm(java.lang.String str, java.lang.String str2) {
        super(str, str2, java.security.interfaces.RSAPrivateKey.class);
    }
}
