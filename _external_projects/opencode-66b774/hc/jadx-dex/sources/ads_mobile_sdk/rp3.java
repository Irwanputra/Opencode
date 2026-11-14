package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class rp3 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.rp3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private dev.epro.r0.O6641393078261985068 blockedStartupLocations_;
    private long maxTimePerTaskInUiThreadMs_;
    private dev.epro.r0.O6641393078261985068 nonUiThreadBlockingStartupLocations_;
    private long totalTimeInUiThreadMs_;
    private dev.epro.r0.O6641393078261985068 uiThreadBlockingStartupLocations_;

    static {
        ads_mobile_sdk.rp3 rp3Var = new ads_mobile_sdk.rp3();
        DEFAULT_INSTANCE = rp3Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.rp3.class, rp3Var);
    }

    public rp3() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.blockedStartupLocations_ = in2Var;
        this.nonUiThreadBlockingStartupLocations_ = in2Var;
        this.uiThreadBlockingStartupLocations_ = in2Var;
    }

    public static dev.epro.r0.T5192260350625585663 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new java.lang.Object[]{"totalTimeInUiThreadMs_", "maxTimePerTaskInUiThreadMs_", "blockedStartupLocations_", "nonUiThreadBlockingStartupLocations_", "uiThreadBlockingStartupLocations_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.rp3();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.T5192260350625585663(DEFAULT_INSTANCE);
    }
}
