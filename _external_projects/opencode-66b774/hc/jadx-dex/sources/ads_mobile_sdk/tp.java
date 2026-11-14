package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tp extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.tp DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 9;
    public static final int l = 11;
    public static final int m = 10;
    private int backoffStep_;
    private int bitField0_;
    private long cacheTimestamp_;
    private ads_mobile_sdk.sp error_;
    private float executionCredit_;
    private int failedExecutions_;
    private boolean isFromPrebid_;
    private boolean isPublisherCreated_;
    private long lastExecutionTimestamp_;
    private int skippedExecutions_;
    private java.lang.String javascriptLibraryName_ = "";
    private java.lang.String buyerGeneratedRequestData_ = "";

    static {
        ads_mobile_sdk.tp tpVar = new ads_mobile_sdk.tp();
        DEFAULT_INSTANCE = tpVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.tp.class, tpVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0005\u0005င\u0006\u0006င\u0007\u0007ဂ\u0003\bခ\u0004\tဇ\b\nဉ\n\u000bဇ\t", new java.lang.Object[]{"bitField0_", "javascriptLibraryName_", "buyerGeneratedRequestData_", "cacheTimestamp_", "failedExecutions_", "skippedExecutions_", "backoffStep_", "lastExecutionTimestamp_", "executionCredit_", "isPublisherCreated_", "error_", "isFromPrebid_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.tp();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
