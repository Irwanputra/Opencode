package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class m6 {
    public final dev.epro.r0.R6320827706769103704 a;
    public dev.epro.r0.C12642994619513326483 c;
    public ads_mobile_sdk.o6 d;
    public final java.lang.String g;
    public final ads_mobile_sdk.r6 h;
    public final ads_mobile_sdk.yr0 b = new ads_mobile_sdk.yr0();
    public boolean e = false;
    public boolean f = false;

    /* JADX WARN: Multi-variable type inference failed */
    public m6(ads_mobile_sdk.j6 j6Var, dev.epro.r0.R6320827706769103704 r6320827706769103704, java.lang.String str) {
        ads_mobile_sdk.xu1 v16361523658440805731;
        ads_mobile_sdk.r6 r6Var = new ads_mobile_sdk.r6();
        r6Var.a = new dev.epro.r0.C12642994619513326483(null);
        this.h = r6Var;
        this.a = r6320827706769103704;
        this.g = str;
        this.c = new dev.epro.r0.C12642994619513326483(null);
        ads_mobile_sdk.l6 l6Var = (ads_mobile_sdk.l6) r6320827706769103704.g;
        if (l6Var == ads_mobile_sdk.l6.b || l6Var == ads_mobile_sdk.l6.c) {
            android.webkit.WebView webView = (android.webkit.WebView) r6320827706769103704.b;
            v16361523658440805731 = new dev.epro.r0.V16361523658440805731(str);
            if (webView != null && android.os.Build.VERSION.SDK_INT >= 26 && ads_mobile_sdk.lk.a(ads_mobile_sdk.ib1.b.a).a().size() > 0) {
                webView.setWebViewClient(new dev.epro.r0.O14090912391717061492(dev.epro.r0.M13159286552657112763.d(webView)));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            v16361523658440805731.b = new dev.epro.r0.C12642994619513326483(webView);
            this.d = v16361523658440805731;
        } else {
            v16361523658440805731 = new ads_mobile_sdk.xu1(java.util.Collections.unmodifiableMap((java.util.HashMap) r6320827706769103704.d), str);
            this.d = v16361523658440805731;
        }
        v16361523658440805731.c();
        ads_mobile_sdk.n6.c.a.add(this);
        ads_mobile_sdk.o6 o6Var = this.d;
        ads_mobile_sdk.d62 d62Var = ads_mobile_sdk.d62.a;
        android.webkit.WebView webView2 = (android.webkit.WebView) o6Var.b.get();
        java.lang.String str2 = o6Var.a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ads_mobile_sdk.c72.a(jSONObject, "impressionOwner", j6Var.a);
        ads_mobile_sdk.c72.a(jSONObject, "mediaEventsOwner", j6Var.b);
        ads_mobile_sdk.c72.a(jSONObject, "creativeType", j6Var.d);
        ads_mobile_sdk.c72.a(jSONObject, "impressionType", j6Var.e);
        ads_mobile_sdk.c72.a(jSONObject, "isolateVerificationScripts", java.lang.Boolean.valueOf(j6Var.c));
        d62Var.a(webView2, "init", jSONObject, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.f) {
            return;
        }
        ads_mobile_sdk.r6 r6Var = this.h;
        android.view.View view = (android.view.View) ((dev.epro.r0.C12642994619513326483) r6Var.a).get();
        if (view != null) {
            ads_mobile_sdk.p6 p6Var = (ads_mobile_sdk.p6) r6Var.c;
            if (p6Var != null) {
                view.removeOnAttachStateChangeListener(p6Var);
                r6Var.c = null;
            }
            if (((dev.epro.r0.N831923027797546281) r6Var.b) != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener((dev.epro.r0.N831923027797546281) r6Var.b);
                }
                r6Var.b = null;
            }
        }
        ((dev.epro.r0.C12642994619513326483) r6Var.a).clear();
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        ads_mobile_sdk.o6 o6Var = this.d;
        ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "finishSession", o6Var.a);
        ads_mobile_sdk.n6 n6Var = ads_mobile_sdk.n6.c;
        java.util.ArrayList arrayList = n6Var.b;
        boolean z = arrayList.size() > 0;
        n6Var.a.remove(this);
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            ads_mobile_sdk.p72 p72VarA = ads_mobile_sdk.p72.a();
            ads_mobile_sdk.tj3 tj3Var = ads_mobile_sdk.tj3.g;
            tj3Var.getClass();
            android.os.Handler handler = ads_mobile_sdk.tj3.i;
            if (handler != null) {
                handler.removeCallbacks(ads_mobile_sdk.tj3.k);
                ads_mobile_sdk.tj3.i = null;
            }
            tj3Var.a.clear();
            ads_mobile_sdk.tj3.h.post(new ads_mobile_sdk.qj3(tj3Var, (byte) 0));
            ads_mobile_sdk.i6 i6Var = ads_mobile_sdk.i6.d;
            i6Var.a = false;
            i6Var.c = null;
            ads_mobile_sdk.si0 si0Var = p72VarA.d;
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
        this.e = true;
        ads_mobile_sdk.n6 n6Var = ads_mobile_sdk.n6.c;
        boolean z = n6Var.b.size() > 0;
        n6Var.b.add(this);
        if (!z) {
            ads_mobile_sdk.p72 p72VarA = ads_mobile_sdk.p72.a();
            ads_mobile_sdk.i6 i6Var = ads_mobile_sdk.i6.d;
            i6Var.c = p72VarA;
            i6Var.a = true;
            boolean zA = i6Var.a();
            i6Var.b = zA;
            i6Var.a(zA);
            ads_mobile_sdk.tj3.g.getClass();
            if (ads_mobile_sdk.tj3.i == null) {
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                ads_mobile_sdk.tj3.i = handler;
                handler.post(ads_mobile_sdk.tj3.j);
                ads_mobile_sdk.tj3.i.postDelayed(ads_mobile_sdk.tj3.k, 200L);
            }
            ads_mobile_sdk.si0 si0Var = p72VarA.d;
            si0Var.h.submit(new ads_mobile_sdk.qj3(si0Var, (byte) 1));
            si0Var.b.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, si0Var);
        }
        float f = ads_mobile_sdk.p72.a().a;
        ads_mobile_sdk.o6 o6Var = this.d;
        ads_mobile_sdk.d62 d62Var = ads_mobile_sdk.d62.a;
        d62Var.a((android.webkit.WebView) o6Var.b.get(), "setDeviceVolume", java.lang.Float.valueOf(f), o6Var.a);
        ads_mobile_sdk.o6 o6Var2 = this.d;
        java.util.Date date = ads_mobile_sdk.p.f.b;
        java.util.Date date2 = date != null ? (java.util.Date) date.clone() : null;
        o6Var2.getClass();
        if (date2 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ads_mobile_sdk.c72.a(jSONObject, "timestamp", java.lang.Long.valueOf(date2.getTime()));
            d62Var.a((android.webkit.WebView) o6Var2.b.get(), "setLastActivity", jSONObject);
        }
        ads_mobile_sdk.o6 o6Var3 = this.d;
        java.util.ArrayList arrayListA = ads_mobile_sdk.lk.a(ads_mobile_sdk.ib1.b.a).a();
        o6Var3.getClass();
        try {
            org.json.JSONArray jSONArrayA = ads_mobile_sdk.o6.a(arrayListA);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            ads_mobile_sdk.c72.a(jSONObject2, "supportedAttestationMechanisms", jSONArrayA);
            d62Var.a((android.webkit.WebView) o6Var3.b.get(), "setSupportedAttestations", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        this.d.a(this, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.view.View view) {
        if (this.f || ((android.view.View) this.c.get()) == view) {
            return;
        }
        ads_mobile_sdk.r6 r6Var = this.h;
        android.view.View view2 = (android.view.View) ((dev.epro.r0.C12642994619513326483) r6Var.a).get();
        if (view2 != null) {
            ads_mobile_sdk.p6 p6Var = (ads_mobile_sdk.p6) r6Var.c;
            if (p6Var != null) {
                view2.removeOnAttachStateChangeListener(p6Var);
                r6Var.c = null;
            }
            if (((dev.epro.r0.N831923027797546281) r6Var.b) != null) {
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnWindowFocusChangeListener((dev.epro.r0.N831923027797546281) r6Var.b);
                }
                r6Var.b = null;
            }
        }
        ((dev.epro.r0.C12642994619513326483) r6Var.a).clear();
        if (view != null) {
            r6Var.a = new dev.epro.r0.C12642994619513326483(view);
            ads_mobile_sdk.p6 p6Var2 = new ads_mobile_sdk.p6(r6Var);
            r6Var.c = p6Var2;
            view.addOnAttachStateChangeListener(p6Var2);
            if (view.isAttachedToWindow()) {
                r6Var.a(view);
            }
        }
        this.c = new dev.epro.r0.C12642994619513326483(view);
        ads_mobile_sdk.o6 o6Var = this.d;
        o6Var.getClass();
        o6Var.d = java.lang.System.nanoTime();
        o6Var.c = (byte) 1;
        java.util.Collection<ads_mobile_sdk.m6> collectionUnmodifiableCollection = java.util.Collections.unmodifiableCollection(ads_mobile_sdk.n6.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (ads_mobile_sdk.m6 m6Var : collectionUnmodifiableCollection) {
            if (m6Var != this && ((android.view.View) m6Var.c.get()) == view) {
                m6Var.c.clear();
            }
        }
    }
}
