package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p043.C1067;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1121;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p185.C2252;
import p131.p161.p162.p163.p185.C2260;
import p131.p161.p162.p163.p186.C2294;
import p131.p161.p162.p163.p191.C2344;
import p131.p161.p162.p163.p191.C2345;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final int f2911 = C2350.Widget_Design_CollapsingToolbar;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2912;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2913;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public C1072 f2914;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2915;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f2916;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public Drawable f2917;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f2918;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Drawable f2919;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2920;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public long f2921;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2922;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f2923;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public View f2924;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final C2260 f2925;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public AppBarLayout.InterfaceC0388 f2926;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public View f2927;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f2928;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ValueAnimator f2929;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Toolbar f2930;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f2931;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f2932;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2933;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Rect f2934;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f2935;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f2936;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2936 = 0;
            this.f2935 = 0.5f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2936 = 0;
            this.f2935 = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.CollapsingToolbarLayout_Layout);
            this.f2936 = obtainStyledAttributes.getInt(C2243.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f2935 = obtainStyledAttributes.getFloat(C2243.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2936 = 0;
            this.f2935 = 0.5f;
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$〺つふすそ, reason: contains not printable characters */
    public class C0390 implements AppBarLayout.InterfaceC0388 {
        public C0390() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC0387
        /* renamed from: げつ〴ぬぐ */
        public void mo1284(AppBarLayout appBarLayout, int i) {
            int m4812;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f2931 = i;
            C1072 c1072 = collapsingToolbarLayout.f2914;
            int m2424 = c1072 != null ? c1072.m2424() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C2345 m1286 = CollapsingToolbarLayout.m1286(childAt);
                int i3 = layoutParams.f2936;
                if (i3 == 1) {
                    m4812 = C2786.m4812(-i, 0, CollapsingToolbarLayout.this.m1287(childAt));
                } else if (i3 == 2) {
                    m4812 = Math.round((-i) * layoutParams.f2935);
                }
                m1286.m4499(m4812);
            }
            CollapsingToolbarLayout.this.m1290();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f2917 != null && m2424 > 0) {
                C1096.m2508(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f2925.m4434(Math.abs(i) / ((CollapsingToolbarLayout.this.getHeight() - C1096.m2485(CollapsingToolbarLayout.this)) - m2424));
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0391 implements InterfaceC1121 {
        public C0391() {
        }

        @Override // p034.p035.p045.InterfaceC1121
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo370(View view, C1072 c1072) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            C1072 c10722 = C1096.m2512(collapsingToolbarLayout) ? c1072 : null;
            if (!C2786.m4781(collapsingToolbarLayout.f2914, c10722)) {
                collapsingToolbarLayout.f2914 = c10722;
                collapsingToolbarLayout.requestLayout();
            }
            return c1072.m2423();
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m1285(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C2345 m1286(View view) {
        int i = C2248.view_offset_helper;
        C2345 c2345 = (C2345) view.getTag(i);
        if (c2345 != null) {
            return c2345;
        }
        C2345 c23452 = new C2345(view);
        view.setTag(i, c23452);
        return c23452;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m1288();
        if (this.f2930 == null && (drawable = this.f2919) != null && this.f2918 > 0) {
            drawable.mutate().setAlpha(this.f2918);
            this.f2919.draw(canvas);
        }
        if (this.f2928 && this.f2932) {
            this.f2925.m4415(canvas);
        }
        if (this.f2917 == null || this.f2918 <= 0) {
            return;
        }
        C1072 c1072 = this.f2914;
        int m2424 = c1072 != null ? c1072.m2424() : 0;
        if (m2424 > 0) {
            this.f2917.setBounds(0, -this.f2931, getWidth(), m2424 - this.f2931);
            this.f2917.mutate().setAlpha(this.f2918);
            this.f2917.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f2919
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            int r3 = r4.f2918
            if (r3 <= 0) goto L2d
            android.view.View r3 = r4.f2924
            if (r3 == 0) goto L14
            if (r3 != r4) goto L11
            goto L14
        L11:
            if (r6 != r3) goto L1a
            goto L18
        L14:
            androidx.appcompat.widget.Toolbar r3 = r4.f2930
            if (r6 != r3) goto L1a
        L18:
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.f2918
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.f2919
            r0.draw(r5)
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L38
            if (r0 == 0) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2917;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2919;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C2260 c2260 = this.f2925;
        if (c2260 != null) {
            z |= c2260.m4419(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f2925.f9395;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f2925.f9435;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f2919;
    }

    public int getExpandedTitleGravity() {
        return this.f2925.f9399;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f2916;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f2933;
    }

    public int getExpandedTitleMarginStart() {
        return this.f2915;
    }

    public int getExpandedTitleMarginTop() {
        return this.f2912;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f2925.f9418;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getMaxLines() {
        return this.f2925.f9413;
    }

    public int getScrimAlpha() {
        return this.f2918;
    }

    public long getScrimAnimationDuration() {
        return this.f2921;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f2922;
        if (i >= 0) {
            return i;
        }
        C1072 c1072 = this.f2914;
        int m2424 = c1072 != null ? c1072.m2424() : 0;
        int m2485 = C1096.m2485(this);
        return m2485 > 0 ? Math.min((m2485 * 2) + m2424, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f2917;
    }

    public CharSequence getTitle() {
        if (this.f2928) {
            return this.f2925.f9398;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(C1096.m2512((View) parent));
            if (this.f2926 == null) {
                this.f2926 = new C0390();
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            AppBarLayout.InterfaceC0388 interfaceC0388 = this.f2926;
            if (appBarLayout.f2896 == null) {
                appBarLayout.f2896 = new ArrayList();
            }
            if (interfaceC0388 != null && !appBarLayout.f2896.contains(interfaceC0388)) {
                appBarLayout.f2896.add(interfaceC0388);
            }
            C1096.m2518(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<AppBarLayout.InterfaceC0387> list;
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC0388 interfaceC0388 = this.f2926;
        if (interfaceC0388 != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).f2896) != null && interfaceC0388 != null) {
            list.remove(interfaceC0388);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C1072 c1072 = this.f2914;
        if (c1072 != null) {
            int m2424 = c1072.m2424();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C1096.m2512(childAt) && childAt.getTop() < m2424) {
                    C1096.m2515(childAt, m2424);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            C2345 m1286 = m1286(getChildAt(i6));
            m1286.f9636 = m1286.f9638.getTop();
            m1286.f9637 = m1286.f9638.getLeft();
        }
        if (this.f2928 && (view = this.f2927) != null) {
            boolean z2 = C1096.m2507(view) && this.f2927.getVisibility() == 0;
            this.f2932 = z2;
            if (z2) {
                boolean z3 = C1096.m2491(this) == 1;
                View view2 = this.f2924;
                if (view2 == null) {
                    view2 = this.f2930;
                }
                int m1287 = m1287(view2);
                C2252.m4402(this, this.f2927, this.f2934);
                C2260 c2260 = this.f2925;
                int i7 = this.f2934.left;
                Toolbar toolbar = this.f2930;
                int titleMarginEnd = i7 + (z3 ? toolbar.getTitleMarginEnd() : toolbar.getTitleMarginStart());
                int titleMarginTop = this.f2930.getTitleMarginTop() + this.f2934.top + m1287;
                int i8 = this.f2934.right;
                Toolbar toolbar2 = this.f2930;
                int titleMarginStart = i8 - (z3 ? toolbar2.getTitleMarginStart() : toolbar2.getTitleMarginEnd());
                int titleMarginBottom = (this.f2934.bottom + m1287) - this.f2930.getTitleMarginBottom();
                if (!C2260.m4410(c2260.f9425, titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom)) {
                    c2260.f9425.set(titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom);
                    c2260.f9409 = true;
                    c2260.m4427();
                }
                C2260 c22602 = this.f2925;
                int i9 = z3 ? this.f2933 : this.f2915;
                int i10 = this.f2934.top + this.f2912;
                int i11 = (i3 - i) - (z3 ? this.f2915 : this.f2933);
                int i12 = (i4 - i2) - this.f2916;
                if (!C2260.m4410(c22602.f9438, i9, i10, i11, i12)) {
                    c22602.f9438.set(i9, i10, i11, i12);
                    c22602.f9409 = true;
                    c22602.m4427();
                }
                this.f2925.m4430();
            }
        }
        if (this.f2930 != null) {
            if (this.f2928 && TextUtils.isEmpty(this.f2925.f9398)) {
                setTitle(this.f2930.getTitle());
            }
            View view3 = this.f2924;
            if (view3 == null || view3 == this) {
                view3 = this.f2930;
            }
            setMinimumHeight(m1285(view3));
        }
        m1290();
        int childCount3 = getChildCount();
        for (int i13 = 0; i13 < childCount3; i13++) {
            m1286(getChildAt(i13)).m4500();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m1288();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C1072 c1072 = this.f2914;
        int m2424 = c1072 != null ? c1072.m2424() : 0;
        if (mode != 0 || m2424 <= 0) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m2424, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f2919;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        C2260 c2260 = this.f2925;
        if (c2260.f9395 != i) {
            c2260.f9395 = i;
            c2260.m4430();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f2925.m4421(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C2260 c2260 = this.f2925;
        if (c2260.f9427 != colorStateList) {
            c2260.f9427 = colorStateList;
            c2260.m4430();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f2925.m4425(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f2919;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2919 = mutate;
            if (mutate != null) {
                mutate.setBounds(0, 0, getWidth(), getHeight());
                this.f2919.setCallback(this);
                this.f2919.setAlpha(this.f2918);
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C1067.m2406(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C2260 c2260 = this.f2925;
        if (c2260.f9399 != i) {
            c2260.f9399 = i;
            c2260.m4430();
        }
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f2915 = i;
        this.f2912 = i2;
        this.f2933 = i3;
        this.f2916 = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f2916 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f2933 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f2915 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f2912 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f2925.m4431(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C2260 c2260 = this.f2925;
        if (c2260.f9445 != colorStateList) {
            c2260.f9445 = colorStateList;
            c2260.m4430();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f2925.m4428(typeface);
    }

    public void setMaxLines(int i) {
        C2260 c2260 = this.f2925;
        if (i != c2260.f9413) {
            c2260.f9413 = i;
            c2260.m4429();
            c2260.m4430();
        }
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f2918) {
            if (this.f2919 != null && (toolbar = this.f2930) != null) {
                C1096.m2508(toolbar);
            }
            this.f2918 = i;
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f2921 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f2922 != i) {
            this.f2922 = i;
            m1290();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, C1096.m2517(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f2923 != z) {
            int i = Base64.BASELENGTH;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m1288();
                ValueAnimator valueAnimator = this.f2929;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f2929 = valueAnimator2;
                    valueAnimator2.setDuration(this.f2921);
                    this.f2929.setInterpolator(i > this.f2918 ? C2294.f9508 : C2294.f9511);
                    this.f2929.addUpdateListener(new C2344(this));
                } else if (valueAnimator.isRunning()) {
                    this.f2929.cancel();
                }
                this.f2929.setIntValues(this.f2918, i);
                this.f2929.start();
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f2923 = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f2917;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2917 = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2917.setState(getDrawableState());
                }
                C2786.m4783(this.f2917, C1096.m2491(this));
                this.f2917.setVisible(getVisibility() == 0, false);
                this.f2917.setCallback(this);
                this.f2917.setAlpha(this.f2918);
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C1067.m2406(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f2925.m4417(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f2928) {
            this.f2928 = z;
            setContentDescription(getTitle());
            m1289();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2917;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2917.setVisible(z, false);
        }
        Drawable drawable2 = this.f2919;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f2919.setVisible(z, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2919 || drawable == this.f2917;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int m1287(View view) {
        return ((getHeight() - m1286(view).f9636) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1288() {
        if (this.f2913) {
            Toolbar toolbar = null;
            this.f2930 = null;
            this.f2924 = null;
            int i = this.f2920;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.f2930 = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f2924 = view;
                }
            }
            if (this.f2930 == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.f2930 = toolbar;
            }
            m1289();
            this.f2913 = false;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1289() {
        View view;
        if (!this.f2928 && (view = this.f2927) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2927);
            }
        }
        if (!this.f2928 || this.f2930 == null) {
            return;
        }
        if (this.f2927 == null) {
            this.f2927 = new View(getContext());
        }
        if (this.f2927.getParent() == null) {
            this.f2930.addView(this.f2927, -1, -1);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1290() {
        if (this.f2919 == null && this.f2917 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f2931 < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }
}
