package dev.epro.r0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R6158379668147516647 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public R6158379668147516647(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        I11571046933844109529 i11571046933844109529 = this.a.s;
        if (i11571046933844109529 != null) {
            G8524789311406442313 g8524789311406442313 = i11571046933844109529.b;
            if (g8524789311406442313.i != floatValue) {
                g8524789311406442313.i = floatValue;
                i11571046933844109529.f = true;
                i11571046933844109529.g = true;
                i11571046933844109529.invalidateSelf();
            }
        }
    }
}
