package ads_mobile_sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class lk {
    public static final HashMap d = new HashMap();
    public static volatile lk e;
    public final Context b;
    public volatile ArrayList c;

    public lk(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.b = applicationContext;
        d.put("FireTVFOSDAT", mm0.a(applicationContext));
    }

    public final ArrayList a() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : d.entrySet()) {
                    if (((mm0) entry.getValue()).a()) {
                        String str = (String) entry.getKey();
                        Context context = this.b;
                        lm0 lm0Var = null;
                        if (str != null && context != null) {
                            try {
                                if ("FireTVFOSDAT".equals(str)) {
                                    lm0Var = new lm0(context);
                                }
                            } catch (Exception unused) {
                                "Error creating attestation mechanism: ".concat(str);
                            }
                        }
                        if (lm0Var != null) {
                            arrayList.add(lm0Var);
                        }
                    }
                }
                this.c = arrayList;
                return this.c;
            } catch (Exception unused2) {
                this.c = new ArrayList();
                return this.c;
            }
        }
    }

    public static lk a(Context context) {
        if (e == null) {
            synchronized (lk.class) {
                try {
                    if (e == null) {
                        e = new lk(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }
}
