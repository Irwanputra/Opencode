package dev.epro.r0;

import java.util.Map;
import java.util.concurrent.CancellationException;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class L10582165391339050072 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ B13729205492206812220 A;
    public final /* synthetic */ CancellationException B;
    public String t;
    public byte u;
    public final /* synthetic */ F4096073349764486348 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Map x;
    public final /* synthetic */ L12639328004344855510 y;
    public final /* synthetic */ L12639328004344855510 z;

    static {
        izmyclvb.dpqpjfpoanwt1(1319);
    }

    private native void pwuqjhhzcuat();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L10582165391339050072(F4096073349764486348 f4096073349764486348, String str, Map<String, String> map, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, B13729205492206812220 b13729205492206812220, CancellationException cancellationException, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = f4096073349764486348;
        this.w = str;
        this.x = map;
        this.y = l12639328004344855510;
        this.z = l126393280043448555102;
        this.A = b13729205492206812220;
        this.B = cancellationException;
        pwuqjhhzcuat();
    }
}
