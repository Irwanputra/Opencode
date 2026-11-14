package dev.epro.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class B11509606741455062017 extends L7743116545240101509 implements Runnable {
    public D16915945238461757356 h;
    public Object i;

    public B11509606741455062017(D16915945238461757356 d16915945238461757356, Object obj) {
        d16915945238461757356.getClass();
        this.h = d16915945238461757356;
        this.i = obj;
    }

    public static V9379369092627242728 r(D16915945238461757356 d16915945238461757356, R3171298526896875739 r3171298526896875739, Executor executor) {
        executor.getClass();
        V9379369092627242728 v9379369092627242728 = new V9379369092627242728(d16915945238461757356, r3171298526896875739);
        d16915945238461757356.a(v9379369092627242728, C12265524002282074474.b0(executor, v9379369092627242728));
        return v9379369092627242728;
    }

    public static T7468265282056741718 s(D16915945238461757356 d16915945238461757356, W6764693637816104089 w6764693637816104089, Executor executor) {
        T7468265282056741718 t7468265282056741718 = new T7468265282056741718(d16915945238461757356, w6764693637816104089);
        d16915945238461757356.a(t7468265282056741718, C12265524002282074474.b0(executor, t7468265282056741718));
        return t7468265282056741718;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        D16915945238461757356 d16915945238461757356 = this.h;
        if ((d16915945238461757356 != null) & (this.a instanceof P421411870588928118)) {
            d16915945238461757356.cancel(o());
        }
        this.h = null;
        this.i = null;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        String str;
        D16915945238461757356 d16915945238461757356 = this.h;
        Object obj = this.i;
        String i = super.i();
        if (d16915945238461757356 != null) {
            str = "inputFuture=[" + d16915945238461757356 + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (i != null) {
                return str.concat(i);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        D16915945238461757356 d16915945238461757356 = this.h;
        Object obj = this.i;
        if (((this.a instanceof P421411870588928118) | (d16915945238461757356 == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (d16915945238461757356.isCancelled()) {
            m(d16915945238461757356);
            return;
        }
        try {
            try {
                Object t = t(obj, M9216324016624295870.F(d16915945238461757356));
                this.i = null;
                u(t);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    l(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            l(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            l(e2);
        } catch (ExecutionException e3) {
            l(e3.getCause());
        }
    }

    public Object t(Object obj, Object obj2) {
        R3171298526896875739 r3171298526896875739 = (R3171298526896875739) obj;
        D16915945238461757356 apply = r3171298526896875739.apply(obj2);
        if (apply != null) {
            return apply;
        }
        Z3383101362411723454.k(E17665849472693074628.f("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", r3171298526896875739));
        return null;
    }

    public void u(Object obj) {
        m((D16915945238461757356) obj);
    }
}
