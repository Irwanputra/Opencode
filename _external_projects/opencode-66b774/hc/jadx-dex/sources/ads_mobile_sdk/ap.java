package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ap extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ap DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private boolean shouldCollectSignalsOnFullApp_;
    private boolean shouldGatherSignals_;
    private ads_mobile_sdk.gn1 serverParameters_ = ads_mobile_sdk.gn1.b;
    private java.lang.String adapterClassName_ = "";
    private java.lang.String platform_ = "";

    static {
        ads_mobile_sdk.ap apVar = new ads_mobile_sdk.ap();
        DEFAULT_INSTANCE = apVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ap.class, apVar);
    }

    public static ads_mobile_sdk.ap o() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.H1850504041015929188 s() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u00052", new java.lang.Object[]{"bitField0_", "adapterClassName_", "shouldGatherSignals_", "shouldCollectSignalsOnFullApp_", "platform_", "serverParameters_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ap();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.H1850504041015929188(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 8;
        this.platform_ = str;
    }

    public final ads_mobile_sdk.gn1 p() {
        ads_mobile_sdk.gn1 gn1Var = this.serverParameters_;
        if (gn1Var.a) {
            return gn1Var;
        }
        ads_mobile_sdk.gn1 gn1VarB = gn1Var.b();
        this.serverParameters_ = gn1VarB;
        return gn1VarB;
    }

    public final java.util.Map q() {
        return java.util.Collections.unmodifiableMap(this.serverParameters_);
    }

    public final boolean r() {
        return this.shouldCollectSignalsOnFullApp_;
    }
}
