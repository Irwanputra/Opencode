package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wa1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.wa1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private boolean googlePlayInstant_;
    private long installBeginTimestampSeconds_;
    private long installBeginTimestampServerSeconds_;
    private int installReferrerErrorCode_;
    private java.lang.String installReferrer_ = "";
    private java.lang.String installVersion_ = "";
    private long referrerClickTimestampSeconds_;
    private long referrerClickTimestampServerSeconds_;

    static {
        ads_mobile_sdk.wa1 wa1Var = new ads_mobile_sdk.wa1();
        DEFAULT_INSTANCE = wa1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.wa1.class, wa1Var);
    }

    public static dev.epro.r0.B12268161065087441760 o() {
        return (dev.epro.r0.B12268161065087441760) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new java.lang.Object[]{"installReferrer_", "referrerClickTimestampSeconds_", "installBeginTimestampSeconds_", "googlePlayInstant_", "referrerClickTimestampServerSeconds_", "installBeginTimestampServerSeconds_", "installVersion_", "installReferrerErrorCode_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.wa1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.B12268161065087441760(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.installReferrer_ = str;
    }

    public final void c(java.lang.String str) {
        this.installVersion_ = str;
    }
}
