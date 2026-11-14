package dev.epro.r0;

import java.net.DatagramSocket;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class B13446778559008143266 extends R14062301455140331524 implements L12639328004344855510 {
    public byte[] t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ DatagramSocket w;
    public final /* synthetic */ L12639328004344855510 x;

    static {
        izmyclvb.oeynnivvrnts0(618);
    }

    private native void ipgaivjokrra();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B13446778559008143266(DatagramSocket datagramSocket, L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = datagramSocket;
        this.x = l12639328004344855510;
        ipgaivjokrra();
    }
}
