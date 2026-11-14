package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vr extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vr DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private int numPreloadedAds_;
    private int numPreloaders_;
    private int preloaderFormat_;
    private boolean preloaderInFlight_;
    private int preloaderMaxBufferSize_;
    private int preloaderNumAdsAvailable_;
    private java.lang.String preloaderPreloadId_ = "";
    private int totalInflightAdLimit_;

    static {
        ads_mobile_sdk.vr vrVar = new ads_mobile_sdk.vr();
        DEFAULT_INSTANCE = vrVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vr.class, vrVar);
    }

    public static dev.epro.r0.G7029564828874647201 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new java.lang.Object[]{"totalInflightAdLimit_", "numPreloadedAds_", "numPreloaders_", "preloaderFormat_", "preloaderPreloadId_", "preloaderMaxBufferSize_", "preloaderNumAdsAvailable_", "preloaderInFlight_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vr();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.G7029564828874647201(DEFAULT_INSTANCE);
    }
}
