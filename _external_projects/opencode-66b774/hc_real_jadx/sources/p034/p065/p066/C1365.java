package p034.p065.p066;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1365 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f6503;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6504;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView.AbstractC0207 f6505;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f6506;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6507;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ int f6508;

    public C1365(C1412 c1412, RecyclerView.AbstractC0207 abstractC0207, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6507 = c1412;
        this.f6505 = abstractC0207;
        this.f6503 = i;
        this.f6504 = view;
        this.f6508 = i2;
        this.f6506 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f6503 != 0) {
            this.f6504.setTranslationX(0.0f);
        }
        if (this.f6508 != 0) {
            this.f6504.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f6506.setListener(null);
        this.f6507.m895(this.f6505);
        this.f6507.f6651.remove(this.f6505);
        this.f6507.m3182();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6507.getClass();
    }
}
