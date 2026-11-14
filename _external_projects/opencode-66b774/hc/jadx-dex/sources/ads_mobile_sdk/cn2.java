package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cn2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.cn2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    private long appStartProgramUpdateDelayMs_;
    private int bitField0_;
    private boolean enableRetryDownload_;
    private boolean reinitializeAfterUpdate_;
    private boolean updateBeforeInitialization_;
    private boolean updateOnInitializationOnly_ = true;
    private long minUpdateIntervalMs_ = 600000;
    private long programAlmostExpiredMs_ = 3600000;
    private java.lang.String programRequestUrl_ = "https://pagead2.googlesyndication.com/mads/asp";
    private long maxRetryCount_ = 5;
    private long retryBaseIntervalMs_ = 60000;

    static {
        ads_mobile_sdk.cn2 cn2Var = new ads_mobile_sdk.cn2();
        DEFAULT_INSTANCE = cn2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.cn2.class, cn2Var);
    }

    public static ads_mobile_sdk.cn2 p() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.N6751852577264376817 w() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new java.lang.Object[]{"bitField0_", "updateOnInitializationOnly_", "reinitializeAfterUpdate_", "updateBeforeInitialization_", "minUpdateIntervalMs_", "programAlmostExpiredMs_", "programRequestUrl_", "appStartProgramUpdateDelayMs_", "enableRetryDownload_", "maxRetryCount_", "retryBaseIntervalMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.cn2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.N6751852577264376817(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 32;
        this.programRequestUrl_ = str;
    }

    public final boolean q() {
        return this.enableRetryDownload_;
    }

    public final long r() {
        return this.maxRetryCount_;
    }

    public final long s() {
        return this.programAlmostExpiredMs_;
    }

    public final java.lang.String t() {
        return this.programRequestUrl_;
    }

    public final long u() {
        return this.retryBaseIntervalMs_;
    }

    public final boolean v() {
        return this.updateBeforeInitialization_;
    }

    public final long o() {
        return this.appStartProgramUpdateDelayMs_;
    }
}
