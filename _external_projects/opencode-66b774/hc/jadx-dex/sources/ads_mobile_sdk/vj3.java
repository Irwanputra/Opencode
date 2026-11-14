package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vj3 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.yj3 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj3(ads_mobile_sdk.yj3 yj3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = yj3Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.vj3(yj3Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.vj3(yj3Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.vj3(yj3Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.vj3(yj3Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.yj3 yj3Var = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                yj3Var.g.set(true);
                dev.epro.r0.G16472559273103586035 g16472559273103586035 = yj3Var.d;
                if (g16472559273103586035.isConnected() || g16472559273103586035.isConnecting()) {
                    g16472559273103586035.disconnect();
                }
                android.os.Binder.flushPendingCommands();
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                try {
                    dev.epro.r0.T3920948503184368030 t3920948503184368030 = (dev.epro.r0.B1049225300677980478) yj3Var.d.getService();
                    java.lang.String packageName = yj3Var.b.getPackageName();
                    packageName.getClass();
                    t3920948503184368030.e(new ads_mobile_sdk.gg0(packageName), yj3Var);
                } catch (java.lang.Throwable th) {
                    ads_mobile_sdk.qu0 qu0Var = new ads_mobile_sdk.qu0(th, 0, null, 6);
                    int i = ads_mobile_sdk.yj3.j;
                    if (!yj3Var.f.getAndSet(true)) {
                        yj3Var.h.S(qu0Var);
                    }
                    yj3Var.c.a("Throwable caught getting trustless token", th);
                }
                break;
        }
        return o9245300239821758723;
    }
}
