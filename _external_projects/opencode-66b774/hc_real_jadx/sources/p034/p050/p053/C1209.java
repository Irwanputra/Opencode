package p034.p050.p053;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぇとしたべど, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1209 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Method f5983;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f5983 = declaredMethod;
                if (declaredMethod.isAccessible()) {
                    return;
                }
                f5983.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2693(View view) {
        return C1096.m2491(view) == 1;
    }
}
