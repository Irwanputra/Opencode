package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hl1 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.hl1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private ads_mobile_sdk.sq hmacKey_;
    private int hmacSignatureLength_;
    private byte memoizedIsInitialized = 2;
    private ads_mobile_sdk.sq symmetricKey_;
    private int type_;

    static {
        ads_mobile_sdk.hl1 hl1Var = new ads_mobile_sdk.hl1();
        DEFAULT_INSTANCE = hl1Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.hl1.class, hl1Var);
    }

    public hl1() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = ads_mobile_sdk.sq.b;
        this.symmetricKey_ = l8361547894089146393;
        this.hmacKey_ = l8361547894089146393;
    }

    public static dev.epro.r0.G12293736735718106169 o() {
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
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔊ\u0002\u0004င\u0003", new java.lang.Object[]{"bitField0_", "type_", ads_mobile_sdk.ad.a$11, "symmetricKey_", "hmacKey_", "hmacSignatureLength_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.hl1();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.G12293736735718106169(DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 2;
        this.symmetricKey_ = qqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 4;
        this.hmacKey_ = qqVar;
    }
}
