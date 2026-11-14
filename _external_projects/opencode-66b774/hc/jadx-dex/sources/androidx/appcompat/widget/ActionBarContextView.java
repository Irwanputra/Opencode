package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {
    public int A;
    public final dev.epro.r0.C12564307762809987743 a;
    public final android.content.Context b;
    public androidx.appcompat.widget.ActionMenuView c;
    public dev.epro.r0.T1878852318042345820 d;
    public int e;
    public dev.epro.r0.Q1445202285683234142 f;
    public boolean g;
    public boolean h;
    public java.lang.CharSequence i;
    public java.lang.CharSequence j;
    public android.view.View k;
    public android.view.View l;
    public android.view.View m;
    public android.widget.LinearLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public android.widget.TextView f139o;
    public android.widget.TextView p;
    public final int q;
    public final int r;
    public boolean s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 2130968607);
        this.a = new dev.epro.r0.C12564307762809987743(this);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(2130968581, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.d, 2130968607, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : dev.epro.r0.M9216324016624295870.G(context, resourceId));
        this.q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(2, 2131492869);
        typedArrayObtainStyledAttributes.recycle();
        this.x = getPaddingLeft();
        this.y = getPaddingTop();
        this.z = getPaddingRight();
        this.A = getPaddingBottom();
    }

    public static int f(android.view.View view, int i, int i2) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return java.lang.Math.max(0, i - view.getMeasuredWidth());
    }

    public static int h(android.view.View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, androidx.appcompat.widget.ActionMenuView] */
    public final void c(dev.epro.r0.F3205875925450835131 f3205875925450835131) {
        android.view.View view = this.k;
        if (view == null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.t, (android.view.ViewGroup) this, false);
            this.k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        android.view.View viewFindViewById = this.k.findViewById(2131296323);
        this.l = viewFindViewById;
        viewFindViewById.setOnClickListener(new dev.epro.r0.G17185360867502361524(f3205875925450835131, (byte) 0));
        dev.epro.r0.T8605657386197958581 t8605657386197958581C = f3205875925450835131.c();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.d;
        if (t1878852318042345820 != null) {
            t1878852318042345820.e();
            dev.epro.r0.H10500197361170225543 h10500197361170225543 = t1878852318042345820.t;
            if (h10500197361170225543 != null && h10500197361170225543.b()) {
                ((dev.epro.r0.V2419641781538918069) h10500197361170225543).i.dismiss();
            }
        }
        dev.epro.r0.T1878852318042345820 t18788523180423458202 = new dev.epro.r0.T1878852318042345820(getContext());
        this.d = t18788523180423458202;
        t18788523180423458202.l = true;
        t18788523180423458202.m = true;
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        t8605657386197958581C.b(this.d, this.b);
        dev.epro.r0.T1878852318042345820 t18788523180423458203 = this.d;
        dev.epro.r0.G184438488898427898 g184438488898427898 = t18788523180423458203.h;
        if (g184438488898427898 == null) {
            dev.epro.r0.G184438488898427898 g184438488898427898Inflate = t18788523180423458203.d.inflate(t18788523180423458203.f, (android.view.ViewGroup) this, false);
            t18788523180423458203.h = g184438488898427898Inflate;
            g184438488898427898Inflate.a(t18788523180423458203.c);
            t18788523180423458203.c();
        }
        dev.epro.r0.G184438488898427898 g1844384888984278982 = t18788523180423458203.h;
        if (g184438488898427898 != g1844384888984278982) {
            ((androidx.appcompat.widget.ActionMenuView) g1844384888984278982).setPresenter(t18788523180423458203);
        }
        ?? r1 = (androidx.appcompat.widget.ActionMenuView) g1844384888984278982;
        this.c = r1;
        r1.setBackground(null);
        addView((android.view.View) this.c, layoutParams);
    }

    public final void d() {
        if (this.n == null) {
            android.view.LayoutInflater.from(getContext()).inflate(2131492864, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.f139o = (android.widget.TextView) linearLayout.findViewById(2131296314);
            this.p = (android.widget.TextView) this.n.findViewById(2131296313);
            int i = this.q;
            if (i != 0) {
                this.f139o.setTextAppearance(getContext(), i);
            }
            int i2 = this.r;
            if (i2 != 0) {
                this.p.setTextAppearance(getContext(), i2);
            }
        }
        this.f139o.setText(this.i);
        this.p.setText(this.j);
        boolean zIsEmpty = android.text.TextUtils.isEmpty(this.i);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(this.j);
        this.p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public final void e() {
        removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        android.view.View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void g(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dev.epro.r0.Y17304307076558258116.a, 2130968584, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.d;
        if (t1878852318042345820 != null) {
            android.content.res.Configuration configuration2 = t1878852318042345820.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            t1878852318042345820.p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            dev.epro.r0.T8605657386197958581 t8605657386197958581 = t1878852318042345820.c;
            if (t8605657386197958581 != null) {
                t8605657386197958581.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.j;
    }

    public java.lang.CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            dev.epro.r0.Q1445202285683234142 q1445202285683234142 = this.f;
            if (q1445202285683234142 != null) {
                q1445202285683234142.b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dev.epro.r0.Q1445202285683234142 j(int i, long j) {
        dev.epro.r0.Q1445202285683234142 q1445202285683234142 = this.f;
        if (q1445202285683234142 != null) {
            q1445202285683234142.b();
        }
        dev.epro.r0.C12564307762809987743 c12564307762809987743 = this.a;
        if (i != 0) {
            dev.epro.r0.Q1445202285683234142 q1445202285683234142A = dev.epro.r0.W10240872260424387225.a(this);
            q1445202285683234142A.a(0.0f);
            q1445202285683234142A.c(j);
            c12564307762809987743.c.f = q1445202285683234142A;
            c12564307762809987743.b = i;
            q1445202285683234142A.d(c12564307762809987743);
            return q1445202285683234142A;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        dev.epro.r0.Q1445202285683234142 q1445202285683234142A2 = dev.epro.r0.W10240872260424387225.a(this);
        q1445202285683234142A2.a(1.0f);
        q1445202285683234142A2.c(j);
        c12564307762809987743.c.f = q1445202285683234142A2;
        c12564307762809987743.b = i;
        q1445202285683234142A2.d(c12564307762809987743);
        return q1445202285683234142A2;
    }

    public final void k() {
        super.setPadding(this.u + this.x, this.v + this.y, this.w + this.z, this.A);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        g(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, dev.epro.r0.Y17304307076558258116.d, 2130968607, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = this.d;
        if (t1878852318042345820 != null) {
            t1878852318042345820.e();
            dev.epro.r0.H10500197361170225543 h10500197361170225543 = this.d.t;
            if (h10500197361170225543 == null || !h10500197361170225543.b()) {
                return;
            }
            ((dev.epro.r0.V2419641781538918069) h10500197361170225543).i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = dev.epro.r0.G17670069693736004358.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.k;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iH = h(this.k, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iH - i6 : iH + i6;
        }
        android.widget.LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null && linearLayout.getVisibility() != 8) {
            paddingRight += h(this.n, paddingRight, paddingTop, paddingTop2, z3);
        }
        android.view.View view2 = this.m;
        if (view2 != null) {
            h(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        dev.epro.r0.O691910143173251949 o691910143173251949 = this.c;
        if (o691910143173251949 != null) {
            h(o691910143173251949, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            dev.epro.r0.S10973172697741180971.m(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            dev.epro.r0.S10973172697741180971.m(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.v : android.view.View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        android.view.View view = this.k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        dev.epro.r0.O691910143173251949 o691910143173251949 = this.c;
        if (o691910143173251949 != null && o691910143173251949.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        android.widget.LinearLayout linearLayout = this.n;
        if (linearLayout != null && this.m == null) {
            if (this.s) {
                this.n.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        android.view.View view2 = this.m;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = java.lang.Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = java.lang.Math.min(i6, iMin);
            }
            this.m.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), android.view.View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null && (linearLayout = this.n) != null) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = i4;
        k();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() != 1) {
            this.x = i;
            this.z = i3;
        } else {
            this.x = i3;
            this.z = i;
        }
        this.y = i2;
        this.A = i4;
        k();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.i = charSequence;
        d();
        dev.epro.r0.W10240872260424387225.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.s) {
            requestLayout();
        }
        this.s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }
}
