package com.trilead.ssh2.crypto;

import java.security.KeyPair;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class CertificateDecoder {
    public abstract KeyPair createKeyPair(PEMStructure pEMStructure);

    public KeyPair createKeyPair(PEMStructure pEMStructure, String str) {
        return createKeyPair(pEMStructure);
    }

    public abstract String getEndLine();

    public abstract String getStartLine();
}
