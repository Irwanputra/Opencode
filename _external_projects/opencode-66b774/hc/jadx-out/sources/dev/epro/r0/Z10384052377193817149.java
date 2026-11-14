package dev.epro.r0;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z10384052377193817149 implements H11646813293457574213 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final R7000310675073492254 e;
    public final int f;
    public final int g;
    public final int h;
    public final A17975991316152527869 i;
    public final A17975991316152527869 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final E12579343433108873398 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H11646813293457574213 f596o;
    public final boolean p;
    public final List q;
    public final List r;
    public final W5797197595347441198 s;
    public final R8540738700654750557 t;
    public final long u;

    public Z10384052377193817149(List list, int i, int i2, int i3, R7000310675073492254 r7000310675073492254, int i4, int i5, int i6, A17975991316152527869 a17975991316152527869, A17975991316152527869 a179759913161525278692, float f, int i7, boolean z, E12579343433108873398 e12579343433108873398, H11646813293457574213 h11646813293457574213, boolean z2, List list2, List list3, W5797197595347441198 w5797197595347441198, R8540738700654750557 r8540738700654750557, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = r7000310675073492254;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = a17975991316152527869;
        this.j = a179759913161525278692;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = e12579343433108873398;
        this.f596o = h11646813293457574213;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = w5797197595347441198;
        this.t = r8540738700654750557;
        this.u = j;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final Map a() {
        return this.f596o.a();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final void b() {
        this.f596o.b();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final L12639328004344855510 c() {
        return this.f596o.c();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int d() {
        return this.f596o.d();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 e() {
        return this.f596o.e();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 f() {
        return this.f596o.f();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int g() {
        return this.f596o.g();
    }

    public final Z10384052377193817149 h(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        A17975991316152527869 a17975991316152527869 = (A17975991316152527869) R9411874267597469228.B0(list);
        A17975991316152527869 a179759913161525278692 = (A17975991316152527869) R9411874267597469228.K0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((a17975991316152527869.j + i3) - i5, (a179759913161525278692.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - a17975991316152527869.j, i4 - a179759913161525278692.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((A17975991316152527869) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((A17975991316152527869) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((A17975991316152527869) list3.get(i8)).a(i);
        }
        return new Z10384052377193817149(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.f596o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long i() {
        H11646813293457574213 h11646813293457574213 = this.f596o;
        return (((long) h11646813293457574213.g()) << 32) | (((long) h11646813293457574213.d()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Z10384052377193817149(int i, int i2, int i3, int i4, int i5, int i6, E12579343433108873398 e12579343433108873398, H11646813293457574213 h11646813293457574213, W5797197595347441198 w5797197595347441198, R8540738700654750557 r8540738700654750557, long j) {
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        this(o2161699089510411363, i, i2, i3, R7000310675073492254.b, i4, i5, i6, null, null, 0.0f, 0, false, e12579343433108873398, h11646813293457574213, false, o2161699089510411363, o2161699089510411363, w5797197595347441198, r8540738700654750557, j);
    }
}
