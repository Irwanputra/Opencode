package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p053.C1209;
import p034.p050.p060.C1311;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionMenuView extends LinearLayoutCompat implements C1164.InterfaceC1165, InterfaceC1195 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f295;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f296;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f297;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C1164 f298;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f299;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public ActionMenuPresenter f300;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Context f301;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f302;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public InterfaceC0060 f303;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f304;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f305;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public C1164.InterfaceC1166 f306;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f307;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f308;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f309;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public int f310;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f311;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public int f312;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f309 = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f309 = layoutParams.f309;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$〺つふすそ, reason: contains not printable characters */
    public static class C0057 implements InterfaceC1186.InterfaceC1187 {
        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: 〺つふすそ */
        public boolean mo131(C1164 c1164) {
            return false;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: げつ〴ぬぐ */
        public void mo132(C1164 c1164, boolean z) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$くし〴〺ぅ, reason: contains not printable characters */
    public class C0058 implements C1164.InterfaceC1166 {
        public C0058() {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo141(C1164 c1164) {
            C1164.InterfaceC1166 interfaceC1166 = ActionMenuView.this.f306;
            if (interfaceC1166 != null) {
                interfaceC1166.mo141(c1164);
            }
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo142(C1164 c1164, MenuItem menuItem) {
            InterfaceC0060 interfaceC0060 = ActionMenuView.this.f303;
            if (interfaceC0060 == null) {
                return false;
            }
            Toolbar.InterfaceC0108 interfaceC0108 = Toolbar.this.f622;
            return interfaceC0108 != null ? C1311.this.f6328.onMenuItemSelected(0, menuItem) : false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC0059 {
        /* renamed from: 〺つふすそ */
        boolean mo83();

        /* renamed from: げつ〴ぬぐ */
        boolean mo85();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0060 {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f296 = (int) (56.0f * f);
        this.f305 = (int) (f * 4.0f);
        this.f301 = context;
        this.f304 = 0;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static int m134(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m84();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!layoutParams.f309 && z2) {
            z = true;
        }
        layoutParams.f311 = z;
        layoutParams.f312 = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f298 == null) {
            Context context = getContext();
            C1164 c1164 = new C1164(context);
            this.f298 = c1164;
            c1164.f5778 = new C0058();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f300 = actionMenuPresenter;
            actionMenuPresenter.f284 = true;
            actionMenuPresenter.f274 = true;
            InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f302;
            if (interfaceC1187 == null) {
                interfaceC1187 = new C0057();
            }
            actionMenuPresenter.f5761 = interfaceC1187;
            this.f298.m2610(actionMenuPresenter, this.f301);
            ActionMenuPresenter actionMenuPresenter2 = this.f300;
            actionMenuPresenter2.f5763 = this;
            this.f298 = actionMenuPresenter2.f5762;
        }
        return this.f298;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f300;
        ActionMenuPresenter.C0055 c0055 = actionMenuPresenter.f285;
        if (c0055 != null) {
            return c0055.getDrawable();
        }
        if (actionMenuPresenter.f280) {
            return actionMenuPresenter.f278;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f304;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f300;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo119(false);
            if (this.f300.m121()) {
                this.f300.m126();
                this.f300.m120();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f300;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m118();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f295) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m2693 = C1209.m2693(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f309) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m139(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2693) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    m139(i10);
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
        if (m2693) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f309) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f309) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = C2098.m4176(measuredWidth4, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, max, i19);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ?? r3;
        C1164 c1164;
        boolean z3 = this.f295;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f295 = z4;
        if (z3 != z4) {
            this.f297 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f295 && (c1164 = this.f298) != null && size != this.f297) {
            this.f297 = size;
            c1164.mo2617(true);
        }
        int childCount = getChildCount();
        if (!this.f295 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
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
        int i9 = this.f296;
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
        int i17 = 0;
        boolean z5 = false;
        long j = 0;
        while (i17 < childCount2) {
            View childAt = getChildAt(i17);
            int i18 = size3;
            int i19 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i20 = i13 + 1;
                if (z6) {
                    int i21 = this.f305;
                    i6 = i20;
                    r3 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    i6 = i20;
                    r3 = 0;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f307 = r3;
                layoutParams2.f310 = r3;
                layoutParams2.f312 = r3;
                layoutParams2.f311 = r3;
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = r3;
                layoutParams2.f308 = z6 && ((ActionMenuItemView) childAt).m84();
                int m134 = m134(childAt, i12, layoutParams2.f309 ? 1 : i10, childMeasureSpec, paddingBottom);
                i15 = Math.max(i15, m134);
                if (layoutParams2.f311) {
                    i16++;
                }
                if (layoutParams2.f309) {
                    z5 = true;
                }
                i10 -= m134;
                i14 = Math.max(i14, childAt.getMeasuredHeight());
                if (m134 == 1) {
                    j |= 1 << i17;
                }
                i13 = i6;
            }
            i17++;
            size3 = i18;
            i8 = i19;
        }
        int i22 = i8;
        int i23 = size3;
        boolean z7 = z5 && i13 == 2;
        boolean z8 = false;
        while (i16 > 0 && i10 > 0) {
            int i24 = Integer.MAX_VALUE;
            int i25 = 0;
            int i26 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                int i27 = i14;
                LayoutParams layoutParams3 = (LayoutParams) getChildAt(i25).getLayoutParams();
                boolean z9 = z8;
                if (layoutParams3.f311) {
                    int i28 = layoutParams3.f312;
                    if (i28 < i24) {
                        j2 = 1 << i25;
                        i24 = i28;
                        i26 = 1;
                    } else if (i28 == i24) {
                        i26++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                z8 = z9;
                i14 = i27;
            }
            i3 = i14;
            z = z8;
            j |= j2;
            if (i26 > i10) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                LayoutParams layoutParams4 = (LayoutParams) childAt2.getLayoutParams();
                int i31 = i16;
                long j3 = 1 << i30;
                if ((j2 & j3) == 0) {
                    if (layoutParams4.f312 == i29) {
                        j |= j3;
                    }
                    z2 = z7;
                } else {
                    if (z7 && layoutParams4.f308 && i10 == 1) {
                        int i32 = this.f305;
                        z2 = z7;
                        childAt2.setPadding(i32 + i12, 0, i32, 0);
                    } else {
                        z2 = z7;
                    }
                    layoutParams4.f312++;
                    layoutParams4.f307 = true;
                    i10--;
                }
                i30++;
                i16 = i31;
                z7 = z2;
            }
            i14 = i3;
            z8 = true;
        }
        i3 = i14;
        z = z8;
        boolean z10 = !z5 && i13 == 1;
        if (i10 > 0 && j != 0 && (i10 < i13 - 1 || z10 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f308) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((LayoutParams) getChildAt(i33).getLayoutParams()).f308) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    LayoutParams layoutParams5 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams5.f310 = i34;
                        layoutParams5.f307 = true;
                        if (i35 == 0 && !layoutParams5.f308) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (-i34) / 2;
                        }
                    } else if (layoutParams5.f309) {
                        layoutParams5.f310 = i34;
                        layoutParams5.f307 = true;
                        ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (-i34) / 2;
                    } else {
                        if (i35 != 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = i34 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                LayoutParams layoutParams6 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.f307) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams6.f312 * i12) + layoutParams6.f310, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i5 = i22;
            i4 = i3;
        } else {
            i4 = i23;
            i5 = i22;
        }
        setMeasuredDimension(i5, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f300.f281 = z;
    }

    public void setMenuCallbacks(InterfaceC1186.InterfaceC1187 interfaceC1187, C1164.InterfaceC1166 interfaceC1166) {
        this.f302 = interfaceC1187;
        this.f306 = interfaceC1166;
    }

    public void setOnMenuItemClickListener(InterfaceC0060 interfaceC0060) {
        this.f303 = interfaceC0060;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f300;
        ActionMenuPresenter.C0055 c0055 = actionMenuPresenter.f285;
        if (c0055 != null) {
            c0055.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f280 = true;
            actionMenuPresenter.f278 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f299 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f304 != i) {
            this.f304 = i;
            if (i == 0) {
                this.f301 = getContext();
            } else {
                this.f301 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f300 = actionMenuPresenter;
        actionMenuPresenter.f5763 = this;
        this.f298 = actionMenuPresenter.f5762;
    }

    @Override // p034.p050.p051.p052.InterfaceC1195
    /* renamed from: 〺つふすそ */
    public void mo91(C1164 c1164) {
        this.f298 = c1164;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: ぉざぅち〻, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f423 = 16;
        return layoutParams;
    }

    @Override // p034.p050.p051.p052.C1164.InterfaceC1165
    /* renamed from: げつ〴ぬぐ */
    public boolean mo92(C1197 c1197) {
        return this.f298.m2631(c1197, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.f423 <= 0) {
            layoutParams2.f423 = 16;
        }
        return layoutParams2;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean m139(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0059)) {
            z = false | ((InterfaceC0059) childAt).mo85();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0059)) ? z : z | ((InterfaceC0059) childAt2).mo83();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
