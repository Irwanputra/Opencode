package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class aa implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final ads_mobile_sdk.fn1 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ aa(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.fn1 fn1Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = fn1Var;
    }

    public final java.lang.Object get() {
        byte b = this.c;
        ads_mobile_sdk.fn1 fn1Var = this.b;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.z9((dev.epro.r0.W5797197595347441198) v2597580950516131749.get(), (java.util.Map) fn1Var.get());
            case 1:
                return new ads_mobile_sdk.is3((dev.epro.r0.W5797197595347441198) v2597580950516131749.get(), (java.util.Map) fn1Var.get());
            case 2:
                return new ads_mobile_sdk.ja((dev.epro.r0.W5797197595347441198) v2597580950516131749.get(), (java.util.Map) fn1Var.get());
            case 3:
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) v2597580950516131749.get();
                java.util.Map map = (java.util.Map) fn1Var.get();
                w5797197595347441198.getClass();
                map.getClass();
                return new dev.epro.r0.T1501356432609323047(w5797197595347441198, map);
            case 4:
                return new ads_mobile_sdk.ts3((dev.epro.r0.W5797197595347441198) v2597580950516131749.get(), (java.util.Map) fn1Var.get());
            default:
                dev.epro.r0.W5797197595347441198 w57971975953474411982 = (dev.epro.r0.W5797197595347441198) v2597580950516131749.get();
                java.util.Map map2 = (java.util.Map) fn1Var.get();
                w57971975953474411982.getClass();
                map2.getClass();
                return new dev.epro.r0.G2352924714470945535(w57971975953474411982, map2);
        }
    }
}
