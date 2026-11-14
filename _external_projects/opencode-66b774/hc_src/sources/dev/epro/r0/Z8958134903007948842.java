package dev.epro.r0;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z8958134903007948842 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(Z8958134903007948842.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(Z8958134903007948842.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(Z8958134903007948842.class, "_isTerminated$volatile");
    public static final D14731132657808549702 k = new D14731132657808549702("NOT_IN_STACK", (byte) 25);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final X13748952700216916374 e;
    public final X13748952700216916374 f;
    public final Q4863543588755403810 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public Z8958134903007948842(long j2, String str, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            S10973172697741180971.i(G6547577305291411977.o(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            S10973172697741180971.i(E12098517352909843120.l("Max pool size ", i3, i2, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            S10973172697741180971.i(G6547577305291411977.o(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            K2042933864045806308.j("Idle worker keep alive time ", j2, " must be positive");
            throw null;
        }
        this.e = new X13748952700216916374();
        this.f = new X13748952700216916374();
        this.g = new Q4863543588755403810((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(Z8958134903007948842 z8958134903007948842, Runnable runnable, int i2) {
        z8958134903007948842.c(runnable, false, (i2 & 4) == 0);
    }

    public final int b() {
        synchronized (this.g) {
            try {
                if (j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                J2284846294773890298 j2284846294773890298 = new J2284846294773890298(this, i4);
                this.g.c(i4, j2284846294773890298);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                j2284846294773890298.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        B6457840406537354631 i3703601470802825026;
        M14382232638263786411 m14382232638263786411;
        F13835057046869638895.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof B6457840406537354631) {
            i3703601470802825026 = (B6457840406537354631) runnable;
            i3703601470802825026.a = nanoTime;
            i3703601470802825026.b = z;
        } else {
            i3703601470802825026 = new I3703601470802825026(runnable, nanoTime, z);
        }
        boolean z3 = i3703601470802825026.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        J2284846294773890298 j2284846294773890298 = currentThread instanceof J2284846294773890298 ? (J2284846294773890298) currentThread : null;
        if (j2284846294773890298 == null || j2284846294773890298.h != this) {
            j2284846294773890298 = null;
        }
        if (j2284846294773890298 != null && (m14382232638263786411 = j2284846294773890298.c) != M14382232638263786411.e && (i3703601470802825026.b || m14382232638263786411 != M14382232638263786411.b)) {
            j2284846294773890298.g = true;
            G13921529853338173802 g13921529853338173802 = j2284846294773890298.a;
            if (z2) {
                i3703601470802825026 = g13921529853338173802.a(i3703601470802825026);
            } else {
                g13921529853338173802.getClass();
                B6457840406537354631 b6457840406537354631 = (B6457840406537354631) T5284056093300834442.a.getAndSetObject(g13921529853338173802, G13921529853338173802.f, i3703601470802825026);
                i3703601470802825026 = b6457840406537354631 == null ? null : g13921529853338173802.a(b6457840406537354631);
            }
        }
        if (i3703601470802825026 != null) {
            if (!(i3703601470802825026.b ? this.f.a(i3703601470802825026) : this.e.a(i3703601470802825026))) {
                throw new RejectedExecutionException(G6547577305291411977.u(new StringBuilder(), this.d, " was terminated"));
            }
        }
        boolean z4 = z2 && j2284846294773890298 != null;
        if (z3) {
            if (z4 || h() || g(addAndGet)) {
                return;
            }
            h();
            return;
        }
        if (z4 || h() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = dev.epro.r0.Z8958134903007948842.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof dev.epro.r0.J2284846294773890298
            r3 = 0
            if (r1 == 0) goto L17
            dev.epro.r0.J2284846294773890298 r0 = (dev.epro.r0.J2284846294773890298) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            dev.epro.r0.Z8958134903007948842 r1 = r0.h
            if (r1 == r10) goto L1f
        L1e:
            r0 = r3
        L1f:
            dev.epro.r0.Q4863543588755403810 r1 = r10.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = dev.epro.r0.Z8958134903007948842.i     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r10)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L75
            r1 = r2
        L31:
            dev.epro.r0.Q4863543588755403810 r5 = r10.g
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            dev.epro.r0.J2284846294773890298 r5 = (dev.epro.r0.J2284846294773890298) r5
            if (r5 == r0) goto L70
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3e
        L4f:
            dev.epro.r0.G13921529853338173802 r5 = r5.a
            dev.epro.r0.X13748952700216916374 r6 = r10.f
            r5.getClass()
            sun.misc.Unsafe r7 = dev.epro.r0.T5284056093300834442.a
            long r8 = dev.epro.r0.G13921529853338173802.f
            java.lang.Object r7 = r7.getAndSetObject(r5, r8, r3)
            dev.epro.r0.B6457840406537354631 r7 = (dev.epro.r0.B6457840406537354631) r7
            if (r7 == 0) goto L65
            r6.a(r7)
        L65:
            dev.epro.r0.B6457840406537354631 r7 = r5.c()
            if (r7 != 0) goto L6c
            goto L70
        L6c:
            r6.a(r7)
            goto L65
        L70:
            if (r1 == r4) goto L75
            int r1 = r1 + 1
            goto L31
        L75:
            dev.epro.r0.X13748952700216916374 r1 = r10.f
            r1.b()
            dev.epro.r0.X13748952700216916374 r1 = r10.e
            r1.b()
        L7f:
            if (r0 == 0) goto L87
            dev.epro.r0.B6457840406537354631 r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L87:
            dev.epro.r0.X13748952700216916374 r1 = r10.e
            java.lang.Object r1 = r1.d()
            dev.epro.r0.B6457840406537354631 r1 = (dev.epro.r0.B6457840406537354631) r1
            if (r1 != 0) goto Laf
            dev.epro.r0.X13748952700216916374 r1 = r10.f
            java.lang.Object r1 = r1.d()
            dev.epro.r0.B6457840406537354631 r1 = (dev.epro.r0.B6457840406537354631) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            dev.epro.r0.M14382232638263786411 r1 = dev.epro.r0.M14382232638263786411.e
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = dev.epro.r0.Z8958134903007948842.h
            r1 = 0
            r0.set(r10, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = dev.epro.r0.Z8958134903007948842.i
            r0.set(r10, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L7f
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7f
        Lc0:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z8958134903007948842.close():void");
    }

    public final void e(J2284846294773890298 j2284846294773890298, int i2, int i3) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c = j2284846294773890298.c();
                    while (true) {
                        if (c == k) {
                            i4 = -1;
                            break;
                        }
                        if (c == null) {
                            i4 = 0;
                            break;
                        }
                        J2284846294773890298 j22848462947738902982 = (J2284846294773890298) c;
                        int b = j22848462947738902982.b();
                        if (b != 0) {
                            i4 = b;
                            break;
                        }
                        c = j22848462947738902982.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                long j4 = j3 | i4;
                Z8958134903007948842 z8958134903007948842 = this;
                if (atomicLongFieldUpdater.compareAndSet(z8958134903007948842, j2, j4)) {
                    return;
                } else {
                    this = z8958134903007948842;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final boolean g(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int b = b();
            if (b == 1 && i3 > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        Z8958134903007948842 z8958134903007948842;
        D14731132657808549702 d14731132657808549702;
        int i2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            J2284846294773890298 j2284846294773890298 = (J2284846294773890298) this.g.b((int) (2097151 & j2));
            if (j2284846294773890298 == null) {
                j2284846294773890298 = null;
                z8958134903007948842 = this;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c = j2284846294773890298.c();
                while (true) {
                    d14731132657808549702 = k;
                    if (c == d14731132657808549702) {
                        i2 = -1;
                        break;
                    }
                    if (c == null) {
                        i2 = 0;
                        break;
                    }
                    J2284846294773890298 j22848462947738902982 = (J2284846294773890298) c;
                    i2 = j22848462947738902982.b();
                    if (i2 != 0) {
                        break;
                    }
                    c = j22848462947738902982.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i2 >= 0) {
                    Z8958134903007948842 z89581349030079488422 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(z89581349030079488422, j2, j3 | i2);
                    z8958134903007948842 = z89581349030079488422;
                    if (compareAndSet) {
                        j2284846294773890298.g(d14731132657808549702);
                    }
                    this = z8958134903007948842;
                } else {
                    continue;
                }
            }
            if (j2284846294773890298 == null) {
                return false;
            }
            if (J2284846294773890298.i.compareAndSet(j2284846294773890298, -1, 0)) {
                LockSupport.unpark(j2284846294773890298);
                return true;
            }
            this = z8958134903007948842;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Q4863543588755403810 q4863543588755403810 = this.g;
        int a = q4863543588755403810.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            J2284846294773890298 j2284846294773890298 = (J2284846294773890298) q4863543588755403810.b(i7);
            if (j2284846294773890298 != null) {
                G13921529853338173802 g13921529853338173802 = j2284846294773890298.a;
                g13921529853338173802.getClass();
                Object objectVolatile = T5284056093300834442.a.getObjectVolatile(g13921529853338173802, G13921529853338173802.f);
                int b = g13921529853338173802.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = j2284846294773890298.c.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(D15445857918358799638.I(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        G6547577305291411977.A(sb4, this.b, "}, Worker States {CPU = ", i2, ", blocking = ");
        G6547577305291411977.A(sb4, i3, ", parked = ", i4, ", dormant = ");
        G6547577305291411977.A(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
