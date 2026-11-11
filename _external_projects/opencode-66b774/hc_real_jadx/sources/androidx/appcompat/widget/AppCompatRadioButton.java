package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p034.p035.p045.InterfaceC1119;
import p034.p035.p047.InterfaceC1129;
import p034.p050.C1264;
import p034.p050.p053.C1231;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;
import p034.p050.p055.p056.C1266;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatRadioButton extends RadioButton implements InterfaceC1129, InterfaceC1119 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1231 f360;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1253 f361;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1232 f362;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1231 c1231 = new C1231(this);
        this.f360 = c1231;
        c1231.m2838(attributeSet, i);
        C1253 c1253 = new C1253(this);
        this.f361 = c1253;
        c1253.m2901(attributeSet, i);
        C1232 c1232 = new C1232(this);
        this.f362 = c1232;
        c1232.m2846(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1232 c1232 = this.f362;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1231 c1231 = this.f360;
        return c1231 != null ? c1231.m2837(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    @Override // p034.p035.p047.InterfaceC1129
    public ColorStateList getSupportButtonTintList() {
        C1231 c1231 = this.f360;
        if (c1231 != null) {
            return c1231.f6059;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1231 c1231 = this.f360;
        if (c1231 != null) {
            return c1231.f6060;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C1266.m2928(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1231 c1231 = this.f360;
        if (c1231 != null) {
            if (c1231.f6063) {
                c1231.f6063 = false;
            } else {
                c1231.f6063 = true;
                c1231.m2839();
            }
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f361;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // p034.p035.p047.InterfaceC1129
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f360;
        if (c1231 != null) {
            c1231.f6059 = colorStateList;
            c1231.f6064 = true;
            c1231.m2839();
        }
    }

    @Override // p034.p035.p047.InterfaceC1129
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f360;
        if (c1231 != null) {
            c1231.f6060 = mode;
            c1231.f6062 = true;
            c1231.m2839();
        }
    }
}
