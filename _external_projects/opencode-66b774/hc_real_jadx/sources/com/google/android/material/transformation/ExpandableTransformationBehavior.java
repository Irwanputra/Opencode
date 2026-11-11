package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AnimatorSet f3633;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0484 extends AnimatorListenerAdapter {
        public C0484() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f3633 = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public abstract AnimatorSet mo1554(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: どぇぞほだ */
    public boolean mo1552(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f3633;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo1554 = mo1554(view, view2, z, z3);
        this.f3633 = mo1554;
        mo1554.addListener(new C0484());
        this.f3633.start();
        if (!z2) {
            this.f3633.end();
        }
        return true;
    }
}
