package p131.p161.p162.p163.p185;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2267 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ArrayList<C2268> f9456 = new ArrayList<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2268 f9454 = null;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ValueAnimator f9455 = null;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Animator.AnimatorListener f9457 = new C2269();

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public static class C2268 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ValueAnimator f9458;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int[] f9459;

        public C2268(int[] iArr, ValueAnimator valueAnimator) {
            this.f9459 = iArr;
            this.f9458 = valueAnimator;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2269 extends AnimatorListenerAdapter {
        public C2269() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2267 c2267 = C2267.this;
            if (c2267.f9455 == animator) {
                c2267.f9455 = null;
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4438(int[] iArr, ValueAnimator valueAnimator) {
        C2268 c2268 = new C2268(iArr, valueAnimator);
        valueAnimator.addListener(this.f9457);
        this.f9456.add(c2268);
    }
}
