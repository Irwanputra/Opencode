package com.trilead.ssh2.crypto.cipher;

import java.io.IOException;
import java.io.OutputStream;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CipherOutputStream {
    public int blockSize;
    public OutputStream bo;
    public byte[] buffer;
    public BlockCipher currentCipher;
    public byte[] enc;
    public int pos;
    public final int BUFF_SIZE = 2048;
    public byte[] out_buffer = new byte[2048];
    public int out_buffer_pos = 0;

    public CipherOutputStream(BlockCipher blockCipher, OutputStream outputStream) {
        this.bo = outputStream;
        changeCipher(blockCipher);
    }

    private void internal_write(int i) {
        byte[] bArr = this.out_buffer;
        int i2 = this.out_buffer_pos;
        int i3 = i2 + 1;
        this.out_buffer_pos = i3;
        bArr[i2] = (byte) i;
        if (i3 >= 2048) {
            this.bo.write(bArr, 0, 2048);
            this.out_buffer_pos = 0;
        }
    }

    private void internal_write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int i3 = this.out_buffer_pos;
            int i4 = 2048 - i3;
            if (i2 <= i4) {
                i4 = i2;
            }
            System.arraycopy(bArr, i, this.out_buffer, i3, i4);
            i += i4;
            int i5 = this.out_buffer_pos + i4;
            this.out_buffer_pos = i5;
            i2 -= i4;
            if (i5 >= 2048) {
                this.bo.write(this.out_buffer, 0, 2048);
                this.out_buffer_pos = 0;
            }
        }
    }

    private void writeBlock() {
        try {
            this.currentCipher.transformBlock(this.buffer, 0, this.enc, 0);
            internal_write(this.enc, 0, this.blockSize);
            this.pos = 0;
        } catch (Exception e) {
            throw ((IOException) new IOException(Crypt.a(Crypt.xrc("\u001adm\u00196>K6kJkgKdiI`mKeo\u001ck;H3gJ`j\u001b4fJ3>\u001d39\u001c3f\u0019jfHan\u001dki\u001ejkOfl@6nIjiM"))).initCause(e));
        }
    }

    public void changeCipher(BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = 0;
    }

    public void flush() {
        if (this.pos != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001bcg\u001af>M7=\u001dehM3gO0o\u001bf9\u001e6<Ka=\u001abiJ4o\u001b6k\u001bg9Nkk\u001d4nHkf\u001bdfM1l\u001d6lH6<\u001d1iObfO6=JjkK7mM`hA4n\u001e4fMji@d:\u001cei\u001d7nAao@7j\u0019jl@1n\u001e4n@79Kf=\u001bf;AbiK7f\u001ec")));
        }
        int i = this.out_buffer_pos;
        if (i > 0) {
            this.bo.write(this.out_buffer, 0, i);
            this.out_buffer_pos = 0;
        }
        this.bo.flush();
    }

    public void write(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        bArr[i2] = (byte) i;
        if (i3 >= this.blockSize) {
            writeBlock();
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int min = Math.min(this.blockSize - this.pos, i2);
            System.arraycopy(bArr, i, this.buffer, this.pos, min);
            int i3 = this.pos + min;
            this.pos = i3;
            i += min;
            i2 -= min;
            if (i3 >= this.blockSize) {
                writeBlock();
            }
        }
    }

    public void writePlain(int i) {
        if (this.pos != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("OgjKjl\u001cc<@3jO3:IckA0k\u001ejfAgmI4gO0>\u0019koMkg\u001dji\u001a6l\u001db=IaiOc<Abi\u001cch\u0019j9O7k\u001d4:Jj9\u001bjk\u001ddi\u001ec:@0:\u001ckfHgh@7=Ob:\u001d`<\u00191mN4lHfh\u001edk\u0019kh\u001e`n@7oAcf\u001d3>@e")));
        }
        internal_write(i);
    }

    public void writePlain(byte[] bArr, int i, int i2) {
        if (this.pos != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("OgjKjl\u001cc<@3jO3:IckA0k\u001ejfAgmI4gO0>\u0019koMkg\u001dji\u001a6l\u001db=IaiOc<Abi\u001cch\u0019j9O7k\u001d4:Jj9\u001bjk\u001ddi\u001ec:@0:\u001ckfHgh@7=Ob:\u001d`<\u00191mN4lHfh\u001edk\u0019kh\u001e`n@7oAcf\u001d3>@e")));
        }
        internal_write(bArr, i, i2);
    }
}
