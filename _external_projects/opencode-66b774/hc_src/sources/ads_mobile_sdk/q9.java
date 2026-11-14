package ads_mobile_sdk;

import dev.epro.r0.E4951175994894594588;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public enum q9 {
    UNKNOWN(0),
    CPM(1),
    CPC(2),
    ONE_PIXEL(3);

    public static final LinkedHashMap c;
    public final byte a;

    static {
        q9[] values = values();
        int u0 = E4951175994894594588.u0(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0 < 16 ? 16 : u0);
        for (q9 q9Var : values) {
            linkedHashMap.put(Integer.valueOf(q9Var.a), q9Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    q9(int i) {
        this.a = i;
    }
}
