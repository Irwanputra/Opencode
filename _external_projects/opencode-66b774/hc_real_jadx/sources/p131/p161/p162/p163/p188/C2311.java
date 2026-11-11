package p131.p161.p162.p163.p188;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p131.p161.p162.p163.p188.C2301;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2311 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2301.InterfaceC2308 f9572;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2301 f9573;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9574;

    public C2311(C2301 c2301, boolean z, C2301.InterfaceC2308 interfaceC2308) {
        this.f9573 = c2301;
        this.f9574 = z;
        this.f9572 = interfaceC2308;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C2301 c2301 = this.f9573;
        c2301.f9541 = 0;
        c2301.f9537 = null;
        C2301.InterfaceC2308 interfaceC2308 = this.f9572;
        if (interfaceC2308 != null) {
            C2317 c2317 = (C2317) interfaceC2308;
            c2317.f9595.mo1441(c2317.f9594);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f9573.f9535.m1445(0, this.f9574);
        C2301 c2301 = this.f9573;
        c2301.f9541 = 2;
        c2301.f9537 = animator;
    }
}
