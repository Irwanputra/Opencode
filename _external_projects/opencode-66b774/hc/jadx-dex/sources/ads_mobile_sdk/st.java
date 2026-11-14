package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class st extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.st DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private java.lang.String releaseVersion_ = "";
    private dev.epro.r0.O6641393078261985068 plugins_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.st stVar = new ads_mobile_sdk.st();
        DEFAULT_INSTANCE = stVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.st.class, stVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new java.lang.Object[]{"bitField0_", "releaseVersion_", "plugins_", ads_mobile_sdk.qt.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.st();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
