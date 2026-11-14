package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class D13396727227989475489 implements java.io.Closeable {
    public final java.io.StringReader a;
    public long h;
    public int i;
    public java.lang.String j;
    public int[] k;
    public java.lang.String[] m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f194o = 2;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int l = 1;

    static {
        dev.epro.r0.M10846389789027735899.b = new dev.epro.r0.M10846389789027735899((byte) 15);
    }

    public D13396727227989475489(java.io.StringReader stringReader) {
        int[] iArr = new int[32];
        this.k = iArr;
        iArr[0] = 6;
        this.m = new java.lang.String[32];
        this.n = new int[32];
        this.a = stringReader;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final long A() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        java.lang.String strE;
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.g = 0;
            int[] iArr = this.n;
            int i = this.l - 1;
            iArr[i] = iArr[i] + 1;
            return this.h;
        }
        if (iE == 16) {
            this.j = new java.lang.String(this.b, this.c, this.i);
            this.c += this.i;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw Q("a long");
            }
            if (iE == 10) {
                strE = G();
                this.j = strE;
            } else {
                strE = E(iE == 8 ? '\'' : '\"');
                this.j = strE;
            }
            try {
                long j = java.lang.Long.parseLong(strE);
                this.g = 0;
                int[] iArr2 = this.n;
                int i2 = this.l - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.g = 11;
        double d = java.lang.Double.parseDouble(this.j);
        long j2 = (long) d;
        if (j2 == d) {
            this.j = null;
            this.g = 0;
            int[] iArr3 = this.n;
            int i3 = this.l - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new java.lang.NumberFormatException("Expected a long but was " + this.j + s());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.lang.String B() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        java.lang.String strE;
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strE = G();
        } else if (iE == 12) {
            strE = E('\'');
        } else {
            if (iE != 13) {
                throw Q("a name");
            }
            strE = E('\"');
        }
        this.g = 0;
        this.m[this.l - 1] = strE;
        return strE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C(boolean r10) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.C(boolean):int");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void D() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 7) {
            throw Q("null");
        }
        this.g = 0;
        int[] iArr = this.n;
        int i = this.l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E(char r12) throws dev.epro.r0.H5369259335675503737 {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.lang.String F() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        java.lang.String str;
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = G();
        } else if (iE == 8) {
            str = E('\'');
        } else if (iE == 9) {
            str = E('\"');
        } else if (iE == 11) {
            str = this.j;
            this.j = null;
        } else if (iE == 15) {
            str = java.lang.Long.toString(this.h);
        } else {
            if (iE != 16) {
                throw Q("a string");
            }
            str = new java.lang.String(this.b, this.c, this.i);
            this.c += this.i;
        }
        this.g = 0;
        int[] iArr = this.n;
        int i = this.l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G() throws dev.epro.r0.H5369259335675503737 {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final int H() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
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
                throw new java.lang.AssertionError();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void I(int i) throws dev.epro.r0.H5369259335675503737 {
        int i2 = this.l;
        if (i2 - 1 >= 255) {
            throw new dev.epro.r0.H5369259335675503737("Nesting limit 255 reached".concat(s()));
        }
        int[] iArr = this.k;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.k = java.util.Arrays.copyOf(iArr, i3);
            this.n = java.util.Arrays.copyOf(this.n, i3);
            this.m = (java.lang.String[]) java.util.Arrays.copyOf(this.m, i3);
        }
        int[] iArr2 = this.k;
        int i4 = this.l;
        this.l = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final char J() throws dev.epro.r0.H5369259335675503737 {
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
                                    P("Malformed Unicode escape \\u".concat(new java.lang.String(cArr, this.c, 4)));
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void L(char c) throws dev.epro.r0.H5369259335675503737 {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() throws dev.epro.r0.H5369259335675503737 {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.c
            int r1 = r1 + r0
            int r2 = r3.d
            if (r1 >= r2) goto L4f
            char[] r2 = r3.b
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.d()
        L49:
            int r1 = r3.c
            int r1 = r1 + r0
            r3.c = r1
            return
        L4f:
            r3.c = r1
            r0 = 1
            boolean r0 = r3.j(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.N():void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void O() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int i = 0;
        do {
            int iE = this.g;
            if (iE == 0) {
                iE = e();
            }
            switch (iE) {
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
        int i2 = this.l - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void P(java.lang.String str) throws dev.epro.r0.H5369259335675503737 {
        throw new dev.epro.r0.H5369259335675503737(str + s() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final java.lang.IllegalStateException Q(java.lang.String str) {
        java.lang.String str2 = H() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("Expected ", str, " but was ");
        sbG.append(dev.epro.r0.G11450220448113054352.x(H()));
        sbG.append(s());
        sbG.append("\nSee ");
        sbG.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new java.lang.IllegalStateException(sbG.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void b() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 3) {
            throw Q("BEGIN_ARRAY");
        }
        I(1);
        this.n[this.l - 1] = 0;
        this.g = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void c() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 1) {
            throw Q("BEGIN_OBJECT");
        }
        I(3);
        this.g = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.g = 0;
        this.k[0] = 8;
        this.l = 1;
        this.a.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void d() throws dev.epro.r0.H5369259335675503737 {
        if (this.f194o == 1) {
            return;
        }
        P("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
    
        if (q(r14) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D13396727227989475489.e():int");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void g() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            throw Q("END_ARRAY");
        }
        int i = this.l;
        this.l = i - 1;
        int[] iArr = this.n;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.g = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final void h() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            throw Q("END_OBJECT");
        }
        int i = this.l;
        int i2 = i - 1;
        this.l = i2;
        this.m[i2] = null;
        int[] iArr = this.n;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.g = 0;
    }

    public final boolean j(int i) throws java.io.IOException {
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
            java.lang.System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i8 = this.d;
            int i9 = this.a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.d + i9;
            this.d = i2;
            if (this.e == 0 && (i3 = this.f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final java.lang.String o(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
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
                    java.lang.String str = this.m[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new java.lang.AssertionError(dev.epro.r0.G6547577305291411977.n(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final boolean p() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4 || iE == 17) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final boolean q(char c) throws dev.epro.r0.H5369259335675503737 {
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
                        case ads_mobile_sdk.pd.O0 /* 93 */:
                            return false;
                        case ads_mobile_sdk.pd.N0 /* 92 */:
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

    public final java.lang.String s() {
        java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(this.e + 1, (this.c - this.f) + 1, " at line ", " column ", " path ");
        sbP.append(o(false));
        return sbP.toString();
    }

    public final java.lang.String toString() {
        return dev.epro.r0.D13396727227989475489.class.getSimpleName().concat(s());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final boolean u() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.g = 0;
            int[] iArr = this.n;
            int i = this.l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iE != 6) {
            throw Q("a boolean");
        }
        this.g = 0;
        int[] iArr2 = this.n;
        int i2 = this.l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final double v() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.g = 0;
            int[] iArr = this.n;
            int i = this.l - 1;
            iArr[i] = iArr[i] + 1;
            return this.h;
        }
        if (iE == 16) {
            this.j = new java.lang.String(this.b, this.c, this.i);
            this.c += this.i;
        } else if (iE == 8 || iE == 9) {
            this.j = E(iE == 8 ? '\'' : '\"');
        } else if (iE == 10) {
            this.j = G();
        } else if (iE != 11) {
            throw Q("a double");
        }
        this.g = 11;
        double d = java.lang.Double.parseDouble(this.j);
        if (this.f194o != 1 && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            P("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.j = null;
        this.g = 0;
        int[] iArr2 = this.n;
        int i2 = this.l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final int z() throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        java.lang.String strE;
        int iE = this.g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j = this.h;
            int i = (int) j;
            if (j == i) {
                this.g = 0;
                int[] iArr = this.n;
                int i2 = this.l - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new java.lang.NumberFormatException("Expected an int but was " + this.h + s());
        }
        if (iE == 16) {
            this.j = new java.lang.String(this.b, this.c, this.i);
            this.c += this.i;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw Q("an int");
            }
            if (iE == 10) {
                strE = G();
                this.j = strE;
            } else {
                strE = E(iE == 8 ? '\'' : '\"');
                this.j = strE;
            }
            try {
                int i3 = java.lang.Integer.parseInt(strE);
                this.g = 0;
                int[] iArr2 = this.n;
                int i4 = this.l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.g = 11;
        double d = java.lang.Double.parseDouble(this.j);
        int i5 = (int) d;
        if (i5 == d) {
            this.j = null;
            this.g = 0;
            int[] iArr3 = this.n;
            int i6 = this.l - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new java.lang.NumberFormatException("Expected an int but was " + this.j + s());
    }
}
