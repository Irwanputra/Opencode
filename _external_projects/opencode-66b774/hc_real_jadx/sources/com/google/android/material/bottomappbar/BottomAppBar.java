package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p172.C2157;
import p131.p161.p162.p163.p172.C2159;
import p131.p161.p162.p163.p172.C2160;
import p131.p161.p162.p163.p172.C2161;
import p131.p161.p162.p163.p172.C2162;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p185.C2271;
import p131.p161.p162.p163.p185.InterfaceC2263;
import p131.p161.p162.p163.p186.InterfaceC2292;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0129 {

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public static final int f3003 = C2350.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public int f3004;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public final boolean f3005;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public int f3006;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public Animator f3007;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public Behavior f3008;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public AnimatorListenerAdapter f3009;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public int f3010;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final boolean f3011;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public int f3012;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public int f3013;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public boolean f3014;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final C2163 f3015;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public final int f3016;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public InterfaceC2292<FloatingActionButton> f3017;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public final boolean f3018;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public int f3019;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public Animator f3020;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean f3021;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final View.OnLayoutChangeListener f3022;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f3023;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final Rect f3024;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public WeakReference<BottomAppBar> f3025;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$げつ〴ぬぐ, reason: contains not printable characters */
        public class ViewOnLayoutChangeListenerC0397 implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0397() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f3025.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f3024;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.m1429(rect);
                int height = Behavior.this.f3024.height();
                bottomAppBar.m1319(height);
                CoordinatorLayout.C0133 c0133 = (CoordinatorLayout.C0133) view.getLayoutParams();
                if (Behavior.this.f3023 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0133).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C2324.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) c0133).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0133).rightMargin = bottomAppBar.getRightInset();
                    if (C1687.m3675(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) c0133).leftMargin += bottomAppBar.f3016;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0133).rightMargin += bottomAppBar.f3016;
                    }
                }
            }
        }

        public Behavior() {
            this.f3022 = new ViewOnLayoutChangeListenerC0397();
            this.f3024 = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3022 = new ViewOnLayoutChangeListenerC0397();
            this.f3024 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: 〻ぞまぎな〻 */
        public boolean mo345(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぺふねづ〺 */
        public boolean mo369(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3025 = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f3003;
            View m1317 = bottomAppBar.m1317();
            if (m1317 != null && !C1096.m2517(m1317)) {
                CoordinatorLayout.C0133 c0133 = (CoordinatorLayout.C0133) m1317.getLayoutParams();
                c0133.f999 = 49;
                this.f3023 = ((ViewGroup.MarginLayoutParams) c0133).bottomMargin;
                if (m1317 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m1317;
                    floatingActionButton.addOnLayoutChangeListener(this.f3022);
                    floatingActionButton.m1432(bottomAppBar.f3009);
                    floatingActionButton.m1428(new C2162(bottomAppBar));
                    floatingActionButton.m1430(bottomAppBar.f3017);
                }
                bottomAppBar.m1320();
            }
            coordinatorLayout.m340(bottomAppBar, i);
            this.f2987 = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0398();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f3027;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f3028;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0398 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3028 = parcel.readInt();
            this.f3027 = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f3028);
            parcel.writeInt(this.f3027 ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$〺つふすそ, reason: contains not printable characters */
    public class C0399 implements InterfaceC2292<FloatingActionButton> {
        public C0399() {
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$くし〴〺ぅ, reason: contains not printable characters */
    public class C0400 implements InterfaceC2263 {
        public C0400() {
        }

        @Override // p131.p161.p162.p163.p185.InterfaceC2263
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1072 mo1327(View view, C1072 c1072, C2271 c2271) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f3018) {
                bottomAppBar.f3006 = c1072.m2420();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z2 = false;
            if (bottomAppBar2.f3011) {
                z = bottomAppBar2.f3004 != c1072.m2422();
                BottomAppBar.this.f3004 = c1072.m2422();
            } else {
                z = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f3005) {
                boolean z3 = bottomAppBar3.f3019 != c1072.m2426();
                BottomAppBar.this.f3019 = c1072.m2426();
                z2 = z3;
            }
            if (z || z2) {
                BottomAppBar bottomAppBar4 = BottomAppBar.this;
                Animator animator = bottomAppBar4.f3020;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar4.f3007;
                if (animator2 != null) {
                    animator2.cancel();
                }
                BottomAppBar.this.m1320();
                BottomAppBar.this.m1325();
            }
            return c1072;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0401 extends AnimatorListenerAdapter {
        public C0401() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m1322(bottomAppBar.f3013, bottomAppBar.f3014);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$びぐびあび, reason: contains not printable characters */
    public class C0402 extends AnimatorListenerAdapter {
        public C0402() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.m1314(BottomAppBar.this);
            BottomAppBar.this.f3020 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f3010++;
        }
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.bottomAppBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f3006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m1326(this.f3013);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f9038;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f3004;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f3019;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2161 getTopEdgeTreatment() {
        return (C2161) this.f3015.f9045.f9074.f9128;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static void m1314(BottomAppBar bottomAppBar) {
        bottomAppBar.f3010--;
    }

    public ColorStateList getBackgroundTint() {
        return this.f3015.f9045.f9068;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0129
    public Behavior getBehavior() {
        if (this.f3008 == null) {
            this.f3008 = new Behavior();
        }
        return this.f3008;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f9038;
    }

    public int getFabAlignmentMode() {
        return this.f3013;
    }

    public int getFabAnimationMode() {
        return this.f3012;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f9037;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f9036;
    }

    public boolean getHideOnScroll() {
        return this.f3021;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1687.m3669(this, this.f3015);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f3020;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f3007;
            if (animator2 != null) {
                animator2.cancel();
            }
            m1320();
        }
        m1325();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        this.f3013 = savedState.f3028;
        this.f3014 = savedState.f3027;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3028 = this.f3013;
        savedState.f3027 = this.f3014;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C2786.m4788(this.f3015, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m4239(f);
            this.f3015.invalidateSelf();
            m1320();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        C2163 c2163 = this.f3015;
        C2163.C2164 c2164 = c2163.f9045;
        if (c2164.f9072 != f) {
            c2164.f9072 = f;
            c2163.m4269();
        }
        C2163 c21632 = this.f3015;
        int m4257 = c21632.f9045.f9077 - c21632.m4257();
        Behavior behavior = getBehavior();
        behavior.f2986 = m4257;
        if (behavior.f2985 == 1) {
            setTranslationY(behavior.f2987 + m4257);
        }
    }

    public void setFabAlignmentMode(int i) {
        if (this.f3013 != i && C1096.m2517(this)) {
            Animator animator = this.f3007;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f3012 == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1323(), "translationX", m1326(i));
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            } else {
                m1324(i);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f3007 = animatorSet;
            animatorSet.addListener(new C2160(this));
            this.f3007.start();
        }
        m1322(i, this.f3014);
        this.f3013 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f3012 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f9037 = f;
            this.f3015.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f9036 = f;
            this.f3015.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f3021 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final View m1317() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m328(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final boolean m1318() {
        FloatingActionButton m1323 = m1323();
        return m1323 != null && m1323.m1434();
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean m1319(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().f9040) {
            return false;
        }
        getTopEdgeTreatment().f9040 = f;
        this.f3015.invalidateSelf();
        return true;
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1320() {
        getTopEdgeTreatment().f9039 = getFabTranslationX();
        View m1317 = m1317();
        this.f3015.m4253((this.f3014 && m1318()) ? 1.0f : 0.0f);
        if (m1317 != null) {
            m1317.setTranslationY(getFabTranslationY());
            m1317.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int m1321(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean m3675 = C1687.m3675(this);
        int measuredWidth = m3675 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f113 & 8388615) == 8388611) {
                measuredWidth = m3675 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((m3675 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m3675 ? this.f3019 : -this.f3004));
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final void m1322(int i, boolean z) {
        if (C1096.m2517(this)) {
            Animator animator = this.f3020;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m1318()) {
                i = 0;
                z = false;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - m1321(actionMenuView, i, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new C2159(this, actionMenuView, i, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f3020 = animatorSet2;
            animatorSet2.addListener(new C0402());
            this.f3020.start();
        }
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final FloatingActionButton m1323() {
        View m1317 = m1317();
        if (m1317 instanceof FloatingActionButton) {
            return (FloatingActionButton) m1317;
        }
        return null;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void m1324(int i) {
        FloatingActionButton m1323 = m1323();
        if (m1323 == null || m1323.m1425()) {
            return;
        }
        this.f3010++;
        m1323.m1433(new C2157(this, i), true);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1325() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            actionMenuView.setTranslationX(!m1318() ? m1321(actionMenuView, 0, false) : m1321(actionMenuView, this.f3013, this.f3014));
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final float m1326(int i) {
        boolean m3675 = C1687.m3675(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f3016 + (m3675 ? this.f3004 : this.f3019))) * (m3675 ? -1 : 1);
        }
        return 0.0f;
    }
}
