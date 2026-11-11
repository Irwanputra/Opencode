package p131.p161.p162.p163.p174;

import android.animation.ValueAnimator;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2214 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2208 f9203;

    public C2214(C2208 c2208) {
        this.f9203 = c2208;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9203.f9206.setScaleX(floatValue);
        this.f9203.f9206.setScaleY(floatValue);
    }
}
