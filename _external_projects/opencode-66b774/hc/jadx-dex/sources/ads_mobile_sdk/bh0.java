package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bh0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.ih0 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(ads_mobile_sdk.ih0 ih0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = ih0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.ih0 ih0Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 5);
            default:
                return new ads_mobile_sdk.bh0(ih0Var, r4833348786910499294, (byte) 6);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.ih0 ih0Var = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.bh0(ih0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.P14306640982153864715 p14306640982153864715A = this.a.a();
                if (p14306640982153864715A != null) {
                    p14306640982153864715A.c();
                }
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                synchronized (this.a) {
                }
                break;
            case 2:
                dev.epro.r0.E17665849472693074628.k(obj);
                this.a.a();
                break;
            case 3:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.P14306640982153864715 p14306640982153864715A2 = this.a.a();
                if (p14306640982153864715A2 != null) {
                    p14306640982153864715A2.d();
                }
                break;
            case 4:
                dev.epro.r0.E17665849472693074628.k(obj);
                this.a.a();
                break;
            case 5:
                dev.epro.r0.E17665849472693074628.k(obj);
                synchronized (this.a) {
                }
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
                ads_mobile_sdk.ih0 ih0Var = this.a;
                dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
                dev.epro.r0.G8001132634698687269 context = getContext();
                u2722688686349128662.getClass();
                dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(ads_mobile_sdk.ti3.b).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bh0(ih0Var, null, (byte) 5), 3);
                break;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
