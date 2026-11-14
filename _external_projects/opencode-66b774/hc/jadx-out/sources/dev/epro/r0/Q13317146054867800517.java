package dev.epro.r0;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q13317146054867800517 extends T8346709655775060714 {
    public final Thread d;
    public final I17129535152515035455 e;

    public Q13317146054867800517(G8001132634698687269 g8001132634698687269, Thread thread, I17129535152515035455 i17129535152515035455) {
        super(g8001132634698687269, true);
        this.d = thread;
        this.e = i17129535152515035455;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (S10823041268949770285.t(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
