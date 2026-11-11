package p015.p016.p018;

import p015.p016.p017.C0784;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0832 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5159 = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f5160;

    public C0832(String str) {
        C1687.m3701(str);
        this.f5160 = str;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static String m2217(String str) {
        StringBuilder m2108 = C0784.m2108();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || (c != 0 && c == '\\')) {
                m2108.append(c2);
            }
            i++;
            c = c2;
        }
        return m2108.toString();
    }

    public String toString() {
        return this.f5160.substring(this.f5159);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m2218(String str) {
        if (!m2228(str)) {
            return false;
        }
        this.f5159 = str.length() + this.f5159;
        return true;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String m2219(String str) {
        String m2225;
        int indexOf = this.f5160.indexOf(str, this.f5159);
        if (indexOf != -1) {
            m2225 = this.f5160.substring(this.f5159, indexOf);
            this.f5159 = m2225.length() + this.f5159;
        } else {
            m2225 = m2225();
        }
        m2218(str);
        return m2225;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m2220() {
        return this.f5160.length() - this.f5159 == 0;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m2221(String... strArr) {
        for (String str : strArr) {
            if (m2228(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public char m2222() {
        String str = this.f5160;
        int i = this.f5159;
        this.f5159 = i + 1;
        return str.charAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[EDGE_INSN: B:14:0x0078->B:15:0x0078 BREAK  A[LOOP:0: B:2:0x0007->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:2:0x0007->B:23:?, LOOP_END, SYNTHETIC] */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m2223(char r10, char r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L7:
            boolean r7 = r9.m2220()
            if (r7 == 0) goto Lf
            goto L78
        Lf:
            char r7 = r9.m2222()
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            if (r0 == 0) goto L1d
            r8 = 92
            if (r0 == r8) goto L6c
        L1d:
            r8 = 39
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L34
            char r8 = r7.charValue()
            if (r8 == r10) goto L34
            if (r2 != 0) goto L34
            r3 = r3 ^ 1
            goto L4a
        L34:
            r8 = 34
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L4a
            char r8 = r7.charValue()
            if (r8 == r10) goto L4a
            if (r3 != 0) goto L4a
            r2 = r2 ^ 1
        L4a:
            if (r3 != 0) goto L76
            if (r2 == 0) goto L4f
            goto L76
        L4f:
            java.lang.Character r8 = java.lang.Character.valueOf(r10)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L60
            int r4 = r4 + 1
            if (r5 != r1) goto L6c
            int r5 = r9.f5159
            goto L6c
        L60:
            java.lang.Character r8 = java.lang.Character.valueOf(r11)
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L6c
            int r4 = r4 + (-1)
        L6c:
            if (r4 <= 0) goto L72
            if (r0 == 0) goto L72
            int r6 = r9.f5159
        L72:
            char r0 = r7.charValue()
        L76:
            if (r4 > 0) goto L7
        L78:
            if (r6 < 0) goto L81
            java.lang.String r10 = r9.f5160
            java.lang.String r10 = r10.substring(r5, r6)
            goto L83
        L81:
            java.lang.String r10 = ""
        L83:
            if (r4 > 0) goto L86
            return r10
        L86:
            java.lang.String r11 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r10 = p131.p155.p156.p157.C2098.m4187(r11, r10, r0)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r10)
            goto L95
        L94:
            throw r11
        L95:
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0832.m2223(char, char):java.lang.String");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String m2224() {
        int i = this.f5159;
        while (!m2220()) {
            if (!m2229()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!m2220()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break;
                        }
                        if (this.f5160.charAt(this.f5159) == cArr[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.f5159++;
        }
        return this.f5160.substring(i, this.f5159);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String m2225() {
        String str = this.f5160;
        String substring = str.substring(this.f5159, str.length());
        this.f5159 = this.f5160.length();
        return substring;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean m2226() {
        boolean z = false;
        while (true) {
            if (!(!m2220() && C0784.m2113(this.f5160.charAt(this.f5159)))) {
                return z;
            }
            this.f5159++;
            z = true;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2227(String str) {
        if (!m2228(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f5160.length();
        int i = this.f5159;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f5159 = i + length;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m2228(String str) {
        return this.f5160.regionMatches(true, this.f5159, str, 0, str.length());
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m2229() {
        return !m2220() && Character.isLetterOrDigit(this.f5160.charAt(this.f5159));
    }
}
