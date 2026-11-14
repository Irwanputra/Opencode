package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class DSAKeyAlgorithm extends com.trilead.ssh2.signature.KeyAlgorithm<java.security.interfaces.DSAPublicKey, java.security.interfaces.DSAPrivateKey> {
    public DSAKeyAlgorithm() {
        super("SHA1WithDSA", "ssh-dss", java.security.interfaces.DSAPrivateKey.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.security.interfaces.DSAPublicKey decodePublicKey(byte[] bArr) throws dev.epro.r0.I8626815837691735180 {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        java.lang.String strG = c9142879380583651391.g();
        if (!strG.equals(getKeyFormat())) {
            throw new dev.epro.r0.I8626815837691735180(dev.epro.r0.G6547577305291411977.t("Unsupported key format found '", strG, "' while expecting ", getKeyFormat()));
        }
        java.math.BigInteger bigIntegerE = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE3 = c9142879380583651391.e();
        java.math.BigInteger bigIntegerE4 = c9142879380583651391.e();
        if (c9142879380583651391.j() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Padding in DSA public key!");
            return null;
        }
        try {
            return (java.security.interfaces.DSAPublicKey) java.security.KeyFactory.getInstance("DSA").generatePublic(new java.security.spec.DSAPublicKeySpec(bigIntegerE4, bigIntegerE, bigIntegerE2, bigIntegerE3));
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not generate DSA Key", e);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length != 40) {
            dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
            if (!c9142879380583651391.g().equals(getKeyFormat())) {
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
        byte b3 = bArr[0];
        if (b3 == 0 && (b = bArr[1]) == 0 && (b2 = bArr[2]) == 0) {
            int i = ((b3 << 24) & (-16777216)) | ((b << 16) & 16711680) | ((b2 << 8) & 65280) | (bArr[3] & 255);
            int i2 = ((bArr[4 + i] << 24) & (-16777216)) | (16711680 & (bArr[i + 5] << 16)) | (65280 & (bArr[i + 6] << 8)) | (bArr[i + 7] & 255);
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i + 8, bArr2, 0, i2);
            bArr = bArr2;
        }
        int i3 = (bArr[0] & 128) != 0 ? 1 : 0;
        byte b4 = (bArr[20] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr3 = new byte[dev.epro.r0.L11610354117192841236.e(bArr.length, 6, i3, b4)];
        bArr3[0] = 48;
        if (bArr.length != 40) {
            dev.epro.r0.Q11088980322693754445.h("Peer sent corrupt signature");
            return null;
        }
        bArr3[1] = 44;
        byte b5 = (byte) (44 + i3);
        bArr3[1] = b5;
        bArr3[1] = (byte) (b5 + b4);
        bArr3[2] = 2;
        bArr3[3] = 20;
        bArr3[3] = (byte) (20 + i3);
        java.lang.System.arraycopy(bArr, 0, bArr3, i3 + 4, 20);
        bArr3[bArr3[3] + 4] = 2;
        bArr3[bArr3[3] + 5] = 20;
        int i4 = bArr3[3] + 5;
        bArr3[i4] = (byte) (bArr3[i4] + b4);
        java.lang.System.arraycopy(bArr, 20, bArr3, bArr3[3] + 6 + b4, 20);
        return bArr3;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(java.security.interfaces.DSAPublicKey dSAPublicKey) {
        java.security.interfaces.DSAParams params = dSAPublicKey.getParams();
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        t17032536773975598836.q(params.getP());
        t17032536773975598836.q(params.getQ());
        t17032536773975598836.q(params.getG());
        t17032536773975598836.q(dSAPublicKey.getY());
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        int i = bArr[3] & 255;
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 4, bArr2, 0, i);
        int i2 = bArr[i + 5] & 255;
        byte[] bArr3 = new byte[i2];
        java.lang.System.arraycopy(bArr, i + 6, bArr3, 0, i2);
        byte[] bArr4 = new byte[40];
        int i3 = i < 20 ? i : 20;
        int i4 = i2 < 20 ? i2 : 20;
        java.lang.System.arraycopy(bArr2, i - i3, bArr4, 20 - i3, i3);
        java.lang.System.arraycopy(bArr3, i2 - i4, bArr4, 40 - i4, i4);
        t17032536773975598836.s(0, bArr4, 40);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
        return java.util.Arrays.asList(new com.trilead.ssh2.signature.DSAKeyAlgorithm.DsaCertificateDecoder(0), new com.trilead.ssh2.signature.OpenSshCertificateDecoder(getKeyFormat()) { // from class: com.trilead.ssh2.signature.DSAKeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public java.security.KeyPair generateKeyPair(dev.epro.r0.C9142879380583651391 c9142879380583651391) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException {
                java.math.BigInteger bigIntegerE = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE2 = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE3 = c9142879380583651391.e();
                java.math.BigInteger bigIntegerE4 = c9142879380583651391.e();
                java.security.spec.DSAPrivateKeySpec dSAPrivateKeySpec = new java.security.spec.DSAPrivateKeySpec(c9142879380583651391.e(), bigIntegerE, bigIntegerE2, bigIntegerE3);
                java.security.spec.DSAPublicKeySpec dSAPublicKeySpec = new java.security.spec.DSAPublicKeySpec(bigIntegerE4, bigIntegerE, bigIntegerE2, bigIntegerE3);
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("DSA");
                return new java.security.KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class DsaCertificateDecoder extends com.trilead.ssh2.crypto.CertificateDecoder {
        public /* synthetic */ DsaCertificateDecoder(int i) {
            this();
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure) {
            com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(pEMStructure.getData());
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            java.math.BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(java.math.BigInteger.ZERO) != 0) {
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Wrong version (", java.lang.String.valueOf(bigInteger), ") in DSA PRIVATE KEY DER stream."));
                return null;
            }
            java.math.BigInteger bigInteger2 = simpleDERReader.readInt();
            java.math.BigInteger bigInteger3 = simpleDERReader.readInt();
            java.math.BigInteger bigInteger4 = simpleDERReader.readInt();
            java.math.BigInteger bigInteger5 = simpleDERReader.readInt();
            java.math.BigInteger bigInteger6 = simpleDERReader.readInt();
            if (simpleDERReader.available() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
                return null;
            }
            try {
                java.security.spec.DSAPrivateKeySpec dSAPrivateKeySpec = new java.security.spec.DSAPrivateKeySpec(bigInteger6, bigInteger2, bigInteger3, bigInteger4);
                java.security.spec.DSAPublicKeySpec dSAPublicKeySpec = new java.security.spec.DSAPublicKeySpec(bigInteger5, bigInteger2, bigInteger3, bigInteger4);
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("DSA");
                return new java.security.KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            } catch (java.security.GeneralSecurityException unused) {
                dev.epro.r0.Q11088980322693754445.h("Could not decode DSA key pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getEndLine() {
            return "-----END DSA PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getStartLine() {
            return "-----BEGIN DSA PRIVATE KEY-----";
        }

        private DsaCertificateDecoder() {
        }
    }
}
