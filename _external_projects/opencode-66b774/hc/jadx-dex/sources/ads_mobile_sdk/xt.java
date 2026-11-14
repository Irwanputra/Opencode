package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xt extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.xt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private java.lang.String versionNumber_ = "";
    private dev.epro.r0.R17185427375111049466 selectedExperimentIds_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.xt xtVar = new ads_mobile_sdk.xt();
        DEFAULT_INSTANCE = xtVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.xt.class, xtVar);
    }

    public static dev.epro.r0.U9713920948222429651 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new java.lang.Object[]{"binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.xt();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.U9713920948222429651(DEFAULT_INSTANCE);
    }
}
