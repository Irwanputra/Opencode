package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum y1 {
    FORMAT_DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    ON_AD_OPENED(1),
    /* JADX INFO: Fake field, exist only in values array */
    ON_AD_SHOW(2),
    THIRD_PARTY_SDK_CALLBACK(3);

    public static final java.util.LinkedHashMap c;
    public final byte a;

    static {
        ads_mobile_sdk.y1[] y1VarArrValues = values();
        int iU0 = dev.epro.r0.E4951175994894594588.u0(y1VarArrValues.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iU0 < 16 ? 16 : iU0);
        for (ads_mobile_sdk.y1 y1Var : y1VarArrValues) {
            linkedHashMap.put(java.lang.Integer.valueOf(y1Var.a), y1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    y1(int i) {
        this.a = i;
    }
}
