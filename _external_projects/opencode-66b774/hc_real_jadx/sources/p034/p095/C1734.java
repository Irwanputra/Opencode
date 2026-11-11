package p034.p095;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import p034.p080.C1502;

/* renamed from: づざかべべ.は〲ぱなで.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1734 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Transition f7915;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1502 f7916;

    public C1734(Transition transition, C1502 c1502) {
        this.f7915 = transition;
        this.f7916 = c1502;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7916.remove(animator);
        this.f7915.f1803.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7915.f1803.add(animator);
    }
}
