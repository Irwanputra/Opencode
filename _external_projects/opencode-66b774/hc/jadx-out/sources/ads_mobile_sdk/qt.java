package ads_mobile_sdk;

import dev.epro.r0.L12317760381951726138;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qt extends cu0 {
    private static final qt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int pluginIndex_;
    private String pluginName_ = "";
    private int pluginState_;

    static {
        qt qtVar = new qt();
        DEFAULT_INSTANCE = qtVar;
        cu0.a(qt.class, qtVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"bitField0_", "pluginName_", "pluginState_", tt.a, "pluginIndex_"});
        }
        if (iE == 3) {
            return new qt();
        }
        if (iE != 4) {
            return null;
        }
        return new L12317760381951726138(DEFAULT_INSTANCE);
    }
}
