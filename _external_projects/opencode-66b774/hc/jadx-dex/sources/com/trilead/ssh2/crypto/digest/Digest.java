package com.trilead.ssh2.crypto.digest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface Digest {
    void digest(byte[] bArr);

    void digest(byte[] bArr, int i);

    int getDigestLength();

    void reset();

    void update(byte b);

    void update(byte[] bArr);

    void update(byte[] bArr, int i, int i2);
}
