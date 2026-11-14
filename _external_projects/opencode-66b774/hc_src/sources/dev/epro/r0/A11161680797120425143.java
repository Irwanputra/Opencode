package dev.epro.r0;

import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final /* synthetic */ class A11161680797120425143 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Q15571097203552000958 b;
    public final /* synthetic */ Socket c;
    public final /* synthetic */ D15369551508841294378 d;

    static {
        izmyclvb.oeynnivvrnts0(328);
    }

    private native void bfkgdurpbhoa(Q15571097203552000958 q15571097203552000958, Socket socket, D15369551508841294378 d15369551508841294378, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ A11161680797120425143(Q15571097203552000958 q15571097203552000958, Socket socket, D15369551508841294378 d15369551508841294378, byte b) {
        this.a = b;
        this.b = q15571097203552000958;
        this.c = socket;
        this.d = d15369551508841294378;
        bfkgdurpbhoa(q15571097203552000958, socket, d15369551508841294378, b);
    }
}
