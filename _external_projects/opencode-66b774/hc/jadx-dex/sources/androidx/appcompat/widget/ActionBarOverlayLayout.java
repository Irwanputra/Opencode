package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements dev.epro.r0.O1691962481981067592, dev.epro.r0.Q12881097977637718264 {
    public static final int[] F = {2130968582, android.R.attr.windowContentOverlay};
    public static final dev.epro.r0.N3121440022506799205 G;
    public static final android.graphics.Rect H;
    public final dev.epro.r0.G7019617308371076781 A;
    public final dev.epro.r0.M16625233827921399826 B;
    public final dev.epro.r0.M16625233827921399826 C;
    public final dev.epro.r0.T4688439319913777101 D;
    public final dev.epro.r0.U9110210792315806344 E;
    public int a;
    public int b;
    public androidx.appcompat.widget.ContentFrameLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public dev.epro.r0.G7891994592490973475 e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final android.graphics.Rect m;
    public final android.graphics.Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f140o;
    public final android.graphics.Rect p;
    public final android.graphics.Rect q;
    public boolean r;
    public boolean s;
    public dev.epro.r0.N3121440022506799205 t;
    public dev.epro.r0.N3121440022506799205 u;
    public dev.epro.r0.N3121440022506799205 v;
    public dev.epro.r0.N3121440022506799205 w;
    public dev.epro.r0.X5533554694773126879 x;
    public android.widget.OverScroller y;
    public android.view.ViewPropertyAnimator z;

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        dev.epro.r0.F3837300029271916472 b6446223468909275612 = i >= 36 ? new dev.epro.r0.B6446223468909275612() : i >= 35 ? new dev.epro.r0.O17126913626849052802() : i >= 34 ? new dev.epro.r0.Q10879412431158002632() : i >= 31 ? new dev.epro.r0.Q3455882957094431299() : i >= 30 ? new dev.epro.r0.V18164520886680827197() : i >= 29 ? new dev.epro.r0.D9305770446274769439() : new dev.epro.r0.G16448537019021176841();
        b6446223468909275612.h(dev.epro.r0.Z1975157152518754667.b(0, 1, 0, 1));
        G = b6446223468909275612.b();
        H = new android.graphics.Rect();
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new android.graphics.Rect();
        this.n = new android.graphics.Rect();
        this.f140o = new android.graphics.Rect();
        this.p = new android.graphics.Rect();
        this.q = new android.graphics.Rect();
        this.r = true;
        this.s = false;
        dev.epro.r0.N3121440022506799205 n3121440022506799205 = dev.epro.r0.N3121440022506799205.b;
        this.t = n3121440022506799205;
        this.u = n3121440022506799205;
        this.v = n3121440022506799205;
        this.w = n3121440022506799205;
        this.A = new dev.epro.r0.G7019617308371076781(this, (byte) 0);
        this.B = new dev.epro.r0.M16625233827921399826(this, (byte) 0);
        this.C = new dev.epro.r0.M16625233827921399826(this, (byte) 1);
        g(context);
        this.D = new dev.epro.r0.T4688439319913777101();
        dev.epro.r0.U9110210792315806344 u9110210792315806344 = new dev.epro.r0.U9110210792315806344(context);
        u9110210792315806344.setWillNotDraw(true);
        this.E = u9110210792315806344;
        addView(u9110210792315806344);
    }

    public static boolean k(android.view.View view, int i, int i2, int i3, int i4) {
        boolean z;
        dev.epro.r0.E13010566502265984838 e13010566502265984838 = (dev.epro.r0.E13010566502265984838) view.getLayoutParams();
        if (((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin != i) {
            ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin != i2) {
            ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin = i2;
            z = true;
        }
        if (((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin != i3) {
            ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin = i3;
            z = true;
        }
        if (((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin == i4) {
            return z;
        }
        ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin = i4;
        return true;
    }

    public final void a(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void b(android.view.View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(androidx.core.widget.NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dev.epro.r0.E13010566502265984838;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    public final void e(androidx.core.widget.NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    public final void f() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void g(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.y = new android.widget.OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dev.epro.r0.E13010566502265984838(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new dev.epro.r0.E13010566502265984838(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        dev.epro.r0.T4688439319913777101 t4688439319913777101 = this.D;
        return t4688439319913777101.b | t4688439319913777101.a;
    }

    public java.lang.CharSequence getTitle() {
        j();
        return this.e.a.getTitle();
    }

    public final void h(int i) {
        j();
        if (i == 2) {
            this.e.getClass();
        } else if (i == 5) {
            this.e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final boolean i(android.view.View view, android.view.View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j() {
        dev.epro.r0.G7891994592490973475 wrapper;
        if (this.c == null) {
            this.c = (androidx.appcompat.widget.ContentFrameLayout) findViewById(2131296309);
            this.d = (androidx.appcompat.widget.ActionBarContainer) findViewById(2131296310);
            dev.epro.r0.G7891994592490973475 g7891994592490973475FindViewById = findViewById(2131296308);
            if (g7891994592490973475FindViewById instanceof dev.epro.r0.G7891994592490973475) {
                wrapper = g7891994592490973475FindViewById;
            } else {
                if (!(g7891994592490973475FindViewById instanceof androidx.appcompat.widget.Toolbar)) {
                    dev.epro.r0.S10973172697741180971.m("Can't make a decor toolbar out of ".concat(g7891994592490973475FindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((androidx.appcompat.widget.Toolbar) g7891994592490973475FindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(dev.epro.r0.T8605657386197958581 t8605657386197958581, dev.epro.r0.C546526958440023066 c546526958440023066) {
        j();
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.e;
        androidx.appcompat.widget.Toolbar toolbar = x97881583022885904.a;
        dev.epro.r0.T1878852318042345820 t1878852318042345820 = x97881583022885904.m;
        if (t1878852318042345820 == null) {
            t1878852318042345820 = new dev.epro.r0.T1878852318042345820(toolbar.getContext());
            x97881583022885904.m = t1878852318042345820;
        }
        t1878852318042345820.e = c546526958440023066;
        if (t8605657386197958581 == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        dev.epro.r0.T8605657386197958581 t86056573861979585812 = toolbar.a.p;
        if (t86056573861979585812 == t8605657386197958581) {
            return;
        }
        if (t86056573861979585812 != null) {
            t86056573861979585812.r(toolbar.K);
            t86056573861979585812.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new dev.epro.r0.J17018592638074147698(toolbar);
        }
        t1878852318042345820.q = true;
        android.content.Context context = toolbar.j;
        if (t8605657386197958581 != null) {
            t8605657386197958581.b(t1878852318042345820, context);
            t8605657386197958581.b(toolbar.L, toolbar.j);
        } else {
            t1878852318042345820.d(context, (dev.epro.r0.T8605657386197958581) null);
            toolbar.L.d(toolbar.j, (dev.epro.r0.T8605657386197958581) null);
            t1878852318042345820.c();
            toolbar.L.c();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(t1878852318042345820);
        toolbar.K = t1878852318042345820;
        toolbar.t();
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        dev.epro.r0.U9110210792315806344 u9110210792315806344 = this.E;
        dev.epro.r0.N3121440022506799205 n3121440022506799205 = G;
        android.graphics.Rect rect = this.q;
        dev.epro.r0.Q5747078841744593420.b(u9110210792315806344, n3121440022506799205, rect);
        boolean zEquals = rect.equals(H);
        this.r = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.s = z4;
        dev.epro.r0.I6301446377683660838 i6301446377683660838 = this.x;
        if (i6301446377683660838 != null) {
            i6301446377683660838.o = (z2 || z4) ? false : true;
        }
        dev.epro.r0.N3121440022506799205 n3121440022506799205C = dev.epro.r0.N3121440022506799205.c(windowInsets, this);
        dev.epro.r0.J11937375245988738237 j11937375245988738237 = n3121440022506799205C.a;
        dev.epro.r0.Z1975157152518754667 z1975157152518754667N = j11937375245988738237.n();
        int i = z1975157152518754667N.a;
        int i2 = z1975157152518754667N.a;
        int i3 = z1975157152518754667N.b;
        int i4 = z1975157152518754667N.c;
        this.p.set(i, i3, i4, z1975157152518754667N.d);
        if (this.s) {
            dev.epro.r0.Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(2);
            int i5 = z1975157152518754667I.a;
            int i6 = z1975157152518754667I.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.d, z1975157152518754667I.a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zK = k(this.d, i2, i3, i4, 0);
        }
        android.graphics.Rect rect2 = this.m;
        dev.epro.r0.Q5747078841744593420.b(this, n3121440022506799205C, rect2);
        dev.epro.r0.N3121440022506799205 n3121440022506799205R = j11937375245988738237.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.t = n3121440022506799205R;
        if (!this.u.equals(n3121440022506799205R)) {
            this.u = this.t;
            zK = true;
        }
        android.graphics.Rect rect3 = this.n;
        if (rect3.equals(rect2)) {
            z = zK;
        } else {
            rect3.set(rect2);
        }
        if (z) {
            requestLayout();
        }
        return j11937375245988738237.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g(getContext());
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                dev.epro.r0.E13010566502265984838 e13010566502265984838 = (dev.epro.r0.E13010566502265984838) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin + paddingLeft;
                int i7 = ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        dev.epro.r0.E13010566502265984838 e13010566502265984838 = (dev.epro.r0.E13010566502265984838) this.d.getLayoutParams();
        int iMax = java.lang.Math.max(0, this.d.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin);
        int iMax2 = java.lang.Math.max(0, this.d.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin + ((android.view.ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin);
        int iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.d.getMeasuredState());
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.s) {
                measuredHeight += this.p.top;
            }
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.m;
        android.graphics.Rect rect2 = this.f140o;
        rect2.set(rect);
        dev.epro.r0.N3121440022506799205 n3121440022506799205 = this.t;
        this.v = n3121440022506799205;
        if (this.g || z || !this.r) {
            dev.epro.r0.Z1975157152518754667 z1975157152518754667B = this.s ? dev.epro.r0.Z1975157152518754667.b(n3121440022506799205.a.n().a, java.lang.Math.max(this.v.a.n().b, measuredHeight), this.v.a.n().c, java.lang.Math.max(this.v.a.n().d, 0)) : dev.epro.r0.Z1975157152518754667.b(n3121440022506799205.a.n().a, this.v.a.n().b + measuredHeight, this.v.a.n().c, this.v.a.n().d);
            dev.epro.r0.N3121440022506799205 n31214400225067992052 = this.v;
            int i3 = android.os.Build.VERSION.SDK_INT;
            dev.epro.r0.F3837300029271916472 b6446223468909275612 = i3 >= 36 ? new dev.epro.r0.B6446223468909275612(n31214400225067992052) : i3 >= 35 ? new dev.epro.r0.O17126913626849052802(n31214400225067992052) : i3 >= 34 ? new dev.epro.r0.Q10879412431158002632(n31214400225067992052) : i3 >= 31 ? new dev.epro.r0.Q3455882957094431299(n31214400225067992052) : i3 >= 30 ? new dev.epro.r0.V18164520886680827197(n31214400225067992052) : i3 >= 29 ? new dev.epro.r0.D9305770446274769439(n31214400225067992052) : new dev.epro.r0.G16448537019021176841(n31214400225067992052);
            b6446223468909275612.h(z1975157152518754667B);
            this.v = b6446223468909275612.b();
        } else {
            boolean z2 = this.s;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = java.lang.Math.max(i4, measuredHeight);
                rect2.bottom = java.lang.Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.v = this.v.a.r(0, measuredHeight, 0, 0);
        }
        k(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.w.equals(this.v)) {
            dev.epro.r0.N3121440022506799205 n31214400225067992053 = this.v;
            this.w = n31214400225067992053;
            dev.epro.r0.W10240872260424387225.b(this.c, n31214400225067992053);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        dev.epro.r0.E13010566502265984838 e130105665022659848382 = (dev.epro.r0.E13010566502265984838) this.c.getLayoutParams();
        int iMax3 = java.lang.Math.max(iMax, this.c.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) e130105665022659848382).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) e130105665022659848382).rightMargin);
        int iMax4 = java.lang.Math.max(iMax2, this.c.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) e130105665022659848382).topMargin + ((android.view.ViewGroup.MarginLayoutParams) e130105665022659848382).bottomMargin);
        int iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.d.getHeight()) {
            f();
            this.C.run();
        } else {
            f();
            this.B.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        dev.epro.r0.I6301446377683660838 i6301446377683660838;
        dev.epro.r0.Y15061126039216380234 y15061126039216380234;
        this.D.a = i;
        this.k = getActionBarHideOffset();
        f();
        dev.epro.r0.I6301446377683660838 i63014463776836608382 = this.x;
        if (i63014463776836608382 == null || (y15061126039216380234 = (i6301446377683660838 = i63014463776836608382).s) == null) {
            return;
        }
        y15061126039216380234.a();
        i6301446377683660838.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            f();
            postDelayed(this.B, 600L);
        } else {
            f();
            postDelayed(this.C, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        dev.epro.r0.I6301446377683660838 i6301446377683660838 = this.x;
        if (i6301446377683660838 != null) {
            dev.epro.r0.I6301446377683660838 i63014463776836608382 = i6301446377683660838;
            i63014463776836608382.o = (z2 || this.s) ? false : true;
            if (z || !z2) {
                if (i63014463776836608382.p) {
                    i63014463776836608382.p = false;
                    i63014463776836608382.f(true);
                }
            } else if (!i63014463776836608382.p) {
                i63014463776836608382.p = true;
                i63014463776836608382.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        dev.epro.r0.I6301446377683660838 i6301446377683660838 = this.x;
        if (i6301446377683660838 != null) {
            i6301446377683660838.n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        f();
        this.d.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(dev.epro.r0.X5533554694773126879 x5533554694773126879) {
        this.x = x5533554694773126879;
        if (getWindowToken() != null) {
            this.x.n = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            f();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.e;
        x97881583022885904.d = i != 0 ? dev.epro.r0.M9216324016624295870.G(x97881583022885904.a.getContext(), i) : null;
        x97881583022885904.c();
    }

    public void setLogo(int i) {
        j();
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.e;
        x97881583022885904.e = i != 0 ? dev.epro.r0.M9216324016624295870.G(x97881583022885904.a.getContext(), i) : null;
        x97881583022885904.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setWindowCallback(android.view.Window.Callback callback) {
        j();
        this.e.k = callback;
    }

    public void setWindowTitle(java.lang.CharSequence charSequence) {
        j();
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.e;
        if (x97881583022885904.g) {
            return;
        }
        androidx.appcompat.widget.Toolbar toolbar = x97881583022885904.a;
        x97881583022885904.h = charSequence;
        if ((x97881583022885904.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x97881583022885904.g) {
                dev.epro.r0.W10240872260424387225.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new dev.epro.r0.E13010566502265984838(layoutParams);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        j();
        dev.epro.r0.X97881583022885904 x97881583022885904 = this.e;
        x97881583022885904.d = drawable;
        x97881583022885904.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(android.content.Context context) {
        this(context, null);
    }

    public final void d(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
    }
}
