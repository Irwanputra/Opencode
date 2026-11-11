package com.trilead.ssh2.crypto;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.math.BigInteger;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SimpleDERReader {
    public byte[] buffer;
    public int count;
    public int pos;

    public SimpleDERReader(byte[] bArr) {
        resetInput(bArr);
    }

    public SimpleDERReader(byte[] bArr, int i, int i2) {
        resetInput(bArr, i, i2);
    }

    private byte readByte() {
        int i = this.count;
        if (i <= 0) {
            throw new IOException(Crypt.a(Crypt.xrc("L6jK4n\u001e1k\u001bgoI7f\u001ag;\u001cd9\u001b6=@kh\u001c`9@eiNb>I6l\u0019do\u0019fk\u001ef=\u00196=\u001a4k\u001ba=\u001e7oA79I")));
        }
        this.count = i - 1;
        byte[] bArr = this.buffer;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    private byte[] readBytes(int i) {
        if (i > this.count) {
            throw new IOException(Crypt.a(Crypt.xrc("L6jK4n\u001e1k\u001bgoI7f\u001ag;\u001cd9\u001b6=@kh\u001c`9@eiNb>I6l\u0019do\u0019fk\u001ef=\u00196=\u001a4k\u001ba=\u001e7oA79I")));
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i);
        this.pos += i;
        this.count -= i;
        return bArr;
    }

    private int readLength() {
        int readByte = readByte() & 255;
        if ((readByte & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
            return readByte;
        }
        int i = readByte & 127;
        if (i == 0 || i > 4) {
            return -1;
        }
        int i2 = 0;
        while (i > 0) {
            i2 = (i2 << 8) | (readByte() & 255);
            i--;
        }
        if (i2 < 0) {
            return -1;
        }
        return i2;
    }

    public int available() {
        return this.count;
    }

    public int ignoreNextObject() {
        int readByte = readByte() & 255;
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        readBytes(readLength);
        return readByte;
    }

    public SimpleDERReader readConstructed() {
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001bkm\u001df:\u001ck>JagAk<\u0019j;\u001db;Lb;J7h\u0019bk\u001be:N3=O6nA19\u0019amNehI3oMe:N3mK1jO`:K")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        SimpleDERReader simpleDERReader = new SimpleDERReader(this.buffer, this.pos, readLength);
        this.pos += readLength;
        this.count -= readLength;
        return simpleDERReader;
    }

    public int readConstructedType() {
        int readByte = readByte() & 255;
        if ((readByte & 32) == 32) {
            return readByte & 31;
        }
        throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("AknHbgJ1h\u001bd;O6jOaf\u001ejm\u001adlI1=HkjKajA`n\u001ee=\u001e4jMah\u001c7nO`hI7:\u001ekj\u001c4m\u001c4:\u001cffLa>\u001c`:L7hI3gLfh@1>\u001dbfNbgAelL0o")), readByte));
    }

    public BigInteger readInt() {
        int readByte = readByte() & 255;
        if (readByte != 2) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("AcnM0=AclK3:\u001e3fO49\u001cj;\u001d`<I6=LjjIfhJ3oAbl\u001baoJ`;\u001d4=N1<Ab9I1nHb>N1lIbgNfg\u00194j\u001bef@c<@e=Mk9\u0019bg@jfH3m\u001bdg")), readByte));
        }
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        return new BigInteger(1, readBytes(readLength));
    }

    public byte[] readOctetString() {
        int readByte = readByte() & 255;
        if (readByte != 4 && readByte != 3) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("J1o\u001afk\u001ef9\u001ab=Oki@3jK6<MblK4kA6:HegMc>M3;Lb;H`j\u001c1kN3oM7lO4m\u001b4:K3oLenA6:\u001a6hJkgIjmK7iJ1>N19Kkf\u001e3jMag")), readByte));
        }
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        return readBytes(readLength);
    }

    public String readOid() {
        int readByte = readByte() & 255;
        if (readByte != 6) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("M4oI4n\u001egn@akKkf\u00191o@alIek\u001dao\u00193gNe;N0<O6=\u001b1jK0=@do\u001cdj\u001d3fIkl\u001efk\u001c6fKb<L4oIak\u001delL6l\u001egiId<\u001a1=@c:O3mJ4l")), readByte));
        }
        int readLength = readLength();
        if (readLength < 1 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
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
            j = (j << 7) + (readBytes[i2] & Byte.MAX_VALUE);
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
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("OejAai\u001a6;A4g\u00194<Ja9H4gK0hA6g\u001afk\u001bc<Mf:A`o\u001ak<@3jL7;\u0019aiH7jN6h\u001c69M`l\u001bj9\u001cfnJe>Ndj\u001bd;N`mOa>Ocn\u001909J4;Hgn")), readByte));
        }
        int readLength = readLength();
        if (readLength < 0 || readLength > available()) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H")), readLength, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        return readBytes(readLength);
    }

    public void resetInput(byte[] bArr) {
        resetInput(bArr, 0, bArr.length);
    }

    public void resetInput(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.pos = i;
        this.count = i2;
    }
}
