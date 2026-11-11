package p131.p161.p162.p163.p191;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2344 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ CollapsingToolbarLayout f9635;

    public C2344(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f9635 = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9635.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
