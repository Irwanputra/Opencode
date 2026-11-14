package dev.epro.r0;

import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U7770669172681767357 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Socket b;

    static {
        izmyclvb.qgayjvbiagej2(1986);
    }

    private native void sokcsekchtvv(Socket socket, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ U7770669172681767357(Socket socket, byte b) {
        this.a = b;
        this.b = socket;
        sokcsekchtvv(socket, b);
    }
}
