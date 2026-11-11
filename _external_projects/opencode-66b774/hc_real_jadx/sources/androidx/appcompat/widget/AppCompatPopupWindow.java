package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p034.p050.C1148;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final boolean f358;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f359;

    static {
        f358 = Build.VERSION.SDK_INT < 21;
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m148(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m148(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f358 && this.f359) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f358 && this.f359) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f358 && this.f359) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m148(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.PopupWindow, i, i2);
        int i3 = C1148.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            boolean z = obtainStyledAttributes.getBoolean(i3, false);
            if (f358) {
                this.f359 = z;
            } else {
                C2786.m4769(this, z);
            }
        }
        int i4 = C1148.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) ? obtainStyledAttributes.getDrawable(i4) : C1266.m2928(context, resourceId));
        obtainStyledAttributes.recycle();
    }
}
