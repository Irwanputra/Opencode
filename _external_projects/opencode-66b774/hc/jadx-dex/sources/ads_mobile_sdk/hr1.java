package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hr1 {
    public static final long d;
    public static final long e;
    public final ads_mobile_sdk.jr0 a;
    public final dev.epro.r0.K12714355155332733186 b;
    public final dev.epro.r0.O12043144740933444288 c;

    static {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.e;
        d = dev.epro.r0.M9216324016624295870.Z(60, n13798149404328803870);
        e = dev.epro.r0.E17093345031926825464.k(dev.epro.r0.M9216324016624295870.Z(1, dev.epro.r0.N13798149404328803870.g), n13798149404328803870);
    }

    public hr1(ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.K12714355155332733186 k12714355155332733186, dev.epro.r0.O12043144740933444288 o12043144740933444288) {
        jr0Var.getClass();
        k12714355155332733186.getClass();
        o12043144740933444288.getClass();
        this.a = jr0Var;
        this.b = k12714355155332733186;
        this.c = o12043144740933444288;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r14 == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r12, android.webkit.WebResourceRequest r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hr1.a(ads_mobile_sdk.tx0, android.webkit.WebResourceRequest, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.String a(android.net.Uri uri, ads_mobile_sdk.tx0 tx0Var) {
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$6;
        java.lang.String path = uri.getPath();
        if (path == null || !dev.epro.r0.Z13168519540281190457.A(new java.io.File(path).getName(), "mraid.js", true)) {
            return null;
        }
        boolean z = tx0Var.n.get();
        ads_mobile_sdk.jr0 jr0Var = this.a;
        if (z) {
            jr0Var.getClass();
            return (java.lang.String) jr0Var.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", aoVar);
        }
        if (tx0Var.e().a == 4) {
            jr0Var.getClass();
            return (java.lang.String) jr0Var.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", aoVar);
        }
        jr0Var.getClass();
        return (java.lang.String) jr0Var.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", aoVar);
    }
}
