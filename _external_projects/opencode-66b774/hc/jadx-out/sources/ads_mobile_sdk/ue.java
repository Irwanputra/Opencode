package ads_mobile_sdk;

import dev.epro.r0.F8558020411982013788;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ue extends cu0 {
    private static final ue DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int eventType_;
    private long timestampMs_;

    static {
        ue ueVar = new ue();
        DEFAULT_INSTANCE = ueVar;
        cu0.a(ue.class, ueVar);
    }

    public static F8558020411982013788 o() {
        return (F8558020411982013788) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"eventType_", "timestampMs_"});
        }
        if (iE == 3) {
            return new ue();
        }
        if (iE != 4) {
            return null;
        }
        return new F8558020411982013788(DEFAULT_INSTANCE);
    }
}
