package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class dj1 implements dev.epro.r0.A6650193808056408155 {
    public final ads_mobile_sdk.ii a;
    public final android.webkit.WebView b;
    public final boolean c;
    public final dev.epro.r0.C12642994619513326483 d;
    public final java.util.HashMap e;
    public final ads_mobile_sdk.yr0 f;
    public final ads_mobile_sdk.ii g;

    /* JADX WARN: Multi-variable type inference failed */
    public dj1(ads_mobile_sdk.ii iiVar, android.webkit.WebView webView, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        this.e = map;
        this.f = new ads_mobile_sdk.yr0();
        if (!dev.epro.r0.K5751602218013079365.C.a) {
            dev.epro.r0.S10973172697741180971.m("Method called before OM SDK activation");
            throw null;
        }
        if (webView == null) {
            dev.epro.r0.S10973172697741180971.j("WebView is null");
            throw null;
        }
        this.a = iiVar;
        this.b = webView;
        this.c = z;
        if (z) {
            dev.epro.r0.C12642994619513326483 c12642994619513326483 = this.d;
            if ((c12642994619513326483 != null ? (android.view.View) c12642994619513326483.get() : null) != webView) {
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ads_mobile_sdk.m6) it.next()).a(webView);
                }
                this.d = new dev.epro.r0.C12642994619513326483(webView);
            }
        }
        ads_mobile_sdk.ii iiVar2 = new ads_mobile_sdk.ii(webView, (dev.epro.r0.A6650193808056408155) this);
        this.g = iiVar2;
        iiVar2.m8a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String str) {
        ads_mobile_sdk.d00 d00Var = ads_mobile_sdk.d00.b;
        ads_mobile_sdk.q31 q31Var = ads_mobile_sdk.q31.b;
        ads_mobile_sdk.ha2 ha2Var = ads_mobile_sdk.ha2.c;
        int i = 0;
        ads_mobile_sdk.j6 j6VarA = ads_mobile_sdk.j6.a(d00Var, q31Var, ha2Var, ha2Var, false);
        android.webkit.WebView webView = this.b;
        boolean z = this.c;
        ads_mobile_sdk.ii iiVar = this.a;
        ads_mobile_sdk.m6 m6Var = new ads_mobile_sdk.m6(j6VarA, z ? dev.epro.r0.R6320827706769103704.a(iiVar, webView, (java.lang.String) null, (java.lang.String) null) : dev.epro.r0.R6320827706769103704.b(iiVar, webView, (java.lang.String) null, (java.lang.String) null), str);
        this.e.put(str, m6Var);
        dev.epro.r0.C12642994619513326483 c12642994619513326483 = this.d;
        m6Var.a(c12642994619513326483 != null ? (android.view.View) c12642994619513326483.get() : null);
        java.util.ArrayList arrayList = this.f.a;
        int size = arrayList.size();
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ads_mobile_sdk.wr0 wr0Var = (ads_mobile_sdk.wr0) obj;
            android.view.View view = (android.view.View) wr0Var.a.get();
            ads_mobile_sdk.xr0 xr0Var = wr0Var.c;
            if (!m6Var.f) {
                m6Var.b.a(view, xr0Var);
            }
        }
        m6Var.b();
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final void b() {
        throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        ads_mobile_sdk.m6 m6Var;
        java.util.HashMap map = this.e;
        try {
            java.lang.String string = jSONObject.getString("adSessionId");
            if (str.equals("startSession")) {
                a(string);
            } else {
                if (!str.equals("finishSession") || (m6Var = (ads_mobile_sdk.m6) map.get(string)) == null) {
                    return;
                }
                m6Var.a();
                map.remove(string);
            }
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final java.lang.String a() {
        return "omidJsSessionService";
    }
}
