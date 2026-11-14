package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yy0 {
    public static yy0 b;
    public final ii a;

    public yy0(Context context) {
        ii iiVar = ii.c;
        if (iiVar == null) {
            iiVar = new ii(context);
            ii.c = iiVar;
        }
        this.a = iiVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (yy0.class) {
            z = ((SharedPreferences) this.a.b).getBoolean("paidv2_publisher_option", true);
        }
        return z;
    }

    public static final yy0 a(Context context) {
        yy0 yy0Var;
        synchronized (yy0.class) {
            try {
                yy0Var = b;
                if (yy0Var == null) {
                    yy0Var = new yy0(context);
                    b = yy0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yy0Var;
    }
}
