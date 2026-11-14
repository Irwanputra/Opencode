package dev.epro.r0;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes4.dex */
public final class Z8482075838566606459 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Socket A;
    public final /* synthetic */ InputStream B;
    public final /* synthetic */ OutputStream C;
    public X7175349259954592591 t;
    public byte u;
    public /* synthetic */ Object v;
    public final /* synthetic */ T13399098270394742793 w;
    public final /* synthetic */ InputStream x;
    public final /* synthetic */ OutputStream y;
    public final /* synthetic */ Socket z;

    static {
        izmyclvb.qbtpmwoxbgtw3(53);
    }

    private native void cecbiczuwjgo();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8482075838566606459(T13399098270394742793 t13399098270394742793, InputStream inputStream, OutputStream outputStream, Socket socket, Socket socket2, InputStream inputStream2, OutputStream outputStream2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = t13399098270394742793;
        this.x = inputStream;
        this.y = outputStream;
        this.z = socket;
        this.A = socket2;
        this.B = inputStream2;
        this.C = outputStream2;
        cecbiczuwjgo();
    }
}
