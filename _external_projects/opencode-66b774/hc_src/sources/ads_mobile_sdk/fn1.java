package ads_mobile_sdk;

import dev.epro.r0.V2597580950516131749;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fn1 extends e {
    public static final hb1 b = hb1.a(Collections.EMPTY_MAP);

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        Map map = this.a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((V2597580950516131749) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
