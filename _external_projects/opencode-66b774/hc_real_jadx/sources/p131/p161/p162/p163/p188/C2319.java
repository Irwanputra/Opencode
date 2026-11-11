package p131.p161.p162.p163.p188;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p131.p161.p162.p163.p188.C2301;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2319 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9596;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2301.InterfaceC2308 f9597;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f9598;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C2301 f9599;

    public C2319(C2301 c2301, boolean z, C2301.InterfaceC2308 interfaceC2308) {
        this.f9599 = c2301;
        this.f9596 = z;
        this.f9597 = interfaceC2308;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f9598 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C2301 c2301 = this.f9599;
        c2301.f9541 = 0;
        c2301.f9537 = null;
        if (this.f9598) {
            return;
        }
        FloatingActionButton floatingActionButton = c2301.f9535;
        boolean z = this.f9596;
        floatingActionButton.m1445(z ? 8 : 4, z);
        C2301.InterfaceC2308 interfaceC2308 = this.f9597;
        if (interfaceC2308 != null) {
            C2317 c2317 = (C2317) interfaceC2308;
            c2317.f9595.mo1442(c2317.f9594);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f9599.f9535.m1445(0, this.f9596);
        C2301 c2301 = this.f9599;
        c2301.f9541 = 1;
        c2301.f9537 = animator;
        this.f9598 = false;
    }
}
