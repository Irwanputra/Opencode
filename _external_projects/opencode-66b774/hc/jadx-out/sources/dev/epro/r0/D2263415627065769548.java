package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D2263415627065769548 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ L9852841107405549527 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D2263415627065769548(L9852841107405549527 l9852841107405549527, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.u = l9852841107405549527;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L9852841107405549527 l9852841107405549527 = this.u;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj;
        switch (b) {
            case 0:
                new D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            default:
                new D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L9852841107405549527 l9852841107405549527 = this.u;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                l9852841107405549527.B = false;
                break;
            case 1:
                E17665849472693074628.k(obj);
                l9852841107405549527.c();
                break;
            case 2:
                E17665849472693074628.k(obj);
                l9852841107405549527.a(l9852841107405549527.B);
                break;
            default:
                E17665849472693074628.k(obj);
                l9852841107405549527.o();
                break;
        }
        return o9245300239821758723;
    }
}
