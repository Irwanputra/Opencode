package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class rc2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.rc2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int clearReason_;
    private int fillDisabledReason_;
    private int numAdsCleared_;

    static {
        ads_mobile_sdk.rc2 rc2Var = new ads_mobile_sdk.rc2();
        DEFAULT_INSTANCE = rc2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.rc2.class, rc2Var);
    }

    public static dev.epro.r0.H7256849770726990427 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002", new java.lang.Object[]{"bitField0_", "clearReason_", "numAdsCleared_", "fillDisabledReason_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.rc2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.H7256849770726990427(DEFAULT_INSTANCE);
    }
}
