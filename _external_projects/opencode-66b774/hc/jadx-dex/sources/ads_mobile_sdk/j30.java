package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j30 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.j30 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int tokenSource_;
    private long tokenTimeMsec_;
    private ads_mobile_sdk.sq tokenValue_ = ads_mobile_sdk.sq.b;

    static {
        ads_mobile_sdk.j30 j30Var = new ads_mobile_sdk.j30();
        DEFAULT_INSTANCE = j30Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.j30.class, j30Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new java.lang.Object[]{"bitField0_", "tokenSource_", ads_mobile_sdk.ad.a$16, "tokenTimeMsec_", "tokenValue_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.j30();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
