package dev.epro.r0;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
                int read = stringReader.read(cArr, 0, cArr.length - 1);
                if (read > 0) {
                    int i2 = this.c;
                    int i3 = this.d;
                    int i4 = i2 - i3;
                    this.b = Arrays.copyOfRange(this.b, i3, i2 + read);
                    int i5 = read - 1;
                    if (Character.isHighSurrogate(cArr[i5])) {
                        if (stringReader.read(cArr, read, 1) == -1) {
                            throw new D10953725695458656402(this.f + read, cArr[i5], "The last char is HighSurrogate (no LowSurrogate detected).");
                        }
                        read++;
                    }
                    int i6 = 32;
                    int i7 = 0;
                    while (i7 < read) {
                        int codePointAt = Character.codePointAt(cArr, i7);
                        this.b[i4] = codePointAt;
                        if ((codePointAt < 32 || codePointAt > 126) && codePointAt != 9 && codePointAt != 10 && codePointAt != 13 && codePointAt != 133 && ((codePointAt < 160 || codePointAt > 55295) && ((codePointAt < 57344 || codePointAt > 65533) && (codePointAt < 65536 || codePointAt > 1114111)))) {
                            i7 = read;
                            i6 = codePointAt;
                            i4++;
                        }
                        i7 += Character.charCount(codePointAt);
                        i4++;
                    }
                    this.c = i4;
                    this.d = 0;
                    if (i6 != 32) {
                        throw new D10953725695458656402((this.f + i4) - 1, i6, "special characters are not allowed");
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
        boolean a = a(i);
        int[] iArr = this.b;
        if (a) {
            return new String(iArr, this.d, i);
        }
        int i2 = this.d;
        return new String(iArr, i2, Math.min(i, this.c - i2));
    }

    public final String g(int i) {
        String f = f(i);
        this.d += i;
        this.f += i;
        this.g += i;
        this.i += i;
        return f;
    }
}
