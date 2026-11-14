package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xu extends ads_mobile_sdk.yu {
    public final byte[] b;
    public final int c;
    public int d;
    public final java.io.OutputStream e;

    public xu(int i, java.io.OutputStream outputStream) {
        this.e = outputStream;
        if (i < 0) {
            dev.epro.r0.S10973172697741180971.j("bufferSize must be >= 0");
            throw null;
        }
        int iMax = java.lang.Math.max(i, 20);
        this.b = new byte[iMax];
        this.c = iMax;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(java.lang.String str) throws dev.epro.r0.I8626815837691735180, java.io.IOException {
        int length = str.length() * 3;
        int i = ads_mobile_sdk.yu.i(length);
        int i2 = i + length;
        int i3 = this.c;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iA = ads_mobile_sdk.vn3.a.a(0, length, str, bArr);
            p(5);
            o(iA);
            b(0, bArr, iA);
            return;
        }
        int i4 = this.d;
        int i5 = i3 - i4;
        byte[] bArr2 = this.b;
        if (i2 > i5) {
            this.e.write(bArr2, 0, i4);
            this.d = 0;
        }
        int i6 = ads_mobile_sdk.yu.i(str.length());
        int i7 = this.d;
        try {
            if (i6 != i) {
                dev.epro.r0.O17574792317020433029 o17574792317020433029 = ads_mobile_sdk.vn3.a;
                int iA2 = o17574792317020433029.a(str);
                o(iA2);
                this.d = o17574792317020433029.a(this.d, iA2, str, bArr2);
                return;
            }
            int i8 = i7 + i6;
            this.d = i8;
            int iA3 = ads_mobile_sdk.vn3.a.a(i8, i3 - i8, str, bArr2);
            this.d = i7;
            o((iA3 - i7) - i6);
            this.d = iA3;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(e);
        }
    }

    public final void b(int i, byte[] bArr, int i2) throws java.io.IOException {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        java.io.OutputStream outputStream = this.e;
        outputStream.write(bArr2, 0, i4);
        this.d = 0;
        if (i7 > i4) {
            outputStream.write(bArr, i6, i7);
        } else {
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void c(long j) throws java.io.IOException {
        p(8);
        e(j);
    }

    @Override // ads_mobile_sdk.yu
    public final void d(int i, long j) throws java.io.IOException {
        p(18);
        i(i, 1);
        e(j);
    }

    public final void e(long j) {
        int i = this.d;
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
    }

    public final void f(long j) {
        int i = this.d;
        long j2 = j & (-128);
        byte[] bArr = this.b;
        if (j2 == 0) {
            bArr[i] = (byte) j;
            this.d = i + 1;
            return;
        }
        bArr[i] = (byte) (((int) j) | 128);
        long j3 = j >>> 7;
        if ((j3 & (-128)) == 0) {
            bArr[i + 1] = (byte) j3;
            this.d = i + 2;
            return;
        }
        bArr[i + 1] = (byte) (((int) j3) | 128);
        long j4 = j >>> 14;
        if ((j4 & (-128)) == 0) {
            bArr[i + 2] = (byte) j4;
            this.d = i + 3;
            return;
        }
        bArr[i + 2] = (byte) (((int) j4) | 128);
        long j5 = j >>> 21;
        if ((j5 & (-128)) == 0) {
            bArr[i + 3] = (byte) j5;
            this.d = i + 4;
            return;
        }
        bArr[i + 3] = (byte) (((int) j5) | 128);
        long j6 = j >>> 28;
        if ((j6 & (-128)) == 0) {
            bArr[i + 4] = (byte) j6;
            this.d = i + 5;
            return;
        }
        bArr[i + 4] = (byte) (((int) j6) | 128);
        long j7 = j >>> 35;
        if ((j7 & (-128)) == 0) {
            bArr[i + 5] = (byte) j7;
            this.d = i + 6;
            return;
        }
        bArr[i + 5] = (byte) (((int) j7) | 128);
        long j8 = j >>> 42;
        if ((j8 & (-128)) == 0) {
            bArr[i + 6] = (byte) j8;
            this.d = i + 7;
            return;
        }
        bArr[i + 6] = (byte) (((int) j8) | 128);
        long j9 = j >>> 49;
        if ((j9 & (-128)) == 0) {
            bArr[i + 7] = (byte) j9;
            this.d = i + 8;
            return;
        }
        bArr[i + 7] = (byte) (((int) j9) | 128);
        long j10 = j >>> 56;
        if (((-128) & j10) == 0) {
            bArr[i + 8] = (byte) j10;
            this.d = i + 9;
        } else {
            bArr[i + 8] = (byte) (((int) j10) | 128);
            bArr[i + 9] = (byte) (j >>> 63);
            this.d = i + 10;
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void g(int i, int i2) throws java.io.IOException {
        p(5);
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.yu
    public final void h(int i, int i2) throws java.io.IOException {
        p(20);
        i(i, 0);
        o(i2);
    }

    public final void i(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.yu
    public final void k(int i) throws java.io.IOException {
        p(4);
        n(i);
    }

    @Override // ads_mobile_sdk.yu
    public final void l(int i) throws java.io.IOException {
        if (i >= 0) {
            p(5);
            o(i);
        } else {
            p(10);
            f(i);
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void m(int i) throws java.io.IOException {
        p(5);
        o(i);
    }

    public final void n(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
    }

    public final void o(int i) {
        int i2 = this.d;
        int i3 = i & (-128);
        byte[] bArr = this.b;
        if (i3 == 0) {
            bArr[i2] = (byte) i;
            this.d = i2 + 1;
            return;
        }
        bArr[i2] = (byte) (i | 128);
        int i4 = i >>> 7;
        if ((i4 & (-128)) == 0) {
            bArr[i2 + 1] = (byte) i4;
            this.d = i2 + 2;
            return;
        }
        bArr[i2 + 1] = (byte) (i4 | 128);
        int i5 = i >>> 14;
        if ((i5 & (-128)) == 0) {
            bArr[i2 + 2] = (byte) i5;
            this.d = i2 + 3;
            return;
        }
        bArr[i2 + 2] = (byte) (i5 | 128);
        int i6 = i >>> 21;
        if ((i6 & (-128)) == 0) {
            bArr[i2 + 3] = (byte) i6;
            this.d = i2 + 4;
        } else {
            bArr[i2 + 3] = (byte) (i6 | 128);
            bArr[i2 + 4] = (byte) (i >>> 28);
            this.d = i2 + 5;
        }
    }

    public final void p(int i) throws java.io.IOException {
        int i2 = this.d;
        if (this.c - i2 < i) {
            this.e.write(this.b, 0, i2);
            this.d = 0;
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void d(long j) throws java.io.IOException {
        p(10);
        f(j);
    }

    @Override // ads_mobile_sdk.yu
    public final void b(int i, ads_mobile_sdk.sq sqVar) throws java.io.IOException {
        g(i, 2);
        b(sqVar);
    }

    @Override // ads_mobile_sdk.yu
    public final void b(ads_mobile_sdk.sq sqVar) throws java.io.IOException {
        int size = sqVar.size();
        p(5);
        o(size);
        sqVar.a(this);
    }

    @Override // ads_mobile_sdk.yu
    public final void b(ads_mobile_sdk.g gVar) throws java.io.IOException {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) gVar;
        int iA = cu0Var.a((dev.epro.r0.G18207276409179303092) null);
        p(5);
        o(iA);
        cu0Var.a(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void b(int i, java.lang.String str) throws dev.epro.r0.I8626815837691735180, java.io.IOException {
        g(i, 2);
        a(str);
    }

    @Override // ads_mobile_sdk.yu
    public final void e(int i, int i2) throws java.io.IOException {
        p(14);
        i(i, 5);
        n(i2);
    }

    @Override // ads_mobile_sdk.yu
    public final void e(int i, long j) throws java.io.IOException {
        p(20);
        i(i, 0);
        f(j);
    }

    @Override // ads_mobile_sdk.yu
    public final void a(int i, boolean z) throws java.io.IOException {
        p(11);
        i(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.b[i2] = b;
        this.d = i2 + 1;
    }

    @Override // ads_mobile_sdk.yu
    public final void a(int i, byte[] bArr) throws java.io.IOException {
        p(5);
        o(i);
        b(0, bArr, i);
    }

    @Override // ads_mobile_sdk.yu
    public final void a(int i, byte[] bArr, int i2) throws java.io.IOException {
        b(i, bArr, i2);
    }

    @Override // ads_mobile_sdk.yu
    public final void a(byte b) throws java.io.IOException {
        int i = this.d;
        int i2 = this.c;
        byte[] bArr = this.b;
        if (i == i2) {
            this.e.write(bArr, 0, i);
            this.d = 0;
            i = 0;
        }
        bArr[i] = b;
        this.d = i + 1;
    }

    @Override // ads_mobile_sdk.yu
    public final void f(int i, int i2) throws java.io.IOException {
        p(20);
        i(i, 0);
        if (i2 >= 0) {
            o(i2);
        } else {
            f(i2);
        }
    }
}
