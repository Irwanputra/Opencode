package ads_mobile_sdk;

import dev.epro.r0.N6751852577264376817;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 extends cu0 {
    private static final cn2 DEFAULT_INSTANCE;
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
    private String programRequestUrl_ = "https://pagead2.googlesyndication.com/mads/asp";
    private long maxRetryCount_ = 5;
    private long retryBaseIntervalMs_ = 60000;

    static {
        cn2 cn2Var = new cn2();
        DEFAULT_INSTANCE = cn2Var;
        cu0.a(cn2.class, cn2Var);
    }

    public static cn2 p() {
        return DEFAULT_INSTANCE;
    }

    public static N6751852577264376817 w() {
        return (N6751852577264376817) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "updateOnInitializationOnly_", "reinitializeAfterUpdate_", "updateBeforeInitialization_", "minUpdateIntervalMs_", "programAlmostExpiredMs_", "programRequestUrl_", "appStartProgramUpdateDelayMs_", "enableRetryDownload_", "maxRetryCount_", "retryBaseIntervalMs_"});
        }
        if (iE == 3) {
            return new cn2();
        }
        if (iE != 4) {
            return null;
        }
        return new N6751852577264376817(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
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

    public final String t() {
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
