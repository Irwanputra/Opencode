package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u53 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.u53 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private boolean automaticRefresh_;
    private boolean staleResultAllowed_;

    static {
        ads_mobile_sdk.u53 u53Var = new ads_mobile_sdk.u53();
        DEFAULT_INSTANCE = u53Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.u53.class, u53Var);
    }

    public static dev.epro.r0.P12919425594506621964 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new java.lang.Object[]{"automaticRefresh_", "staleResultAllowed_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.u53();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.P12919425594506621964(DEFAULT_INSTANCE);
    }
}
