package dev.epro.r0;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K15976628200778816833 implements H11646813293457574213 {
    public final P3691876431017196508 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final H11646813293457574213 e;
    public final float f;
    public final boolean g;
    public final W5797197595347441198 h;
    public final R8540738700654750557 i;
    public final int j;
    public final F4096073349764486348 k;
    public final F4096073349764486348 l;
    public final int m;
    public final List n;

    /* renamed from: o, reason: collision with root package name */
    public final int f328o;
    public final int p;
    public final int q;
    public final R7000310675073492254 r;
    public final int s;
    public final int t;

    public K15976628200778816833(P3691876431017196508 p3691876431017196508, int i, boolean z, float f, H11646813293457574213 h11646813293457574213, float f2, boolean z2, W5797197595347441198 w5797197595347441198, R8540738700654750557 r8540738700654750557, int i2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, int i3, List list, int i4, int i5, int i6, R7000310675073492254 r7000310675073492254, int i7, int i8) {
        this.a = p3691876431017196508;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = h11646813293457574213;
        this.f = f2;
        this.g = z2;
        this.h = w5797197595347441198;
        this.i = r8540738700654750557;
        this.j = i2;
        this.k = f4096073349764486348;
        this.l = f40960733497644863482;
        this.m = i3;
        this.n = list;
        this.f328o = i4;
        this.p = i5;
        this.q = i6;
        this.r = r7000310675073492254;
        this.s = i7;
        this.t = i8;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final Map a() {
        return this.e.a();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final void b() {
        this.e.b();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final L12639328004344855510 c() {
        return this.e.c();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int d() {
        return this.e.d();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 e() {
        return this.e.e();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 f() {
        return this.e.f();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int g() {
        return this.e.g();
    }

    public final K15976628200778816833 h(int i, boolean z) {
        P3691876431017196508 p3691876431017196508;
        int i2;
        List list;
        int i3;
        int i4;
        long j;
        List list2;
        if (this.g) {
            return null;
        }
        List list3 = this.n;
        if (list3.isEmpty() || (p3691876431017196508 = this.a) == null) {
            return null;
        }
        int i5 = p3691876431017196508.g;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        V2435767323669307206 v2435767323669307206 = (V2435767323669307206) R9411874267597469228.B0(list3);
        V2435767323669307206 v24357673236693072062 = (V2435767323669307206) R9411874267597469228.K0(list3);
        if (v2435767323669307206.z || v24357673236693072062.z) {
            return null;
        }
        int i7 = this.p;
        int i8 = this.f328o;
        R7000310675073492254 r7000310675073492254 = this.r;
        if (i < 0) {
            if (Math.min((v2435767323669307206.l() + I3887072968740112330.E(v2435767323669307206, r7000310675073492254)) - i8, (v24357673236693072062.l() + I3887072968740112330.E(v24357673236693072062, r7000310675073492254)) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - I3887072968740112330.E(v2435767323669307206, r7000310675073492254), i7 - I3887072968740112330.E(v24357673236693072062, r7000310675073492254)) <= i) {
            return null;
        }
        int size = list3.size();
        int i9 = 0;
        while (i9 < size) {
            V2435767323669307206 v24357673236693072063 = (V2435767323669307206) list3.get(i9);
            v24357673236693072063.getClass();
            if (v24357673236693072063.z) {
                list = list3;
                i3 = size;
                i2 = i6;
            } else {
                long j2 = v24357673236693072063.w;
                long j3 = 4294967295L;
                i2 = i6;
                v24357673236693072063.w = (((int) (j2 >> 32)) << 32) | ((((int) (j2 & 4294967295L)) + i) & 4294967295L);
                if (z) {
                    int size2 = v24357673236693072063.g.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        I13087925019311684776 a = v24357673236693072063.j.a(i10, v24357673236693072063.b);
                        if (a != null) {
                            long j4 = a.l;
                            j = j3;
                            list2 = list3;
                            i4 = size;
                            a.l = ((((int) (j4 & j)) + i) & j) | (((int) (j4 >> 32)) << 32);
                        } else {
                            i4 = size;
                            j = j3;
                            list2 = list3;
                        }
                        i10++;
                        list3 = list2;
                        j3 = j;
                        size = i4;
                    }
                }
                list = list3;
                i3 = size;
            }
            i9++;
            i6 = i2;
            list3 = list;
            size = i3;
        }
        return new K15976628200778816833(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list3, this.f328o, this.p, this.q, r7000310675073492254, this.s, this.t);
    }

    public final long i() {
        H11646813293457574213 h11646813293457574213 = this.e;
        return (h11646813293457574213.g() << 32) | (h11646813293457574213.d() & 4294967295L);
    }
}
