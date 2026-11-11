package p131.p161.p162.p163.p174;

import android.animation.ValueAnimator;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2221 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2190 f9236;

    public C2221(C2190 c2190) {
        this.f9236 = c2190;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9236.f9206.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
