package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class NullCipher implements com.trilead.ssh2.crypto.cipher.BlockCipher {
    private int blockSize;

    public NullCipher() {
        this.blockSize = 8;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        java.lang.System.arraycopy(bArr, i, bArr2, i2, this.blockSize);
    }

    public NullCipher(int i) {
        this.blockSize = i;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z, byte[] bArr) {
    }
}
