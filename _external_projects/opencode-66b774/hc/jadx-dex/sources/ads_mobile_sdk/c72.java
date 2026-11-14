package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class c72 {
    public static final java.util.concurrent.ExecutorService a = java.util.concurrent.Executors.newSingleThreadExecutor();
    public static android.view.WindowManager b = null;
    public static volatile android.graphics.Point c = null;
    public static dev.epro.r0.D15790576501325811873 d = null;
    public static final java.lang.String[] e = {"x", "y", "width", "height"};
    public static float f = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    public static org.json.JSONObject a(int i, int i2, int i3, int i4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", i / f);
            jSONObject.put("y", i2 / f);
            jSONObject.put("width", i3 / f);
            jSONObject.put("height", i4 / f);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(org.json.JSONObject r5) {
        /*
            android.view.WindowManager r0 = ads_mobile_sdk.c72.b
            if (r0 == 0) goto L2c
            android.graphics.Point r0 = ads_mobile_sdk.c72.c
            if (r0 != 0) goto L1f
            android.view.WindowManager r0 = ads_mobile_sdk.c72.b
            if (r0 == 0) goto L1c
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            android.view.WindowManager r1 = ads_mobile_sdk.c72.b
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealSize(r0)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            ads_mobile_sdk.c72.c = r0
        L1f:
            if (r0 == 0) goto L2c
            int r1 = r0.x
            float r1 = (float) r1
            float r2 = ads_mobile_sdk.c72.f
            float r1 = r1 / r2
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = r0 / r2
            goto L2e
        L2c:
            r1 = 0
            r0 = r1
        L2e:
            java.lang.String r2 = "width"
            double r3 = (double) r1     // Catch: org.json.JSONException -> L3a
            r5.put(r2, r3)     // Catch: org.json.JSONException -> L3a
            java.lang.String r1 = "height"
            double r2 = (double) r0     // Catch: org.json.JSONException -> L3a
            r5.put(r1, r2)     // Catch: org.json.JSONException -> L3a
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.b(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.c(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static java.util.HashMap a(org.json.JSONObject jSONObject) {
        try {
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    map.put(next, (java.lang.String) obj);
                }
            }
            return map;
        } catch (java.lang.Exception e2) {
            dev.epro.r0.Z3383101362411723454.m("Failed to parse JSON to Map", e2);
            return null;
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException unused) {
        }
    }
}
