package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.K9808832422180718119;
import dev.epro.r0.O12545633033254628644;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.U12378827310912896889;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 extends cu0 {
    public static final int A = 16;
    public static final int B = 17;
    public static final int C = 18;
    public static final int D = 19;
    private static final kv0 DEFAULT_INSTANCE;
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
    private static final B4259731004323267459 activeCuiStack_converter_ = new O12545633033254628644((byte) 9);
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
    private R17185427375111049466 activeCuiStack_;
    private int activeCui_;
    private String adUnitId_;
    private long availableMemoryBytes_;
    private int bitField0_;
    private yr chromeVariations_;
    private jv0 deobfuscatedStacktrace_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableMemoryTier_;
    private int deviceAvailableProcessorTier_;
    private int displayHeight_;
    private int displayWidth_;
    private int format_;
    private long gmsCoreVersion_;
    private int liveWebviewCount_;
    private O6641393078261985068 loadedAdsStats_;
    private boolean lowMemory_;
    private int mediationChainLength_;
    private int networkType_;
    private int orientation_;
    private int os_;
    private long samplingDenominator_;
    private O6641393078261985068 showingAdsStats_;
    private int targetVersion_;
    private long thresholdMemoryBytes_;
    private long timeMsec_;
    private int totalCpu_;
    private long totalMemoryBytes_;
    private boolean trapped_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String name_ = "";
    private String exceptionClass_ = "";
    private String topException_ = "";
    private String stacktrace_ = "";
    private String sdkVersion_ = "";
    private String afmaVersion_ = "";
    private String webViewVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private U12378827310912896889 experimentId_ = wm1.e;
    private String sessionId_ = "";
    private String requestId_ = "";
    private String adId_ = "";
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String stackTraceHash_ = "";
    private String requestAgent_ = "";
    private String unityEditorVersion_ = "";

    static {
        kv0 kv0Var = new kv0();
        DEFAULT_INSTANCE = kv0Var;
        cu0.a(kv0.class, kv0Var);
    }

    public kv0() {
        in2 in2Var = in2.e;
        this.loadedAdsStats_ = in2Var;
        this.showingAdsStats_ = in2Var;
        this.activeCuiStack_ = jb1.e;
        this.adUnitId_ = "";
    }

    public static K9808832422180718119 p() {
        return (K9808832422180718119) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u00045\u0000\u0001\u000155\u0000\u0004\u0000\u0001\u0002\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000bȈ\fȈ\r\u0004\u000eȈ\u000fȈ\u0010%\u0011\f\u0012\u0004\u0013\u0002\u0014\f\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001fဉ\u0000 Ȉ!\u0004\"\u0004#\u0004$\u0002%\u0002&\u0002'\u0007(ဉ\u0001)Ȉ*Ȉ+Ȉ,\u0004-\u001b.\u001b/\f0\f1\f2,3\u00044Ȉ5\f", new Object[]{"bitField0_", "timeMsec_", "trapped_", "name_", "exceptionClass_", "topException_", "stacktrace_", "os_", "sdkVersion_", "afmaVersion_", "appName_", "appId_", "osVersion_", "targetVersion_", "deviceModel_", "country_", "experimentId_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "sessionId_", "requestId_", "adId_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "samplingDenominator_", "stackTraceHash_", "deobfuscatedStacktrace_", "appVersionName_", "displayWidth_", "displayHeight_", "totalCpu_", "totalMemoryBytes_", "availableMemoryBytes_", "thresholdMemoryBytes_", "lowMemory_", "chromeVariations_", "webViewVersion_", "requestAgent_", "unityEditorVersion_", "liveWebviewCount_", "loadedAdsStats_", gv0.class, "showingAdsStats_", gv0.class, "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_", "activeCui_", "activeCuiStack_", "mediationChainLength_", "adUnitId_", "deviceAvailableMemoryTier_"});
        }
        if (iE == 3) {
            return new kv0();
        }
        if (iE != 4) {
            return null;
        }
        return new K9808832422180718119(DEFAULT_INSTANCE);
    }

    public final void b(gv0 gv0Var) {
        O6641393078261985068 o6641393078261985068B = this.showingAdsStats_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.showingAdsStats_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(gv0Var);
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.afmaVersion_ = str;
    }

    public final void e(String str) {
        this.appId_ = str;
    }

    public final void i(String str) {
        this.country_ = str;
    }

    public final void j(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.deviceModel_ = str2;
    }

    public final void k(String str) {
        this.exceptionClass_ = str;
    }

    public final void l(String str) {
        this.gwsQueryId_ = str;
    }

    public final void m(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapter_ = str;
    }

    public final void n(String str) {
        this.mediationAdapterVersion_ = "";
    }

    public final void o(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    public final void p$1() {
        String str = Build.VERSION.RELEASE;
        Objects.requireNonNull(str);
        this.osVersion_ = str;
    }

    public final void s(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    public final void t(String str) {
        Objects.requireNonNull(str);
        this.sdkVersion_ = str;
    }

    public final void c(String str) {
        this.adUnitId_ = str;
    }

    public final void f(String str) {
        this.appName_ = str;
    }

    public final void g(String str) {
        this.appVersionName_ = str;
    }

    public final void h(String str) {
        this.backendQueryId_ = str;
    }

    public final void r(String str) {
        this.requestAgent_ = str;
    }

    public final void u(String str) {
        this.sessionId_ = str;
    }

    public final void v(String str) {
        this.stackTraceHash_ = str;
    }

    public final void w(String str) {
        this.stacktrace_ = str;
    }

    public final void x(String str) {
        this.topException_ = str;
    }

    public final void y(String str) {
        this.unityEditorVersion_ = str;
    }

    public final void z(String str) {
        this.webViewVersion_ = str;
    }

    public static kv0 o() {
        return DEFAULT_INSTANCE;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.adId_ = str;
    }

    public final void a(gv0 gv0Var) {
        O6641393078261985068 o6641393078261985068B = this.loadedAdsStats_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.loadedAdsStats_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(gv0Var);
    }

    public final void a(yr yrVar) {
        this.chromeVariations_ = yrVar;
        this.bitField0_ |= 2;
    }
}
