package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F14379067091828059340 extends O11762812214053478134 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F14379067091828059340(dev.epro.r0.R4833348786910499294 r3, dev.epro.r0.G8001132634698687269 r4) {
        /*
            r2 = this;
            dev.epro.r0.G10663294199982376259 r0 = dev.epro.r0.G10663294199982376259.d
            dev.epro.r0.H7323971265464188398 r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            dev.epro.r0.G8001132634698687269 r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.e = r0
            dev.epro.r0.G8001132634698687269 r3 = r3.getContext()
            dev.epro.r0.T13350664027331345869 r0 = dev.epro.r0.T13350664027331345869.s
            dev.epro.r0.H7323971265464188398 r3 = r3.get(r0)
            boolean r3 = r3 instanceof dev.epro.r0.D11883231851729262595
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = dev.epro.r0.S10823041268949770285.c0(r4, r3)
            dev.epro.r0.S10823041268949770285.X(r4, r3)
            r2.j0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F14379067091828059340.<init>(dev.epro.r0.R4833348786910499294, dev.epro.r0.G8001132634698687269):void");
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
        Object l0 = Q13169198992966610970.l0(obj);
        R4833348786910499294 r4833348786910499294 = this.d;
        G8001132634698687269 context = r4833348786910499294.getContext();
        Object c0 = S10823041268949770285.c0(context, null);
        F14379067091828059340 N = c0 != S10823041268949770285.e ? E12775674050813925581.N(r4833348786910499294, context, c0) : null;
        try {
            this.d.resumeWith(l0);
            if (N == null || N.i0()) {
                S10823041268949770285.X(context, c0);
            }
        } catch (Throwable th) {
            if (N == null || N.i0()) {
                S10823041268949770285.X(context, c0);
            }
            throw th;
        }
    }
}
