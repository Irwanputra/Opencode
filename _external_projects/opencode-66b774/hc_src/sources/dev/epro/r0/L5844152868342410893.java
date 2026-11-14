package dev.epro.r0;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class L5844152868342410893 extends I11965759855724288421 implements G17613326942144185441 {
    public final Y4989033692226475498 u;
    public LinkedHashMap w;
    public H11646813293457574213 y;
    public final M8849337839148886240 z;
    public long v = 0;
    public final A16702659903939584452 x = new A16702659903939584452(this);

    public L5844152868342410893(Y4989033692226475498 y4989033692226475498) {
        this.u = y4989033692226475498;
        M8849337839148886240 m8849337839148886240 = C7857973833719834669.a;
        this.z = new M8849337839148886240();
    }

    @Override // dev.epro.r0.I11965759855724288421, dev.epro.r0.J4720286603213127984
    public final boolean A() {
        return true;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final B1029012102904255937 B0() {
        return this.x;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final boolean F0() {
        return this.y != null;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final H11725168162114556860 G0() {
        return this.u.u;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final H11646813293457574213 H0() {
        H11646813293457574213 h11646813293457574213 = this.y;
        if (h11646813293457574213 != null) {
            return h11646813293457574213;
        }
        throw L11610354117192841236.j("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final I11965759855724288421 I0() {
        Y4989033692226475498 y4989033692226475498 = this.u.w;
        if (y4989033692226475498 != null) {
            return y4989033692226475498.c1();
        }
        return null;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final long J0() {
        return this.v;
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final void Q0() {
        n0(this.v, 0.0f, null);
    }

    public void T0() {
        H0().b();
    }

    public final void U0(long j) {
        if (!Q2551293802323679034.b(this.v, j)) {
            this.v = j;
            Y4989033692226475498 y4989033692226475498 = this.u;
            L8383256292871170816 l8383256292871170816 = y4989033692226475498.u.G.q;
            if (l8383256292871170816 != null) {
                l8383256292871170816.x0();
            }
            I11965759855724288421.N0(y4989033692226475498);
        }
        if (this.f283o) {
            return;
        }
        x0(H0());
    }

    public final long V0(L5844152868342410893 l5844152868342410893, boolean z) {
        long j = 0;
        while (!this.equals(l5844152868342410893)) {
            if (!this.l || !z) {
                j = Q2551293802323679034.d(j, this.v);
            }
            Y4989033692226475498 y4989033692226475498 = this.u.w;
            y4989033692226475498.getClass();
            this = y4989033692226475498.c1();
            this.getClass();
        }
        return j;
    }

    public final void W0(H11646813293457574213 h11646813293457574213) {
        LinkedHashMap linkedHashMap;
        if (h11646813293457574213 != null) {
            q0((h11646813293457574213.d() & 4294967295L) | (h11646813293457574213.g() << 32));
        } else {
            q0(0L);
        }
        if (!S10823041268949770285.t(this.y, h11646813293457574213) && h11646813293457574213 != null && ((((linkedHashMap = this.w) != null && !linkedHashMap.isEmpty()) || !h11646813293457574213.a().isEmpty()) && !S10823041268949770285.t(h11646813293457574213.a(), this.w))) {
            L8383256292871170816 l8383256292871170816 = this.u.u.G.q;
            l8383256292871170816.getClass();
            l8383256292871170816.s.f();
            LinkedHashMap linkedHashMap2 = this.w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(h11646813293457574213.a());
        }
        this.y = h11646813293457574213;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.u.c();
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final F10342546226345611902 getLayoutDirection() {
        return this.u.u.z;
    }

    @Override // dev.epro.r0.Z17471428274427141949, dev.epro.r0.G17613326942144185441
    public final Object k() {
        return this.u.k();
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void n0(long j, float f, F4096073349764486348 f4096073349764486348) {
        U0(j);
        if (this.n) {
            return;
        }
        T0();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.u.s();
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final I11965759855724288421 z0() {
        Y4989033692226475498 y4989033692226475498 = this.u.v;
        if (y4989033692226475498 != null) {
            return y4989033692226475498.c1();
        }
        return null;
    }
}
