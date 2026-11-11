package p131.p161.p162.p163.p187;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p131.p161.p162.p163.p173.C2163;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.は〲ぱなで.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2300 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ BottomSheetBehavior f9519;

    public C2300(BottomSheetBehavior bottomSheetBehavior) {
        this.f9519 = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C2163 c2163 = this.f9519.f3133;
        if (c2163 != null) {
            c2163.m4253(floatValue);
        }
    }
}
