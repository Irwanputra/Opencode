package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.Z13168519540281190457;
import java.io.File;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hr1 {
    public static final long d;
    public static final long e;
    public final jr0 a;
    public final K12714355155332733186 b;
    public final O12043144740933444288 c;

    static {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.SECONDS;
        d = M9216324016624295870.Z(60, n13798149404328803870);
        e = E17093345031926825464.k(M9216324016624295870.Z(1, N13798149404328803870.HOURS), n13798149404328803870);
    }

    public hr1(jr0 jr0Var, K12714355155332733186 k12714355155332733186, O12043144740933444288 o12043144740933444288) {
        jr0Var.getClass();
        k12714355155332733186.getClass();
        o12043144740933444288.getClass();
        this.a = jr0Var;
        this.b = k12714355155332733186;
        this.c = o12043144740933444288;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|(2:14|15)|18)(2:19|20))(2:21|22))(4:26|27|(2:33|(2:35|25)(1:36))|18)|23))|38|6|7|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r14 != r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r12, android.webkit.WebResourceRequest r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            r11 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "max-stale="
            boolean r2 = r14 instanceof ads_mobile_sdk.fr1
            if (r2 == 0) goto L17
            r2 = r14
            ads_mobile_sdk.fr1 r2 = (ads_mobile_sdk.fr1) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f = r3
            goto L1c
        L17:
            ads_mobile_sdk.fr1 r2 = new ads_mobile_sdk.fr1
            r2.<init>(r11, r14)
        L1c:
            java.lang.Object r14 = r2.d
            int r3 = r2.f
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r14)     // Catch: java.lang.Exception -> Lc9
            goto Laa
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r6
        L36:
            java.lang.String r11 = r2.c
            ads_mobile_sdk.x11 r12 = r2.b
            ads_mobile_sdk.hr1 r13 = r2.a
            dev.epro.r0.E17665849472693074628.k(r14)     // Catch: java.lang.Exception -> Lc9
            goto L85
        L40:
            dev.epro.r0.E17665849472693074628.k(r14)
            android.net.Uri r13 = r13.getUrl()     // Catch: java.lang.Exception -> Lc9
            if (r13 != 0) goto L4b
            goto Lc9
        L4b:
            java.lang.String r12 = r11.a(r13, r12)     // Catch: java.lang.Exception -> Lc9
            if (r12 != 0) goto L53
            goto Lc9
        L53:
            ads_mobile_sdk.x11 r13 = new ads_mobile_sdk.x11     // Catch: java.lang.Exception -> Lc9
            r13.<init>()     // Catch: java.lang.Exception -> Lc9
            r13.b(r12)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r12 = "Cache-Control"
            long r8 = ads_mobile_sdk.hr1.e     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r14.<init>(r1)     // Catch: java.lang.Exception -> Lc9
            r14.append(r8)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> Lc9
            r13.a(r12, r14)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r12 = "User-Agent"
            dev.epro.r0.K12714355155332733186 r14 = r11.b     // Catch: java.lang.Exception -> Lc9
            r2.a = r11     // Catch: java.lang.Exception -> Lc9
            r2.b = r13     // Catch: java.lang.Exception -> Lc9
            r2.c = r12     // Catch: java.lang.Exception -> Lc9
            r2.f = r5     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r14 = r14.a(r2)     // Catch: java.lang.Exception -> Lc9
            if (r14 != r7) goto L81
            goto La9
        L81:
            r10 = r13
            r13 = r11
            r11 = r12
            r12 = r10
        L85:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> Lc9
            r12.a(r11, r14)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r11 = "GET"
            r12.a(r11, r6)     // Catch: java.lang.Exception -> Lc9
            ads_mobile_sdk.y11 r11 = r12.a()     // Catch: java.lang.Exception -> Lc9
            long r8 = ads_mobile_sdk.hr1.d     // Catch: java.lang.Exception -> Lc9
            ads_mobile_sdk.fb r12 = new ads_mobile_sdk.fb     // Catch: java.lang.Exception -> Lc9
            r14 = 7
            r12.<init>(r13, r11, r6, r14)     // Catch: java.lang.Exception -> Lc9
            r2.a = r6     // Catch: java.lang.Exception -> Lc9
            r2.b = r6     // Catch: java.lang.Exception -> Lc9
            r2.c = r6     // Catch: java.lang.Exception -> Lc9
            r2.f = r4     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r14 = dev.epro.r0.V16504496955554646429.r(r8, r12, r2)     // Catch: java.lang.Exception -> Lc9
            if (r14 != r7) goto Laa
        La9:
            return r7
        Laa:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> Lc9
            if (r14 == 0) goto Lc9
            android.webkit.WebResourceResponse r11 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> Lc9
            java.lang.String r12 = "application/javascript"
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> Lc9
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> Lc9
            r1.getClass()     // Catch: java.lang.Exception -> Lc9
            byte[] r14 = r14.getBytes(r1)     // Catch: java.lang.Exception -> Lc9
            r14.getClass()     // Catch: java.lang.Exception -> Lc9
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lc9
            r11.<init>(r12, r0, r13)     // Catch: java.lang.Exception -> Lc9
            return r11
        Lc9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hr1.a(ads_mobile_sdk.tx0, android.webkit.WebResourceRequest, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final String a(Uri uri, tx0 tx0Var) {
        ao aoVar = ao.a$6;
        String path = uri.getPath();
        if (path == null || !Z13168519540281190457.A(new File(path).getName(), "mraid.js", true)) {
            return null;
        }
        boolean z = tx0Var.n.get();
        jr0 jr0Var = this.a;
        if (z) {
            jr0Var.getClass();
            return (String) jr0Var.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", aoVar);
        }
        if (tx0Var.e().a == 4) {
            jr0Var.getClass();
            return (String) jr0Var.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", aoVar);
        }
        jr0Var.getClass();
        return (String) jr0Var.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", aoVar);
    }
}
