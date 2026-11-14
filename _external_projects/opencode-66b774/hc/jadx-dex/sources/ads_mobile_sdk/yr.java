package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yr extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.yr DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    private dev.epro.r0.R17185427375111049466 triggerVariationId_;
    private dev.epro.r0.R17185427375111049466 variationId_;

    static {
        ads_mobile_sdk.yr yrVar = new ads_mobile_sdk.yr();
        DEFAULT_INSTANCE = yrVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.yr.class, yrVar);
    }

    public yr() {
        ads_mobile_sdk.jb1 jb1Var = ads_mobile_sdk.jb1.e;
        this.variationId_ = jb1Var;
        this.triggerVariationId_ = jb1Var;
    }

    public static dev.epro.r0.U14040477310430335452 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new java.lang.Object[]{"variationId_", "triggerVariationId_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.yr();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.U14040477310430335452(DEFAULT_INSTANCE);
    }

    public static ads_mobile_sdk.yr a(byte[] bArr) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.yr) cu0VarA;
    }
}
