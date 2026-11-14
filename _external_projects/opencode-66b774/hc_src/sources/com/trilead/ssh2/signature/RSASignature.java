package com.trilead.ssh2.signature;

import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@Deprecated
/* loaded from: classes.dex */
public class RSASignature {
    BigInteger s;

    public RSASignature(BigInteger bigInteger) {
        this.s = bigInteger;
    }

    public BigInteger getS() {
        return this.s;
    }
}
