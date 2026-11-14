package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class no0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.ro0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(ads_mobile_sdk.ro0 ro0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = ro0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.ro0 ro0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.no0(ro0Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.no0(ro0Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.ro0 ro0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.no0(ro0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.no0(ro0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.ro0 ro0Var = this.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.O9245300239821758723 o92453002398217587232 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.T913357428039952817 t913357428039952817 = new dev.epro.r0.T913357428039952817(3, "Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.a = true;
                    ro0Var.a(t913357428039952817, (dev.epro.r0.R4833348786910499294) this);
                    if (o92453002398217587232 == o9245300239821758723) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.T913357428039952817 t9133574280399528172 = new dev.epro.r0.T913357428039952817(2, "This ad has already been shown.");
                    this.a = true;
                    ro0Var.a(t9133574280399528172, (dev.epro.r0.R4833348786910499294) this);
                    if (o92453002398217587232 == o9245300239821758723) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return o92453002398217587232;
    }
}
