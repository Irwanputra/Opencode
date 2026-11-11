package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p131.p161.p162.p163.p189.C2325;
import p131.p161.p162.p163.p189.InterfaceC2327;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CircularRevealFrameLayout extends FrameLayout implements InterfaceC2327 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2325 f3236;

    public CircularRevealFrameLayout(Context context) {
        this(context, null);
    }

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3236 = new C2325(this);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C2325 c2325 = this.f3236;
        if (c2325 != null) {
            c2325.m4491(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3236.f9606;
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public int getCircularRevealScrimColor() {
        return this.f3236.m4495();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public InterfaceC2327.C2331 getRevealInfo() {
        return this.f3236.m4494();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C2325 c2325 = this.f3236;
        return c2325 != null ? c2325.m4489() : super.isOpaque();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        C2325 c2325 = this.f3236;
        c2325.f9606 = drawable;
        c2325.f9605.invalidate();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setCircularRevealScrimColor(int i) {
        C2325 c2325 = this.f3236;
        c2325.f9609.setColor(i);
        c2325.f9605.invalidate();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setRevealInfo(InterfaceC2327.C2331 c2331) {
        this.f3236.m4487(c2331);
    }

    @Override // p131.p161.p162.p163.p189.C2325.InterfaceC2326
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo1396(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo1397() {
        this.f3236.m4492();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1398() {
        this.f3236.m4488();
    }

    @Override // p131.p161.p162.p163.p189.C2325.InterfaceC2326
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo1399() {
        return super.isOpaque();
    }
}
