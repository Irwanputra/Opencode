package p131.p161.p162.p163.p191;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import p131.p161.p162.p163.p173.C2163;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2343 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2163 f9634;

    public C2343(AppBarLayout appBarLayout, C2163 c2163) {
        this.f9634 = c2163;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9634.m4263(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
