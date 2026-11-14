package dev.epro.r0;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L5551141404586347656 extends Z3069203969753053913 {
    public static final /* synthetic */ long g = T5284056093300834442.a.objectFieldOffset(L5551141404586347656.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public U16840712152025914198 f;

    public static void p(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final boolean m() {
        return true;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final void n(Throwable th) {
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                p(intVolatile);
                throw null;
            }
            L5551141404586347656 l5551141404586347656 = this;
            if (unsafe.compareAndSwapInt(l5551141404586347656, g, intVolatile, 2)) {
                l5551141404586347656.e.interrupt();
                unsafe.putIntVolatile(l5551141404586347656, j, 3);
                return;
            }
            this = l5551141404586347656;
        }
    }

    public final void o() {
        L5551141404586347656 l5551141404586347656;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                l5551141404586347656 = this;
                if (unsafe.compareAndSwapInt(l5551141404586347656, j, intVolatile, 1)) {
                    U16840712152025914198 u16840712152025914198 = l5551141404586347656.f;
                    if (u16840712152025914198 != null) {
                        u16840712152025914198.a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        p(intVolatile);
                        throw null;
                    }
                }
                l5551141404586347656 = this;
            }
            this = l5551141404586347656;
        }
    }
}
