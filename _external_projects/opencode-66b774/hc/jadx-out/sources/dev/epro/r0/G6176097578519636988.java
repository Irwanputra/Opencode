package dev.epro.r0;

import dev.epro.httpcustom.service.CustomVpnService;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G6176097578519636988 extends R14062301455140331524 implements L12639328004344855510 {
    public N10074157612675057572 t;
    public byte u;
    public /* synthetic */ Object v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ CustomVpnService x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    static {
        izmyclvb.dpqpjfpoanwt1(176);
    }

    private native void rsicsqrkdofg();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6176097578519636988(boolean z, CustomVpnService customVpnService, boolean z2, boolean z3, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = z;
        this.x = customVpnService;
        this.y = z2;
        this.z = z3;
        rsicsqrkdofg();
    }
}
