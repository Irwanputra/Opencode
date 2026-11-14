package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H684658346589034901 extends L6855102173777462404 {
    public Object b;
    public Object c;
    public E13273723708836014930 d;
    public E13273723708836014930 e;
    public N13814068345032586384 f;
    public final K13841493441907392258 g;
    public final L4980660535418402690 h;

    public H684658346589034901() {
        super((byte) 2);
        this.g = new K13841493441907392258(this, (byte) 4);
        D3094385331126751133 d3094385331126751133 = new D3094385331126751133(this, (byte) 10);
        D459204867321966484.b(D459204867321966484.a);
        synchronized (D459204867321966484.c) {
            D459204867321966484.h = R9411874267597469228.P0(D459204867321966484.h, d3094385331126751133);
        }
        this.h = new L4980660535418402690(d3094385331126751133, (byte) 8);
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void c(N13814068345032586384 n13814068345032586384) {
        this.c = null;
        this.e = null;
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void d() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    E13273723708836014930 e13273723708836014930 = this.d;
                    if (e13273723708836014930 == null) {
                        E13273723708836014930 e132737237088360149302 = L12621230156277355451.a;
                        e13273723708836014930 = new E13273723708836014930();
                        this.d = e13273723708836014930;
                    }
                    this.d = this.e;
                    this.e = e13273723708836014930;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void e() {
        this.h.d();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final F4096073349764486348 k(N13814068345032586384 n13814068345032586384) {
        N13814068345032586384 n138140683450325863842 = this.f;
        if (n138140683450325863842 != null && !n138140683450325863842.equals(n13814068345032586384)) {
            L4738636499147270068.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = n13814068345032586384;
        return this.g;
    }

    @Override // dev.epro.r0.L6855102173777462404
    public final void l(E5386183571211952538 e5386183571211952538) {
        this.f = null;
        this.c = null;
        this.e = null;
        d();
    }
}
