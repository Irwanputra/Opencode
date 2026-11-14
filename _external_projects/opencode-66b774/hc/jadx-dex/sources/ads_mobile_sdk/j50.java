package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j50 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.j50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int adResourceType_;
    private int bitField0_;
    private int id_;
    private int parentId_;
    private ads_mobile_sdk.l40 request_;
    private ads_mobile_sdk.p40 response_;
    private byte memoizedIsInitialized = 2;
    private java.lang.String url_ = "";
    private dev.epro.r0.R17185427375111049466 childIds_ = ads_mobile_sdk.jb1.e;
    private java.lang.String tagName_ = "";
    private dev.epro.r0.O6641393078261985068 matchedBlacklist_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.j50 j50Var = new ads_mobile_sdk.j50();
        DEFAULT_INSTANCE = j50Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.j50.class, j50Var);
    }

    public static dev.epro.r0.M1656182982150902219 o() {
        return DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 0) {
            return java.lang.Byte.valueOf(this.memoizedIsInitialized);
        }
        if (iE == 1) {
            this.memoizedIsInitialized = (byte) (cu0Var == null ? 0 : 1);
            return null;
        }
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new java.lang.Object[]{"bitField0_", "id_", "url_", "request_", "response_", "parentId_", "childIds_", "tagName_", "adResourceType_", ads_mobile_sdk.ad.a$14, "matchedBlacklist_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.j50();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.M1656182982150902219(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.url_ = str;
    }

    public final void a(ads_mobile_sdk.l40 l40Var) {
        this.request_ = l40Var;
        this.bitField0_ |= 4;
    }
}
