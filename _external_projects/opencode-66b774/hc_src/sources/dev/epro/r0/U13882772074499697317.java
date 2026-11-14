package dev.epro.r0;

import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class U13882772074499697317 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ K4771592576423649304 t;
    public final /* synthetic */ Socket u;

    static {
        izmyclvb.qgayjvbiagej2(1846);
    }

    private native void gywcnjstxjon();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U13882772074499697317(K4771592576423649304 k4771592576423649304, Socket socket, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = k4771592576423649304;
        this.u = socket;
        gywcnjstxjon();
    }
}
