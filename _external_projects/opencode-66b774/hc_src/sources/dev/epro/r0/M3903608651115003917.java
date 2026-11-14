package dev.epro.r0;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M3903608651115003917 extends Z3069203969753053913 {
    public final H7219028874700587498 e;

    public M3903608651115003917(H7219028874700587498 h7219028874700587498) {
        this.e = h7219028874700587498;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final boolean m() {
        return true;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        U4020053660465689583 l = l();
        H7219028874700587498 h7219028874700587498 = this.e;
        Throwable q = h7219028874700587498.q(l);
        if (h7219028874700587498.y()) {
            N16152488056535110728 n16152488056535110728 = (N16152488056535110728) h7219028874700587498.d;
            long j = N16152488056535110728.h;
            loop0: while (true) {
                Object objectVolatile = T5284056093300834442.a.getObjectVolatile(n16152488056535110728, j);
                D14731132657808549702 d14731132657808549702 = J8045362843799184672.c;
                if (S10823041268949770285.t(objectVolatile, d14731132657808549702)) {
                    do {
                        unsafe = T5284056093300834442.a;
                        if (unsafe.compareAndSwapObject(n16152488056535110728, N16152488056535110728.h, d14731132657808549702, q)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(n16152488056535110728, j) == d14731132657808549702);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = T5284056093300834442.a;
                        if (unsafe2.compareAndSwapObject(n16152488056535110728, N16152488056535110728.h, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(n16152488056535110728, j) == objectVolatile);
                }
            }
        }
        h7219028874700587498.k(q);
        if (h7219028874700587498.y()) {
            return;
        }
        h7219028874700587498.o();
    }
}
