package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.p185.C2255;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Drawable f3324;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f3325;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f3326;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final Rect f3327;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f3328;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final Rect f3329;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3327 = new Rect();
        this.f3329 = new Rect();
        this.f3325 = 119;
        this.f3326 = true;
        this.f3328 = false;
        int[] iArr = C2243.ForegroundLinearLayout;
        C2255.m4406(context, attributeSet, i, 0);
        C2255.m4404(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f3325 = obtainStyledAttributes.getInt(C2243.ForegroundLinearLayout_android_foregroundGravity, this.f3325);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2243.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3326 = obtainStyledAttributes.getBoolean(C2243.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3324;
        if (drawable != null) {
            if (this.f3328) {
                this.f3328 = false;
                Rect rect = this.f3327;
                Rect rect2 = this.f3329;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3326) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3325, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3324;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3324;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3324.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3324;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3325;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3324;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3328 = z | this.f3328;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3328 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3324;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3324);
            }
            this.f3324 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3325 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f3325 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3325 = i;
            if (i == 119 && this.f3324 != null) {
                this.f3324.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3324;
    }
}
