package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kl1 implements dev.epro.r0.P17493338506140929634 {
    public final java.util.concurrent.Executor a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final java.util.PriorityQueue c = new java.util.PriorityQueue();

    public kl1(java.util.concurrent.Executor executor, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        this.a = executor;
        this.b = o16637889491137121389;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    return;
                }
                java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue();
                this.b.getClass();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ads_mobile_sdk.n13 n13Var = (ads_mobile_sdk.n13) this.c.peek();
                while (n13Var != null && n13Var.b <= jElapsedRealtime) {
                    priorityQueue.add(n13Var);
                    n13Var = (ads_mobile_sdk.n13) this.c.peek();
                }
                java.util.Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((ads_mobile_sdk.n13) it.next()).a);
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a(java.lang.Runnable runnable, long j) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        this.b.getClass();
        ads_mobile_sdk.n13 n13Var = new ads_mobile_sdk.n13(runnable, android.os.SystemClock.elapsedRealtime() + j);
        synchronized (this.c) {
            this.c.add(n13Var);
        }
    }
}
