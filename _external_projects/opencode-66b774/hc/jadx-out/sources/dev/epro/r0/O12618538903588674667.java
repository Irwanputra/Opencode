package dev.epro.r0;

import java.util.Map;
import java.util.concurrent.CancellationException;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O12618538903588674667 extends R14062301455140331524 implements G13792465322404021864 {
    public boolean t;
    public /* synthetic */ String u;
    public /* synthetic */ Map v;
    public /* synthetic */ CancellationException w;
    public final /* synthetic */ F5424571050510598400 x;
    public final /* synthetic */ Map y;
    public final /* synthetic */ String z;

    static {
        izmyclvb.dpqpjfpoanwt1(533);
    }

    private native void vdmuffapsmur();

    @Override // dev.epro.r0.G13792465322404021864
    public final native Object i(Object obj, Object obj2, Object obj3, Object obj4);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O12618538903588674667(F5424571050510598400 f5424571050510598400, Map<String, String> map, String str, R4833348786910499294 r4833348786910499294) {
        super(4, r4833348786910499294);
        this.x = f5424571050510598400;
        this.y = map;
        this.z = str;
        vdmuffapsmur();
    }
}
