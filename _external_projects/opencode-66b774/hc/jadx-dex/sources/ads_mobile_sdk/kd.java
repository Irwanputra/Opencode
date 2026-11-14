package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kd extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.kd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long mediaVolume_ = -1;
    private int isDndMode_ = 1000;

    static {
        ads_mobile_sdk.kd kdVar = new ads_mobile_sdk.kd();
        DEFAULT_INSTANCE = kdVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.kd.class, kdVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new java.lang.Object[]{"bitField0_", "mediaVolume_", "isDndMode_", ads_mobile_sdk.ad.a$2});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.kd();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
