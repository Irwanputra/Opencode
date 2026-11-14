package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p53 extends cu0 {
    private static final p53 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private boolean cacheHit_;
    private int retryNumber_;
    private boolean thirdPartyCookiesEnabled_;
    private boolean wasLastSignalUsed_;

    static {
        p53 p53Var = new p53();
        DEFAULT_INSTANCE = p53Var;
        cu0.a(p53.class, p53Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"retryNumber_", "wasLastSignalUsed_", "thirdPartyCookiesEnabled_", "cacheHit_"});
        }
        if (iE == 3) {
            return new p53();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
