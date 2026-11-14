package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wd3 extends cu0 {
    private static final wd3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int requiredScreenHoldSec_;
    private int settleCount_;
    private boolean settleEndDueToAppBackground_;
    private int videoAutoplayStartTime_;

    static {
        wd3 wd3Var = new wd3();
        DEFAULT_INSTANCE = wd3Var;
        cu0.a(wd3.class, wd3Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f\u0004\u0007", new Object[]{"settleCount_", "requiredScreenHoldSec_", "videoAutoplayStartTime_", "settleEndDueToAppBackground_"});
        }
        if (iE == 3) {
            return new wd3();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
