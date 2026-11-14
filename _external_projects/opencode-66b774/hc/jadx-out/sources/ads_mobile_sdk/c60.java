package ads_mobile_sdk;

import dev.epro.r0.F13994492413374957728;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends cu0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 29;
    private static final c60 DEFAULT_INSTANCE;
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
    private String clickUrl_;
    private O6641393078261985068 clientAsn_;
    private String clientCountry_;
    private l50 clientProperties_;
    private boolean complete_;
    private v30 creativeProperties_;
    private boolean didProceed_;
    private O6641393078261985068 disallowedPermissions_;
    private O6641393078261985068 dom_;
    private z30 downloadItemInfo_;
    private int downloadVerdict_;
    private O6641393078261985068 downloadWarningActions_;
    private O6641393078261985068 interstitialInteractions_;
    private String locale_;
    private v40 permissionPromptInfo_;
    private O6641393078261985068 phishySiteInteractions_;
    private q30 population_;
    private O6641393078261985068 referrerChain_;
    private O6641393078261985068 rejectedPermissions_;
    private d50 renderedAd_;
    private boolean repeatVisit_;
    private O6641393078261985068 resources_;
    private String safetyNetId_;
    private O6641393078261985068 serviceWorkerBehaviors_;
    private boolean showDownloadInFolder_;
    private sq token_;
    private int type_;
    private t50 urlRealTimeAndHashRealTimeDiscrepancyInfo_;
    private int urlRequestDestination_;
    private String userAgent_;
    private x50 userInfo_;
    private b60 warningShownInfo_;
    private long warningShownTimestampMsec_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private String pageUrl_ = "";
    private String referrerUrl_ = "";

    static {
        c60 c60Var = new c60();
        DEFAULT_INSTANCE = c60Var;
        cu0.a(c60.class, c60Var);
    }

    public c60() {
        in2 in2Var = in2.e;
        this.resources_ = in2Var;
        this.dom_ = in2Var;
        this.clickUrl_ = "";
        this.clientAsn_ = in2Var;
        this.clientCountry_ = "";
        this.token_ = sq.b;
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

    public static F13994492413374957728 o() {
        return (F13994492413374957728) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 0) {
            return Byte.valueOf(this.memoizedIsInitialized);
        }
        if (iE == 1) {
            this.memoizedIsInitialized = (byte) (cu0Var == null ? 0 : 1);
            return null;
        }
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"bitField0_", "url_", "pageUrl_", "referrerUrl_", "resources_", j50.class, "complete_", "clientAsn_", "clientCountry_", "didProceed_", "repeatVisit_", "type_", ad.a$8, "downloadVerdict_", tt.a$1, "creativeProperties_", "clickUrl_", "renderedAd_", "token_", "dom_", g60.class, "clientProperties_", "showDownloadInFolder_", "userAgent_", "disallowedPermissions_", "rejectedPermissions_", "userInfo_", "referrerChain_", o60.class, "downloadItemInfo_", "safetyNetId_", "population_", "downloadWarningActions_", f40.class, "urlRequestDestination_", tt.a$4, "interstitialInteractions_", t40.class, "phishySiteInteractions_", z40.class, "warningShownTimestampMsec_", "warningShownInfo_", "permissionPromptInfo_", "locale_", "urlRealTimeAndHashRealTimeDiscrepancyInfo_", "serviceWorkerBehaviors_", p50.class});
        }
        if (iE == 3) {
            return new c60();
        }
        if (iE != 4) {
            return null;
        }
        return new F13994492413374957728(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.clickUrl_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 8;
        this.pageUrl_ = str;
    }

    public final void d(String str) {
        this.bitField0_ |= 4;
        this.url_ = str;
    }

    public final void a(j50 j50Var) {
        O6641393078261985068 o6641393078261985068B = this.resources_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.resources_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(j50Var);
    }

    public final void a(v30 v30Var) {
        this.creativeProperties_ = v30Var;
        this.bitField0_ |= 32;
    }

    public final void a(l50 l50Var) {
        this.clientProperties_ = l50Var;
        this.bitField0_ |= 8192;
    }
}
