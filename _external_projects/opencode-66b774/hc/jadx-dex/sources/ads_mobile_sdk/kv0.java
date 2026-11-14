package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kv0 extends ads_mobile_sdk.cu0 {
    public static final int A = 16;
    public static final int B = 17;
    public static final int C = 18;
    public static final int D = 19;
    private static final ads_mobile_sdk.kv0 DEFAULT_INSTANCE;
    public static final int E = 20;
    public static final int F = 21;
    public static final int G = 22;
    public static final int H = 23;
    public static final int I = 24;
    public static final int J = 25;
    public static final int K = 26;
    public static final int L = 27;
    public static final int M = 28;
    public static final int N = 29;
    public static final int O = 30;
    public static final int P = 31;
    public static final int Q = 40;
    public static final int R = 42;
    public static final int S = 43;
    public static final int T = 44;
    public static final int U = 45;
    public static final int V = 46;
    public static final int W = 47;
    public static final int X = 48;
    public static final int Y = 49;
    public static final int Z = 50;
    public static final int a0 = 51;
    private static final dev.epro.r0.B4259731004323267459 activeCuiStack_converter_ = new dev.epro.r0.O12545633033254628644((byte) 9);
    public static final int b0 = 52;
    public static final int c = 1;
    public static final int c0 = 53;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 41;
    public static final int m = 10;
    public static final int n = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f69o = 11;
    public static final int p = 12;
    public static final int q = 13;
    public static final int r = 14;
    public static final int s = 33;
    public static final int t = 34;
    public static final int u = 35;
    public static final int v = 36;
    public static final int w = 37;
    public static final int x = 38;
    public static final int y = 39;
    public static final int z = 15;
    private int activeCuiStackMemoizedSerializedSize;
    private dev.epro.r0.R17185427375111049466 activeCuiStack_;
    private int activeCui_;
    private java.lang.String adUnitId_;
    private long availableMemoryBytes_;
    private int bitField0_;
    private ads_mobile_sdk.yr chromeVariations_;
    private ads_mobile_sdk.jv0 deobfuscatedStacktrace_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableMemoryTier_;
    private int deviceAvailableProcessorTier_;
    private int displayHeight_;
    private int displayWidth_;
    private int format_;
    private long gmsCoreVersion_;
    private int liveWebviewCount_;
    private dev.epro.r0.O6641393078261985068 loadedAdsStats_;
    private boolean lowMemory_;
    private int mediationChainLength_;
    private int networkType_;
    private int orientation_;
    private int os_;
    private long samplingDenominator_;
    private dev.epro.r0.O6641393078261985068 showingAdsStats_;
    private int targetVersion_;
    private long thresholdMemoryBytes_;
    private long timeMsec_;
    private int totalCpu_;
    private long totalMemoryBytes_;
    private boolean trapped_;
    private int experimentIdMemoizedSerializedSize = -1;
    private java.lang.String name_ = "";
    private java.lang.String exceptionClass_ = "";
    private java.lang.String topException_ = "";
    private java.lang.String stacktrace_ = "";
    private java.lang.String sdkVersion_ = "";
    private java.lang.String afmaVersion_ = "";
    private java.lang.String webViewVersion_ = "";
    private java.lang.String appName_ = "";
    private java.lang.String appVersionName_ = "";
    private java.lang.String appId_ = "";
    private java.lang.String osVersion_ = "";
    private java.lang.String deviceModel_ = "";
    private java.lang.String country_ = "";
    private dev.epro.r0.U12378827310912896889 experimentId_ = ads_mobile_sdk.wm1.e;
    private java.lang.String sessionId_ = "";
    private java.lang.String requestId_ = "";
    private java.lang.String adId_ = "";
    private java.lang.String backendQueryId_ = "";
    private java.lang.String gwsQueryId_ = "";
    private java.lang.String mediationAdapter_ = "";
    private java.lang.String mediationAdapterVersion_ = "";
    private java.lang.String plugin_ = "";
    private java.lang.String stackTraceHash_ = "";
    private java.lang.String requestAgent_ = "";
    private java.lang.String unityEditorVersion_ = "";

    static {
        ads_mobile_sdk.kv0 kv0Var = new ads_mobile_sdk.kv0();
        DEFAULT_INSTANCE = kv0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.kv0.class, kv0Var);
    }

    public kv0() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.loadedAdsStats_ = in2Var;
        this.showingAdsStats_ = in2Var;
        this.activeCuiStack_ = ads_mobile_sdk.jb1.e;
        this.adUnitId_ = "";
    }

    public static dev.epro.r0.K9808832422180718119 p() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u00045\u0000\u0001\u000155\u0000\u0004\u0000\u0001\u0002\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000bȈ\fȈ\r\u0004\u000eȈ\u000fȈ\u0010%\u0011\f\u0012\u0004\u0013\u0002\u0014\f\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001fဉ\u0000 Ȉ!\u0004\"\u0004#\u0004$\u0002%\u0002&\u0002'\u0007(ဉ\u0001)Ȉ*Ȉ+Ȉ,\u0004-\u001b.\u001b/\f0\f1\f2,3\u00044Ȉ5\f", new java.lang.Object[]{"bitField0_", "timeMsec_", "trapped_", "name_", "exceptionClass_", "topException_", "stacktrace_", "os_", "sdkVersion_", "afmaVersion_", "appName_", "appId_", "osVersion_", "targetVersion_", "deviceModel_", "country_", "experimentId_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "sessionId_", "requestId_", "adId_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "samplingDenominator_", "stackTraceHash_", "deobfuscatedStacktrace_", "appVersionName_", "displayWidth_", "displayHeight_", "totalCpu_", "totalMemoryBytes_", "availableMemoryBytes_", "thresholdMemoryBytes_", "lowMemory_", "chromeVariations_", "webViewVersion_", "requestAgent_", "unityEditorVersion_", "liveWebviewCount_", "loadedAdsStats_", ads_mobile_sdk.gv0.class, "showingAdsStats_", ads_mobile_sdk.gv0.class, "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_", "activeCui_", "activeCuiStack_", "mediationChainLength_", "adUnitId_", "deviceAvailableMemoryTier_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.kv0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.K9808832422180718119(DEFAULT_INSTANCE);
    }

    public final void b(ads_mobile_sdk.gv0 gv0Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.showingAdsStats_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.showingAdsStats_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(gv0Var);
    }

    public final void d(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.afmaVersion_ = str;
    }

    public final void e(java.lang.String str) {
        this.appId_ = str;
    }

    public final void i(java.lang.String str) {
        this.country_ = str;
    }

    public final void j(java.lang.String str) {
        java.lang.String str2 = android.os.Build.MODEL;
        java.util.Objects.requireNonNull(str2);
        this.deviceModel_ = str2;
    }

    public final void k(java.lang.String str) {
        this.exceptionClass_ = str;
    }

    public final void l(java.lang.String str) {
        this.gwsQueryId_ = str;
    }

    public final void m(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.mediationAdapter_ = str;
    }

    public final void n(java.lang.String str) {
        this.mediationAdapterVersion_ = "";
    }

    public final void o(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.name_ = str;
    }

    public final void p$1() {
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        java.util.Objects.requireNonNull(str);
        this.osVersion_ = str;
    }

    public final void s(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    public final void t(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.sdkVersion_ = str;
    }

    public final void c(java.lang.String str) {
        this.adUnitId_ = str;
    }

    public final void f(java.lang.String str) {
        this.appName_ = str;
    }

    public final void g(java.lang.String str) {
        this.appVersionName_ = str;
    }

    public final void h(java.lang.String str) {
        this.backendQueryId_ = str;
    }

    public final void r(java.lang.String str) {
        this.requestAgent_ = str;
    }

    public final void u(java.lang.String str) {
        this.sessionId_ = str;
    }

    public final void v(java.lang.String str) {
        this.stackTraceHash_ = str;
    }

    public final void w(java.lang.String str) {
        this.stacktrace_ = str;
    }

    public final void x(java.lang.String str) {
        this.topException_ = str;
    }

    public final void y(java.lang.String str) {
        this.unityEditorVersion_ = str;
    }

    public final void z(java.lang.String str) {
        this.webViewVersion_ = str;
    }

    public static ads_mobile_sdk.kv0 o() {
        return DEFAULT_INSTANCE;
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.adId_ = str;
    }

    public final void a(ads_mobile_sdk.gv0 gv0Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.loadedAdsStats_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.loadedAdsStats_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(gv0Var);
    }

    public final void a(ads_mobile_sdk.yr yrVar) {
        this.chromeVariations_ = yrVar;
        this.bitField0_ |= 2;
    }
}
