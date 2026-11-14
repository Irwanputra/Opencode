package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class o6 {
    public final java.lang.String a;
    public long d = java.lang.System.nanoTime();
    public byte c = 1;
    public dev.epro.r0.C12642994619513326483 b = new dev.epro.r0.C12642994619513326483(null);

    public o6(java.lang.String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ads_mobile_sdk.m6 m6Var, dev.epro.r0.R6320827706769103704 r6320827706769103704, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2 = m6Var.g;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        ads_mobile_sdk.c72.a(jSONObject2, "environment", "app");
        ads_mobile_sdk.l6 l6Var = (ads_mobile_sdk.l6) r6320827706769103704.g;
        ads_mobile_sdk.ii iiVar = (ads_mobile_sdk.ii) r6320827706769103704.a;
        ads_mobile_sdk.c72.a(jSONObject2, "adSessionType", l6Var);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        ads_mobile_sdk.c72.a(jSONObject3, "deviceType", android.os.Build.MANUFACTURER + "; " + android.os.Build.MODEL);
        ads_mobile_sdk.c72.a(jSONObject3, "osVersion", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        ads_mobile_sdk.c72.a(jSONObject3, "os", "Android");
        ads_mobile_sdk.c72.a(jSONObject2, "deviceInfo", jSONObject3);
        int iA = ads_mobile_sdk.xv.a();
        if (iA == 1) {
            str = "ctv";
        } else if (iA == 2) {
            str = "mobile";
        } else {
            if (iA != 3) {
                throw null;
            }
            str = "other";
        }
        ads_mobile_sdk.c72.a(jSONObject2, "deviceCategory", str);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ads_mobile_sdk.c72.a(jSONObject2, "supports", jSONArray);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        ads_mobile_sdk.c72.a(jSONObject4, "partnerName", (java.lang.String) iiVar.a);
        ads_mobile_sdk.c72.a(jSONObject4, "partnerVersion", (java.lang.String) iiVar.b);
        ads_mobile_sdk.c72.a(jSONObject2, "omidNativeInfo", jSONObject4);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        ads_mobile_sdk.c72.a(jSONObject5, "libraryVersion", "1.6.9-google_20260729");
        ads_mobile_sdk.c72.a(jSONObject5, "appId", ads_mobile_sdk.ib1.b.a.getApplicationContext().getPackageName());
        ads_mobile_sdk.c72.a(jSONObject2, "app", jSONObject5);
        java.lang.String str3 = (java.lang.String) r6320827706769103704.f;
        if (str3 != null) {
            ads_mobile_sdk.c72.a(jSONObject2, "contentUrl", str3);
        }
        java.lang.String str4 = (java.lang.String) r6320827706769103704.e;
        if (str4 != null) {
            ads_mobile_sdk.c72.a(jSONObject2, "customReferenceData", str4);
        }
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        java.util.Iterator it = java.util.Collections.unmodifiableList((java.util.ArrayList) r6320827706769103704.c).iterator();
        if (!it.hasNext()) {
            ads_mobile_sdk.d62.a.a((android.webkit.WebView) this.b.get(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
        } else {
            it.next().getClass();
            dev.epro.r0.Z3383101362411723454.s();
        }
    }

    public void b() {
        this.b.clear();
    }

    public void c() {
    }

    public void a(ads_mobile_sdk.m6 m6Var, dev.epro.r0.R6320827706769103704 r6320827706769103704) {
        a(m6Var, r6320827706769103704, null);
    }

    public static org.json.JSONArray a(java.util.ArrayList arrayList) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ((ads_mobile_sdk.lm0) ((dev.epro.r0.N1486767233833082383) obj)).getClass();
            for (java.lang.String str : java.util.Collections.singletonList("1.0")) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("mechanism", "FireTVFOSDAT");
                jSONObject.put("executionEnvironment", "NATIVE");
                jSONObject.put("version", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
