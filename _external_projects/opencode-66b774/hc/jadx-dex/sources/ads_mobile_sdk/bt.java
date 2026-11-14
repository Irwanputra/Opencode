package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bt extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.bt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private java.lang.String encodingVersion_ = "";
    private dev.epro.r0.R17185427375111049466 activeBlobIndex_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.bt btVar = new ads_mobile_sdk.bt();
        DEFAULT_INSTANCE = btVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.bt.class, btVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new java.lang.Object[]{"bitField0_", "encodingVersion_", "activeBlobIndex_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.bt();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
