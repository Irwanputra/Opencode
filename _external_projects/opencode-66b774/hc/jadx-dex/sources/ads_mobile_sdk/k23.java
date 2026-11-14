package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k23 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.rg0 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final ads_mobile_sdk.rg0 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ k23(ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.rg0 rg0Var2, byte b) {
        this.d = b;
        this.a = rg0Var;
        this.b = v2597580950516131749;
        this.c = rg0Var2;
    }

    public final java.lang.Object get() {
        byte b = this.d;
        ads_mobile_sdk.rg0 rg0Var = this.c;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.b;
        ads_mobile_sdk.rg0 rg0Var2 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.j23((dev.epro.r0.W5797197595347441198) rg0Var2.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get(), (ads_mobile_sdk.zj1) rg0Var.get());
            case 1:
                return new ads_mobile_sdk.n23((dev.epro.r0.W5797197595347441198) rg0Var2.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get(), (ads_mobile_sdk.zj1) rg0Var.get());
            default:
                return new ads_mobile_sdk.ra3((ads_mobile_sdk.w81) rg0Var2.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get(), (ads_mobile_sdk.ci3) rg0Var.get());
        }
    }
}
