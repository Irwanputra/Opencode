package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u7 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.u7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int hostType_;
    private int osType_;
    private ads_mobile_sdk.sq vmVersion_ = ads_mobile_sdk.sq.b;
    private java.lang.String model_ = "";
    private java.lang.String appId_ = "";
    private java.lang.String hostVersion_ = "";

    static {
        ads_mobile_sdk.u7 u7Var = new ads_mobile_sdk.u7();
        DEFAULT_INSTANCE = u7Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.u7.class, u7Var);
    }

    public static dev.epro.r0.X8174393611044482612 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new java.lang.Object[]{"bitField0_", "vmVersion_", "apiLevel_", "model_", "appId_", "appVersionCode_", "hostVersion_", "osType_", "hostType_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.u7();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.X8174393611044482612(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appId_ = str;
    }

    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.hostVersion_ = str;
    }

    public final void d(java.lang.String str) {
        java.lang.String str2 = android.os.Build.MODEL;
        java.util.Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.model_ = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 1;
        this.vmVersion_ = qqVar;
    }
}
