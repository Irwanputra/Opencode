package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class h71 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.rg0 a;
    public final ads_mobile_sdk.rg0 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ h71(ads_mobile_sdk.rg0 rg0Var, ads_mobile_sdk.rg0 rg0Var2, byte b) {
        this.c = b;
        this.a = rg0Var;
        this.b = rg0Var2;
    }

    public final java.lang.Object get() {
        byte b = this.c;
        ads_mobile_sdk.rg0 rg0Var = this.b;
        ads_mobile_sdk.rg0 rg0Var2 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.g71((ads_mobile_sdk.sb) rg0Var2.get(), (ads_mobile_sdk.ci3) rg0Var.get());
            case 1:
                ads_mobile_sdk.zj1 zj1Var = (ads_mobile_sdk.zj1) rg0Var2.get();
                ads_mobile_sdk.fz fzVar = (ads_mobile_sdk.fz) rg0Var.get();
                zj1Var.getClass();
                fzVar.getClass();
                return new ads_mobile_sdk.f41(zj1Var, fzVar, (byte) 0);
            default:
                return new ads_mobile_sdk.tm3((ads_mobile_sdk.fz) rg0Var2.get(), (ads_mobile_sdk.ci3) rg0Var.get());
        }
    }
}
