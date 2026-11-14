package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P14632972821668659290 extends M10701816181309613444 implements H14091617879526365106 {
    public static final Method D;
    public H12843822278061842084 C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // dev.epro.r0.M10701816181309613444
    public final S9684361936304835821 a(Context context, boolean z) {
        K3366169276883091168 k3366169276883091168 = new K3366169276883091168(context, z);
        k3366169276883091168.setHoverListener(this);
        return k3366169276883091168;
    }

    @Override // dev.epro.r0.H14091617879526365106
    public final void d(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        H12843822278061842084 h12843822278061842084 = this.C;
        if (h12843822278061842084 != null) {
            h12843822278061842084.d(t8605657386197958581, menuItem);
        }
    }

    @Override // dev.epro.r0.H14091617879526365106
    public final void r(T8605657386197958581 t8605657386197958581, I4217019646703278835 i4217019646703278835) {
        H12843822278061842084 h12843822278061842084 = this.C;
        if (h12843822278061842084 != null) {
            h12843822278061842084.r(t8605657386197958581, i4217019646703278835);
        }
    }
}
