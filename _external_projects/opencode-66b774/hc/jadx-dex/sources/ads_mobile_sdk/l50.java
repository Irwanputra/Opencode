package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class l50 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.l50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private boolean appVerificationEnabled_;
    private int bitField0_;
    private long googlePlayServicesVersion_;
    private boolean isAsyncCheck_;
    private boolean isInstantApps_;
    private int urlApiType_;
    private java.lang.String clientVersion_ = "";
    private java.lang.String clientName_ = "";
    private java.lang.String updateApiListVersion_ = "";

    static {
        ads_mobile_sdk.l50 l50Var = new ads_mobile_sdk.l50();
        DEFAULT_INSTANCE = l50Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.l50.class, l50Var);
    }

    public static dev.epro.r0.U8120970098937721350 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new java.lang.Object[]{"bitField0_", "clientVersion_", "googlePlayServicesVersion_", "isInstantApps_", "urlApiType_", ads_mobile_sdk.ad.a$22, "clientName_", "updateApiListVersion_", "isAsyncCheck_", "appVerificationEnabled_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.l50();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.U8120970098937721350(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.clientVersion_ = str;
    }
}
