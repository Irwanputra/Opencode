package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tt0 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.tt0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private ads_mobile_sdk.sq bytecode_;
    private ads_mobile_sdk.sm2 metadata_;
    private ads_mobile_sdk.sq vm_;

    static {
        ads_mobile_sdk.tt0 tt0Var = new ads_mobile_sdk.tt0();
        DEFAULT_INSTANCE = tt0Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.tt0.class, tt0Var);
    }

    public tt0() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.vm_ = l8361547894089146393;
        this.bytecode_ = l8361547894089146393;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new java.lang.Object[]{"bitField0_", "metadata_", "vm_", "bytecode_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.tt0();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }

    public final ads_mobile_sdk.sq o() {
        return this.bytecode_;
    }

    public final ads_mobile_sdk.sm2 p() {
        ads_mobile_sdk.sm2 sm2Var = this.metadata_;
        return sm2Var == null ? ads_mobile_sdk.sm2.p() : sm2Var;
    }

    public final ads_mobile_sdk.sq q() {
        return this.vm_;
    }

    public static ads_mobile_sdk.tt0 a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.tt0) cu0VarA;
    }
}
