package com.trilead.ssh2.crypto.cipher;

import dev.epro.r0.S10973172697741180971;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class DESede extends DES {
    private boolean encrypt;
    private int[] key1 = null;
    private int[] key2 = null;
    private int[] key3 = null;

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z, byte[] bArr) {
        this.key1 = generateWorkingKey(z, bArr, 0);
        this.key2 = generateWorkingKey(!z, bArr, 8);
        this.key3 = generateWorkingKey(z, bArr, 16);
        this.encrypt = z;
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.key1;
        if (iArr == null) {
            S10973172697741180971.m("DESede engine not initialised!");
            return;
        }
        if (this.encrypt) {
            desFunc(iArr, bArr, i, bArr2, i2);
            desFunc(this.key2, bArr2, i2, bArr2, i2);
            desFunc(this.key3, bArr2, i2, bArr2, i2);
        } else {
            desFunc(this.key3, bArr, i, bArr2, i2);
            desFunc(this.key2, bArr2, i2, bArr2, i2);
            desFunc(this.key1, bArr2, i2, bArr2, i2);
        }
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public void reset() {
    }
}
