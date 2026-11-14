package ads_mobile_sdk;

import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.F6899175859206092457;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I17037572019989243719;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.Q4869062626651831947;
import dev.epro.r0.S12091007627917879797;
import dev.epro.r0.V4416135141588678913;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jr0 extends yu {
    public static final long A;
    public static final int B;
    public static final I16631908410500040363 C;
    public static final I16631908410500040363 D;
    public static final I16631908410500040363 E;
    public static final I16631908410500040363 F;
    public static final I16631908410500040363 G;
    public static final I16631908410500040363 H;
    public static final I16631908410500040363 I;
    public static final long z;
    public final S12091007627917879797 r;
    public final F6899175859206092457 s;
    public final I17037572019989243719 t;
    public final Q4869062626651831947 u;
    public final B7506245556754967052 v;
    public boolean w;
    public double x;
    public int y;

    static {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.SECONDS;
        z = M9216324016624295870.Z(20, n13798149404328803870);
        A = M9216324016624295870.Z(1, n13798149404328803870);
        B = ph0.TIER_LOW.getNumber();
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        cw0 cw0Var = cw0.AD_ID_INFO;
        i16631908410500040363.s(String.valueOf(cw0Var.getNumber()), 500);
        u93 u93Var = u93.b;
        V4416135141588678913.e(i16631908410500040363, cw0.AD_REQUEST, u93Var);
        u93 u93Var2 = u93.e;
        V4416135141588678913.e(i16631908410500040363, cw0.AD_SPAM, u93Var2);
        V4416135141588678913.e(i16631908410500040363, cw0.AD_SIZE, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.AD_TYPE, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.APP_OPEN, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.APP_PERMISSIONS, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.APP_SET_ID, u93Var);
        u93 u93Var3 = u93.d;
        cw0 cw0Var2 = cw0.AUDIO;
        V4416135141588678913.e(i16631908410500040363, cw0Var2, u93Var3);
        cw0 cw0Var3 = cw0.BATTERY;
        V4416135141588678913.e(i16631908410500040363, cw0Var3, u93Var);
        u93 u93Var4 = u93.c;
        V4416135141588678913.e(i16631908410500040363, cw0.CLD, u93Var4);
        V4416135141588678913.e(i16631908410500040363, cw0.DEBUG_SIGNAL, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.EXPERIMENT_IDS, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.IN_MEMORY_SDK_CORE_DATA, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.MEMORY, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.OMID, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.PACKAGE_INFO, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.PER_APP_ID_V1, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.PER_APP_ID_V2, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.STATIC_DEVICE, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.TELEPHONY, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.CONSENT_STRINGS, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.AD_ID_PERMISSION, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.QUALITY, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.REQUEST_ID, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.SDK_ENV, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.ADAPTER_VERSIONS, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.RTB_SIGNAL, u93Var2);
        V4416135141588678913.e(i16631908410500040363, cw0.SESSION_ID, u93Var);
        cw0 cw0Var4 = cw0.TRUSTLESS_TOKEN;
        V4416135141588678913.e(i16631908410500040363, cw0Var4, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.FIREBASE_ANALYTICS, u93Var4);
        V4416135141588678913.e(i16631908410500040363, cw0.INSPECTOR_SIGNAL, u93Var4);
        V4416135141588678913.e(i16631908410500040363, cw0.AMAZON_FIRE_AD_ID, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.DISPLAY_COUNT, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.CSRB_ECO_DATA, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.PARENT_AD_CONFIG, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.NATIVE_AD, u93Var4);
        V4416135141588678913.e(i16631908410500040363, cw0.ICON_AD, u93Var);
        cw0 cw0Var5 = cw0.UNDEFINED;
        V4416135141588678913.e(i16631908410500040363, cw0Var5, u93Var4);
        V4416135141588678913.e(i16631908410500040363, cw0.AD_RESPONSE_ENCRYPTION_KEY, u93Var3);
        V4416135141588678913.e(i16631908410500040363, cw0.SCAR_SIGNAL_TYPE, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.DEVICE_TIER, u93Var);
        V4416135141588678913.e(i16631908410500040363, cw0.PICTURE_IN_PICTURE_AD_REQUEST, u93Var);
        C = i16631908410500040363;
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        String valueOf = String.valueOf(cw0Var.getNumber());
        Boolean bool = Boolean.TRUE;
        i166319084105000403632.r(valueOf, bool);
        String valueOf2 = String.valueOf(cw0Var2.getNumber());
        Boolean bool2 = Boolean.FALSE;
        i166319084105000403632.r(valueOf2, bool2);
        i166319084105000403632.r(String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403632.r(String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403632.r(String.valueOf(cw0Var5.getNumber()), bool2);
        D = i166319084105000403632;
        I16631908410500040363 i166319084105000403633 = new I16631908410500040363();
        i166319084105000403633.r(String.valueOf(cw0Var.getNumber()), bool);
        i166319084105000403633.r(String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403633.r(String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403633.r(String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403633.r(String.valueOf(cw0Var5.getNumber()), bool2);
        E = i166319084105000403633;
        I16631908410500040363 i166319084105000403634 = new I16631908410500040363();
        i166319084105000403634.s(String.valueOf(cw0Var.getNumber()), 0);
        i166319084105000403634.s(String.valueOf(cw0Var2.getNumber()), 0);
        i166319084105000403634.s(String.valueOf(cw0Var3.getNumber()), 0);
        i166319084105000403634.s(String.valueOf(cw0Var4.getNumber()), Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(30, n13798149404328803870))));
        i166319084105000403634.s(String.valueOf(cw0Var5.getNumber()), 0);
        F = i166319084105000403634;
        I16631908410500040363 i166319084105000403635 = new I16631908410500040363();
        N13798149404328803870 n137981494043288038702 = N13798149404328803870.MINUTES;
        i166319084105000403635.s(String.valueOf(cw0Var.getNumber()), Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(10, n137981494043288038702))));
        i166319084105000403635.s(String.valueOf(cw0Var2.getNumber()), Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(30, n13798149404328803870))));
        i166319084105000403635.s(String.valueOf(cw0Var3.getNumber()), Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(5, n137981494043288038702))));
        i166319084105000403635.s(String.valueOf(cw0Var4.getNumber()), Long.valueOf(E17093345031926825464.e(M9216324016624295870.Z(300, n13798149404328803870))));
        i166319084105000403635.s(String.valueOf(cw0Var5.getNumber()), 0);
        G = i166319084105000403635;
        I16631908410500040363 i166319084105000403636 = new I16631908410500040363();
        i166319084105000403636.r(String.valueOf(cw0Var.getNumber()), bool);
        i166319084105000403636.r(String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403636.r(String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403636.r(String.valueOf(cw0Var4.getNumber()), bool);
        i166319084105000403636.r(String.valueOf(cw0Var5.getNumber()), bool2);
        H = i166319084105000403636;
        I16631908410500040363 i166319084105000403637 = new I16631908410500040363();
        i166319084105000403637.r(String.valueOf(cw0Var.getNumber()), bool2);
        i166319084105000403637.r(String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403637.r(String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403637.r(String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403637.r(String.valueOf(cw0Var5.getNumber()), bool2);
        I = i166319084105000403637;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(S12091007627917879797 s12091007627917879797, F6899175859206092457 f6899175859206092457, I17037572019989243719 i17037572019989243719, Q4869062626651831947 q4869062626651831947, B7506245556754967052 b7506245556754967052, P10813970601447104553 p10813970601447104553) {
        super(p10813970601447104553);
        s12091007627917879797.getClass();
        f6899175859206092457.getClass();
        i17037572019989243719.getClass();
        q4869062626651831947.getClass();
        b7506245556754967052.getClass();
        p10813970601447104553.getClass();
        this.r = s12091007627917879797;
        this.s = f6899175859206092457;
        this.t = i17037572019989243719;
        this.u = q4869062626651831947;
        this.v = b7506245556754967052;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:68|69))(3:70|(1:72)|(1:74))|10|(2:12|(1:14))|15|16|(2:18|(8:20|21|(1:23)|24|(2:26|(1:28))|29|30|(2:32|(8:34|35|(1:37)(1:59)|38|(2:40|(1:42))|43|44|(5:46|(1:48)(1:55)|(1:50)(1:54)|51|52)(2:56|57))(7:60|(0)(0)|38|(0)|43|44|(0)(0)))(2:61|62))(7:64|(0)|24|(0)|29|30|(0)(0)))(2:65|66)))|75|6|(0)(0)|10|(0)|15|16|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:16:0x0076, B:18:0x007a, B:64:0x0081, B:65:0x008a, B:66:0x008d), top: B:15:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:30:0x00b2, B:32:0x00b6, B:60:0x00bd, B:61:0x00c6, B:62:0x00c9), top: B:29:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:44:0x00ea, B:46:0x00ee, B:55:0x00f5, B:56:0x00fe, B:57:0x0101), top: B:43:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:44:0x00ea, B:46:0x00ee, B:55:0x00f5, B:56:0x00fe, B:57:0x0101), top: B:43:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:30:0x00b2, B:32:0x00b6, B:60:0x00bd, B:61:0x00c6, B:62:0x00c9), top: B:29:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:16:0x0076, B:18:0x007a, B:64:0x0081, B:65:0x008a, B:66:0x008d), top: B:15:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.jr0 r7, dev.epro.r0.G8001132634698687269 r8, dev.epro.r0.W5797197595347441198 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jr0.a(ads_mobile_sdk.jr0, dev.epro.r0.G8001132634698687269, dev.epro.r0.W5797197595347441198, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final long A0() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return ((E17093345031926825464) a("gad:signal_collection_timeout_ms", new E17093345031926825464(M9216324016624295870.Z(60, N13798149404328803870.SECONDS)), ao.a)).a;
    }

    public final long D() {
        return ((E17093345031926825464) a("gads:http_url_connection_factory:timeout_millis", new E17093345031926825464(z), ao.a)).a;
    }

    public final boolean E0() {
        return ((Boolean) a("gads:url_encode_scar_ad_response_payload", Boolean.FALSE, ao.a$11)).booleanValue();
    }

    public final boolean H0() {
        return ((Boolean) a("gads:viewability_activity_lifecycle:enabled", Boolean.TRUE, ao.a$11)).booleanValue();
    }

    public final boolean O() {
        return ((Boolean) a("gads:enable_stop_api:enabled", Boolean.TRUE, ao.a$11)).booleanValue();
    }

    public final String Q() {
        return (String) a("gads:firebase_analytics_class_name", "com.google.android.gms.measurement.api.AppMeasurementSdk", ao.a$6);
    }

    public final String R() {
        return (String) a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", ao.a$6);
    }

    public final long Y() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return ((E17093345031926825464) a("gads:immersive_video_media_data_timeout_ms", new E17093345031926825464(M9216324016624295870.Z(5, N13798149404328803870.SECONDS)), ao.a)).a;
    }

    public final boolean a0() {
        return ((Boolean) a("gads:inspector:enabled", Boolean.TRUE, ao.a$11)).booleanValue();
    }

    public final Map l0() {
        H9390398899829886498 h9390398899829886498 = new H9390398899829886498(String.valueOf(wv0.CUI_NAME_SIGNAL.getNumber()), Double.valueOf(0.003d));
        H9390398899829886498 h93903988998298864982 = new H9390398899829886498(String.valueOf(wv0.CUI_NAME_SIGNAL_UPDATE_SIGNALS.getNumber()), Double.valueOf(3.0E-4d));
        String valueOf = String.valueOf(wv0.CUI_NAME_ADREQUEST.getNumber());
        Double valueOf2 = Double.valueOf(0.1d);
        H9390398899829886498 h93903988998298864983 = new H9390398899829886498(valueOf, valueOf2);
        H9390398899829886498 h93903988998298864984 = new H9390398899829886498(String.valueOf(wv0.CUI_NAME_SDKINIT_SDKCORE.getNumber()), valueOf2);
        H9390398899829886498 h93903988998298864985 = new H9390398899829886498(String.valueOf(wv0.CUI_NAME_WEBVIEW_INITIALIZATION.getNumber()), valueOf2);
        H9390398899829886498 h93903988998298864986 = new H9390398899829886498(String.valueOf(wv0.CUI_NAME_WEBVIEW_LOAD.getNumber()), valueOf2);
        String valueOf3 = String.valueOf(wv0.CUI_NAME_INSTALL_REFERRER_DETAILS.getNumber());
        Double valueOf4 = Double.valueOf(1.0d);
        return (Map) a("gads:per_trace_sample_rate", E4951175994894594588.v0(h9390398899829886498, h93903988998298864982, h93903988998298864983, h93903988998298864984, h93903988998298864985, h93903988998298864986, new H9390398899829886498(valueOf3, valueOf4), new H9390398899829886498(String.valueOf(wv0.CUI_NAME_INSTALL_REFERRER_TASK.getNumber()), valueOf4), new H9390398899829886498(String.valueOf(wv0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING.getNumber()), valueOf4), new H9390398899829886498(String.valueOf(wv0.CUI_NAME_HSDP_SERVICE.getNumber()), valueOf4), new H9390398899829886498(String.valueOf(wv0.CUI_NAME_AD_INSPECTOR_DISABLED.getNumber()), valueOf4), new H9390398899829886498(String.valueOf(wv0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE.getNumber()), valueOf4)), ao.a$15);
    }

    public final long p() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return ((E17093345031926825464) a("gads:adapter_initialization:timeout", new E17093345031926825464(M9216324016624295870.Z(30, N13798149404328803870.SECONDS)), ao.a$2)).a;
    }
}
