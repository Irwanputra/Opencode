package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class l40 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.l40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private ads_mobile_sdk.sq body_;
    private ads_mobile_sdk.sq bodydigest_;
    private int bodylength_;
    private ads_mobile_sdk.k40 firstline_;
    private byte memoizedIsInitialized = 2;
    private dev.epro.r0.O6641393078261985068 headers_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.l40 l40Var = new ads_mobile_sdk.l40();
        DEFAULT_INSTANCE = l40Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.l40.class, l40Var);
    }

    public l40() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.body_ = l8361547894089146393;
        this.bodydigest_ = l8361547894089146393;
    }

    public static dev.epro.r0.T16764273809881983379 o() {
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
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new java.lang.Object[]{"bitField0_", "firstline_", "headers_", ads_mobile_sdk.h40.class, "body_", "bodydigest_", "bodylength_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.l40();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.T16764273809881983379(DEFAULT_INSTANCE);
    }

    public final void a(ads_mobile_sdk.h40 h40Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.headers_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.headers_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(h40Var);
    }
}
