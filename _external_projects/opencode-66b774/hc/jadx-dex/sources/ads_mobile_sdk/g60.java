package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g60 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.g60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private int id_;
    private int resourceId_;
    private java.lang.String tag_ = "";
    private dev.epro.r0.R17185427375111049466 childIds_ = ads_mobile_sdk.jb1.e;
    private dev.epro.r0.O6641393078261985068 attribute_ = ads_mobile_sdk.in2.e;
    private ads_mobile_sdk.sq innerHtml_ = ads_mobile_sdk.sq.b;

    static {
        ads_mobile_sdk.g60 g60Var = new ads_mobile_sdk.g60();
        DEFAULT_INSTANCE = g60Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.g60.class, g60Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new java.lang.Object[]{"bitField0_", "id_", "tag_", "childIds_", "resourceId_", "attribute_", ads_mobile_sdk.e60.class, "innerHtml_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.g60();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
