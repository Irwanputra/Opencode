package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class rm2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.rm2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int architecture_;
    private int bitField0_;
    private java.lang.Object metadata_;
    private int metadataCase_ = 0;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private dev.epro.r0.R17185427375111049466 activeExperimentIds_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.rm2 rm2Var = new ads_mobile_sdk.rm2();
        DEFAULT_INSTANCE = rm2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.rm2.class, rm2Var);
    }

    public static ads_mobile_sdk.rm2 q() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.X7577837190169583211 t() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new java.lang.Object[]{"metadata_", "metadataCase_", "bitField0_", ads_mobile_sdk.sm2.class, ads_mobile_sdk.r92.class, "architecture_", ads_mobile_sdk.ad.a$10, "activeExperimentIds_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.rm2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.X7577837190169583211(DEFAULT_INSTANCE);
    }

    public final dev.epro.r0.R17185427375111049466 o() {
        return this.activeExperimentIds_;
    }

    public final ads_mobile_sdk.fk p() {
        ads_mobile_sdk.fk fkVarA = ads_mobile_sdk.fk.a(this.architecture_);
        return fkVarA == null ? ads_mobile_sdk.fk.UNSUPPORTED : fkVarA;
    }

    public final ads_mobile_sdk.sm2 r() {
        return this.metadataCase_ == 1 ? (ads_mobile_sdk.sm2) this.metadata_ : ads_mobile_sdk.sm2.p();
    }

    public final ads_mobile_sdk.r92 s() {
        return this.metadataCase_ == 2 ? (ads_mobile_sdk.r92) this.metadata_ : ads_mobile_sdk.r92.o();
    }

    public static ads_mobile_sdk.rm2 a(ads_mobile_sdk.qq qqVar) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.rm2 rm2Var = DEFAULT_INSTANCE;
        ads_mobile_sdk.nl0 nl0VarA = ads_mobile_sdk.nl0.a();
        byte[] bArr = qqVar.d;
        int length = bArr.length;
        ads_mobile_sdk.ru ruVar = new ads_mobile_sdk.ru(bArr, length);
        try {
            ruVar.d(length);
            ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(rm2Var, ruVar, nl0VarA);
            ruVar.a(0);
            ads_mobile_sdk.cu0.a(cu0VarA);
            ads_mobile_sdk.cu0.a(cu0VarA);
            return (ads_mobile_sdk.rm2) cu0VarA;
        } catch (ads_mobile_sdk.yi1 e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public final void a(ads_mobile_sdk.sm2 sm2Var) {
        java.util.Objects.requireNonNull(sm2Var);
        this.metadata_ = sm2Var;
        this.metadataCase_ = 1;
    }

    public final void a(ads_mobile_sdk.r92 r92Var) {
        java.util.Objects.requireNonNull(r92Var);
        this.metadata_ = r92Var;
        this.metadataCase_ = 2;
    }

    public static ads_mobile_sdk.rm2 a(byte[] bArr, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0Var);
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.rm2) cu0VarA;
    }
}
