package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D13420466064020214464 extends M4722199849958580248 {
    public final F4096073349764486348 e;
    public final M4722199849958580248 f;

    public D13420466064020214464(long j, D7201182503133677242 d7201182503133677242, F4096073349764486348 f4096073349764486348, M4722199849958580248 m4722199849958580248) {
        super(j, d7201182503133677242);
        this.e = f4096073349764486348;
        this.f = m4722199849958580248;
        m4722199849958580248.k();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void c() {
        M4722199849958580248 m4722199849958580248 = this.f;
        if (this.c) {
            return;
        }
        if (this.b != m4722199849958580248.g()) {
            a();
        }
        m4722199849958580248.l();
        this.c = true;
        synchronized (D459204867321966484.c) {
            o();
        }
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final F4096073349764486348 e() {
        return this.e;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final boolean f() {
        return true;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final M4722199849958580248 u(F4096073349764486348 f4096073349764486348) {
        return new D13420466064020214464(this.b, this.a, D459204867321966484.i(f4096073349764486348, this.e, true), this.f);
    }
}
