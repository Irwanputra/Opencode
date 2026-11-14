package dev.epro.r0;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A5011514514014580540 {
    public static final Logger e = Logger.getLogger(A5011514514014580540.class.getName());
    public static final boolean f = Z3287610729711297369.e;
    public H12843822278061842084 a;
    public final byte[] b;
    public final int c;
    public int d;

    public A5011514514014580540(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            S10973172697741180971.j(E12098517352909843120.l("Array range is invalid. Buffer.length=", bArr.length, i, ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, N17666688112968464504 n17666688112968464504) {
        int e2 = e(i);
        int size = n17666688112968464504.size();
        return f(size) + size + e2;
    }

    public static int b(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int c(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int d(String str) {
        int length;
        try {
            length = V3851199863415612823.a(str);
        } catch (A12427038762635094204 unused) {
            length = str.getBytes(S15638288480382345131.a).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final int h() {
        return this.c - this.d;
    }

    public final void i(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new I8626815837691735180(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void j(int i, boolean z) {
        t(i, 0);
        i(z ? (byte) 1 : (byte) 0);
    }

    public final void k(int i, N17666688112968464504 n17666688112968464504) {
        t(i, 2);
        v(n17666688112968464504.size());
        M18082356575916498704 m18082356575916498704 = (M18082356575916498704) n17666688112968464504;
        r(m18082356575916498704.l(), m18082356575916498704.d, m18082356575916498704.size());
    }

    public final void l(int i, int i2) {
        t(i, 5);
        m(i2);
    }

    public final void m(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new I8626815837691735180(i2, this.c, 4, e2);
        }
    }

    public final void n(int i, long j) {
        t(i, 1);
        o(j);
    }

    public final void o(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new I8626815837691735180(i, this.c, 8, e2);
        }
    }

    public final void p(int i, int i2) {
        t(i, 0);
        q(i2);
    }

    public final void q(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    public final void r(int i, byte[] bArr, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new I8626815837691735180(this.d, this.c, i2, e2);
        }
    }

    public final void s(int i, String str) {
        t(i, 2);
        int i2 = this.d;
        try {
            int f2 = f(str.length() * 3);
            int f3 = f(str.length());
            byte[] bArr = this.b;
            if (f3 != f2) {
                v(V3851199863415612823.a(str));
                this.d = V3851199863415612823.a.i(this.d, h(), str, bArr);
                return;
            }
            int i3 = i2 + f3;
            this.d = i3;
            int i4 = V3851199863415612823.a.i(i3, h(), str, bArr);
            this.d = i2;
            v((i4 - i2) - f3);
            this.d = i4;
        } catch (A12427038762635094204 unused) {
            this.d = i2;
            Level level = Level.WARNING;
            e.getClass();
            byte[] bytes = str.getBytes(S15638288480382345131.a);
            try {
                v(bytes.length);
                r(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new I8626815837691735180(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new I8626815837691735180(e3);
        }
    }

    public final void t(int i, int i2) {
        v((i << 3) | i2);
    }

    public final void u(int i, int i2) {
        t(i, 0);
        v(i2);
    }

    public final void v(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new I8626815837691735180(i2, this.c, 1, e2);
                }
            }
            throw new I8626815837691735180(i2, this.c, 1, e2);
        }
    }

    public final void w(int i, long j) {
        t(i, 0);
        x(j);
    }

    public final void x(long j) {
        int i;
        int i2 = this.d;
        boolean z = f;
        byte[] bArr = this.b;
        if (!z || h() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new I8626815837691735180(i, this.c, 1, e2);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                Z3287610729711297369.l(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            Z3287610729711297369.l(bArr, i2, (byte) j);
        }
        this.d = i;
    }
}
