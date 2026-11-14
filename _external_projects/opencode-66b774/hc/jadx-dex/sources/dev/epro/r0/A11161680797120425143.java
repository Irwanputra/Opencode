package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A11161680797120425143 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.Q15571097203552000958 b;
    public final /* synthetic */ java.net.Socket c;
    public final /* synthetic */ dev.epro.r0.D15369551508841294378 d;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(328);
    }

    private native void bfkgdurpbhoa(dev.epro.r0.Q15571097203552000958 q15571097203552000958, java.net.Socket socket, dev.epro.r0.D15369551508841294378 d15369551508841294378, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native java.lang.Object invoke();

    public /* synthetic */ A11161680797120425143(dev.epro.r0.Q15571097203552000958 q15571097203552000958, java.net.Socket socket, dev.epro.r0.D15369551508841294378 d15369551508841294378, byte b) {
        this.a = b;
        this.b = q15571097203552000958;
        this.c = socket;
        this.d = d15369551508841294378;
        bfkgdurpbhoa(q15571097203552000958, socket, d15369551508841294378, b);
    }
}
