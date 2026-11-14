package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f40 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.f40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int action_;
    private int bitField0_;
    private long intervalMsec_;
    private boolean isTerminalAction_;
    private int surface_;

    static {
        ads_mobile_sdk.f40 f40Var = new ads_mobile_sdk.f40();
        DEFAULT_INSTANCE = f40Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.f40.class, f40Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"bitField0_", "surface_", ads_mobile_sdk.ad.a$7, "action_", ads_mobile_sdk.ad.a$1, "isTerminalAction_", "intervalMsec_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.f40();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
