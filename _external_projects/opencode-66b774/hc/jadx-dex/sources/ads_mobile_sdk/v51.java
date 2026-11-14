package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v51 implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final ads_mobile_sdk.r33 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ v51(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.r33 r33Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = r33Var;
    }

    public final java.lang.Object get() {
        byte b = this.c;
        ads_mobile_sdk.r33 r33Var = this.b;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.g0 g0Var = (ads_mobile_sdk.g0) v2597580950516131749.get();
                java.util.Set set = (java.util.Set) r33Var.get();
                g0Var.getClass();
                set.getClass();
                return new ads_mobile_sdk.f41(g0Var, set, (byte) 1);
            default:
                return new ads_mobile_sdk.ub3((ads_mobile_sdk.pb3) v2597580950516131749.get(), (java.util.Set) r33Var.get());
        }
    }
}
