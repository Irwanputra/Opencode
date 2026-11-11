package p131.p221.p222.p223;

import android.view.animation.Animation;
import com.codetroopers.betterpickers.numberpicker.NumberPickerErrorTextView;

/* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.てぜきぽく.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class AnimationAnimationListenerC2684 implements Animation.AnimationListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ NumberPickerErrorTextView f10153;

    public AnimationAnimationListenerC2684(NumberPickerErrorTextView numberPickerErrorTextView) {
        this.f10153 = numberPickerErrorTextView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f10153.setVisibility(4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
