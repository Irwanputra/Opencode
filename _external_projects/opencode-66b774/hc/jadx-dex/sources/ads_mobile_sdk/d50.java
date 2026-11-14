package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d50 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.d50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private ads_mobile_sdk.sq imageDigest_;
    private ads_mobile_sdk.sq image_;
    private java.lang.String mimeType_ = "";
    private int type_;

    static {
        ads_mobile_sdk.d50 d50Var = new ads_mobile_sdk.d50();
        DEFAULT_INSTANCE = d50Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.d50.class, d50Var);
    }

    public d50() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.image_ = l8361547894089146393;
        this.imageDigest_ = l8361547894089146393;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"bitField0_", "type_", ads_mobile_sdk.ad.a$3, "mimeType_", "image_", "imageDigest_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.d50();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
