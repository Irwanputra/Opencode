package com.trilead.ssh2.crypto.cipher;

import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DESede extends DES {
    private boolean encrypt;
    private int[] key1 = null;
    private int[] key2 = null;
    private int[] key3 = null;

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public String getAlgorithmName() {
        return Crypt.a(Crypt.xrc("\u00196k@39M0i\u00197=O4k\u001c7=@4mMfkN6>\u001a3gMk"));
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

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public void reset() {
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.key1;
        if (iArr == null) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("Hff\u001b3h\u001ag9M7o\u001beoK3mJ7fNcmA7:A`g@4i\u001dj;\u001dekI7<HfkHd;\u001dcfO7jOco@k;NkfH")));
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
}
