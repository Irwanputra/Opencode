package dev.epro.r0;

import dev.epro.mobile.ClientSession;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class S12869279990374892848 extends R14062301455140331524 implements L12639328004344855510 {
    public int t;
    public byte u;
    public /* synthetic */ Object v;
    public final /* synthetic */ H1372144443810590316 w;
    public final /* synthetic */ ClientSession x;
    public final /* synthetic */ Map y;

    static {
        izmyclvb.qgayjvbiagej2(529);
    }

    private native void tpobsvihdcql();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S12869279990374892848(H1372144443810590316 h1372144443810590316, ClientSession clientSession, Map<String, ? extends Object> map, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = h1372144443810590316;
        this.x = clientSession;
        this.y = map;
        tpobsvihdcql();
    }
}
