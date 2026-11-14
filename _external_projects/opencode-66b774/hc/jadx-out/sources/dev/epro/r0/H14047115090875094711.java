package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H14047115090875094711 extends B6457840406537354631 {
    public int c;

    public H14047115090875094711(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract R4833348786910499294 e();

    public Throwable g(Object obj) {
        T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
        if (t13610764347093379131 != null) {
            return t13610764347093379131.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        C9869900372345142877.I(e().getContext(), new K744780780574399899("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            R4833348786910499294 r4833348786910499294E = e();
            r4833348786910499294E.getClass();
            N16152488056535110728 n16152488056535110728 = (N16152488056535110728) r4833348786910499294E;
            K14749510448791472029 k14749510448791472029 = n16152488056535110728.e;
            Object obj = n16152488056535110728.g;
            G8001132634698687269 context = k14749510448791472029.getContext();
            Object objC0 = S10823041268949770285.c0(context, obj);
            Q15035754882231748864 q15035754882231748864 = null;
            F14379067091828059340 f14379067091828059340N = objC0 != S10823041268949770285.e ? E12775674050813925581.N(k14749510448791472029, context, objC0) : null;
            try {
                G8001132634698687269 context2 = k14749510448791472029.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        q15035754882231748864 = (Q15035754882231748864) context2.get(P2382941533350862833.p);
                    }
                }
                if (q15035754882231748864 != null && !q15035754882231748864.b()) {
                    CancellationException cancellationExceptionO = q15035754882231748864.o();
                    c(cancellationExceptionO);
                    k14749510448791472029.resumeWith(E17665849472693074628.d(cancellationExceptionO));
                } else if (thG != null) {
                    k14749510448791472029.resumeWith(new C10696704014433963524(thG));
                } else {
                    k14749510448791472029.resumeWith(h(objJ));
                }
                if (f14379067091828059340N != null && !f14379067091828059340N.i0()) {
                    return;
                }
                S10823041268949770285.X(context, objC0);
            } catch (Throwable th) {
                if (f14379067091828059340N == null || f14379067091828059340N.i0()) {
                    S10823041268949770285.X(context, objC0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
