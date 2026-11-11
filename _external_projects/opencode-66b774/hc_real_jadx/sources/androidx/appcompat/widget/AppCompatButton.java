package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p034.p035.p045.InterfaceC1119;
import p034.p035.p047.InterfaceC1123;
import p034.p035.p047.InterfaceC1130;
import p034.p050.C1264;
import p034.p050.p053.C1206;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatButton extends Button implements InterfaceC1119, InterfaceC1123, InterfaceC1130 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f344;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1232 f345;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1253 c1253 = new C1253(this);
        this.f344 = c1253;
        c1253.m2901(attributeSet, i);
        C1232 c1232 = new C1232(this);
        this.f345 = c1232;
        c1232.m2846(attributeSet, i);
        c1232.m2842();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeMaxTextSize();
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6113);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeMinTextSize();
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6115);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeStepGranularity();
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            return Math.round(c1232.f6076.f6111);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1232 c1232 = this.f345;
        return c1232 != null ? c1232.f6076.f6114 : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC1123.f5618) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            return c1232.f6076.f6112;
        }
        return 0;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C1206 c1206 = this.f345.f6065;
        if (c1206 != null) {
            return c1206.f5962;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C1206 c1206 = this.f345.f6065;
        if (c1206 != null) {
            return c1206.f5960;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1232 c1232 = this.f345;
        if (c1232 == null || InterfaceC1123.f5618) {
            return;
        }
        c1232.f6076.m2880();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1232 c1232 = this.f345;
        if (c1232 == null || InterfaceC1123.f5618 || !c1232.m2849()) {
            return;
        }
        this.f345.f6076.m2880();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.m2843(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.m2841(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC1123.f5618) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.m2850(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.f6070.setAllCaps(z);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f344;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // p034.p035.p047.InterfaceC1130
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f345.m2844(colorStateList);
        this.f345.m2842();
    }

    @Override // p034.p035.p047.InterfaceC1130
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f345.m2851(mode);
        this.f345.m2842();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1232 c1232 = this.f345;
        if (c1232 != null) {
            c1232.m2848(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC1123.f5618;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C1232 c1232 = this.f345;
        if (c1232 == null || z || c1232.m2849()) {
            return;
        }
        c1232.f6076.m2881(i, f);
    }
}
