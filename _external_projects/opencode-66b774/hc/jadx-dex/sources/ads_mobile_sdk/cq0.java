package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cq0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.cq0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 8;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private ads_mobile_sdk.iz consentState_;
    private boolean hasSdkInitializedPreviously_;
    private int sessionsSinceUpdate_;
    private ads_mobile_sdk.gn1 storedSdkCoreData_ = ads_mobile_sdk.gn1.b;
    private java.lang.String flagJson_ = "";
    private java.lang.String cachedUserAgent_ = "";

    static {
        ads_mobile_sdk.cq0 cq0Var = new ads_mobile_sdk.cq0();
        DEFAULT_INSTANCE = cq0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.cq0.class, cq0Var);
    }

    public static ads_mobile_sdk.cq0 q() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.Y5584543079932758380 v() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            dev.epro.r0.E2581631045160024594 e2581631045160024594 = ads_mobile_sdk.ft3.d;
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u00052\u0006ဉ\u0003\u0007ለ\u0004\bဇ\u0002", new java.lang.Object[]{"bitField0_", "flagJson_", "sessionsSinceUpdate_", "storedSdkCoreData_", new ads_mobile_sdk.dn1(e2581631045160024594, e2581631045160024594, ""), "consentState_", "cachedUserAgent_", "hasSdkInitializedPreviously_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.cq0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Y5584543079932758380(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.cachedUserAgent_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 1;
        this.flagJson_ = str;
    }

    public final java.lang.String o() {
        return this.cachedUserAgent_;
    }

    public final ads_mobile_sdk.iz p() {
        ads_mobile_sdk.iz izVar = this.consentState_;
        return izVar == null ? ads_mobile_sdk.iz.s() : izVar;
    }

    public final java.lang.String r() {
        return this.flagJson_;
    }

    public final boolean s() {
        return this.hasSdkInitializedPreviously_;
    }

    public final int t() {
        return this.sessionsSinceUpdate_;
    }

    public final java.util.Map u() {
        return java.util.Collections.unmodifiableMap(this.storedSdkCoreData_);
    }

    public final void a(ads_mobile_sdk.iz izVar) {
        java.util.Objects.requireNonNull(izVar);
        this.consentState_ = izVar;
        this.bitField0_ |= 8;
    }

    public static ads_mobile_sdk.cq0 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.cq0) cu0VarA;
    }
}
