package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yy0 {
    public static ads_mobile_sdk.yy0 b;
    public final ads_mobile_sdk.ii a;

    public yy0(android.content.Context context) {
        ads_mobile_sdk.ii iiVar = ads_mobile_sdk.ii.c;
        if (iiVar == null) {
            iiVar = new ads_mobile_sdk.ii(context);
            ads_mobile_sdk.ii.c = iiVar;
        }
        this.a = iiVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (ads_mobile_sdk.yy0.class) {
            z = ((android.content.SharedPreferences) this.a.b).getBoolean("paidv2_publisher_option", true);
        }
        return z;
    }

    public static final ads_mobile_sdk.yy0 a(android.content.Context context) {
        ads_mobile_sdk.yy0 yy0Var;
        synchronized (ads_mobile_sdk.yy0.class) {
            try {
                yy0Var = b;
                if (yy0Var == null) {
                    yy0Var = new ads_mobile_sdk.yy0(context);
                    b = yy0Var;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return yy0Var;
    }
}
