package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cq extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.cq DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 4;
    private static final dev.epro.r0.B4259731004323267459 dEPRECATEDAdapterBehavior_converter_ = new dev.epro.r0.U11450443558875589191((byte) 14);
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    private int adapterBehaviorBitmap_;
    private ads_mobile_sdk.bq adapterVersion_;
    private int bitField0_;
    private int dEPRECATEDAdapterBehaviorMemoizedSerializedSize;
    private ads_mobile_sdk.zp error_;
    private boolean isPublisherCreated_;
    private long latencyMs_;
    private ads_mobile_sdk.bq sdkVersion_;
    private java.lang.String adapterClassName_ = "";
    private java.lang.String buyerGeneratedRequestData_ = "";
    private dev.epro.r0.R17185427375111049466 dEPRECATEDAdapterBehavior_ = ads_mobile_sdk.jb1.e;

    static {
        ads_mobile_sdk.cq cqVar = new ads_mobile_sdk.cq();
        DEFAULT_INSTANCE = cqVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.cq.class, cqVar);
    }

    public static dev.epro.r0.G3252892568320898947 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001\u0005ဈ\u0000\u0006ဇ\u0004\u0007ဉ\u0005\bဂ\u0006\tࠬ\nဋ\u0007", new java.lang.Object[]{"bitField0_", "sdkVersion_", "adapterVersion_", "buyerGeneratedRequestData_", "adapterClassName_", "isPublisherCreated_", "error_", "latencyMs_", "dEPRECATEDAdapterBehavior_", ads_mobile_sdk.tt.a$7, "adapterBehaviorBitmap_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.cq();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.G3252892568320898947(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 2;
        this.buyerGeneratedRequestData_ = str;
    }

    public final void b(ads_mobile_sdk.bq bqVar) {
        this.sdkVersion_ = bqVar;
        this.bitField0_ |= 4;
    }

    public final void a(ads_mobile_sdk.bq bqVar) {
        this.adapterVersion_ = bqVar;
        this.bitField0_ |= 8;
    }

    public final void a(ads_mobile_sdk.zp zpVar) {
        this.error_ = zpVar;
        this.bitField0_ |= 32;
    }
}
