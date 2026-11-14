package com.trilead.ssh2.crypto;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.Q11088980322693754445;
import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
            Q11088980322693754445.h("DER byte array: out of data");
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
            Q11088980322693754445.h("DER byte array: out of data");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i);
        this.pos += i;
        this.count -= i;
        return bArr;
    }

    public int available() {
        return this.count;
    }

    public int ignoreNextObject() {
        int readByte = readByte() & 255;
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal len in DER object (", ")"));
            return 0;
        }
        readBytes(readLength);
        return readByte;
    }

    public SimpleDERReader readConstructed() {
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal length in DER object (", ")"));
            return null;
        }
        SimpleDERReader simpleDERReader = new SimpleDERReader(this.buffer, this.pos, readLength);
        this.pos += readLength;
        this.count -= readLength;
        return simpleDERReader;
    }

    public int readConstructedType() {
        byte readByte = readByte();
        int i = readByte & 255;
        if ((readByte & 32) == 32) {
            return readByte & 31;
        }
        Q11088980322693754445.h(G6547577305291411977.n(i, "Expected constructed type, but was "));
        return 0;
    }

    public BigInteger readInt() {
        int readByte = readByte() & 255;
        if (readByte != 2) {
            Q11088980322693754445.h(G6547577305291411977.n(readByte, "Expected DER Integer, but found type "));
            return null;
        }
        int readLength = readLength();
        if (readLength >= 0 && readLength <= available()) {
            return new BigInteger(1, readBytes(readLength));
        }
        Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal len in DER object (", ")"));
        return null;
    }

    public int readLength() {
        byte readByte = readByte();
        int i = readByte & 255;
        if ((readByte & 128) == 0) {
            return i;
        }
        int i2 = readByte & Byte.MAX_VALUE;
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
        int readByte = readByte() & 255;
        if (readByte != 4 && readByte != 3) {
            Q11088980322693754445.h(G6547577305291411977.n(readByte, "Expected DER Octetstring, but found type "));
            return null;
        }
        int readLength = readLength();
        if (readLength >= 0 && readLength <= available()) {
            return readBytes(readLength);
        }
        Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal len in DER object (", ")"));
        return null;
    }

    public String readOid() {
        int readByte = readByte() & 255;
        if (readByte != 6) {
            Q11088980322693754445.h(G6547577305291411977.n(readByte, "Expected DER OID, but found type "));
            return null;
        }
        int readLength = readLength();
        if (readLength < 1 || readLength > available()) {
            Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal len in DER object (", ")"));
            return null;
        }
        byte[] readBytes = readBytes(readLength);
        StringBuilder sb = new StringBuilder(64);
        int i = readBytes[0] / 40;
        if (i == 0) {
            sb.append('0');
        } else if (i != 1) {
            sb.append('2');
            readBytes[0] = (byte) (readBytes[0] - 80);
        } else {
            sb.append('1');
            readBytes[0] = (byte) (readBytes[0] - 40);
        }
        long j = 0;
        for (int i2 = 0; i2 < readLength; i2++) {
            j = (j << 7) + (r1 & Byte.MAX_VALUE);
            if ((readBytes[i2] & 128) == 0) {
                sb.append('.');
                sb.append(j);
                j = 0;
            }
        }
        return sb.toString();
    }

    public byte[] readSequenceAsByteArray() {
        int readByte = readByte() & 255;
        if (readByte != 48) {
            Q11088980322693754445.h(G6547577305291411977.n(readByte, "Expected DER Sequence, but found type "));
            return null;
        }
        int readLength = readLength();
        if (readLength >= 0 && readLength <= available()) {
            return readBytes(readLength);
        }
        Q11088980322693754445.h(G6547577305291411977.o(readLength, "Illegal len in DER object (", ")"));
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
