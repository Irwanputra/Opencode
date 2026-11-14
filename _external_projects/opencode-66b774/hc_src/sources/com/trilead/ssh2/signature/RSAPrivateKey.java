package com.trilead.ssh2.signature;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class RSAPrivateKey {
    private BigInteger d;
    private BigInteger e;
    private BigInteger n;

    public RSAPrivateKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.d = bigInteger;
        this.e = bigInteger2;
        this.n = bigInteger3;
    }

    public BigInteger getD() {
        return this.d;
    }

    public BigInteger getE() {
        return this.e;
    }

    public BigInteger getN() {
        return this.n;
    }

    public RSAPublicKey getPublicKey() {
        return new RSAPublicKey(this.e, this.n);
    }

    public KeyPair toJCEKeyPair() {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return new KeyPair(keyFactory.generatePublic(new RSAPublicKeySpec(getN(), getE())), keyFactory.generatePrivate(new RSAPrivateKeySpec(getN(), getD())));
    }
}
