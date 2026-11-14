package dev.epro.r0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class B14040374145288525816 extends L7743116545240101509 implements Runnable {
    public I13152720973475179368 h;
    public Class i;
    public Object j;

    public B14040374145288525816(I13152720973475179368 i13152720973475179368, Class cls, Object obj) {
        this.h = i13152720973475179368;
        this.i = cls;
        this.j = obj;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        I13152720973475179368 i13152720973475179368 = this.h;
        if ((i13152720973475179368 != null) & (this.a instanceof P421411870588928118)) {
            i13152720973475179368.cancel(o());
        }
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        String str;
        I13152720973475179368 i13152720973475179368 = this.h;
        Class cls = this.i;
        Object obj = this.j;
        String strI = super.i();
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

    public Object r(Object obj, Throwable th) {
        R3171298526896875739 r3171298526896875739 = (R3171298526896875739) obj;
        D16915945238461757356 d16915945238461757356Apply = r3171298526896875739.apply(th);
        if (d16915945238461757356Apply != null) {
            return d16915945238461757356Apply;
        }
        Z3383101362411723454.k(E17665849472693074628.f("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", r3171298526896875739));
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        I13152720973475179368 i13152720973475179368 = this.h;
        Class cls = this.i;
        Object obj = this.j;
        if (((obj == null) || ((i13152720973475179368 == null) | (cls == null))) || (this.a instanceof P421411870588928118)) {
            return;
        }
        this.h = null;
        if (i13152720973475179368 != null) {
            try {
                e = i13152720973475179368.n();
            } catch (Error e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + i13152720973475179368.getClass() + " threw " + e4.getClass() + " without a cause");
                }
                e = cause;
            }
        } else {
            e = null;
        }
        Object objF = e == null ? M9216324016624295870.F(i13152720973475179368) : null;
        if (e == null) {
            k(objF);
            return;
        }
        if (!cls.isInstance(e)) {
            m(i13152720973475179368);
            return;
        }
        try {
            Object objR = r(obj, e);
            this.i = null;
            this.j = null;
            s(objR);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                l(th);
            } finally {
                this.i = null;
                this.j = null;
            }
        }
    }

    public void s(Object obj) {
        m((D16915945238461757356) obj);
    }
}
