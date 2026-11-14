package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y13 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.y13 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private java.lang.String cachedSdkCore_ = "";
    private long lastUpdateTimeMs_;

    static {
        ads_mobile_sdk.y13 y13Var = new ads_mobile_sdk.y13();
        DEFAULT_INSTANCE = y13Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.y13.class, y13Var);
    }

    public static ads_mobile_sdk.y13 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"bitField0_", "cachedSdkCore_", "lastUpdateTimeMs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.y13();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.I4512433669318320344(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.cachedSdkCore_ = str;
    }

    public final java.lang.String o() {
        return this.cachedSdkCore_;
    }

    public final long q() {
        return this.lastUpdateTimeMs_;
    }

    public static ads_mobile_sdk.y13 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.y13) cu0VarA;
    }
}
