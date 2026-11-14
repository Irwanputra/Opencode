package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class RSAPrivateKey {
    private java.math.BigInteger d;
    private java.math.BigInteger e;
    private java.math.BigInteger n;

    public RSAPrivateKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this.d = bigInteger;
        this.e = bigInteger2;
        this.n = bigInteger3;
    }

    public java.math.BigInteger getD() {
        return this.d;
    }

    public java.math.BigInteger getE() {
        return this.e;
    }

    public java.math.BigInteger getN() {
        return this.n;
    }

    public com.trilead.ssh2.signature.RSAPublicKey getPublicKey() {
        return new com.trilead.ssh2.signature.RSAPublicKey(this.e, this.n);
    }

    public java.security.KeyPair toJCEKeyPair() throws java.security.NoSuchAlgorithmException {
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
        return new java.security.KeyPair(keyFactory.generatePublic(new java.security.spec.RSAPublicKeySpec(getN(), getE())), keyFactory.generatePrivate(new java.security.spec.RSAPrivateKeySpec(getN(), getD())));
    }
}
