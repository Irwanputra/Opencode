package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p034.p035.p038.C1005;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1121;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p185.C2255;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Drawable f3342;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Rect f3343;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f3344;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f3345;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Rect f3346;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0452 implements InterfaceC1121 {
        public C0452() {
        }

        @Override // p034.p035.p045.InterfaceC1121
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo370(View view, C1072 c1072) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f3343 == null) {
                scrimInsetsFrameLayout.f3343 = new Rect();
            }
            ScrimInsetsFrameLayout.this.f3343.set(c1072.m2422(), c1072.m2424(), c1072.m2426(), c1072.m2420());
            ScrimInsetsFrameLayout.this.mo1444(c1072);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z = true;
            if ((!c1072.m2425().equals(C1005.f5372)) && ScrimInsetsFrameLayout.this.f3342 != null) {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            C1096.m2508(ScrimInsetsFrameLayout.this);
            return c1072.m2423();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3346 = new Rect();
        this.f3344 = true;
        this.f3345 = true;
        int[] iArr = C2243.ScrimInsetsFrameLayout;
        int i2 = C2350.Widget_Design_ScrimInsetsFrameLayout;
        C2255.m4406(context, attributeSet, i, i2);
        C2255.m4404(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f3342 = obtainStyledAttributes.getDrawable(C2243.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        C1096.m2503(this, new C0452());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f3343 == null || this.f3342 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f3344) {
            this.f3346.set(0, 0, width, this.f3343.top);
            this.f3342.setBounds(this.f3346);
            this.f3342.draw(canvas);
        }
        if (this.f3345) {
            this.f3346.set(0, height - this.f3343.bottom, width, height);
            this.f3342.setBounds(this.f3346);
            this.f3342.draw(canvas);
        }
        Rect rect = this.f3346;
        Rect rect2 = this.f3343;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f3342.setBounds(this.f3346);
        this.f3342.draw(canvas);
        Rect rect3 = this.f3346;
        Rect rect4 = this.f3343;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f3342.setBounds(this.f3346);
        this.f3342.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f3342;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f3342;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f3345 = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f3344 = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f3342 = drawable;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1444(C1072 c1072) {
    }
}
