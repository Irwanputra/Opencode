package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iw0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.iw0 DEFAULT_INSTANCE;
    public static final int c = 6;
    private int bitField0_;
    private ads_mobile_sdk.ew0 gmaSdkMonitoringMessage_;

    static {
        ads_mobile_sdk.iw0 iw0Var = new ads_mobile_sdk.iw0();
        DEFAULT_INSTANCE = iw0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.iw0.class, iw0Var);
    }

    public static dev.epro.r0.G13712527649795967703 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new java.lang.Object[]{"bitField0_", "gmaSdkMonitoringMessage_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.iw0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.G13712527649795967703(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.ew0 ew0Var) {
        this.gmaSdkMonitoringMessage_ = ew0Var;
        this.bitField0_ |= 1;
    }
}
