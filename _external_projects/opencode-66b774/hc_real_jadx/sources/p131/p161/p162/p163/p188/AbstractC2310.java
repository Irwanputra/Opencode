package p131.p161.p162.p163.p188;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import p034.p095.C1687;
import p131.p161.p162.p163.p186.C2291;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2310 implements InterfaceC2318 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ExtendedFloatingActionButton f9566;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ArrayList<Animator.AnimatorListener> f9567 = new ArrayList<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f9568;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2291 f9569;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2291 f9570;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2316 f9571;

    public AbstractC2310(ExtendedFloatingActionButton extendedFloatingActionButton, C2316 c2316) {
        this.f9566 = extendedFloatingActionButton;
        this.f9568 = extendedFloatingActionButton.getContext();
        this.f9571 = c2316;
    }

    @Override // p131.p161.p162.p163.p188.InterfaceC2318
    public void onAnimationStart(Animator animator) {
        C2316 c2316 = this.f9571;
        Animator animator2 = c2316.f9593;
        if (animator2 != null) {
            animator2.cancel();
        }
        c2316.f9593 = animator;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public AnimatorSet m4482(C2291 c2291) {
        ArrayList arrayList = new ArrayList();
        if (c2291.m4452("opacity")) {
            arrayList.add(c2291.m4455("opacity", this.f9566, View.ALPHA));
        }
        if (c2291.m4452("scale")) {
            arrayList.add(c2291.m4455("scale", this.f9566, View.SCALE_Y));
            arrayList.add(c2291.m4455("scale", this.f9566, View.SCALE_X));
        }
        if (c2291.m4452("width")) {
            arrayList.add(c2291.m4455("width", this.f9566, ExtendedFloatingActionButton.f3256));
        }
        if (c2291.m4452("height")) {
            arrayList.add(c2291.m4455("height", this.f9566, ExtendedFloatingActionButton.f3255));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C1687.m3685(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // p131.p161.p162.p163.p188.InterfaceC2318
    /* renamed from: 〺つふすそ */
    public void mo1420() {
        this.f9571.f9593 = null;
    }

    @Override // p131.p161.p162.p163.p188.InterfaceC2318
    /* renamed from: げつ〴ぬぐ */
    public void mo1416() {
        this.f9571.f9593 = null;
    }

    @Override // p131.p161.p162.p163.p188.InterfaceC2318
    /* renamed from: づざかべべ */
    public AnimatorSet mo1419() {
        return m4482(m4483());
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C2291 m4483() {
        C2291 c2291 = this.f9570;
        if (c2291 != null) {
            return c2291;
        }
        if (this.f9569 == null) {
            this.f9569 = C2291.m4449(this.f9568, mo1415());
        }
        C2291 c22912 = this.f9569;
        c22912.getClass();
        return c22912;
    }
}
