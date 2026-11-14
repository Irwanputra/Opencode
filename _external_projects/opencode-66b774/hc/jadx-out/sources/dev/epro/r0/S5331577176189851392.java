package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S5331577176189851392 extends M4722199849958580248 {
    public final M4722199849958580248 e;
    public final boolean f;
    public final boolean g;
    public F4096073349764486348 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5331577176189851392(M4722199849958580248 m4722199849958580248, F4096073349764486348 f4096073349764486348, boolean z, boolean z2) {
        F4096073349764486348 f4096073349764486348E;
        super(0L, D7201182503133677242.e);
        Y13361005827119333637 y13361005827119333637 = D459204867321966484.a;
        this.e = m4722199849958580248;
        this.f = z;
        this.g = z2;
        this.h = D459204867321966484.i(f4096073349764486348, (m4722199849958580248 == null || (f4096073349764486348E = m4722199849958580248.e()) == null) ? D459204867321966484.j.e : f4096073349764486348E, z);
        this.i = Q9282725956684299602.g();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void c() {
        M4722199849958580248 m4722199849958580248;
        this.c = true;
        if (!this.g || (m4722199849958580248 = this.e) == null) {
            return;
        }
        m4722199849958580248.c();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final D7201182503133677242 d() {
        return v().d();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final F4096073349764486348 e() {
        return this.h;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final boolean f() {
        return v().f();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final long g() {
        return v().g();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final F4096073349764486348 i() {
        return null;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void k() {
        O17574792317020433029.q();
        throw null;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void l() {
        O17574792317020433029.q();
        throw null;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void m() {
        v().m();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void n(O13595511762861117873 o13595511762861117873) {
        v().n(o13595511762861117873);
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final M4722199849958580248 u(F4096073349764486348 f4096073349764486348) {
        F4096073349764486348 f4096073349764486348I = D459204867321966484.i(f4096073349764486348, this.h, true);
        return !this.f ? D459204867321966484.e(v().u(null), f4096073349764486348I, true) : v().u(f4096073349764486348I);
    }

    public final M4722199849958580248 v() {
        M4722199849958580248 m4722199849958580248 = this.e;
        return m4722199849958580248 == null ? D459204867321966484.j : m4722199849958580248;
    }
}
