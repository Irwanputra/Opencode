package p034.p065.p066;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1412;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1411 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f6644;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6645;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1412.C1414 f6646;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6647;

    public C1411(C1412 c1412, C1412.C1414 c1414, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6647 = c1412;
        this.f6646 = c1414;
        this.f6644 = viewPropertyAnimator;
        this.f6645 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f6644.setListener(null);
        this.f6645.setAlpha(1.0f);
        this.f6645.setTranslationX(0.0f);
        this.f6645.setTranslationY(0.0f);
        this.f6647.m895(this.f6646.f6667);
        this.f6647.f6654.remove(this.f6646.f6667);
        this.f6647.m3182();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C1412 c1412 = this.f6647;
        RecyclerView.AbstractC0207 abstractC0207 = this.f6646.f6667;
        c1412.getClass();
    }
}
