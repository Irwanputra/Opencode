package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class tc extends cu0 {
    private static final tc DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int frontCamera_ = 1000;
    private int rearCamera_ = 1000;
    private int frontFlash_ = 1000;
    private int rearFlash_ = 1000;

    static {
        tc tcVar = new tc();
        DEFAULT_INSTANCE = tcVar;
        cu0.a(tc.class, tcVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            ad adVar = ad.a$2;
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "frontCamera_", adVar, "rearCamera_", adVar, "frontFlash_", adVar, "rearFlash_", adVar});
        }
        if (e2 == 3) {
            return new tc();
        }
        if (e2 != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
