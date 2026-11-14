package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yl0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.yl0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private ads_mobile_sdk.sq bytecode_;
    private ads_mobile_sdk.rm2 metadata_;
    private int status_;
    private ads_mobile_sdk.sq vm_;

    static {
        ads_mobile_sdk.yl0 yl0Var = new ads_mobile_sdk.yl0();
        DEFAULT_INSTANCE = yl0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.yl0.class, yl0Var);
    }

    public yl0() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.bytecode_ = l8361547894089146393;
        this.vm_ = l8361547894089146393;
    }

    public static dev.epro.r0.Z13283891527057128406 s() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new java.lang.Object[]{"bitField0_", "metadata_", "bytecode_", "vm_", "status_", ads_mobile_sdk.ad.a$13});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.yl0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Z13283891527057128406(DEFAULT_INSTANCE);
    }

    public final void b(ads_mobile_sdk.sq sqVar) {
        java.util.Objects.requireNonNull(sqVar);
        this.bitField0_ |= 4;
        this.vm_ = sqVar;
    }

    public final ads_mobile_sdk.sq o() {
        return this.bytecode_;
    }

    public final ads_mobile_sdk.rm2 p() {
        ads_mobile_sdk.rm2 rm2Var = this.metadata_;
        return rm2Var == null ? ads_mobile_sdk.rm2.q() : rm2Var;
    }

    public final int q$1() {
        int i_a = dev.epro.r0.E12098517352909843120._a(this.status_);
        if (i_a == 0) {
            return 1;
        }
        return i_a;
    }

    public final ads_mobile_sdk.sq r() {
        return this.vm_;
    }

    public final void a(ads_mobile_sdk.sq sqVar) {
        java.util.Objects.requireNonNull(sqVar);
        this.bitField0_ |= 2;
        this.bytecode_ = sqVar;
    }

    public final void a(ads_mobile_sdk.rm2 rm2Var) {
        this.metadata_ = rm2Var;
        this.bitField0_ |= 1;
    }
}
