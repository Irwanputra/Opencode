package dev.epro.r0;

import dev.epro.mobile.ClientSession;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class H13135965260981764200 extends R14062301455140331524 implements L12639328004344855510 {
    public int A;
    public int B;
    public int C;
    public byte D;
    public /* synthetic */ Object E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ H1372144443810590316 H;
    public final /* synthetic */ ClientSession I;
    public final /* synthetic */ Map J;
    public H1372144443810590316 t;
    public ClientSession u;
    public Map v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        izmyclvb.dpqpjfpoanwt1(1870);
    }

    private native void ptkcmhunlkcn();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H13135965260981764200(long j, long j2, H1372144443810590316 h1372144443810590316, ClientSession clientSession, Map<String, ? extends Object> map, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.F = j;
        this.G = j2;
        this.H = h1372144443810590316;
        this.I = clientSession;
        this.J = map;
        ptkcmhunlkcn();
    }
}
