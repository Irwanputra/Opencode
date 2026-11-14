package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class RSAPublicKey {
    java.math.BigInteger e;
    java.math.BigInteger n;

    public RSAPublicKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.e = bigInteger;
        this.n = bigInteger2;
    }

    public java.math.BigInteger getE() {
        return this.e;
    }

    public java.math.BigInteger getN() {
        return this.n;
    }
}
