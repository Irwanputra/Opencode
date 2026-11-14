package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A2764358890551697978 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.P5204863746366580363 b;

    public /* synthetic */ A2764358890551697978(dev.epro.r0.P5204863746366580363 p5204863746366580363, byte b) {
        this.a = b;
        this.b = p5204863746366580363;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(dev.epro.r0.S14157914735975478504 s14157914735975478504, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.P5204863746366580363 p5204863746366580363 = this.b;
        switch (b) {
            case 0:
                java.lang.Object objB = dev.epro.r0.O8620973563946607355.B(new dev.epro.r0.P16682627567602943184(s14157914735975478504, p5204863746366580363, (dev.epro.r0.R4833348786910499294) null, (byte) 0), r4833348786910499294);
                return objB == z3437138737604933638 ? objB : o9245300239821758723;
            default:
                java.lang.Object objB2 = dev.epro.r0.O8620973563946607355.B(new dev.epro.r0.P16682627567602943184(s14157914735975478504, p5204863746366580363, (dev.epro.r0.R4833348786910499294) null, (byte) 1), r4833348786910499294);
                return objB2 == z3437138737604933638 ? objB2 : o9245300239821758723;
        }
    }
}
