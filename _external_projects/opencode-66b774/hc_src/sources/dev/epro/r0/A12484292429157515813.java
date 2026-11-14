package dev.epro.r0;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A12484292429157515813 implements L16995345256540175694, I5164649337253478959 {
    public final /* synthetic */ M8258878446506793937 a;
    public final /* synthetic */ A12581365276667340144 b;

    public A12484292429157515813(A12581365276667340144 a12581365276667340144) {
        this.b = a12581365276667340144;
        this.a = a12581365276667340144.h;
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final boolean A() {
        return this.a.A();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long E0(float f) {
        return this.a.E0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return this.a.G(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float K(float f) {
        return this.a.c() * f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float P0(float f) {
        return f / this.a.c();
    }

    @Override // dev.epro.r0.L16995345256540175694
    public final List Q(L12639328004344855510 l12639328004344855510, Object obj) {
        A12581365276667340144 a12581365276667340144 = this.b;
        H11725168162114556860 h11725168162114556860 = a12581365276667340144.a;
        A4559761392562572984 a4559761392562572984 = a12581365276667340144.g;
        H11725168162114556860 h117251681621145568602 = (H11725168162114556860) a4559761392562572984.g(obj);
        if (h117251681621145568602 != null && ((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).k(h117251681621145568602) < a12581365276667340144.d) {
            return h117251681621145568602.m();
        }
        A4559761392562572984 a45597613925625729842 = a12581365276667340144.l;
        A4559761392562572984 a45597613925625729843 = a12581365276667340144.j;
        D389890677992184566 d389890677992184566 = a12581365276667340144.m;
        if (d389890677992184566.c < a12581365276667340144.e) {
            P753981624812481271.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        H11725168162114556860 h117251681621145568603 = (H11725168162114556860) a4559761392562572984.g(obj);
        int i = d389890677992184566.c;
        int i2 = a12581365276667340144.e;
        if (i == i2) {
            d389890677992184566.b(obj);
        } else {
            Object[] objArr = d389890677992184566.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        a12581365276667340144.e++;
        boolean b = a45597613925625729843.b(obj);
        if (b || h117251681621145568603 != null) {
            if (!b && h117251681621145568603 != null) {
                a12581365276667340144.j(((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).k(h117251681621145568603), ((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).c);
                a12581365276667340144.f149o++;
                a4559761392562572984.l(obj);
                a45597613925625729843.n(obj, h117251681621145568603);
                a45597613925625729842.n(obj, a12581365276667340144.c(obj));
                if (h11725168162114556860.H()) {
                    a12581365276667340144.h();
                }
            }
            H11725168162114556860 h117251681621145568604 = (H11725168162114556860) a45597613925625729843.g(obj);
            C10361380324006518393 c10361380324006518393 = h117251681621145568604 != null ? (C10361380324006518393) a12581365276667340144.f.g(h117251681621145568604) : null;
            if (c10361380324006518393 != null && c10361380324006518393.d) {
                a12581365276667340144.m(h117251681621145568604, obj, false, l12639328004344855510);
            }
            if ((c10361380324006518393 != null ? c10361380324006518393.f : null) != null) {
                a12581365276667340144.a(c10361380324006518393, true);
            }
        } else {
            a12581365276667340144.k(obj, l12639328004344855510, false);
            a45597613925625729842.n(obj, a12581365276667340144.c(obj));
        }
        H11725168162114556860 h117251681621145568605 = (H11725168162114556860) a45597613925625729843.g(obj);
        if (h117251681621145568605 == null) {
            return O2161699089510411363.a;
        }
        List s0 = h117251681621145568605.G.p.s0();
        K7217096618580727896 k7217096618580727896 = (K7217096618580727896) s0;
        int i3 = ((D389890677992184566) k7217096618580727896.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((T8458668874796040341) k7217096618580727896.get(i4)).f.b = true;
        }
        return s0;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int X(long j) {
        return this.a.X(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        return this.a.Y(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a.b;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int g0(float f) {
        return this.a.g0(f);
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final F10342546226345611902 getLayoutDirection() {
        return this.a.a;
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 m(int i, int i2, Map map, F4096073349764486348 f4096073349764486348) {
        return this.a.t(i, i2, map, null, f4096073349764486348);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.a.c;
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 t(int i, int i2, Map map, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        return this.a.t(i, i2, map, f4096073349764486348, f40960733497644863482);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long t0(long j) {
        return this.a.t0(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float v0(long j) {
        return this.a.v0(j);
    }
}
