package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a70 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.a70 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private ads_mobile_sdk.gn1 concatenatedSignalsMap_ = ads_mobile_sdk.gn1.b;
    private ads_mobile_sdk.pb2 patternMatchingFlag_;
    private ads_mobile_sdk.uh2 preProcessingFlag_;

    static {
        ads_mobile_sdk.a70 a70Var = new ads_mobile_sdk.a70();
        DEFAULT_INSTANCE = a70Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.a70.class, a70Var);
    }

    public static ads_mobile_sdk.a70 p() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.U1061257129253093767 s() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new java.lang.Object[]{"bitField0_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.a70();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.U1061257129253093767(DEFAULT_INSTANCE);
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final ads_mobile_sdk.pb2 q() {
        ads_mobile_sdk.pb2 pb2Var = this.patternMatchingFlag_;
        return pb2Var == null ? ads_mobile_sdk.pb2.o() : pb2Var;
    }

    public final ads_mobile_sdk.uh2 r() {
        ads_mobile_sdk.uh2 uh2Var = this.preProcessingFlag_;
        return uh2Var == null ? ads_mobile_sdk.uh2.o() : uh2Var;
    }

    public final void a(ads_mobile_sdk.pb2 pb2Var) {
        this.patternMatchingFlag_ = pb2Var;
        this.bitField0_ |= 1;
    }

    public final void a(ads_mobile_sdk.uh2 uh2Var) {
        this.preProcessingFlag_ = uh2Var;
        this.bitField0_ |= 2;
    }

    public static ads_mobile_sdk.a70 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.a70) cu0VarA;
    }
}
