package ads_mobile_sdk;

import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import dev.epro.r0.C12642994619513326483;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.Z3383101362411723454;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xu1 extends o6 {
    public WebView e;
    public Long f;
    public final Map g;

    public xu1(Map map, String str) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // ads_mobile_sdk.o6
    public final void a(m6 m6Var, R6320827706769103704 r6320827706769103704) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) r6320827706769103704.d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            a(m6Var, r6320827706769103704, jSONObject);
        } else {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            Z3383101362411723454.s();
        }
    }

    @Override // ads_mobile_sdk.o6
    public final void b() {
        this.b.clear();
        new Handler().postDelayed(new qj3(this), Math.max(4000 - (this.f == null ? 4000L : (System.nanoTime() - this.f.longValue()) / 1000000), 2000L));
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    @Override // ads_mobile_sdk.o6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            ads_mobile_sdk.ib1 r0 = ads_mobile_sdk.ib1.b
            android.content.Context r1 = r0.a
            android.webkit.WebView r2 = new android.webkit.WebView
            r2.<init>(r1)
            r6.e = r2
            android.webkit.WebSettings r2 = r2.getSettings()
            r3 = 1
            r2.setJavaScriptEnabled(r3)
            android.webkit.WebView r2 = r6.e
            android.webkit.WebSettings r2 = r2.getSettings()
            r4 = 0
            r2.setAllowContentAccess(r4)
            android.webkit.WebView r2 = r6.e
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setAllowFileAccess(r4)
            android.webkit.WebView r2 = r6.e
            java.lang.String r5 = "WEB_MESSAGE_LISTENER"
            boolean r5 = dev.epro.r0.Q6344330807969154194.b(r5)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L50
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L50
            ads_mobile_sdk.lk r0 = ads_mobile_sdk.lk.a(r0)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r0 = r0.a()     // Catch: java.lang.Throwable -> L50
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L50
            if (r0 <= 0) goto L50
            dev.epro.r0.O12545633033254628644 r0 = new dev.epro.r0.O12545633033254628644     // Catch: java.lang.Throwable -> L50
            r5 = 11
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L50
            ads_mobile_sdk.ii r5 = new ads_mobile_sdk.ii     // Catch: java.lang.Throwable -> L50
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L50
            r5.m5a()     // Catch: java.lang.Throwable -> L50
            goto L64
        L50:
            ads_mobile_sdk.lk r0 = ads_mobile_sdk.lk.a(r1)
            java.util.ArrayList r0 = r0.a()
            int r0 = r0.size()
            if (r0 <= 0) goto L64
            ads_mobile_sdk.uu1 r0 = new ads_mobile_sdk.uu1
            r0.<init>(r6, r4)
            goto L69
        L64:
            ads_mobile_sdk.uu1 r0 = new ads_mobile_sdk.uu1
            r0.<init>(r6, r3)
        L69:
            android.webkit.WebView r1 = r6.e
            r1.setWebViewClient(r0)
            android.webkit.WebView r0 = r6.e
            dev.epro.r0.C12642994619513326483 r1 = new dev.epro.r0.C12642994619513326483
            r1.<init>(r0)
            r6.b = r1
            android.webkit.WebView r0 = r6.e
            r1 = 0
            ads_mobile_sdk.d62.a(r0, r1)
            java.util.Map r0 = r6.g
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L98
            long r0 = java.lang.System.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f = r0
            return
        L98:
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.get(r6)
            r6.getClass()
            dev.epro.r0.Z3383101362411723454.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xu1.c():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (((WebView) this.b.get()) == webView) {
            this.b = new C12642994619513326483(null);
        }
        if (webView != null) {
            webView.destroy();
        }
    }
}
