package p131.p161.p162.p163.p175;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おぐぴう〸ず.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2223 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final boolean f9238;

    static {
        f9238 = Build.VERSION.SDK_INT < 18;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4321(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f9238 ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.f2962 = new WeakReference<>(view);
        badgeDrawable.f2963 = new WeakReference<>(frameLayout);
        badgeDrawable.m1307();
        badgeDrawable.invalidateSelf();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4322(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (f9238) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }
}
