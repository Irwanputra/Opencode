package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B11509606741455062017 extends dev.epro.r0.L7743116545240101509 implements java.lang.Runnable {
    public dev.epro.r0.D16915945238461757356 h;
    public java.lang.Object i;

    public B11509606741455062017(dev.epro.r0.D16915945238461757356 d16915945238461757356, java.lang.Object obj) {
        d16915945238461757356.getClass();
        this.h = d16915945238461757356;
        this.i = obj;
    }

    public static dev.epro.r0.V9379369092627242728 r(dev.epro.r0.D16915945238461757356 d16915945238461757356, dev.epro.r0.R3171298526896875739 r3171298526896875739, java.util.concurrent.Executor executor) {
        executor.getClass();
        dev.epro.r0.V9379369092627242728 v9379369092627242728 = new dev.epro.r0.V9379369092627242728(d16915945238461757356, r3171298526896875739);
        d16915945238461757356.a(v9379369092627242728, dev.epro.r0.C12265524002282074474.b0(executor, v9379369092627242728));
        return v9379369092627242728;
    }

    public static dev.epro.r0.T7468265282056741718 s(dev.epro.r0.D16915945238461757356 d16915945238461757356, dev.epro.r0.W6764693637816104089 w6764693637816104089, java.util.concurrent.Executor executor) {
        dev.epro.r0.T7468265282056741718 t7468265282056741718 = new dev.epro.r0.T7468265282056741718(d16915945238461757356, w6764693637816104089);
        d16915945238461757356.a(t7468265282056741718, dev.epro.r0.C12265524002282074474.b0(executor, t7468265282056741718));
        return t7468265282056741718;
    }

    public final void c() {
        dev.epro.r0.D16915945238461757356 d16915945238461757356 = this.h;
        if ((d16915945238461757356 != null) & (((dev.epro.r0.R4225980552687347745) this).a instanceof dev.epro.r0.P421411870588928118)) {
            d16915945238461757356.cancel(o());
        }
        this.h = null;
        this.i = null;
    }

    public final java.lang.String i() {
        java.lang.String str;
        dev.epro.r0.D16915945238461757356 d16915945238461757356 = this.h;
        java.lang.Object obj = this.i;
        java.lang.String strI = super/*dev.epro.r0.R4225980552687347745*/.i();
        if (d16915945238461757356 != null) {
            str = "inputFuture=[" + d16915945238461757356 + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strI != null) {
                return str.concat(strI);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        dev.epro.r0.D16915945238461757356 d16915945238461757356 = this.h;
        java.lang.Object obj = this.i;
        if (((((dev.epro.r0.R4225980552687347745) this).a instanceof dev.epro.r0.P421411870588928118) | (d16915945238461757356 == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (d16915945238461757356.isCancelled()) {
            m(d16915945238461757356);
            return;
        }
        try {
            try {
                java.lang.Object objT = t(obj, dev.epro.r0.M9216324016624295870.F(d16915945238461757356));
                this.i = null;
                u(objT);
            } catch (java.lang.Throwable th) {
                try {
                    if (th instanceof java.lang.InterruptedException) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    l(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (java.lang.Error e) {
            l(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.lang.RuntimeException e2) {
            l(e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            l(e3.getCause());
        }
    }

    public java.lang.Object t(java.lang.Object obj, java.lang.Object obj2) {
        dev.epro.r0.R3171298526896875739 r3171298526896875739 = (dev.epro.r0.R3171298526896875739) obj;
        dev.epro.r0.D16915945238461757356 d16915945238461757356Apply = r3171298526896875739.apply(obj2);
        if (d16915945238461757356Apply != null) {
            return d16915945238461757356Apply;
        }
        dev.epro.r0.Z3383101362411723454.k(dev.epro.r0.E17665849472693074628.f("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", r3171298526896875739));
        return null;
    }

    public void u(java.lang.Object obj) {
        m((dev.epro.r0.D16915945238461757356) obj);
    }
}
