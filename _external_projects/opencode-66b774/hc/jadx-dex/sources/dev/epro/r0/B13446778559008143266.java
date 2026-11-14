package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13446778559008143266 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public byte[] t;
    public boolean u;
    public /* synthetic */ java.lang.Object v;
    public final /* synthetic */ java.net.DatagramSocket w;
    public final /* synthetic */ dev.epro.r0.L12639328004344855510 x;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(618);
    }

    private native void ipgaivjokrra();

    public final native dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj);

    public final native java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2);

    public final native java.lang.Object invokeSuspend(java.lang.Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B13446778559008143266(java.net.DatagramSocket datagramSocket, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = datagramSocket;
        this.x = l12639328004344855510;
        ipgaivjokrra();
    }
}
