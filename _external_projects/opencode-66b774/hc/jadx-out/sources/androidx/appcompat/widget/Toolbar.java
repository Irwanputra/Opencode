package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import dev.epro.r0.A8269726748470298907;
import dev.epro.r0.B2057841682677142597;
import dev.epro.r0.C8081513896840795204;
import dev.epro.r0.D14800445622774319989;
import dev.epro.r0.E2166724654553415323;
import dev.epro.r0.E3501342855209648231;
import dev.epro.r0.F5958934288633973125;
import dev.epro.r0.G17185360867502361524;
import dev.epro.r0.G17670069693736004358;
import dev.epro.r0.G7891994592490973475;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.I4217019646703278835;
import dev.epro.r0.J17018592638074147698;
import dev.epro.r0.J614522193061423954;
import dev.epro.r0.L16872835672943068242;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.Q6854864344654328121;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.R11798632102026936588;
import dev.epro.r0.T1878852318042345820;
import dev.epro.r0.T3623367008917729099;
import dev.epro.r0.T811972532548775470;
import dev.epro.r0.T8605657386197958581;
import dev.epro.r0.U3594978070141619353;
import dev.epro.r0.V13302460013598267156;
import dev.epro.r0.W10240872260424387225;
import dev.epro.r0.X7290254428819652218;
import dev.epro.r0.X97881583022885904;
import dev.epro.r0.Y17304307076558258116;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final Q7316561721656982910 G;
    public ArrayList H;
    public final E3501342855209648231 I;
    public X97881583022885904 J;
    public T1878852318042345820 K;
    public J17018592638074147698 L;
    public boolean M;
    public J614522193061423954 N;
    public OnBackInvokedDispatcher O;
    public boolean P;
    public final U3594978070141619353 Q;
    public ActionMenuView a;
    public Q6854864344654328121 b;
    public Q6854864344654328121 c;
    public V13302460013598267156 d;
    public R11798632102026936588 e;
    public final Drawable f;
    public final CharSequence g;
    public V13302460013598267156 h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f141o;
    public int p;
    public int q;
    public int r;
    public int s;
    public X7290254428819652218 t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new Q7316561721656982910(new D14800445622774319989(this, (byte) 1));
        this.H = new ArrayList();
        this.I = new E3501342855209648231(this);
        this.Q = new U3594978070141619353((Object) this, (byte) 10);
        Context context2 = getContext();
        int[] iArr = Y17304307076558258116.w;
        I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(context2, attributeSet, iArr, R.attr.toolbarStyle);
        W10240872260424387225.i(this, context, iArr, attributeSet, (TypedArray) i1632105416032993715T.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
        this.l = typedArray.getResourceId(28, 0);
        this.m = typedArray.getResourceId(19, 0);
        this.w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.s = dimensionPixelOffset5;
        }
        this.f141o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        X7290254428819652218 x7290254428819652218 = this.t;
        x7290254428819652218.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            x7290254428819652218.e = dimensionPixelSize;
            x7290254428819652218.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            x7290254428819652218.f = dimensionPixelSize2;
            x7290254428819652218.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            x7290254428819652218.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = i1632105416032993715T.g(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableG = i1632105416032993715T.g(16);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableG2 = i1632105416032993715T.g(11);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(i1632105416032993715T.f(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(i1632105416032993715T.f(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        i1632105416032993715T.v();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C8081513896840795204(getContext());
    }

    public static L16872835672943068242 h() {
        L16872835672943068242 l16872835672943068242 = new L16872835672943068242(-2, -2);
        l16872835672943068242.b = (byte) 0;
        l16872835672943068242.a = 8388627;
        return l16872835672943068242;
    }

    public static L16872835672943068242 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof L16872835672943068242;
        if (z) {
            L16872835672943068242 l16872835672943068242 = (L16872835672943068242) layoutParams;
            L16872835672943068242 l168728356729430682422 = new L16872835672943068242(l16872835672943068242);
            l168728356729430682422.b = (byte) 0;
            l168728356729430682422.b = l16872835672943068242.b;
            return l168728356729430682422;
        }
        if (z) {
            L16872835672943068242 l168728356729430682423 = new L16872835672943068242((L16872835672943068242) layoutParams);
            l168728356729430682423.b = (byte) 0;
            return l168728356729430682423;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            L16872835672943068242 l168728356729430682424 = new L16872835672943068242(layoutParams);
            l168728356729430682424.b = (byte) 0;
            return l168728356729430682424;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        L16872835672943068242 l168728356729430682425 = new L16872835672943068242(marginLayoutParams);
        l168728356729430682425.b = (byte) 0;
        ((ViewGroup.MarginLayoutParams) l168728356729430682425).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) l168728356729430682425).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) l168728356729430682425).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) l168728356729430682425).bottomMargin = marginLayoutParams.bottomMargin;
        return l168728356729430682425;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                L16872835672943068242 l16872835672943068242 = (L16872835672943068242) childAt.getLayoutParams();
                if (l16872835672943068242.b == 0 && s(childAt)) {
                    int i3 = l16872835672943068242.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            L16872835672943068242 l168728356729430682422 = (L16872835672943068242) childAt2.getLayoutParams();
            if (l168728356729430682422.b == 0 && s(childAt2)) {
                int i5 = l168728356729430682422.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        L16872835672943068242 l16872835672943068242H = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (L16872835672943068242) layoutParams;
        l16872835672943068242H.b = (byte) 1;
        if (!z || this.i == null) {
            addView(view, l16872835672943068242H);
        } else {
            view.setLayoutParams(l16872835672943068242H);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            V13302460013598267156 v13302460013598267156 = new V13302460013598267156(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = v13302460013598267156;
            v13302460013598267156.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            L16872835672943068242 l16872835672943068242H = h();
            l16872835672943068242H.a = (this.n & 112) | 8388611;
            l16872835672943068242H.b = (byte) 2;
            this.h.setLayoutParams(l16872835672943068242H);
            this.h.setOnClickListener(new G17185360867502361524(this, (byte) 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof L16872835672943068242);
    }

    public final void d() {
        if (this.t == null) {
            X7290254428819652218 x7290254428819652218 = new X7290254428819652218();
            x7290254428819652218.a = 0;
            x7290254428819652218.b = 0;
            x7290254428819652218.c = Integer.MIN_VALUE;
            x7290254428819652218.d = Integer.MIN_VALUE;
            x7290254428819652218.e = 0;
            x7290254428819652218.f = 0;
            x7290254428819652218.g = false;
            x7290254428819652218.h = false;
            this.t = x7290254428819652218;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.p == null) {
            T8605657386197958581 t8605657386197958581 = (T8605657386197958581) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new J17018592638074147698(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            t8605657386197958581.b(this.L, this.j);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.a;
            E3501342855209648231 e3501342855209648231 = new E3501342855209648231(this);
            actionMenuView2.getClass();
            actionMenuView2.u = e3501342855209648231;
            L16872835672943068242 l16872835672943068242H = h();
            l16872835672943068242H.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(l16872835672943068242H);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new V13302460013598267156(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            L16872835672943068242 l16872835672943068242H = h();
            l16872835672943068242H.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(l16872835672943068242H);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        L16872835672943068242 l16872835672943068242 = new L16872835672943068242(context, attributeSet);
        l16872835672943068242.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y17304307076558258116.b);
        l16872835672943068242.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        l16872835672943068242.b = (byte) 0;
        return l16872835672943068242;
    }

    public CharSequence getCollapseContentDescription() {
        V13302460013598267156 v13302460013598267156 = this.h;
        if (v13302460013598267156 != null) {
            return v13302460013598267156.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        V13302460013598267156 v13302460013598267156 = this.h;
        if (v13302460013598267156 != null) {
            return v13302460013598267156.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        X7290254428819652218 x7290254428819652218 = this.t;
        if (x7290254428819652218 != null) {
            return x7290254428819652218.g ? x7290254428819652218.a : x7290254428819652218.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        X7290254428819652218 x7290254428819652218 = this.t;
        if (x7290254428819652218 != null) {
            return x7290254428819652218.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        X7290254428819652218 x7290254428819652218 = this.t;
        if (x7290254428819652218 != null) {
            return x7290254428819652218.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        X7290254428819652218 x7290254428819652218 = this.t;
        if (x7290254428819652218 != null) {
            return x7290254428819652218.g ? x7290254428819652218.b : x7290254428819652218.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        T8605657386197958581 t8605657386197958581;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (t8605657386197958581 = actionMenuView.p) == null || !t8605657386197958581.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        R11798632102026936588 r11798632102026936588 = this.e;
        if (r11798632102026936588 != null) {
            return r11798632102026936588.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        R11798632102026936588 r11798632102026936588 = this.e;
        if (r11798632102026936588 != null) {
            return r11798632102026936588.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        V13302460013598267156 v13302460013598267156 = this.d;
        if (v13302460013598267156 != null) {
            return v13302460013598267156.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        V13302460013598267156 v13302460013598267156 = this.d;
        if (v13302460013598267156 != null) {
            return v13302460013598267156.getDrawable();
        }
        return null;
    }

    public T1878852318042345820 getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public G7891994592490973475 getWrapper() {
        Drawable drawable;
        X97881583022885904 x97881583022885904 = this.J;
        if (x97881583022885904 == null) {
            x97881583022885904 = new X97881583022885904();
            x97881583022885904.n = 0;
            x97881583022885904.a = this;
            x97881583022885904.h = getTitle();
            x97881583022885904.i = getSubtitle();
            x97881583022885904.g = x97881583022885904.h != null;
            x97881583022885904.f = getNavigationIcon();
            I1632105416032993715 i1632105416032993715T = I1632105416032993715.t(getContext(), null, Y17304307076558258116.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) i1632105416032993715T.c;
            x97881583022885904.f579o = i1632105416032993715T.g(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                x97881583022885904.g = true;
                x97881583022885904.h = text;
                if ((x97881583022885904.b & 8) != 0) {
                    setTitle(text);
                    if (x97881583022885904.g) {
                        W10240872260424387225.k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                x97881583022885904.i = text2;
                if ((x97881583022885904.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableG = i1632105416032993715T.g(20);
            if (drawableG != null) {
                x97881583022885904.e = drawableG;
                x97881583022885904.c();
            }
            Drawable drawableG2 = i1632105416032993715T.g(17);
            if (drawableG2 != null) {
                x97881583022885904.d = drawableG2;
                x97881583022885904.c();
            }
            if (x97881583022885904.f == null && (drawable = x97881583022885904.f579o) != null) {
                x97881583022885904.f = drawable;
                if ((x97881583022885904.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            x97881583022885904.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = x97881583022885904.c;
                if (view != null && (x97881583022885904.b & 16) != 0) {
                    removeView(view);
                }
                x97881583022885904.c = viewInflate;
                if (viewInflate != null && (x97881583022885904.b & 16) != 0) {
                    addView(viewInflate);
                }
                x97881583022885904.a(x97881583022885904.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.l = resourceId2;
                Q6854864344654328121 q6854864344654328121 = this.b;
                if (q6854864344654328121 != null) {
                    q6854864344654328121.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.m = resourceId3;
                Q6854864344654328121 q68548643446543281212 = this.c;
                if (q68548643446543281212 != null) {
                    q68548643446543281212.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i1632105416032993715T.v();
            if (R.string.abc_action_bar_up_description != x97881583022885904.n) {
                x97881583022885904.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = x97881583022885904.n;
                    x97881583022885904.j = i != 0 ? getContext().getString(i) : null;
                    x97881583022885904.b();
                }
            }
            x97881583022885904.j = getNavigationContentDescription();
            setNavigationOnClickListener(new A8269726748470298907(x97881583022885904));
            this.J = x97881583022885904;
        }
        return x97881583022885904;
    }

    public final int j(View view, int i) {
        L16872835672943068242 l16872835672943068242 = (L16872835672943068242) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = l16872835672943068242.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) l16872835672943068242).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) l16872835672943068242).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) l16872835672943068242).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.G.d).iterator();
        while (it.hasNext()) {
            ((F5958934288633973125) it.next()).a.i();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        L16872835672943068242 l16872835672943068242 = (L16872835672943068242) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) l16872835672943068242).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) l16872835672943068242).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int i3;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = G17670069693736004358.a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.f141o);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.h)) {
            r(this.h, i, 0, i2, this.f141o);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.F;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.a)) {
            r(this.a, i, iMax3, i2, this.f141o);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.i)) {
            iMax5 += q(this.i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((L16872835672943068242) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.r + this.s;
        int i8 = this.p + this.q;
        if (s(this.b)) {
            q(this.b, i, i6 + i8, i2, i7, iArr);
            i3 = i7;
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            i3 = i7;
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, i6 + i8, i2, iL + i3, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (s(this.b) || s(this.c)) {
            iL += i3;
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.M) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof B2057841682677142597)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B2057841682677142597 b2057841682677142597 = (B2057841682677142597) parcelable;
        super.onRestoreInstanceState(b2057841682677142597.a);
        ActionMenuView actionMenuView = this.a;
        T8605657386197958581 t8605657386197958581 = actionMenuView != null ? actionMenuView.p : null;
        int i = b2057841682677142597.c;
        if (i != 0 && this.L != null && t8605657386197958581 != null && (menuItemFindItem = t8605657386197958581.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (b2057841682677142597.d) {
            U3594978070141619353 u3594978070141619353 = this.Q;
            removeCallbacks(u3594978070141619353);
            post(u3594978070141619353);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        X7290254428819652218 x7290254428819652218 = this.t;
        boolean z = i == 1;
        if (z == x7290254428819652218.g) {
            return;
        }
        x7290254428819652218.g = z;
        if (!x7290254428819652218.h) {
            x7290254428819652218.a = x7290254428819652218.e;
            x7290254428819652218.b = x7290254428819652218.f;
            return;
        }
        if (z) {
            int i2 = x7290254428819652218.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = x7290254428819652218.e;
            }
            x7290254428819652218.a = i2;
            int i3 = x7290254428819652218.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = x7290254428819652218.f;
            }
            x7290254428819652218.b = i3;
            return;
        }
        int i4 = x7290254428819652218.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = x7290254428819652218.e;
        }
        x7290254428819652218.a = i4;
        int i5 = x7290254428819652218.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = x7290254428819652218.f;
        }
        x7290254428819652218.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        T1878852318042345820 t1878852318042345820;
        I4217019646703278835 i4217019646703278835;
        B2057841682677142597 b2057841682677142597 = new B2057841682677142597(super.onSaveInstanceState());
        J17018592638074147698 j17018592638074147698 = this.L;
        if (j17018592638074147698 != null && (i4217019646703278835 = j17018592638074147698.b) != null) {
            b2057841682677142597.c = i4217019646703278835.a;
        }
        ActionMenuView actionMenuView = this.a;
        b2057841682677142597.d = (actionMenuView == null || (t1878852318042345820 = actionMenuView.t) == null || !t1878852318042345820.g()) ? false : true;
        return b2057841682677142597;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        L16872835672943068242 l16872835672943068242 = (L16872835672943068242) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) l16872835672943068242).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) l16872835672943068242).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.P != z) {
            this.P = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        V13302460013598267156 v13302460013598267156 = this.h;
        if (v13302460013598267156 != null) {
            v13302460013598267156.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            V13302460013598267156 v13302460013598267156 = this.h;
            if (v13302460013598267156 != null) {
                v13302460013598267156.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        R11798632102026936588 r11798632102026936588 = this.e;
        if (drawable != null) {
            if (r11798632102026936588 == null) {
                r11798632102026936588 = new R11798632102026936588(getContext(), null, 0);
                this.e = r11798632102026936588;
            }
            if (!n(r11798632102026936588)) {
                b(this.e, true);
            }
        } else if (r11798632102026936588 != null && n(r11798632102026936588)) {
            removeView(this.e);
            this.E.remove(this.e);
        }
        R11798632102026936588 r117986321020269365882 = this.e;
        if (r117986321020269365882 != null) {
            r117986321020269365882.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new R11798632102026936588(getContext(), null, 0);
        }
        R11798632102026936588 r11798632102026936588 = this.e;
        if (r11798632102026936588 != null) {
            r11798632102026936588.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        V13302460013598267156 v13302460013598267156 = this.d;
        if (v13302460013598267156 != null) {
            v13302460013598267156.setContentDescription(charSequence);
            E2166724654553415323.r(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            V13302460013598267156 v13302460013598267156 = this.d;
            if (v13302460013598267156 != null && n(v13302460013598267156)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        V13302460013598267156 v133024600135982671562 = this.d;
        if (v133024600135982671562 != null) {
            v133024600135982671562.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        Q6854864344654328121 q6854864344654328121 = this.c;
        if (!zIsEmpty) {
            if (q6854864344654328121 == null) {
                Context context = getContext();
                Q6854864344654328121 q68548643446543281212 = new Q6854864344654328121(context, null);
                this.c = q68548643446543281212;
                q68548643446543281212.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (q6854864344654328121 != null && n(q6854864344654328121)) {
            removeView(this.c);
            this.E.remove(this.c);
        }
        Q6854864344654328121 q68548643446543281213 = this.c;
        if (q68548643446543281213 != null) {
            q68548643446543281213.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        Q6854864344654328121 q6854864344654328121 = this.c;
        if (q6854864344654328121 != null) {
            q6854864344654328121.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        Q6854864344654328121 q6854864344654328121 = this.b;
        if (!zIsEmpty) {
            if (q6854864344654328121 == null) {
                Context context = getContext();
                Q6854864344654328121 q68548643446543281212 = new Q6854864344654328121(context, null);
                this.b = q68548643446543281212;
                q68548643446543281212.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (q6854864344654328121 != null && n(q6854864344654328121)) {
            removeView(this.b);
            this.E.remove(this.b);
        }
        Q6854864344654328121 q68548643446543281213 = this.b;
        if (q68548643446543281213 != null) {
            q68548643446543281213.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        Q6854864344654328121 q6854864344654328121 = this.b;
        if (q6854864344654328121 != null) {
            q6854864344654328121.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherB = T3623367008917729099.b(this);
            J17018592638074147698 j17018592638074147698 = this.L;
            boolean z = (j17018592638074147698 == null || j17018592638074147698.b == null || onBackInvokedDispatcherB == null || !isAttachedToWindow() || !this.P) ? false : true;
            if (!z || this.O != null) {
                if (z || (onBackInvokedDispatcher = this.O) == null) {
                    return;
                }
                T3623367008917729099.t(onBackInvokedDispatcher, this.N);
                this.O = null;
                return;
            }
            J614522193061423954 j614522193061423954 = this.N;
            if (j614522193061423954 == null) {
                J614522193061423954 j6145221930614239542 = new J614522193061423954(new D14800445622774319989(this, (byte) 0), (byte) 3);
                this.N = j6145221930614239542;
                j614522193061423954 = j6145221930614239542;
            }
            T3623367008917729099.s(onBackInvokedDispatcherB, j614522193061423954);
            this.O = onBackInvokedDispatcherB;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(M9216324016624295870.G(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(M9216324016624295870.G(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(M9216324016624295870.G(getContext(), i));
    }

    public void setOnMenuItemClickListener(T811972532548775470 t811972532548775470) {
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
