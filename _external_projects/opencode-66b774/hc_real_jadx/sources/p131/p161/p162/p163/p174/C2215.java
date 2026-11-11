package p131.p161.p162.p163.p174;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2215 extends AnimatorListenerAdapter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2190 f9204;

    public C2215(C2190 c2190) {
        this.f9204 = c2190;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C2190 c2190 = this.f9204;
        c2190.f9206.setChecked(c2190.f9159);
        this.f9204.f9160.start();
    }
}
