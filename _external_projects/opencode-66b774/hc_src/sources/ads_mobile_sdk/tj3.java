package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import dev.epro.r0.A8962658062045365505;
import dev.epro.r0.P17112279574965248524;
import dev.epro.r0.W7808703833045379622;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class tj3 {
    public static final tj3 g = new tj3();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final A8962658062045365505 j = new A8962658062045365505((byte) 4);
    public static final A8962658062045365505 k = new A8962658062045365505((byte) 5);
    public final ii c;
    public final ii e;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final P17112279574965248524 d = new P17112279574965248524();

    public tj3() {
        ii iiVar = new ii();
        c7 c7Var = new c7((byte) 21);
        iiVar.a = c7Var;
        iiVar.b = new c7((Object) c7Var, (byte) 25);
        this.c = iiVar;
        r6 r6Var = new r6();
        r6Var.b = new ArrayDeque();
        r6Var.c = null;
        r6Var.a = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        ii iiVar2 = new ii();
        iiVar2.b = r6Var;
        this.e = iiVar2;
    }

    public final void a(View view, c7 c7Var, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        P17112279574965248524 p17112279574965248524 = this.d;
        HashMap hashMap = (HashMap) p17112279574965248524.c;
        WeakHashMap weakHashMap = (WeakHashMap) p17112279574965248524.j;
        if (W7808703833045379622.c(view) == null) {
            char c = ((HashSet) p17112279574965248524.e).contains(view) ? (char) 1 : p17112279574965248524.a ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject a = c7Var.a(view);
            ExecutorService executorService = c72.a;
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(a);
            } catch (JSONException unused) {
            }
            HashMap hashMap2 = (HashMap) p17112279574965248524.b;
            if (hashMap2.size() == 0) {
                obj = null;
            } else {
                obj = (String) hashMap2.get(view);
                if (obj != null) {
                    hashMap2.remove(view);
                }
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    a.put("adSessionId", obj);
                } catch (JSONException unused2) {
                }
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException unused3) {
                }
                boolean contains = ((HashSet) p17112279574965248524.i).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException unused4) {
                    }
                }
                p17112279574965248524.a = true;
                return;
            }
            v9 v9Var = (v9) hashMap.get(view);
            if (v9Var != null) {
                hashMap.remove(view);
            }
            if (v9Var != null) {
                wr0 wr0Var = v9Var.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = v9Var.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    jSONArray.put((String) obj2);
                }
                try {
                    a.put("isFriendlyObstructionFor", jSONArray);
                    a.put("friendlyObstructionClass", wr0Var.b);
                    a.put("friendlyObstructionPurpose", wr0Var.c);
                    a.put("friendlyObstructionReason", (Object) null);
                } catch (JSONException unused5) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            c7Var.a(view, a, this, c == 1, z || z2);
        }
    }
}
