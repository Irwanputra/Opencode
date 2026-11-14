package dev.epro.r0;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I13889785466093359296 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte[] A;
    public boolean t;
    public final /* synthetic */ K4771592576423649304 u;
    public final /* synthetic */ DatagramSocket v;
    public final /* synthetic */ InetSocketAddress w;
    public final /* synthetic */ int x;
    public final /* synthetic */ byte[] y;
    public final /* synthetic */ int z;

    static {
        izmyclvb.dpqpjfpoanwt1(2003);
    }

    private native void kamwhlxnvswx();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I13889785466093359296(K4771592576423649304 k4771592576423649304, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, int i, byte[] bArr, int i2, byte[] bArr2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = k4771592576423649304;
        this.v = datagramSocket;
        this.w = inetSocketAddress;
        this.x = i;
        this.y = bArr;
        this.z = i2;
        this.A = bArr2;
        kamwhlxnvswx();
    }
}
