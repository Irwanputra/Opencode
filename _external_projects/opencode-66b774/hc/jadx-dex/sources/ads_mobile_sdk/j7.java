package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j7 extends ads_mobile_sdk.cu0 {
    public static final int A = 26;
    public static final int B = 27;
    public static final int C = 28;
    public static final int D = 29;
    private static final ads_mobile_sdk.j7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 22;
    public static final int e = 9;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 3;
    public static final int i = 25;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 18;
    public static final int n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f58o = 8;
    public static final int p = 10;
    public static final int q = 11;
    public static final int r = 12;
    public static final int s = 13;
    public static final int t = 14;
    public static final int u = 15;
    public static final int v = 16;
    public static final int w = 17;
    public static final int x = 19;
    public static final int y = 20;
    public static final int z = 21;
    private boolean allowFallbackToStaticProgram_;
    private int bitField0_;
    private boolean cancelQueuedSignalTaskOnTimeout_;
    private boolean enableAsyncInputEventProcessing_;
    private boolean enableLazyScheduler_;
    private boolean enableViewstringBinding_;
    private boolean forceInitializeWithStaticProgram_;
    private int hostType_;
    private ads_mobile_sdk.tm1 loggingOptions_;
    private ads_mobile_sdk.cn2 programUpdateOptions_;
    private int requestedAdshieldVersion_;
    private int fallbackAdshieldVersion_ = 1;
    private boolean allowFallback_ = true;
    private java.lang.String hostVersion_ = "unknown_host";
    private boolean enableGassClient_ = true;
    private long appStartQuerySignalsTimeoutMs_ = 100;
    private long signalsTimeoutMs_ = 2000;
    private long gassSignalTimeoutMs_ = 10;
    private long localIntSignalTimeoutMs_ = 100;
    private long httpRequestTimeoutMs_ = 20000;
    private java.lang.String prodInstallerCert_ = "";
    private java.lang.String debugInstallerCert_ = "";
    private long methodTimeoutMs_ = 500;
    private long appStartWindowMs_ = 3000;
    private boolean enableMinimalAppStartQuerySignals_ = true;
    private boolean clearDgArgsAfterUse_ = true;
    private boolean enableDgProgramCache_ = true;
    private boolean enableMinimalCerSignal_ = true;
    private boolean skipProgramUpdateWithStaticProgram_ = true;

    static {
        ads_mobile_sdk.j7 j7Var = new ads_mobile_sdk.j7();
        DEFAULT_INSTANCE = j7Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.j7.class, j7Var);
    }

    public static dev.epro.r0.R735986421272980610 P() {
        return DEFAULT_INSTANCE.e();
    }

    public final int B$1() {
        int i_a$2 = dev.epro.r0.G6547577305291411977._a$2(this.fallbackAdshieldVersion_);
        if (i_a$2 == 0) {
            return 2;
        }
        return i_a$2;
    }

    public final int E() {
        int i2;
        switch (this.hostType_) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return 8;
        }
        return i2;
    }

    public final java.lang.String F() {
        return this.hostVersion_;
    }

    public final long G() {
        return this.httpRequestTimeoutMs_;
    }

    public final long H() {
        return this.localIntSignalTimeoutMs_;
    }

    public final ads_mobile_sdk.tm1 I() {
        ads_mobile_sdk.tm1 tm1Var = this.loggingOptions_;
        return tm1Var == null ? ads_mobile_sdk.tm1.o() : tm1Var;
    }

    public final long J() {
        return this.methodTimeoutMs_;
    }

    public final java.lang.String K() {
        return this.prodInstallerCert_;
    }

    public final ads_mobile_sdk.cn2 L() {
        ads_mobile_sdk.cn2 cn2Var = this.programUpdateOptions_;
        return cn2Var == null ? ads_mobile_sdk.cn2.p() : cn2Var;
    }

    public final int M() {
        int i_a$2 = dev.epro.r0.G6547577305291411977._a$2(this.requestedAdshieldVersion_);
        if (i_a$2 == 0) {
            return 1;
        }
        return i_a$2;
    }

    public final long N() {
        return this.signalsTimeoutMs_;
    }

    public final boolean O() {
        return this.skipProgramUpdateWithStaticProgram_;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            ads_mobile_sdk.ad adVar = ads_mobile_sdk.ad.a$4;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u001c\u0000\u0001\u0001\u001d\u001c\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b", new java.lang.Object[]{"bitField0_", "requestedAdshieldVersion_", adVar, "hostVersion_", "enableGassClient_", "loggingOptions_", "enableViewstringBinding_", "signalsTimeoutMs_", "programUpdateOptions_", "allowFallback_", "gassSignalTimeoutMs_", "localIntSignalTimeoutMs_", "httpRequestTimeoutMs_", "prodInstallerCert_", "debugInstallerCert_", "methodTimeoutMs_", "appStartWindowMs_", "enableMinimalAppStartQuerySignals_", "appStartQuerySignalsTimeoutMs_", "clearDgArgsAfterUse_", "enableDgProgramCache_", "enableLazyScheduler_", "fallbackAdshieldVersion_", adVar, "allowFallbackToStaticProgram_", "forceInitializeWithStaticProgram_", "hostType_", "enableMinimalCerSignal_", "skipProgramUpdateWithStaticProgram_", "enableAsyncInputEventProcessing_", "cancelQueuedSignalTaskOnTimeout_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.j7();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.R735986421272980610(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 131072;
        this.debugInstallerCert_ = str;
    }

    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.hostVersion_ = str;
    }

    public final void d(java.lang.String str) {
        this.bitField0_ |= 65536;
        this.prodInstallerCert_ = str;
    }

    public final boolean A() {
        return this.enableViewstringBinding_;
    }

    public final boolean C() {
        return this.forceInitializeWithStaticProgram_;
    }

    public final long D() {
        return this.gassSignalTimeoutMs_;
    }

    public final boolean o() {
        return this.allowFallback_;
    }

    public final boolean p() {
        return this.allowFallbackToStaticProgram_;
    }

    public final long q() {
        return this.appStartQuerySignalsTimeoutMs_;
    }

    public final long r() {
        return this.appStartWindowMs_;
    }

    public final boolean s() {
        return this.cancelQueuedSignalTaskOnTimeout_;
    }

    public final boolean t() {
        return this.clearDgArgsAfterUse_;
    }

    public final java.lang.String u() {
        return this.debugInstallerCert_;
    }

    public final boolean v() {
        return this.enableAsyncInputEventProcessing_;
    }

    public final boolean w() {
        return this.enableGassClient_;
    }

    public final boolean x() {
        return this.enableLazyScheduler_;
    }

    public final boolean y() {
        return this.enableMinimalAppStartQuerySignals_;
    }

    public final boolean z() {
        return this.enableMinimalCerSignal_;
    }

    public final void a(ads_mobile_sdk.tm1 tm1Var) {
        this.loggingOptions_ = tm1Var;
        this.bitField0_ |= 256;
    }

    public final void a(ads_mobile_sdk.cn2 cn2Var) {
        this.programUpdateOptions_ = cn2Var;
        this.bitField0_ |= 4096;
    }
}
