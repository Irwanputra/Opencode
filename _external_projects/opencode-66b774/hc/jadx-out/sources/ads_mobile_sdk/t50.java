package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class t50 extends cu0 {
    private static final t50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int hashRealtimeThreatType_;
    private int urlRealtimeThreatType_;

    static {
        t50 t50Var = new t50();
        DEFAULT_INSTANCE = t50Var;
        cu0.a(t50.class, t50Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            tt ttVar = tt.a$3;
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "hashRealtimeThreatType_", ttVar, "urlRealtimeThreatType_", ttVar});
        }
        if (iE == 3) {
            return new t50();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
