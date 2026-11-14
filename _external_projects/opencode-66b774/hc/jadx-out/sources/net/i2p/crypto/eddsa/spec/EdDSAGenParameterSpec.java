package net.i2p.crypto.eddsa.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class EdDSAGenParameterSpec implements AlgorithmParameterSpec {
    private final String name;

    public EdDSAGenParameterSpec(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
