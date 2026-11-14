package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (dev.epro.r0.Q15035754882231748864) r5.get(dev.epro.r0.P2382941533350862833.p);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            dev.epro.r0.R4833348786910499294 r0 = r11.e()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            dev.epro.r0.N16152488056535110728 r0 = (dev.epro.r0.N16152488056535110728) r0     // Catch: java.lang.Throwable -> L1f
            dev.epro.r0.K14749510448791472029 r1 = r0.e     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.g     // Catch: java.lang.Throwable -> L1f
            dev.epro.r0.G8001132634698687269 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = dev.epro.r0.S10823041268949770285.c0(r2, r0)     // Catch: java.lang.Throwable -> L1f
            dev.epro.r0.D14731132657808549702 r3 = dev.epro.r0.S10823041268949770285.e     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            dev.epro.r0.F14379067091828059340 r3 = dev.epro.r0.E12775674050813925581.N(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8b
        L22:
            r3 = r4
        L23:
            dev.epro.r0.G8001132634698687269 r5 = r1.getContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.j()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.g(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.c     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            dev.epro.r0.P2382941533350862833 r4 = dev.epro.r0.P2382941533350862833.p     // Catch: java.lang.Throwable -> L46
            dev.epro.r0.H7323971265464188398 r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L46
            dev.epro.r0.Q15035754882231748864 r4 = (dev.epro.r0.Q15035754882231748864) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L7f
        L48:
            if (r4 == 0) goto L5f
            boolean r5 = r4.b()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L5f
            java.util.concurrent.CancellationException r4 = r4.o()     // Catch: java.lang.Throwable -> L46
            r11.c(r4)     // Catch: java.lang.Throwable -> L46
            dev.epro.r0.C10696704014433963524 r4 = dev.epro.r0.E17665849472693074628.d(r4)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L5f:
            if (r7 == 0) goto L6a
            dev.epro.r0.C10696704014433963524 r4 = new dev.epro.r0.C10696704014433963524     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L6a:
            java.lang.Object r4 = r11.h(r6)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
        L71:
            if (r3 == 0) goto L7b
            boolean r1 = r3.i0()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            dev.epro.r0.S10823041268949770285.X(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L7f:
            if (r3 == 0) goto L87
            boolean r3 = r3.i0()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8a
        L87:
            dev.epro.r0.S10823041268949770285.X(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8b:
            r11.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H14047115090875094711.run():void");
    }

    public void c(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
