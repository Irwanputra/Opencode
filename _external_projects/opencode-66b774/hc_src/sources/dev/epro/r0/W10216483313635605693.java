package dev.epro.r0;

import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class W10216483313635605693 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public final /* synthetic */ CustomVpnService u;
    public final /* synthetic */ Map v;
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;
    public final /* synthetic */ AtomicInteger y;

    static {
        izmyclvb.qgayjvbiagej2(1613);
    }

    private native void utewpjgnqnrk();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W10216483313635605693(CustomVpnService customVpnService, Map<String, ? extends Object> map, String str, int i, AtomicInteger atomicInteger, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = customVpnService;
        this.v = map;
        this.w = str;
        this.x = i;
        this.y = atomicInteger;
        utewpjgnqnrk();
    }
}
