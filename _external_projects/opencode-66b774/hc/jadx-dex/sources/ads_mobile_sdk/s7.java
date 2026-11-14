package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class s7 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.s7 DEFAULT_INSTANCE;
    public static final int c = 8;
    public static final int d = 21;
    public static final int e = 22;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 25;
    public static final int i = 40;
    public static final int j = 41;
    public static final int k = 60;
    public static final int l = 61;
    public static final int m = 62;
    public static final int n = 63;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105o = 64;
    public static final int p = 65;
    public static final int q = 66;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int deviceType_;
    private int hostType_;
    private int osType_;
    private long requestedAdshieldVersion_;
    private long samplingDenominator_;
    private int experimentIdsMemoizedSerializedSize = -1;
    private dev.epro.r0.O6641393078261985068 logEvents_ = ads_mobile_sdk.in2.e;
    private java.lang.String model_ = "";
    private java.lang.String locale_ = "";
    private java.lang.String country_ = "";
    private java.lang.String appId_ = "";
    private java.lang.String hostVersion_ = "";
    private java.lang.String adshieldVersion_ = "";
    private dev.epro.r0.R17185427375111049466 experimentIds_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.s7 s7Var = new ads_mobile_sdk.s7();
        DEFAULT_INSTANCE = s7Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.s7.class, s7Var);
    }

    public static dev.epro.r0.L6589127411573323482 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new java.lang.Object[]{"bitField0_", "logEvents_", ads_mobile_sdk.em1.class, "apiLevel_", "model_", "locale_", "country_", "deviceType_", ads_mobile_sdk.ad.a$20, "appId_", "appVersionCode_", "hostVersion_", "adshieldVersion_", "samplingDenominator_", "requestedAdshieldVersion_", "experimentIds_", "hostType_", "osType_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.s7();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L6589127411573323482(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.adshieldVersion_ = str;
    }

    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.appId_ = str;
    }

    public final void d(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.country_ = str;
    }

    public final void e(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.hostVersion_ = str;
    }

    public final void f(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.locale_ = str;
    }

    public final void g(java.lang.String str) {
        java.lang.String str2 = android.os.Build.MODEL;
        java.util.Objects.requireNonNull(str2);
        this.bitField0_ |= 2;
        this.model_ = str2;
    }

    public final void a(ads_mobile_sdk.em1 em1Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.logEvents_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.logEvents_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(em1Var);
    }
}
