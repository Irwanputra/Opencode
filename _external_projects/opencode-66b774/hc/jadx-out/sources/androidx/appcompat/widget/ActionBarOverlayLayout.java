package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import dev.epro.r0.B6446223468909275612;
import dev.epro.r0.C546526958440023066;
import dev.epro.r0.D9305770446274769439;
import dev.epro.r0.E13010566502265984838;
import dev.epro.r0.F3837300029271916472;
import dev.epro.r0.G16448537019021176841;
import dev.epro.r0.G7019617308371076781;
import dev.epro.r0.G7891994592490973475;
import dev.epro.r0.I6301446377683660838;
import dev.epro.r0.J11937375245988738237;
import dev.epro.r0.J17018592638074147698;
import dev.epro.r0.M16625233827921399826;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N3121440022506799205;
import dev.epro.r0.O1691962481981067592;
import dev.epro.r0.O17126913626849052802;
import dev.epro.r0.Q10879412431158002632;
import dev.epro.r0.Q12881097977637718264;
import dev.epro.r0.Q3455882957094431299;
import dev.epro.r0.Q5747078841744593420;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.T1878852318042345820;
import dev.epro.r0.T4688439319913777101;
import dev.epro.r0.T8605657386197958581;
import dev.epro.r0.U9110210792315806344;
import dev.epro.r0.V18164520886680827197;
import dev.epro.r0.W10240872260424387225;
import dev.epro.r0.X5533554694773126879;
import dev.epro.r0.X97881583022885904;
import dev.epro.r0.Y15061126039216380234;
import dev.epro.r0.Z1975157152518754667;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements O1691962481981067592, Q12881097977637718264 {
    public static final int[] F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final N3121440022506799205 G;
    public static final Rect H;
    public final G7019617308371076781 A;
    public final M16625233827921399826 B;
    public final M16625233827921399826 C;
    public final T4688439319913777101 D;
    public final U9110210792315806344 E;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public G7891994592490973475 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f140o;
    public final Rect p;
    public final Rect q;
    public boolean r;
    public boolean s;
    public N3121440022506799205 t;
    public N3121440022506799205 u;
    public N3121440022506799205 v;
    public N3121440022506799205 w;
    public X5533554694773126879 x;
    public OverScroller y;
    public ViewPropertyAnimator z;

    static {
        int i = Build.VERSION.SDK_INT;
        F3837300029271916472 b6446223468909275612 = i >= 36 ? new B6446223468909275612() : i >= 35 ? new O17126913626849052802() : i >= 34 ? new Q10879412431158002632() : i >= 31 ? new Q3455882957094431299() : i >= 30 ? new V18164520886680827197() : i >= 29 ? new D9305770446274769439() : new G16448537019021176841();
        b6446223468909275612.h(Z1975157152518754667.b(0, 1, 0, 1));
        G = b6446223468909275612.b();
        H = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.f140o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = true;
        this.s = false;
        N3121440022506799205 n3121440022506799205 = N3121440022506799205.b;
        this.t = n3121440022506799205;
        this.u = n3121440022506799205;
        this.v = n3121440022506799205;
        this.w = n3121440022506799205;
        this.A = new G7019617308371076781(this, (byte) 0);
        this.B = new M16625233827921399826(this, (byte) 0);
        this.C = new M16625233827921399826(this, (byte) 1);
        g(context);
        this.D = new T4688439319913777101();
        U9110210792315806344 u9110210792315806344 = new U9110210792315806344(context);
        u9110210792315806344.setWillNotDraw(true);
        this.E = u9110210792315806344;
        addView(u9110210792315806344);
    }

    public static boolean k(View view, int i, int i2, int i3, int i4) {
        boolean z;
        E13010566502265984838 e13010566502265984838 = (E13010566502265984838) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin != i) {
            ((ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (((ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin != i2) {
            ((ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin = i2;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin != i3) {
            ((ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin = i3;
            z = true;
        }
        if (((ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin == i4) {
            return z;
        }
        ((ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin = i4;
        return true;
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // dev.epro.r0.Q12881097977637718264
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E13010566502265984838;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
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

    @Override // dev.epro.r0.O1691962481981067592
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    public final void f() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        ViewPropertyAnimator viewPropertyAnimator = this.z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void g(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.y = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new E13010566502265984838(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new E13010566502265984838(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        T4688439319913777101 t4688439319913777101 = this.D;
        return t4688439319913777101.b | t4688439319913777101.a;
    }

    public CharSequence getTitle() {
        j();
        return ((X97881583022885904) this.e).a.getTitle();
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

    @Override // dev.epro.r0.O1691962481981067592
    public final boolean i(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j() {
        G7891994592490973475 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof G7891994592490973475) {
                wrapper = (G7891994592490973475) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    S10973172697741180971.m("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(T8605657386197958581 t8605657386197958581, C546526958440023066 c546526958440023066) {
        j();
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        Toolbar toolbar = x97881583022885904.a;
        T1878852318042345820 t1878852318042345820 = x97881583022885904.m;
        if (t1878852318042345820 == null) {
            t1878852318042345820 = new T1878852318042345820(toolbar.getContext());
            x97881583022885904.m = t1878852318042345820;
        }
        t1878852318042345820.e = c546526958440023066;
        if (t8605657386197958581 == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        T8605657386197958581 t86056573861979585812 = toolbar.a.p;
        if (t86056573861979585812 == t8605657386197958581) {
            return;
        }
        if (t86056573861979585812 != null) {
            t86056573861979585812.r(toolbar.K);
            t86056573861979585812.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new J17018592638074147698(toolbar);
        }
        t1878852318042345820.q = true;
        Context context = toolbar.j;
        if (t8605657386197958581 != null) {
            t8605657386197958581.b(t1878852318042345820, context);
            t8605657386197958581.b(toolbar.L, toolbar.j);
        } else {
            t1878852318042345820.d(context, null);
            toolbar.L.d(toolbar.j, null);
            t1878852318042345820.c();
            toolbar.L.c();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(t1878852318042345820);
        toolbar.K = t1878852318042345820;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zK;
        j();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = true;
        boolean z2 = (windowSystemUiVisibility & 256) != 0;
        boolean z3 = (windowSystemUiVisibility & 1536) != 0;
        WeakHashMap weakHashMap = W10240872260424387225.a;
        U9110210792315806344 u9110210792315806344 = this.E;
        N3121440022506799205 n3121440022506799205 = G;
        Rect rect = this.q;
        Q5747078841744593420.b(u9110210792315806344, n3121440022506799205, rect);
        boolean zEquals = rect.equals(H);
        this.r = !zEquals;
        boolean z4 = zEquals || (z2 && z3);
        this.s = z4;
        X5533554694773126879 x5533554694773126879 = this.x;
        if (x5533554694773126879 != null) {
            ((I6301446377683660838) x5533554694773126879).f297o = (z2 || z4) ? false : true;
        }
        N3121440022506799205 n3121440022506799205C = N3121440022506799205.c(windowInsets, this);
        J11937375245988738237 j11937375245988738237 = n3121440022506799205C.a;
        Z1975157152518754667 z1975157152518754667N = j11937375245988738237.n();
        int i = z1975157152518754667N.a;
        int i2 = z1975157152518754667N.a;
        int i3 = z1975157152518754667N.b;
        int i4 = z1975157152518754667N.c;
        this.p.set(i, i3, i4, z1975157152518754667N.d);
        if (this.s) {
            Z1975157152518754667 z1975157152518754667I = j11937375245988738237.i(2);
            int i5 = z1975157152518754667I.a;
            int i6 = z1975157152518754667I.c;
            this.d.setPadding(i2 - i5, i3, i4 - i6, 0);
            zK = k(this.d, z1975157152518754667I.a, 0, i6, 0);
        } else {
            this.d.setPadding(0, 0, 0, 0);
            zK = k(this.d, i2, i3, i4, 0);
        }
        Rect rect2 = this.m;
        Q5747078841744593420.b(this, n3121440022506799205C, rect2);
        N3121440022506799205 n3121440022506799205R = j11937375245988738237.r(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.t = n3121440022506799205R;
        if (!this.u.equals(n3121440022506799205R)) {
            this.u = this.t;
            zK = true;
        }
        Rect rect3 = this.n;
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
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g(getContext());
        WeakHashMap weakHashMap = W10240872260424387225.a;
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
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                E13010566502265984838 e13010566502265984838 = (E13010566502265984838) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        E13010566502265984838 e13010566502265984838 = (E13010566502265984838) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) e13010566502265984838).leftMargin + ((ViewGroup.MarginLayoutParams) e13010566502265984838).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e13010566502265984838).topMargin + ((ViewGroup.MarginLayoutParams) e13010566502265984838).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = W10240872260424387225.a;
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
        Rect rect = this.m;
        Rect rect2 = this.f140o;
        rect2.set(rect);
        N3121440022506799205 n3121440022506799205 = this.t;
        this.v = n3121440022506799205;
        if (this.g || z || !this.r) {
            Z1975157152518754667 z1975157152518754667B = this.s ? Z1975157152518754667.b(n3121440022506799205.a.n().a, Math.max(this.v.a.n().b, measuredHeight), this.v.a.n().c, Math.max(this.v.a.n().d, 0)) : Z1975157152518754667.b(n3121440022506799205.a.n().a, this.v.a.n().b + measuredHeight, this.v.a.n().c, this.v.a.n().d);
            N3121440022506799205 n31214400225067992052 = this.v;
            int i3 = Build.VERSION.SDK_INT;
            F3837300029271916472 b6446223468909275612 = i3 >= 36 ? new B6446223468909275612(n31214400225067992052) : i3 >= 35 ? new O17126913626849052802(n31214400225067992052) : i3 >= 34 ? new Q10879412431158002632(n31214400225067992052) : i3 >= 31 ? new Q3455882957094431299(n31214400225067992052) : i3 >= 30 ? new V18164520886680827197(n31214400225067992052) : i3 >= 29 ? new D9305770446274769439(n31214400225067992052) : new G16448537019021176841(n31214400225067992052);
            b6446223468909275612.h(z1975157152518754667B);
            this.v = b6446223468909275612.b();
        } else {
            boolean z2 = this.s;
            int i4 = rect2.top;
            if (z2) {
                rect2.top = Math.max(i4, measuredHeight);
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                rect2.top = i4 + measuredHeight;
                rect2.bottom = rect2.bottom;
            }
            this.v = this.v.a.r(0, measuredHeight, 0, 0);
        }
        k(this.c, rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!this.w.equals(this.v)) {
            N3121440022506799205 n31214400225067992053 = this.v;
            this.w = n31214400225067992053;
            W10240872260424387225.b(this.c, n31214400225067992053);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        E13010566502265984838 e130105665022659848382 = (E13010566502265984838) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) e130105665022659848382).leftMargin + ((ViewGroup.MarginLayoutParams) e130105665022659848382).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e130105665022659848382).topMargin + ((ViewGroup.MarginLayoutParams) e130105665022659848382).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
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
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        I6301446377683660838 i6301446377683660838;
        Y15061126039216380234 y15061126039216380234;
        this.D.a = i;
        this.k = getActionBarHideOffset();
        f();
        X5533554694773126879 x5533554694773126879 = this.x;
        if (x5533554694773126879 == null || (y15061126039216380234 = (i6301446377683660838 = (I6301446377683660838) x5533554694773126879).s) == null) {
            return;
        }
        y15061126039216380234.a();
        i6301446377683660838.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
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
        X5533554694773126879 x5533554694773126879 = this.x;
        if (x5533554694773126879 != null) {
            I6301446377683660838 i6301446377683660838 = (I6301446377683660838) x5533554694773126879;
            i6301446377683660838.f297o = (z2 || this.s) ? false : true;
            if (z || !z2) {
                if (i6301446377683660838.p) {
                    i6301446377683660838.p = false;
                    i6301446377683660838.f(true);
                }
            } else if (!i6301446377683660838.p) {
                i6301446377683660838.p = true;
                i6301446377683660838.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        WeakHashMap weakHashMap = W10240872260424387225.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        X5533554694773126879 x5533554694773126879 = this.x;
        if (x5533554694773126879 != null) {
            ((I6301446377683660838) x5533554694773126879).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        f();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(X5533554694773126879 x5533554694773126879) {
        this.x = x5533554694773126879;
        if (getWindowToken() != null) {
            ((I6301446377683660838) this.x).n = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = W10240872260424387225.a;
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
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        x97881583022885904.d = i != 0 ? M9216324016624295870.G(x97881583022885904.a.getContext(), i) : null;
        x97881583022885904.c();
    }

    public void setLogo(int i) {
        j();
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        x97881583022885904.e = i != 0 ? M9216324016624295870.G(x97881583022885904.a.getContext(), i) : null;
        x97881583022885904.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((X97881583022885904) this.e).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        if (x97881583022885904.g) {
            return;
        }
        Toolbar toolbar = x97881583022885904.a;
        x97881583022885904.h = charSequence;
        if ((x97881583022885904.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x97881583022885904.g) {
                W10240872260424387225.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new E13010566502265984838(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        x97881583022885904.d = drawable;
        x97881583022885904.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // dev.epro.r0.O1691962481981067592
    public final void d(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
