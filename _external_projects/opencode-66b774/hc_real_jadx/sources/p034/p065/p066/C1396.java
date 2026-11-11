package p034.p065.p066;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1396 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f6600;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6601;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView.AbstractC0207 f6602;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6603;

    public C1396(C1412 c1412, RecyclerView.AbstractC0207 abstractC0207, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6603 = c1412;
        this.f6602 = abstractC0207;
        this.f6600 = viewPropertyAnimator;
        this.f6601 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f6600.setListener(null);
        this.f6601.setAlpha(1.0f);
        this.f6603.m895(this.f6602);
        this.f6603.f6652.remove(this.f6602);
        this.f6603.m3182();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6603.getClass();
    }
}
