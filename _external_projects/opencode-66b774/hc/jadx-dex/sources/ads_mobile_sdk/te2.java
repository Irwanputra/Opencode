package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class te2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.te2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private boolean cacheHit_;
    private int cacheMissReason_;
    private boolean isFromPreviousSession_;
    private int numAdsInCachedResponse_;
    private int numRequestedAds_;
    private long timeInCacheMs_;

    static {
        ads_mobile_sdk.te2 te2Var = new ads_mobile_sdk.te2();
        DEFAULT_INSTANCE = te2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.te2.class, te2Var);
    }

    public static dev.epro.r0.S590478652786116557 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005", new java.lang.Object[]{"bitField0_", "cacheHit_", "isFromPreviousSession_", "cacheMissReason_", "numRequestedAds_", "numAdsInCachedResponse_", "timeInCacheMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.te2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.S590478652786116557(DEFAULT_INSTANCE);
    }
}
