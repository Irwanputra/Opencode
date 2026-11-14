package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vd extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.vd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private ads_mobile_sdk.sq data_;
    private ads_mobile_sdk.sq hash_;
    private ads_mobile_sdk.sq osVersion_;
    private ads_mobile_sdk.sq timestamp_;

    static {
        ads_mobile_sdk.vd vdVar = new ads_mobile_sdk.vd();
        DEFAULT_INSTANCE = vdVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.vd.class, vdVar);
    }

    public vd() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.data_ = l8361547894089146393;
        this.hash_ = l8361547894089146393;
        this.timestamp_ = l8361547894089146393;
        this.osVersion_ = l8361547894089146393;
    }

    public static dev.epro.r0.D5956791176084851114 s() {
        return (dev.epro.r0.D5956791176084851114) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"bitField0_", "data_", "hash_", "timestamp_", "osVersion_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.vd();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.D5956791176084851114(DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 4;
        this.timestamp_ = qqVar;
    }

    public final ads_mobile_sdk.sq o() {
        return this.data_;
    }

    public final ads_mobile_sdk.sq p() {
        return this.hash_;
    }

    public final ads_mobile_sdk.sq q() {
        return this.osVersion_;
    }

    public final ads_mobile_sdk.sq r() {
        return this.timestamp_;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 8;
        this.osVersion_ = qqVar;
    }

    public static ads_mobile_sdk.vd a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.vd) cu0VarA;
    }
}
