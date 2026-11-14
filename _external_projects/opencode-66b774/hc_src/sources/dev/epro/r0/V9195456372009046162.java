package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V9195456372009046162 extends M4722199849958580248 {
    public final F4096073349764486348 e;
    public int f;

    public V9195456372009046162(long j, D7201182503133677242 d7201182503133677242, F4096073349764486348 f4096073349764486348) {
        super(j, d7201182503133677242);
        this.e = f4096073349764486348;
        this.f = 1;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
    public final F4096073349764486348 i() {
        return null;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void k() {
        this.f++;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void n(O13595511762861117873 o13595511762861117873) {
        Y13361005827119333637 y13361005827119333637 = D459204867321966484.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final M4722199849958580248 u(F4096073349764486348 f4096073349764486348) {
        D459204867321966484.v(this);
        return new D13420466064020214464(this.b, this.a, D459204867321966484.i(f4096073349764486348, this.e, true), this);
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void m() {
    }
}
