package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class sh3 {
    public final ads_mobile_sdk.yk0 a;
    public final ads_mobile_sdk.qm1 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public long e = -1;
    public long f = -1;
    public java.lang.Throwable g = null;

    public sh3(ads_mobile_sdk.yk0 yk0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.qm1 qm1Var) {
        this.a = yk0Var;
        this.b = qm1Var;
        this.c = o16637889491137121389;
    }

    public final void a() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.getAndSet(true)) {
            dev.epro.r0.S10973172697741180971.m("Finished trace.");
            return;
        }
        this.c.getClass();
        this.f = android.os.SystemClock.uptimeMillis();
        this.b.a(this.a.a, atomicBoolean.get() ? this.f - this.e : -1L, this.g, null);
    }

    public final void b() {
        if (this.d.get()) {
            dev.epro.r0.S10973172697741180971.m("Finished trace.");
        } else {
            this.c.getClass();
            this.e = android.os.SystemClock.uptimeMillis();
        }
    }

    public final void a(java.lang.Throwable th) {
        if (!this.d.get()) {
            this.g = th;
        } else {
            dev.epro.r0.S10973172697741180971.m("Finished trace.");
        }
    }
}
