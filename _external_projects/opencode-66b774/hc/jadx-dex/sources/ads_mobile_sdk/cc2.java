package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cc2 {
    public java.lang.Integer A;
    public final ads_mobile_sdk.p53 B;
    public final java.lang.Boolean D;
    public final java.lang.Integer E;
    public final java.lang.Integer F;
    public ads_mobile_sdk.rp3 G;
    public ads_mobile_sdk.ch2 H;
    public ads_mobile_sdk.n01 I;
    public ads_mobile_sdk.wa1 J;
    public ads_mobile_sdk.ta K;
    public ads_mobile_sdk.vr L;
    public ads_mobile_sdk.rc2 N;
    public int Q;
    public int R;
    public int a;
    public final ads_mobile_sdk.mi3 b;
    public final ads_mobile_sdk.wv0 c;
    public final java.util.List d;
    public final java.util.UUID e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public int l;
    public boolean m;
    public java.lang.Throwable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Throwable f18o;
    public long p;
    public long q;
    public long r;
    public final java.util.ArrayList s;
    public ads_mobile_sdk.u73 t;
    public final ads_mobile_sdk.j13 u;
    public ads_mobile_sdk.iq1 w;
    public int x;
    public ads_mobile_sdk.cl1 y;
    public java.lang.String z;

    public cc2(int i, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.wv0 wv0Var, java.util.List list, java.util.UUID uuid, int i2, int i3, long j, long j2, long j3, boolean z, java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, int i4) {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.e;
        long jZ = dev.epro.r0.M9216324016624295870.Z(0, n13798149404328803870);
        long jZ2 = dev.epro.r0.M9216324016624295870.Z(0, n13798149404328803870);
        long jZ3 = dev.epro.r0.M9216324016624295870.Z(0, n13798149404328803870);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Boolean bool2 = (i4 & 536870912) != 0 ? null : bool;
        java.lang.Integer num3 = (i4 & 1073741824) != 0 ? null : num;
        java.lang.Integer num4 = (i4 & Integer.MIN_VALUE) != 0 ? null : num2;
        mi3Var.getClass();
        wv0Var.getClass();
        this.a = i;
        this.b = mi3Var;
        this.c = wv0Var;
        this.d = list;
        this.e = uuid;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = z;
        this.l = 0;
        this.m = true;
        this.n = null;
        this.f18o = null;
        this.p = jZ;
        this.q = jZ2;
        this.r = jZ3;
        this.s = arrayList;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = 1;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.D = bool2;
        this.E = num3;
        this.F = num4;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.N = null;
        this.Q = -1;
        this.R = -1;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Object obj2 = -1;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.cc2)) {
            return false;
        }
        ads_mobile_sdk.cc2 cc2Var = (ads_mobile_sdk.cc2) obj;
        return this.a == cc2Var.a && dev.epro.r0.S10823041268949770285.t(this.b, cc2Var.b) && this.c == cc2Var.c && this.d.equals(cc2Var.d) && this.e.equals(cc2Var.e) && this.f == cc2Var.f && this.g == cc2Var.g && this.h == cc2Var.h && this.i == cc2Var.i && this.j == cc2Var.j && this.k == cc2Var.k && this.l == cc2Var.l && this.m == cc2Var.m && dev.epro.r0.S10823041268949770285.t(this.n, cc2Var.n) && dev.epro.r0.S10823041268949770285.t(this.f18o, cc2Var.f18o) && dev.epro.r0.E17093345031926825464.d(this.p, cc2Var.p) && dev.epro.r0.E17093345031926825464.d(this.q, cc2Var.q) && dev.epro.r0.E17093345031926825464.d(this.r, cc2Var.r) && this.s.equals(cc2Var.s) && dev.epro.r0.S10823041268949770285.t(this.t, cc2Var.t) && dev.epro.r0.S10823041268949770285.t(this.u, cc2Var.u) && dev.epro.r0.S10823041268949770285.t(this.w, cc2Var.w) && this.x == cc2Var.x && dev.epro.r0.S10823041268949770285.t(this.y, cc2Var.y) && dev.epro.r0.S10823041268949770285.t(this.z, cc2Var.z) && dev.epro.r0.S10823041268949770285.t(this.A, cc2Var.A) && dev.epro.r0.S10823041268949770285.t(this.B, cc2Var.B) && dev.epro.r0.S10823041268949770285.t(this.D, cc2Var.D) && dev.epro.r0.S10823041268949770285.t(this.E, cc2Var.E) && dev.epro.r0.S10823041268949770285.t(this.F, cc2Var.F) && dev.epro.r0.S10823041268949770285.t(this.G, cc2Var.G) && dev.epro.r0.S10823041268949770285.t(this.H, cc2Var.H) && dev.epro.r0.S10823041268949770285.t(this.I, cc2Var.I) && dev.epro.r0.S10823041268949770285.t(this.J, cc2Var.J) && dev.epro.r0.S10823041268949770285.t(this.K, cc2Var.K) && dev.epro.r0.S10823041268949770285.t(this.L, cc2Var.L) && dev.epro.r0.S10823041268949770285.t(this.N, cc2Var.N) && obj2.equals(obj2) && this.Q == cc2Var.Q && this.R == cc2Var.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        int iJ = dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(dev.epro.r0.U1554499319261669842.h(this.g, dev.epro.r0.U1554499319261669842.h(this.f, (this.e.hashCode() + dev.epro.r0.G6547577305291411977.h((this.c.hashCode() + ((this.b.hashCode() + (java.lang.Integer.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d)) * 31)), this.h, 31), this.i, 31), this.j, 31);
        boolean z = this.k;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int i = (iJ + r3) * 31;
        int i2 = this.l;
        int iA = (i + (i2 == 0 ? 0 : dev.epro.r0.L11610354117192841236.A(i2))) * 31;
        boolean z2 = this.m;
        int i3 = (iA + (z2 ? 1 : z2)) * 31;
        java.lang.Throwable th = this.n;
        int iHashCode = (i3 + (th == null ? 0 : th.hashCode())) * 31;
        java.lang.Throwable th2 = this.f18o;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        long j = this.p;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        int iK = dev.epro.r0.G6547577305291411977.k(this.s, dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(iHashCode2, j, 31), this.q, 31), this.r, 31), 31);
        ads_mobile_sdk.u73 u73Var = this.t;
        int iHashCode3 = (iK + (u73Var == null ? 0 : u73Var.hashCode())) * 31;
        ads_mobile_sdk.j13 j13Var = this.u;
        int iHashCode4 = (iHashCode3 + (j13Var == null ? 0 : j13Var.hashCode())) * 961;
        ads_mobile_sdk.iq1 iq1Var = this.w;
        int iA2 = (dev.epro.r0.L11610354117192841236.A(this.x) + ((iHashCode4 + (iq1Var == null ? 0 : iq1Var.hashCode())) * 31)) * 31;
        ads_mobile_sdk.cl1 cl1Var = this.y;
        int iHashCode5 = (iA2 + (cl1Var == null ? 0 : cl1Var.hashCode())) * 31;
        java.lang.String str = this.z;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.A;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        ads_mobile_sdk.p53 p53Var = this.B;
        int iHashCode8 = (iHashCode7 + (p53Var == null ? 0 : p53Var.hashCode())) * 961;
        java.lang.Boolean bool = this.D;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Integer num2 = this.E;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.F;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ads_mobile_sdk.rp3 rp3Var = this.G;
        int iHashCode12 = (iHashCode11 + (rp3Var == null ? 0 : rp3Var.hashCode())) * 31;
        ads_mobile_sdk.ch2 ch2Var = this.H;
        int iHashCode13 = (iHashCode12 + (ch2Var == null ? 0 : ch2Var.hashCode())) * 31;
        ads_mobile_sdk.n01 n01Var = this.I;
        int iHashCode14 = (iHashCode13 + (n01Var == null ? 0 : n01Var.hashCode())) * 31;
        ads_mobile_sdk.wa1 wa1Var = this.J;
        int iHashCode15 = (iHashCode14 + (wa1Var == null ? 0 : wa1Var.hashCode())) * 31;
        ads_mobile_sdk.ta taVar = this.K;
        int iHashCode16 = (iHashCode15 + (taVar == null ? 0 : taVar.hashCode())) * 31;
        ads_mobile_sdk.vr vrVar = this.L;
        int iHashCode17 = (iHashCode16 + (vrVar == null ? 0 : vrVar.hashCode())) * 961;
        ads_mobile_sdk.rc2 rc2Var = this.N;
        int iHashCode18 = rc2Var != null ? rc2Var.hashCode() : 0;
        java.lang.Integer num4 = -1;
        return java.lang.Integer.hashCode(this.R) + dev.epro.r0.U1554499319261669842.h(this.Q, (num4.hashCode() + ((iHashCode17 + iHashCode18) * 31)) * 961);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        int i = this.a;
        int i2 = this.l;
        boolean z = this.m;
        java.lang.Throwable th = this.n;
        java.lang.Throwable th2 = this.f18o;
        java.lang.String strL = dev.epro.r0.E17093345031926825464.l(this.p);
        java.lang.String strL2 = dev.epro.r0.E17093345031926825464.l(this.q);
        java.lang.String strL3 = dev.epro.r0.E17093345031926825464.l(this.r);
        ads_mobile_sdk.u73 u73Var = this.t;
        ads_mobile_sdk.iq1 iq1Var = this.w;
        int i3 = this.x;
        ads_mobile_sdk.cl1 cl1Var = this.y;
        java.lang.String str3 = this.z;
        java.lang.Integer num2 = this.A;
        ads_mobile_sdk.rp3 rp3Var = this.G;
        ads_mobile_sdk.ch2 ch2Var = this.H;
        ads_mobile_sdk.n01 n01Var = this.I;
        ads_mobile_sdk.wa1 wa1Var = this.J;
        ads_mobile_sdk.ta taVar = this.K;
        ads_mobile_sdk.vr vrVar = this.L;
        ads_mobile_sdk.rc2 rc2Var = this.N;
        int i4 = this.Q;
        int i5 = this.R;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PerTraceMeta(id=");
        sb.append(i);
        sb.append(", traceMetaSet=");
        sb.append(this.b);
        sb.append(", cuiName=");
        sb.append(this.c);
        sb.append(", tags=");
        sb.append(this.d);
        sb.append(", rootTraceId=");
        sb.append(this.e);
        sb.append(", parentTraceId=");
        sb.append(this.f);
        sb.append(", traceDepth=");
        sb.append(this.g);
        sb.append(", startTimeMillis=");
        sb.append(this.h);
        sb.append(", timeSinceSdkInitStartMillis=");
        sb.append(this.i);
        sb.append(", timeSinceSdkInitCompleteMillis=");
        sb.append(this.j);
        sb.append(", useAsyncAndroidTrace=");
        sb.append(this.k);
        sb.append(", gmsgName=");
        java.lang.String str4 = "UNRECOGNIZED";
        switch (i2) {
            case 1:
                str = "GMSG_NAME_UNKNOWN";
                num = num2;
                str2 = str;
                break;
            case 2:
                str = "GMSG_NAME_SDK_CORE_LOADED";
                num = num2;
                str2 = str;
                break;
            case 3:
                str = "GMSG_NAME_RESULT";
                num = num2;
                str2 = str;
                break;
            case 4:
                str = "GMSG_NAME_OPEN";
                num = num2;
                str2 = str;
                break;
            case 5:
                str = "GMSG_NAME_CLICK";
                num = num2;
                str2 = str;
                break;
            case 6:
                str = "GMSG_NAME_HTTP_TRACK";
                num = num2;
                str2 = str;
                break;
            case 7:
                str = "GMSG_NAME_REFRESH";
                num = num2;
                str2 = str;
                break;
            case 8:
                str = "GMSG_DELAY_PAGE_LOADED";
                num = num2;
                str2 = str;
                break;
            case 9:
                str = "GMSG_DELAY_PAGE_CLOSED";
                num = num2;
                str2 = str;
                break;
            case 10:
                str = "GMSG_VIDEO_METADATA";
                num = num2;
                str2 = str;
                break;
            case 11:
                str = "GMSG_VIDEO";
                num = num2;
                str2 = str;
                break;
            case 12:
                str = "GMSG_UPDATE_CONSENT_ALLOWLIST";
                num = num2;
                str2 = str;
                break;
            case 13:
                str = "GMSG_APP_EVENT";
                num = num2;
                str2 = str;
                break;
            case 14:
                str = "GMSG_TOUCH_EVENT";
                num = num2;
                str2 = str;
                break;
            case 15:
                str = "GMSG_INTERSTITIAL_PROPERTIES";
                num = num2;
                str2 = str;
                break;
            case 16:
                str = "GMSG_CUSTOM_CLOSE";
                num = num2;
                str2 = str;
                break;
            case 17:
                str = "GMSG_CLOSE";
                num = num2;
                str2 = str;
                break;
            case 18:
                str = "GMSG_BACK_BUTTON";
                num = num2;
                str2 = str;
                break;
            case 19:
                str = "GMSG_REWARD";
                num = num2;
                str2 = str;
                break;
            case 20:
                str = "GMSG_AD_METADATA_CHANGED";
                num = num2;
                str2 = str;
                break;
            case 21:
                str = "GMSG_INSTRUMENT";
                num = num2;
                str2 = str;
                break;
            case 22:
                str = "GMSG_CAN_OPEN_URLS";
                num = num2;
                str2 = str;
                break;
            case 23:
                str = "GMSG_H5";
                num = num2;
                str2 = str;
                break;
            case 24:
                str = "GMSG_VIEW_LOCATION";
                num = num2;
                str2 = str;
                break;
            case 25:
                str = "GMSG_MRAID_LOADED";
                num = num2;
                str2 = str;
                break;
            case 26:
                str = "GMSG_MRAID";
                num = num2;
                str2 = str;
                break;
            case 27:
                str = "GMSG_RESET_PAID";
                num = num2;
                str2 = str;
                break;
            case 28:
                str = "GMSG_SET_PAIDV2_PERSONALIZATION_ENABLED";
                num = num2;
                str2 = str;
                break;
            case 29:
                str = "GMSG_LOG";
                num = num2;
                str2 = str;
                break;
            case 30:
                str = "GMSG_NATIVE_IMPRESSION";
                num = num2;
                str2 = str;
                break;
            case 31:
                str = "GMSG_TRACK_ACTIVE_VIEW_UNIT";
                num = num2;
                str2 = str;
                break;
            case 32:
                str = "GMSG_UNTRACK_ACTIVE_VIEW_UNIT";
                num = num2;
                str2 = str;
                break;
            case 33:
                str = "GMSG_CAN_OPEN_INTENTS";
                num = num2;
                str2 = str;
                break;
            case 34:
                str = "GMSG_CAN_OPEN_APP";
                num = num2;
                str2 = str;
                break;
            case 35:
                str = "GMSG_CUSTOM_CLICK";
                num = num2;
                str2 = str;
                break;
            case 36:
                str = "GMSG_NATIVE_CLICK_RECORDED";
                num = num2;
                str2 = str;
                break;
            case 37:
                str = "GMSG_NATIVE_AD_VIEW_SIGNALS";
                num = num2;
                str2 = str;
                break;
            case 38:
                str = "GMSG_NATIVE_CLICK_META";
                num = num2;
                str2 = str;
                break;
            case 39:
                str = "GMSG_NATIVE_VIDEO_CLICKED";
                num = num2;
                str2 = str;
                break;
            case 40:
                str = "GMSG_INSPECTOR_SET_APPLICATION_STATE";
                num = num2;
                str2 = str;
                break;
            case 41:
                str = "GMSG_INSPECTOR_SINGLE_AD_SOURCE_TEST";
                num = num2;
                str2 = str;
                break;
            case 42:
                str = "GMSG_INSPECTOR_UI_STORAGE";
                num = num2;
                str2 = str;
                break;
            case 43:
                str = "GMSG_SHARE_SHEET";
                num = num2;
                str2 = str;
                break;
            case 44:
                str = "GMSG_OUT_OF_CONTEXT_TESTING";
                num = num2;
                str2 = str;
                break;
            case 45:
                str = "GMSG_HIDE_OVERLAY";
                num = num2;
                str2 = str;
                break;
            case 46:
                str = "GMSG_SHOW_OVERLAY";
                num = num2;
                str2 = str;
                break;
            case 47:
                str = "GMSG_LOAD_OVERLAY_HTML";
                num = num2;
                str2 = str;
                break;
            case 48:
                str = "GMSG_SEND_MESSAGE_TO_NATIVE_JS";
                num = num2;
                str2 = str;
                break;
            case 49:
                str = "GMSG_LOG_SCION_EVENT";
                num = num2;
                str2 = str;
                break;
            case 50:
                str = "GMSG_HIDE_VALIDATOR_OVERLAY";
                num = num2;
                str2 = str;
                break;
            case 51:
                str = "GMSG_LOAD_NATIVE_AD_POLICY_VIOLATIONS";
                num = num2;
                str2 = str;
                break;
            case 52:
                str = "GMSG_SHOW_VALIDATOR_OVERLAY";
                num = num2;
                str2 = str;
                break;
            case 53:
                str = "GMSG_IN_MEMORY_SDK_CORE_DATA";
                num = num2;
                str2 = str;
                break;
            case 54:
                str = "GMSG_PERSISTENT_SDK_CORE_DATA";
                num = num2;
                str2 = str;
                break;
            case 55:
                str = "GMSG_FLUID_HEIGHT";
                num = num2;
                str2 = str;
                break;
            case 56:
                str = "GMSG_NATIVE_IMPRESSION_FLOW_CONTROL";
                num = num2;
                str2 = str;
                break;
            case 57:
                num = num2;
                str2 = "UNRECOGNIZED";
                break;
            default:
                num = num2;
                str2 = "null";
                break;
        }
        sb.append(str2);
        sb.append(", isSuccess=");
        sb.append(z);
        sb.append(", exception=");
        sb.append(th);
        sb.append(", causingException=");
        sb.append(th2);
        dev.epro.r0.G6547577305291411977.B(sb, ", latency=", strL, ", cpuTime=", strL2);
        sb.append(", childCpuTime=");
        sb.append(strL3);
        sb.append(", errorMessages=");
        sb.append(this.s);
        sb.append(", signalMeta=");
        sb.append(u73Var);
        sb.append(", scarCacheEvictionData=");
        sb.append(this.u);
        sb.append(", h5Data=null, mraidData=");
        sb.append(iq1Var);
        sb.append(", processState=");
        if (i3 == 1) {
            str4 = "PROCESS_STATE_UNKNOWN";
        } else if (i3 == 2) {
            str4 = "PROCESS_STATE_FOREGROUND";
        } else if (i3 == 3) {
            str4 = "PROCESS_STATE_BACKGROUND";
        } else if (i3 != 4) {
            str4 = "null";
        }
        sb.append(str4);
        sb.append(", jsEngineData=");
        sb.append(cl1Var);
        sb.append(", cronetProvider=");
        sb.append(str3);
        sb.append(", customTabsNavigationEvent=");
        sb.append(num);
        sb.append(", signalCacheData=");
        sb.append(this.B);
        sb.append(", preloadData=null, hasNetworkConnectivity=");
        sb.append(this.D);
        sb.append(", networkType=");
        sb.append(this.E);
        sb.append(", networkTypeCoarse=");
        sb.append(this.F);
        sb.append(", webViewData=");
        sb.append(rp3Var);
        sb.append(", postClickLifecycleMonitoringData=");
        sb.append(ch2Var);
        sb.append(", hsdpServiceData=");
        sb.append(n01Var);
        sb.append(", installReferrerDetails=");
        sb.append(wa1Var);
        sb.append(", adapterInitializationData=");
        sb.append(taVar);
        sb.append(", centralizedManagerPreloadData=");
        sb.append(vrVar);
        sb.append(", swipeableInterstitialSettleData=null, persistentCacheEventData=");
        sb.append(rc2Var);
        sb.append(", liveWebViewCount=");
        sb.append((java.lang.Object) (-1));
        sb.append(", contentProviderType=");
        sb.append("null");
        sb.append(", previousAppExitReason=");
        sb.append(i4);
        sb.append(", previousAppExitSignal=");
        sb.append(i5);
        sb.append(")");
        return sb.toString();
    }
}
