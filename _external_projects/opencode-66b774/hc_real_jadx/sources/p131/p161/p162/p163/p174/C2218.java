package p131.p161.p162.p163.p174;

import android.animation.ValueAnimator;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2218 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2208 f9208;

    public C2218(C2208 c2208) {
        this.f9208 = c2208;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9208.f9206.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
