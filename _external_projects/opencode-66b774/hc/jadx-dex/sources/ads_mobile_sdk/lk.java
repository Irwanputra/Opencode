package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lk {
    public static final java.util.HashMap d = new java.util.HashMap();
    public static volatile ads_mobile_sdk.lk e;
    public final android.content.Context b;
    public volatile java.util.ArrayList c;

    public lk(android.content.Context context) {
        android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.b = applicationContext;
        d.put("FireTVFOSDAT", ads_mobile_sdk.mm0.a(applicationContext));
    }

    public final java.util.ArrayList a() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry entry : d.entrySet()) {
                    if (((ads_mobile_sdk.mm0) entry.getValue()).a()) {
                        java.lang.String str = (java.lang.String) entry.getKey();
                        android.content.Context context = this.b;
                        ads_mobile_sdk.lm0 lm0Var = null;
                        if (str != null && context != null) {
                            try {
                                if ("FireTVFOSDAT".equals(str)) {
                                    lm0Var = new ads_mobile_sdk.lm0(context);
                                }
                            } catch (java.lang.Exception unused) {
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
            } catch (java.lang.Exception unused2) {
                this.c = new java.util.ArrayList();
                return this.c;
            }
        }
    }

    public static ads_mobile_sdk.lk a(android.content.Context context) {
        if (e == null) {
            synchronized (ads_mobile_sdk.lk.class) {
                try {
                    if (e == null) {
                        e = new ads_mobile_sdk.lk(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }
}
