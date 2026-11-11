package com.trilead.ssh2.crypto.cipher;

import java.io.IOException;
import java.io.InputStream;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CipherInputStream {
    public InputStream bi;
    public int blockSize;
    public byte[] buffer;
    public BlockCipher currentCipher;
    public byte[] enc;
    public int pos;
    public final int BUFF_SIZE = 2048;
    public byte[] input_buffer = new byte[2048];
    public int input_buffer_pos = 0;
    public int input_buffer_size = 0;

    public CipherInputStream(BlockCipher blockCipher, InputStream inputStream) {
        this.bi = inputStream;
        changeCipher(blockCipher);
    }

    private int fill_buffer() {
        this.input_buffer_pos = 0;
        int read = this.bi.read(this.input_buffer, 0, 2048);
        this.input_buffer_size = read;
        return read;
    }

    private void getBlock() {
        int i = 0;
        while (true) {
            int i2 = this.blockSize;
            if (i >= i2) {
                try {
                    this.currentCipher.transformBlock(this.enc, 0, this.buffer, 0);
                    this.pos = 0;
                    return;
                } catch (Exception unused) {
                    throw new IOException(Crypt.a(Crypt.xrc("\u001adm\u00196>K6kJkgKdiI`mKeo\u001ck;H3gJ`j\u001b4fJ3>\u001d39\u001c3f\u0019jfHan\u001dki\u001ejkOfl@6nIjiM")));
                }
            } else {
                int internal_read = internal_read(this.enc, i, i2 - i);
                if (internal_read < 0) {
                    throw new IOException(Crypt.a(Crypt.xrc("OakLgkOg<\u001c`hN3<@blH6f\u001a4=\u001bdnM7:\u001e1>\u001cdo\u001a0=\u001c3iA7>Je>\u001e1oAc=IdiAgoAf:NfhN1f\u001b7;J0;Ie;Kao\u001dgf@j=\u001c1f\u0019knJ4g")));
                }
                i += internal_read;
            }
        }
    }

    private int internal_read(byte[] bArr, int i, int i2) {
        int i3 = this.input_buffer_size;
        if (i3 < 0) {
            return -1;
        }
        if (this.input_buffer_pos >= i3 && fill_buffer() <= 0) {
            return -1;
        }
        int i4 = this.input_buffer_size;
        int i5 = this.input_buffer_pos;
        int i6 = i4 - i5;
        if (i2 > i6) {
            i2 = i6;
        }
        System.arraycopy(this.input_buffer, i5, bArr, i, i2);
        this.input_buffer_pos += i2;
        return i2;
    }

    public void changeCipher(BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = blockSize;
    }

    public int read() {
        if (this.pos >= this.blockSize) {
            getBlock();
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > 0) {
            if (this.pos >= this.blockSize) {
                getBlock();
            }
            int min = Math.min(this.blockSize - this.pos, i2);
            System.arraycopy(this.buffer, this.pos, bArr, i, min);
            this.pos += min;
            i += min;
            i2 -= min;
            i3 += min;
        }
        return i3;
    }

    public int readPlain(byte[] bArr, int i, int i2) {
        if (this.pos != this.blockSize) {
            throw new IOException(Crypt.a(Crypt.xrc("M1j@gfA`>K3o@j=I0g\u001c4<\u0019a9\u001e3k\u001cbmMfiNenH`gH`:\u001c3jL7m\u001ek>Kgn@c:Jbl\u001cfo@6hIf=\u001e4g\u001d69N6o@fj@j=\u001a7g\u0019gk@4;Af9He9Afn\u001ajf\u001d1o\u001dbo\u001bghIflLaj\u001beoL0g\u001ed")));
        }
        int i3 = 0;
        while (i3 < i2) {
            int internal_read = internal_read(bArr, i + i3, i2 - i3);
            if (internal_read < 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001b7k\u001d6hIbh\u0019dnL`oJjl\u001efjIalK4=Jk:L0hOfj@k;\u001efgA7gHjjMg:Kk<K6>O0fHb9Mdi\u001cf;M7>L3>Oa>\u001d4jO`kKb>Me<\u001d3hIgk")));
            }
            i3 += internal_read;
        }
        return i3;
    }
}
