package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T9511376708243583971;
import dev.epro.r0.U12378827310912896889;
import dev.epro.r0.Y2677586711477821327;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 extends cu0 {
    public static final int A = 23;
    public static final int A0 = 69;
    public static final int B = 77;
    public static final int B0 = 71;
    public static final int C = 78;
    public static final int C0 = 79;
    public static final int D = 91;
    public static final int D0 = 80;
    private static final ew0 DEFAULT_INSTANCE;
    public static final int E = 24;
    public static final int E0 = 73;
    public static final int F = 25;
    public static final int F0 = 74;
    public static final int G = 9;
    public static final int G0 = 81;
    public static final int H = 53;
    public static final int H0 = 82;
    public static final int I = 10;
    public static final int I0 = 83;
    public static final int J = 72;
    public static final int J0 = 84;
    public static final int K = 11;
    public static final int K0 = 85;
    public static final int L = 66;
    public static final int L0 = 86;
    public static final int M = 67;
    public static final int M0 = 88;
    public static final int N = 68;
    public static final int N0 = 89;
    public static final int O = 12;
    public static final int O0 = 90;
    public static final int P = 13;
    public static final int Q = 14;
    public static final int R = 26;
    public static final int S = 27;
    public static final int T = 46;
    public static final int U = 45;
    public static final int V = 43;
    public static final int W = 87;
    public static final int X = 48;
    public static final int Y = 44;
    public static final int Z = 49;
    public static final int a0 = 50;
    public static final int b0 = 28;
    public static final int c = 1;
    public static final int c0 = 60;
    public static final int d = 40;
    public static final int d0 = 15;
    public static final int e = 30;
    public static final int e0 = 16;
    public static final int f = 31;
    public static final int f0 = 17;
    public static final int g = 32;
    public static final int g0 = 18;
    public static final int h = 33;
    public static final int h0 = 19;
    public static final int i = 37;
    public static final int i0 = 20;
    public static final int j = 2;
    public static final int j0 = 29;
    public static final int k = 3;
    public static final int k0 = 55;
    public static final int l = 34;
    public static final int l0 = 56;
    public static final int m = 75;
    public static final int m0 = 38;
    public static final int n = 76;
    public static final int n0 = 39;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f33o = 35;
    public static final int o0 = 57;
    public static final int p = 36;
    public static final int p0 = 47;
    public static final int q = 4;
    public static final int q0 = 41;
    public static final int r = 5;
    public static final int r0 = 42;
    public static final int s = 21;
    public static final int s0 = 52;
    public static final int t = 70;
    public static final int t0 = 54;
    private static final B4259731004323267459 tag_converter_ = new Y2677586711477821327((byte) 13);
    public static final int u = 22;
    public static final int u0 = 58;
    public static final int v = 64;
    public static final int v0 = 59;
    public static final int w = 6;
    public static final int w0 = 61;
    public static final int x = 51;
    public static final int x0 = 62;
    public static final int y = 7;
    public static final int y0 = 63;
    public static final int z = 8;
    public static final int z0 = 65;
    private int adConfigurationIndex_;
    private ta adapterInitializationDetails_;
    private int bitField0_;
    private int cachedSignalState_;
    private vr centralizedManagerPreloadData_;
    private long childCpuTimeMillis_;
    private yr chromeVariations_;
    private int contentProviderType_;
    private long cpuTimeMillis_;
    private int customTabsNavigationEvent_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableMemoryTier_;
    private int deviceAvailableProcessorTier_;
    private int format_;
    private long gmsCoreVersion_;
    private int gmsgName_;
    private lz0 h5Data_;
    private boolean hadCachedFlags_;
    private n01 hsdpServiceData_;
    private wa1 installReferrerDetails_;
    private boolean isFirstSessionAfterInstall_;
    private boolean isHtmlResponse_;
    private cl1 jsEngineData_;
    private long latencyMillis_;
    private int liveWebviewCount_;
    private int mediationChainLength_;
    private iq1 mraidData_;
    private int name_;
    private int networkTypeCoarse_;
    private int networkType_;
    private i42 offlineData_;
    private int orientation_;
    private int os_;
    private long parentTraceId_;
    private rc2 persistentCacheEventData_;
    private te2 persistentCacheRequestData_;
    private ch2 postClickLifecycleMonitoringData_;
    private ri2 preloadData_;
    private int previousAppExitReason_;
    private int previousAppExitSignal_;
    private int processState_;
    private long samplingDenominator_;
    private j13 scarCacheEvictionData_;
    private int scarRequestType_;
    private int sequenceNumber_;
    private p53 signalCacheData_;
    private u53 signalData_;
    private int signalId_;
    private boolean skipUninitializedAdapters_;
    private long startTimeMillis_;
    private boolean success_;
    private wd3 swipeableInterstitialSettleData_;
    private int tagMemoizedSerializedSize;
    private int targetVersion_;
    private long timeSinceSdkInitCompleteMillis_;
    private long timeSinceSdkInitStartMillis_;
    private long traceDepth_;
    private long traceId_;
    private rp3 webviewData_;
    private boolean wereCachedFlagsReset_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String rootTraceId_ = "";
    private R17185427375111049466 tag_ = jb1.e;
    private String sdkVersion_ = "";
    private String canonicalSdkVersion_ = "";
    private String webViewVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String adUnitId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private U12378827310912896889 experimentId_ = wm1.e;
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String signalGenerationRequestId_ = "";
    private String internalRequestId_ = "";
    private String renderId_ = "";
    private String renderer_ = "";
    private String adId_ = "";
    private String preloadId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String topException_ = "";
    private String stackTraceHash_ = "";
    private String cause_ = "";
    private String cronetProvider_ = "";
    private String rawChromeVariations_ = "";
    private String requestAgent_ = "";
    private String unityEditorVersion_ = "";

    static {
        ew0 ew0Var = new ew0();
        DEFAULT_INSTANCE = ew0Var;
        cu0.a(ew0.class, ew0Var);
    }

    public static T9511376708243583971 o() {
        return (T9511376708243583971) DEFAULT_INSTANCE.e();
    }

    public final void B() {
        this.signalGenerationRequestId_ = "";
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004[\u0000\u0001\u0001[[\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\fOဉ\fPဉ\rQ\u0007RȈSȈTဉ\u000eUဉ\u000fVဉ\u0010W\u0007Xဉ\u0011Y\fZ\u0004[\f", new Object[]{"bitField0_", "name_", "success_", "latencyMillis_", "os_", "sdkVersion_", "appId_", "osVersion_", "targetVersion_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "topException_", "stackTraceHash_", "cause_", "canonicalSdkVersion_", "appName_", "deviceModel_", "country_", "experimentId_", "sessionId_", "requestId_", "adId_", "samplingDenominator_", "rootTraceId_", "traceId_", "parentTraceId_", "traceDepth_", "startTimeMillis_", "cpuTimeMillis_", "childCpuTimeMillis_", "tag_", "signalId_", "cachedSignalState_", "gmsgName_", "scarCacheEvictionData_", "h5Data_", "sequenceNumber_", "renderId_", "internalRequestId_", "signalGenerationRequestId_", "scarRequestType_", "mediationChainLength_", "adConfigurationIndex_", "renderer_", "adUnitId_", "mraidData_", "processState_", "jsEngineData_", "cronetProvider_", "customTabsNavigationEvent_", "signalData_", "signalCacheData_", "preloadData_", "preloadId_", "offlineData_", "chromeVariations_", "rawChromeVariations_", "appVersionName_", "webviewData_", "isFirstSessionAfterInstall_", "hadCachedFlags_", "wereCachedFlagsReset_", "postClickLifecycleMonitoringData_", "webViewVersion_", "installReferrerDetails_", "networkTypeCoarse_", "previousAppExitReason_", "previousAppExitSignal_", "timeSinceSdkInitStartMillis_", "timeSinceSdkInitCompleteMillis_", "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_", "adapterInitializationDetails_", "centralizedManagerPreloadData_", "skipUninitializedAdapters_", "requestAgent_", "unityEditorVersion_", "swipeableInterstitialSettleData_", "persistentCacheRequestData_", "persistentCacheEventData_", "isHtmlResponse_", "hsdpServiceData_", "contentProviderType_", "liveWebviewCount_", "deviceAvailableMemoryTier_"});
        }
        if (iE == 3) {
            return new ew0();
        }
        if (iE != 4) {
            return null;
        }
        return new T9511376708243583971(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.adId_ = str;
    }

    public final void e(String str) {
        this.appName_ = str;
    }

    public final void h(String str) {
        Objects.requireNonNull(str);
        this.canonicalSdkVersion_ = str;
    }

    public final void i(String str) {
        this.cause_ = str;
    }

    public final void j(String str) {
        this.country_ = str;
    }

    public final void k(String str) {
        this.cronetProvider_ = str;
    }

    public final void l(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.deviceModel_ = str2;
    }

    public final void n(String str) {
        Objects.requireNonNull(str);
        this.internalRequestId_ = str;
    }

    public final void p$1() {
        this.mediationAdapterVersion_ = "";
    }

    public final void q() {
        String str = Build.VERSION.RELEASE;
        Objects.requireNonNull(str);
        this.osVersion_ = str;
    }

    public final void s(String str) {
        this.preloadId_ = "";
    }

    public final void u(String str) {
        Objects.requireNonNull(str);
        this.renderId_ = str;
    }

    public final void v(String str) {
        Objects.requireNonNull(str);
        this.renderer_ = str;
    }

    public final void x(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    public final void z(String str) {
        Objects.requireNonNull(str);
        this.sdkVersion_ = str;
    }

    public final void A(String str) {
        this.sessionId_ = str;
    }

    public final void C(String str) {
        this.stackTraceHash_ = str;
    }

    public final void D(String str) {
        this.topException_ = str;
    }

    public final void E(String str) {
        this.unityEditorVersion_ = str;
    }

    public final void F(String str) {
        this.webViewVersion_ = str;
    }

    public final void c(String str) {
        this.adUnitId_ = str;
    }

    public final void d(String str) {
        this.appId_ = str;
    }

    public final void f(String str) {
        this.appVersionName_ = str;
    }

    public final void g(String str) {
        this.backendQueryId_ = str;
    }

    public final void m(String str) {
        this.gwsQueryId_ = str;
    }

    public final void t(String str) {
        this.rawChromeVariations_ = str;
    }

    public final void w(String str) {
        this.requestAgent_ = str;
    }

    public final void y(String str) {
        this.rootTraceId_ = str;
    }

    public final void o(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapter_ = str;
    }

    public final void a(iq1 iq1Var) {
        this.mraidData_ = iq1Var;
        this.bitField0_ |= 8;
    }

    public final void a(ta taVar) {
        this.adapterInitializationDetails_ = taVar;
        this.bitField0_ |= 4096;
    }

    public final void a(i42 i42Var) {
        this.offlineData_ = i42Var;
        this.bitField0_ |= 128;
    }

    public final void a(rp3 rp3Var) {
        this.webviewData_ = rp3Var;
        this.bitField0_ |= 512;
    }

    public final void a(vr vrVar) {
        this.centralizedManagerPreloadData_ = vrVar;
        this.bitField0_ |= 8192;
    }

    public final void a(rc2 rc2Var) {
        this.persistentCacheEventData_ = rc2Var;
        this.bitField0_ |= 65536;
    }

    public final void a(yr yrVar) {
        this.chromeVariations_ = yrVar;
        this.bitField0_ |= 256;
    }

    public final void a(te2 te2Var) {
        this.persistentCacheRequestData_ = te2Var;
        this.bitField0_ |= 32768;
    }

    public final void a(ch2 ch2Var) {
        this.postClickLifecycleMonitoringData_ = ch2Var;
        this.bitField0_ |= 1024;
    }

    public final void a(n01 n01Var) {
        this.hsdpServiceData_ = n01Var;
        this.bitField0_ |= 131072;
    }

    public final void a(wa1 wa1Var) {
        this.installReferrerDetails_ = wa1Var;
        this.bitField0_ |= 2048;
    }

    public final void a(j13 j13Var) {
        this.scarCacheEvictionData_ = j13Var;
        this.bitField0_ |= 2;
    }

    public final void a(cl1 cl1Var) {
        this.jsEngineData_ = cl1Var;
        this.bitField0_ |= 16;
    }

    public final void a(u53 u53Var) {
        this.signalData_ = u53Var;
        this.bitField0_ |= 1;
    }
}
