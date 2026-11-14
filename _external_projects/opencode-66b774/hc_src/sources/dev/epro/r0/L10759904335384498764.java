package dev.epro.r0;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L10759904335384498764 implements I5164649337253478959 {
    public final A8674383068150491476 a;
    public final L16995345256540175694 b;
    public final C6935141804827476266 c;
    public final Q9908018528090167751 d;

    public L10759904335384498764(A8674383068150491476 a8674383068150491476, L16995345256540175694 l16995345256540175694) {
        this.a = a8674383068150491476;
        this.b = l16995345256540175694;
        this.c = (C6935141804827476266) a8674383068150491476.b.invoke();
        C4240022152304578596.a();
        this.d = new Q9908018528090167751();
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final boolean A() {
        return this.b.A();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long E0(float f) {
        return this.b.E0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return this.b.G(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long I(long j) {
        return this.b.I(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float K(float f) {
        return this.b.K(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float M0(int i) {
        return this.b.M0(i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float P0(float f) {
        return this.b.P0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int X(long j) {
        return this.b.X(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        return this.b.Y(j);
    }

    public final List a(int i) {
        Q9908018528090167751 q9908018528090167751 = this.d;
        List list = (List) q9908018528090167751.b(i);
        if (list != null) {
            return list;
        }
        C6935141804827476266 c6935141804827476266 = this.c;
        Object b = c6935141804827476266.b(i);
        List Q = this.b.Q(this.a.a(i, b, c6935141804827476266.c(i)), b);
        q9908018528090167751.i(i, Q);
        return Q;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.b.c();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int g0(float f) {
        return this.b.g0(f);
    }

    @Override // dev.epro.r0.J4720286603213127984
    public final F10342546226345611902 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 m(int i, int i2, Map map, F4096073349764486348 f4096073349764486348) {
        return this.b.m(i, i2, map, f4096073349764486348);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.b.s();
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 t(int i, int i2, Map map, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        return this.b.t(i, i2, map, f4096073349764486348, f40960733497644863482);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long t0(long j) {
        return this.b.t0(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float v0(long j) {
        return this.b.v0(j);
    }
}
