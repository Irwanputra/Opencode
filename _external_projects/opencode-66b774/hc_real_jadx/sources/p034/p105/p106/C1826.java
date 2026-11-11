package p034.p105.p106;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1826 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f8187;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8188;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f8189;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C1815 f8190;

    public C1826(LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f8190 = layoutInflaterFactory2C1815;
        this.f8189 = viewGroup;
        this.f8187 = view;
        this.f8188 = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f8189.endViewTransition(this.f8187);
        Animator m477 = this.f8188.m477();
        this.f8188.m522(null);
        if (m477 == null || this.f8189.indexOfChild(this.f8187) >= 0) {
            return;
        }
        LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = this.f8190;
        Fragment fragment = this.f8188;
        layoutInflaterFactory2C1815.m3922(fragment, fragment.m481(), 0, 0, false);
    }
}
