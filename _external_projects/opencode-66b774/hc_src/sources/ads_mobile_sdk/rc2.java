package ads_mobile_sdk;

import dev.epro.r0.H7256849770726990427;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class rc2 extends cu0 {
    private static final rc2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int clearReason_;
    private int fillDisabledReason_;
    private int numAdsCleared_;

    static {
        rc2 rc2Var = new rc2();
        DEFAULT_INSTANCE = rc2Var;
        cu0.a(rc2.class, rc2Var);
    }

    public static H7256849770726990427 o() {
        return (H7256849770726990427) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "clearReason_", "numAdsCleared_", "fillDisabledReason_"});
        }
        if (e2 == 3) {
            return new rc2();
        }
        if (e2 != 4) {
            return null;
        }
        return new H7256849770726990427(DEFAULT_INSTANCE);
    }
}
