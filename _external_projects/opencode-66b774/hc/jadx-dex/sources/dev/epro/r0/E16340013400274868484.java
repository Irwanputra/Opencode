package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E16340013400274868484 extends ads_mobile_sdk.a62 {
    public final java.util.HashSet c;
    public final org.json.JSONObject d;
    public final long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E16340013400274868484(ads_mobile_sdk.ii iiVar, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j, byte b) {
        super(iiVar);
        this.f = b;
        this.c = new java.util.HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] objArr) {
        byte b = this.f;
        org.json.JSONObject jSONObject = this.d;
        switch (b) {
            case 0:
                break;
            default:
                ads_mobile_sdk.ii iiVar = this.b;
                if (!ads_mobile_sdk.c72.c(jSONObject, (org.json.JSONObject) iiVar.a)) {
                    iiVar.a = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.a62
    public final void onPostExecute(java.lang.String str) {
        ads_mobile_sdk.n6 n6Var;
        byte b = this.f;
        long j = this.e;
        java.util.HashSet hashSet = this.c;
        switch (b) {
            case 0:
                ads_mobile_sdk.n6 n6Var2 = ads_mobile_sdk.n6.c;
                if (n6Var2 != null) {
                    for (ads_mobile_sdk.m6 m6Var : java.util.Collections.unmodifiableCollection(n6Var2.a)) {
                        if (hashSet.contains(m6Var.g)) {
                            ads_mobile_sdk.o6 o6Var = m6Var.d;
                            if (j >= o6Var.d && o6Var.c != 3) {
                                o6Var.c = (byte) 3;
                                ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "setNativeViewHierarchy", str, o6Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!android.text.TextUtils.isEmpty(str) && (n6Var = ads_mobile_sdk.n6.c) != null) {
                    for (ads_mobile_sdk.m6 m6Var2 : java.util.Collections.unmodifiableCollection(n6Var.a)) {
                        if (hashSet.contains(m6Var2.g)) {
                            ads_mobile_sdk.o6 o6Var2 = m6Var2.d;
                            if (j >= o6Var2.d) {
                                o6Var2.c = (byte) 2;
                                ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var2.b.get(), "setNativeViewHierarchy", str, o6Var2.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // ads_mobile_sdk.a62, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((java.lang.String) obj);
                break;
            default:
                onPostExecute((java.lang.String) obj);
                break;
        }
    }
}
