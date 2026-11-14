package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class cc2 {
    public Integer A;
    public final p53 B;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public rp3 G;
    public ch2 H;
    public n01 I;
    public wa1 J;
    public ta K;
    public vr L;
    public rc2 N;
    public int Q;
    public int R;
    public int a;
    public final mi3 b;
    public final wv0 c;
    public final List d;
    public final UUID e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public int l;
    public boolean m;
    public Throwable n;

    /* renamed from: o, reason: collision with root package name */
    public Throwable f18o;
    public long p;
    public long q;
    public long r;
    public final ArrayList s;
    public u73 t;
    public final j13 u;
    public iq1 w;
    public int x;
    public cl1 y;
    public String z;

    public cc2(int i, mi3 mi3Var, wv0 wv0Var, List list, UUID uuid, int i2, int i3, long j, long j2, long j3, boolean z, Boolean bool, Integer num, Integer num2, int i4) {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.SECONDS;
        long Z = M9216324016624295870.Z(0, n13798149404328803870);
        long Z2 = M9216324016624295870.Z(0, n13798149404328803870);
        long Z3 = M9216324016624295870.Z(0, n13798149404328803870);
        ArrayList arrayList = new ArrayList();
        Boolean bool2 = (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool;
        Integer num3 = (i4 & 1073741824) != 0 ? null : num;
        Integer num4 = (i4 & Integer.MIN_VALUE) != 0 ? null : num2;
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
        this.p = Z;
        this.q = Z2;
        this.r = Z3;
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

    public final boolean equals(Object obj) {
        Object obj2 = -1;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc2)) {
            return false;
        }
        cc2 cc2Var = (cc2) obj;
        return this.a == cc2Var.a && S10823041268949770285.t(this.b, cc2Var.b) && this.c == cc2Var.c && this.d.equals(cc2Var.d) && this.e.equals(cc2Var.e) && this.f == cc2Var.f && this.g == cc2Var.g && this.h == cc2Var.h && this.i == cc2Var.i && this.j == cc2Var.j && this.k == cc2Var.k && this.l == cc2Var.l && this.m == cc2Var.m && S10823041268949770285.t(this.n, cc2Var.n) && S10823041268949770285.t(this.f18o, cc2Var.f18o) && E17093345031926825464.d(this.p, cc2Var.p) && E17093345031926825464.d(this.q, cc2Var.q) && E17093345031926825464.d(this.r, cc2Var.r) && this.s.equals(cc2Var.s) && S10823041268949770285.t(this.t, cc2Var.t) && S10823041268949770285.t(this.u, cc2Var.u) && S10823041268949770285.t(this.w, cc2Var.w) && this.x == cc2Var.x && S10823041268949770285.t(this.y, cc2Var.y) && S10823041268949770285.t(this.z, cc2Var.z) && S10823041268949770285.t(this.A, cc2Var.A) && S10823041268949770285.t(this.B, cc2Var.B) && S10823041268949770285.t(this.D, cc2Var.D) && S10823041268949770285.t(this.E, cc2Var.E) && S10823041268949770285.t(this.F, cc2Var.F) && S10823041268949770285.t(this.G, cc2Var.G) && S10823041268949770285.t(this.H, cc2Var.H) && S10823041268949770285.t(this.I, cc2Var.I) && S10823041268949770285.t(this.J, cc2Var.J) && S10823041268949770285.t(this.K, cc2Var.K) && S10823041268949770285.t(this.L, cc2Var.L) && S10823041268949770285.t(this.N, cc2Var.N) && obj2.equals(obj2) && this.Q == cc2Var.Q && this.R == cc2Var.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int j = G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(U1554499319261669842.h(this.g, U1554499319261669842.h(this.f, (this.e.hashCode() + G6547577305291411977.h((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d)) * 31)), this.h, 31), this.i, 31), this.j, 31);
        boolean z = this.k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (j + i) * 31;
        int i3 = this.l;
        int A = (i2 + (i3 == 0 ? 0 : L11610354117192841236.A(i3))) * 31;
        boolean z2 = this.m;
        int i4 = (A + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Throwable th = this.n;
        int hashCode = (i4 + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.f18o;
        int hashCode2 = (hashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        long j2 = this.p;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        int k = G6547577305291411977.k(this.s, G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(hashCode2, j2, 31), this.q, 31), this.r, 31), 31);
        u73 u73Var = this.t;
        int hashCode3 = (k + (u73Var == null ? 0 : u73Var.hashCode())) * 31;
        j13 j13Var = this.u;
        int hashCode4 = (hashCode3 + (j13Var == null ? 0 : j13Var.hashCode())) * 961;
        iq1 iq1Var = this.w;
        int A2 = (L11610354117192841236.A(this.x) + ((hashCode4 + (iq1Var == null ? 0 : iq1Var.hashCode())) * 31)) * 31;
        cl1 cl1Var = this.y;
        int hashCode5 = (A2 + (cl1Var == null ? 0 : cl1Var.hashCode())) * 31;
        String str = this.z;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        p53 p53Var = this.B;
        int hashCode8 = (hashCode7 + (p53Var == null ? 0 : p53Var.hashCode())) * 961;
        Boolean bool = this.D;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.E;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.F;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        rp3 rp3Var = this.G;
        int hashCode12 = (hashCode11 + (rp3Var == null ? 0 : rp3Var.hashCode())) * 31;
        ch2 ch2Var = this.H;
        int hashCode13 = (hashCode12 + (ch2Var == null ? 0 : ch2Var.hashCode())) * 31;
        n01 n01Var = this.I;
        int hashCode14 = (hashCode13 + (n01Var == null ? 0 : n01Var.hashCode())) * 31;
        wa1 wa1Var = this.J;
        int hashCode15 = (hashCode14 + (wa1Var == null ? 0 : wa1Var.hashCode())) * 31;
        ta taVar = this.K;
        int hashCode16 = (hashCode15 + (taVar == null ? 0 : taVar.hashCode())) * 31;
        vr vrVar = this.L;
        int hashCode17 = (hashCode16 + (vrVar == null ? 0 : vrVar.hashCode())) * 961;
        rc2 rc2Var = this.N;
        int hashCode18 = rc2Var != null ? rc2Var.hashCode() : 0;
        Integer num4 = -1;
        return Integer.hashCode(this.R) + U1554499319261669842.h(this.Q, (num4.hashCode() + ((hashCode17 + hashCode18) * 31)) * 961);
    }

    public final String toString() {
        String str;
        Integer num;
        String str2;
        int i = this.a;
        int i2 = this.l;
        boolean z = this.m;
        Throwable th = this.n;
        Throwable th2 = this.f18o;
        String l = E17093345031926825464.l(this.p);
        String l2 = E17093345031926825464.l(this.q);
        String l3 = E17093345031926825464.l(this.r);
        u73 u73Var = this.t;
        iq1 iq1Var = this.w;
        int i3 = this.x;
        cl1 cl1Var = this.y;
        String str3 = this.z;
        Integer num2 = this.A;
        rp3 rp3Var = this.G;
        ch2 ch2Var = this.H;
        n01 n01Var = this.I;
        wa1 wa1Var = this.J;
        ta taVar = this.K;
        vr vrVar = this.L;
        rc2 rc2Var = this.N;
        int i4 = this.Q;
        int i5 = this.R;
        StringBuilder sb = new StringBuilder("PerTraceMeta(id=");
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
        String str4 = "UNRECOGNIZED";
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
        G6547577305291411977.B(sb, ", latency=", l, ", cpuTime=", l2);
        sb.append(", childCpuTime=");
        sb.append(l3);
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
        sb.append((Object) (-1));
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
