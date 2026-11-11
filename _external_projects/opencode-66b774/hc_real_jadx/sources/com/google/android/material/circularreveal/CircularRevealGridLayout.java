package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import p131.p161.p162.p163.p189.C2325;
import p131.p161.p162.p163.p189.InterfaceC2327;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CircularRevealGridLayout extends GridLayout implements InterfaceC2327 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2325 f3237;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3237 = new C2325(this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C2325 c2325 = this.f3237;
        if (c2325 != null) {
            c2325.m4491(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3237.f9606;
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public int getCircularRevealScrimColor() {
        return this.f3237.m4495();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public InterfaceC2327.C2331 getRevealInfo() {
        return this.f3237.m4494();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C2325 c2325 = this.f3237;
        return c2325 != null ? c2325.m4489() : super.isOpaque();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        C2325 c2325 = this.f3237;
        c2325.f9606 = drawable;
        c2325.f9605.invalidate();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setCircularRevealScrimColor(int i) {
        C2325 c2325 = this.f3237;
        c2325.f9609.setColor(i);
        c2325.f9605.invalidate();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    public void setRevealInfo(InterfaceC2327.C2331 c2331) {
        this.f3237.m4487(c2331);
    }

    @Override // p131.p161.p162.p163.p189.C2325.InterfaceC2326
    /* renamed from: 〺つふすそ */
    public void mo1396(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    /* renamed from: くし〴〺ぅ */
    public void mo1397() {
        this.f3237.m4492();
    }

    @Override // p131.p161.p162.p163.p189.InterfaceC2327
    /* renamed from: げつ〴ぬぐ */
    public void mo1398() {
        this.f3237.m4488();
    }

    @Override // p131.p161.p162.p163.p189.C2325.InterfaceC2326
    /* renamed from: びぐびあび */
    public boolean mo1399() {
        return super.isOpaque();
    }
}
