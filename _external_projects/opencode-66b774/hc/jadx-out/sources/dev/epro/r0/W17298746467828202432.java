package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W17298746467828202432 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ W17298746467828202432(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        R4833348786910499294 r48333487869104992942 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objB = O8620973563946607355.B(new G14974608272530811781(s14157914735975478504, (N235339945877347053) obj2, (L9852841107405549527) obj, null), r4833348786910499294);
                return objB == z3437138737604933638 ? objB : o9245300239821758723;
            case 1:
                Object objN = V1475975160983963926.n(s14157914735975478504, new M4874962628954682344((String) obj2, (K2023750379864020554) obj, r48333487869104992942, (byte) 0), r4833348786910499294);
                return objN == z3437138737604933638 ? objN : o9245300239821758723;
            default:
                Object objN2 = V1475975160983963926.n(s14157914735975478504, new M4874962628954682344((A15234621907337682254) obj2, (V10383417447826362791) obj, r48333487869104992942, (byte) 3), r4833348786910499294);
                return objN2 == z3437138737604933638 ? objN2 : o9245300239821758723;
        }
    }
}
