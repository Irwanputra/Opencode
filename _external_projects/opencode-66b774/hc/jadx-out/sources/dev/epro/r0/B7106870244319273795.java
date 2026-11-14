package dev.epro.r0;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B7106870244319273795 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public final /* synthetic */ U8249875978611356145 u;
    public final /* synthetic */ DatagramSocket v;
    public final /* synthetic */ SocketAddress w;
    public final /* synthetic */ byte[] x;

    static {
        izmyclvb.oeynnivvrnts0(323);
    }

    private native void qmqihhuwevny();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7106870244319273795(U8249875978611356145 u8249875978611356145, DatagramSocket datagramSocket, SocketAddress socketAddress, byte[] bArr, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = u8249875978611356145;
        this.v = datagramSocket;
        this.w = socketAddress;
        this.x = bArr;
        qmqihhuwevny();
    }
}
