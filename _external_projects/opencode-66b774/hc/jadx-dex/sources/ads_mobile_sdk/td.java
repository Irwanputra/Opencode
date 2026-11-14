package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class td extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.td DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private dev.epro.r0.U12378827310912896889 labels_;
    private dev.epro.r0.U12378827310912896889 reasons_;
    private int labelsMemoizedSerializedSize = -1;
    private int reasonsMemoizedSerializedSize = -1;

    static {
        ads_mobile_sdk.td tdVar = new ads_mobile_sdk.td();
        DEFAULT_INSTANCE = tdVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.td.class, tdVar);
    }

    public td() {
        ads_mobile_sdk.wm1 wm1Var = ads_mobile_sdk.wm1.e;
        this.labels_ = wm1Var;
        this.reasons_ = wm1Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new java.lang.Object[]{"labels_", "reasons_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.td();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
