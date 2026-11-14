package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W12302045505279551894 {
    public final W13131470296662841006 a;
    public final S7974369370986781936 b;
    public final N12245111110189169079 c;
    public final A916399900972467586 d;
    public final U9803441765912152712 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public S6873153560207725378 i;
    public long j;
    public final N8306548196372912291 k;
    public final J5669240411995309413 l;

    public W12302045505279551894(Q9908018528090167751 q9908018528090167751, S7974369370986781936 s7974369370986781936) {
        this.a = q9908018528090167751;
        this.b = s7974369370986781936;
        N12245111110189169079 n12245111110189169079 = new N12245111110189169079((byte) 9);
        n12245111110189169079.c = new long[192];
        n12245111110189169079.d = new long[192];
        this.c = n12245111110189169079;
        this.d = new A916399900972467586();
        this.e = new U9803441765912152712();
        this.j = -1L;
        this.k = new N8306548196372912291(this, (byte) 5);
        this.l = new J5669240411995309413();
    }

    public static boolean c(Y4989033692226475498 y4989033692226475498) {
        U18133900443301080740 u18133900443301080740 = y4989033692226475498.T;
        return (u18133900443301080740 == null || D1286559660607336098.w(((R12643293538999642754) u18133900443301080740).b())) ? false : true;
    }

    public static long f(H11725168162114556860 h11725168162114556860) {
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) x9608137461199640409.e;
        long j = 0;
        for (Y4989033692226475498 y49890336922264754982 = (I16141028645763443416) x9608137461199640409.d; y49890336922264754982 != null && y49890336922264754982 != y4989033692226475498; y49890336922264754982 = y49890336922264754982.w) {
            if (c(y49890336922264754982)) {
                return 9223372034707292159L;
            }
            j = Q2551293802323679034.d(j, y49890336922264754982.F);
        }
        return j;
    }

    public static void i(H11725168162114556860 h11725168162114556860) {
        if (!h11725168162114556860.c || c((Y4989033692226475498) h11725168162114556860.F.e)) {
            return;
        }
        h11725168162114556860.c = false;
        if (h11725168162114556860.e) {
            h11725168162114556860.d = f(h11725168162114556860);
            h11725168162114556860.e = false;
        }
        if (Q2551293802323679034.b(h11725168162114556860.d, 9223372034707292159L)) {
            return;
        }
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            i((H11725168162114556860) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W12302045505279551894.a():void");
    }

    public final long b(H11725168162114556860 h11725168162114556860) {
        if (h11725168162114556860.g == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(h11725168162114556860)];
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(dev.epro.r0.H11725168162114556860 r8) {
        /*
            r7 = this;
            int r0 = r8.g
            r1 = -4
            if (r0 != r1) goto L7
        L5:
            r0 = r1
            goto L3b
        L7:
            int r2 = r8.b
            dev.epro.r0.N12245111110189169079 r7 = r7.c
            java.lang.Object r3 = r7.c
            long[] r3 = (long[]) r3
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            if (r0 < 0) goto L25
            int r5 = r7.b
            int r5 = r5 + (-2)
            if (r0 >= r5) goto L25
            int r5 = r0 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            r6 = r2 & r4
            if (r5 != r6) goto L25
            goto L3b
        L25:
            r0 = r2 & r4
            int r7 = r7.b
            r2 = 0
        L2a:
            int r5 = r7 + (-2)
            if (r2 >= r5) goto L5
            int r5 = r2 + 2
            r5 = r3[r5]
            int r5 = (int) r5
            r5 = r5 & r4
            if (r5 != r0) goto L38
            r0 = r2
            goto L3b
        L38:
            int r2 = r2 + 3
            goto L2a
        L3b:
            if (r0 == r1) goto L3e
            goto L56
        L3e:
            int r7 = r8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutNode "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " not found in RectList"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            dev.epro.r0.P753981624812481271.a(r7)
        L56:
            r8.g = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W12302045505279551894.d(dev.epro.r0.H11725168162114556860):int");
    }

    public final void e(H11725168162114556860 h11725168162114556860) {
        h11725168162114556860.c = true;
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) x9608137461199640409.e;
        T8458668874796040341 t8458668874796040341 = h11725168162114556860.G.p;
        int j0 = t8458668874796040341.j0();
        float d0 = t8458668874796040341.d0();
        J5669240411995309413 j5669240411995309413 = this.l;
        j5669240411995309413.a = 0.0f;
        j5669240411995309413.b = 0.0f;
        j5669240411995309413.c = j0;
        j5669240411995309413.d = d0;
        while (true) {
            if (y4989033692226475498 == null) {
                break;
            }
            H11725168162114556860 h117251681621145568602 = y4989033692226475498.u;
            if (y4989033692226475498 == ((Y4989033692226475498) h117251681621145568602.F.e) && !h117251681621145568602.c) {
                if (!Q2551293802323679034.b(b(h117251681621145568602), 9223372034707292159L)) {
                    j5669240411995309413.c((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            U18133900443301080740 u18133900443301080740 = y4989033692226475498.T;
            if (u18133900443301080740 != null) {
                float[] b = ((R12643293538999642754) u18133900443301080740).b();
                if (!D1286559660607336098.w(b)) {
                    N9580590882934638229.c(b, j5669240411995309413);
                }
            }
            long j = y4989033692226475498.F;
            j5669240411995309413.c((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            y4989033692226475498 = y4989033692226475498.w;
        }
        int i = (int) j5669240411995309413.a;
        int i2 = (int) j5669240411995309413.b;
        int i3 = (int) j5669240411995309413.c;
        int i4 = (int) j5669240411995309413.d;
        int i5 = h11725168162114556860.b;
        int i6 = h11725168162114556860.g;
        N12245111110189169079 n12245111110189169079 = this.c;
        if (i6 != -4) {
            int d = d(h11725168162114556860);
            long[] jArr = (long[]) n12245111110189169079.c;
            jArr[d] = (i << 32) | (i2 & 4294967295L);
            jArr[d + 1] = (4294967295L & i4) | (i3 << 32);
            int i7 = d + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            H11725168162114556860 u = h11725168162114556860.u();
            h11725168162114556860.g = n12245111110189169079.k(i5, i, i2, i3, i4, u != null ? u.b : -1, u != null ? d(u) : -4, x9608137461199640409.i(1024), x9608137461199640409.i(16), this.d.a.a(i5));
        }
        h11725168162114556860.f = false;
        this.f = true;
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i8 = z.c;
        for (int i9 = 0; i9 < i8; i9++) {
            H11725168162114556860 h117251681621145568603 = (H11725168162114556860) objArr[i9];
            if (h117251681621145568603.I()) {
                e(h117251681621145568603);
            }
        }
    }

    public final void g(H11725168162114556860 h11725168162114556860) {
        long j;
        boolean I = h11725168162114556860.I();
        X9608137461199640409 x9608137461199640409 = h11725168162114556860.F;
        if (I && h11725168162114556860.f) {
            H11725168162114556860 u = h11725168162114556860.u();
            if (u == null || u.c) {
                j = u == null ? 0L : 9223372034707292159L;
            } else {
                if (u.e) {
                    u.e = false;
                    u.d = f(u);
                }
                j = u.d;
            }
            Y4989033692226475498 y4989033692226475498 = (Y4989033692226475498) x9608137461199640409.e;
            if (Q2551293802323679034.b(j, 9223372034707292159L) || c(y4989033692226475498)) {
                e(h11725168162114556860);
            } else if (h11725168162114556860.c) {
                e(h11725168162114556860);
                i(h11725168162114556860);
            } else {
                long d = Q2551293802323679034.d(j, y4989033692226475498.F);
                T8458668874796040341 t8458668874796040341 = h11725168162114556860.G.p;
                int j0 = t8458668874796040341.j0();
                int d0 = t8458668874796040341.d0();
                int i = h11725168162114556860.g;
                N12245111110189169079 n12245111110189169079 = this.c;
                if (i != -4) {
                    int d2 = d(h11725168162114556860);
                    if (u != null) {
                        int d3 = d(u);
                        long[] jArr = (long[]) n12245111110189169079.c;
                        long j2 = jArr[d3];
                        int i2 = ((int) (j2 >> 32)) + ((int) (d >> 32));
                        int i3 = ((int) j2) + ((int) (d & 4294967295L));
                        long j3 = jArr[d2];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = d2 + 2;
                        long j4 = jArr[i6];
                        jArr[d2] = (i2 << 32) | (i3 & 4294967295L);
                        jArr[d2 + 1] = ((j0 + i2) << 32) | ((d0 + i3) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            n12245111110189169079.o(d2, i4, i5, j4);
                        }
                    } else {
                        int d4 = d(h11725168162114556860);
                        int i7 = (int) (d >> 32);
                        int i8 = (int) (d & 4294967295L);
                        long[] jArr2 = (long[]) n12245111110189169079.c;
                        long j5 = jArr2[d4];
                        jArr2[d4] = (i8 & 4294967295L) | (i7 << 32);
                        jArr2[d4 + 1] = ((d0 + i8) & 4294967295L) | ((j0 + i7) << 32);
                        int i9 = d4 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            n12245111110189169079.o(d4, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = h11725168162114556860.b;
                    boolean i13 = x9608137461199640409.i(1024);
                    boolean i14 = x9608137461199640409.i(16);
                    boolean a = this.d.a.a(i12);
                    if (u != null) {
                        int i15 = u.b;
                        int d5 = d(u);
                        int i16 = (int) (d >> 32);
                        int i17 = (int) (d & 4294967295L);
                        int i18 = i12 & 33554431;
                        long[] jArr3 = (long[]) n12245111110189169079.c;
                        if ((((int) jArr3[d5 + 2]) & 33554431) != (33554431 & i15)) {
                            P753981624812481271.a("Inserted child " + i18 + " without valid parent index or parent " + i15 + " not found");
                        }
                        long j7 = jArr3[d5];
                        int i19 = ((int) (j7 >> 32)) + i16;
                        int i20 = ((int) j7) + i17;
                        h11725168162114556860.g = n12245111110189169079.k(i18, i19, i20, i19 + j0, i20 + d0, i15, d5, i13, i14, a);
                    } else {
                        int i21 = (int) (d >> 32);
                        int i22 = (int) (d & 4294967295L);
                        h11725168162114556860.g = n12245111110189169079.k(i12, i21, i22, i21 + j0, i22 + d0, -1, -4, i13, i14, a);
                    }
                }
            }
            h11725168162114556860.f = false;
            this.f = true;
            j();
        }
    }

    public final void h(H11725168162114556860 h11725168162114556860) {
        if (h11725168162114556860.g != -4) {
            int d = d(h11725168162114556860);
            long[] jArr = (long[]) this.c.c;
            jArr[d] = -1;
            jArr[d + 1] = -1;
            jArr[d + 2] = T17075709905302039733.a;
            h11725168162114556860.g = -4;
            h11725168162114556860.f = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        S6873153560207725378 s6873153560207725378 = this.i;
        boolean z = s6873153560207725378 != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            S7974369370986781936 s7974369370986781936 = this.b;
            if (s6873153560207725378 != null) {
                s7974369370986781936.removeCallbacks(s6873153560207725378);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.j = max;
            S6873153560207725378 s68731535602077253782 = new S6873153560207725378(this.k, (byte) 2);
            s7974369370986781936.postDelayed(s68731535602077253782, max - currentTimeMillis);
            this.i = s68731535602077253782;
        }
    }
}
