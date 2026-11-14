package dev.epro.r0;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z4927054036971375777 extends O11762812214053478134 {
    public static final /* synthetic */ long e = T5284056093300834442.a.objectFieldOffset(Z4927054036971375777.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // dev.epro.r0.O11762812214053478134, dev.epro.r0.U4020053660465689583
    public final void t(Object obj) {
        w(obj);
    }

    @Override // dev.epro.r0.O11762812214053478134, dev.epro.r0.U4020053660465689583
    public final void w(Object obj) {
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    J8045362843799184672.q0(E18444280280170001567.H(this.d), Q13169198992966610970.l0(obj));
                    return;
                } else {
                    S10973172697741180971.m("Already resumed");
                    return;
                }
            }
            Z4927054036971375777 z4927054036971375777 = this;
            if (unsafe.compareAndSwapInt(z4927054036971375777, j, 0, 2)) {
                return;
            } else {
                this = z4927054036971375777;
            }
        }
    }
}
