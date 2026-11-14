package dev.epro.r0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class W1434533876004525092 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ T13399098270394742793 t;
    public final /* synthetic */ InputStream u;
    public final /* synthetic */ OutputStream v;
    public final /* synthetic */ Socket w;
    public final /* synthetic */ Socket x;

    static {
        izmyclvb.qgayjvbiagej2(1848);
    }

    private native void erznukqnynfs();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1434533876004525092(T13399098270394742793 t13399098270394742793, InputStream inputStream, OutputStream outputStream, Socket socket, Socket socket2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = t13399098270394742793;
        this.u = inputStream;
        this.v = outputStream;
        this.w = socket;
        this.x = socket2;
        erznukqnynfs();
    }
}
