package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P17493338506140929634;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kl1 implements P17493338506140929634 {
    public final Executor a;
    public final O16637889491137121389 b;
    public final PriorityQueue c = new PriorityQueue();

    public kl1(Executor executor, O16637889491137121389 o16637889491137121389) {
        this.a = executor;
        this.b = o16637889491137121389;
    }

    @Override // dev.epro.r0.P17493338506140929634
    public final void a() {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                this.b.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                n13 n13Var = (n13) this.c.peek();
                while (n13Var != null && n13Var.b <= jElapsedRealtime) {
                    priorityQueue.add(n13Var);
                    n13Var = (n13) this.c.peek();
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((n13) it.next()).a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.P17493338506140929634
    public final void a(Runnable runnable, long j) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        this.b.getClass();
        n13 n13Var = new n13(runnable, SystemClock.elapsedRealtime() + j);
        synchronized (this.c) {
            this.c.add(n13Var);
        }
    }
}
