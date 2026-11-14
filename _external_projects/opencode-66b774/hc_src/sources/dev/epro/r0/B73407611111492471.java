package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B73407611111492471 extends D11883231851729262595 implements W8575158046285589709 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(B73407611111492471.class, "runningWorkers$volatile");
    public static final /* synthetic */ long j = T5284056093300834442.a.objectFieldOffset(B73407611111492471.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ W8575158046285589709 c;
    public final D11883231851729262595 d;
    public final int e;
    public final String f;
    public final X11811226133381831620 g;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public B73407611111492471(D11883231851729262595 d11883231851729262595, int i2, String str) {
        W8575158046285589709 w8575158046285589709 = d11883231851729262595 instanceof W8575158046285589709 ? (W8575158046285589709) d11883231851729262595 : null;
        this.c = w8575158046285589709 == null ? I14719250900203285588.a : w8575158046285589709;
        this.d = d11883231851729262595;
        this.e = i2;
        this.f = str;
        this.g = new X11811226133381831620();
        this.h = new Object();
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void A(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        Runnable D;
        this.g.a(runnable);
        if (T5284056093300834442.a.getIntVolatile(this, j) >= this.e || !E() || (D = D()) == null) {
            return;
        }
        this.d.A(this, new I3863025946240164840((Object) this, (Object) D, false, (byte) 11));
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i2, String str) {
        E12775674050813925581.u(i2);
        return i2 >= this.e ? str != null ? new O1128333822239684917(this, str) : this : super.C(i2, str);
    }

    public final Runnable D() {
        while (true) {
            Runnable runnable = (Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (T5284056093300834442.a.getIntVolatile(this, j) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final U16840712152025914198 d(long j2, Runnable runnable, G8001132634698687269 g8001132634698687269) {
        return this.c.d(j2, runnable, g8001132634698687269);
    }

    @Override // dev.epro.r0.W8575158046285589709
    public final void h(long j2, H7219028874700587498 h7219028874700587498) {
        this.c.h(j2, h7219028874700587498);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        return this.d + ".limitedParallelism(" + this.e + ')';
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        Runnable D;
        this.g.a(runnable);
        if (T5284056093300834442.a.getIntVolatile(this, j) >= this.e || !E() || (D = D()) == null) {
            return;
        }
        this.d.z(this, new I3863025946240164840((Object) this, (Object) D, false, (byte) 11));
    }
}
