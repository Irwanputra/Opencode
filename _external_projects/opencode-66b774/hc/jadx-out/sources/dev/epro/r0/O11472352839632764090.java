package dev.epro.r0;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O11472352839632764090 implements H11646813293457574213 {
    public final H3043063065558747866 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final H11646813293457574213 e;
    public final float f;
    public final boolean g;
    public final W5797197595347441198 h;
    public final R8540738700654750557 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f395o;
    public final R7000310675073492254 p;
    public final int q;
    public final int r;

    public O11472352839632764090(H3043063065558747866 h3043063065558747866, int i, boolean z, float f, H11646813293457574213 h11646813293457574213, float f2, boolean z2, W5797197595347441198 w5797197595347441198, R8540738700654750557 r8540738700654750557, long j, int i2, List list, int i3, int i4, int i5, R7000310675073492254 r7000310675073492254, int i6, int i7) {
        this.a = h3043063065558747866;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = h11646813293457574213;
        this.f = f2;
        this.g = z2;
        this.h = w5797197595347441198;
        this.i = r8540738700654750557;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.f395o = i5;
        this.p = r7000310675073492254;
        this.q = i6;
        this.r = i7;
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

    public final O11472352839632764090 h(int i, boolean z) {
        H3043063065558747866 h3043063065558747866;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (h3043063065558747866 = this.a) == null) {
            return null;
        }
        int iM = h3043063065558747866.m();
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= iM) {
            return null;
        }
        H3043063065558747866 h30430630655587478662 = (H3043063065558747866) R9411874267597469228.B0(list);
        H3043063065558747866 h30430630655587478663 = (H3043063065558747866) R9411874267597469228.K0(list);
        if (h30430630655587478662.v || h30430630655587478663.v) {
            return null;
        }
        int i6 = h30430630655587478662.f271o;
        int i7 = this.n;
        int i8 = this.m;
        if (i < 0) {
            if (Math.min((h30430630655587478662.m() + i6) - i8, (h30430630655587478663.m() + h30430630655587478663.f271o) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - i6, i7 - h30430630655587478663.f271o) <= i) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            H3043063065558747866 h30430630655587478664 = (H3043063065558747866) list.get(i9);
            boolean z2 = h30430630655587478664.c;
            int[] iArr = h30430630655587478664.z;
            if (!h30430630655587478664.v) {
                h30430630655587478664.f271o += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = h30430630655587478664.b.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        I13087925019311684776 i13087925019311684776A = h30430630655587478664.m.a(i12, h30430630655587478664.k);
                        if (i13087925019311684776A != null) {
                            long j = i13087925019311684776A.l;
                            if (z2) {
                                i2 = i5;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i5;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            i13087925019311684776A.l = (((long) i4) & 4294967295L) | (((long) i3) << 32);
                        } else {
                            i2 = i5;
                        }
                        i12++;
                        i5 = i2;
                    }
                }
            }
            i9++;
            i5 = i5;
        }
        return new O11472352839632764090(this.a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.f395o, this.p, this.q, this.r);
    }

    public final long i() {
        H11646813293457574213 h11646813293457574213 = this.e;
        return (((long) h11646813293457574213.g()) << 32) | (((long) h11646813293457574213.d()) & 4294967295L);
    }
}
