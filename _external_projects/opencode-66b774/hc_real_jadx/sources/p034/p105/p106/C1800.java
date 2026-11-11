package p034.p105.p106;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1800 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f8100;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8101;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f8102;

    public C1800(LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f8102 = viewGroup;
        this.f8100 = view;
        this.f8101 = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f8102.endViewTransition(this.f8100);
        animator.removeListener(this);
        Fragment fragment = this.f8101;
        View view = fragment.f1186;
        if (view == null || !fragment.f1180) {
            return;
        }
        view.setVisibility(8);
    }
}
