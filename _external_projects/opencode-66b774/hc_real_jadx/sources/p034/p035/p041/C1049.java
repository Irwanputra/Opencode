package p034.p035.p041;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1049 {
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m2383(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
            return;
        }
        if (!C2786.f10446) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                C2786.f10457 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C2786.f10446 = true;
        }
        Method method2 = C2786.f10457;
        if (method2 != null) {
            try {
                method2.invoke(bundle, str, iBinder);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                C2786.f10457 = null;
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static IBinder m2384(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        if (!C2786.f10434) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", String.class);
                C2786.f10456 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C2786.f10434 = true;
        }
        Method method2 = C2786.f10456;
        if (method2 == null) {
            return null;
        }
        try {
            return (IBinder) method2.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            C2786.f10456 = null;
            return null;
        }
    }
}
