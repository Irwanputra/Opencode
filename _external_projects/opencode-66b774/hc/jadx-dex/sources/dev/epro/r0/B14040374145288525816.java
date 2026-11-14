package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B14040374145288525816 extends dev.epro.r0.L7743116545240101509 implements java.lang.Runnable {
    public dev.epro.r0.I13152720973475179368 h;
    public java.lang.Class i;
    public java.lang.Object j;

    public B14040374145288525816(dev.epro.r0.I13152720973475179368 i13152720973475179368, java.lang.Class cls, java.lang.Object obj) {
        this.h = i13152720973475179368;
        this.i = cls;
        this.j = obj;
    }

    public final void c() {
        dev.epro.r0.I13152720973475179368 i13152720973475179368 = this.h;
        if ((i13152720973475179368 != null) & (((dev.epro.r0.R4225980552687347745) this).a instanceof dev.epro.r0.P421411870588928118)) {
            i13152720973475179368.cancel(o());
        }
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final java.lang.String i() {
        java.lang.String str;
        dev.epro.r0.I13152720973475179368 i13152720973475179368 = this.h;
        java.lang.Class cls = this.i;
        java.lang.Object obj = this.j;
        java.lang.String strI = super/*dev.epro.r0.R4225980552687347745*/.i();
        if (i13152720973475179368 != null) {
            str = "inputFuture=[" + i13152720973475179368 + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strI != null) {
                return str.concat(strI);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public java.lang.Object r(java.lang.Object obj, java.lang.Throwable th) {
        dev.epro.r0.R3171298526896875739 r3171298526896875739 = (dev.epro.r0.R3171298526896875739) obj;
        dev.epro.r0.D16915945238461757356 d16915945238461757356Apply = r3171298526896875739.apply(th);
        if (d16915945238461757356Apply != null) {
            return d16915945238461757356Apply;
        }
        dev.epro.r0.Z3383101362411723454.k(dev.epro.r0.E17665849472693074628.f("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", r3171298526896875739));
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable e;
        dev.epro.r0.I13152720973475179368 i13152720973475179368 = this.h;
        java.lang.Class cls = this.i;
        java.lang.Object obj = this.j;
        if (((obj == null) || ((i13152720973475179368 == null) | (cls == null))) || (((dev.epro.r0.R4225980552687347745) this).a instanceof dev.epro.r0.P421411870588928118)) {
            return;
        }
        this.h = null;
        if (i13152720973475179368 != null) {
            try {
                e = i13152720973475179368.n();
            } catch (java.lang.Error e2) {
                e = e2;
            } catch (java.lang.RuntimeException e3) {
                e = e3;
            } catch (java.util.concurrent.ExecutionException e4) {
                java.lang.Throwable cause = e4.getCause();
                if (cause == null) {
                    cause = new java.lang.NullPointerException("Future type " + i13152720973475179368.getClass() + " threw " + e4.getClass() + " without a cause");
                }
                e = cause;
            }
        } else {
            e = null;
        }
        java.lang.Object objF = e == null ? dev.epro.r0.M9216324016624295870.F(i13152720973475179368) : null;
        if (e == null) {
            k(objF);
            return;
        }
        if (!cls.isInstance(e)) {
            m(i13152720973475179368);
            return;
        }
        try {
            java.lang.Object objR = r(obj, e);
            this.i = null;
            this.j = null;
            s(objR);
        } catch (java.lang.Throwable th) {
            try {
                if (th instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                l(th);
            } finally {
                this.i = null;
                this.j = null;
            }
        }
    }

    public void s(java.lang.Object obj) {
        m((dev.epro.r0.D16915945238461757356) obj);
    }
}
