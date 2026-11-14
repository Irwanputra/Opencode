package dev.epro.r0;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@E9219781366349246739("dialog")
/* loaded from: classes3.dex */
public final class S11892176994350381461 extends E4135271276212975889 {
    @Override // dev.epro.r0.E4135271276212975889
    public final V7801742040189616406 a() {
        return new W2571868844412990642(this);
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void d(List list, X4698849316906551159 x4698849316906551159) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((R14289894334981469490) it.next());
        }
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void e(R14289894334981469490 r14289894334981469490, boolean z) {
        b().e(r14289894334981469490, z);
        int F0 = R9411874267597469228.F0((Iterable) b().f.a.getValue(), r14289894334981469490);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                K5751602218013079365.f0();
                throw null;
            }
            R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj;
            if (i > F0) {
                b().c(r142898943349814694902);
            }
            i = i2;
        }
    }
}
