package com.trilead.ssh2.crypto.digest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class JreMessageDigestWrapper implements com.trilead.ssh2.crypto.digest.Digest {
    private final java.security.MessageDigest digest;

    public JreMessageDigestWrapper(java.security.MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr) {
        java.lang.System.arraycopy(this.digest.digest(), 0, bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public int getDigestLength() {
        return this.digest.getDigestLength();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void reset() {
        this.digest.reset();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr, int i) {
        java.lang.System.arraycopy(this.digest.digest(), 0, bArr, i, bArr.length);
    }
}
