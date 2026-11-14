package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vc extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vc DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long source_ = -1;
    private int isPhysicalInput_ = 1000;
    private int verified_ = 1000;

    static {
        ads_mobile_sdk.vc vcVar = new ads_mobile_sdk.vc();
        DEFAULT_INSTANCE = vcVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vc.class, vcVar);
    }

    public static dev.epro.r0.F11088587460429668114 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            ads_mobile_sdk.ad adVar = ads_mobile_sdk.ad.a$2;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"bitField0_", "source_", "isPhysicalInput_", adVar, "verified_", adVar});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vc();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.F11088587460429668114(DEFAULT_INSTANCE);
    }
}
