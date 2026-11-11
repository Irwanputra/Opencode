package p034.p035.p049;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1133 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Method f5655;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Method f5656;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f5655 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f5656 = cls.getMethod("getScript", String.class);
            f5655 = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception unused) {
            f5656 = null;
            f5655 = null;
        }
    }
}
