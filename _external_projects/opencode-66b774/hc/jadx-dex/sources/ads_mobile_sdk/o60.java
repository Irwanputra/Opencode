package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class o60 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.o60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 9;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f83o = 13;
    public static final int p = 14;
    private int bitField0_;
    private dev.epro.r0.O6641393078261985068 ipAddresses_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private java.lang.String referrerMainFrameUrl_;
    private java.lang.String referrerUrl_;
    private dev.epro.r0.O6641393078261985068 serverRedirectChain_;
    private java.lang.String url_ = "";
    private java.lang.String mainFrameUrl_ = "";
    private int type_ = 4;

    static {
        ads_mobile_sdk.o60 o60Var = new ads_mobile_sdk.o60();
        DEFAULT_INSTANCE = o60Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.o60.class, o60Var);
    }

    public o60() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.ipAddresses_ = in2Var;
        this.referrerUrl_ = "";
        this.referrerMainFrameUrl_ = "";
        this.serverRedirectChain_ = in2Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i2, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new java.lang.Object[]{"bitField0_", "url_", "type_", ads_mobile_sdk.ad.a$23, "ipAddresses_", "referrerUrl_", "referrerMainFrameUrl_", "isRetargeting_", "navigationTimeMsec_", "serverRedirectChain_", ads_mobile_sdk.l60.class, "mainFrameUrl_", "navigationInitiation_", ads_mobile_sdk.ad.a$17, "maybeLaunchedByExternalApplication_", "isSubframeUrlRemoved_", "isSubframeReferrerUrlRemoved_", "isUrlRemovedByPolicy_"});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.o60();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
