package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class de extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.de DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    private int bitField0_;
    private long evtTime_;
    private long uptSignal_;
    private long vcdSignal_;
    private java.lang.String adshieldVersion_ = "";
    private java.lang.String afmaVersion_ = "";
    private java.lang.String appIdSignal_ = "D";
    private java.lang.String cerSignal_ = "";

    static {
        ads_mobile_sdk.de deVar = new ads_mobile_sdk.de();
        DEFAULT_INSTANCE = deVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.de.class, deVar);
    }

    public static dev.epro.r0.O14274123019025838265 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new java.lang.Object[]{"bitField0_", "adshieldVersion_", "afmaVersion_", "evtTime_", "appIdSignal_", "vcdSignal_", "uptSignal_", "cerSignal_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.de();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.O14274123019025838265(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.afmaVersion_ = str;
    }

    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appIdSignal_ = str;
    }

    public final void d(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.cerSignal_ = str;
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.adshieldVersion_ = "0.960507516";
    }
}
