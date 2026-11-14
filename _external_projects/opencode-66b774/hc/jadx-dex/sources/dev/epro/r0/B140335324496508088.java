package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B140335324496508088 {
    public final dev.epro.r0.F6942723054099263096 a;
    public final dev.epro.r0.Q9908018528090167751 b;
    public final dev.epro.r0.P12475571966978616537 c;
    public final dev.epro.r0.A3997919466996862373 d;
    public final dev.epro.r0.Q9908018528090167751 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final dev.epro.r0.B14178846910827721115 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.I1632105416032993715 f167o;

    public B140335324496508088(dev.epro.r0.F6942723054099263096 f6942723054099263096, dev.epro.r0.B14178846910827721115 b14178846910827721115, dev.epro.r0.I126528583771688852 i126528583771688852) {
        this.a = f6942723054099263096;
        dev.epro.r0.Q9908018528090167751 q9908018528090167751 = dev.epro.r0.C4240022152304578596.a;
        this.b = new dev.epro.r0.Q9908018528090167751();
        this.c = new dev.epro.r0.P12475571966978616537();
        int i = dev.epro.r0.W4456716121976909571.a;
        this.d = new dev.epro.r0.A3997919466996862373();
        this.e = new dev.epro.r0.Q9908018528090167751();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = b14178846910827721115;
        this.f167o = new dev.epro.r0.I1632105416032993715(i126528583771688852);
    }

    public final int a(dev.epro.r0.I1632105416032993715 i1632105416032993715, int i, boolean z) {
        java.util.List list;
        java.util.List list2;
        dev.epro.r0.Q9908018528090167751 q9908018528090167751 = this.e;
        if (q9908018528090167751.a(i)) {
            java.lang.Object objB = q9908018528090167751.b(i);
            objB.getClass();
            return ((dev.epro.r0.U14072685990976431639) objB).b;
        }
        dev.epro.r0.Q9908018528090167751 q99080185280901677512 = this.b;
        int i2 = 0;
        if (q99080185280901677512.a(i)) {
            if (!z || (list2 = (java.util.List) q99080185280901677512.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((dev.epro.r0.T5398360193539863765) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        dev.epro.r0.I11770879194635832499 i11770879194635832499 = new dev.epro.r0.I11770879194635832499(this, i1632105416032993715, (byte) 0);
        long j = i1632105416032993715.n().u;
        dev.epro.r0.B14178846910827721115 b14178846910827721115 = (dev.epro.r0.B14178846910827721115) i1632105416032993715.d;
        if (b14178846910827721115 == null) {
            dev.epro.r0.S10823041268949770285.b0("state");
            throw null;
        }
        q99080185280901677512.i(i, dev.epro.r0.K5751602218013079365.U(b14178846910827721115.a(i, j, true, new dev.epro.r0.U9113694475402304022(i11770879194635832499, i1632105416032993715, (byte) 17))));
        if (!z || (list = (java.util.List) q99080185280901677512.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((dev.epro.r0.T5398360193539863765) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(dev.epro.r0.I1632105416032993715 i1632105416032993715, int i, int i2) {
        int i3;
        int i4;
        dev.epro.r0.Q9908018528090167751 q9908018528090167751 = this.e;
        dev.epro.r0.U14072685990976431639 u14072685990976431639 = (dev.epro.r0.U14072685990976431639) q9908018528090167751.b(i);
        dev.epro.r0.J3301701597851028733 j3301701597851028733 = dev.epro.r0.U14072685990976431639.c;
        if (u14072685990976431639 != null) {
            u14072685990976431639.b = i2;
            u14072685990976431639.a = j3301701597851028733;
        } else {
            u14072685990976431639 = new dev.epro.r0.U14072685990976431639();
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
        if (java.lang.Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (java.lang.Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            dev.epro.r0.I11770879194635832499 i11770879194635832499 = new dev.epro.r0.I11770879194635832499(this, i1632105416032993715, (byte) 1);
            long j = i1632105416032993715.n().u;
            dev.epro.r0.B14178846910827721115 b14178846910827721115 = (dev.epro.r0.B14178846910827721115) i1632105416032993715.d;
            if (b14178846910827721115 == null) {
                dev.epro.r0.S10823041268949770285.b0("state");
                throw null;
            }
            this.b.i(i4, dev.epro.r0.K5751602218013079365.U(b14178846910827721115.a(i4, j, true, new dev.epro.r0.U9113694475402304022(i11770879194635832499, i1632105416032993715, (byte) 17))));
        }
        h();
    }

    public final void d(dev.epro.r0.I1632105416032993715 i1632105416032993715, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = java.lang.Math.signum(f) == java.lang.Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iZ = dev.epro.r0.T18016951143603335921.Z(java.lang.Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iZ > i8) {
                    iZ = i8;
                }
                this.j = iZ;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(i1632105416032993715, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && java.lang.Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iZ2 = dev.epro.r0.T18016951143603335921.Z(java.lang.Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iZ2 > i9) {
                iZ2 = i9;
            }
            this.k = iZ2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int iA2 = a(i1632105416032993715, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && java.lang.Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void e(float f, dev.epro.r0.Z10384052377193817149 z10384052377193817149) {
        dev.epro.r0.B140335324496508088 b140335324496508088;
        boolean z;
        int i;
        int i2;
        int i3;
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.f167o;
        i1632105416032993715.c = z10384052377193817149;
        i1632105416032993715.d = this.n;
        float f2 = -f;
        h();
        if (i1632105416032993715.l()) {
            dev.epro.r0.Z1953481206310471956.M(i1632105416032993715.n());
            i1632105416032993715.n();
            this.m = i1632105416032993715.q();
            int iJ = i1632105416032993715.j();
            int iM = i1632105416032993715.m();
            int iQ = i1632105416032993715.q();
            int iP = i1632105416032993715.p();
            int iO = i1632105416032993715.o();
            dev.epro.r0.Q9908018528090167751 q9908018528090167751 = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iP;
                this.h = iJ;
                while (this.j > 0 && (i3 = this.h) > 0 && q9908018528090167751.a(i3 - 1)) {
                    java.lang.Object objB = q9908018528090167751.b(this.h - 1);
                    objB.getClass();
                    this.h--;
                    this.j -= ((dev.epro.r0.U14072685990976431639) objB).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - iO;
                this.i = iM;
                while (this.k > 0 && (i2 = this.i) < iQ - 1 && q9908018528090167751.a(i2 + 1)) {
                    java.lang.Object objB2 = q9908018528090167751.b(this.i + 1);
                    objB2.getClass();
                    int i4 = ((dev.epro.r0.U14072685990976431639) objB2).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, iQ - 1);
            }
        }
        if (i1632105416032993715.l()) {
            dev.epro.r0.Z1953481206310471956.M(i1632105416032993715.n());
            if (i1632105416032993715.n().t != null) {
                i = ((dev.epro.r0.X16625187937554653603) this.a.b).o;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B140335324496508088.f(int, int):void");
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        dev.epro.r0.Q9908018528090167751 q9908018528090167751 = this.b;
        long[] jArr = ((dev.epro.r0.W13131470296662841006) q9908018528090167751).a;
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
                        int i5 = ((dev.epro.r0.W13131470296662841006) q9908018528090167751).b[i4];
                        java.util.List list = (java.util.List) ((dev.epro.r0.W13131470296662841006) q9908018528090167751).c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((dev.epro.r0.T5398360193539863765) list.get(i6)).cancel();
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
        dev.epro.r0.D1286559660607336098.E(this.j, "prefetchWindowStartExtraSpace");
        dev.epro.r0.D1286559660607336098.E(this.k, "prefetchWindowEndExtraSpace");
        dev.epro.r0.D1286559660607336098.E(this.h, "prefetchWindowStartIndex");
        dev.epro.r0.D1286559660607336098.E(this.i, "prefetchWindowEndIndex");
    }
}
