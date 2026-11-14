package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class t40 extends cu0 {
    private static final t40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long firstInteractionTimestampMsec_;
    private long lastInteractionTimestampMsec_;
    private int occurrenceCount_;
    private int securityInterstitialInteraction_;

    static {
        t40 t40Var = new t40();
        DEFAULT_INSTANCE = t40Var;
        cu0.a(t40.class, t40Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "securityInterstitialInteraction_", tt.a$2, "occurrenceCount_", "firstInteractionTimestampMsec_", "lastInteractionTimestampMsec_"});
        }
        if (iE == 3) {
            return new t40();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
