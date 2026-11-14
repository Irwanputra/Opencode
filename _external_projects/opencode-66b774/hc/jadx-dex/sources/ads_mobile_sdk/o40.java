package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class o40 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.o40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int code_;
    private ads_mobile_sdk.sq message_;
    private ads_mobile_sdk.sq version_;

    static {
        ads_mobile_sdk.o40 o40Var = new ads_mobile_sdk.o40();
        DEFAULT_INSTANCE = o40Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.o40.class, o40Var);
    }

    public o40() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.message_ = l8361547894089146393;
        this.version_ = l8361547894089146393;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new java.lang.Object[]{"bitField0_", "code_", "message_", "version_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.o40();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
