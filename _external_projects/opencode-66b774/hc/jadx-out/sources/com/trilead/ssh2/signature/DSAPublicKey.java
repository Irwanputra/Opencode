package com.trilead.ssh2.signature;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class DSAPublicKey {
    private BigInteger g;
    private BigInteger p;
    private BigInteger q;
    private BigInteger y;

    public DSAPublicKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.p = bigInteger;
        this.q = bigInteger2;
        this.g = bigInteger3;
        this.y = bigInteger4;
    }

    public BigInteger getG() {
        return this.g;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.q;
    }

    public BigInteger getY() {
        return this.y;
    }
}
