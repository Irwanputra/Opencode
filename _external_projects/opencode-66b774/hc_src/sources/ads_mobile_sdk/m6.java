package ads_mobile_sdk;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import dev.epro.r0.C12642994619513326483;
import dev.epro.r0.N831923027797546281;
import dev.epro.r0.O14090912391717061492;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.V16361523658440805731;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class m6 {
    public final R6320827706769103704 a;
    public C12642994619513326483 c;
    public o6 d;
    public final String g;
    public final r6 h;
    public final yr0 b = new yr0();
    public boolean e = false;
    public boolean f = false;

    /* JADX WARN: Multi-variable type inference failed */
    public m6(j6 j6Var, R6320827706769103704 r6320827706769103704, String str) {
        o6 v16361523658440805731;
        WebViewClient webViewClient;
        r6 r6Var = new r6();
        r6Var.a = new C12642994619513326483(null);
        this.h = r6Var;
        this.a = r6320827706769103704;
        this.g = str;
        this.c = new C12642994619513326483(null);
        l6 l6Var = (l6) r6320827706769103704.g;
        if (l6Var == l6.b || l6Var == l6.c) {
            WebView webView = (WebView) r6320827706769103704.b;
            v16361523658440805731 = new V16361523658440805731(str);
            if (webView != null && Build.VERSION.SDK_INT >= 26 && lk.a(ib1.b.a).a().size() > 0) {
                webViewClient = webView.getWebViewClient();
                webView.setWebViewClient(new O14090912391717061492(webViewClient));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            v16361523658440805731.b = new C12642994619513326483(webView);
            this.d = v16361523658440805731;
        } else {
            v16361523658440805731 = new xu1(Collections.unmodifiableMap((HashMap) r6320827706769103704.d), str);
            this.d = v16361523658440805731;
        }
        v16361523658440805731.c();
        n6.c.a.add(this);
        o6 o6Var = this.d;
        d62 d62Var = d62.a;
        WebView webView2 = (WebView) o6Var.b.get();
        String str2 = o6Var.a;
        JSONObject jSONObject = new JSONObject();
        c72.a(jSONObject, "impressionOwner", j6Var.a);
        c72.a(jSONObject, "mediaEventsOwner", j6Var.b);
        c72.a(jSONObject, "creativeType", j6Var.d);
        c72.a(jSONObject, "impressionType", j6Var.e);
        c72.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(j6Var.c));
        d62Var.a(webView2, "init", jSONObject, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.f) {
            return;
        }
        r6 r6Var = this.h;
        View view = (View) ((C12642994619513326483) r6Var.a).get();
        if (view != null) {
            p6 p6Var = (p6) r6Var.c;
            if (p6Var != null) {
                view.removeOnAttachStateChangeListener(p6Var);
                r6Var.c = null;
            }
            if (((N831923027797546281) r6Var.b) != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener((N831923027797546281) r6Var.b);
                }
                r6Var.b = null;
            }
        }
        ((C12642994619513326483) r6Var.a).clear();
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        o6 o6Var = this.d;
        d62.a.a((WebView) o6Var.b.get(), "finishSession", o6Var.a);
        n6 n6Var = n6.c;
        ArrayList arrayList = n6Var.b;
        byte b = 0;
        boolean z = arrayList.size() > 0;
        n6Var.a.remove(this);
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            p72 a = p72.a();
            tj3 tj3Var = tj3.g;
            tj3Var.getClass();
            Handler handler = tj3.i;
            if (handler != null) {
                handler.removeCallbacks(tj3.k);
                tj3.i = null;
            }
            tj3Var.a.clear();
            tj3.h.post(new qj3(tj3Var, b));
            i6 i6Var = i6.d;
            i6Var.a = false;
            i6Var.c = null;
            si0 si0Var = a.d;
            si0Var.b.getContentResolver().unregisterContentObserver(si0Var);
        }
        this.d.b();
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.e || this.d == null) {
            return;
        }
        byte b = 1;
        this.e = true;
        n6 n6Var = n6.c;
        boolean z = n6Var.b.size() > 0;
        n6Var.b.add(this);
        if (!z) {
            p72 a = p72.a();
            i6 i6Var = i6.d;
            i6Var.c = a;
            i6Var.a = true;
            boolean a2 = i6Var.a();
            i6Var.b = a2;
            i6Var.a(a2);
            tj3.g.getClass();
            if (tj3.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                tj3.i = handler;
                handler.post(tj3.j);
                tj3.i.postDelayed(tj3.k, 200L);
            }
            si0 si0Var = a.d;
            si0Var.h.submit(new qj3(si0Var, b));
            si0Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, si0Var);
        }
        float f = p72.a().a;
        o6 o6Var = this.d;
        d62 d62Var = d62.a;
        d62Var.a((WebView) o6Var.b.get(), "setDeviceVolume", Float.valueOf(f), o6Var.a);
        o6 o6Var2 = this.d;
        Date date = p.f.b;
        Date date2 = date != null ? (Date) date.clone() : null;
        o6Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            c72.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            d62Var.a((WebView) o6Var2.b.get(), "setLastActivity", jSONObject);
        }
        o6 o6Var3 = this.d;
        ArrayList a3 = lk.a(ib1.b.a).a();
        o6Var3.getClass();
        try {
            JSONArray a4 = o6.a(a3);
            JSONObject jSONObject2 = new JSONObject();
            c72.a(jSONObject2, "supportedAttestationMechanisms", a4);
            d62Var.a((WebView) o6Var3.b.get(), "setSupportedAttestations", jSONObject2);
        } catch (JSONException unused) {
        }
        this.d.a(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        r6 r6Var = this.h;
        View view2 = (View) ((C12642994619513326483) r6Var.a).get();
        if (view2 != null) {
            p6 p6Var = (p6) r6Var.c;
            if (p6Var != null) {
                view2.removeOnAttachStateChangeListener(p6Var);
                r6Var.c = null;
            }
            if (((N831923027797546281) r6Var.b) != null) {
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnWindowFocusChangeListener((N831923027797546281) r6Var.b);
                }
                r6Var.b = null;
            }
        }
        ((C12642994619513326483) r6Var.a).clear();
        if (view != null) {
            r6Var.a = new C12642994619513326483(view);
            p6 p6Var2 = new p6(r6Var);
            r6Var.c = p6Var2;
            view.addOnAttachStateChangeListener(p6Var2);
            if (view.isAttachedToWindow()) {
                r6Var.a(view);
            }
        }
        this.c = new C12642994619513326483(view);
        o6 o6Var = this.d;
        o6Var.getClass();
        o6Var.d = System.nanoTime();
        o6Var.c = (byte) 1;
        Collection<m6> unmodifiableCollection = Collections.unmodifiableCollection(n6.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (m6 m6Var : unmodifiableCollection) {
            if (m6Var != this && ((View) m6Var.c.get()) == view) {
                m6Var.c.clear();
            }
        }
    }
}
