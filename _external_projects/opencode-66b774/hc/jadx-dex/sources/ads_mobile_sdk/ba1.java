package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ba1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ba1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int gesture_;
    private boolean isGloballyAllowlisted_;
    private boolean isLinkedDevice_;
    private boolean isTestMode_;
    private long networkExtrasExpirationSecs_;
    private java.lang.String networkExtras_ = "";
    private java.lang.String deviceIdForDebugging_ = "";
    private java.lang.String debugAdUnitId_ = "";
    private java.lang.String uiStorage_ = "";

    static {
        ads_mobile_sdk.ba1 ba1Var = new ads_mobile_sdk.ba1();
        DEFAULT_INSTANCE = ba1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ba1.class, ba1Var);
    }

    public static ads_mobile_sdk.ba1 p() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.P1700237029420726696 y() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007", new java.lang.Object[]{"isTestMode_", "isLinkedDevice_", "gesture_", "networkExtras_", "networkExtrasExpirationSecs_", "deviceIdForDebugging_", "debugAdUnitId_", "uiStorage_", "isGloballyAllowlisted_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ba1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.P1700237029420726696(DEFAULT_INSTANCE);
    }

    public final void e(java.lang.String str) {
        this.uiStorage_ = str;
    }

    public final java.lang.String o() {
        return this.debugAdUnitId_;
    }

    public final java.lang.String q() {
        return this.deviceIdForDebugging_;
    }

    public final int r$2() {
        int i2 = this.gesture_;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 3 : 2 : 1;
        if (i3 == 0) {
            return 4;
        }
        return i3;
    }

    public final boolean s() {
        return this.isGloballyAllowlisted_;
    }

    public final boolean t() {
        return this.isLinkedDevice_;
    }

    public final boolean u() {
        return this.isTestMode_;
    }

    public final java.lang.String v() {
        return this.networkExtras_;
    }

    public final long w() {
        return this.networkExtrasExpirationSecs_;
    }

    public final java.lang.String x() {
        return this.uiStorage_;
    }

    public final void b(java.lang.String str) {
        this.debugAdUnitId_ = str;
    }

    public final void c(java.lang.String str) {
        this.deviceIdForDebugging_ = str;
    }

    public final void d(java.lang.String str) {
        this.networkExtras_ = str;
    }

    public static ads_mobile_sdk.ba1 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.ba1) cu0VarA;
    }
}
