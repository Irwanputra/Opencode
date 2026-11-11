package com.trilead.ssh2.crypto.cipher;

import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CBCMode implements BlockCipher {
    public int blockSize;
    public byte[] cbc_vector;
    public boolean doEncrypt;
    public BlockCipher tc;
    public byte[] tmp_vector;

    public CBCMode(BlockCipher blockCipher, byte[] bArr, boolean z) {
        this.tc = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.doEncrypt = z;
        if (blockSize == bArr.length) {
            byte[] bArr2 = new byte[blockSize];
            this.cbc_vector = bArr2;
            this.tmp_vector = new byte[blockSize];
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

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        System.arraycopy(bArr, i, this.tmp_vector, 0, this.blockSize);
        this.tc.transformBlock(bArr, i, bArr2, i2);
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            int i4 = i2 + i3;
            bArr2[i4] = (byte) (bArr2[i4] ^ this.cbc_vector[i3]);
        }
        byte[] bArr3 = this.cbc_vector;
        this.cbc_vector = this.tmp_vector;
        this.tmp_vector = bArr3;
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < this.blockSize; i3++) {
            byte[] bArr3 = this.cbc_vector;
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
        }
        this.tc.transformBlock(this.cbc_vector, 0, bArr2, i2);
        System.arraycopy(bArr2, i2, this.cbc_vector, 0, this.blockSize);
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
        if (this.doEncrypt) {
            encryptBlock(bArr, i, bArr2, i2);
        } else {
            decryptBlock(bArr, i, bArr2, i2);
        }
    }
}
