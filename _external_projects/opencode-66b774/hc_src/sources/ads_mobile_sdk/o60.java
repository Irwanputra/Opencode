package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class o60 extends cu0 {
    private static final o60 DEFAULT_INSTANCE;
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

    /* renamed from: o, reason: collision with root package name */
    public static final int f83o = 13;
    public static final int p = 14;
    private int bitField0_;
    private O6641393078261985068 ipAddresses_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private String referrerMainFrameUrl_;
    private String referrerUrl_;
    private O6641393078261985068 serverRedirectChain_;
    private String url_ = "";
    private String mainFrameUrl_ = "";
    private int type_ = 4;

    static {
        o60 o60Var = new o60();
        DEFAULT_INSTANCE = o60Var;
        cu0.a(o60.class, o60Var);
    }

    public o60() {
        in2 in2Var = in2.e;
        this.ipAddresses_ = in2Var;
        this.referrerUrl_ = "";
        this.referrerMainFrameUrl_ = "";
        this.serverRedirectChain_ = in2Var;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"bitField0_", "url_", "type_", ad.a$23, "ipAddresses_", "referrerUrl_", "referrerMainFrameUrl_", "isRetargeting_", "navigationTimeMsec_", "serverRedirectChain_", l60.class, "mainFrameUrl_", "navigationInitiation_", ad.a$17, "maybeLaunchedByExternalApplication_", "isSubframeUrlRemoved_", "isSubframeReferrerUrlRemoved_", "isUrlRemovedByPolicy_"});
        }
        if (e2 == 3) {
            return new o60();
        }
        if (e2 != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
