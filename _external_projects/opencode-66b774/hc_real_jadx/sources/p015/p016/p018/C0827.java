package p015.p016.p018;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p015.p016.C0783;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0827 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final String[] f5134 = new String[512];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Reader f5135;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f5136;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f5137;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final char[] f5138;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f5139;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f5140;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f5141;

    public C0827(Reader reader, int i) {
        C1687.m3701(reader);
        C1687.m3722(reader.markSupported());
        this.f5135 = reader;
        this.f5138 = new char[i > 32768 ? 32768 : i];
        m2194();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2192(char[] r9, java.lang.String[] r10, int r11, int r12) {
        /*
            r0 = 12
            if (r12 <= r0) goto La
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9, r11, r12)
            return r10
        La:
            r0 = 1
            if (r12 >= r0) goto L10
            java.lang.String r9 = ""
            return r9
        L10:
            r1 = 0
            r4 = r11
            r2 = 0
            r3 = 0
        L14:
            if (r2 >= r12) goto L21
            int r3 = r3 * 31
            int r5 = r4 + 1
            char r4 = r9[r4]
            int r3 = r3 + r4
            int r2 = r2 + 1
            r4 = r5
            goto L14
        L21:
            int r2 = r10.length
            int r2 = r2 - r0
            r2 = r2 & r3
            r3 = r10[r2]
            if (r3 != 0) goto L30
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r2] = r0
            goto L59
        L30:
            int r4 = r3.length()
            if (r12 != r4) goto L4e
            r5 = r11
            r4 = r12
            r6 = 0
        L39:
            int r7 = r4 + (-1)
            if (r4 == 0) goto L4f
            int r4 = r5 + 1
            char r5 = r9[r5]
            int r8 = r6 + 1
            char r6 = r3.charAt(r6)
            if (r5 == r6) goto L4a
            goto L4e
        L4a:
            r5 = r4
            r4 = r7
            r6 = r8
            goto L39
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L52
            return r3
        L52:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9, r11, r12)
            r10[r2] = r0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0827.m2192(char[], java.lang.String[], int, int):java.lang.String");
    }

    public String toString() {
        char[] cArr = this.f5138;
        int i = this.f5139;
        return new String(cArr, i, this.f5137 - i);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String m2193(char... cArr) {
        m2194();
        int i = this.f5139;
        int i2 = this.f5137;
        char[] cArr2 = this.f5138;
        while (true) {
            int i3 = this.f5139;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f5139++;
        }
        int i4 = this.f5139;
        return i4 > i ? m2192(this.f5138, this.f5134, i, i4 - i) : "";
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m2194() {
        int i = this.f5139;
        if (i < this.f5141) {
            return;
        }
        try {
            this.f5135.skip(i);
            this.f5135.mark(32768);
            int read = this.f5135.read(this.f5138);
            this.f5135.reset();
            if (read != -1) {
                this.f5137 = read;
                this.f5140 += this.f5139;
                this.f5139 = 0;
                this.f5136 = 0;
                if (read > 24576) {
                    read = 24576;
                }
                this.f5141 = read;
            }
        } catch (IOException e) {
            throw new C0783(e);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String m2195(char... cArr) {
        m2194();
        int i = this.f5139;
        int i2 = this.f5137;
        char[] cArr2 = this.f5138;
        loop0: while (this.f5139 < i2) {
            for (char c : cArr) {
                if (cArr2[this.f5139] == c) {
                    break loop0;
                }
            }
            this.f5139++;
        }
        int i3 = this.f5139;
        return i3 > i ? m2192(this.f5138, this.f5134, i, i3 - i) : "";
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public char m2196() {
        m2194();
        if (m2204()) {
            return (char) 65535;
        }
        return this.f5138[this.f5139];
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m2197(char... cArr) {
        if (m2211()) {
            return false;
        }
        m2194();
        char c = this.f5138[this.f5139];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean m2198() {
        if (m2211()) {
            return false;
        }
        char c = this.f5138[this.f5139];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m2199(char c) {
        return !m2211() && this.f5138[this.f5139] == c;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2200() {
        this.f5139++;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m2201() {
        this.f5139--;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int m2202(CharSequence charSequence) {
        m2194();
        char charAt = charSequence.charAt(0);
        int i = this.f5139;
        while (i < this.f5137) {
            if (charAt != this.f5138[i]) {
                do {
                    i++;
                    if (i >= this.f5137) {
                        break;
                    }
                } while (charAt != this.f5138[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f5137;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f5138[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f5139;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String m2203() {
        char c;
        m2194();
        int i = this.f5139;
        while (true) {
            int i2 = this.f5139;
            if (i2 >= this.f5137 || (((c = this.f5138[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f5139++;
        }
        return m2192(this.f5138, this.f5134, i, this.f5139 - i);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final boolean m2204() {
        return this.f5139 >= this.f5137;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m2205(char c) {
        int i;
        m2194();
        int i2 = this.f5139;
        while (true) {
            if (i2 >= this.f5137) {
                i = -1;
                break;
            }
            if (c == this.f5138[i2]) {
                i = i2 - this.f5139;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return m2210();
        }
        String m2192 = m2192(this.f5138, this.f5134, this.f5139, i);
        this.f5139 += i;
        return m2192;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2206(java.lang.String r8) {
        /*
            r7 = this;
            r7.m2194()
            r7.m2194()
            int r0 = r8.length()
            int r1 = r7.f5137
            int r2 = r7.f5139
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.f5138
            int r6 = r7.f5139
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.f5139
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f5139 = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0827.m2206(java.lang.String):boolean");
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int m2207() {
        return this.f5140 + this.f5139;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public char m2208() {
        m2194();
        char c = m2204() ? (char) 65535 : this.f5138[this.f5139];
        this.f5139++;
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2209(java.lang.String r8) {
        /*
            r7 = this;
            r7.m2194()
            int r0 = r8.length()
            int r1 = r7.f5137
            int r2 = r7.f5139
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.f5138
            int r6 = r7.f5139
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.f5139
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f5139 = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0827.m2209(java.lang.String):boolean");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String m2210() {
        m2194();
        char[] cArr = this.f5138;
        String[] strArr = this.f5134;
        int i = this.f5139;
        String m2192 = m2192(cArr, strArr, i, this.f5137 - i);
        this.f5139 = this.f5137;
        return m2192;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m2211() {
        m2194();
        return this.f5139 >= this.f5137;
    }
}
