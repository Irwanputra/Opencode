package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zk0 extends java.util.LinkedHashMap {
    public final int a;
    public final java.util.ArrayList c;

    public zk0(java.util.ArrayList arrayList, int i) {
        this.a = i;
        this.c = arrayList;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        this.c.add(new dev.epro.r0.H9390398899829886498(ads_mobile_sdk.g13.EVICTION_REASON_OVERFLOW, entry.getValue()));
        return true;
    }
}
