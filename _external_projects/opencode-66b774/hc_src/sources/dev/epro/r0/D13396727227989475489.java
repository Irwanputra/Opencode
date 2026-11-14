package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class D13396727227989475489 implements Closeable {
    public final StringReader a;
    public long h;
    public int i;
    public String j;
    public int[] k;
    public String[] m;
    public int[] n;

    /* renamed from: o, reason: collision with root package name */
    public int f194o = 2;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int l = 1;

    static {
        M10846389789027735899.b = new M10846389789027735899((byte) 15);
    }

    public D13396727227989475489(StringReader stringReader) {
        int[] iArr = new int[32];
        this.k = iArr;
        iArr[0] = 6;
        this.m = new String[32];
        this.n = new int[32];
        this.a = stringReader;
    }

    public final long A() {
        String E;
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.g = 0;
            int[] iArr = this.n;
            int i2 = this.l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.h;
        }
        if (i == 16) {
            this.j = new String(this.b, this.c, this.i);
            this.c += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Q("a long");
            }
            if (i == 10) {
                E = G();
                this.j = E;
            } else {
                E = E(i == 8 ? '\'' : '\"');
                this.j = E;
            }
            try {
                long parseLong = Long.parseLong(E);
                this.g = 0;
                int[] iArr2 = this.n;
                int i3 = this.l - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.g = 11;
        double parseDouble = Double.parseDouble(this.j);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.j = null;
            this.g = 0;
            int[] iArr3 = this.n;
            int i4 = this.l - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.j + s());
    }

    public final String B() {
        String E;
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 14) {
            E = G();
        } else if (i == 12) {
            E = E('\'');
        } else {
            if (i != 13) {
                throw Q("a name");
            }
            E = E('\"');
        }
        this.g = 0;
        this.m[this.l - 1] = E;
        return E;
    }

    public final int C(boolean z) {
        char c;
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!j(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(s()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char[] cArr = this.b;
            c = cArr[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.c = i3;
                    if (i3 == i2) {
                        this.c = i;
                        boolean j = j(2);
                        this.c++;
                        if (!j) {
                            break;
                        }
                    }
                    d();
                    int i4 = this.c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.c = i4 + 1;
                        while (true) {
                            if (this.c + 2 > this.d && !j(2)) {
                                P("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.c;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.c;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.d;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.e++;
                                this.f = i5 + 1;
                            }
                            this.c++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.c = i4 + 1;
                        M();
                        i = this.c;
                        i2 = this.d;
                    }
                } else {
                    if (c != '#') {
                        this.c = i3;
                        return c;
                    }
                    this.c = i3;
                    d();
                    M();
                    i = this.c;
                    i2 = this.d;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void D() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i != 7) {
            throw Q("null");
        }
        this.g = 0;
        int[] iArr = this.n;
        int i2 = this.l - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.c
            int r3 = r11.d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f194o
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.P(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.J()
            r1.append(r2)
            int r2 = r11.c
            int r3 = r11.d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.e
            int r2 = r2 + r6
            r11.e = r2
            r11.f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.c = r2
            boolean r2 = r11.j(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.P(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.E(char):java.lang.String");
    }

    public final String F() {
        String str;
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 10) {
            str = G();
        } else if (i == 8) {
            str = E('\'');
        } else if (i == 9) {
            str = E('\"');
        } else if (i == 11) {
            str = this.j;
            this.j = null;
        } else if (i == 15) {
            str = Long.toString(this.h);
        } else {
            if (i != 16) {
                throw Q("a string");
            }
            str = new String(this.b, this.c, this.i);
            this.c += this.i;
        }
        this.g = 0;
        int[] iArr = this.n;
        int i2 = this.l - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.c
            int r3 = r3 + r2
            int r4 = r6.d
            char[] r5 = r6.b
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.d()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.j(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.c
            r0.append(r5, r3, r2)
            int r3 = r6.c
            int r3 = r3 + r2
            r6.c = r3
            r2 = 1
            boolean r2 = r6.j(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.c
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.c
            int r2 = r2 + r1
            r6.c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.G():java.lang.String");
    }

    public final int H() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void I(int i) {
        int i2 = this.l;
        if (i2 - 1 >= 255) {
            throw new H5369259335675503737("Nesting limit 255 reached".concat(s()));
        }
        int[] iArr = this.k;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.k = Arrays.copyOf(iArr, i3);
            this.n = Arrays.copyOf(this.n, i3);
            this.m = (String[]) Arrays.copyOf(this.m, i3);
        }
        int[] iArr2 = this.k;
        int i4 = this.l;
        this.l = i4 + 1;
        iArr2[i4] = i;
    }

    public final char J() {
        int i;
        if (this.c == this.d && !j(1)) {
            P("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        char[] cArr = this.b;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            P("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.d && !j(4)) {
                            P("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.c;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    P("Malformed Unicode escape \\u".concat(new String(cArr, this.c, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.c += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f194o == 3) {
            P("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.e++;
        this.f = i3;
        if (this.f194o == 3) {
            P("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void K(int i) {
        if (i == 0) {
            throw null;
        }
        this.f194o = i;
    }

    public final void L(char c) {
        do {
            int i = this.c;
            int i2 = this.d;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.b[i];
                if (c2 == c) {
                    this.c = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.c = i3;
                    J();
                    i = this.c;
                    i2 = this.d;
                } else {
                    if (c2 == '\n') {
                        this.e++;
                        this.f = i3;
                    }
                    i = i3;
                }
            }
            this.c = i;
        } while (j(1));
        P("Unterminated string");
        throw null;
    }

    public final void M() {
        char c;
        do {
            if (this.c >= this.d && !j(1)) {
                return;
            }
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            c = this.b[i];
            if (c == '\n') {
                this.e++;
                this.f = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void N() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.c + i;
                if (i2 < this.d) {
                    char c = this.b[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case pd.O0 /* 93 */:
                                                    break;
                                                case pd.N0 /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.c = i2;
                }
            }
            d();
            this.c += i;
            return;
        } while (j(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void O() {
        int i = 0;
        do {
            int i2 = this.g;
            if (i2 == 0) {
                i2 = e();
            }
            switch (i2) {
                case 1:
                    I(3);
                    i++;
                    this.g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.m[this.l - 1] = null;
                    }
                    this.l--;
                    i--;
                    this.g = 0;
                    break;
                case 3:
                    I(1);
                    i++;
                    this.g = 0;
                    break;
                case 4:
                    this.l--;
                    i--;
                    this.g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.g = 0;
                    break;
                case 8:
                    L('\'');
                    this.g = 0;
                    break;
                case 9:
                    L('\"');
                    this.g = 0;
                    break;
                case 10:
                    N();
                    this.g = 0;
                    break;
                case 12:
                    L('\'');
                    if (i == 0) {
                        this.m[this.l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 13:
                    L('\"');
                    if (i == 0) {
                        this.m[this.l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 14:
                    N();
                    if (i == 0) {
                        this.m[this.l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 16:
                    this.c += this.i;
                    this.g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.n;
        int i3 = this.l - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void P(String str) {
        throw new H5369259335675503737(str + s() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final IllegalStateException Q(String str) {
        String str2 = H() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder g = X2485016533998461232.g("Expected ", str, " but was ");
        g.append(G11450220448113054352.x(H()));
        g.append(s());
        g.append("\nSee ");
        g.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(g.toString());
    }

    public final void b() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i != 3) {
            throw Q("BEGIN_ARRAY");
        }
        I(1);
        this.n[this.l - 1] = 0;
        this.g = 0;
    }

    public final void c() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i != 1) {
            throw Q("BEGIN_OBJECT");
        }
        I(3);
        this.g = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g = 0;
        this.k[0] = 8;
        this.l = 1;
        this.a.close();
    }

    public final void d() {
        if (this.f194o == 1) {
            return;
        }
        P("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0222, code lost:
    
        if (q(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a6, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0227, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023a, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023c, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023f, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0240, code lost:
    
        r26.h = r4;
        r26.c += r2;
        r9 = 15;
        r26.g = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0232, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024c, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024f, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0252, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        r26.i = r2;
        r9 = 16;
        r26.g = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.e():int");
    }

    public final void g() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i != 4) {
            throw Q("END_ARRAY");
        }
        int i2 = this.l;
        this.l = i2 - 1;
        int[] iArr = this.n;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.g = 0;
    }

    public final void h() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i != 2) {
            throw Q("END_OBJECT");
        }
        int i2 = this.l;
        int i3 = i2 - 1;
        this.l = i3;
        this.m[i3] = null;
        int[] iArr = this.n;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.g = 0;
    }

    public final boolean j(int i) {
        int i2;
        int i3;
        int i4 = this.f;
        int i5 = this.c;
        this.f = i4 - i5;
        int i6 = this.d;
        char[] cArr = this.b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i8 = this.d;
            int read = this.a.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.d + read;
            this.d = i2;
            if (this.e == 0 && (i3 = this.f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String o(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.k[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.n[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.m[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(G6547577305291411977.n(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    public final boolean p() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean q(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case pd.O0 /* 93 */:
                            return false;
                        case pd.N0 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public final String s() {
        StringBuilder p = E12098517352909843120.p(this.e + 1, (this.c - this.f) + 1, " at line ", " column ", " path ");
        p.append(o(false));
        return p.toString();
    }

    public final String toString() {
        return D13396727227989475489.class.getSimpleName().concat(s());
    }

    public final boolean u() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 5) {
            this.g = 0;
            int[] iArr = this.n;
            int i2 = this.l - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw Q("a boolean");
        }
        this.g = 0;
        int[] iArr2 = this.n;
        int i3 = this.l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double v() {
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.g = 0;
            int[] iArr = this.n;
            int i2 = this.l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.h;
        }
        if (i == 16) {
            this.j = new String(this.b, this.c, this.i);
            this.c += this.i;
        } else if (i == 8 || i == 9) {
            this.j = E(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.j = G();
        } else if (i != 11) {
            throw Q("a double");
        }
        this.g = 11;
        double parseDouble = Double.parseDouble(this.j);
        if (this.f194o != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            P("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.j = null;
        this.g = 0;
        int[] iArr2 = this.n;
        int i3 = this.l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int z() {
        String E;
        int i = this.g;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            long j = this.h;
            int i2 = (int) j;
            if (j == i2) {
                this.g = 0;
                int[] iArr = this.n;
                int i3 = this.l - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.h + s());
        }
        if (i == 16) {
            this.j = new String(this.b, this.c, this.i);
            this.c += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Q("an int");
            }
            if (i == 10) {
                E = G();
                this.j = E;
            } else {
                E = E(i == 8 ? '\'' : '\"');
                this.j = E;
            }
            try {
                int parseInt = Integer.parseInt(E);
                this.g = 0;
                int[] iArr2 = this.n;
                int i4 = this.l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.g = 11;
        double parseDouble = Double.parseDouble(this.j);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.j = null;
            this.g = 0;
            int[] iArr3 = this.n;
            int i6 = this.l - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.j + s());
    }
}
