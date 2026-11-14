package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lc extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.lc DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private int function_;

    static {
        ads_mobile_sdk.lc lcVar = new ads_mobile_sdk.lc();
        DEFAULT_INSTANCE = lcVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.lc.class, lcVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"bitField0_", "function_", ads_mobile_sdk.ad.a$29});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.lc();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
