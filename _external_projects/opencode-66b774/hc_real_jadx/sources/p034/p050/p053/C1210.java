package p034.p050.p053;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import p034.p035.p038.p039.InterfaceC1013;
import p034.p050.p057.p058.C1273;
import p237.p238.p239.p241.p242.C2786;

@SuppressLint({"RestrictedAPI"})
/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1210 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Class<?> f5987;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f5986 = {R.attr.state_checked};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final int[] f5984 = new int[0];

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Rect f5985 = new Rect();

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f5987 = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m2694(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f5986);
            } else {
                drawable.setState(f5984);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Rect m2695(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f5987 != null) {
            try {
                Drawable m4759 = C2786.m4759(drawable);
                Object invoke = m4759.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m4759, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f5987.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f5985;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2696(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC1013) {
                drawable2 = ((InterfaceC1013) drawable).mo2356();
            } else {
                if (drawable instanceof C1273) {
                    return m2696(((C1273) drawable).f6223);
                }
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m2696(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m2696(drawable3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static PorterDuff.Mode m2697(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
