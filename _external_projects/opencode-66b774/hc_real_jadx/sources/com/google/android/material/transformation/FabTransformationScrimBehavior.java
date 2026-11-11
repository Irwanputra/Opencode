package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p034.p095.C1687;
import p131.p161.p162.p163.p186.C2289;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2289 f3646;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2289 f3647;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0487 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f3648;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3649;

        public C0487(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f3649 = z;
            this.f3648 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3649) {
                return;
            }
            this.f3648.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f3649) {
                this.f3648.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f3646 = new C2289(75L, 150L);
        this.f3647 = new C2289(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3646 = new C2289(75L, 150L);
        this.f3647 = new C2289(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: ぅみぱぎぎ */
    public AnimatorSet mo1554(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        m1567(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        C1687.m3685(animatorSet, arrayList);
        animatorSet.addListener(new C0487(this, z, view2));
        return animatorSet;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m1567(View view, boolean z, boolean z2, List list) {
        ObjectAnimator ofFloat;
        C2289 c2289 = z ? this.f3646 : this.f3647;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c2289.m4448(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びえぁぜい */
    public boolean mo364(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びぐびあび */
    public boolean mo365(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
