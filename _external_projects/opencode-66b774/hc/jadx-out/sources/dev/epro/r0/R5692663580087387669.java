package dev.epro.r0;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class R5692663580087387669 extends U4020053660465689583 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5692663580087387669(Q15035754882231748864 q15035754882231748864) {
        super(true);
        boolean z = true;
        P(q15035754882231748864);
        Unsafe unsafe = T5284056093300834442.a;
        long j = U4020053660465689583.a;
        B13085836186769537379 b13085836186769537379 = (B13085836186769537379) unsafe.getObjectVolatile(this, j);
        R6423080927537628451 r6423080927537628451 = b13085836186769537379 instanceof R6423080927537628451 ? (R6423080927537628451) b13085836186769537379 : null;
        if (r6423080927537628451 == null) {
            z = false;
            break;
        }
        U4020053660465689583 u4020053660465689583L = r6423080927537628451.l();
        while (!u4020053660465689583L.J()) {
            B13085836186769537379 b130858361867695373792 = (B13085836186769537379) T5284056093300834442.a.getObjectVolatile(u4020053660465689583L, j);
            R6423080927537628451 r64230809275376284512 = b130858361867695373792 instanceof R6423080927537628451 ? (R6423080927537628451) b130858361867695373792 : null;
            if (r64230809275376284512 == null) {
                z = false;
                break;
            }
            u4020053660465689583L = r64230809275376284512.l();
        }
        this.c = z;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final boolean J() {
        return this.c;
    }

    @Override // dev.epro.r0.U4020053660465689583
    public final boolean K() {
        return true;
    }

    public final void f0() {
        S(O9245300239821758723.a);
    }
}
