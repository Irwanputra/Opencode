package dev.epro.r0;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P5176232750190581838 implements J6206369225411265287, U14714184180717932172, Cloneable, ByteChannel {
    public P5586796822028136504 a;
    public long b;

    public final void A(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        E12775674050813925581.t(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            P5586796822028136504 p5586796822028136504Z = z(1);
            int iMin = Math.min(i - i2, 8192 - p5586796822028136504Z.c);
            int i3 = i2 + iMin;
            O5378677881740157249.o0(p5586796822028136504Z.c, i2, bArr, i3, p5586796822028136504Z.a);
            p5586796822028136504Z.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final void B(P5124777957357031757 p5124777957357031757) {
        p5124777957357031757.getClass();
        p5124777957357031757.m(this, p5124777957357031757.b());
    }

    public final void C(S7370861580758580261 s7370861580758580261) {
        s7370861580758580261.getClass();
        while (s7370861580758580261.m(this, 8192L) != -1) {
        }
    }

    public final void D(int i) {
        P5586796822028136504 p5586796822028136504Z = z(1);
        byte[] bArr = p5586796822028136504Z.a;
        int i2 = p5586796822028136504Z.c;
        p5586796822028136504Z.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void E(long j) {
        boolean z;
        if (j == 0) {
            D(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                I("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = Y6921797927338498306.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > Y6921797927338498306.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        P5586796822028136504 p5586796822028136504Z = z(i);
        byte[] bArr2 = p5586796822028136504Z.a;
        int i2 = p5586796822028136504Z.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = Y6921797927338498306.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        p5586796822028136504Z.c += i;
        this.b += (long) i;
    }

    public final void F(long j) {
        if (j == 0) {
            D(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        P5586796822028136504 p5586796822028136504Z = z(i);
        byte[] bArr = p5586796822028136504Z.a;
        int i2 = p5586796822028136504Z.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = Y6921797927338498306.a[(int) (15 & j)];
            j >>>= 4;
        }
        p5586796822028136504Z.c += i;
        this.b += (long) i;
    }

    public final void G(int i) {
        P5586796822028136504 p5586796822028136504Z = z(4);
        byte[] bArr = p5586796822028136504Z.a;
        int i2 = p5586796822028136504Z.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        p5586796822028136504Z.c = i2 + 4;
        this.b += 4;
    }

    public final void H(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            S10973172697741180971.i(E12098517352909843120.l("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbQ = E12098517352909843120.q(i2, "endIndex > string.length: ", " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                P5586796822028136504 p5586796822028136504Z = z(1);
                byte[] bArr = p5586796822028136504Z.a;
                int i3 = p5586796822028136504Z.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = p5586796822028136504Z.c;
                int i6 = (i3 + i) - i5;
                p5586796822028136504Z.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    P5586796822028136504 p5586796822028136504Z2 = z(2);
                    byte[] bArr2 = p5586796822028136504Z2.a;
                    int i7 = p5586796822028136504Z2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    p5586796822028136504Z2.c = i7 + 2;
                    this.b += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        D(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        P5586796822028136504 p5586796822028136504Z3 = z(4);
                        byte[] bArr3 = p5586796822028136504Z3.a;
                        int i10 = p5586796822028136504Z3.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        p5586796822028136504Z3.c = i10 + 4;
                        this.b += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    P5586796822028136504 p5586796822028136504Z4 = z(3);
                    byte[] bArr4 = p5586796822028136504Z4.a;
                    int i11 = p5586796822028136504Z4.c;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    p5586796822028136504Z4.c = i11 + 3;
                    this.b += 3;
                } else {
                    D(63);
                }
                i++;
            }
        }
    }

    public final void I(String str) {
        str.getClass();
        H(0, str.length(), str);
    }

    public final void J(int i) {
        if (i < 128) {
            D(i);
            return;
        }
        if (i < 2048) {
            P5586796822028136504 p5586796822028136504Z = z(2);
            byte[] bArr = p5586796822028136504Z.a;
            int i2 = p5586796822028136504Z.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            p5586796822028136504Z.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            D(63);
            return;
        }
        if (i < 65536) {
            P5586796822028136504 p5586796822028136504Z2 = z(3);
            byte[] bArr2 = p5586796822028136504Z2.a;
            int i3 = p5586796822028136504Z2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            p5586796822028136504Z2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            S10973172697741180971.j("Unexpected code point: 0x".concat(E12775674050813925581.M(i)));
            return;
        }
        P5586796822028136504 p5586796822028136504Z3 = z(4);
        byte[] bArr3 = p5586796822028136504Z3.a;
        int i4 = p5586796822028136504Z3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        p5586796822028136504Z3.c = i4 + 4;
        this.b += 4;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return O12329764647113144543.d;
    }

    public final void b() throws EOFException {
        u(this.b);
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final Object clone() {
        P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
        if (this.b == 0) {
            return p5176232750190581838;
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        P5586796822028136504 p5586796822028136504C = p5586796822028136504.c();
        p5176232750190581838.a = p5586796822028136504C;
        p5586796822028136504C.g = p5586796822028136504C;
        p5586796822028136504C.f = p5586796822028136504C;
        for (P5586796822028136504 p55867968220281365042 = p5586796822028136504.f; p55867968220281365042 != p5586796822028136504; p55867968220281365042 = p55867968220281365042.f) {
            P5586796822028136504 p55867968220281365043 = p5586796822028136504C.g;
            p55867968220281365043.getClass();
            p55867968220281365042.getClass();
            p55867968220281365043.b(p55867968220281365042.c());
        }
        p5176232750190581838.b = this.b;
        return p5176232750190581838;
    }

    public final byte d(long j) {
        E12775674050813925581.t(this.b, j, 1L);
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                p5586796822028136504 = p5586796822028136504.g;
                p5586796822028136504.getClass();
                j2 -= (long) (p5586796822028136504.c - p5586796822028136504.b);
            }
            return p5586796822028136504.a[(int) ((((long) p5586796822028136504.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = p5586796822028136504.c;
            int i2 = p5586796822028136504.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return p5586796822028136504.a[(int) ((((long) i2) + j) - j3)];
            }
            p5586796822028136504 = p5586796822028136504.f;
            p5586796822028136504.getClass();
            j3 = j4;
        }
    }

    public final byte e() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        int i = p5586796822028136504.b;
        int i2 = p5586796822028136504.c;
        int i3 = i + 1;
        byte b = p5586796822028136504.a[i];
        this.b--;
        if (i3 != i2) {
            p5586796822028136504.b = i3;
            return b;
        }
        this.a = p5586796822028136504.a();
        B14689168980551717317.a(p5586796822028136504);
        return b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P5176232750190581838)) {
            return false;
        }
        long j = this.b;
        P5176232750190581838 p5176232750190581838 = (P5176232750190581838) obj;
        if (j != p5176232750190581838.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        P5586796822028136504 p55867968220281365042 = p5176232750190581838.a;
        p55867968220281365042.getClass();
        int i = p5586796822028136504.b;
        int i2 = p55867968220281365042.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(p5586796822028136504.c - i, p55867968220281365042.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (p5586796822028136504.a[i] != p55867968220281365042.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == p5586796822028136504.c) {
                p5586796822028136504 = p5586796822028136504.f;
                p5586796822028136504.getClass();
                i = p5586796822028136504.b;
            }
            if (i2 == p55867968220281365042.c) {
                p55867968220281365042 = p55867968220281365042.f;
                p55867968220281365042.getClass();
                i2 = p55867968220281365042.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final byte[] g(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    public final P5124777957357031757 h(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new P5124777957357031757(g(j));
        }
        P5124777957357031757 p5124777957357031757V = v((int) j);
        u(j);
        return p5124777957357031757V;
    }

    public final int hashCode() {
        P5586796822028136504 p5586796822028136504 = this.a;
        if (p5586796822028136504 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = p5586796822028136504.c;
            for (int i3 = p5586796822028136504.b; i3 < i2; i3++) {
                i = (i * 31) + p5586796822028136504.a[i3];
            }
            p5586796822028136504 = p5586796822028136504.f;
            p5586796822028136504.getClass();
        } while (p5586796822028136504 != this.a);
        return i;
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final int i(P12327795811052477724 p12327795811052477724) throws EOFException {
        p12327795811052477724.getClass();
        int iB = Y6921797927338498306.b(this, p12327795811052477724, false);
        if (iB == -1) {
            return -1;
        }
        u(p12327795811052477724.a[iB].b());
        return iB;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            dev.epro.r0.P5586796822028136504 r7 = r15.a
            r7.getClass()
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            dev.epro.r0.P5176232750190581838 r15 = new dev.epro.r0.P5176232750190581838
            r15.<init>()
            r15.F(r4)
            r15.D(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.s()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = dev.epro.r0.E18444280280170001567.a
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L8e:
            if (r9 != r10) goto L9a
            dev.epro.r0.P5586796822028136504 r8 = r7.a()
            r15.a = r8
            dev.epro.r0.B14689168980551717317.a(r7)
            goto L9c
        L9a:
            r7.b = r9
        L9c:
            if (r6 != 0) goto La2
            dev.epro.r0.P5586796822028136504 r7 = r15.a
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.b = r2
            return r4
        La9:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P5176232750190581838.j():long");
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final byte[] k() {
        return g(this.b);
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        if (j < 0) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        p5176232750190581838.y(this, j);
        return j;
    }

    public final int o() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        int i = p5586796822028136504.b;
        int i2 = p5586796822028136504.c;
        if (i2 - i < 4) {
            return (e() & 255) | ((e() & 255) << 24) | ((e() & 255) << 16) | ((e() & 255) << 8);
        }
        byte[] bArr = p5586796822028136504.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            p5586796822028136504.b = i5;
            return i6;
        }
        this.a = p5586796822028136504.a();
        B14689168980551717317.a(p5586796822028136504);
        return i6;
    }

    public final short p() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        int i = p5586796822028136504.b;
        int i2 = p5586796822028136504.c;
        if (i2 - i < 2) {
            return (short) ((e() & 255) | ((e() & 255) << 8));
        }
        byte[] bArr = p5586796822028136504.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = p5586796822028136504.a();
            B14689168980551717317.a(p5586796822028136504);
        } else {
            p5586796822028136504.b = i5;
        }
        return (short) i6;
    }

    public final String q(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        p5586796822028136504.getClass();
        int i = p5586796822028136504.b;
        if (((long) i) + j > p5586796822028136504.c) {
            return new String(g(j), charset);
        }
        int i2 = (int) j;
        String str = new String(p5586796822028136504.a, i, i2, charset);
        int i3 = p5586796822028136504.b + i2;
        p5586796822028136504.b = i3;
        this.b -= j;
        if (i3 == p5586796822028136504.c) {
            this.a = p5586796822028136504.a();
            B14689168980551717317.a(p5586796822028136504);
        }
        return str;
    }

    public final int read(byte[] bArr, int i, int i2) {
        E12775674050813925581.t(bArr.length, i, i2);
        P5586796822028136504 p5586796822028136504 = this.a;
        if (p5586796822028136504 == null) {
            return -1;
        }
        int iMin = Math.min(i2, p5586796822028136504.c - p5586796822028136504.b);
        byte[] bArr2 = p5586796822028136504.a;
        int i3 = p5586796822028136504.b;
        O5378677881740157249.o0(i, i3, bArr2, i3 + iMin, bArr);
        int i4 = p5586796822028136504.b + iMin;
        p5586796822028136504.b = i4;
        this.b -= (long) iMin;
        if (i4 == p5586796822028136504.c) {
            this.a = p5586796822028136504.a();
            B14689168980551717317.a(p5586796822028136504);
        }
        return iMin;
    }

    public final String s() {
        return q(this.b, F16059529287866721367.a);
    }

    @Override // dev.epro.r0.U14714184180717932172
    public final /* bridge */ /* synthetic */ U14714184180717932172 t(String str) {
        I(str);
        return this;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return v((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u(long j) throws EOFException {
        while (j > 0) {
            P5586796822028136504 p5586796822028136504 = this.a;
            if (p5586796822028136504 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, p5586796822028136504.c - p5586796822028136504.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = p5586796822028136504.b + iMin;
            p5586796822028136504.b = i;
            if (i == p5586796822028136504.c) {
                this.a = p5586796822028136504.a();
                B14689168980551717317.a(p5586796822028136504);
            }
        }
    }

    public final P5124777957357031757 v(int i) {
        if (i == 0) {
            return P5124777957357031757.d;
        }
        E12775674050813925581.t(this.b, 0L, i);
        P5586796822028136504 p5586796822028136504 = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            p5586796822028136504.getClass();
            int i5 = p5586796822028136504.c;
            int i6 = p5586796822028136504.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            p5586796822028136504 = p5586796822028136504.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        P5586796822028136504 p55867968220281365042 = this.a;
        int i7 = 0;
        while (i2 < i) {
            p55867968220281365042.getClass();
            bArr[i7] = p55867968220281365042.a;
            i2 += p55867968220281365042.c - p55867968220281365042.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = p55867968220281365042.b;
            p55867968220281365042.d = true;
            i7++;
            p55867968220281365042 = p55867968220281365042.f;
        }
        return new F5390871378632077601(bArr, iArr);
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final String w(Charset charset) {
        charset.getClass();
        return q(this.b, charset);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            P5586796822028136504 p5586796822028136504Z = z(1);
            int iMin = Math.min(i, 8192 - p5586796822028136504Z.c);
            byteBuffer.get(p5586796822028136504Z.a, p5586796822028136504Z.c, iMin);
            i -= iMin;
            p5586796822028136504Z.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final InputStream x() {
        return new Z2424751835619950177(this, (byte) 0);
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        P5586796822028136504 p5586796822028136504B;
        p5176232750190581838.getClass();
        if (p5176232750190581838 == this) {
            S10973172697741180971.j("source == this");
            return;
        }
        E12775674050813925581.t(p5176232750190581838.b, 0L, j);
        while (j > 0) {
            P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
            p5586796822028136504.getClass();
            int i = p5586796822028136504.c;
            P5586796822028136504 p55867968220281365042 = p5176232750190581838.a;
            p55867968220281365042.getClass();
            long j2 = i - p55867968220281365042.b;
            int i2 = 0;
            if (j < j2) {
                P5586796822028136504 p55867968220281365043 = this.a;
                P5586796822028136504 p55867968220281365044 = p55867968220281365043 != null ? p55867968220281365043.g : null;
                if (p55867968220281365044 != null && p55867968220281365044.e) {
                    if ((((long) p55867968220281365044.c) + j) - ((long) (p55867968220281365044.d ? 0 : p55867968220281365044.b)) <= 8192) {
                        P5586796822028136504 p55867968220281365045 = p5176232750190581838.a;
                        p55867968220281365045.getClass();
                        p55867968220281365045.d(p55867968220281365044, (int) j);
                        p5176232750190581838.b -= j;
                        this.b += j;
                        return;
                    }
                }
                P5586796822028136504 p55867968220281365046 = p5176232750190581838.a;
                p55867968220281365046.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > p55867968220281365046.c - p55867968220281365046.b) {
                    S10973172697741180971.j("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    p5586796822028136504B = p55867968220281365046.c();
                } else {
                    p5586796822028136504B = B14689168980551717317.b();
                    byte[] bArr = p55867968220281365046.a;
                    byte[] bArr2 = p5586796822028136504B.a;
                    int i4 = p55867968220281365046.b;
                    O5378677881740157249.t0(0, bArr, i4, bArr2, i4 + i3, 2);
                }
                p5586796822028136504B.c = p5586796822028136504B.b + i3;
                p55867968220281365046.b += i3;
                P5586796822028136504 p55867968220281365047 = p55867968220281365046.g;
                p55867968220281365047.getClass();
                p55867968220281365047.b(p5586796822028136504B);
                p5176232750190581838.a = p5586796822028136504B;
            }
            P5586796822028136504 p55867968220281365048 = p5176232750190581838.a;
            p55867968220281365048.getClass();
            long j3 = p55867968220281365048.c - p55867968220281365048.b;
            p5176232750190581838.a = p55867968220281365048.a();
            P5586796822028136504 p55867968220281365049 = this.a;
            if (p55867968220281365049 == null) {
                this.a = p55867968220281365048;
                p55867968220281365048.g = p55867968220281365048;
                p55867968220281365048.f = p55867968220281365048;
            } else {
                P5586796822028136504 p558679682202813650410 = p55867968220281365049.g;
                p558679682202813650410.getClass();
                p558679682202813650410.b(p55867968220281365048);
                P5586796822028136504 p558679682202813650411 = p55867968220281365048.g;
                if (p558679682202813650411 == p55867968220281365048) {
                    S10973172697741180971.m("cannot compact");
                    return;
                }
                p558679682202813650411.getClass();
                if (p558679682202813650411.e) {
                    int i5 = p55867968220281365048.c - p55867968220281365048.b;
                    P5586796822028136504 p558679682202813650412 = p55867968220281365048.g;
                    p558679682202813650412.getClass();
                    int i6 = 8192 - p558679682202813650412.c;
                    P5586796822028136504 p558679682202813650413 = p55867968220281365048.g;
                    p558679682202813650413.getClass();
                    if (!p558679682202813650413.d) {
                        P5586796822028136504 p558679682202813650414 = p55867968220281365048.g;
                        p558679682202813650414.getClass();
                        i2 = p558679682202813650414.b;
                    }
                    if (i5 <= i6 + i2) {
                        P5586796822028136504 p558679682202813650415 = p55867968220281365048.g;
                        p558679682202813650415.getClass();
                        p55867968220281365048.d(p558679682202813650415, i5);
                        p55867968220281365048.a();
                        B14689168980551717317.a(p55867968220281365048);
                    }
                }
            }
            p5176232750190581838.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    public final P5586796822028136504 z(int i) {
        if (i < 1 || i > 8192) {
            S10973172697741180971.j("unexpected capacity");
            return null;
        }
        P5586796822028136504 p5586796822028136504 = this.a;
        if (p5586796822028136504 == null) {
            P5586796822028136504 p5586796822028136504B = B14689168980551717317.b();
            this.a = p5586796822028136504B;
            p5586796822028136504B.g = p5586796822028136504B;
            p5586796822028136504B.f = p5586796822028136504B;
            return p5586796822028136504B;
        }
        P5586796822028136504 p55867968220281365042 = p5586796822028136504.g;
        p55867968220281365042.getClass();
        if (p55867968220281365042.c + i <= 8192 && p55867968220281365042.e) {
            return p55867968220281365042;
        }
        P5586796822028136504 p5586796822028136504B2 = B14689168980551717317.b();
        p55867968220281365042.b(p5586796822028136504B2);
        return p5586796822028136504B2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        P5586796822028136504 p5586796822028136504 = this.a;
        if (p5586796822028136504 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), p5586796822028136504.c - p5586796822028136504.b);
        byteBuffer.put(p5586796822028136504.a, p5586796822028136504.b, iMin);
        int i = p5586796822028136504.b + iMin;
        p5586796822028136504.b = i;
        this.b -= (long) iMin;
        if (i == p5586796822028136504.c) {
            this.a = p5586796822028136504.a();
            B14689168980551717317.a(p5586796822028136504);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, dev.epro.r0.U10510841700634832156
    public final void close() {
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final void flush() {
    }
}
