package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import dev.epro.r0.A6650193808056408155;
import dev.epro.r0.C12642994619513326483;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.S10973172697741180971;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 implements A6650193808056408155 {
    public final ii a;
    public final WebView b;
    public final boolean c;
    public final C12642994619513326483 d;
    public final HashMap e;
    public final yr0 f;
    public final ii g;

    /* JADX WARN: Multi-variable type inference failed */
    public dj1(ii iiVar, WebView webView, boolean z) {
        HashMap map = new HashMap();
        this.e = map;
        this.f = new yr0();
        if (!K5751602218013079365.C.a) {
            S10973172697741180971.m("Method called before OM SDK activation");
            throw null;
        }
        if (webView == null) {
            S10973172697741180971.j("WebView is null");
            throw null;
        }
        this.a = iiVar;
        this.b = webView;
        this.c = z;
        if (z) {
            C12642994619513326483 c12642994619513326483 = this.d;
            if ((c12642994619513326483 != null ? (View) c12642994619513326483.get() : null) != webView) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((m6) it.next()).a(webView);
                }
                this.d = new C12642994619513326483(webView);
            }
        }
        ii iiVar2 = new ii(webView, (A6650193808056408155) this);
        this.g = iiVar2;
        iiVar2.m5a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        d00 d00Var = d00.b;
        q31 q31Var = q31.b;
        ha2 ha2Var = ha2.c;
        int i = 0;
        j6 j6VarA = j6.a(d00Var, q31Var, ha2Var, ha2Var, false);
        WebView webView = this.b;
        boolean z = this.c;
        ii iiVar = this.a;
        m6 m6Var = new m6(j6VarA, z ? R6320827706769103704.a(iiVar, webView, null, null) : R6320827706769103704.b(iiVar, webView, null, null), str);
        this.e.put(str, m6Var);
        C12642994619513326483 c12642994619513326483 = this.d;
        m6Var.a(c12642994619513326483 != null ? (View) c12642994619513326483.get() : null);
        ArrayList arrayList = this.f.a;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wr0 wr0Var = (wr0) obj;
            View view = (View) wr0Var.a.get();
            xr0 xr0Var = wr0Var.c;
            if (!m6Var.f) {
                m6Var.b.a(view, xr0Var);
            }
        }
        m6Var.b();
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final void b() {
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final void a(String str, JSONObject jSONObject) {
        m6 m6Var;
        HashMap map = this.e;
        try {
            String string = jSONObject.getString("adSessionId");
            if (str.equals("startSession")) {
                a(string);
            } else {
                if (!str.equals("finishSession") || (m6Var = (m6) map.get(string)) == null) {
                    return;
                }
                m6Var.a();
                map.remove(string);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // dev.epro.r0.A6650193808056408155
    public final String a() {
        return "omidJsSessionService";
    }
}
