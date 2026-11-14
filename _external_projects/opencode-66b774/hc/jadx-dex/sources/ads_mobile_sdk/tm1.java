package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tm1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.tm1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private float logSampleRate_;
    private java.lang.String remoteCaptureServiceUrl_ = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long logBufferSize_ = 1000;
    private long logIntervalMs_ = 60000;

    static {
        ads_mobile_sdk.tm1 tm1Var = new ads_mobile_sdk.tm1();
        DEFAULT_INSTANCE = tm1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.tm1.class, tm1Var);
    }

    public static ads_mobile_sdk.tm1 o() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.X13739385577301502566 t() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"bitField0_", "remoteCaptureServiceUrl_", "logSampleRate_", "logBufferSize_", "logIntervalMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.tm1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.X13739385577301502566(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        this.bitField0_ |= 1;
        this.remoteCaptureServiceUrl_ = str;
    }

    public final long p() {
        return this.logBufferSize_;
    }

    public final long q() {
        return this.logIntervalMs_;
    }

    public final float r() {
        return this.logSampleRate_;
    }

    public final java.lang.String s() {
        return this.remoteCaptureServiceUrl_;
    }
}
