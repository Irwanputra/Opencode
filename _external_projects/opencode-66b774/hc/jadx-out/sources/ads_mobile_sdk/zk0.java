package ads_mobile_sdk;

import dev.epro.r0.H9390398899829886498;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 extends LinkedHashMap {
    public final int a;
    public final ArrayList c;

    public zk0(ArrayList arrayList, int i) {
        this.a = i;
        this.c = arrayList;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        this.c.add(new H9390398899829886498(g13.EVICTION_REASON_OVERFLOW, entry.getValue()));
        return true;
    }
}
