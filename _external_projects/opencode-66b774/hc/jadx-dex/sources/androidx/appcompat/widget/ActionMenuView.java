package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ActionMenuView extends dev.epro.r0.W17553834374836380220 implements dev.epro.r0.O691910143173251949, dev.epro.r0.G184438488898427898 {
    public dev.epro.r0.T8605657386197958581 p;
    public android.content.Context q;
    public int r;
    public boolean s;
    public dev.epro.r0.T1878852318042345820 t;
    public dev.epro.r0.E3501342855209648231 u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public dev.epro.r0.P11864007600649976263 z;

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f);
        this.y = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static dev.epro.r0.F13271443510022614086 i() {
        dev.epro.r0.F13271443510022614086 f13271443510022614086 = new dev.epro.r0.F13271443510022614086(-2, -2);
        f13271443510022614086.a = false;
        ((android.widget.LinearLayout.LayoutParams) f13271443510022614086).gravity = 16;
        return f13271443510022614086;
    }

    public static dev.epro.r0.F13271443510022614086 j(android.view.ViewGroup.LayoutParams layoutParams) {
        dev.epro.r0.F13271443510022614086 f13271443510022614086;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof dev.epro.r0.F13271443510022614086) {
            dev.epro.r0.F13271443510022614086 f132714435100226140862 = (dev.epro.r0.F13271443510022614086) layoutParams;
            f13271443510022614086 = new dev.epro.r0.F13271443510022614086(f132714435100226140862);
            f13271443510022614086.a = f132714435100226140862.a;
        } else {
            f13271443510022614086 = new dev.epro.r0.F13271443510022614086(layoutParams);
        }
        if (((android.widget.LinearLayout.LayoutParams) f13271443510022614086).gravity <= 0) {
            ((android.widget.LinearLayout.LayoutParams) f13271443510022614086).gravity = 16;
        }
        return f13271443510022614086;
    }

    public final void a(dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        this.p = t8605657386197958581;
    }

    public final boolean b(dev.epro.r0.I4217019646703278835 i4217019646703278835) {
        return this.p.q(i4217019646703278835, (dev.epro.r0.U13539487668147601899) null, 0);
    }

    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dev.epro.r0.F13271443510022614086;
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final /* bridge */ /* synthetic */ dev.epro.r0.L2038580209622790010 e() {
        return i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dev.epro.r0.L2038580209622790010 f(android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.F13271443510022614086(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ dev.epro.r0.L2038580209622790010 g(android.view.ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.F13271443510022614086(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.Menu getMenu() {
        dev.epro.r0.T8605657386197958581 t8605657386197958581 = this.p;
        if (t8605657386197958581 != null) {
            return t8605657386197958581;
        }
        android.content.Context context = getContext();
        dev.epro.r0.T8605657386197958581 t86056573861979585812 = new dev.epro.r0.T8605657386197958581(context);
        this.p = t86056573861979585812;
        t86056573861979585812.e = new dev.epro.r0.H12843822278061842084(this, (byte) 8);
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = new dev.epro.r0.T1878852318042345820(context);
        this.t = t1878852318042345820;
        t1878852318042345820.l = true;
        t1878852318042345820.m = true;
        t1878852318042345820.e = new dev.epro.r0.N5158094851646208854((byte) 29);
        this.p.b(t1878852318042345820, this.q);
        dev.epro.r0.T1878852318042345820 t18788523180423458202 = this.t;
        t18788523180423458202.h = this;
        dev.epro.r0.T8605657386197958581 t86056573861979585813 = t18788523180423458202.c;
        this.p = t86056573861979585813;
        return t86056573861979585813;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.t;
        dev.epro.r0.R11798632102026936588 r11798632102026936588 = t1878852318042345820.i;
        if (r11798632102026936588 != null) {
            return r11798632102026936588.getDrawable();
        }
        if (t1878852318042345820.k) {
            return t1878852318042345820.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        dev.epro.r0.V17859802919350004506 childAt = getChildAt(i - 1);
        dev.epro.r0.V17859802919350004506 childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof dev.epro.r0.V17859802919350004506)) {
            zB = childAt.b();
        }
        return (i <= 0 || !(childAt2 instanceof dev.epro.r0.V17859802919350004506)) ? zB : childAt2.c() | zB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.t;
        if (t1878852318042345820 != null) {
            t1878852318042345820.c();
            if (this.t.g()) {
                this.t.e();
                this.t.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.t;
        if (t1878852318042345820 != null) {
            t1878852318042345820.e();
            dev.epro.r0.H10500197361170225543 h10500197361170225543 = t1878852318042345820.t;
            if (h10500197361170225543 == null || !h10500197361170225543.b()) {
                return;
            }
            ((dev.epro.r0.V2419641781538918069) h10500197361170225543).i.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.v) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = dev.epro.r0.G17670069693736004358.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                dev.epro.r0.F13271443510022614086 layoutParams = childAt.getLayoutParams();
                if (layoutParams.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin) + ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = java.lang.Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                android.view.View childAt3 = getChildAt(i14);
                dev.epro.r0.F13271443510022614086 layoutParams2 = childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.a) {
                    int i15 = width2 - ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((android.widget.LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt4 = getChildAt(i17);
            dev.epro.r0.F13271443510022614086 layoutParams3 = childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.a) {
                int i18 = paddingLeft2 + ((android.widget.LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = dev.epro.r0.L11610354117192841236.e(measuredWidth4, ((android.widget.LinearLayout.LayoutParams) layoutParams3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        dev.epro.r0.T8605657386197958581 t8605657386197958581;
        boolean z = this.v;
        boolean z2 = android.view.View.MeasureSpec.getMode(i) == 1073741824;
        this.v = z2;
        if (z != z2) {
            this.w = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        if (this.v && (t8605657386197958581 = this.p) != null && size != this.w) {
            this.w = size;
            t8605657386197958581.p(true);
        }
        int childCount = getChildCount();
        if (!this.v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                dev.epro.r0.F13271443510022614086 layoutParams = getChildAt(i7).getLayoutParams();
                ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.x;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.y;
            if (i14 >= childCount2) {
                break;
            }
            android.view.View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                dev.epro.r0.F13271443510022614086 layoutParams2 = childAt.getLayoutParams();
                layoutParams2.f = false;
                layoutParams2.c = 0;
                layoutParams2.b = 0;
                layoutParams2.d = false;
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.e = z4 && !android.text.TextUtils.isEmpty(((androidx.appcompat.view.menu.ActionMenuItemView) childAt).getText());
                int i18 = layoutParams2.a ? 1 : i10;
                dev.epro.r0.F13271443510022614086 layoutParams3 = childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - i17, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = z4 ? (androidx.appcompat.view.menu.ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || android.text.TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                layoutParams3.d = !layoutParams3.a && z6;
                layoutParams3.b = i6;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = java.lang.Math.max(iMax2, i6);
                if (layoutParams2.d) {
                    i15++;
                }
                if (layoutParams2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                dev.epro.r0.F13271443510022614086 layoutParams4 = getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (layoutParams4.d) {
                    int i28 = layoutParams4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                android.view.View childAt2 = getChildAt(i30);
                dev.epro.r0.F13271443510022614086 layoutParams5 = childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && layoutParams5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    layoutParams5.b += r11;
                    layoutParams5.f = r11;
                    i23--;
                } else if (layoutParams5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = java.lang.Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !getChildAt(0).getLayoutParams().e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !getChildAt(i31).getLayoutParams().e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    android.view.View childAt3 = getChildAt(i33);
                    dev.epro.r0.F13271443510022614086 layoutParams6 = childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        layoutParams6.c = i32;
                        layoutParams6.f = true;
                        if (i33 == 0 && !layoutParams6.e) {
                            ((android.widget.LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (layoutParams6.a) {
                        layoutParams6.c = i32;
                        layoutParams6.f = true;
                        ((android.widget.LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((android.widget.LinearLayout.LayoutParams) layoutParams6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((android.widget.LinearLayout.LayoutParams) layoutParams6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                android.view.View childAt4 = getChildAt(i34);
                dev.epro.r0.F13271443510022614086 layoutParams7 = childAt4.getLayoutParams();
                if (layoutParams7.f) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((layoutParams7.b * i22) + layoutParams7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(dev.epro.r0.P11864007600649976263 p11864007600649976263) {
        this.z = p11864007600649976263;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.t;
        dev.epro.r0.D18165525574842162311 d18165525574842162311 = t1878852318042345820.i;
        if (d18165525574842162311 != null) {
            d18165525574842162311.setImageDrawable(drawable);
        } else {
            t1878852318042345820.k = true;
            t1878852318042345820.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(dev.epro.r0.T1878852318042345820 t1878852318042345820) {
        this.t = t1878852318042345820;
        t1878852318042345820.h = this;
        this.p = t1878852318042345820.c;
    }

    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(android.content.Context context) {
        this(context, null);
    }
}
