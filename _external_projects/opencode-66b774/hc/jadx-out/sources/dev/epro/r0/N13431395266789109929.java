package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N13431395266789109929 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ N235339945877347053 b;

    public /* synthetic */ N13431395266789109929(N235339945877347053 n235339945877347053, byte b) {
        this.a = b;
        this.b = n235339945877347053;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        N235339945877347053 n235339945877347053 = this.b;
        switch (b) {
            case 0:
                Object objZ = Z860808776098365610.z(s14157914735975478504, n235339945877347053, r4833348786910499294);
                return objZ == z3437138737604933638 ? objZ : o9245300239821758723;
            default:
                Object objZ2 = Z860808776098365610.z(s14157914735975478504, n235339945877347053, r4833348786910499294);
                return objZ2 == z3437138737604933638 ? objZ2 : o9245300239821758723;
        }
    }
}
