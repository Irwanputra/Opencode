package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zp extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.zp DEFAULT_INSTANCE;
    public static final int c = 4;
    public static final int d = 5;
    private int bitField0_;
    private java.lang.String errorDescription_ = "";
    private int errorType_;

    static {
        ads_mobile_sdk.zp zpVar = new ads_mobile_sdk.zp();
        DEFAULT_INSTANCE = zpVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.zp.class, zpVar);
    }

    public static dev.epro.r0.L16262725475410787495 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0000\u0005ဈ\u0001", new java.lang.Object[]{"bitField0_", "errorType_", ads_mobile_sdk.ad.a$28, "errorDescription_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.zp();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L16262725475410787495(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 2;
        this.errorDescription_ = str;
    }
}
