package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class C5821163145300642239 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object t;
    public final /* synthetic */ K4771592576423649304 u;
    public final /* synthetic */ Socket v;
    public final /* synthetic */ Socket w;

    static {
        izmyclvb.oeynnivvrnts0(pd.K0);
    }

    private native void vkugsvzklwcr();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5821163145300642239(K4771592576423649304 k4771592576423649304, Socket socket, Socket socket2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = k4771592576423649304;
        this.v = socket;
        this.w = socket2;
        vkugsvzklwcr();
    }
}
