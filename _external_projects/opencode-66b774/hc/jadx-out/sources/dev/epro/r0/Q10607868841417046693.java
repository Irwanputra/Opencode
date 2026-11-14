package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class Q10607868841417046693 {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final Q2768324090487661247 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        g = unsafe.objectFieldOffset(Q10607868841417046693.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(Q10607868841417046693.class, "deqIdx$volatile");
        h = unsafe.objectFieldOffset(Q10607868841417046693.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(Q10607868841417046693.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(Q10607868841417046693.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(Q10607868841417046693.class.getDeclaredField("_availablePermits$volatile"));
    }

    public Q10607868841417046693(int i) {
        this.a = i;
        if (i <= 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        L11053642188676444705 l11053642188676444705 = new L11053642188676444705(0L, null, 2);
        this.head$volatile = l11053642188676444705;
        this.tail$volatile = l11053642188676444705;
        this._availablePermits$volatile = i;
        this.b = new Q2768324090487661247(this, (byte) 21);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.d(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = dev.epro.r0.Q10607868841417046693.e
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            dev.epro.r0.R4833348786910499294 r5 = dev.epro.r0.E18444280280170001567.H(r5)
            dev.epro.r0.H7219028874700587498 r5 = dev.epro.r0.V12319504402545346730.H(r5)
            boolean r1 = r4.d(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            dev.epro.r0.Q2768324090487661247 r4 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.d(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.d(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.r()
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.B()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q10607868841417046693.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean d(J1083986568308928281 j1083986568308928281) {
        Object objO;
        Unsafe unsafe;
        Q10607868841417046693 q10607868841417046693 = this;
        Unsafe unsafe2 = T5284056093300834442.a;
        long j = h;
        L11053642188676444705 l11053642188676444705 = (L11053642188676444705) unsafe2.getObjectVolatile(q10607868841417046693, j);
        long andIncrement = d.getAndIncrement(q10607868841417046693);
        M18035210047498292433 m18035210047498292433 = M18035210047498292433.h;
        long j2 = andIncrement / ((long) Y10566681300840353022.f);
        loop0: while (true) {
            objO = O4077903568229246.o(l11053642188676444705, j2, m18035210047498292433);
            if (T3224757362656795885.i(objO)) {
                break;
            }
            X17453750288186724334 x17453750288186724334H = T3224757362656795885.h(objO);
            while (true) {
                X17453750288186724334 x17453750288186724334 = (X17453750288186724334) T5284056093300834442.a.getObjectVolatile(q10607868841417046693, j);
                if (x17453750288186724334.d >= x17453750288186724334H.d) {
                    q10607868841417046693 = this;
                    break loop0;
                }
                if (!x17453750288186724334H.j()) {
                    break;
                }
                do {
                    unsafe = T5284056093300834442.a;
                    q10607868841417046693 = this;
                    if (unsafe.compareAndSwapObject(q10607868841417046693, h, x17453750288186724334, x17453750288186724334H)) {
                        if (x17453750288186724334.f()) {
                            x17453750288186724334.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(q10607868841417046693, j) == x17453750288186724334);
                if (x17453750288186724334H.f()) {
                    x17453750288186724334H.e();
                }
            }
            q10607868841417046693 = this;
        }
        L11053642188676444705 l110536421886764447052 = (L11053642188676444705) T3224757362656795885.h(objO);
        AtomicReferenceArray atomicReferenceArray = l110536421886764447052.g;
        int i = (int) (andIncrement % ((long) Y10566681300840353022.f));
        while (!atomicReferenceArray.compareAndSet(i, null, j1083986568308928281)) {
            if (atomicReferenceArray.get(i) != null) {
                D14731132657808549702 d14731132657808549702 = Y10566681300840353022.b;
                D14731132657808549702 d147311326578085497022 = Y10566681300840353022.c;
                while (!atomicReferenceArray.compareAndSet(i, d14731132657808549702, d147311326578085497022)) {
                    if (atomicReferenceArray.get(i) != d14731132657808549702) {
                        return false;
                    }
                }
                ((U15014152283416496379) j1083986568308928281).d(O9245300239821758723.a, q10607868841417046693.b);
                return true;
            }
        }
        j1083986568308928281.a(l110536421886764447052, i);
        return true;
    }

    public final void e() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objO;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    unsafe = T5284056093300834442.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                D11988991656201568495.h(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = T5284056093300834442.a;
            long j2 = g;
            L11053642188676444705 l11053642188676444705 = (L11053642188676444705) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) Y10566681300840353022.f);
            F17000319598955205524 f17000319598955205524 = F17000319598955205524.h;
            while (true) {
                objO = O4077903568229246.o(l11053642188676444705, j3, f17000319598955205524);
                if (T3224757362656795885.i(objO)) {
                    break;
                }
                X17453750288186724334 x17453750288186724334H = T3224757362656795885.h(objO);
                while (true) {
                    X17453750288186724334 x17453750288186724334 = (X17453750288186724334) T5284056093300834442.a.getObjectVolatile(this, j2);
                    if (x17453750288186724334.d >= x17453750288186724334H.d) {
                        break;
                    }
                    if (!x17453750288186724334H.j()) {
                        break;
                    }
                    do {
                        unsafe2 = T5284056093300834442.a;
                        if (unsafe2.compareAndSwapObject(this, g, x17453750288186724334, x17453750288186724334H)) {
                            if (x17453750288186724334.f()) {
                                x17453750288186724334.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == x17453750288186724334);
                    if (x17453750288186724334H.f()) {
                        x17453750288186724334H.e();
                    }
                }
            }
            L11053642188676444705 l110536421886764447052 = (L11053642188676444705) T3224757362656795885.h(objO);
            AtomicReferenceArray atomicReferenceArray = l110536421886764447052.g;
            l110536421886764447052.a();
            z = false;
            if (l110536421886764447052.d <= j3) {
                int i3 = (int) (andIncrement2 % ((long) Y10566681300840353022.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, Y10566681300840353022.b);
                if (andSet == null) {
                    int i4 = Y10566681300840353022.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == Y10566681300840353022.c) {
                            z = true;
                            break;
                        }
                    }
                    D14731132657808549702 d14731132657808549702 = Y10566681300840353022.b;
                    D14731132657808549702 d147311326578085497022 = Y10566681300840353022.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, d14731132657808549702, d147311326578085497022)) {
                            if (atomicReferenceArray.get(i3) != d14731132657808549702) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != Y10566681300840353022.e) {
                    boolean z2 = andSet instanceof U15014152283416496379;
                    O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                    if (!z2) {
                        if (andSet instanceof O3606826322388932410) {
                            if (((O3606826322388932410) andSet).i(this, o9245300239821758723) == 0) {
                                z = true;
                                break;
                                break;
                            }
                        } else {
                            Q11088980322693754445.i("unexpected: ", andSet);
                            return;
                        }
                    } else {
                        U15014152283416496379 u15014152283416496379 = (U15014152283416496379) andSet;
                        D14731132657808549702 d14731132657808549702F = u15014152283416496379.f(o9245300239821758723, this.b);
                        if (d14731132657808549702F != null) {
                            u15014152283416496379.x(d14731132657808549702F);
                            z = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z);
    }
}
