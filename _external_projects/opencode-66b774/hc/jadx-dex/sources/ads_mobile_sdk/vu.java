package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vu extends ads_mobile_sdk.yu {
    public final byte[] b;
    public final int c;
    public int d;

    public vu(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            java.util.Locale locale = java.util.Locale.US;
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.E12098517352909843120.l("Array range is invalid. Buffer.length=", bArr.length, i, ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(java.lang.String str) throws dev.epro.r0.I8626815837691735180 {
        byte[] bArr = this.b;
        if (ads_mobile_sdk.vn3.b) {
            byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            m(bytes.length);
            b(0, bytes, bytes.length);
            return;
        }
        int i = this.d;
        try {
            int i2 = ads_mobile_sdk.yu.i(str.length());
            int i3 = i + i2;
            this.d = i3;
            int iA = (ads_mobile_sdk.vn3.a.a(i3, bArr.length - i3, str, bArr) - i) - i2;
            int i4 = ads_mobile_sdk.yu.i(iA);
            if (i4 != i2) {
                java.lang.System.arraycopy(bArr, i3, bArr, i + i4, iA);
            }
            this.d = i;
            m(iA);
            this.d = i + i4 + iA;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    public final void b(int i, byte[] bArr, int i2) throws dev.epro.r0.I8626815837691735180 {
        try {
            java.lang.System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(this.d, this.c, i2, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void c(long j) throws dev.epro.r0.I8626815837691735180 {
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
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(i, this.c, 8, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void d(long j) throws dev.epro.r0.I8626815837691735180 {
        int i = this.d;
        long j2 = j & (-128);
        byte[] bArr = this.b;
        try {
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
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(i, this.c, 1, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void e(int i, int i2) throws dev.epro.r0.I8626815837691735180 {
        g(i, 5);
        k(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void f(int i, int i2) throws dev.epro.r0.I8626815837691735180 {
        g(i, 0);
        l(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void g(int i, int i2) throws dev.epro.r0.I8626815837691735180 {
        m((i << 3) | i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void h(int i, int i2) throws dev.epro.r0.I8626815837691735180 {
        g(i, 0);
        m(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void k(int i) throws dev.epro.r0.I8626815837691735180 {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new dev.epro.r0.I8626815837691735180(i2, this.c, 4, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void l(int i) throws dev.epro.r0.I8626815837691735180 {
        int i2;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        byte[] bArr;
        int i3;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException2;
        if (i >= 0) {
            m(i);
            return;
        }
        long j = i;
        int i4 = this.d;
        try {
            bArr = this.b;
            i3 = i4 + 1;
            try {
                bArr[i4] = (byte) (((int) j) | 128);
                i2 = i4 + 2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                indexOutOfBoundsException2 = e;
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            i2 = i4;
            indexOutOfBoundsException = e2;
        }
        try {
            bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
            int i5 = i4 + 3;
            bArr[i2] = (byte) (((int) (j >>> 14)) | 128);
            i2 = i4 + 4;
            bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
            int i6 = i4 + 5;
            bArr[i2] = (byte) (((int) (j >>> 28)) | 128);
            int i7 = i4 + 6;
            try {
                bArr[i6] = -1;
                int i8 = i4 + 7;
                bArr[i7] = -1;
                i7 = i4 + 8;
                bArr[i8] = -1;
                i3 = i4 + 9;
                bArr[i7] = -1;
                i4 += 10;
                bArr[i3] = 1;
                this.d = i4;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException2 = e3;
                i3 = i7;
                indexOutOfBoundsException = indexOutOfBoundsException2;
                i2 = i3;
                throw new dev.epro.r0.I8626815837691735180(i2, this.c, 10, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
            throw new dev.epro.r0.I8626815837691735180(i2, this.c, 10, indexOutOfBoundsException);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void m(int i) throws dev.epro.r0.I8626815837691735180 {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException2;
        int i2;
        int i3 = this.d;
        int i4 = i & (-128);
        byte[] bArr = this.b;
        try {
            if (i4 == 0) {
                int i5 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i5;
                return;
            }
            i4 = i3 + 1;
            try {
                bArr[i3] = (byte) (i | 128);
                int i6 = i >>> 7;
                try {
                    if ((i6 & (-128)) == 0) {
                        int i7 = i3 + 2;
                        bArr[i4] = (byte) i6;
                        this.d = i7;
                        return;
                    }
                    int i8 = i3 + 2;
                    try {
                        bArr[i4] = (byte) (i6 | 128);
                        int i9 = i >>> 14;
                        if ((i9 & (-128)) == 0) {
                            int i10 = i3 + 3;
                            bArr[i8] = (byte) i9;
                            this.d = i10;
                            return;
                        }
                        int i11 = i3 + 3;
                        try {
                            bArr[i8] = (byte) (i9 | 128);
                            int i12 = i >>> 21;
                            if ((i12 & (-128)) == 0) {
                                int i13 = i3 + 4;
                                bArr[i11] = (byte) i12;
                                this.d = i13;
                                return;
                            }
                            i2 = i3 + 4;
                            try {
                                bArr[i11] = (byte) (i12 | 128);
                                int i14 = i3 + 5;
                                bArr[i2] = (byte) (i >>> 28);
                                this.d = i14;
                            } catch (java.lang.IndexOutOfBoundsException e) {
                                indexOutOfBoundsException2 = e;
                                throw new dev.epro.r0.I8626815837691735180(i2, this.c, 1, indexOutOfBoundsException2);
                            }
                        } catch (java.lang.IndexOutOfBoundsException e2) {
                            indexOutOfBoundsException = e2;
                            i4 = i11;
                            indexOutOfBoundsException2 = indexOutOfBoundsException;
                            i2 = i4;
                            throw new dev.epro.r0.I8626815837691735180(i2, this.c, 1, indexOutOfBoundsException2);
                        }
                    } catch (java.lang.IndexOutOfBoundsException e3) {
                        indexOutOfBoundsException = e3;
                        i4 = i8;
                    }
                } catch (java.lang.IndexOutOfBoundsException e4) {
                    e = e4;
                    i4 = i;
                    indexOutOfBoundsException = e;
                    indexOutOfBoundsException2 = indexOutOfBoundsException;
                    i2 = i4;
                    throw new dev.epro.r0.I8626815837691735180(i2, this.c, 1, indexOutOfBoundsException2);
                }
            } catch (java.lang.IndexOutOfBoundsException e5) {
                e = e5;
            }
        } catch (java.lang.IndexOutOfBoundsException e6) {
            e = e6;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void e(int i, long j) throws dev.epro.r0.I8626815837691735180 {
        g(i, 0);
        d(j);
    }

    public final int b() {
        return this.c - this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void b(int i, ads_mobile_sdk.sq sqVar) throws dev.epro.r0.I8626815837691735180 {
        g(i, 2);
        m(sqVar.size());
        sqVar.a(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void b(ads_mobile_sdk.sq sqVar) throws dev.epro.r0.I8626815837691735180 {
        m(sqVar.size());
        sqVar.a(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void b(ads_mobile_sdk.g gVar) throws dev.epro.r0.I8626815837691735180 {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) gVar;
        m(cu0Var.a((dev.epro.r0.G18207276409179303092) null));
        cu0Var.a(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void b(int i, java.lang.String str) throws dev.epro.r0.I8626815837691735180 {
        g(i, 2);
        a(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(int i, boolean z) throws dev.epro.r0.I8626815837691735180 {
        g(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(int i, byte[] bArr) throws dev.epro.r0.I8626815837691735180 {
        m(i);
        b(0, bArr, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(int i, byte[] bArr, int i2) throws dev.epro.r0.I8626815837691735180 {
        b(i, bArr, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void a(byte b) throws dev.epro.r0.I8626815837691735180 {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new dev.epro.r0.I8626815837691735180(i, this.c, 1, e);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    @Override // ads_mobile_sdk.yu
    public final void d(int i, long j) throws dev.epro.r0.I8626815837691735180 {
        g(i, 1);
        c(j);
    }
}
