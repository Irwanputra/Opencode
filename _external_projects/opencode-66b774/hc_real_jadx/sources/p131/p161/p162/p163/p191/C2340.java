package p131.p161.p162.p163.p191;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2340 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ AppBarLayout f9625;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9626;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ CoordinatorLayout f9627;

    public C2340(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f9626 = baseBehavior;
        this.f9627 = coordinatorLayout;
        this.f9625 = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9626.m1291(this.f9627, this.f9625, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
