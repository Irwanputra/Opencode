package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class z8 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.z8 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private java.lang.String effectiveAdUnitId_;
    private dev.epro.r0.O6641393078261985068 excludingRegexes_;
    private dev.epro.r0.O6641393078261985068 includingRegexes_;

    static {
        ads_mobile_sdk.z8 z8Var = new ads_mobile_sdk.z8();
        DEFAULT_INSTANCE = z8Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.z8.class, z8Var);
    }

    public z8() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.includingRegexes_ = in2Var;
        this.excludingRegexes_ = in2Var;
        this.effectiveAdUnitId_ = "";
    }

    public static dev.epro.r0.O14932123057360168587 r() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ለ\u0000", new java.lang.Object[]{"bitField0_", "includingRegexes_", "excludingRegexes_", "effectiveAdUnitId_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.z8();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.O14932123057360168587(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 1;
        this.effectiveAdUnitId_ = str;
    }

    public final java.lang.String o() {
        return this.effectiveAdUnitId_;
    }

    public final dev.epro.r0.O6641393078261985068 p$1() {
        return this.excludingRegexes_;
    }

    public final java.util.List q() {
        return this.includingRegexes_;
    }
}
