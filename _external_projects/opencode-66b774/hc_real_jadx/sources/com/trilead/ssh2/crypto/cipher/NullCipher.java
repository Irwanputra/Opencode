package com.trilead.ssh2.crypto.cipher;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NullCipher implements BlockCipher {
    private int blockSize;

    public NullCipher() {
        this.blockSize = 8;
    }

    public NullCipher(int i) {
        this.blockSize = 8;
        this.blockSize = i;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z, byte[] bArr) {
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        System.arraycopy(bArr, i, bArr2, i2, this.blockSize);
    }
}
