package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tj3 {
    public static final ads_mobile_sdk.tj3 g = new ads_mobile_sdk.tj3();
    public static final android.os.Handler h = new android.os.Handler(android.os.Looper.getMainLooper());
    public static android.os.Handler i = null;
    public static final dev.epro.r0.A8962658062045365505 j = new dev.epro.r0.A8962658062045365505(4);
    public static final dev.epro.r0.A8962658062045365505 k = new dev.epro.r0.A8962658062045365505(5);
    public final ads_mobile_sdk.ii c;
    public final ads_mobile_sdk.ii e;
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final dev.epro.r0.P17112279574965248524 d = new dev.epro.r0.P17112279574965248524();

    public tj3() {
        ads_mobile_sdk.ii iiVar = new ads_mobile_sdk.ii();
        ads_mobile_sdk.c7 c7Var = new ads_mobile_sdk.c7((byte) 21);
        iiVar.a = c7Var;
        iiVar.b = new ads_mobile_sdk.c7((java.lang.Object) c7Var, (byte) 25);
        this.c = iiVar;
        ads_mobile_sdk.r6 r6Var = new ads_mobile_sdk.r6();
        r6Var.b = new java.util.ArrayDeque();
        r6Var.c = null;
        r6Var.a = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
        ads_mobile_sdk.ii iiVar2 = new ads_mobile_sdk.ii();
        iiVar2.b = r6Var;
        this.e = iiVar2;
    }

    public final void a(android.view.View view, ads_mobile_sdk.c7 c7Var, org.json.JSONObject jSONObject, boolean z) {
        java.lang.Object obj;
        boolean z2;
        dev.epro.r0.P17112279574965248524 p17112279574965248524 = this.d;
        java.util.HashMap map = (java.util.HashMap) p17112279574965248524.c;
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) p17112279574965248524.j;
        if (dev.epro.r0.W7808703833045379622.c(view) == null) {
            char c = ((java.util.HashSet) p17112279574965248524.e).contains(view) ? (char) 1 : p17112279574965248524.a ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            org.json.JSONObject jSONObjectA = c7Var.a(view);
            java.util.concurrent.ExecutorService executorService = ads_mobile_sdk.c72.a;
            try {
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new org.json.JSONArray();
                    jSONObject.put("childViews", jSONArrayOptJSONArray);
                }
                jSONArrayOptJSONArray.put(jSONObjectA);
            } catch (org.json.JSONException unused) {
            }
            java.util.HashMap map2 = (java.util.HashMap) p17112279574965248524.b;
            if (map2.size() == 0) {
                obj = null;
            } else {
                obj = (java.lang.String) map2.get(view);
                if (obj != null) {
                    map2.remove(view);
                }
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (org.json.JSONException unused2) {
                }
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, java.lang.Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", java.lang.Boolean.valueOf(z3));
                } catch (org.json.JSONException unused3) {
                }
                boolean zContains = ((java.util.HashSet) p17112279574965248524.i).contains(obj);
                java.lang.Object objValueOf = java.lang.Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (org.json.JSONException unused4) {
                    }
                }
                p17112279574965248524.a = true;
                return;
            }
            ads_mobile_sdk.v9 v9Var = (ads_mobile_sdk.v9) map.get(view);
            if (v9Var != null) {
                map.remove(view);
            }
            if (v9Var != null) {
                ads_mobile_sdk.wr0 wr0Var = v9Var.a;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.ArrayList arrayList = v9Var.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    java.lang.Object obj2 = arrayList.get(i2);
                    i2++;
                    jSONArray.put((java.lang.String) obj2);
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", wr0Var.b);
                    jSONObjectA.put("friendlyObstructionPurpose", wr0Var.c);
                    jSONObjectA.put("friendlyObstructionReason", (java.lang.Object) null);
                } catch (org.json.JSONException unused5) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            c7Var.a(view, jSONObjectA, this, c == 1, z || z2);
        }
    }
}
