package com.trilead.ssh2.crypto.cipher;

import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CTRMode implements BlockCipher {
    public byte[] X;
    public byte[] Xenc;
    public BlockCipher bc;
    public int blockSize;
    public int count = 0;
    public boolean doEncrypt;

    public CTRMode(BlockCipher blockCipher, byte[] bArr, boolean z) {
        this.bc = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.doEncrypt = z;
        if (blockSize == bArr.length) {
            byte[] bArr2 = new byte[blockSize];
            this.X = bArr2;
            this.Xenc = new byte[blockSize];
            System.arraycopy(bArr, 0, bArr2, 0, blockSize);
            return;
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("Jc:N7h\u001c1gN6:\u001a1gL`kOg9L`=\u001d3gMbjK1")));
        m4207.append(this.blockSize);
        m4207.append(Crypt.a(Crypt.xrc("\u001c6k\u001akhM3mJffMf<\u001cf>\u001b4hHa;\u001daf\u00194j\u001e7;K`;J3>OcjA`9Keo\u001djhN6nO7f\u001de;N3jO")));
        m4207.append(bArr.length);
        m4207.append(Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        throw new IllegalArgumentException(m4207.toString());
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public final int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z, byte[] bArr) {
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
            bArr3[i5] = (byte) (bArr3[i5] + 1);
            if (bArr3[i5] != 0) {
                return;
            }
        }
    }
}
