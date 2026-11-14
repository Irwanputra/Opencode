package ads_mobile_sdk;

import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends cu0 {
    private static final lz0 DEFAULT_INSTANCE;
    public static final int c = 1;
    private String action_ = "";

    static {
        lz0 lz0Var = new lz0();
        DEFAULT_INSTANCE = lz0Var;
        cu0.a(lz0.class, lz0Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"action_"});
        }
        if (iE == 3) {
            return new lz0();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
