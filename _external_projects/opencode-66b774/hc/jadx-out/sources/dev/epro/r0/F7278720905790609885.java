package dev.epro.r0;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F7278720905790609885 {
    public final StringReader a;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int[] b = new int[0];
    public int c = 0;
    public boolean e = false;
    public final char[] j = new char[1024];

    public F7278720905790609885(StringReader stringReader) {
        this.a = stringReader;
    }

    public final boolean a(int i) {
        if (!this.e && this.d + i >= this.c) {
            StringReader stringReader = this.a;
            char[] cArr = this.j;
            try {
                int i2 = stringReader.read(cArr, 0, cArr.length - 1);
                if (i2 > 0) {
                    int i3 = this.c;
                    int i4 = this.d;
                    int i5 = i3 - i4;
                    this.b = Arrays.copyOfRange(this.b, i4, i3 + i2);
                    int i6 = i2 - 1;
                    if (Character.isHighSurrogate(cArr[i6])) {
                        if (stringReader.read(cArr, i2, 1) == -1) {
                            throw new D10953725695458656402(this.f + i2, cArr[i6], "The last char is HighSurrogate (no LowSurrogate detected).");
                        }
                        i2++;
                    }
                    int i7 = 32;
                    int iCharCount = 0;
                    while (iCharCount < i2) {
                        int iCodePointAt = Character.codePointAt(cArr, iCharCount);
                        this.b[i5] = iCodePointAt;
                        if ((iCodePointAt >= 32 && iCodePointAt <= 126) || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 13 || iCodePointAt == 133 || ((iCodePointAt >= 160 && iCodePointAt <= 55295) || ((iCodePointAt >= 57344 && iCodePointAt <= 65533) || (iCodePointAt >= 65536 && iCodePointAt <= 1114111)))) {
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            iCharCount = i2;
                            i7 = iCodePointAt;
                        }
                        i5++;
                    }
                    this.c = i5;
                    this.d = 0;
                    if (i7 != 32) {
                        throw new D10953725695458656402((this.f + i5) - 1, i7, "special characters are not allowed");
                    }
                } else {
                    this.e = true;
                }
            } catch (IOException e) {
                throw new M8821877208104636290(e);
            }
        }
        return this.d + i < this.c;
    }

    public final void b(int i) {
        for (int i2 = 0; i2 < i && a(0); i2++) {
            int[] iArr = this.b;
            int i3 = this.d;
            this.d = i3 + 1;
            int i4 = iArr[i3];
            this.f++;
            this.g++;
            if (P14266383314427251510.d.a(i4) || (i4 == 13 && a(0) && this.b[this.d] != 10)) {
                this.h++;
                this.i = 0;
            } else if (i4 != 65279) {
                this.i++;
            }
        }
    }

    public final F16470721565862751885 c() {
        return new F16470721565862751885(this.h, this.i, this.b, this.d);
    }

    public final int d() {
        if (a(0)) {
            return this.b[this.d];
        }
        return 0;
    }

    public final int e(int i) {
        if (a(i)) {
            return this.b[this.d + i];
        }
        return 0;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        boolean zA = a(i);
        int[] iArr = this.b;
        if (zA) {
            return new String(iArr, this.d, i);
        }
        int i2 = this.d;
        return new String(iArr, i2, Math.min(i, this.c - i2));
    }

    public final String g(int i) {
        String strF = f(i);
        this.d += i;
        this.f += i;
        this.g += i;
        this.i += i;
        return strF;
    }
}
