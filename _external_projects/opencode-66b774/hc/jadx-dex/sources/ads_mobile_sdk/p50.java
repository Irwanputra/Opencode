package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p50 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.p50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private dev.epro.r0.O6641393078261985068 importScriptUrls_;
    private dev.epro.r0.O6641393078261985068 requestedUrls_;
    private java.lang.String scopeUrl_ = "";
    private java.lang.String scriptUrl_;

    static {
        ads_mobile_sdk.p50 p50Var = new ads_mobile_sdk.p50();
        DEFAULT_INSTANCE = p50Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.p50.class, p50Var);
    }

    public p50() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.requestedUrls_ = in2Var;
        this.importScriptUrls_ = in2Var;
        this.scriptUrl_ = "";
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new java.lang.Object[]{"bitField0_", "scopeUrl_", "requestedUrls_", "importScriptUrls_", "scriptUrl_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.p50();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
