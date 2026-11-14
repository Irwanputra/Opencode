package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jv0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.jv0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 3;
    private int status_;
    private java.lang.String stacktrace_ = "";
    private java.lang.String topException_ = "";
    private java.lang.String conduitTraceKey_ = "";

    static {
        ads_mobile_sdk.jv0 jv0Var = new ads_mobile_sdk.jv0();
        DEFAULT_INSTANCE = jv0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.jv0.class, jv0Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"status_", "stacktrace_", "conduitTraceKey_", "topException_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.jv0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
