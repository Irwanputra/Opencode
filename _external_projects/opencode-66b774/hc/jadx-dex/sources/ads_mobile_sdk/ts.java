package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ts extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.ts DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    private int bitField0_;
    private int compression_;
    private int downloadPriority_;
    private ads_mobile_sdk.ss fallbackInstruction_;
    private boolean meteredAllowed_;
    private ads_mobile_sdk.zs postProcess_;
    private boolean roamingAllowed_;
    private int type_;
    private java.lang.String name_ = "";
    private java.lang.String id_ = "";
    private int state_ = 1;
    private java.lang.String downloadPath_ = "";
    private java.lang.String fallbackDownloadPath_ = "";

    static {
        ads_mobile_sdk.ts tsVar = new ads_mobile_sdk.ts();
        DEFAULT_INSTANCE = tsVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.ts.class, tsVar);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new java.lang.Object[]{"bitField0_", "name_", "id_", "type_", ads_mobile_sdk.ad.a$12, "state_", ads_mobile_sdk.ad.a$6, "meteredAllowed_", "downloadPath_", "roamingAllowed_", "downloadPriority_", "compression_", ads_mobile_sdk.tt.a$5, "postProcess_", "fallbackDownloadPath_", "fallbackInstruction_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.ts();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.L12317760381951726138(DEFAULT_INSTANCE);
    }
}
