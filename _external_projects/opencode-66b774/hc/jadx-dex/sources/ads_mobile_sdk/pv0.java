package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pv0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.pv0 DEFAULT_INSTANCE;
    public static final int c = 14;
    private int bitField0_;
    private ads_mobile_sdk.kv0 gmaSdkExceptionMessage_;

    static {
        ads_mobile_sdk.pv0 pv0Var = new ads_mobile_sdk.pv0();
        DEFAULT_INSTANCE = pv0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.pv0.class, pv0Var);
    }

    public static dev.epro.r0.T14972362143719499691 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\u0000", new java.lang.Object[]{"bitField0_", "gmaSdkExceptionMessage_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.pv0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.T14972362143719499691(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.kv0 kv0Var) {
        java.util.Objects.requireNonNull(kv0Var);
        this.gmaSdkExceptionMessage_ = kv0Var;
        this.bitField0_ |= 1;
    }
}
