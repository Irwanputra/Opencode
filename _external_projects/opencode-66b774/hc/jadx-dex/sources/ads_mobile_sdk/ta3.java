package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ta3 implements dev.epro.r0.V2597580950516131749 {
    public static final java.lang.Object c = new java.lang.Object();
    public volatile dev.epro.r0.B8427392651679410143 a;
    public volatile java.lang.Object b;

    public static dev.epro.r0.V2597580950516131749 a(dev.epro.r0.B8427392651679410143 b8427392651679410143) {
        if ((b8427392651679410143 instanceof ads_mobile_sdk.ta3) || (b8427392651679410143 instanceof ads_mobile_sdk.gj0)) {
            return b8427392651679410143;
        }
        ads_mobile_sdk.ta3 ta3Var = new ads_mobile_sdk.ta3();
        ta3Var.b = c;
        ta3Var.a = b8427392651679410143;
        return ta3Var;
    }

    public final java.lang.Object get() {
        java.lang.Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        dev.epro.r0.B8427392651679410143 b8427392651679410143 = this.a;
        if (b8427392651679410143 == null) {
            return this.b;
        }
        java.lang.Object obj2 = b8427392651679410143.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
