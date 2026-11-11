package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p034.p035.p045.C1096;
import p034.p050.p055.p056.C1266;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;
import p131.p161.p162.p163.p179.C2231;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC2169 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final int[] f3188 = {R.attr.state_checkable};

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final int[] f3189 = {R.attr.state_checked};

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int[] f3190 = {C2111.state_dragged};

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final int f3191 = C2350.Widget_MaterialComponents_CardView;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public InterfaceC0425 f3192;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f3193;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f3194;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f3195;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C2231 f3196;

    /* renamed from: com.google.android.material.card.MaterialCardView$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0425 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1375(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.materialCardViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f3191
            android.content.Context r8 = p131.p161.p162.p163.p164.p165.C2112.m4210(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f3194 = r8
            r7.f3195 = r8
            r0 = 1
            r7.f3193 = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p131.p161.p162.p163.C2243.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r0 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ざっざへづ.げつ〴ぬぐ r1 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ざっざへづ.げつ〴ぬぐ
            r1.<init>(r7, r9, r10, r6)
            r7.f3196 = r1
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r10 = r1.f9273
            r10.m4252(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r2 = super.getContentPaddingRight()
            int r3 = super.getContentPaddingBottom()
            android.graphics.Rect r4 = r1.f9267
            r4.set(r9, r10, r2, r3)
            r1.m4337()
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.content.Context r9 = r9.getContext()
            int r10 = p131.p161.p162.p163.C2243.MaterialCardView_strokeColor
            android.content.res.ColorStateList r9 = p034.p095.C1687.m3662(r9, r0, r10)
            r1.f9279 = r9
            if (r9 != 0) goto L5f
            r9 = -1
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r1.f9279 = r9
        L5f:
            int r9 = p131.p161.p162.p163.C2243.MaterialCardView_strokeWidth
            int r9 = r0.getDimensionPixelSize(r9, r8)
            r1.f9268 = r9
            int r9 = p131.p161.p162.p163.C2243.MaterialCardView_android_checkable
            boolean r9 = r0.getBoolean(r9, r8)
            r1.f9280 = r9
            com.google.android.material.card.MaterialCardView r10 = r1.f9274
            r10.setLongClickable(r9)
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.content.Context r9 = r9.getContext()
            int r10 = p131.p161.p162.p163.C2243.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r9 = p034.p095.C1687.m3662(r9, r0, r10)
            r1.f9284 = r9
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.content.Context r9 = r9.getContext()
            int r10 = p131.p161.p162.p163.C2243.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r9 = p034.p095.C1687.m3700(r9, r0, r10)
            r1.m4329(r9)
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.content.Context r9 = r9.getContext()
            int r10 = p131.p161.p162.p163.C2243.MaterialCardView_rippleColor
            android.content.res.ColorStateList r9 = p034.p095.C1687.m3662(r9, r0, r10)
            r1.f9269 = r9
            if (r9 != 0) goto Laf
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            int r10 = p131.p161.p162.p163.C2111.colorControlHighlight
            int r9 = p034.p095.C1687.m3728(r9, r10)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r1.f9269 = r9
        Laf:
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.content.Context r9 = r9.getContext()
            int r10 = p131.p161.p162.p163.C2243.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r9 = p034.p095.C1687.m3662(r9, r0, r10)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r10 = r1.f9281
            if (r9 != 0) goto Lc3
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r8)
        Lc3:
            r10.m4252(r9)
            r1.m4341()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r8 = r1.f9273
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            float r9 = r9.getCardElevation()
            r8.m4263(r9)
            r1.m4333()
            com.google.android.material.card.MaterialCardView r8 = r1.f9274
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r9 = r1.f9273
            android.graphics.drawable.Drawable r9 = r1.m4331(r9)
            r8.setBackgroundInternal(r9)
            com.google.android.material.card.MaterialCardView r8 = r1.f9274
            boolean r8 = r8.isClickable()
            if (r8 == 0) goto Lef
            android.graphics.drawable.Drawable r8 = r1.m4338()
            goto Lf1
        Lef:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r8 = r1.f9281
        Lf1:
            r1.f9266 = r8
            com.google.android.material.card.MaterialCardView r9 = r1.f9274
            android.graphics.drawable.Drawable r8 = r1.m4331(r8)
            r9.setForeground(r8)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f3196.f9273.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f3196.f9273.f9045.f9084;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f3196.f9281.f9045.f9084;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f3196.f9283;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f3196.f9284;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f3196.f9267.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f3196.f9267.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f3196.f9267.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f3196.f9267.top;
    }

    public float getProgress() {
        return this.f3196.f9273.f9045.f9087;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f3196.f9273.m4267();
    }

    public ColorStateList getRippleColor() {
        return this.f3196.f9269;
    }

    public C2180 getShapeAppearanceModel() {
        return this.f3196.f9277;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f3196.f9279;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f3196.f9279;
    }

    public int getStrokeWidth() {
        return this.f3196.f9268;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3194;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1687.m3669(this, this.f3196.f9273);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m1374()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3188);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3189);
        }
        if (this.f3195) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3190);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m1374());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C2231 c2231 = this.f3196;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (c2231.f9272 != null) {
            int i5 = c2231.f9276;
            int i6 = c2231.f9278;
            int i7 = (measuredWidth - i5) - i6;
            int i8 = (measuredHeight - i5) - i6;
            if ((Build.VERSION.SDK_INT < 21) || c2231.f9274.getUseCompatPadding()) {
                i8 -= (int) Math.ceil(c2231.m4340() * 2.0f);
                i7 -= (int) Math.ceil(c2231.m4334() * 2.0f);
            }
            int i9 = i8;
            int i10 = c2231.f9276;
            if (C1096.m2491(c2231.f9274) == 1) {
                i4 = i7;
                i3 = i10;
            } else {
                i3 = i7;
                i4 = i10;
            }
            c2231.f9272.setLayerInset(2, i3, c2231.f9276, i4, i9);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f3193) {
            C2231 c2231 = this.f3196;
            if (!c2231.f9275) {
                c2231.f9275 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        C2231 c2231 = this.f3196;
        c2231.f9273.m4252(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C2231 c2231 = this.f3196;
        c2231.f9273.m4263(c2231.f9274.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C2163 c2163 = this.f3196.f9281;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c2163.m4252(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f3196.f9280 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f3194 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f3196.m4329(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.f3196.m4329(C1266.m2928(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2231 c2231 = this.f3196;
        c2231.f9284 = colorStateList;
        Drawable drawable = c2231.f9283;
        if (drawable != null) {
            C2786.m4788(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C2231 c2231 = this.f3196;
        if (c2231 != null) {
            Drawable drawable = c2231.f9266;
            Drawable m4338 = c2231.f9274.isClickable() ? c2231.m4338() : c2231.f9281;
            c2231.f9266 = m4338;
            if (drawable != m4338) {
                if (Build.VERSION.SDK_INT < 23 || !(c2231.f9274.getForeground() instanceof InsetDrawable)) {
                    c2231.f9274.setForeground(c2231.m4331(m4338));
                } else {
                    ((InsetDrawable) c2231.f9274.getForeground()).setDrawable(m4338);
                }
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        C2231 c2231 = this.f3196;
        c2231.f9267.set(i, i2, i3, i4);
        c2231.m4337();
    }

    public void setDragged(boolean z) {
        if (this.f3195 != z) {
            this.f3195 = z;
            refreshDrawableState();
            m1372();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f3196.m4339();
    }

    public void setOnCheckedChangeListener(InterfaceC0425 interfaceC0425) {
        this.f3192 = interfaceC0425;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f3196.m4339();
        this.f3196.m4337();
    }

    public void setProgress(float f) {
        C2231 c2231 = this.f3196;
        c2231.f9273.m4253(f);
        C2163 c2163 = c2231.f9281;
        if (c2163 != null) {
            c2163.m4253(f);
        }
        C2163 c21632 = c2231.f9271;
        if (c21632 != null) {
            c21632.m4253(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C2231 c2231 = this.f3196;
        c2231.m4342(c2231.f9277.m4286(f));
        c2231.f9266.invalidateSelf();
        if (c2231.m4343() || c2231.m4332()) {
            c2231.m4337();
        }
        if (c2231.m4343()) {
            c2231.m4339();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2231 c2231 = this.f3196;
        c2231.f9269 = colorStateList;
        c2231.m4341();
    }

    public void setRippleColorResource(int i) {
        C2231 c2231 = this.f3196;
        c2231.f9269 = C1266.m2929(getContext(), i);
        c2231.m4341();
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(c2180.m4287(getBoundsAsRectF()));
        }
        this.f3196.m4342(c2180);
    }

    public void setStrokeColor(int i) {
        C2231 c2231 = this.f3196;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (c2231.f9279 == valueOf) {
            return;
        }
        c2231.f9279 = valueOf;
        c2231.m4333();
    }

    public void setStrokeWidth(int i) {
        C2231 c2231 = this.f3196;
        if (i == c2231.f9268) {
            return;
        }
        c2231.f9268 = i;
        c2231.m4333();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f3196.m4339();
        this.f3196.m4337();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m1374() && isEnabled()) {
            this.f3194 = !this.f3194;
            refreshDrawableState();
            m1372();
            InterfaceC0425 interfaceC0425 = this.f3192;
            if (interfaceC0425 != null) {
                interfaceC0425.m1375(this, this.f3194);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m1372() {
        C2231 c2231;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (c2231 = this.f3196).f9282) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        c2231.f9282.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c2231.f9282.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1373(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m1374() {
        C2231 c2231 = this.f3196;
        return c2231 != null && c2231.f9280;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f3196.f9273.m4252(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C2231 c2231 = this.f3196;
        if (c2231.f9279 == colorStateList) {
            return;
        }
        c2231.f9279 = colorStateList;
        c2231.m4333();
    }
}
