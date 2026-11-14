package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v80 implements dev.epro.r0.V2597580950516131749 {
    public final java.lang.Object a;
    public final /* synthetic */ byte b = 0;

    public v80(dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        v2597580950516131749.getClass();
        this.a = v2597580950516131749;
    }

    public final java.lang.Object get() {
        byte b = this.b;
        java.lang.Object obj = this.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.m3 m3Var = (ads_mobile_sdk.m3) obj;
                ads_mobile_sdk.r80 r80Var = (ads_mobile_sdk.r80) m3Var.a;
                ads_mobile_sdk.m3 m3Var2 = (ads_mobile_sdk.m3) m3Var.b;
                dev.epro.r0.O11692414993408430441 o11692414993408430441 = new dev.epro.r0.O11692414993408430441();
                o11692414993408430441.a = r80Var;
                o11692414993408430441.b = m3Var2;
                return o11692414993408430441;
            default:
                return java.util.Optional.of(((dev.epro.r0.V2597580950516131749) obj).get());
        }
    }

    public v80(ads_mobile_sdk.m3 m3Var) {
        this.a = m3Var;
    }
}
