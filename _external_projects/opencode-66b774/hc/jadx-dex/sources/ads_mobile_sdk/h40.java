package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class h40 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.h40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private ads_mobile_sdk.sq name_;
    private ads_mobile_sdk.sq value_;

    static {
        ads_mobile_sdk.h40 h40Var = new ads_mobile_sdk.h40();
        DEFAULT_INSTANCE = h40Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.h40.class, h40Var);
    }

    public h40() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.name_ = l8361547894089146393;
        this.value_ = l8361547894089146393;
    }

    public static dev.epro.r0.P9981443908238719923 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 0) {
            return java.lang.Byte.valueOf(this.memoizedIsInitialized);
        }
        if (iE == 1) {
            this.memoizedIsInitialized = (byte) (cu0Var == null ? 0 : 1);
            return null;
        }
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new java.lang.Object[]{"bitField0_", "name_", "value_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.h40();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.P9981443908238719923(DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ads_mobile_sdk.qq qqVar) {
        this.bitField0_ |= 2;
        this.value_ = qqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ads_mobile_sdk.qq qqVar) {
        this.bitField0_ |= 1;
        this.name_ = qqVar;
    }
}
