package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zu1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.zu1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private ads_mobile_sdk.gn1 adUnitToUseMediaView_ = ads_mobile_sdk.gn1.b;
    private long appVersionCode_;

    static {
        ads_mobile_sdk.zu1 zu1Var = new ads_mobile_sdk.zu1();
        DEFAULT_INSTANCE = zu1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.zu1.class, zu1Var);
    }

    public static ads_mobile_sdk.zu1 q() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.T16895755319777707412 r() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new java.lang.Object[]{"appVersionCode_", "adUnitToUseMediaView_", new ads_mobile_sdk.dn1(ads_mobile_sdk.ft3.d, ads_mobile_sdk.ft3.c, java.lang.Boolean.FALSE)});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.zu1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.T16895755319777707412(DEFAULT_INSTANCE);
    }

    public final java.util.Map o() {
        return java.util.Collections.unmodifiableMap(this.adUnitToUseMediaView_);
    }

    public final long p() {
        return this.appVersionCode_;
    }

    public static ads_mobile_sdk.zu1 a(java.io.FileInputStream fileInputStream) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, new ads_mobile_sdk.su(fileInputStream), ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.zu1) cu0VarA;
    }
}
