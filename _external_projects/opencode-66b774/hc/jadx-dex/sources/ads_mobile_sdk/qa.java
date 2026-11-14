package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qa extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.qa DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private ads_mobile_sdk.gn1 extras_ = ads_mobile_sdk.gn1.b;
    private java.lang.String format_ = "";

    static {
        ads_mobile_sdk.qa qaVar = new ads_mobile_sdk.qa();
        DEFAULT_INSTANCE = qaVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.qa.class, qaVar);
    }

    public static dev.epro.r0.K15899002224316188312 q() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new java.lang.Object[]{"bitField0_", "format_", "extras_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.qa();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.K15899002224316188312(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 1;
        this.format_ = str;
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.extras_);
    }

    public final java.lang.String p() {
        return this.format_;
    }
}
