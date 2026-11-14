package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p implements dev.epro.r0.Q16850748603044648552 {
    public static final ads_mobile_sdk.p f = new ads_mobile_sdk.p(new ads_mobile_sdk.zj());
    public java.util.Date b;
    public boolean c;
    public final ads_mobile_sdk.zj d;
    public boolean e;

    public p(ads_mobile_sdk.zj zjVar) {
        this.d = zjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        if (!this.e && z) {
            java.util.Date date = new java.util.Date();
            java.util.Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    java.util.Iterator it = java.util.Collections.unmodifiableCollection(ads_mobile_sdk.n6.c.b).iterator();
                    while (it.hasNext()) {
                        ads_mobile_sdk.o6 o6Var = ((ads_mobile_sdk.m6) it.next()).d;
                        java.util.Date date3 = this.b;
                        java.util.Date date4 = date3 != null ? (java.util.Date) date3.clone() : null;
                        o6Var.getClass();
                        if (date4 != null) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            ads_mobile_sdk.c72.a(jSONObject, "timestamp", java.lang.Long.valueOf(date4.getTime()));
                            ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.e = z;
    }
}
