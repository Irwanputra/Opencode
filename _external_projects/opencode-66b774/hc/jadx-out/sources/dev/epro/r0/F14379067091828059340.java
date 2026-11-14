package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F14379067091828059340 extends O11762812214053478134 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public F14379067091828059340(R4833348786910499294 r4833348786910499294, G8001132634698687269 g8001132634698687269) {
        G10663294199982376259 g10663294199982376259 = G10663294199982376259.d;
        super(r4833348786910499294, g8001132634698687269.get(g10663294199982376259) == null ? g8001132634698687269.plus(g10663294199982376259) : g8001132634698687269);
        this.e = new ThreadLocal();
        if (r4833348786910499294.getContext().get(T13350664027331345869.s) instanceof D11883231851729262595) {
            return;
        }
        Object objC0 = S10823041268949770285.c0(g8001132634698687269, null);
        S10823041268949770285.X(g8001132634698687269, objC0);
        j0(g8001132634698687269, objC0);
    }

    public final boolean i0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void j0(G8001132634698687269 g8001132634698687269, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new H9390398899829886498(g8001132634698687269, obj));
    }

    @Override // dev.epro.r0.O11762812214053478134, dev.epro.r0.U4020053660465689583
    public final void w(Object obj) {
        if (this.threadLocalIsSet) {
            H9390398899829886498 h9390398899829886498 = (H9390398899829886498) this.e.get();
            if (h9390398899829886498 != null) {
                S10823041268949770285.X((G8001132634698687269) h9390398899829886498.a, h9390398899829886498.b);
            }
            this.e.remove();
        }
        Object objL0 = Q13169198992966610970.l0(obj);
        R4833348786910499294 r4833348786910499294 = this.d;
        G8001132634698687269 context = r4833348786910499294.getContext();
        Object objC0 = S10823041268949770285.c0(context, null);
        F14379067091828059340 f14379067091828059340N = objC0 != S10823041268949770285.e ? E12775674050813925581.N(r4833348786910499294, context, objC0) : null;
        try {
            this.d.resumeWith(objL0);
            if (f14379067091828059340N == null || f14379067091828059340N.i0()) {
                S10823041268949770285.X(context, objC0);
            }
        } catch (Throwable th) {
            if (f14379067091828059340N == null || f14379067091828059340N.i0()) {
                S10823041268949770285.X(context, objC0);
            }
            throw th;
        }
    }
}
