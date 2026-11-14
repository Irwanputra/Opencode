package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class DSAPublicKey {
    private java.math.BigInteger g;
    private java.math.BigInteger p;
    private java.math.BigInteger q;
    private java.math.BigInteger y;

    public DSAPublicKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        this.p = bigInteger;
        this.q = bigInteger2;
        this.g = bigInteger3;
        this.y = bigInteger4;
    }

    public java.math.BigInteger getG() {
        return this.g;
    }

    public java.math.BigInteger getP() {
        return this.p;
    }

    public java.math.BigInteger getQ() {
        return this.q;
    }

    public java.math.BigInteger getY() {
        return this.y;
    }
}
