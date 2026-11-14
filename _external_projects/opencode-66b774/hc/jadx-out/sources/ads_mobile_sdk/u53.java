package ads_mobile_sdk;

import dev.epro.r0.P12919425594506621964;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u53 extends cu0 {
    private static final u53 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private boolean automaticRefresh_;
    private boolean staleResultAllowed_;

    static {
        u53 u53Var = new u53();
        DEFAULT_INSTANCE = u53Var;
        cu0.a(u53.class, u53Var);
    }

    public static P12919425594506621964 o() {
        return (P12919425594506621964) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"automaticRefresh_", "staleResultAllowed_"});
        }
        if (iE == 3) {
            return new u53();
        }
        if (iE != 4) {
            return null;
        }
        return new P12919425594506621964(DEFAULT_INSTANCE);
    }
}
