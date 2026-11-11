package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p034.p094.AbstractC1680;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class ImmLeaksCleaner implements InterfaceC1675 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int f100;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Field f101;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Field f102;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static Field f103;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Activity f104;

    public ImmLeaksCleaner(Activity activity) {
        this.f104 = activity;
    }

    @Override // p034.p094.InterfaceC1675
    /* renamed from: びぐびあび */
    public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
        if (enumC1682 != AbstractC1680.EnumC1682.ON_DESTROY) {
            return;
        }
        if (f100 == 0) {
            try {
                f100 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f103 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f102 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f101 = declaredField3;
                declaredField3.setAccessible(true);
                f100 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f100 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f104.getSystemService("input_method");
            try {
                Object obj = f101.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f103.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f102.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
