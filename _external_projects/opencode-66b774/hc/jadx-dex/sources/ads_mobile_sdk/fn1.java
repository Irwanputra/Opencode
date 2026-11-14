package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fn1 extends ads_mobile_sdk.e {
    public static final ads_mobile_sdk.hb1 b = ads_mobile_sdk.hb1.a(java.util.Collections.EMPTY_MAP);

    public final java.lang.Object get() {
        java.util.Map map = this.a;
        int size = map.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((dev.epro.r0.V2597580950516131749) entry.getValue()).get());
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }
}
