package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k43 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.k43 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private boolean isInstallReferrerReported_;
    private int totalInflightAdLimit_;

    static {
        ads_mobile_sdk.k43 k43Var = new ads_mobile_sdk.k43();
        DEFAULT_INSTANCE = k43Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.k43.class, k43Var);
    }

    public static ads_mobile_sdk.k43 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new java.lang.Object[]{"bitField0_", "isInstallReferrerReported_", "totalInflightAdLimit_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.k43();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.J8109720887967463919(DEFAULT_INSTANCE);
    }

    public final boolean p() {
        return this.isInstallReferrerReported_;
    }

    public final int q() {
        return this.totalInflightAdLimit_;
    }

    public static ads_mobile_sdk.k43 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.k43) cu0VarA;
    }
}
