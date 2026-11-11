package p034.p078.p079;

import android.animation.ValueAnimator;
import p034.p078.p079.C1491;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1485 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C1491 f6863;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1491.C1492 f6864;

    public C1485(C1491 c1491, C1491.C1492 c1492) {
        this.f6863 = c1491;
        this.f6864 = c1492;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6863.m3242(floatValue, this.f6864);
        this.f6863.m3241(floatValue, this.f6864, false);
        this.f6863.invalidateSelf();
    }
}
