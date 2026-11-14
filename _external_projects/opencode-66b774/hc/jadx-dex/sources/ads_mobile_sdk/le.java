package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class le extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.le DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private dev.epro.r0.O6641393078261985068 encryptedBlobs_ = ads_mobile_sdk.in2.e;
    private ads_mobile_sdk.sq hash_ = ads_mobile_sdk.sq.b;
    private int protoName_ = 1;
    private int encryptionMethod_ = 1;

    static {
        ads_mobile_sdk.le leVar = new ads_mobile_sdk.le();
        DEFAULT_INSTANCE = leVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.le.class, leVar);
    }

    public static dev.epro.r0.L16390669445741171034 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new java.lang.Object[]{"bitField0_", "encryptedBlobs_", "hash_", "protoName_", ads_mobile_sdk.ad.a$9, "encryptionMethod_", ads_mobile_sdk.tt.a$10});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.le();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L16390669445741171034(DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        this.bitField0_ |= 1;
        this.hash_ = qqVar;
    }

    public final void a(ads_mobile_sdk.qq qqVar) {
        java.util.Objects.requireNonNull(qqVar);
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.encryptedBlobs_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.encryptedBlobs_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(qqVar);
    }
}
