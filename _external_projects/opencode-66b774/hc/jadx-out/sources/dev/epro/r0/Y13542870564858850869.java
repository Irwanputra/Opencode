package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class Y13542870564858850869 extends T7441316690157960089 implements L12639328004344855510 {
    public Throwable t;
    public int u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Throwable x;

    static {
        izmyclvb.qgayjvbiagej2(2134);
    }

    private native void ankrzwilyjzk(Throwable th, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y13542870564858850869(Throwable th, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.x = th;
        ankrzwilyjzk(th, r4833348786910499294);
    }
}
