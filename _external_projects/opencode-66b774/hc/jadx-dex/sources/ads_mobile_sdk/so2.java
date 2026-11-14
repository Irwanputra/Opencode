package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class so2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ dev.epro.r0.V16504496955554646429 a;
    public final /* synthetic */ dev.epro.r0.W2873663528421101773 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so2(dev.epro.r0.V16504496955554646429 v16504496955554646429, dev.epro.r0.W2873663528421101773 w2873663528421101773, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = v16504496955554646429;
        this.b = w2873663528421101773;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.W2873663528421101773 w2873663528421101773 = this.b;
        dev.epro.r0.V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, r4833348786910499294, (byte) 1);
            default:
                return new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, r4833348786910499294, (byte) 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W2873663528421101773 w2873663528421101773 = this.b;
        dev.epro.r0.V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        dev.epro.r0.U11450443558875589191 u11450443558875589191 = ads_mobile_sdk.ti3.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W2873663528421101773 w2873663528421101773 = this.b;
        dev.epro.r0.V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
                dev.epro.r0.U2722688686349128662 u2722688686349128662 = dev.epro.r0.U2722688686349128662.b;
                dev.epro.r0.G8001132634698687269 context = getContext();
                u2722688686349128662.getClass();
                dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u2722688686349128662, context).minusKey(u11450443558875589191).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.fb((java.lang.Object) v16504496955554646429, (java.lang.Object) w2873663528421101773, r4833348786910499294, (byte) 15), 3);
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                v16504496955554646429.a(((ads_mobile_sdk.xo2) w2873663528421101773).a);
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.P5733283974459951585 p57332839744599515852 = ads_mobile_sdk.rw0.f;
                dev.epro.r0.U2722688686349128662 u27226886863491286622 = dev.epro.r0.U2722688686349128662.b;
                dev.epro.r0.G8001132634698687269 context2 = getContext();
                u27226886863491286622.getClass();
                dev.epro.r0.R7033599853981556291.E(dev.epro.r0.O8620973563946607355.a(dev.epro.r0.S10823041268949770285.O(u27226886863491286622, context2).minusKey(u11450443558875589191).minusKey(dev.epro.r0.B14824868959299866349.e).minusKey(dev.epro.r0.P2382941533350862833.p)), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.so2(v16504496955554646429, w2873663528421101773, r4833348786910499294, (byte) 1), 3);
                break;
        }
        return o9245300239821758723;
    }
}
