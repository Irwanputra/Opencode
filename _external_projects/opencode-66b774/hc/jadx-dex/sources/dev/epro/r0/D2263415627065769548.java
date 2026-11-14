package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D2263415627065769548 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ dev.epro.r0.L9852841107405549527 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D2263415627065769548(dev.epro.r0.L9852841107405549527 l9852841107405549527, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.u = l9852841107405549527;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.L9852841107405549527 l9852841107405549527 = this.u;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj;
        switch (b) {
            case 0:
                new dev.epro.r0.D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new dev.epro.r0.D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new dev.epro.r0.D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            default:
                new dev.epro.r0.D2263415627065769548(l9852841107405549527, r4833348786910499294, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.L9852841107405549527 l9852841107405549527 = this.u;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                l9852841107405549527.B = false;
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                l9852841107405549527.c();
                break;
            case 2:
                dev.epro.r0.E17665849472693074628.k(obj);
                l9852841107405549527.a(l9852841107405549527.B);
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                l9852841107405549527.o();
                break;
        }
        return o9245300239821758723;
    }
}
