package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mm0 {
    public static volatile ads_mobile_sdk.mm0 d;
    public volatile java.lang.Boolean a;
    public volatile java.lang.Boolean b;
    public final android.content.Context c;

    public mm0(android.content.Context context) {
        this.c = context;
        a();
    }

    public final boolean a() {
        int i;
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.a != null) {
                    return this.a.booleanValue();
                }
                boolean z = this.c != null && android.os.Build.MANUFACTURER.equalsIgnoreCase("Amazon") && android.os.Build.MODEL.toLowerCase().startsWith("aft") && (i = android.os.Build.VERSION.SDK_INT) >= 25 && i <= 30;
                this.a = java.lang.Boolean.valueOf(z);
                return z;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static ads_mobile_sdk.mm0 a(android.content.Context context) {
        if (d == null) {
            synchronized (ads_mobile_sdk.mm0.class) {
                try {
                    if (d == null) {
                        d = new ads_mobile_sdk.mm0(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }
}
