package com.trilead.ssh2.crypto.cipher;

import dev.epro.r0.G11450220448113054352;
import dev.epro.r0.S10973172697741180971;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class CTRMode implements BlockCipher {
    byte[] X;
    byte[] Xenc;
    BlockCipher bc;
    int blockSize;
    int count = 0;
    boolean doEncrypt;

    public CTRMode(BlockCipher blockCipher, byte[] bArr, boolean z) {
        this.bc = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.doEncrypt = z;
        if (blockSize != bArr.length) {
            S10973172697741180971.j(G11450220448113054352.h(blockSize, bArr.length, "IV must be ", " bytes long! (currently ", ")"));
            throw null;
        }
        byte[] bArr2 = new byte[blockSize];
        this.X = bArr2;
        this.Xenc = new byte[blockSize];
        System.arraycopy(bArr, 0, bArr2, 0, blockSize);
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public final int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public final void transformBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i4 = 0;
        this.bc.transformBlock(this.X, 0, this.Xenc, 0);
        while (true) {
            i3 = this.blockSize;
            if (i4 >= i3) {
                break;
            }
            bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.Xenc[i4]);
            i4++;
        }
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            byte[] bArr3 = this.X;
            byte b = (byte) (bArr3[i5] + 1);
            bArr3[i5] = b;
            if (b != 0) {
                return;
            }
        }
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z, byte[] bArr) {
    }
}
