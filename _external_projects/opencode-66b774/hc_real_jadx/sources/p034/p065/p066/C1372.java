package p034.p065.p066;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import p034.p065.p066.C1412;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1372 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f6522;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6523;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1412.C1414 f6524;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1412 f6525;

    public C1372(C1412 c1412, C1412.C1414 c1414, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6525 = c1412;
        this.f6524 = c1414;
        this.f6522 = viewPropertyAnimator;
        this.f6523 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f6522.setListener(null);
        this.f6523.setAlpha(1.0f);
        this.f6523.setTranslationX(0.0f);
        this.f6523.setTranslationY(0.0f);
        this.f6525.m895(this.f6524.f6665);
        this.f6525.f6654.remove(this.f6524.f6665);
        this.f6525.m3182();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C1412 c1412 = this.f6525;
        RecyclerView.AbstractC0207 abstractC0207 = this.f6524.f6665;
        c1412.getClass();
    }
}
