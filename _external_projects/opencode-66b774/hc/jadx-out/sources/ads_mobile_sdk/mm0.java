package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 {
    public static volatile mm0 d;
    public volatile Boolean a;
    public volatile Boolean b;
    public final Context c;

    public mm0(Context context) {
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
                boolean z = this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i = Build.VERSION.SDK_INT) >= 25 && i <= 30;
                this.a = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static mm0 a(Context context) {
        if (d == null) {
            synchronized (mm0.class) {
                try {
                    if (d == null) {
                        d = new mm0(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }
}
