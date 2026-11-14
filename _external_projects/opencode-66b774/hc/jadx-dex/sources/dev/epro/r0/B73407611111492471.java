package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B73407611111492471 extends dev.epro.r0.D11883231851729262595 implements dev.epro.r0.W8575158046285589709 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(dev.epro.r0.B73407611111492471.class, "runningWorkers$volatile");
    public static final /* synthetic */ long j = dev.epro.r0.T5284056093300834442.a.objectFieldOffset(dev.epro.r0.B73407611111492471.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ dev.epro.r0.W8575158046285589709 c;
    public final dev.epro.r0.D11883231851729262595 d;
    public final int e;
    public final java.lang.String f;
    public final dev.epro.r0.X11811226133381831620 g;
    public final java.lang.Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public B73407611111492471(dev.epro.r0.D11883231851729262595 d11883231851729262595, int i2, java.lang.String str) {
        dev.epro.r0.W8575158046285589709 w8575158046285589709 = d11883231851729262595 instanceof dev.epro.r0.W8575158046285589709 ? (dev.epro.r0.W8575158046285589709) d11883231851729262595 : null;
        this.c = w8575158046285589709 == null ? dev.epro.r0.I14719250900203285588.a : w8575158046285589709;
        this.d = d11883231851729262595;
        this.e = i2;
        this.f = str;
        this.g = new dev.epro.r0.X11811226133381831620();
        this.h = new java.lang.Object();
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void A(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Runnable runnable) {
        java.lang.Runnable runnableD;
        this.g.a(runnable);
        if (dev.epro.r0.T5284056093300834442.a.getIntVolatile(this, j) >= this.e || !E() || (runnableD = D()) == null) {
            return;
        }
        this.d.A(this, new dev.epro.r0.I3863025946240164840(this, runnableD, false, (byte) 11));
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final dev.epro.r0.D11883231851729262595 C(int i2, java.lang.String str) {
        dev.epro.r0.E12775674050813925581.u(i2);
        return i2 >= this.e ? str != null ? new dev.epro.r0.O1128333822239684917(this, str) : this : super.C(i2, str);
    }

    public final java.lang.Runnable D() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean E() {
        synchronized (this.h) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (dev.epro.r0.T5284056093300834442.a.getIntVolatile(this, j) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final dev.epro.r0.U16840712152025914198 d(long j2, java.lang.Runnable runnable, dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        return this.c.d(j2, runnable, g8001132634698687269);
    }

    public final void h(long j2, dev.epro.r0.H7219028874700587498 h7219028874700587498) {
        this.c.h(j2, h7219028874700587498);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final java.lang.String toString() {
        java.lang.String str = this.f;
        if (str != null) {
            return str;
        }
        return this.d + ".limitedParallelism(" + this.e + ')';
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Runnable runnable) {
        java.lang.Runnable runnableD;
        this.g.a(runnable);
        if (dev.epro.r0.T5284056093300834442.a.getIntVolatile(this, j) >= this.e || !E() || (runnableD = D()) == null) {
            return;
        }
        this.d.z(this, new dev.epro.r0.I3863025946240164840(this, runnableD, false, (byte) 11));
    }
}
