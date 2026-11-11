package p034.p105.p106;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class AnimationAnimationListenerC1785 implements Animation.AnimationListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8029;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C1815 f8030;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f8031;

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1786 implements Runnable {
        public RunnableC1786() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnimationAnimationListenerC1785.this.f8029.m482() != null) {
                AnimationAnimationListenerC1785.this.f8029.m478(null);
                AnimationAnimationListenerC1785 animationAnimationListenerC1785 = AnimationAnimationListenerC1785.this;
                LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = animationAnimationListenerC1785.f8030;
                Fragment fragment = animationAnimationListenerC1785.f8029;
                layoutInflaterFactory2C1815.m3922(fragment, fragment.m481(), 0, 0, false);
            }
        }
    }

    public AnimationAnimationListenerC1785(LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815, ViewGroup viewGroup, Fragment fragment) {
        this.f8030 = layoutInflaterFactory2C1815;
        this.f8031 = viewGroup;
        this.f8029 = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f8031.post(new RunnableC1786());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
