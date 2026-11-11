package p034.p065.p066;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1371 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f6518;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f6519;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView.AbstractC0207 f6520;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6521;

    public C1371(C1412 c1412, RecyclerView.AbstractC0207 abstractC0207, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6521 = c1412;
        this.f6520 = abstractC0207;
        this.f6518 = view;
        this.f6519 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f6518.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f6519.setListener(null);
        this.f6521.m895(this.f6520);
        this.f6521.f6653.remove(this.f6520);
        this.f6521.m3182();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6521.getClass();
    }
}
