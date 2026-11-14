package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H3043063065558747866 implements I6148490667470006645 {
    public final int a;
    public final List b;
    public final boolean c;
    public final K1823399244298350623 d;
    public final O15869581661108952313 e;
    public final F10342546226345611902 f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final I2828680009210448000 m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f271o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public boolean v;
    public int w = Integer.MIN_VALUE;
    public int x;
    public int y;
    public final int[] z;

    public H3043063065558747866(int i, List list, boolean z, K1823399244298350623 k1823399244298350623, O15869581661108952313 o15869581661108952313, F10342546226345611902 f10342546226345611902, int i2, int i3, int i4, long j, Object obj, Object obj2, I2828680009210448000 i2828680009210448000, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = k1823399244298350623;
        this.e = o15869581661108952313;
        this.f = f10342546226345611902;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = i2828680009210448000;
        this.n = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? z17471428274427141949.b : z17471428274427141949.a;
            iMax = Math.max(iMax, !z2 ? z17471428274427141949.b : z17471428274427141949.a);
        }
        this.p = i5;
        this.u = iMax;
        this.z = new int[this.b.size() * 2];
        if (this.c) {
            this.t = this.i;
            this.r = i5;
            this.q = iMax;
            this.s = 0;
            return;
        }
        this.t = 0;
        this.r = iMax;
        this.q = i5;
        this.s = this.i;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final void a(int i, int i2, int i3, int i4) {
        o(i, i3, i4);
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int b() {
        return this.s;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final long c(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.f271o;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.z;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int d() {
        return 1;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int e() {
        return 0;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int f() {
        return this.r;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int g() {
        return this.q;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int getIndex() {
        return this.a;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final Object getKey() {
        return this.k;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final void h() {
        this.v = true;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final long i() {
        return this.n;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final List j() {
        return this.b;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int k() {
        return this.t;
    }

    public final int l(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.r;
            i2 = this.t;
        } else {
            i = this.q;
            i2 = this.s;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Y2066038017114788875 y2066038017114788875, boolean z) {
        List list;
        int i;
        if (this.w == Integer.MIN_VALUE) {
            Y16081827717826519461.a("position() should be called first");
        }
        List list2 = this.b;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list2.get(i2);
            int i3 = this.x;
            boolean z2 = this.c;
            int i4 = i3 - (z2 ? z17471428274427141949.b : z17471428274427141949.a);
            int i5 = this.y;
            long jC = c(i2);
            I13087925019311684776 i13087925019311684776A = this.m.a(i2, this.k);
            B9692660393722135472 b9692660393722135472 = null;
            Object[] objArr = 0;
            if (i13087925019311684776A != null) {
                if (z) {
                    i13087925019311684776A.n = jC;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!Q2551293802323679034.b(i13087925019311684776A.n, 9223372034707292159L)) {
                        jC = i13087925019311684776A.n;
                    }
                    long jD = Q2551293802323679034.d(jC, ((Q2551293802323679034) i13087925019311684776A.r.getValue()).a);
                    if (((l(jC) <= i4 && l(jD) <= i4) || (l(jC) >= i5 && l(jD) >= i5)) && ((Boolean) i13087925019311684776A.h.getValue()).booleanValue()) {
                        R7033599853981556291.E(i13087925019311684776A.a, null, null, new B11361677180658862244(i13087925019311684776A, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    jC = jD;
                }
                b9692660393722135472 = i13087925019311684776A.f285o;
            } else {
                list = list2;
                i = size;
            }
            long jD2 = Q2551293802323679034.d(jC, this.j);
            if (!z && i13087925019311684776A != null) {
                i13087925019311684776A.m = jD2;
            }
            if (z2) {
                if (b9692660393722135472 != null) {
                    y2066038017114788875.f(z17471428274427141949);
                    z17471428274427141949.o0(Q2551293802323679034.d(jD2, z17471428274427141949.e), 0.0f, b9692660393722135472);
                } else {
                    Y2066038017114788875.p(y2066038017114788875, z17471428274427141949, jD2);
                }
            } else if (b9692660393722135472 == null) {
                Y2066038017114788875.l(y2066038017114788875, z17471428274427141949, jD2);
            } else if (y2066038017114788875.b() == F10342546226345611902.a || y2066038017114788875.d() == 0) {
                y2066038017114788875.f(z17471428274427141949);
                z17471428274427141949.o0(Q2551293802323679034.d(jD2, z17471428274427141949.e), 0.0f, b9692660393722135472);
            } else {
                int iD = (y2066038017114788875.d() - z17471428274427141949.a) - ((int) (jD2 >> 32));
                y2066038017114788875.f(z17471428274427141949);
                z17471428274427141949.o0(Q2551293802323679034.d((((long) ((int) (jD2 & 4294967295L))) & 4294967295L) | (((long) iD) << 32), z17471428274427141949.e), 0.0f, b9692660393722135472);
            }
            i2++;
            list2 = list;
            size = i;
        }
    }

    public final void o(int i, int i2, int i3) {
        int i4;
        this.f271o = i;
        boolean z = this.c;
        this.w = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.z;
            if (z) {
                K1823399244298350623 k1823399244298350623 = this.d;
                if (k1823399244298350623 == null) {
                    throw G11450220448113054352.f("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = k1823399244298350623.a(z17471428274427141949.a, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = z17471428274427141949.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                O15869581661108952313 o15869581661108952313 = this.e;
                if (o15869581661108952313 == null) {
                    throw G11450220448113054352.f("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = o15869581661108952313.a(z17471428274427141949.b, i3);
                i4 = z17471428274427141949.a;
            }
            i += i4;
        }
        this.x = -this.g;
        this.y = this.w + this.h;
    }
}
