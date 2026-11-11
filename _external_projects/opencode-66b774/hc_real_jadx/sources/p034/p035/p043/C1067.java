package p034.p035.p043;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.util.TypedValue;

/* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1067 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static TypedValue f5527;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Object f5528 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m2405(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Drawable m2406(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f5528) {
                if (f5527 == null) {
                    f5527 = new TypedValue();
                }
                context.getResources().getValue(i, f5527, true);
                i = f5527.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m2407(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
