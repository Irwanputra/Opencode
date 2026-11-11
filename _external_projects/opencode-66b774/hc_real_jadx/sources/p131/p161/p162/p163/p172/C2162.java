package p131.p161.p162.p163.p172;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉざぅち〻.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2162 extends AnimatorListenerAdapter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ BottomAppBar f9041;

    public C2162(BottomAppBar bottomAppBar) {
        this.f9041 = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        float fabTranslationX;
        this.f9041.f3009.onAnimationStart(animator);
        FloatingActionButton m1323 = this.f9041.m1323();
        if (m1323 != null) {
            fabTranslationX = this.f9041.getFabTranslationX();
            m1323.setTranslationX(fabTranslationX);
        }
    }
}
