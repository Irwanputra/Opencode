package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mt extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.mt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int densityDpi_;
    private int heightPixels_;
    private dev.epro.r0.O6641393078261985068 supportedAbi_ = ads_mobile_sdk.in2.e;
    private int widthPixels_;

    static {
        ads_mobile_sdk.mt mtVar = new ads_mobile_sdk.mt();
        DEFAULT_INSTANCE = mtVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.mt.class, mtVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new java.lang.Object[]{"bitField0_", "densityDpi_", "widthPixels_", "heightPixels_", "supportedAbi_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.mt();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
