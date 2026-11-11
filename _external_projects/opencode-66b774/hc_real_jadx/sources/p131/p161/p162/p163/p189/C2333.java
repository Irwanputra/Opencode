package p131.p161.p162.p163.p189;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2333 extends AnimatorListenerAdapter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2327 f9620;

    public C2333(InterfaceC2327 interfaceC2327) {
        this.f9620 = interfaceC2327;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f9620.mo1398();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f9620.mo1397();
    }
}
