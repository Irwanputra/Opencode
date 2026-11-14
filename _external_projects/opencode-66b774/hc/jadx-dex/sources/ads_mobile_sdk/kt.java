package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kt extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.kt DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 10;
    public static final int j = 9;
    private int bitField0_;
    private dev.epro.r0.O6641393078261985068 blobSet_;
    private dev.epro.r0.O6641393078261985068 blob_;
    private ads_mobile_sdk.bo3 compatInfo_;
    private java.lang.String debugOnlyVersion_;
    private dev.epro.r0.O6641393078261985068 pluginSets_;
    private int velourSdkInt_;
    private java.lang.String appName_ = "";
    private java.lang.String version_ = "";

    static {
        ads_mobile_sdk.kt ktVar = new ads_mobile_sdk.kt();
        DEFAULT_INSTANCE = ktVar;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.kt.class, ktVar);
    }

    public kt() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.blob_ = in2Var;
        this.blobSet_ = in2Var;
        this.pluginSets_ = in2Var;
        this.velourSdkInt_ = -1;
        this.debugOnlyVersion_ = "";
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new java.lang.Object[]{"bitField0_", "version_", "blob_", ads_mobile_sdk.ts.class, "blobSet_", ads_mobile_sdk.bt.class, "velourSdkInt_", "appName_", "pluginSets_", ads_mobile_sdk.st.class, "debugOnlyVersion_", "compatInfo_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.kt();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
