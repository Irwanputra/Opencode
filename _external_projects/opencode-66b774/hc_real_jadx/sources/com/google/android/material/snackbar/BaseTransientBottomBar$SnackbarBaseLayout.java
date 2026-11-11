package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p164.p165.C2112;
import p131.p161.p162.p163.p190.InterfaceC2334;
import p131.p161.p162.p163.p190.InterfaceC2335;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final View.OnTouchListener f3423 = new ViewOnTouchListenerC0461();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public PorterDuff.Mode f3424;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC2335 f3425;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ColorStateList f3426;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC2334 f3427;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final float f3428;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final float f3429;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f3430;

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public static class ViewOnTouchListenerC0461 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        super(C2112.m4210(context, attributeSet, 0, 0), attributeSet);
        Drawable m4758;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C2243.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C2243.SnackbarLayout_elevation)) {
            C1096.m2509(this, obtainStyledAttributes.getDimensionPixelSize(r1, 0));
        }
        this.f3430 = obtainStyledAttributes.getInt(C2243.SnackbarLayout_animationMode, 0);
        this.f3428 = obtainStyledAttributes.getFloat(C2243.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(C1687.m3662(context2, obtainStyledAttributes, C2243.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(C1687.m3653(obtainStyledAttributes.getInt(C2243.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.f3429 = obtainStyledAttributes.getFloat(C2243.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3423);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(C2324.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C1687.m3695(C1687.m3728(this, C2111.colorSurface), C1687.m3728(this, C2111.colorOnSurface), getBackgroundOverlayColorAlpha()));
            if (this.f3426 != null) {
                m4758 = C2786.m4758(gradientDrawable);
                C2786.m4788(m4758, this.f3426);
            } else {
                m4758 = C2786.m4758(gradientDrawable);
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(m4758);
            } else {
                setBackgroundDrawable(m4758);
            }
        }
    }

    public float getActionTextColorAlpha() {
        return this.f3429;
    }

    public int getAnimationMode() {
        return this.f3430;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3428;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2334 interfaceC2334 = this.f3427;
        if (interfaceC2334 != null) {
            interfaceC2334.onViewAttachedToWindow(this);
        }
        C1096.m2518(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2334 interfaceC2334 = this.f3427;
        if (interfaceC2334 != null) {
            interfaceC2334.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2335 interfaceC2335 = this.f3425;
        if (interfaceC2335 != null) {
            interfaceC2335.m4497(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f3430 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3426 != null) {
            drawable = C2786.m4758(drawable.mutate());
            C2786.m4788(drawable, this.f3426);
            C2786.m4802(drawable, this.f3424);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3426 = colorStateList;
        if (getBackground() != null) {
            Drawable m4758 = C2786.m4758(getBackground().mutate());
            C2786.m4788(m4758, colorStateList);
            C2786.m4802(m4758, this.f3424);
            if (m4758 != getBackground()) {
                super.setBackgroundDrawable(m4758);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3424 = mode;
        if (getBackground() != null) {
            Drawable m4758 = C2786.m4758(getBackground().mutate());
            C2786.m4802(m4758, mode);
            if (m4758 != getBackground()) {
                super.setBackgroundDrawable(m4758);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC2334 interfaceC2334) {
        this.f3427 = interfaceC2334;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3423);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC2335 interfaceC2335) {
        this.f3425 = interfaceC2335;
    }
}
