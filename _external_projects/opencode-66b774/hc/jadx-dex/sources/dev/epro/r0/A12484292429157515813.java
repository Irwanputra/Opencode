package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12484292429157515813 implements dev.epro.r0.L16995345256540175694, dev.epro.r0.I5164649337253478959 {
    public final /* synthetic */ dev.epro.r0.M8258878446506793937 a;
    public final /* synthetic */ dev.epro.r0.A12581365276667340144 b;

    public A12484292429157515813(dev.epro.r0.A12581365276667340144 a12581365276667340144) {
        this.b = a12581365276667340144;
        this.a = a12581365276667340144.h;
    }

    public final boolean A() {
        return this.a.A();
    }

    public final long E0(float f) {
        return this.a.E0(f);
    }

    public final long G(float f) {
        return this.a.G(f);
    }

    public final long I(long j) {
        return this.a.I(j);
    }

    public final float K(float f) {
        return this.a.c() * f;
    }

    public final float M0(int i) {
        return this.a.M0(i);
    }

    public final float P0(float f) {
        return f / this.a.c();
    }

    public final java.util.List Q(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj) {
        dev.epro.r0.A12581365276667340144 a12581365276667340144 = this.b;
        dev.epro.r0.H11725168162114556860 h11725168162114556860 = a12581365276667340144.a;
        dev.epro.r0.A4559761392562572984 a4559761392562572984 = a12581365276667340144.g;
        dev.epro.r0.H11725168162114556860 h117251681621145568602 = (dev.epro.r0.H11725168162114556860) a4559761392562572984.g(obj);
        if (h117251681621145568602 != null && ((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).k(h117251681621145568602) < a12581365276667340144.d) {
            return h117251681621145568602.m();
        }
        dev.epro.r0.A4559761392562572984 a45597613925625729842 = a12581365276667340144.l;
        dev.epro.r0.A4559761392562572984 a45597613925625729843 = a12581365276667340144.j;
        dev.epro.r0.D389890677992184566 d389890677992184566 = a12581365276667340144.m;
        if (d389890677992184566.c < a12581365276667340144.e) {
            dev.epro.r0.P753981624812481271.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        dev.epro.r0.H11725168162114556860 h117251681621145568603 = (dev.epro.r0.H11725168162114556860) a4559761392562572984.g(obj);
        int i = d389890677992184566.c;
        int i2 = a12581365276667340144.e;
        if (i == i2) {
            d389890677992184566.b(obj);
        } else {
            java.lang.Object[] objArr = d389890677992184566.a;
            java.lang.Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        a12581365276667340144.e++;
        boolean zB = a45597613925625729843.b(obj);
        if (zB || h117251681621145568603 != null) {
            if (!zB && h117251681621145568603 != null) {
                a12581365276667340144.j(((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).k(h117251681621145568603), ((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).c);
                a12581365276667340144.f149o++;
                a4559761392562572984.l(obj);
                a45597613925625729843.n(obj, h117251681621145568603);
                a45597613925625729842.n(obj, a12581365276667340144.c(obj));
                if (h11725168162114556860.H()) {
                    a12581365276667340144.h();
                }
            }
            dev.epro.r0.H11725168162114556860 h117251681621145568604 = (dev.epro.r0.H11725168162114556860) a45597613925625729843.g(obj);
            dev.epro.r0.C10361380324006518393 c10361380324006518393 = h117251681621145568604 != null ? (dev.epro.r0.C10361380324006518393) a12581365276667340144.f.g(h117251681621145568604) : null;
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
        dev.epro.r0.H11725168162114556860 h117251681621145568605 = (dev.epro.r0.H11725168162114556860) a45597613925625729843.g(obj);
        if (h117251681621145568605 == null) {
            return dev.epro.r0.O2161699089510411363.a;
        }
        dev.epro.r0.K7217096618580727896 k7217096618580727896S0 = h117251681621145568605.G.p.s0();
        dev.epro.r0.K7217096618580727896 k7217096618580727896 = k7217096618580727896S0;
        int i3 = ((dev.epro.r0.D389890677992184566) k7217096618580727896.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((dev.epro.r0.T8458668874796040341) k7217096618580727896.get(i4)).f.b = true;
        }
        return k7217096618580727896S0;
    }

    public final int X(long j) {
        return this.a.X(j);
    }

    public final float Y(long j) {
        return this.a.Y(j);
    }

    public final float c() {
        return this.a.b;
    }

    public final int g0(float f) {
        return this.a.g0(f);
    }

    public final dev.epro.r0.F10342546226345611902 getLayoutDirection() {
        return this.a.a;
    }

    public final dev.epro.r0.H11646813293457574213 m(int i, int i2, java.util.Map map, dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        return this.a.t(i, i2, map, (dev.epro.r0.F4096073349764486348) null, f4096073349764486348);
    }

    public final float s() {
        return this.a.c;
    }

    public final dev.epro.r0.H11646813293457574213 t(int i, int i2, java.util.Map map, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482) {
        return this.a.t(i, i2, map, f4096073349764486348, f40960733497644863482);
    }

    public final long t0(long j) {
        return this.a.t0(j);
    }

    public final float v0(long j) {
        return this.a.v0(j);
    }
}
