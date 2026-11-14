package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class CipherInputStream {
    private final java.io.BufferedInputStream bi;
    private int blockSize;
    private byte[] buffer;
    private com.trilead.ssh2.crypto.cipher.BlockCipher currentCipher;
    private byte[] enc;
    private int pos;

    public CipherInputStream(com.trilead.ssh2.crypto.cipher.BlockCipher blockCipher, java.io.InputStream inputStream) {
        if (inputStream instanceof java.io.BufferedInputStream) {
            this.bi = (java.io.BufferedInputStream) inputStream;
        } else {
            this.bi = new java.io.BufferedInputStream(inputStream);
        }
        changeCipher(blockCipher);
    }

    private void getBlock() throws java.io.IOException {
        int i = 0;
        while (true) {
            int i2 = this.blockSize;
            if (i >= i2) {
                try {
                    this.currentCipher.transformBlock(this.enc, 0, this.buffer, 0);
                    this.pos = 0;
                    return;
                } catch (java.lang.Exception unused) {
                    dev.epro.r0.Q11088980322693754445.h("Error while decrypting block.");
                    return;
                }
            }
            int i3 = this.bi.read(this.enc, i, i2 - i);
            if (i3 < 0) {
                dev.epro.r0.Q11088980322693754445.h("Cannot read full block, EOF reached.");
                return;
            }
            i += i3;
        }
    }

    public void changeCipher(com.trilead.ssh2.crypto.cipher.BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = blockSize;
    }

    public int peekPlain(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.pos != this.blockSize) {
            dev.epro.r0.Q11088980322693754445.h("Cannot read plain since crypto buffer is not aligned.");
            return 0;
        }
        this.bi.mark(i2);
        int i3 = 0;
        while (true) {
            java.io.BufferedInputStream bufferedInputStream = this.bi;
            if (i3 >= i2) {
                bufferedInputStream.reset();
                return i3;
            }
            try {
                int i4 = bufferedInputStream.read(bArr, i + i3, i2 - i3);
                if (i4 < 0) {
                    throw new java.io.IOException("Cannot fill buffer, EOF reached.");
                }
                i3 += i4;
            } catch (java.lang.Throwable th) {
                this.bi.reset();
                throw th;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i2 > 0) {
            if (this.pos >= this.blockSize) {
                getBlock();
            }
            int iMin = java.lang.Math.min(this.blockSize - this.pos, i2);
            java.lang.System.arraycopy(this.buffer, this.pos, bArr, i, iMin);
            this.pos += iMin;
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
        }
        return i3;
    }

    public int readPlain(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.pos != this.blockSize) {
            dev.epro.r0.Q11088980322693754445.h("Cannot read plain since crypto buffer is not aligned.");
            return 0;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.bi.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                dev.epro.r0.Q11088980322693754445.h("Cannot fill buffer, EOF reached.");
                return 0;
            }
            i3 += i4;
        }
        return i3;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() throws java.io.IOException {
        if (this.pos >= this.blockSize) {
            getBlock();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i] & 255;
    }
}
