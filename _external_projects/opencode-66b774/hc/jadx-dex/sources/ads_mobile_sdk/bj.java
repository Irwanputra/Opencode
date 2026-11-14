package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bj implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final ads_mobile_sdk.rg0 b;
    public final /* synthetic */ byte c;

    public bj(ads_mobile_sdk.rg0 rg0Var, ads_mobile_sdk.hb1 hb1Var) {
        this.c = (byte) 2;
        this.b = rg0Var;
        this.a = hb1Var;
    }

    public final java.lang.Object get() {
        byte b = this.c;
        ads_mobile_sdk.rg0 rg0Var = this.b;
        ads_mobile_sdk.hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                android.content.Context context = (android.content.Context) hb1Var.a;
                ads_mobile_sdk.ci3 ci3Var = (ads_mobile_sdk.ci3) rg0Var.get();
                context.getClass();
                ci3Var.getClass();
                ads_mobile_sdk.ri riVar = new ads_mobile_sdk.ri();
                riVar.c = 1.0f;
                return riVar;
            case 1:
                return new ads_mobile_sdk.di0((android.content.Context) hb1Var.a, (ads_mobile_sdk.ci3) rg0Var.get());
            case 2:
                return new ads_mobile_sdk.kl((ads_mobile_sdk.y2) rg0Var.get(), (ads_mobile_sdk.z1) hb1Var.a);
            case 3:
                android.content.Context context2 = (android.content.Context) hb1Var.a;
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) rg0Var.get();
                context2.getClass();
                w5797197595347441198.getClass();
                return dev.epro.r0.N5158094851646208854.f(ads_mobile_sdk.n1.a, w5797197595347441198, new ads_mobile_sdk.ef(context2, (byte) 2));
            case 4:
                ads_mobile_sdk.z1 z1Var = (ads_mobile_sdk.z1) hb1Var.a;
                ads_mobile_sdk.b01 b01Var = (ads_mobile_sdk.b01) rg0Var.get();
                z1Var.getClass();
                b01Var.getClass();
                return new ads_mobile_sdk.a91(b01Var, (byte) 5);
            default:
                return new ads_mobile_sdk.pr((android.content.Context) hb1Var.a, (ads_mobile_sdk.ci3) rg0Var.get());
        }
    }

    public /* synthetic */ bj(ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.rg0 rg0Var, byte b) {
        this.c = b;
        this.a = hb1Var;
        this.b = rg0Var;
    }
}
