package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yn1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.yn1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 2;
    private dev.epro.r0.O6641393078261985068 adapters_;
    private ads_mobile_sdk.gn1 data_ = ads_mobile_sdk.gn1.b;
    private dev.epro.r0.O6641393078261985068 waterfallAdapters_;

    static {
        ads_mobile_sdk.yn1 yn1Var = new ads_mobile_sdk.yn1();
        DEFAULT_INSTANCE = yn1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.yn1.class, yn1Var);
    }

    public yn1() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.adapters_ = in2Var;
        this.waterfallAdapters_ = in2Var;
    }

    public static dev.epro.r0.S6059772632253557467 r() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0002\u0000\u0001Ț\u00022\u0003Ț", new java.lang.Object[]{"adapters_", "data_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, ""), "waterfallAdapters_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.yn1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.S6059772632253557467(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.O6641393078261985068 o() {
        return this.adapters_;
    }

    public final java.util.Map p() {
        return java.util.Collections.unmodifiableMap(this.data_);
    }
}
