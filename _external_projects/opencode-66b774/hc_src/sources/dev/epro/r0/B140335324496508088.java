package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B140335324496508088 {
    public final F6942723054099263096 a;
    public final Q9908018528090167751 b;
    public final P12475571966978616537 c;
    public final A3997919466996862373 d;
    public final Q9908018528090167751 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final B14178846910827721115 n;

    /* renamed from: o, reason: collision with root package name */
    public final I1632105416032993715 f167o;

    public B140335324496508088(F6942723054099263096 f6942723054099263096, B14178846910827721115 b14178846910827721115, I126528583771688852 i126528583771688852) {
        this.a = f6942723054099263096;
        Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
        this.b = new Q9908018528090167751();
        this.c = new P12475571966978616537();
        int i = W4456716121976909571.a;
        this.d = new A3997919466996862373();
        this.e = new Q9908018528090167751();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = b14178846910827721115;
        this.f167o = new I1632105416032993715(i126528583771688852);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(I1632105416032993715 i1632105416032993715, int i, boolean z) {
        List list;
        List list2;
        Q9908018528090167751 q9908018528090167751 = this.e;
        if (q9908018528090167751.a(i)) {
            Object b = q9908018528090167751.b(i);
            b.getClass();
            return ((U14072685990976431639) b).b;
        }
        Q9908018528090167751 q99080185280901677512 = this.b;
        byte b2 = 0;
        if (q99080185280901677512.a(i)) {
            if (!z || (list2 = (List) q99080185280901677512.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((T5398360193539863765) list2.get(i2)).a();
            }
            return -1;
        }
        I11770879194635832499 i11770879194635832499 = new I11770879194635832499(this, i1632105416032993715, b2);
        long j = i1632105416032993715.n().u;
        B14178846910827721115 b14178846910827721115 = (B14178846910827721115) i1632105416032993715.d;
        if (b14178846910827721115 == null) {
            S10823041268949770285.b0("state");
            throw null;
        }
        q99080185280901677512.i(i, K5751602218013079365.U(b14178846910827721115.a(i, j, true, new U9113694475402304022(i11770879194635832499, i1632105416032993715, (byte) 17))));
        if (!z || (list = (List) q99080185280901677512.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (b2 < size2) {
            ((T5398360193539863765) list.get(b2)).a();
            b2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(I1632105416032993715 i1632105416032993715, int i, int i2) {
        int i3;
        int i4;
        Q9908018528090167751 q9908018528090167751 = this.e;
        U14072685990976431639 u14072685990976431639 = (U14072685990976431639) q9908018528090167751.b(i);
        J3301701597851028733 j3301701597851028733 = U14072685990976431639.c;
        if (u14072685990976431639 != null) {
            u14072685990976431639.b = i2;
            u14072685990976431639.a = j3301701597851028733;
        } else {
            u14072685990976431639 = new U14072685990976431639();
            u14072685990976431639.a = j3301701597851028733;
            u14072685990976431639.b = i2;
        }
        q9908018528090167751.i(i, u14072685990976431639);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        byte b = 1;
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            I11770879194635832499 i11770879194635832499 = new I11770879194635832499(this, i1632105416032993715, b);
            long j = i1632105416032993715.n().u;
            B14178846910827721115 b14178846910827721115 = (B14178846910827721115) i1632105416032993715.d;
            if (b14178846910827721115 == null) {
                S10823041268949770285.b0("state");
                throw null;
            }
            this.b.i(i4, K5751602218013079365.U(b14178846910827721115.a(i4, j, true, new U9113694475402304022(i11770879194635832499, i1632105416032993715, (byte) 17))));
        }
        h();
    }

    public final void d(I1632105416032993715 i1632105416032993715, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int Z = T18016951143603335921.Z(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (Z > i8) {
                    Z = i8;
                }
                this.j = Z;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int a = a(i1632105416032993715, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (a == -1) {
                    return;
                }
                this.h--;
                this.j -= a;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int Z2 = T18016951143603335921.Z(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (Z2 > i9) {
                Z2 = i9;
            }
            this.k = Z2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int a2 = a(i1632105416032993715, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (a2 == -1) {
                return;
            }
            this.i++;
            this.k -= a2;
        }
    }

    public final void e(float f, Z10384052377193817149 z10384052377193817149) {
        B140335324496508088 b140335324496508088;
        boolean z;
        int i;
        int i2;
        int i3;
        I1632105416032993715 i1632105416032993715 = this.f167o;
        i1632105416032993715.c = z10384052377193817149;
        i1632105416032993715.d = this.n;
        float f2 = -f;
        h();
        if (i1632105416032993715.l()) {
            Z1953481206310471956.M(i1632105416032993715.n());
            i1632105416032993715.n();
            this.m = i1632105416032993715.q();
            int j = i1632105416032993715.j();
            int m = i1632105416032993715.m();
            int q = i1632105416032993715.q();
            int p = i1632105416032993715.p();
            int o2 = i1632105416032993715.o();
            Q9908018528090167751 q9908018528090167751 = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - p;
                this.h = j;
                while (this.j > 0 && (i3 = this.h) > 0 && q9908018528090167751.a(i3 - 1)) {
                    Object b = q9908018528090167751.b(this.h - 1);
                    b.getClass();
                    this.h--;
                    this.j -= ((U14072685990976431639) b).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - o2;
                this.i = m;
                while (this.k > 0 && (i2 = this.i) < q - 1 && q9908018528090167751.a(i2 + 1)) {
                    Object b2 = q9908018528090167751.b(this.i + 1);
                    b2.getClass();
                    int i4 = ((U14072685990976431639) b2).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, q - 1);
            }
        }
        if (i1632105416032993715.l()) {
            Z1953481206310471956.M(i1632105416032993715.n());
            if (i1632105416032993715.n().t != null) {
                i = ((X16625187937554653603) this.a.b).f571o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            b140335324496508088 = this;
            b140335324496508088.d(i1632105416032993715, i1632105416032993715.j(), i1632105416032993715.m(), i, i1632105416032993715.o(), i1632105416032993715.p(), f2, f2 <= 0.0f ? true : z);
        } else {
            b140335324496508088 = this;
        }
        b140335324496508088.f = f2;
        b140335324496508088.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        P12475571966978616537 p12475571966978616537 = this.c;
        p12475571966978616537.b();
        Q9908018528090167751 q9908018528090167751 = this.b;
        int[] iArr3 = q9908018528090167751.b;
        long[] jArr3 = q9908018528090167751.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            p12475571966978616537.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        A3997919466996862373 a3997919466996862373 = this.d;
        int[] iArr4 = a3997919466996862373.b;
        long[] jArr4 = a3997919466996862373.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                p12475571966978616537.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        Q9908018528090167751 q99080185280901677512 = this.e;
        int[] iArr5 = q99080185280901677512.b;
        long[] jArr5 = q99080185280901677512.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            p12475571966978616537.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr6 = p12475571966978616537.b;
        long[] jArr6 = p12475571966978616537.a;
        int length4 = jArr6.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr6[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr6[(i15 << 3) + i17];
                        List list = (List) q9908018528090167751.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((T5398360193539863765) list.get(i19)).cancel();
                            }
                        }
                        int c4 = a3997919466996862373.c(i18);
                        if (c4 >= 0) {
                            a3997919466996862373.e--;
                            long[] jArr7 = a3997919466996862373.a;
                            int i20 = a3997919466996862373.d;
                            int i21 = c4 >> 3;
                            int i22 = (c4 & 7) << 3;
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                            long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr7[i21] = j8;
                            jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        q99080185280901677512.g(i18);
                    } else {
                        iArr2 = iArr6;
                        jArr2 = jArr6;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr6 = iArr2;
                    jArr6 = jArr2;
                }
                iArr = iArr6;
                jArr = jArr6;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
                jArr = jArr6;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr6 = iArr;
            jArr6 = jArr;
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        Q9908018528090167751 q9908018528090167751 = this.b;
        long[] jArr = q9908018528090167751.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = q9908018528090167751.b[i4];
                        List list = (List) q9908018528090167751.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((T5398360193539863765) list.get(i6)).cancel();
                        }
                        q9908018528090167751.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h() {
        D1286559660607336098.E(this.j, "prefetchWindowStartExtraSpace");
        D1286559660607336098.E(this.k, "prefetchWindowEndExtraSpace");
        D1286559660607336098.E(this.h, "prefetchWindowStartIndex");
        D1286559660607336098.E(this.i, "prefetchWindowEndIndex");
    }
}
