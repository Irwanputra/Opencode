package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1119;
import p034.p035.p047.InterfaceC1124;
import p034.p050.p053.C1204;
import p034.p050.p053.C1242;
import p034.p080.C1493;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2229;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p168.C2151;
import p131.p161.p162.p163.p168.InterfaceC2152;
import p131.p161.p162.p163.p172.C2161;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;
import p131.p161.p162.p163.p185.C2252;
import p131.p161.p162.p163.p186.C2291;
import p131.p161.p162.p163.p186.InterfaceC2292;
import p131.p161.p162.p163.p188.C2301;
import p131.p161.p162.p163.p188.C2311;
import p131.p161.p162.p163.p188.C2313;
import p131.p161.p162.p163.p188.C2317;
import p131.p161.p162.p163.p188.C2319;
import p131.p161.p162.p163.p188.C2322;
import p131.p161.p162.p163.p188.ViewTreeObserverOnPreDrawListenerC2312;
import p131.p161.p162.p163.p192.InterfaceC2348;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC1119, InterfaceC1124, InterfaceC2152, InterfaceC2169, CoordinatorLayout.InterfaceC0129 {

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final int f3277 = C2350.Widget_Design_FloatingActionButton;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f3278;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ColorStateList f3279;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f3280;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final C1204 f3281;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final C2151 f3282;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final Rect f3283;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ColorStateList f3284;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C2301 f3285;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ColorStateList f3286;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f3287;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public PorterDuff.Mode f3288;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f3289;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public PorterDuff.Mode f3290;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final Rect f3291;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f3292;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3293;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f3294;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Rect f3295;

        public BaseBehavior() {
            this.f3294 = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.FloatingActionButton_Behavior_Layout);
            this.f3294 = obtainStyledAttributes.getBoolean(C2243.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぁごぐすすぃ */
        public boolean mo346(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m1435(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0133 ? ((CoordinatorLayout.C0133) layoutParams).f994 instanceof BottomSheetBehavior : false) {
                    m1436(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public final boolean m1435(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m1437(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3295 == null) {
                this.f3295 = new Rect();
            }
            Rect rect = this.f3295;
            C2252.m4402(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m1433(null, false);
                return true;
            }
            floatingActionButton.m1426(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: げつ〴ぬぐ */
        public /* bridge */ /* synthetic */ boolean mo354(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return m1438((FloatingActionButton) view, rect);
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public final boolean m1436(View view, FloatingActionButton floatingActionButton) {
            if (!m1437(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0133) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m1433(null, false);
                return true;
            }
            floatingActionButton.m1426(null, false);
            return true;
        }

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public final boolean m1437(View view, FloatingActionButton floatingActionButton) {
            return this.f3294 && ((CoordinatorLayout.C0133) floatingActionButton.getLayoutParams()).f997 == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: なぎぱいぢぎ */
        public void mo361(CoordinatorLayout.C0133 c0133) {
            if (c0133.f986 == 0) {
                c0133.f986 = 80;
            }
        }

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public boolean m1438(FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f3291;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぺふねづ〺 */
        public boolean mo369(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> m331 = coordinatorLayout.m331(floatingActionButton);
            int size = m331.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = m331.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0133 ? ((CoordinatorLayout.C0133) layoutParams).f994 instanceof BottomSheetBehavior : false) && m1436(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m1435(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m340(floatingActionButton, i);
            Rect rect = floatingActionButton.f3291;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C0133 c0133 = (CoordinatorLayout.C0133) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0133).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0133).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0133).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0133).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C1096.m2515(floatingActionButton, i2);
            }
            if (i4 == 0) {
                return true;
            }
            C1096.m2483(floatingActionButton, i4);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$〺つふすそ, reason: contains not printable characters */
    public class C0444 implements InterfaceC2348 {
        public C0444() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$くし〴〺ぅ, reason: contains not printable characters */
    public class C0445<T extends FloatingActionButton> implements C2301.InterfaceC2307 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final InterfaceC2292<T> f3298;

        public C0445(InterfaceC2292<T> interfaceC2292) {
            this.f3298 = interfaceC2292;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0445) && ((C0445) obj).f3298.equals(this.f3298);
        }

        public int hashCode() {
            return this.f3298.hashCode();
        }

        @Override // p131.p161.p162.p163.p188.C2301.InterfaceC2307
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1439() {
            InterfaceC2292<T> interfaceC2292 = this.f3298;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C0399 c0399 = (BottomAppBar.C0399) interfaceC2292;
            c0399.getClass();
            BottomAppBar.this.f3015.m4253(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // p131.p161.p162.p163.p188.C2301.InterfaceC2307
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1440() {
            C2161 topEdgeTreatment;
            C2161 topEdgeTreatment2;
            C2161 topEdgeTreatment3;
            C2161 topEdgeTreatment4;
            InterfaceC2292<T> interfaceC2292 = this.f3298;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.C0399 c0399 = (BottomAppBar.C0399) interfaceC2292;
            c0399.getClass();
            float translationX = floatingActionButton.getTranslationX();
            topEdgeTreatment = BottomAppBar.this.getTopEdgeTreatment();
            if (topEdgeTreatment.f9039 != translationX) {
                topEdgeTreatment4 = BottomAppBar.this.getTopEdgeTreatment();
                topEdgeTreatment4.f9039 = translationX;
                BottomAppBar.this.f3015.invalidateSelf();
            }
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            topEdgeTreatment2 = BottomAppBar.this.getTopEdgeTreatment();
            if (topEdgeTreatment2.f9038 != max) {
                topEdgeTreatment3 = BottomAppBar.this.getTopEdgeTreatment();
                topEdgeTreatment3.m4239(max);
                BottomAppBar.this.f3015.invalidateSelf();
            }
            BottomAppBar.this.f3015.m4253(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$げつ〴ぬぐ, reason: contains not printable characters */
    public static abstract class AbstractC0446 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1441(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1442(FloatingActionButton floatingActionButton) {
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.floatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C2301 getImpl() {
        if (this.f3285 == null) {
            this.f3285 = Build.VERSION.SDK_INT >= 21 ? new C2322(this, new C0444()) : new C2301(this, new C0444());
        }
        return this.f3285;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static int m1422(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo4471(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f3284;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3290;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0129
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo4470();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f9556;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f9531;
    }

    public Drawable getContentBackground() {
        return getImpl().f9544;
    }

    public int getCustomSize() {
        return this.f3280;
    }

    public int getExpandedComponentIdHint() {
        return this.f3282.f9007;
    }

    public C2291 getHideMotionSpec() {
        return getImpl().f9536;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3279;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3279;
    }

    public C2180 getShapeAppearanceModel() {
        C2180 c2180 = getImpl().f9539;
        c2180.getClass();
        return c2180;
    }

    public C2291 getShowMotionSpec() {
        return getImpl().f9534;
    }

    public int getSize() {
        return this.f3292;
    }

    public int getSizeDimension() {
        return m1423(this.f3292);
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // p034.p035.p047.InterfaceC1124
    public ColorStateList getSupportImageTintList() {
        return this.f3286;
    }

    @Override // p034.p035.p047.InterfaceC1124
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3288;
    }

    public boolean getUseCompatPadding() {
        return this.f3289;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo4460();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2301 impl = getImpl();
        C2163 c2163 = impl.f9528;
        if (c2163 != null) {
            C1687.m3669(impl.f9535, c2163);
        }
        if (impl.mo4461()) {
            ViewTreeObserver viewTreeObserver = impl.f9535.getViewTreeObserver();
            if (impl.f9543 == null) {
                impl.f9543 = new ViewTreeObserverOnPreDrawListenerC2312(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f9543);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2301 impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f9535.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f9543;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f9543 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f3293 = (sizeDimension - this.f3287) / 2;
        getImpl().m4458();
        int min = Math.min(m1422(sizeDimension, i), m1422(sizeDimension, i2));
        Rect rect = this.f3291;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f1099);
        C2151 c2151 = this.f3282;
        Bundle orDefault = extendableSavedState.f3435.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        c2151.getClass();
        c2151.f9006 = bundle.getBoolean("expanded", false);
        c2151.f9007 = bundle.getInt("expandedComponentIdHint", 0);
        if (c2151.f9006) {
            ViewParent parent = c2151.f9008.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m325(c2151.f9008);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C1493<String, Bundle> c1493 = extendableSavedState.f3435;
        C2151 c2151 = this.f3282;
        c2151.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c2151.f9006);
        bundle.putInt("expandedComponentIdHint", c2151.f9007);
        c1493.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m1424(this.f3283) && !this.f3283.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3284 != colorStateList) {
            this.f3284 = colorStateList;
            C2301 impl = getImpl();
            C2163 c2163 = impl.f9528;
            if (c2163 != null) {
                c2163.setTintList(colorStateList);
            }
            C2313 c2313 = impl.f9553;
            if (c2313 != null) {
                c2313.m4484(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3290 != mode) {
            this.f3290 = mode;
            C2163 c2163 = getImpl().f9528;
            if (c2163 != null) {
                c2163.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C2301 impl = getImpl();
        if (impl.f9527 != f) {
            impl.f9527 = f;
            impl.mo4474(f, impl.f9556, impl.f9531);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C2301 impl = getImpl();
        if (impl.f9556 != f) {
            impl.f9556 = f;
            impl.mo4474(impl.f9527, f, impl.f9531);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C2301 impl = getImpl();
        if (impl.f9531 != f) {
            impl.f9531 = f;
            impl.mo4474(impl.f9527, impl.f9556, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f3280) {
            this.f3280 = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m4462(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f9548) {
            getImpl().f9548 = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f3282.f9007 = i;
    }

    public void setHideMotionSpec(C2291 c2291) {
        getImpl().f9536 = c2291;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C2291.m4449(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C2301 impl = getImpl();
            impl.m4463(impl.f9551);
            if (this.f3286 != null) {
                m1431();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f3281.m2683(i);
        m1431();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3279 != colorStateList) {
            this.f3279 = colorStateList;
            getImpl().mo4469(this.f3279);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m4478();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m4478();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C2301 impl = getImpl();
        impl.f9530 = z;
        impl.m4458();
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        getImpl().m4475(c2180);
    }

    public void setShowMotionSpec(C2291 c2291) {
        getImpl().f9534 = c2291;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C2291.m4449(getContext(), i));
    }

    public void setSize(int i) {
        this.f3280 = 0;
        if (i != this.f3292) {
            this.f3292 = i;
            requestLayout();
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // p034.p035.p047.InterfaceC1124
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3286 != colorStateList) {
            this.f3286 = colorStateList;
            m1431();
        }
    }

    @Override // p034.p035.p047.InterfaceC1124
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3288 != mode) {
            this.f3288 = mode;
            m1431();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m4464();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m4464();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m4464();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3289 != z) {
            this.f3289 = z;
            getImpl().mo4480();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int m1423(int i) {
        int i2 = this.f3280;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C2324.design_fab_size_normal : C2324.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m1423(1) : m1423(0);
    }

    @Deprecated
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m1424(Rect rect) {
        if (!C1096.m2517(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m1429(rect);
        return true;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m1425() {
        return getImpl().m4456();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m1426(AbstractC0446 abstractC0446, boolean z) {
        C2301 impl = getImpl();
        C2317 c2317 = abstractC0446 == null ? null : new C2317(this, abstractC0446);
        if (impl.m4479()) {
            return;
        }
        Animator animator = impl.f9537;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m4468()) {
            impl.f9535.m1445(0, z);
            impl.f9535.setAlpha(1.0f);
            impl.f9535.setScaleY(1.0f);
            impl.f9535.setScaleX(1.0f);
            impl.m4463(1.0f);
            if (c2317 != null) {
                c2317.f9595.mo1441(c2317.f9594);
                return;
            }
            return;
        }
        if (impl.f9535.getVisibility() != 0) {
            impl.f9535.setAlpha(0.0f);
            impl.f9535.setScaleY(0.0f);
            impl.f9535.setScaleX(0.0f);
            impl.m4463(0.0f);
        }
        C2291 c2291 = impl.f9534;
        if (c2291 == null) {
            if (impl.f9550 == null) {
                impl.f9550 = C2291.m4449(impl.f9535.getContext(), C2229.design_fab_show_motion_spec);
            }
            c2291 = impl.f9550;
            c2291.getClass();
        }
        AnimatorSet m4457 = impl.m4457(c2291, 1.0f, 1.0f, 1.0f);
        m4457.addListener(new C2311(impl, z, c2317));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f9546;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m4457.addListener(it.next());
            }
        }
        m4457.start();
    }

    @Override // p131.p161.p162.p163.p168.InterfaceC2152
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo1427() {
        return this.f3282.f9006;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1428(Animator.AnimatorListener animatorListener) {
        C2301 impl = getImpl();
        if (impl.f9546 == null) {
            impl.f9546 = new ArrayList<>();
        }
        impl.f9546.add(animatorListener);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m1429(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f3291;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m1430(InterfaceC2292<? extends FloatingActionButton> interfaceC2292) {
        C2301 impl = getImpl();
        C0445 c0445 = new C0445(interfaceC2292);
        if (impl.f9529 == null) {
            impl.f9529 = new ArrayList<>();
        }
        impl.f9529.add(c0445);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m1431() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f3286;
        if (colorStateList == null) {
            C2786.m4822(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f3288;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1242.m2866(colorForState, mode));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1432(Animator.AnimatorListener animatorListener) {
        C2301 impl = getImpl();
        if (impl.f9554 == null) {
            impl.f9554 = new ArrayList<>();
        }
        impl.f9554.add(animatorListener);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1433(AbstractC0446 abstractC0446, boolean z) {
        C2301 impl = getImpl();
        C2317 c2317 = abstractC0446 == null ? null : new C2317(this, abstractC0446);
        if (impl.m4456()) {
            return;
        }
        Animator animator = impl.f9537;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m4468()) {
            impl.f9535.m1445(z ? 8 : 4, z);
            if (c2317 != null) {
                c2317.f9595.mo1442(c2317.f9594);
                return;
            }
            return;
        }
        C2291 c2291 = impl.f9536;
        if (c2291 == null) {
            if (impl.f9555 == null) {
                impl.f9555 = C2291.m4449(impl.f9535.getContext(), C2229.design_fab_hide_motion_spec);
            }
            c2291 = impl.f9555;
            c2291.getClass();
        }
        AnimatorSet m4457 = impl.m4457(c2291, 0.0f, 0.0f, 0.0f);
        m4457.addListener(new C2319(impl, z, c2317));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f9554;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m4457.addListener(it.next());
            }
        }
        m4457.start();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m1434() {
        return getImpl().m4479();
    }
}
