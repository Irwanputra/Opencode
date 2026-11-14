package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V2435767323669307206 implements I6148490667470006645 {
    public final int a;
    public final Object b;
    public final int c;
    public final F10342546226345611902 d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final I2828680009210448000 j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f542o;
    public final int p;
    public final int q;
    public final int r;
    public int s = Integer.MIN_VALUE;
    public int t;
    public int u;
    public final long v;
    public long w;
    public int x;
    public int y;
    public boolean z;

    public V2435767323669307206(int i, Object obj, int i2, int i3, F10342546226345611902 f10342546226345611902, int i4, int i5, List list, long j, Object obj2, I2828680009210448000 i2828680009210448000, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = f10342546226345611902;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = i2828680009210448000;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((Z17471428274427141949) list.get(i9)).b);
        }
        this.n = i8;
        this.r = i3;
        this.p = i8;
        int i10 = this.c;
        this.f542o = i10;
        this.q = 0;
        this.v = (i10 << 32) | (i8 & 4294967295L);
        this.w = 0L;
        this.x = -1;
        this.y = -1;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final void a(int i, int i2, int i3, int i4) {
        n(i, i2, i3, i4, -1, -1);
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int b() {
        return this.q;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final long c(int i) {
        return this.w;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int d() {
        return this.m;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int e() {
        return this.l;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int f() {
        return this.p;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int g() {
        return this.f542o;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int getIndex() {
        return this.a;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final Object getKey() {
        return this.b;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final void h() {
        this.z = true;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final long i() {
        return this.k;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final List j() {
        return this.g;
    }

    @Override // dev.epro.r0.I6148490667470006645
    public final int k() {
        return this.r;
    }

    public final int l() {
        return this.p + this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Y2066038017114788875 y2066038017114788875, boolean z) {
        if (this.s == Integer.MIN_VALUE) {
            Y16081827717826519461.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list.get(i);
            int i2 = this.t - z17471428274427141949.b;
            int i3 = this.u;
            long j = this.w;
            I13087925019311684776 a = this.j.a(i, this.b);
            B9692660393722135472 b9692660393722135472 = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.n = j;
                } else {
                    long d = Q2551293802323679034.d(!Q2551293802323679034.b(a.n, 9223372034707292159L) ? a.n : j, ((Q2551293802323679034) a.r.getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (d & 4294967295L)) >= i3)) && ((Boolean) a.h.getValue()).booleanValue()) {
                        R7033599853981556291.E(a.a, null, null, new B11361677180658862244(a, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    j = d;
                }
                b9692660393722135472 = a.f285o;
            }
            long d2 = Q2551293802323679034.d(j, this.h);
            if (!z && a != null) {
                a.m = d2;
            }
            if (b9692660393722135472 != null) {
                y2066038017114788875.f(z17471428274427141949);
                z17471428274427141949.o0(Q2551293802323679034.d(d2, z17471428274427141949.e), 0.0f, b9692660393722135472);
            } else {
                Y2066038017114788875.p(y2066038017114788875, z17471428274427141949, d2);
            }
        }
    }

    public final void n(int i, int i2, int i3, int i4, int i5, int i6) {
        this.s = i4;
        if (this.d == F10342546226345611902.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.w = (i2 << 32) | (i & 4294967295L);
        this.x = i5;
        this.y = i6;
        this.t = -this.e;
        this.u = i4 + this.f;
    }
}
