package ads_mobile_sdk;

import dev.epro.r0.E4951175994894594588;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public enum v1 {
    FORMAT_DEFAULT(0),
    ONE_PIXEL(1),
    /* JADX INFO: Fake field, exist only in values array */
    AD_LOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMPRESSION(3),
    THIRD_PARTY_SDK_CALLBACK(4);

    public static final LinkedHashMap c;
    public final byte a;

    static {
        v1[] values = values();
        int u0 = E4951175994894594588.u0(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0 < 16 ? 16 : u0);
        for (v1 v1Var : values) {
            linkedHashMap.put(Integer.valueOf(v1Var.a), v1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    v1(int i) {
        this.a = i;
    }
}
