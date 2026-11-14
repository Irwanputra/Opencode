package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ED25519KeyAlgorithm extends com.trilead.ssh2.signature.KeyAlgorithm<net.i2p.crypto.eddsa.EdDSAPublicKey, net.i2p.crypto.eddsa.EdDSAPrivateKey> {
    private static final java.lang.String ED25519_CURVE_NAME = "Ed25519";
    private static final java.lang.String ED25519_KEY_NAME = "ssh-ed25519";

    public ED25519KeyAlgorithm() {
        super("NoneWithEdDSA", ED25519_KEY_NAME, net.i2p.crypto.eddsa.EdDSAPrivateKey.class, new net.i2p.crypto.eddsa.EdDSASecurityProvider());
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public net.i2p.crypto.eddsa.EdDSAPublicKey decodePublicKey(byte[] bArr) {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(ED25519_KEY_NAME)) {
            dev.epro.r0.Q11088980322693754445.h("Invalid key type");
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.j() == 0) {
            return new net.i2p.crypto.eddsa.EdDSAPublicKey(new net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec(bArrC, net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable.getByName(ED25519_CURVE_NAME)));
        }
        dev.epro.r0.Q11088980322693754445.h("Unexpected padding in public key");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(ED25519_KEY_NAME)) {
            dev.epro.r0.Q11088980322693754445.h("Invalid signature format");
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.j() == 0) {
            return bArrC;
        }
        dev.epro.r0.Q11088980322693754445.h("Unexpected padding in signature");
        return null;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(net.i2p.crypto.eddsa.EdDSAPublicKey edDSAPublicKey) {
        byte[] abyte = edDSAPublicKey.getAbyte();
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(ED25519_KEY_NAME);
        t17032536773975598836.s(0, abyte, abyte.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(ED25519_KEY_NAME);
        t17032536773975598836.s(0, bArr, bArr.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
        return java.util.Collections.singletonList(new com.trilead.ssh2.signature.OpenSshCertificateDecoder(ED25519_KEY_NAME) { // from class: com.trilead.ssh2.signature.ED25519KeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public java.security.KeyPair generateKeyPair(dev.epro.r0.C9142879380583651391 c9142879380583651391) throws java.security.NoSuchAlgorithmException {
                net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec byName = net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable.getByName(com.trilead.ssh2.signature.ED25519KeyAlgorithm.ED25519_CURVE_NAME);
                byte[] bArrC = c9142879380583651391.c();
                byte[] bArrC2 = c9142879380583651391.c();
                java.security.spec.KeySpec edDSAPublicKeySpec = new net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec(bArrC, byName);
                java.security.spec.KeySpec edDSAPrivateKeySpec = new net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec(java.util.Arrays.copyOfRange(bArrC2, 0, 32), byName);
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("EdDSA", (java.security.Provider) new net.i2p.crypto.eddsa.EdDSASecurityProvider());
                return new java.security.KeyPair(keyFactory.generatePublic(edDSAPublicKeySpec), keyFactory.generatePrivate(edDSAPrivateKeySpec));
            }
        });
    }
}
