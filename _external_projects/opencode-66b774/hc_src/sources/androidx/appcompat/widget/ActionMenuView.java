package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import dev.epro.r0.D18165525574842162311;
import dev.epro.r0.E3501342855209648231;
import dev.epro.r0.F13271443510022614086;
import dev.epro.r0.G17670069693736004358;
import dev.epro.r0.G184438488898427898;
import dev.epro.r0.H10500197361170225543;
import dev.epro.r0.H12843822278061842084;
import dev.epro.r0.I4217019646703278835;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.L2038580209622790010;
import dev.epro.r0.N5158094851646208854;
import dev.epro.r0.O691910143173251949;
import dev.epro.r0.P11864007600649976263;
import dev.epro.r0.T1878852318042345820;
import dev.epro.r0.T8605657386197958581;
import dev.epro.r0.V17859802919350004506;
import dev.epro.r0.W17553834374836380220;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class ActionMenuView extends W17553834374836380220 implements O691910143173251949, G184438488898427898 {
    public T8605657386197958581 p;
    public Context q;
    public int r;
    public boolean s;
    public T1878852318042345820 t;
    public E3501342855209648231 u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public P11864007600649976263 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f);
        this.y = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static F13271443510022614086 i() {
        F13271443510022614086 f13271443510022614086 = new F13271443510022614086(-2, -2);
        f13271443510022614086.a = false;
        ((LinearLayout.LayoutParams) f13271443510022614086).gravity = 16;
        return f13271443510022614086;
    }

    public static F13271443510022614086 j(ViewGroup.LayoutParams layoutParams) {
        F13271443510022614086 f13271443510022614086;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof F13271443510022614086) {
            F13271443510022614086 f132714435100226140862 = (F13271443510022614086) layoutParams;
            f13271443510022614086 = new F13271443510022614086(f132714435100226140862);
            f13271443510022614086.a = f132714435100226140862.a;
        } else {
            f13271443510022614086 = new F13271443510022614086(layoutParams);
        }
        if (((LinearLayout.LayoutParams) f13271443510022614086).gravity <= 0) {
            ((LinearLayout.LayoutParams) f13271443510022614086).gravity = 16;
        }
        return f13271443510022614086;
    }

    @Override // dev.epro.r0.G184438488898427898
    public final void a(T8605657386197958581 t8605657386197958581) {
        this.p = t8605657386197958581;
    }

    @Override // dev.epro.r0.O691910143173251949
    public final boolean b(I4217019646703278835 i4217019646703278835) {
        return this.p.q(i4217019646703278835, null, 0);
    }

    @Override // dev.epro.r0.W17553834374836380220, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof F13271443510022614086;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // dev.epro.r0.W17553834374836380220
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ L2038580209622790010 generateDefaultLayoutParams() {
        return i();
    }

    @Override // dev.epro.r0.W17553834374836380220
    /* renamed from: f */
    public final L2038580209622790010 generateLayoutParams(AttributeSet attributeSet) {
        return new F13271443510022614086(getContext(), attributeSet);
    }

    @Override // dev.epro.r0.W17553834374836380220
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ L2038580209622790010 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // dev.epro.r0.W17553834374836380220, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // dev.epro.r0.W17553834374836380220, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new F13271443510022614086(getContext(), attributeSet);
    }

    public Menu getMenu() {
        T8605657386197958581 t8605657386197958581 = this.p;
        if (t8605657386197958581 != null) {
            return t8605657386197958581;
        }
        Context context = getContext();
        T8605657386197958581 t86056573861979585812 = new T8605657386197958581(context);
        this.p = t86056573861979585812;
        t86056573861979585812.e = new H12843822278061842084((Object) this, (byte) 8);
        T1878852318042345820 t1878852318042345820 = new T1878852318042345820(context);
        this.t = t1878852318042345820;
        t1878852318042345820.l = true;
        t1878852318042345820.m = true;
        t1878852318042345820.e = new N5158094851646208854((byte) 29);
        this.p.b(t1878852318042345820, this.q);
        T1878852318042345820 t18788523180423458202 = this.t;
        t18788523180423458202.h = this;
        T8605657386197958581 t86056573861979585813 = t18788523180423458202.c;
        this.p = t86056573861979585813;
        return t86056573861979585813;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        T1878852318042345820 t1878852318042345820 = this.t;
        D18165525574842162311 d18165525574842162311 = t1878852318042345820.i;
        if (d18165525574842162311 != null) {
            return d18165525574842162311.getDrawable();
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

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof V17859802919350004506)) {
            z = ((V17859802919350004506) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof V17859802919350004506)) ? z : ((V17859802919350004506) childAt2).c() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T1878852318042345820 t1878852318042345820 = this.t;
        if (t1878852318042345820 != null) {
            t1878852318042345820.c();
            if (this.t.g()) {
                this.t.e();
                this.t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T1878852318042345820 t1878852318042345820 = this.t;
        if (t1878852318042345820 != null) {
            t1878852318042345820.e();
            H10500197361170225543 h10500197361170225543 = t1878852318042345820.t;
            if (h10500197361170225543 == null || !h10500197361170225543.b()) {
                return;
            }
            h10500197361170225543.i.dismiss();
        }
    }

    @Override // dev.epro.r0.W17553834374836380220, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.v) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = G17670069693736004358.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                F13271443510022614086 f13271443510022614086 = (F13271443510022614086) childAt.getLayoutParams();
                if (f13271443510022614086.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) f13271443510022614086).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) f13271443510022614086).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) f13271443510022614086).leftMargin) + ((LinearLayout.LayoutParams) f13271443510022614086).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                F13271443510022614086 f132714435100226140862 = (F13271443510022614086) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !f132714435100226140862.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) f132714435100226140862).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) f132714435100226140862).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            F13271443510022614086 f132714435100226140863 = (F13271443510022614086) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !f132714435100226140863.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) f132714435100226140863).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = L11610354117192841236.e(measuredWidth4, ((LinearLayout.LayoutParams) f132714435100226140863).rightMargin, max, i19);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // dev.epro.r0.W17553834374836380220, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        T8605657386197958581 t8605657386197958581;
        boolean z = this.v;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.v = z2;
        if (z != z2) {
            this.w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.v && (t8605657386197958581 = this.p) != null && size != this.w) {
            this.w = size;
            t8605657386197958581.p(true);
        }
        int childCount = getChildCount();
        if (!this.v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                F13271443510022614086 f13271443510022614086 = (F13271443510022614086) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) f13271443510022614086).rightMargin = 0;
                ((LinearLayout.LayoutParams) f13271443510022614086).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
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
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.y;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                F13271443510022614086 f132714435100226140862 = (F13271443510022614086) childAt.getLayoutParams();
                f132714435100226140862.f = false;
                f132714435100226140862.c = 0;
                f132714435100226140862.b = 0;
                f132714435100226140862.d = false;
                ((LinearLayout.LayoutParams) f132714435100226140862).leftMargin = 0;
                ((LinearLayout.LayoutParams) f132714435100226140862).rightMargin = 0;
                f132714435100226140862.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = f132714435100226140862.a ? 1 : i10;
                F13271443510022614086 f132714435100226140863 = (F13271443510022614086) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                f132714435100226140863.d = !f132714435100226140863.a && z6;
                f132714435100226140863.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (f132714435100226140862.d) {
                    i17++;
                }
                if (f132714435100226140862.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                F13271443510022614086 f132714435100226140864 = (F13271443510022614086) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (f132714435100226140864.d) {
                    int i30 = f132714435100226140864.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                F13271443510022614086 f132714435100226140865 = (F13271443510022614086) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && f132714435100226140865.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    f132714435100226140865.b += r11;
                    f132714435100226140865.f = r11;
                    i25--;
                } else if (f132714435100226140865.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((F13271443510022614086) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((F13271443510022614086) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    F13271443510022614086 f132714435100226140866 = (F13271443510022614086) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        f132714435100226140866.c = i34;
                        f132714435100226140866.f = true;
                        if (i35 == 0 && !f132714435100226140866.e) {
                            ((LinearLayout.LayoutParams) f132714435100226140866).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (f132714435100226140866.a) {
                        f132714435100226140866.c = i34;
                        f132714435100226140866.f = true;
                        ((LinearLayout.LayoutParams) f132714435100226140866).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) f132714435100226140866).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) f132714435100226140866).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                F13271443510022614086 f132714435100226140867 = (F13271443510022614086) childAt4.getLayoutParams();
                if (f132714435100226140867.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((f132714435100226140867.b * i24) + f132714435100226140867.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(P11864007600649976263 p11864007600649976263) {
        this.z = p11864007600649976263;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        T1878852318042345820 t1878852318042345820 = this.t;
        D18165525574842162311 d18165525574842162311 = t1878852318042345820.i;
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

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(T1878852318042345820 t1878852318042345820) {
        this.t = t1878852318042345820;
        t1878852318042345820.h = this;
        this.p = t1878852318042345820.c;
    }

    @Override // dev.epro.r0.W17553834374836380220, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
