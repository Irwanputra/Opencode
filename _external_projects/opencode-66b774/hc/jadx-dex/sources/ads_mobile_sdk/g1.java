package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.g1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int androidApiVersion_;
    private int bitField0_;
    private long versionCode_;
    private ads_mobile_sdk.gn1 pools_ = ads_mobile_sdk.gn1.b;
    private java.lang.String packageName_ = "";
    private java.lang.String deviceModel_ = "";
    private java.lang.String consentStringHash_ = "";

    static {
        ads_mobile_sdk.g1 g1Var = new ads_mobile_sdk.g1();
        DEFAULT_INSTANCE = g1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.g1.class, g1Var);
    }

    public static ads_mobile_sdk.g1 q() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u00012\u0002ለ\u0000\u0003ဂ\u0001\u0004ለ\u0002\u0005င\u0003\u0006ለ\u0004", new java.lang.Object[]{"bitField0_", "pools_", new ads_mobile_sdk.dn1(ads_mobile_sdk.ft3.d, ads_mobile_sdk.ft3.f, ads_mobile_sdk.vr0.p()), "packageName_", "versionCode_", "deviceModel_", "androidApiVersion_", "consentStringHash_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.g1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.S2322588539201815831(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.consentStringHash_ = str;
    }

    public final void c(java.lang.String str) {
        java.lang.String str2 = android.os.Build.MODEL;
        java.util.Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.deviceModel_ = str2;
    }

    public final void d(java.lang.String str) {
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final int o() {
        return this.androidApiVersion_;
    }

    public final java.lang.String p() {
        return this.consentStringHash_;
    }

    public final java.lang.String r() {
        return this.deviceModel_;
    }

    public final ads_mobile_sdk.gn1 s() {
        ads_mobile_sdk.gn1 gn1Var = this.pools_;
        if (gn1Var.a) {
            return gn1Var;
        }
        ads_mobile_sdk.gn1 gn1VarB = gn1Var.b();
        this.pools_ = gn1VarB;
        return gn1VarB;
    }

    public final java.lang.String t() {
        return this.packageName_;
    }

    public final java.util.Map u() {
        return java.util.Collections.unmodifiableMap(this.pools_);
    }

    public final long v() {
        return this.versionCode_;
    }

    public static ads_mobile_sdk.g1 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.g1) cu0VarA;
    }
}
