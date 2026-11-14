package dev.epro.r0;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Z3069203969753053913 extends Q7617135222418928697 implements U16840712152025914198, D14012262140144083539 {
    public U4020053660465689583 d;

    @Override // dev.epro.r0.U16840712152025914198
    public final void a() {
        Z3069203969753053913 z3069203969753053913;
        Unsafe unsafe;
        long j;
        U4020053660465689583 l = l();
        while (true) {
            Object M = l.M();
            if (M instanceof Z3069203969753053913) {
                if (M != this) {
                    return;
                }
                S13297578932192364679 s13297578932192364679 = O4077903568229246.r;
                do {
                    unsafe = T5284056093300834442.a;
                    j = U4020053660465689583.b;
                    if (unsafe.compareAndSwapObject(l, j, M, s13297578932192364679)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(l, j) == M);
            } else {
                if (!(M instanceof D14012262140144083539) || ((D14012262140144083539) M).d() == null) {
                    return;
                }
                while (true) {
                    Object h = this.h();
                    if (h instanceof J10149299614054140776) {
                        return;
                    }
                    if (h == this) {
                        return;
                    }
                    h.getClass();
                    Q7617135222418928697 q7617135222418928697 = (Q7617135222418928697) h;
                    Unsafe unsafe2 = T5284056093300834442.a;
                    long j2 = Q7617135222418928697.c;
                    J10149299614054140776 j10149299614054140776 = (J10149299614054140776) unsafe2.getObjectVolatile(q7617135222418928697, j2);
                    if (j10149299614054140776 == null) {
                        j10149299614054140776 = new J10149299614054140776(q7617135222418928697);
                        unsafe2.putObjectVolatile(q7617135222418928697, j2, j10149299614054140776);
                    }
                    J10149299614054140776 j101492996140541407762 = j10149299614054140776;
                    while (true) {
                        Unsafe unsafe3 = T5284056093300834442.a;
                        long j3 = Q7617135222418928697.a;
                        z3069203969753053913 = this;
                        if (unsafe3.compareAndSwapObject(z3069203969753053913, j3, h, j101492996140541407762)) {
                            q7617135222418928697.f();
                            return;
                        } else if (unsafe3.getObjectVolatile(z3069203969753053913, j3) != h) {
                            break;
                        } else {
                            this = z3069203969753053913;
                        }
                    }
                    this = z3069203969753053913;
                }
            }
        }
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final boolean b() {
        return true;
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final D15128981762807597517 d() {
        return null;
    }

    public final U4020053660465689583 l() {
        U4020053660465689583 u4020053660465689583 = this.d;
        if (u4020053660465689583 != null) {
            return u4020053660465689583;
        }
        S10823041268949770285.b0("job");
        throw null;
    }

    public boolean m() {
        return false;
    }

    public abstract void n(Throwable th);

    @Override // dev.epro.r0.Q7617135222418928697
    public final String toString() {
        return getClass().getSimpleName() + '@' + D15445857918358799638.I(this) + "[job@" + D15445857918358799638.I(l()) + ']';
    }
}
