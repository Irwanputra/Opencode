package p131.p161.p162.p163.p188;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2320 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2318 f9600;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f9601;

    public C2320(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC2318 interfaceC2318) {
        this.f9600 = interfaceC2318;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f9601 = true;
        this.f9600.mo1420();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f9600.mo1416();
        if (this.f9601) {
            return;
        }
        this.f9600.mo1417(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f9600.onAnimationStart(animator);
        this.f9601 = false;
    }
}
