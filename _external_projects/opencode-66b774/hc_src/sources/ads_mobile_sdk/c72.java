package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import dev.epro.r0.D15790576501325811873;
import dev.epro.r0.Z3383101362411723454;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class c72 {
    public static final ExecutorService a = Executors.newSingleThreadExecutor();
    public static WindowManager b = null;
    public static volatile Point c = null;
    public static D15790576501325811873 d = null;
    public static final String[] e = {"x", "y", "width", "height"};
    public static float f = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f);
            jSONObject.put("y", i2 / f);
            jSONObject.put("width", i3 / f);
            jSONObject.put("height", i4 / f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject) {
        float f2;
        float f3;
        try {
            if (b != null) {
                Point point = c;
                if (point == null) {
                    if (b != null) {
                        point = new Point(0, 0);
                        b.getDefaultDisplay().getRealSize(point);
                    } else {
                        point = null;
                    }
                    c = point;
                }
                if (point != null) {
                    float f4 = point.x;
                    float f5 = f;
                    f2 = f4 / f5;
                    f3 = point.y / f5;
                    jSONObject.put("width", f2);
                    jSONObject.put("height", f3);
                    return;
                }
            }
            jSONObject.put("width", f2);
            jSONObject.put("height", f3);
            return;
        } catch (JSONException unused) {
            return;
        }
        f2 = 0.0f;
        f3 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L6
            if (r11 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r10 == 0) goto Le7
            if (r11 != 0) goto Ld
            goto Le7
        Ld:
            java.lang.String[] r2 = ads_mobile_sdk.c72.e
            int r3 = r2.length
            r4 = r1
        L11:
            if (r4 >= r3) goto L26
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L23
            goto Le7
        L23:
            int r4 = r4 + 1
            goto L11
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Le7
            java.lang.String r2 = "noOutputDevice"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Le7
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Le7
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L77
            if (r2 != 0) goto L77
            goto La5
        L77:
            if (r4 != 0) goto L7c
            if (r2 != 0) goto L7c
            goto L8c
        L7c:
            if (r4 == 0) goto Le7
            if (r2 != 0) goto L82
            goto Le7
        L82:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Le7
        L8c:
            r5 = r1
        L8d:
            int r6 = r4.length()
            if (r5 >= r6) goto La5
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La2
            goto Le7
        La2:
            int r5 = r5 + 1
            goto L8d
        La5:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            org.json.JSONArray r11 = r11.optJSONArray(r2)
            if (r10 != 0) goto Lb4
            if (r11 != 0) goto Lb4
            goto Le1
        Lb4:
            if (r10 != 0) goto Lb9
            if (r11 != 0) goto Lb9
            goto Lc8
        Lb9:
            if (r10 == 0) goto Le3
            if (r11 != 0) goto Lbe
            goto Le3
        Lbe:
            int r2 = r10.length()
            int r3 = r11.length()
            if (r2 != r3) goto Le3
        Lc8:
            r2 = r1
        Lc9:
            int r3 = r10.length()
            if (r2 >= r3) goto Le1
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            boolean r3 = c(r3, r4)
            if (r3 != 0) goto Lde
            goto Le3
        Lde:
            int r2 = r2 + 1
            goto Lc9
        Le1:
            r10 = r0
            goto Le4
        Le3:
            r10 = r1
        Le4:
            if (r10 == 0) goto Le7
            return r0
        Le7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.c(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static HashMap a(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    hashMap.put(next, (String) obj);
                }
            }
            return hashMap;
        } catch (Exception e2) {
            Z3383101362411723454.m("Failed to parse JSON to Map", e2);
            return null;
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException unused) {
        }
    }
}
