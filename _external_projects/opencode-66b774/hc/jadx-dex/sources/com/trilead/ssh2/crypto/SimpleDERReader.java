package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class SimpleDERReader {
    byte[] buffer;
    int count;
    int pos;

    public SimpleDERReader(byte[] bArr) {
        resetInput(bArr);
    }

    private byte readByte() {
        int i = this.count;
        if (i <= 0) {
            dev.epro.r0.Q11088980322693754445.h("DER byte array: out of data");
            return (byte) 0;
        }
        this.count = i - 1;
        byte[] bArr = this.buffer;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    private byte[] readBytes(int i) {
        if (i > this.count) {
            dev.epro.r0.Q11088980322693754445.h("DER byte array: out of data");
            return null;
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.buffer, this.pos, bArr, 0, i);
        this.pos += i;
        this.count -= i;
        return bArr;
    }

    public int available() {
        return this.count;
    }

    public int ignoreNextObject() {
        int i = readByte() & 255;
        int length = readLength();
        if (length < 0 || length > available()) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal len in DER object (", ")"));
            return 0;
        }
        readBytes(length);
        return i;
    }

    public com.trilead.ssh2.crypto.SimpleDERReader readConstructed() {
        int length = readLength();
        if (length < 0 || length > available()) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal length in DER object (", ")"));
            return null;
        }
        com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(this.buffer, this.pos, length);
        this.pos += length;
        this.count -= length;
        return simpleDERReader;
    }

    public int readConstructedType() {
        byte b = readByte();
        int i = b & 255;
        if ((b & 32) == 32) {
            return b & 31;
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Expected constructed type, but was "));
        return 0;
    }

    public java.math.BigInteger readInt() {
        int i = readByte() & 255;
        if (i != 2) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Expected DER Integer, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return new java.math.BigInteger(1, readBytes(length));
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public int readLength() {
        byte b = readByte();
        int i = b & 255;
        if ((b & 128) == 0) {
            return i;
        }
        int i2 = b & 127;
        if (i2 == 0 || i2 > 4) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 8) | (readByte() & 255);
            i2--;
        }
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    public byte[] readOctetString() {
        int i = readByte() & 255;
        if (i != 4 && i != 3) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Expected DER Octetstring, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return readBytes(length);
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public java.lang.String readOid() {
        int i = readByte() & 255;
        if (i != 6) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Expected DER OID, but found type "));
            return null;
        }
        int length = readLength();
        if (length < 1 || length > available()) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal len in DER object (", ")"));
            return null;
        }
        byte[] bytes = readBytes(length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        int i2 = bytes[0] / 40;
        if (i2 == 0) {
            sb.append('0');
        } else if (i2 != 1) {
            sb.append('2');
            bytes[0] = (byte) (bytes[0] - 80);
        } else {
            sb.append('1');
            bytes[0] = (byte) (bytes[0] - 40);
        }
        long j = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte b = bytes[i3];
            j = (j << 7) + ((long) (b & 127));
            if ((b & 128) == 0) {
                sb.append('.');
                sb.append(j);
                j = 0;
            }
        }
        return sb.toString();
    }

    public byte[] readSequenceAsByteArray() {
        int i = readByte() & 255;
        if (i != 48) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Expected DER Sequence, but found type "));
            return null;
        }
        int length = readLength();
        if (length >= 0 && length <= available()) {
            return readBytes(length);
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(length, "Illegal len in DER object (", ")"));
        return null;
    }

    public void resetInput(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.pos = i;
        this.count = i2;
    }

    public SimpleDERReader(byte[] bArr, int i, int i2) {
        resetInput(bArr, i, i2);
    }

    public void resetInput(byte[] bArr) {
        resetInput(bArr, 0, bArr.length);
    }
}
