package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K9854114937003160207 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ B13729205492206812220 b;

    public /* synthetic */ K9854114937003160207(B13729205492206812220 b13729205492206812220, byte b) {
        this.a = b;
        this.b = b13729205492206812220;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        B13729205492206812220 b13729205492206812220 = this.b;
        switch (b) {
            case 0:
                Object objE = U2645994142831146282.e(s14157914735975478504, null, null, new F12973702345246855607(b13729205492206812220, (byte) 3), r4833348786910499294, 7);
                return objE == z3437138737604933638 ? objE : o9245300239821758723;
            default:
                Object objE2 = U2645994142831146282.e(s14157914735975478504, null, null, new F12973702345246855607(b13729205492206812220, (byte) 4), r4833348786910499294, 7);
                return objE2 == z3437138737604933638 ? objE2 : o9245300239821758723;
        }
    }
}
