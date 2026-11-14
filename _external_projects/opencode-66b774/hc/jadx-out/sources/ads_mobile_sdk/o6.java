package ads_mobile_sdk;

import android.os.Build;
import android.webkit.WebView;
import dev.epro.r0.C12642994619513326483;
import dev.epro.r0.N1486767233833082383;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.Z3383101362411723454;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class o6 {
    public final String a;
    public long d = System.nanoTime();
    public byte c = 1;
    public C12642994619513326483 b = new C12642994619513326483(null);

    public o6(String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m6 m6Var, R6320827706769103704 r6320827706769103704, JSONObject jSONObject) {
        String str;
        String str2 = m6Var.g;
        JSONObject jSONObject2 = new JSONObject();
        c72.a(jSONObject2, "environment", "app");
        l6 l6Var = (l6) r6320827706769103704.g;
        ii iiVar = (ii) r6320827706769103704.a;
        c72.a(jSONObject2, "adSessionType", l6Var);
        JSONObject jSONObject3 = new JSONObject();
        c72.a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        c72.a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        c72.a(jSONObject3, "os", "Android");
        c72.a(jSONObject2, "deviceInfo", jSONObject3);
        int iA = xv.a();
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
        c72.a(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c72.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        c72.a(jSONObject4, "partnerName", (String) iiVar.a);
        c72.a(jSONObject4, "partnerVersion", (String) iiVar.b);
        c72.a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        c72.a(jSONObject5, "libraryVersion", "1.6.9-google_20260729");
        c72.a(jSONObject5, "appId", ib1.b.a.getApplicationContext().getPackageName());
        c72.a(jSONObject2, "app", jSONObject5);
        String str3 = (String) r6320827706769103704.f;
        if (str3 != null) {
            c72.a(jSONObject2, "contentUrl", str3);
        }
        String str4 = (String) r6320827706769103704.e;
        if (str4 != null) {
            c72.a(jSONObject2, "customReferenceData", str4);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList((ArrayList) r6320827706769103704.c).iterator();
        if (!it.hasNext()) {
            d62.a.a((WebView) this.b.get(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
        } else {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }

    public void b() {
        this.b.clear();
    }

    public void c() {
    }

    public void a(m6 m6Var, R6320827706769103704 r6320827706769103704) {
        a(m6Var, r6320827706769103704, null);
    }

    public static JSONArray a(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((lm0) ((N1486767233833082383) obj)).getClass();
            for (String str : Collections.singletonList("1.0")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mechanism", "FireTVFOSDAT");
                jSONObject.put("executionEnvironment", "NATIVE");
                jSONObject.put("version", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
