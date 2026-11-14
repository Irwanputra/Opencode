package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z15677223801010158324 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ E18104834745338047524 b;

    public /* synthetic */ Z15677223801010158324(E18104834745338047524 e18104834745338047524, byte b) {
        this.a = b;
        this.b = e18104834745338047524;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        E18104834745338047524 e18104834745338047524 = this.b;
        switch (b) {
            case 0:
                Object objF = F10757829603125321143.f(s14157914735975478504, new S464754454553842217(e18104834745338047524, (byte) 10), new K5271540294206541871(e18104834745338047524, (byte) 6), r4833348786910499294, 5);
                return objF == z3437138737604933638 ? objF : o9245300239821758723;
            default:
                Object objE = U2645994142831146282.e(s14157914735975478504, null, new S15344532811487669861(e18104834745338047524, null), new A6662317080022852970(e18104834745338047524, (byte) 17), r4833348786910499294, 3);
                return objE == z3437138737604933638 ? objE : o9245300239821758723;
        }
    }
}
