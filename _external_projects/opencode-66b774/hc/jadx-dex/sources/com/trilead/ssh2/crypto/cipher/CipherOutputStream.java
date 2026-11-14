package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class CipherOutputStream {
    int blockSize;
    java.io.OutputStream bo;
    byte[] buffer;
    com.trilead.ssh2.crypto.cipher.BlockCipher currentCipher;
    byte[] enc;
    int pos;
    private boolean recordingOutput;
    private final java.io.ByteArrayOutputStream recordingOutputStream = new java.io.ByteArrayOutputStream();
    final int BUFF_SIZE = 2048;
    byte[] out_buffer = new byte[2048];
    int out_buffer_pos = 0;

    public CipherOutputStream(com.trilead.ssh2.crypto.cipher.BlockCipher blockCipher, java.io.OutputStream outputStream) {
        this.bo = outputStream;
        changeCipher(blockCipher);
    }

    private void internal_write(byte[] bArr, int i, int i2) throws java.io.IOException {
        while (i2 > 0) {
            int i3 = this.out_buffer_pos;
            int i4 = 2048 - i3;
            if (i2 <= i4) {
                i4 = i2;
            }
            java.lang.System.arraycopy(bArr, i, this.out_buffer, i3, i4);
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

    private void writeBlock() throws java.io.IOException {
        try {
            this.currentCipher.transformBlock(this.buffer, 0, this.enc, 0);
            internal_write(this.enc, 0, this.blockSize);
            this.pos = 0;
            if (this.recordingOutput) {
                this.recordingOutputStream.write(this.enc, 0, this.blockSize);
            }
        } catch (java.lang.Exception e) {
            throw ((java.io.IOException) new java.io.IOException("Error while decrypting block.").initCause(e));
        }
    }

    public void changeCipher(com.trilead.ssh2.crypto.cipher.BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = 0;
    }

    public void flush() throws java.io.IOException {
        if (this.pos != 0) {
            dev.epro.r0.Q11088980322693754445.h("FATAL: cannot flush since crypto buffer is not aligned.");
            return;
        }
        int i = this.out_buffer_pos;
        if (i > 0) {
            this.bo.write(this.out_buffer, 0, i);
            this.out_buffer_pos = 0;
        }
        this.bo.flush();
    }

    public byte[] getRecordedOutput() {
        this.recordingOutput = false;
        byte[] byteArray = this.recordingOutputStream.toByteArray();
        this.recordingOutputStream.reset();
        return byteArray;
    }

    public void startRecording() {
        this.recordingOutput = true;
    }

    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        while (i2 > 0) {
            int iMin = java.lang.Math.min(this.blockSize - this.pos, i2);
            java.lang.System.arraycopy(bArr, i, this.buffer, this.pos, iMin);
            int i3 = this.pos + iMin;
            this.pos = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 >= this.blockSize) {
                writeBlock();
            }
        }
    }

    public void writePlain(int i) throws java.io.IOException {
        if (this.pos == 0) {
            internal_write(i);
        } else {
            dev.epro.r0.Q11088980322693754445.h("Cannot write plain since crypto buffer is not aligned.");
        }
    }

    public void writePlain(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.pos == 0) {
            internal_write(bArr, i, i2);
        } else {
            dev.epro.r0.Q11088980322693754445.h("Cannot write plain since crypto buffer is not aligned.");
        }
    }

    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.buffer;
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        bArr[i2] = (byte) i;
        if (i3 >= this.blockSize) {
            writeBlock();
        }
    }

    private void internal_write(int i) throws java.io.IOException {
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
}
