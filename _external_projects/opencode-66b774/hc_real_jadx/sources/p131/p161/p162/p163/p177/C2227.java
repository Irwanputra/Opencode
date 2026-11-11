package p131.p161.p162.p163.p177;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import p131.p161.p162.p163.p189.InterfaceC2327;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.げがぴうあだ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2227 extends AnimatorListenerAdapter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2327 f9243;

    public C2227(FabTransformationBehavior fabTransformationBehavior, InterfaceC2327 interfaceC2327) {
        this.f9243 = interfaceC2327;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        InterfaceC2327.C2331 revealInfo = this.f9243.getRevealInfo();
        revealInfo.f9617 = Float.MAX_VALUE;
        this.f9243.setRevealInfo(revealInfo);
    }
}
