package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class M4722199849958580248 {
    public D7201182503133677242 a;
    public long b;
    public boolean c;
    public int d;

    public M4722199849958580248(long j, D7201182503133677242 d7201182503133677242) {
        int i;
        int numberOfTrailingZeros;
        this.a = d7201182503133677242;
        this.b = j;
        Y13361005827119333637 y13361005827119333637 = D459204867321966484.a;
        if (j != 0) {
            D7201182503133677242 d = d();
            long j2 = d.c;
            long[] jArr = d.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (D459204867321966484.c) {
                i = D459204867321966484.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(M4722199849958580248 m4722199849958580248) {
        D459204867321966484.b.w(m4722199849958580248);
    }

    public final void a() {
        synchronized (D459204867321966484.c) {
            b();
            p();
        }
    }

    public void b() {
        D459204867321966484.d = D459204867321966484.d.b(g());
    }

    public abstract void c();

    public D7201182503133677242 d() {
        return this.a;
    }

    public abstract F4096073349764486348 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public F4096073349764486348 i() {
        return null;
    }

    public final M4722199849958580248 j() {
        I1632105416032993715 i1632105416032993715 = D459204867321966484.b;
        M4722199849958580248 m4722199849958580248 = (M4722199849958580248) i1632105416032993715.e();
        i1632105416032993715.w(this);
        return m4722199849958580248;
    }

    public void k() {
        O17574792317020433029.q();
        throw null;
    }

    public void l() {
        O17574792317020433029.q();
        throw null;
    }

    public void n(O13595511762861117873 o13595511762861117873) {
        Y13361005827119333637 y13361005827119333637 = D459204867321966484.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            D459204867321966484.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(D7201182503133677242 d7201182503133677242) {
        this.a = d7201182503133677242;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract M4722199849958580248 u(F4096073349764486348 f4096073349764486348);

    public void m() {
    }
}
