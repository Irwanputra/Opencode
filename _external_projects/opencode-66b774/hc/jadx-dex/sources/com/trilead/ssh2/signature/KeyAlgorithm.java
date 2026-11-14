package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class KeyAlgorithm<U extends java.security.PublicKey, R extends java.security.PrivateKey> {
    private final java.lang.String keyFormat;
    private final java.lang.Class<R> keyType;
    private final java.security.Provider provider;
    private final java.lang.String signatureAlgorithm;

    public KeyAlgorithm(java.lang.String str, java.lang.String str2, java.lang.Class<R> cls, java.security.Provider provider) {
        this.signatureAlgorithm = str;
        this.keyFormat = str2;
        this.keyType = cls;
        this.provider = provider;
    }

    public abstract java.security.PublicKey decodePublicKey(byte[] bArr);

    public abstract byte[] decodeSignature(byte[] bArr);

    public abstract byte[] encodePublicKey(U u);

    public abstract byte[] encodeSignature(byte[] bArr);

    public byte[] generateSignature(byte[] bArr, R r, java.security.SecureRandom secureRandom) {
        try {
            java.security.Provider provider = this.provider;
            java.lang.String str = this.signatureAlgorithm;
            java.security.Signature signature = provider == null ? java.security.Signature.getInstance(str) : java.security.Signature.getInstance(str, provider);
            signature.initSign(r, secureRandom);
            signature.update(bArr);
            return signature.sign();
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not generate signature", e);
            return null;
        }
    }

    public abstract java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders();

    public java.lang.String getKeyFormat() {
        return this.keyFormat;
    }

    public boolean supportsKey(java.security.PrivateKey privateKey) {
        return this.keyType.isAssignableFrom(privateKey.getClass());
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, U u) {
        try {
            java.security.Provider provider = this.provider;
            java.lang.String str = this.signatureAlgorithm;
            java.security.Signature signature = provider == null ? java.security.Signature.getInstance(str) : java.security.Signature.getInstance(str, provider);
            signature.initVerify(u);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not verify signature", e);
            return false;
        }
    }

    public KeyAlgorithm(java.lang.String str, java.lang.String str2, java.lang.Class<R> cls) {
        this(str, str2, cls, null);
    }
}
