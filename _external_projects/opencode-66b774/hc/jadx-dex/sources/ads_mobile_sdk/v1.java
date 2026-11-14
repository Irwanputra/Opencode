package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum v1 {
    FORMAT_DEFAULT(0),
    ONE_PIXEL(1),
    /* JADX INFO: Fake field, exist only in values array */
    AD_LOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMPRESSION(3),
    THIRD_PARTY_SDK_CALLBACK(4);

    public static final java.util.LinkedHashMap c;
    public final byte a;

    static {
        ads_mobile_sdk.v1[] v1VarArrValues = values();
        int iU0 = dev.epro.r0.E4951175994894594588.u0(v1VarArrValues.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iU0 < 16 ? 16 : iU0);
        for (ads_mobile_sdk.v1 v1Var : v1VarArrValues) {
            linkedHashMap.put(java.lang.Integer.valueOf(v1Var.a), v1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    v1(int i) {
        this.a = i;
    }
}
