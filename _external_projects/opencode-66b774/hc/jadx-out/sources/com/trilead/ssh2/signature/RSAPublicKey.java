package com.trilead.ssh2.signature;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class RSAPublicKey {
    BigInteger e;
    BigInteger n;

    public RSAPublicKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this.e = bigInteger;
        this.n = bigInteger2;
    }

    public BigInteger getE() {
        return this.e;
    }

    public BigInteger getN() {
        return this.n;
    }
}
