package ads_mobile_sdk;

import dev.epro.r0.E4951175994894594588;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public enum y1 {
    FORMAT_DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    ON_AD_OPENED(1),
    /* JADX INFO: Fake field, exist only in values array */
    ON_AD_SHOW(2),
    THIRD_PARTY_SDK_CALLBACK(3);

    public static final LinkedHashMap c;
    public final byte a;

    static {
        y1[] y1VarArrValues = values();
        int iU0 = E4951175994894594588.u0(y1VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU0 < 16 ? 16 : iU0);
        for (y1 y1Var : y1VarArrValues) {
            linkedHashMap.put(Integer.valueOf(y1Var.a), y1Var);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    y1(int i) {
        this.a = i;
    }
}
