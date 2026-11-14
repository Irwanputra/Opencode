package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@java.lang.Deprecated
public class DSASignature {
    private java.math.BigInteger r;
    private java.math.BigInteger s;

    public DSASignature(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.r = bigInteger;
        this.s = bigInteger2;
    }

    public java.math.BigInteger getR() {
        return this.r;
    }

    public java.math.BigInteger getS() {
        return this.s;
    }
}
