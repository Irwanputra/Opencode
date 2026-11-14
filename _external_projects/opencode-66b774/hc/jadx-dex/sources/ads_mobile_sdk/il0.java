package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class il0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.il0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 4;
    public static final int e = 2;
    public static final int f = 3;
    private int bitField0_;
    private boolean usersMatch_;
    private ads_mobile_sdk.sq clearBlob_ = ads_mobile_sdk.sq.b;
    private java.lang.String clearBlobJs_ = "";
    private dev.epro.r0.O6641393078261985068 encryptedBlob_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.il0 il0Var = new ads_mobile_sdk.il0();
        DEFAULT_INSTANCE = il0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.il0.class, il0Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new java.lang.Object[]{"bitField0_", "clearBlob_", "encryptedBlob_", "usersMatch_", "clearBlobJs_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.il0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
