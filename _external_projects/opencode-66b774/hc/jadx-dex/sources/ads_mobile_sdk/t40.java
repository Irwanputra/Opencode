package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class t40 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.t40 DEFAULT_INSTANCE;
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
        ads_mobile_sdk.t40 t40Var = new ads_mobile_sdk.t40();
        DEFAULT_INSTANCE = t40Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.t40.class, t40Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"bitField0_", "securityInterstitialInteraction_", ads_mobile_sdk.tt.a$2, "occurrenceCount_", "firstInteractionTimestampMsec_", "lastInteractionTimestampMsec_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.t40();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
