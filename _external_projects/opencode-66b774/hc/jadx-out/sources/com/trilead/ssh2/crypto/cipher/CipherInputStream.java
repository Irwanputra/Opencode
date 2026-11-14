package com.trilead.ssh2.crypto.cipher;

import dev.epro.r0.Q11088980322693754445;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class CipherInputStream {
    private final BufferedInputStream bi;
    private int blockSize;
    private byte[] buffer;
    private BlockCipher currentCipher;
    private byte[] enc;
    private int pos;

    public CipherInputStream(BlockCipher blockCipher, InputStream inputStream) {
        if (inputStream instanceof BufferedInputStream) {
            this.bi = (BufferedInputStream) inputStream;
        } else {
            this.bi = new BufferedInputStream(inputStream);
        }
        changeCipher(blockCipher);
    }

    private void getBlock() throws IOException {
        int i = 0;
        while (true) {
            int i2 = this.blockSize;
            if (i >= i2) {
                try {
                    this.currentCipher.transformBlock(this.enc, 0, this.buffer, 0);
                    this.pos = 0;
                    return;
                } catch (Exception unused) {
                    Q11088980322693754445.h("Error while decrypting block.");
                    return;
                }
            }
            int i3 = this.bi.read(this.enc, i, i2 - i);
            if (i3 < 0) {
                Q11088980322693754445.h("Cannot read full block, EOF reached.");
                return;
            }
            i += i3;
        }
    }

    public void changeCipher(BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = blockSize;
    }

    public int peekPlain(byte[] bArr, int i, int i2) throws IOException {
        if (this.pos != this.blockSize) {
            Q11088980322693754445.h("Cannot read plain since crypto buffer is not aligned.");
            return 0;
        }
        this.bi.mark(i2);
        int i3 = 0;
        while (true) {
            BufferedInputStream bufferedInputStream = this.bi;
            if (i3 >= i2) {
                bufferedInputStream.reset();
                return i3;
            }
            try {
                int i4 = bufferedInputStream.read(bArr, i + i3, i2 - i3);
                if (i4 < 0) {
                    throw new IOException("Cannot fill buffer, EOF reached.");
                }
                i3 += i4;
            } catch (Throwable th) {
                this.bi.reset();
                throw th;
            }
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i2 > 0) {
            if (this.pos >= this.blockSize) {
                getBlock();
            }
            int iMin = Math.min(this.blockSize - this.pos, i2);
            System.arraycopy(this.buffer, this.pos, bArr, i, iMin);
            this.pos += iMin;
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
        }
        return i3;
    }

    public int readPlain(byte[] bArr, int i, int i2) throws IOException {
        if (this.pos != this.blockSize) {
            Q11088980322693754445.h("Cannot read plain since crypto buffer is not aligned.");
            return 0;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.bi.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                Q11088980322693754445.h("Cannot fill buffer, EOF reached.");
                return 0;
            }
            i3 += i4;
        }
        return i3;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() throws IOException {
        if (this.pos >= this.blockSize) {
            getBlock();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i] & 255;
    }
}
