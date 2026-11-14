package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sp extends cu0 {
    private static final sp DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private int errorType_;

    static {
        sp spVar = new sp();
        DEFAULT_INSTANCE = spVar;
        cu0.a(sp.class, spVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "errorType_", ad.a$28});
        }
        if (iE == 3) {
            return new sp();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
