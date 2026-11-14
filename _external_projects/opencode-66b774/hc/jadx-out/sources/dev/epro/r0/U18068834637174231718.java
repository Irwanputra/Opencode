package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U18068834637174231718 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ D2717688760023469083 b;

    public /* synthetic */ U18068834637174231718(D2717688760023469083 d2717688760023469083, byte b) {
        this.a = b;
        this.b = d2717688760023469083;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        D2717688760023469083 d2717688760023469083 = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                Object objB = O8620973563946607355.B(new B5703672629416386538(d2717688760023469083, s14157914735975478504, (R4833348786910499294) null, (byte) 12), r4833348786910499294);
                if (objB != z3437138737604933638) {
                    objB = o9245300239821758723;
                }
                return objB == z3437138737604933638 ? objB : o9245300239821758723;
            case 1:
                Object objB2 = O8620973563946607355.B(new C288342651169725874(d2717688760023469083, s14157914735975478504, true, (R4833348786910499294) null), r4833348786910499294);
                if (objB2 != z3437138737604933638) {
                    objB2 = o9245300239821758723;
                }
                return objB2 == z3437138737604933638 ? objB2 : o9245300239821758723;
            default:
                Object objB3 = O8620973563946607355.B(new C288342651169725874(d2717688760023469083, s14157914735975478504, false, (R4833348786910499294) null), r4833348786910499294);
                if (objB3 != z3437138737604933638) {
                    objB3 = o9245300239821758723;
                }
                return objB3 == z3437138737604933638 ? objB3 : o9245300239821758723;
        }
    }
}
