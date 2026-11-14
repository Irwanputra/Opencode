package ads_mobile_sdk;

import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class h13 extends cu0 {
    private static final h13 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int evictionReason_;
    private int scarRequestType_;
    private String requestId_ = "";
    private String requestAgent_ = "";

    static {
        h13 h13Var = new h13();
        DEFAULT_INSTANCE = h13Var;
        cu0.a(h13.class, h13Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"evictionReason_", "requestId_", "scarRequestType_", "requestAgent_"});
        }
        if (iE == 3) {
            return new h13();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
