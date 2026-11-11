package p034.p095;

import android.animation.LayoutTransition;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.は〲ぱなで.じぜこほぱ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1713 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Method f7876 = null;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f7877 = false;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean f7878 = true;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3758(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        boolean z2 = false;
        if (i >= 18) {
            if (f7878) {
                try {
                    viewGroup.suppressLayout(z);
                    return;
                } catch (NoSuchMethodError unused) {
                    f7878 = false;
                    return;
                }
            }
            return;
        }
        if (C1687.f7815 == null) {
            C1742 c1742 = new C1742();
            C1687.f7815 = c1742;
            c1742.setAnimator(2, null);
            C1687.f7815.setAnimator(0, null);
            C1687.f7815.setAnimator(1, null);
            C1687.f7815.setAnimator(3, null);
            C1687.f7815.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!C1687.f7805) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            C1687.f7807 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused2) {
                        }
                        C1687.f7805 = true;
                    }
                    Method method = C1687.f7807;
                    if (method != null) {
                        try {
                            method.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    }
                }
                if (layoutTransition != C1687.f7815) {
                    viewGroup.setTag(C1740.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(C1687.f7815);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!C1687.f7813) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                C1687.f7811 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused4) {
            }
            C1687.f7813 = true;
        }
        Field field = C1687.f7811;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        C1687.f7811.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused5) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused6) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i2 = C1740.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i2);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i2, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static InterfaceC1695 m3759(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1725(viewGroup) : (C1732) C1702.m3754(viewGroup);
    }
}
