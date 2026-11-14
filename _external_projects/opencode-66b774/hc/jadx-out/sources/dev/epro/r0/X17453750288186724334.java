package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X17453750288186724334 extends M2655555874565458115 implements B9271643986061518267 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(X17453750288186724334.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = T5284056093300834442.a.objectFieldOffset(X17453750288186724334.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public X17453750288186724334(long j, X17453750288186724334 x17453750288186724334, int i) {
        super(x17453750288186724334);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // dev.epro.r0.M2655555874565458115
    public final boolean d() {
        return T5284056093300834442.a.getIntVolatile(this, f) == g() && c() != null;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, G8001132634698687269 g8001132634698687269);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            X17453750288186724334 x17453750288186724334 = this;
            if (unsafe.compareAndSwapInt(x17453750288186724334, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = x17453750288186724334;
        }
    }
}
