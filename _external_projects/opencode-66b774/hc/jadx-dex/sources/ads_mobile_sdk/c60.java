package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c60 extends ads_mobile_sdk.cu0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 29;
    private static final ads_mobile_sdk.c60 DEFAULT_INSTANCE;
    public static final int E = 30;
    public static final int F = 31;
    public static final int G = 32;
    public static final int H = 33;
    public static final int I = 34;
    public static final int J = 35;
    public static final int K = 36;
    public static final int L = 37;
    public static final int c = 10;
    public static final int d = 11;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 12;
    public static final int i = 4;
    public static final int j = 16;
    public static final int k = 13;
    public static final int l = 14;
    public static final int m = 5;
    public static final int n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f15o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 15;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    public static final int v = 20;
    public static final int w = 21;
    public static final int x = 22;
    public static final int y = 23;
    public static final int z = 24;
    private int bitField0_;
    private java.lang.String clickUrl_;
    private dev.epro.r0.O6641393078261985068 clientAsn_;
    private java.lang.String clientCountry_;
    private ads_mobile_sdk.l50 clientProperties_;
    private boolean complete_;
    private ads_mobile_sdk.v30 creativeProperties_;
    private boolean didProceed_;
    private dev.epro.r0.O6641393078261985068 disallowedPermissions_;
    private dev.epro.r0.O6641393078261985068 dom_;
    private ads_mobile_sdk.z30 downloadItemInfo_;
    private int downloadVerdict_;
    private dev.epro.r0.O6641393078261985068 downloadWarningActions_;
    private dev.epro.r0.O6641393078261985068 interstitialInteractions_;
    private java.lang.String locale_;
    private ads_mobile_sdk.v40 permissionPromptInfo_;
    private dev.epro.r0.O6641393078261985068 phishySiteInteractions_;
    private ads_mobile_sdk.q30 population_;
    private dev.epro.r0.O6641393078261985068 referrerChain_;
    private dev.epro.r0.O6641393078261985068 rejectedPermissions_;
    private ads_mobile_sdk.d50 renderedAd_;
    private boolean repeatVisit_;
    private dev.epro.r0.O6641393078261985068 resources_;
    private java.lang.String safetyNetId_;
    private dev.epro.r0.O6641393078261985068 serviceWorkerBehaviors_;
    private boolean showDownloadInFolder_;
    private ads_mobile_sdk.sq token_;
    private int type_;
    private ads_mobile_sdk.t50 urlRealTimeAndHashRealTimeDiscrepancyInfo_;
    private int urlRequestDestination_;
    private java.lang.String userAgent_;
    private ads_mobile_sdk.x50 userInfo_;
    private ads_mobile_sdk.b60 warningShownInfo_;
    private long warningShownTimestampMsec_;
    private byte memoizedIsInitialized = 2;
    private java.lang.String url_ = "";
    private java.lang.String pageUrl_ = "";
    private java.lang.String referrerUrl_ = "";

    static {
        ads_mobile_sdk.c60 c60Var = new ads_mobile_sdk.c60();
        DEFAULT_INSTANCE = c60Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.c60.class, c60Var);
    }

    public c60() {
        ads_mobile_sdk.in2 in2Var = ads_mobile_sdk.in2.e;
        this.resources_ = in2Var;
        this.dom_ = in2Var;
        this.clickUrl_ = "";
        this.clientAsn_ = in2Var;
        this.clientCountry_ = "";
        this.token_ = ads_mobile_sdk.sq.b;
        this.userAgent_ = "";
        this.disallowedPermissions_ = in2Var;
        this.rejectedPermissions_ = in2Var;
        this.referrerChain_ = in2Var;
        this.safetyNetId_ = "";
        this.downloadWarningActions_ = in2Var;
        this.interstitialInteractions_ = in2Var;
        this.phishySiteInteractions_ = in2Var;
        this.locale_ = "";
        this.serviceWorkerBehaviors_ = in2Var;
    }

    public static dev.epro.r0.F13994492413374957728 o() {
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
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new java.lang.Object[]{"bitField0_", "url_", "pageUrl_", "referrerUrl_", "resources_", ads_mobile_sdk.j50.class, "complete_", "clientAsn_", "clientCountry_", "didProceed_", "repeatVisit_", "type_", ads_mobile_sdk.ad.a$8, "downloadVerdict_", ads_mobile_sdk.tt.a$1, "creativeProperties_", "clickUrl_", "renderedAd_", "token_", "dom_", ads_mobile_sdk.g60.class, "clientProperties_", "showDownloadInFolder_", "userAgent_", "disallowedPermissions_", "rejectedPermissions_", "userInfo_", "referrerChain_", ads_mobile_sdk.o60.class, "downloadItemInfo_", "safetyNetId_", "population_", "downloadWarningActions_", ads_mobile_sdk.f40.class, "urlRequestDestination_", ads_mobile_sdk.tt.a$4, "interstitialInteractions_", ads_mobile_sdk.t40.class, "phishySiteInteractions_", ads_mobile_sdk.z40.class, "warningShownTimestampMsec_", "warningShownInfo_", "permissionPromptInfo_", "locale_", "urlRealTimeAndHashRealTimeDiscrepancyInfo_", "serviceWorkerBehaviors_", ads_mobile_sdk.p50.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.c60();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.F13994492413374957728(DEFAULT_INSTANCE);
    }

    public final void b(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.clickUrl_ = str;
    }

    public final void c(java.lang.String str) {
        this.bitField0_ |= 8;
        this.pageUrl_ = str;
    }

    public final void d(java.lang.String str) {
        this.bitField0_ |= 4;
        this.url_ = str;
    }

    public final void a(ads_mobile_sdk.j50 j50Var) {
        dev.epro.r0.O6641393078261985068 o6641393078261985068B = this.resources_;
        if (!((ads_mobile_sdk.j) o6641393078261985068B).a) {
            o6641393078261985068B = dev.epro.r0.T8598786036980488824.b(o6641393078261985068B);
            this.resources_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(j50Var);
    }

    public final void a(ads_mobile_sdk.v30 v30Var) {
        this.creativeProperties_ = v30Var;
        this.bitField0_ |= 32;
    }

    public final void a(ads_mobile_sdk.l50 l50Var) {
        this.clientProperties_ = l50Var;
        this.bitField0_ |= 8192;
    }
}
