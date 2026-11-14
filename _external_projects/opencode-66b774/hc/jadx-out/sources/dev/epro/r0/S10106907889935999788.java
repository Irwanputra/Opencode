package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class S10106907889935999788 implements PointerInputEventHandler {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ K1246821697113442187 d;
    public final /* synthetic */ W5797197595347441198 e;
    public final /* synthetic */ L13148442655056575112 f;

    static {
        izmyclvb.qgayjvbiagej2(359);
    }

    private native void wosoiskxjbnb(float f, float f2, boolean z, K1246821697113442187 k1246821697113442187, W5797197595347441198 w5797197595347441198, L13148442655056575112 l13148442655056575112);

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final native Object invoke(S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294);

    public S10106907889935999788(float f, float f2, boolean z, K1246821697113442187 k1246821697113442187, W5797197595347441198 w5797197595347441198, L13148442655056575112 l13148442655056575112) {
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = k1246821697113442187;
        this.e = w5797197595347441198;
        this.f = l13148442655056575112;
        wosoiskxjbnb(f, f2, z, k1246821697113442187, w5797197595347441198, l13148442655056575112);
    }
}
