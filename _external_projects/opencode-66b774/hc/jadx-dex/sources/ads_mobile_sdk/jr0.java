package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jr0 extends ads_mobile_sdk.yu {
    public static final long A;
    public static final int B;
    public static final dev.epro.r0.I16631908410500040363 C;
    public static final dev.epro.r0.I16631908410500040363 D;
    public static final dev.epro.r0.I16631908410500040363 E;
    public static final dev.epro.r0.I16631908410500040363 F;
    public static final dev.epro.r0.I16631908410500040363 G;
    public static final dev.epro.r0.I16631908410500040363 H;
    public static final dev.epro.r0.I16631908410500040363 I;
    public static final long z;
    public final dev.epro.r0.S12091007627917879797 r;
    public final dev.epro.r0.F6899175859206092457 s;
    public final dev.epro.r0.I17037572019989243719 t;
    public final dev.epro.r0.Q4869062626651831947 u;
    public final dev.epro.r0.B7506245556754967052 v;
    public boolean w;
    public double x;
    public int y;

    static {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.e;
        z = dev.epro.r0.M9216324016624295870.Z(20, n13798149404328803870);
        A = dev.epro.r0.M9216324016624295870.Z(1, n13798149404328803870);
        B = ads_mobile_sdk.ph0.TIER_LOW.getNumber();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        ads_mobile_sdk.cw0 cw0Var = ads_mobile_sdk.cw0.AD_ID_INFO;
        i16631908410500040363.s(java.lang.String.valueOf(cw0Var.getNumber()), 500);
        ads_mobile_sdk.u93 u93Var = ads_mobile_sdk.u93.b;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_REQUEST, u93Var);
        ads_mobile_sdk.u93 u93Var2 = ads_mobile_sdk.u93.e;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_SPAM, u93Var2);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_SIZE, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_TYPE, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.APP_OPEN, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.APP_PERMISSIONS, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.APP_SET_ID, u93Var);
        ads_mobile_sdk.u93 u93Var3 = ads_mobile_sdk.u93.d;
        ads_mobile_sdk.cw0 cw0Var2 = ads_mobile_sdk.cw0.AUDIO;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, cw0Var2, u93Var3);
        ads_mobile_sdk.cw0 cw0Var3 = ads_mobile_sdk.cw0.BATTERY;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, cw0Var3, u93Var);
        ads_mobile_sdk.u93 u93Var4 = ads_mobile_sdk.u93.c;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.CLD, u93Var4);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.DEBUG_SIGNAL, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.EXPERIMENT_IDS, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.IN_MEMORY_SDK_CORE_DATA, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.MEMORY, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.OMID, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.PACKAGE_INFO, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.PER_APP_ID_V1, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.PER_APP_ID_V2, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.STATIC_DEVICE, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.TELEPHONY, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.CONSENT_STRINGS, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_ID_PERMISSION, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.QUALITY, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.REQUEST_ID, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.SDK_ENV, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.ADAPTER_VERSIONS, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.RTB_SIGNAL, u93Var2);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.SESSION_ID, u93Var);
        ads_mobile_sdk.cw0 cw0Var4 = ads_mobile_sdk.cw0.TRUSTLESS_TOKEN;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, cw0Var4, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.FIREBASE_ANALYTICS, u93Var4);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.INSPECTOR_SIGNAL, u93Var4);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AMAZON_FIRE_AD_ID, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.DISPLAY_COUNT, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.CSRB_ECO_DATA, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.PARENT_AD_CONFIG, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.NATIVE_AD, u93Var4);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.ICON_AD, u93Var);
        ads_mobile_sdk.cw0 cw0Var5 = ads_mobile_sdk.cw0.UNDEFINED;
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, cw0Var5, u93Var4);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.AD_RESPONSE_ENCRYPTION_KEY, u93Var3);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.SCAR_SIGNAL_TYPE, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.DEVICE_TIER, u93Var);
        dev.epro.r0.V4416135141588678913.e(i16631908410500040363, ads_mobile_sdk.cw0.PICTURE_IN_PICTURE_AD_REQUEST, u93Var);
        C = i16631908410500040363;
        dev.epro.r0.I16631908410500040363 i166319084105000403632 = new dev.epro.r0.I16631908410500040363();
        java.lang.String strValueOf = java.lang.String.valueOf(cw0Var.getNumber());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        i166319084105000403632.r(strValueOf, bool);
        java.lang.String strValueOf2 = java.lang.String.valueOf(cw0Var2.getNumber());
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        i166319084105000403632.r(strValueOf2, bool2);
        i166319084105000403632.r(java.lang.String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403632.r(java.lang.String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403632.r(java.lang.String.valueOf(cw0Var5.getNumber()), bool2);
        D = i166319084105000403632;
        dev.epro.r0.I16631908410500040363 i166319084105000403633 = new dev.epro.r0.I16631908410500040363();
        i166319084105000403633.r(java.lang.String.valueOf(cw0Var.getNumber()), bool);
        i166319084105000403633.r(java.lang.String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403633.r(java.lang.String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403633.r(java.lang.String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403633.r(java.lang.String.valueOf(cw0Var5.getNumber()), bool2);
        E = i166319084105000403633;
        dev.epro.r0.I16631908410500040363 i166319084105000403634 = new dev.epro.r0.I16631908410500040363();
        i166319084105000403634.s(java.lang.String.valueOf(cw0Var.getNumber()), 0);
        i166319084105000403634.s(java.lang.String.valueOf(cw0Var2.getNumber()), 0);
        i166319084105000403634.s(java.lang.String.valueOf(cw0Var3.getNumber()), 0);
        i166319084105000403634.s(java.lang.String.valueOf(cw0Var4.getNumber()), java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(30, n13798149404328803870))));
        i166319084105000403634.s(java.lang.String.valueOf(cw0Var5.getNumber()), 0);
        F = i166319084105000403634;
        dev.epro.r0.I16631908410500040363 i166319084105000403635 = new dev.epro.r0.I16631908410500040363();
        dev.epro.r0.N13798149404328803870 n137981494043288038702 = dev.epro.r0.N13798149404328803870.f;
        i166319084105000403635.s(java.lang.String.valueOf(cw0Var.getNumber()), java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(10, n137981494043288038702))));
        i166319084105000403635.s(java.lang.String.valueOf(cw0Var2.getNumber()), java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(30, n13798149404328803870))));
        i166319084105000403635.s(java.lang.String.valueOf(cw0Var3.getNumber()), java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(5, n137981494043288038702))));
        i166319084105000403635.s(java.lang.String.valueOf(cw0Var4.getNumber()), java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(300, n13798149404328803870))));
        i166319084105000403635.s(java.lang.String.valueOf(cw0Var5.getNumber()), 0);
        G = i166319084105000403635;
        dev.epro.r0.I16631908410500040363 i166319084105000403636 = new dev.epro.r0.I16631908410500040363();
        i166319084105000403636.r(java.lang.String.valueOf(cw0Var.getNumber()), bool);
        i166319084105000403636.r(java.lang.String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403636.r(java.lang.String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403636.r(java.lang.String.valueOf(cw0Var4.getNumber()), bool);
        i166319084105000403636.r(java.lang.String.valueOf(cw0Var5.getNumber()), bool2);
        H = i166319084105000403636;
        dev.epro.r0.I16631908410500040363 i166319084105000403637 = new dev.epro.r0.I16631908410500040363();
        i166319084105000403637.r(java.lang.String.valueOf(cw0Var.getNumber()), bool2);
        i166319084105000403637.r(java.lang.String.valueOf(cw0Var2.getNumber()), bool2);
        i166319084105000403637.r(java.lang.String.valueOf(cw0Var3.getNumber()), bool2);
        i166319084105000403637.r(java.lang.String.valueOf(cw0Var4.getNumber()), bool2);
        i166319084105000403637.r(java.lang.String.valueOf(cw0Var5.getNumber()), bool2);
        I = i166319084105000403637;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(dev.epro.r0.S12091007627917879797 s12091007627917879797, dev.epro.r0.F6899175859206092457 f6899175859206092457, dev.epro.r0.I17037572019989243719 i17037572019989243719, dev.epro.r0.Q4869062626651831947 q4869062626651831947, dev.epro.r0.B7506245556754967052 b7506245556754967052, dev.epro.r0.P10813970601447104553 p10813970601447104553) {
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:41:0x00b2, B:43:0x00b6, B:46:0x00bd, B:47:0x00c6, B:48:0x00c9), top: B:75:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:41:0x00b2, B:43:0x00b6, B:46:0x00bd, B:47:0x00c6, B:48:0x00c9), top: B:75:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:58:0x00ea, B:60:0x00ee, B:63:0x00f5, B:64:0x00fe, B:65:0x0101), top: B:74:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:58:0x00ea, B:60:0x00ee, B:63:0x00f5, B:64:0x00fe, B:65:0x0101), top: B:74:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.jr0 r7, dev.epro.r0.G8001132634698687269 r8, dev.epro.r0.W5797197595347441198 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jr0.a(ads_mobile_sdk.jr0, dev.epro.r0.G8001132634698687269, dev.epro.r0.W5797197595347441198, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final long A0() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return ((dev.epro.r0.E17093345031926825464) a("gad:signal_collection_timeout_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(60, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a;
    }

    public final long D() {
        return ((dev.epro.r0.E17093345031926825464) a("gads:http_url_connection_factory:timeout_millis", new dev.epro.r0.E17093345031926825464(z), ads_mobile_sdk.ao.a)).a;
    }

    public final boolean E0() {
        return ((java.lang.Boolean) a("gads:url_encode_scar_ad_response_payload", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue();
    }

    public final boolean H0() {
        return ((java.lang.Boolean) a("gads:viewability_activity_lifecycle:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue();
    }

    public final boolean O() {
        return ((java.lang.Boolean) a("gads:enable_stop_api:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue();
    }

    public final java.lang.String Q() {
        return (java.lang.String) a("gads:firebase_analytics_class_name", "com.google.android.gms.measurement.api.AppMeasurementSdk", ads_mobile_sdk.ao.a$6);
    }

    public final java.lang.String R() {
        return (java.lang.String) a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", ads_mobile_sdk.ao.a$6);
    }

    public final long Y() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return ((dev.epro.r0.E17093345031926825464) a("gads:immersive_video_media_data_timeout_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(5, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a;
    }

    public final boolean a0() {
        return ((java.lang.Boolean) a("gads:inspector:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue();
    }

    public final java.util.Map l0() {
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_SIGNAL.getNumber()), java.lang.Double.valueOf(0.003d));
        dev.epro.r0.H9390398899829886498 h93903988998298864982 = new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_SIGNAL_UPDATE_SIGNALS.getNumber()), java.lang.Double.valueOf(3.0E-4d));
        java.lang.String strValueOf = java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_ADREQUEST.getNumber());
        java.lang.Double dValueOf = java.lang.Double.valueOf(0.1d);
        dev.epro.r0.H9390398899829886498 h93903988998298864983 = new dev.epro.r0.H9390398899829886498(strValueOf, dValueOf);
        dev.epro.r0.H9390398899829886498 h93903988998298864984 = new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_SDKCORE.getNumber()), dValueOf);
        dev.epro.r0.H9390398899829886498 h93903988998298864985 = new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_WEBVIEW_INITIALIZATION.getNumber()), dValueOf);
        dev.epro.r0.H9390398899829886498 h93903988998298864986 = new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_WEBVIEW_LOAD.getNumber()), dValueOf);
        java.lang.String strValueOf2 = java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_INSTALL_REFERRER_DETAILS.getNumber());
        java.lang.Double dValueOf2 = java.lang.Double.valueOf(1.0d);
        return (java.util.Map) a("gads:per_trace_sample_rate", dev.epro.r0.E4951175994894594588.v0(h9390398899829886498, h93903988998298864982, h93903988998298864983, h93903988998298864984, h93903988998298864985, h93903988998298864986, new dev.epro.r0.H9390398899829886498(strValueOf2, dValueOf2), new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_INSTALL_REFERRER_TASK.getNumber()), dValueOf2), new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING.getNumber()), dValueOf2), new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_HSDP_SERVICE.getNumber()), dValueOf2), new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_AD_INSPECTOR_DISABLED.getNumber()), dValueOf2), new dev.epro.r0.H9390398899829886498(java.lang.String.valueOf(ads_mobile_sdk.wv0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE.getNumber()), dValueOf2)), ads_mobile_sdk.ao.a$15);
    }

    public final long p() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return ((dev.epro.r0.E17093345031926825464) a("gads:adapter_initialization:timeout", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(30, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a$2)).a;
    }
}
