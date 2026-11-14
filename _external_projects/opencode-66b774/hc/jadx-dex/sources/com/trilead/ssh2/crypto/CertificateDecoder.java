package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class CertificateDecoder {
    public abstract java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure);

    public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure, java.lang.String str) {
        return createKeyPair(pEMStructure);
    }

    public abstract java.lang.String getEndLine();

    public abstract java.lang.String getStartLine();
}
