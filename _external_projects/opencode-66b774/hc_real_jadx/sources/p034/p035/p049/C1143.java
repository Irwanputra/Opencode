package p034.p035.p049;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぺふねづ〺.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1143 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Locale f5681 = new Locale("", "");

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m2578(Locale locale) {
        String script;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f5681)) {
            Method method = C1133.f5656;
            if (i >= 24) {
                script = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
            } else if (i >= 21) {
                try {
                    script = ((Locale) C1133.f5655.invoke(null, locale)).getScript();
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    script = locale.getScript();
                }
            } else {
                String locale2 = locale.toString();
                try {
                    Method method2 = C1133.f5655;
                    if (method2 != null) {
                        locale2 = (String) method2.invoke(null, locale2);
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                if (locale2 != null) {
                    try {
                        Method method3 = C1133.f5656;
                        if (method3 != null) {
                            script = (String) method3.invoke(null, locale2);
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
                script = null;
            }
            if (script == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                return (directionality == 1 || directionality == 2) ? 1 : 0;
            }
            if (script.equalsIgnoreCase("Arab") || script.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
