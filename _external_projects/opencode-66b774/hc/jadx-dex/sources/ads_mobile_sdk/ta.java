package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ta extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ta DEFAULT_INSTANCE;
    private static final dev.epro.r0.B4259731004323267459 allowedFormats_converter_ = new dev.epro.r0.U11450443558875589191((byte) 12);
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private long adapterInitializationTimeoutMs_;
    private dev.epro.r0.O6641393078261985068 allowedAdUnits_;
    private dev.epro.r0.O6641393078261985068 allowedAdapterClasses_;
    private int allowedFormatsMemoizedSerializedSize;
    private dev.epro.r0.R17185427375111049466 allowedFormats_ = ads_mobile_sdk.jb1.e;
    private dev.epro.r0.O6641393078261985068 excludedAdapterClasses_;
    private dev.epro.r0.O6641393078261985068 initializedAdapterClasses_;

    static {
        ads_mobile_sdk.ta taVar = new ads_mobile_sdk.ta();
        DEFAULT_INSTANCE = taVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ta.class, taVar);
    }

    public ta() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.allowedAdUnits_ = in2Var;
        this.allowedAdapterClasses_ = in2Var;
        this.excludedAdapterClasses_ = in2Var;
        this.initializedAdapterClasses_ = in2Var;
    }

    public static dev.epro.r0.Y10223024091508858024 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new java.lang.Object[]{"adapterInitializationTimeoutMs_", "allowedFormats_", "allowedAdUnits_", "allowedAdapterClasses_", "excludedAdapterClasses_", "initializedAdapterClasses_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ta();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Y10223024091508858024(DEFAULT_INSTANCE);
    }
}
