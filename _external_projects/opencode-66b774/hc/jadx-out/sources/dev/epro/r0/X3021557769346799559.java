package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X3021557769346799559 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X3021557769346799559(int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                new X3021557769346799559(b2, (R4833348786910499294) obj, (byte) 0);
                E17665849472693074628.k(o9245300239821758723);
                break;
            default:
                new X3021557769346799559(b2, (R4833348786910499294) obj, b2);
                E17665849472693074628.k(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                break;
            default:
                E17665849472693074628.k(obj);
                break;
        }
        return o9245300239821758723;
    }
}
