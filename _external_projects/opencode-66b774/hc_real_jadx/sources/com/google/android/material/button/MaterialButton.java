package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p034.p035.p045.C1096;
import p034.p050.p055.p056.C1266;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;
import p131.p161.p162.p163.p178.C2230;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p181.C2236;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC2169 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final int[] f3151 = {R.attr.state_checkable};

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final int[] f3152 = {R.attr.state_checked};

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int f3153 = C2350.Widget_MaterialComponents_Button;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ColorStateList f3154;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public PorterDuff.Mode f3155;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f3156;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f3157;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final LinkedHashSet<InterfaceC0418> f3158;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f3159;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC0417 f3160;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f3161;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2230 f3162;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f3163;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Drawable f3164;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3165;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0416();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f3166;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0416 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.f3166 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f3166 ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0417 {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0418 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1363(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private String getA11yClassName() {
        return (m1361() ? CompoundButton.class : Button.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1359()) {
            return this.f3162.f9248;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3164;
    }

    public int getIconGravity() {
        return this.f3157;
    }

    public int getIconPadding() {
        return this.f3159;
    }

    public int getIconSize() {
        return this.f3156;
    }

    public ColorStateList getIconTint() {
        return this.f3154;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3155;
    }

    public ColorStateList getRippleColor() {
        if (m1359()) {
            return this.f3162.f9257;
        }
        return null;
    }

    public C2180 getShapeAppearanceModel() {
        if (m1359()) {
            return this.f3162.f9247;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1359()) {
            return this.f3162.f9263;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1359()) {
            return this.f3162.f9246;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        return m1359() ? this.f3162.f9249 : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1359() ? this.f3162.f9262 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3161;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1359()) {
            C1687.m3669(this, this.f3162.m4323());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m1361()) {
            Button.mergeDrawableStates(onCreateDrawableState, f3151);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f3152);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m1361());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2230 c2230;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c2230 = this.f3162) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = c2230.f9259;
        if (drawable != null) {
            drawable.setBounds(c2230.f9253, c2230.f9256, i6 - c2230.f9260, i5 - c2230.f9258);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1362();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        setChecked(savedState.f3166);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3166 = this.f3161;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m1362();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m1359()) {
            super.setBackgroundColor(i);
            return;
        }
        C2230 c2230 = this.f3162;
        if (c2230.m4323() != null) {
            c2230.m4323().setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m1359()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            C2230 c2230 = this.f3162;
            c2230.f9252 = true;
            c2230.f9254.setSupportBackgroundTintList(c2230.f9249);
            c2230.f9254.setSupportBackgroundTintMode(c2230.f9262);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m1359()) {
            this.f3162.f9251 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m1361() && isEnabled() && this.f3161 != z) {
            this.f3161 = z;
            refreshDrawableState();
            if (this.f3163) {
                return;
            }
            this.f3163 = true;
            Iterator<InterfaceC0418> it = this.f3158.iterator();
            while (it.hasNext()) {
                it.next().mo1363(this, this.f3161);
            }
            this.f3163 = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m1359()) {
            C2230 c2230 = this.f3162;
            if (c2230.f9250 && c2230.f9248 == i) {
                return;
            }
            c2230.f9248 = i;
            c2230.f9250 = true;
            c2230.m4326(c2230.f9247.m4286(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m1359()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m1359()) {
            C2163 m4323 = this.f3162.m4323();
            C2163.C2164 c2164 = m4323.f9045;
            if (c2164.f9072 != f) {
                c2164.f9072 = f;
                m4323.m4269();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3164 != drawable) {
            this.f3164 = drawable;
            m1360(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f3157 != i) {
            this.f3157 = i;
            m1362();
        }
    }

    public void setIconPadding(int i) {
        if (this.f3159 != i) {
            this.f3159 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3156 != i) {
            this.f3156 = i;
            m1360(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3154 != colorStateList) {
            this.f3154 = colorStateList;
            m1360(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3155 != mode) {
            this.f3155 = mode;
            m1360(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1266.m2929(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0417 interfaceC0417) {
        this.f3160 = interfaceC0417;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC0417 interfaceC0417 = this.f3160;
        if (interfaceC0417 != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1359()) {
            C2230 c2230 = this.f3162;
            if (c2230.f9257 != colorStateList) {
                c2230.f9257 = colorStateList;
                boolean z = C2230.f9245;
                if (z && (c2230.f9254.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) c2230.f9254.getBackground()).setColor(C2235.m4345(colorStateList));
                } else {
                    if (z || !(c2230.f9254.getBackground() instanceof C2236)) {
                        return;
                    }
                    ((C2236) c2230.f9254.getBackground()).setTintList(C2235.m4345(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m1359()) {
            setRippleColor(C1266.m2929(getContext(), i));
        }
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        if (!m1359()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3162.m4326(c2180);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m1359()) {
            C2230 c2230 = this.f3162;
            c2230.f9261 = z;
            c2230.m4327();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1359()) {
            C2230 c2230 = this.f3162;
            if (c2230.f9263 != colorStateList) {
                c2230.f9263 = colorStateList;
                c2230.m4327();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m1359()) {
            setStrokeColor(C1266.m2929(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m1359()) {
            C2230 c2230 = this.f3162;
            if (c2230.f9246 != i) {
                c2230.f9246 = i;
                c2230.m4327();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m1359()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1359()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C2230 c2230 = this.f3162;
        if (c2230.f9249 != colorStateList) {
            c2230.f9249 = colorStateList;
            if (c2230.m4323() != null) {
                C2786.m4788(c2230.m4323(), c2230.f9249);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1359()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C2230 c2230 = this.f3162;
        if (c2230.f9262 != mode) {
            c2230.f9262 = mode;
            if (c2230.m4323() == null || c2230.f9262 == null) {
                return;
            }
            C2786.m4802(c2230.m4323(), c2230.f9262);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3161);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m1359() {
        C2230 c2230 = this.f3162;
        return (c2230 == null || c2230.f9252) ? false : true;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1360(boolean z) {
        Drawable drawable = this.f3164;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C2786.m4758(drawable).mutate();
            this.f3164 = mutate;
            C2786.m4788(mutate, this.f3154);
            PorterDuff.Mode mode = this.f3155;
            if (mode != null) {
                C2786.m4802(this.f3164, mode);
            }
            int i = this.f3156;
            if (i == 0) {
                i = this.f3164.getIntrinsicWidth();
            }
            int i2 = this.f3156;
            if (i2 == 0) {
                i2 = this.f3164.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3164;
            int i3 = this.f3165;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f3157;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            Drawable drawable3 = this.f3164;
            if (z3) {
                C2786.m4790(this, drawable3, null, null, null);
                return;
            } else {
                C2786.m4790(this, null, null, drawable3, null);
                return;
            }
        }
        Drawable[] m4784 = C2786.m4784(this);
        Drawable drawable4 = m4784[0];
        Drawable drawable5 = m4784[2];
        if ((z3 && drawable4 != this.f3164) || (!z3 && drawable5 != this.f3164)) {
            z2 = true;
        }
        if (z2) {
            Drawable drawable6 = this.f3164;
            if (z3) {
                C2786.m4790(this, drawable6, null, null, null);
            } else {
                C2786.m4790(this, null, null, drawable6, null);
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m1361() {
        C2230 c2230 = this.f3162;
        return c2230 != null && c2230.f9251;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1362() {
        if (this.f3164 == null || getLayout() == null) {
            return;
        }
        int i = this.f3157;
        if (i == 1 || i == 3) {
            this.f3165 = 0;
            m1360(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i2 = this.f3156;
        if (i2 == 0) {
            i2 = this.f3164.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - min) - C1096.m2500(this)) - i2) - this.f3159) - C1096.m2513(this)) / 2;
        if ((C1096.m2491(this) == 1) != (this.f3157 == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.f3165 != measuredWidth) {
            this.f3165 = measuredWidth;
            m1360(false);
        }
    }
}
