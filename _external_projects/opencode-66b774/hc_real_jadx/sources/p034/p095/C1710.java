package p034.p095;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* renamed from: づざかべべ.は〲ぱなで.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1710 extends AnimatorListenerAdapter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Transition f7866;

    public C1710(Transition transition) {
        this.f7866 = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7866.m1035();
        animator.removeListener(this);
    }
}
