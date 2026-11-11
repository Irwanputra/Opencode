package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p131.p161.p162.p163.p186.C2294;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2985;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2986;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f2987;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ViewPropertyAnimator f2988;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0394 extends AnimatorListenerAdapter {
        public C0394() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2988 = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f2987 = 0;
        this.f2985 = 2;
        this.f2986 = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2987 = 0;
        this.f2985 = 2;
        this.f2986 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: 〻ぞまぎな〻 */
    public boolean mo345(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ざとぅぼこ〺 */
    public void mo357(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f2985 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2988;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f2985 = 1;
            m1308(v, this.f2987 + this.f2986, 175L, C2294.f9508);
            return;
        }
        if (i2 >= 0 || this.f2985 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2988;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.f2985 = 2;
        m1308(v, 0, 225L, C2294.f9511);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m1308(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f2988 = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C0394());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぺふねづ〺 */
    public boolean mo369(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f2987 = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }
}
