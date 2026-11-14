package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D13420466064020214464 extends dev.epro.r0.M4722199849958580248 {
    public final dev.epro.r0.F4096073349764486348 e;
    public final dev.epro.r0.M4722199849958580248 f;

    public D13420466064020214464(long j, dev.epro.r0.D7201182503133677242 d7201182503133677242, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M4722199849958580248 m4722199849958580248) {
        super(j, d7201182503133677242);
        this.e = f4096073349764486348;
        this.f = m4722199849958580248;
        m4722199849958580248.k();
    }

    public final void c() {
        dev.epro.r0.M4722199849958580248 m4722199849958580248 = this.f;
        if (((dev.epro.r0.M4722199849958580248) this).c) {
            return;
        }
        if (((dev.epro.r0.M4722199849958580248) this).b != m4722199849958580248.g()) {
            a();
        }
        m4722199849958580248.l();
        ((dev.epro.r0.M4722199849958580248) this).c = true;
        synchronized (dev.epro.r0.D459204867321966484.c) {
            o();
        }
    }

    public final dev.epro.r0.F4096073349764486348 e() {
        return this.e;
    }

    public final boolean f() {
        return true;
    }

    public final dev.epro.r0.M4722199849958580248 u(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        return new dev.epro.r0.D13420466064020214464(((dev.epro.r0.M4722199849958580248) this).b, ((dev.epro.r0.M4722199849958580248) this).a, dev.epro.r0.D459204867321966484.i(f4096073349764486348, this.e, true), this.f);
    }
}
