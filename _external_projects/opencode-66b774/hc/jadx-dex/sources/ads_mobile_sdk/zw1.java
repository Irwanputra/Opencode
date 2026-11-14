package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zw1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.zw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private boolean clickToExpandRequested_;
    private boolean customControlsRequested_;
    private boolean startMuted_;

    static {
        ads_mobile_sdk.zw1 zw1Var = new ads_mobile_sdk.zw1();
        DEFAULT_INSTANCE = zw1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.zw1.class, zw1Var);
    }

    public static dev.epro.r0.W13970299979116296787 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new java.lang.Object[]{"bitField0_", "startMuted_", "clickToExpandRequested_", "customControlsRequested_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.zw1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.W13970299979116296787(DEFAULT_INSTANCE);
    }
}
