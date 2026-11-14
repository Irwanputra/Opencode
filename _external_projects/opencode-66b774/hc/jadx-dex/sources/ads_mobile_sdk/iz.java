package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iz extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.iz DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private ads_mobile_sdk.ax consentAllowlist_;
    private ads_mobile_sdk.pb2 patternMatchingFlag_;
    private ads_mobile_sdk.uh2 preProcessingFlag_;
    private ads_mobile_sdk.gn1 concatenatedSignalsMap_ = ads_mobile_sdk.gn1.b;
    private java.lang.String consentStringJson_ = "";
    private java.lang.String consentStateJson_ = "";

    static {
        ads_mobile_sdk.iz izVar = new ads_mobile_sdk.iz();
        DEFAULT_INSTANCE = izVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.iz.class, izVar);
    }

    public static ads_mobile_sdk.iz s() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.L14515889287724438211 w() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u00052\u0006ဉ\u0004", new java.lang.Object[]{"bitField0_", "consentStringJson_", "consentStateJson_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, ""), "consentAllowlist_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.iz();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L14515889287724438211(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 2;
        this.consentStateJson_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 1;
        this.consentStringJson_ = str;
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final ads_mobile_sdk.ax p() {
        ads_mobile_sdk.ax axVar = this.consentAllowlist_;
        return axVar == null ? ads_mobile_sdk.ax.r() : axVar;
    }

    public final java.lang.String q() {
        return this.consentStateJson_;
    }

    public final java.lang.String r() {
        return this.consentStringJson_;
    }

    public final ads_mobile_sdk.pb2 t() {
        ads_mobile_sdk.pb2 pb2Var = this.patternMatchingFlag_;
        return pb2Var == null ? ads_mobile_sdk.pb2.o() : pb2Var;
    }

    public final ads_mobile_sdk.uh2 u() {
        ads_mobile_sdk.uh2 uh2Var = this.preProcessingFlag_;
        return uh2Var == null ? ads_mobile_sdk.uh2.o() : uh2Var;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final void a(ads_mobile_sdk.ax axVar) {
        this.consentAllowlist_ = axVar;
        this.bitField0_ |= 16;
    }
}
