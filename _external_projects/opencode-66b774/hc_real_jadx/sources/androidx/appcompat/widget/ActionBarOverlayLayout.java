package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p038.C1005;
import p034.p035.p045.C1072;
import p034.p035.p045.C1082;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1068;
import p034.p035.p045.InterfaceC1081;
import p034.p035.p045.InterfaceC1120;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.C1151;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p053.C1209;
import p034.p050.p053.InterfaceC1218;
import p034.p050.p053.InterfaceC1258;
import p034.p050.p060.C1295;
import p131.p155.p156.p157.C2098;

@SuppressLint({"UnknownNullness"})
/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1258, InterfaceC1120, InterfaceC1081, InterfaceC1068 {

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final int[] f234 = {C1264.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f235;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f236;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public C1072 f237;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f238;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f239;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final Runnable f240;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public InterfaceC0048 f241;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final Rect f242;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public C1072 f243;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final Rect f244;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final Rect f245;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f246;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final Rect f247;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final Rect f248;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final Rect f249;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final Runnable f250;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ActionBarContainer f251;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f252;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C1072 f253;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final AnimatorListenerAdapter f254;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC1218 f255;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public ViewPropertyAnimator f256;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f257;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final Rect f258;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public OverScroller f259;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ContentFrameLayout f260;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public C1072 f261;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f262;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f263;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final C1082 f264;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f265;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0045 implements Runnable {
        public RunnableC0045() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m106();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f256 = actionBarOverlayLayout.f251.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f254);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$くし〴〺ぅ, reason: contains not printable characters */
    public class RunnableC0046 implements Runnable {
        public RunnableC0046() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m106();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f256 = actionBarOverlayLayout.f251.animate().translationY(-ActionBarOverlayLayout.this.f251.getHeight()).setListener(ActionBarOverlayLayout.this.f254);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0047 extends AnimatorListenerAdapter {
        public C0047() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f256 = null;
            actionBarOverlayLayout.f252 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f256 = null;
            actionBarOverlayLayout.f252 = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0048 {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f246 = 0;
        this.f245 = new Rect();
        this.f242 = new Rect();
        this.f244 = new Rect();
        this.f249 = new Rect();
        this.f258 = new Rect();
        this.f247 = new Rect();
        this.f248 = new Rect();
        C1072 c1072 = C1072.f5531;
        this.f253 = c1072;
        this.f261 = c1072;
        this.f237 = c1072;
        this.f243 = c1072;
        this.f254 = new C0047();
        this.f240 = new RunnableC0045();
        this.f250 = new RunnableC0046();
        m104(context);
        this.f264 = new C1082();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f238 == null || this.f235) {
            return;
        }
        if (this.f251.getVisibility() == 0) {
            i = (int) (this.f251.getTranslationY() + this.f251.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f238.setBounds(0, i, getWidth(), this.f238.getIntrinsicHeight() + i);
        this.f238.draw(canvas);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m105();
        boolean m114 = m114(this.f251, rect, true, true, false, true);
        this.f249.set(rect);
        Rect rect2 = this.f249;
        Rect rect3 = this.f245;
        Method method = C1209.f5983;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception unused) {
            }
        }
        if (!this.f258.equals(this.f249)) {
            this.f258.set(this.f249);
            m114 = true;
        }
        if (!this.f242.equals(this.f245)) {
            this.f242.set(this.f245);
            m114 = true;
        }
        if (m114) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f251;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f264.m2443();
    }

    public CharSequence getTitle() {
        m105();
        return this.f255.getTitle();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m105();
        windowInsets.getClass();
        C1072 c1072 = new C1072(windowInsets);
        boolean m114 = m114(this.f251, new Rect(c1072.m2422(), c1072.m2424(), c1072.m2426(), c1072.m2420()), true, true, false, true);
        Rect rect = this.f245;
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets m2421 = c1072.m2421();
            if (m2421 != null) {
                C1072.m2418(computeSystemWindowInsets(m2421, rect));
            } else {
                rect.setEmpty();
            }
        }
        Rect rect2 = this.f245;
        C1072 mo2428 = c1072.f5532.mo2428(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f253 = mo2428;
        boolean z = true;
        if (!this.f261.equals(mo2428)) {
            this.f261 = this.f253;
            m114 = true;
        }
        if (this.f242.equals(this.f245)) {
            z = m114;
        } else {
            this.f242.set(this.f245);
        }
        if (z) {
            requestLayout();
        }
        return c1072.f5532.mo2433().m2423().f5532.mo2429().m2421();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m104(getContext());
        C1096.m2518(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m106();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        C1072 mo2440;
        m105();
        measureChildWithMargins(this.f251, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f251.getLayoutParams();
        int max = Math.max(0, this.f251.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f251.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f251.getMeasuredState());
        boolean z = (C1096.m2499(this) & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        if (z) {
            measuredHeight = this.f236;
            if (this.f239 && this.f251.getTabContainer() != null) {
                measuredHeight += this.f236;
            }
        } else {
            measuredHeight = this.f251.getVisibility() != 8 ? this.f251.getMeasuredHeight() : 0;
        }
        this.f244.set(this.f245);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.f237 = this.f253;
        } else {
            this.f247.set(this.f249);
        }
        if (!this.f263 && !z) {
            Rect rect = this.f244;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                mo2440 = this.f237.f5532.mo2428(0, measuredHeight, 0, 0);
                this.f237 = mo2440;
            }
        } else if (i3 >= 21) {
            C1005 m2331 = C1005.m2331(this.f237.m2422(), this.f237.m2424() + measuredHeight, this.f237.m2426(), this.f237.m2420() + 0);
            C1072 c1072 = this.f237;
            C1072.C1076 c1074 = i3 >= 29 ? new C1072.C1074(c1072) : i3 >= 20 ? new C1072.C1077(c1072) : new C1072.C1076(c1072);
            c1074.mo2439(m2331);
            mo2440 = c1074.mo2440();
            this.f237 = mo2440;
        } else {
            Rect rect2 = this.f247;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m114(this.f260, this.f244, true, true, true, true);
        if (i3 >= 21 && !this.f243.equals(this.f237)) {
            C1072 c10722 = this.f237;
            this.f243 = c10722;
            C1096.m2516(this.f260, c10722);
        } else if (i3 < 21 && !this.f248.equals(this.f247)) {
            this.f248.set(this.f247);
            this.f260.m166(this.f247);
        }
        measureChildWithMargins(this.f260, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f260.getLayoutParams();
        int max3 = Math.max(max, this.f260.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f260.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f260.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f265 || !z) {
            return false;
        }
        this.f259.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f259.getFinalY() > this.f251.getHeight()) {
            m106();
            this.f250.run();
        } else {
            m106();
            this.f240.run();
        }
        this.f252 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f257 + i2;
        this.f257 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C1295 c1295;
        C1151 c1151;
        this.f264.f5546 = i;
        this.f257 = getActionBarHideOffset();
        m106();
        InterfaceC0048 interfaceC0048 = this.f241;
        if (interfaceC0048 == null || (c1151 = (c1295 = (C1295) interfaceC0048).f6282) == null) {
            return;
        }
        c1151.m2580();
        c1295.f6282 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f251.getVisibility() != 0) {
            return false;
        }
        return this.f265;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public void onStopNestedScroll(View view) {
        if (this.f265 && !this.f252) {
            if (this.f257 <= this.f251.getHeight()) {
                m106();
                postDelayed(this.f240, 600L);
            } else {
                m106();
                postDelayed(this.f250, 600L);
            }
        }
        InterfaceC0048 interfaceC0048 = this.f241;
        if (interfaceC0048 != null) {
            ((C1295) interfaceC0048).getClass();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m105();
        int i2 = this.f262 ^ i;
        this.f262 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        InterfaceC0048 interfaceC0048 = this.f241;
        if (interfaceC0048 != null) {
            ((C1295) interfaceC0048).f6276 = !z2;
            if (z || !z2) {
                C1295 c1295 = (C1295) interfaceC0048;
                if (c1295.f6278) {
                    c1295.f6278 = false;
                    c1295.m2961(true);
                }
            } else {
                C1295 c12952 = (C1295) interfaceC0048;
                if (!c12952.f6278) {
                    c12952.f6278 = true;
                    c12952.m2961(true);
                }
            }
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.f241 == null) {
            return;
        }
        C1096.m2518(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f246 = i;
        InterfaceC0048 interfaceC0048 = this.f241;
        if (interfaceC0048 != null) {
            ((C1295) interfaceC0048).f6279 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m106();
        this.f251.setTranslationY(-Math.max(0, Math.min(i, this.f251.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0048 interfaceC0048) {
        this.f241 = interfaceC0048;
        if (getWindowToken() != null) {
            ((C1295) this.f241).f6279 = this.f246;
            int i = this.f262;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1096.m2518(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f239 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f265) {
            this.f265 = z;
            if (z) {
                return;
            }
            m106();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m105();
        this.f255.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m105();
        this.f255.setIcon(drawable);
    }

    public void setLogo(int i) {
        m105();
        this.f255.mo2811(i);
    }

    @Override // p034.p050.p053.InterfaceC1258
    public void setMenu(Menu menu, InterfaceC1186.InterfaceC1187 interfaceC1187) {
        m105();
        this.f255.setMenu(menu, interfaceC1187);
    }

    @Override // p034.p050.p053.InterfaceC1258
    public void setMenuPrepared() {
        m105();
        this.f255.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.f263 = z;
        this.f235 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p034.p050.p053.InterfaceC1258
    public void setWindowCallback(Window.Callback callback) {
        m105();
        this.f255.setWindowCallback(callback);
    }

    @Override // p034.p050.p053.InterfaceC1258
    public void setWindowTitle(CharSequence charSequence) {
        m105();
        this.f255.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void mo100(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo101() {
        m105();
        return this.f255.mo2806();
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo102(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo103() {
        m105();
        this.f255.mo2820();
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final void m104(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f234);
        this.f236 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f238 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f235 = context.getApplicationInfo().targetSdkVersion < 19;
        this.f259 = new OverScroller(context);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m105() {
        InterfaceC1218 wrapper;
        if (this.f260 == null) {
            this.f260 = (ContentFrameLayout) findViewById(C1268.action_bar_activity_content);
            this.f251 = (ActionBarContainer) findViewById(C1268.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C1268.action_bar);
            if (findViewById instanceof InterfaceC1218) {
                wrapper = (InterfaceC1218) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    StringBuilder m4207 = C2098.m4207("Can't make a decor toolbar out of ");
                    m4207.append(findViewById.getClass().getSimpleName());
                    throw new IllegalStateException(m4207.toString());
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f255 = wrapper;
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m106() {
        removeCallbacks(this.f240);
        removeCallbacks(this.f250);
        ViewPropertyAnimator viewPropertyAnimator = this.f256;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean mo107() {
        m105();
        return this.f255.mo2812();
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo108() {
        m105();
        return this.f255.mo2813();
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo109() {
        m105();
        return this.f255.mo2817();
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo110(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo111(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean mo112(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo113() {
        m105();
        return this.f255.mo2823();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m114(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m114(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // p034.p050.p053.InterfaceC1258
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo115(int i) {
        m105();
        if (i == 2) {
            this.f255.mo2822();
        } else if (i == 5) {
            this.f255.mo2814();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p034.p035.p045.InterfaceC1068
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo116(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }
}
