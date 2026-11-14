package dev.epro.r0;

import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class E13200896767041331322 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public final /* synthetic */ T13399098270394742793 u;
    public final /* synthetic */ Socket v;

    static {
        izmyclvb.oeynnivvrnts0(1049);
    }

    private native void bbufvdtjzwfe();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E13200896767041331322(T13399098270394742793 t13399098270394742793, Socket socket, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = t13399098270394742793;
        this.v = socket;
        bbufvdtjzwfe();
    }
}
