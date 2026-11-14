package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y7 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.y7 DEFAULT_INSTANCE;
    public static final int c = 18;
    private ads_mobile_sdk.s7 adshieldMonitoringMessage_;
    private int bitField0_;

    static {
        ads_mobile_sdk.y7 y7Var = new ads_mobile_sdk.y7();
        DEFAULT_INSTANCE = y7Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.y7.class, y7Var);
    }

    public static dev.epro.r0.Z10352821448393905481 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new java.lang.Object[]{"bitField0_", "adshieldMonitoringMessage_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.y7();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Z10352821448393905481(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.s7 s7Var) {
        this.adshieldMonitoringMessage_ = s7Var;
        this.bitField0_ |= 1;
    }
}
