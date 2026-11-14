package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N12138132444961730128 extends L6855102173777462404 {
    public final A4559761392562572984 b;
    public final ArrayList c;
    public final A4559761392562572984 d;
    public final L4980660535418402690 e;

    public N12138132444961730128() {
        super((byte) 2);
        this.b = E7125458317232359087.f();
        this.c = new ArrayList();
        this.d = new A4559761392562572984();
        Q15027034467569330017 q15027034467569330017 = new Q15027034467569330017(this, (byte) 4);
        D459204867321966484.b(D459204867321966484.a);
        synchronized (D459204867321966484.c) {
            D459204867321966484.h = R9411874267597469228.P0(D459204867321966484.h, q15027034467569330017);
        }
        this.e = new L4980660535418402690(q15027034467569330017, (byte) 8);
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void c(N13814068345032586384 n13814068345032586384) {
        this.c.add(new F9391898320595800750(n13814068345032586384));
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void d() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    X15580384018267311831 x15580384018267311831 = (X15580384018267311831) arrayList.get(i);
                    if (x15580384018267311831 instanceof E2417936544745582743) {
                        E7125458317232359087.e(this.b, ((E2417936544745582743) x15580384018267311831).a, ((E2417936544745582743) x15580384018267311831).b);
                    } else {
                        if (!(x15580384018267311831 instanceof F9391898320595800750)) {
                            throw new M8821877208104636290();
                        }
                        E7125458317232359087.p(this.b, ((F9391898320595800750) x15580384018267311831).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void e() {
        this.e.d();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final F4096073349764486348 k(N13814068345032586384 n13814068345032586384) {
        A4559761392562572984 a4559761392562572984 = this.d;
        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) a4559761392562572984.g(n13814068345032586384);
        if (f4096073349764486348 == null) {
            f4096073349764486348 = new B2138252231653711516(this, n13814068345032586384, (byte) 22);
            int f = a4559761392562572984.f(n13814068345032586384);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = a4559761392562572984.c;
            Object obj = objArr[f];
            a4559761392562572984.b[f] = n13814068345032586384;
            objArr[f] = f4096073349764486348;
        }
        return f4096073349764486348;
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void l(E5386183571211952538 e5386183571211952538) {
        this.d.l(e5386183571211952538);
        c(e5386183571211952538);
        d();
    }
}
