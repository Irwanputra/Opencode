package dev.epro.r0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M15366967277392692994 extends U8836654130139556418 {
    public static final Logger j = Logger.getLogger(M15366967277392692994.class.getName());
    public static final boolean k = Q4627374422374928592.e;
    public M204440408817344908 e;
    public final byte[] f;
    public final int g;
    public int h;
    public final OutputStream i;

    public M15366967277392692994(int i, OutputStream outputStream) {
        if (i < 0) {
            S10973172697741180971.j("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f = new byte[iMax];
        this.g = iMax;
        if (outputStream != null) {
            this.i = outputStream;
        } else {
            Z3383101362411723454.k("out");
            throw null;
        }
    }

    public static int G(String str) {
        int length;
        try {
            length = L13823942174244016832.b(str);
        } catch (K10122589662513334048 unused) {
            length = str.getBytes(W16701142256148280421.a).length;
        }
        return H(length) + length;
    }

    public static int H(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int I(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void J() {
        this.i.write(this.f, 0, this.h);
        this.h = 0;
    }

    public final void K(int i) {
        if (this.g - this.h < i) {
            J();
        }
    }

    public final void L(int i) {
        int i2 = this.h;
        byte[] bArr = this.f;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.h = i2 + 4;
    }

    public final void M(long j2) {
        int i = this.h;
        byte[] bArr = this.f;
        bArr[i] = (byte) j2;
        bArr[i + 1] = (byte) (j2 >> 8);
        bArr[i + 2] = (byte) (j2 >> 16);
        bArr[i + 3] = (byte) (j2 >> 24);
        bArr[i + 4] = (byte) (j2 >> 32);
        bArr[i + 5] = (byte) (j2 >> 40);
        bArr[i + 6] = (byte) (j2 >> 48);
        bArr[i + 7] = (byte) (j2 >> 56);
        this.h = i + 8;
    }

    public final void N(int i) {
        boolean z = k;
        byte[] bArr = this.f;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.h;
                if (i2 == 0) {
                    this.h = i3 + 1;
                    byte b = (byte) i;
                    Q4627374422374928592.c.n(Q4627374422374928592.f + ((long) i3), bArr, b);
                    return;
                }
                this.h = i3 + 1;
                Q4627374422374928592.c.n(Q4627374422374928592.f + ((long) i3), bArr, (byte) (i | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.h;
                if (i4 == 0) {
                    this.h = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.h = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void O(long j2) {
        boolean z = k;
        byte[] bArr = this.f;
        if (z) {
            while (true) {
                long j3 = j2 & (-128);
                int i = (int) j2;
                int i2 = this.h;
                if (j3 == 0) {
                    this.h = i2 + 1;
                    Q4627374422374928592.c.n(Q4627374422374928592.f + ((long) i2), bArr, (byte) i);
                    return;
                }
                this.h = i2 + 1;
                byte b = (byte) (i | 128);
                Q4627374422374928592.c.n(Q4627374422374928592.f + ((long) i2), bArr, b);
                j2 >>>= 7;
            }
        } else {
            while (true) {
                long j4 = j2 & (-128);
                int i3 = (int) j2;
                int i4 = this.h;
                if (j4 == 0) {
                    this.h = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.h = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j2 >>>= 7;
                }
            }
        }
    }

    public final void P(A10473301933203002473 a10473301933203002473) throws IOException {
        Z(a10473301933203002473.i());
        c0(a10473301933203002473.i(), a10473301933203002473.b);
    }

    public final void Q(int i, int i2) {
        K(14);
        N((i << 3) | 5);
        L(i2);
    }

    public final void R(int i) {
        K(4);
        L(i);
    }

    public final void S(int i, long j2) {
        K(18);
        N((i << 3) | 1);
        M(j2);
    }

    public final void T(long j2) {
        K(8);
        M(j2);
    }

    public final void U(int i, int i2) {
        K(20);
        N(i << 3);
        if (i2 >= 0) {
            N(i2);
        } else {
            O(i2);
        }
    }

    public final void V(int i) {
        if (i >= 0) {
            Z(i);
        } else {
            b0(i);
        }
    }

    public final void W(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iH = H(length);
            int i = iH + length;
            int i2 = this.g;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iA = L13823942174244016832.a(0, length, str, bArr);
                Z(iA);
                c0(iA, bArr);
                return;
            }
            if (i > i2 - this.h) {
                J();
            }
            int iH2 = H(str.length());
            int i3 = this.h;
            byte[] bArr2 = this.f;
            try {
                if (iH2 == iH) {
                    int i4 = i3 + iH2;
                    this.h = i4;
                    int iA2 = L13823942174244016832.a(i4, i2 - i4, str, bArr2);
                    this.h = i3;
                    N((iA2 - i3) - iH2);
                    this.h = iA2;
                } else {
                    int iB = L13823942174244016832.b(str);
                    N(iB);
                    this.h = L13823942174244016832.a(this.h, iB, str, bArr2);
                }
            } catch (K10122589662513334048 e) {
                this.h = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new I8626815837691735180(e2);
            }
        } catch (K10122589662513334048 unused) {
            Level level = Level.WARNING;
            j.getClass();
            byte[] bytes = str.getBytes(W16701142256148280421.a);
            try {
                int length2 = bytes.length;
                Z(length2);
                c0(length2, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new I8626815837691735180(e3);
            }
        }
    }

    public final void X(int i, int i2) {
        Z((i << 3) | i2);
    }

    public final void Y(int i, int i2) {
        K(20);
        N(i << 3);
        N(i2);
    }

    public final void Z(int i) {
        K(5);
        N(i);
    }

    public final void a0(int i, long j2) {
        K(20);
        N(i << 3);
        O(j2);
    }

    public final void b0(long j2) {
        K(10);
        O(j2);
    }

    public final void c0(int i, byte[] bArr) throws IOException {
        int i2 = this.h;
        int i3 = this.g;
        int i4 = i3 - i2;
        byte[] bArr2 = this.f;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, bArr2, i2, i);
            this.h += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i4);
        this.h = i3;
        J();
        int i5 = i - i4;
        if (i5 > i3) {
            this.i.write(bArr, i4, i5);
        } else {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.h = i5;
        }
    }
}
