package com.trilead.ssh2.crypto.dh;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class EcDhExchange extends com.trilead.ssh2.crypto.dh.GenericDhExchange {
    private java.security.interfaces.ECPrivateKey clientPrivate;
    private java.security.interfaces.ECPublicKey clientPublic;
    private com.trilead.ssh2.signature.ECDSAKeyAlgorithm ecdsKeyAlgorithm;
    private java.security.interfaces.ECPublicKey serverPublic;

    public static com.trilead.ssh2.signature.ECDSAKeyAlgorithm getVerifierForKey(java.security.interfaces.ECKey eCKey) {
        int fieldSize = eCKey.getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp256();
        }
        if (fieldSize == 384) {
            return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp384();
        }
        if (fieldSize != 521) {
            return null;
        }
        return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp521();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getE() {
        return com.trilead.ssh2.signature.ECDSAKeyAlgorithm.encodePoint(this.clientPublic.getW(), this.clientPublic.getParams().getCurve());
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public java.lang.String getHashAlgo() {
        return com.trilead.ssh2.signature.ECDSAKeyAlgorithm.getDigestAlgorithmForParams(this.clientPublic);
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getServerE() {
        return com.trilead.ssh2.signature.ECDSAKeyAlgorithm.encodePoint(this.serverPublic.getW(), this.serverPublic.getParams().getCurve());
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void init(java.lang.String str) {
        java.security.spec.ECParameterSpec ecParameterSpec;
        str.getClass();
        switch (str) {
            case "ecdh-sha2-nistp256":
                com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp256 eCDSASha2Nistp256 = new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp256();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp256;
                ecParameterSpec = eCDSASha2Nistp256.getEcParameterSpec();
                break;
            case "ecdh-sha2-nistp384":
                com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp384 eCDSASha2Nistp384 = new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp384();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp384;
                ecParameterSpec = eCDSASha2Nistp384.getEcParameterSpec();
                break;
            case "ecdh-sha2-nistp521":
                com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp521 eCDSASha2Nistp521 = new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp521();
                this.ecdsKeyAlgorithm = eCDSASha2Nistp521;
                ecParameterSpec = eCDSASha2Nistp521.getEcParameterSpec();
                break;
            default:
                dev.epro.r0.S10973172697741180971.j("Unknown EC curve ".concat(str));
                return;
        }
        try {
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(ecParameterSpec);
            java.security.KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            this.clientPrivate = (java.security.interfaces.ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
            this.clientPublic = (java.security.interfaces.ECPublicKey) keyPairGenerateKeyPair.getPublic();
        } catch (java.security.InvalidAlgorithmParameterException e) {
            dev.epro.r0.Z3383101362411723454.q("Invalid DH parameters", e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            dev.epro.r0.Z3383101362411723454.q("No DH keypair generator", e2);
        }
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void setF(byte[] bArr) {
        if (this.clientPublic == null) {
            dev.epro.r0.S10973172697741180971.m("EcDhExchange not initialized!");
            return;
        }
        try {
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("EC");
                com.trilead.ssh2.signature.ECDSAKeyAlgorithm verifierForKey = getVerifierForKey(this.clientPublic);
                if (verifierForKey == null) {
                    throw new java.io.IOException("No such EC group");
                }
                java.security.spec.ECParameterSpec ecParameterSpec = verifierForKey.getEcParameterSpec();
                this.serverPublic = (java.security.interfaces.ECPublicKey) keyFactory.generatePublic(new java.security.spec.ECPublicKeySpec(com.trilead.ssh2.signature.ECDSAKeyAlgorithm.decodePoint(bArr, ecParameterSpec.getCurve()), ecParameterSpec));
                javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH");
                keyAgreement.init(this.clientPrivate);
                keyAgreement.doPhase(this.serverPublic, true);
                this.sharedSecret = new java.math.BigInteger(1, keyAgreement.generateSecret());
            } catch (java.security.NoSuchAlgorithmException e) {
                dev.epro.r0.Z3383101362411723454.q("No ECDH key agreement method", e);
            }
        } catch (java.security.InvalidKeyException | java.security.spec.InvalidKeySpecException e2) {
            dev.epro.r0.Z3383101362411723454.q("Invalid ECDH key", e2);
        }
    }
}
