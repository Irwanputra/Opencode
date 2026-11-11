package p131.p161.p162.p163.p185;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;
import p034.p095.C1700;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2286 extends Transition {

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2287 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ TextView f9497;

        public C2287(C2286 c2286, TextView textView) {
            this.f9497 = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f9497.setScaleX(floatValue);
            this.f9497.setScaleY(floatValue);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m4446(c1700);
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m4446(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m4446(C1700 c1700) {
        View view = c1700.f7838;
        if (view instanceof TextView) {
            c1700.f7840.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        if (c1700 == null || c17002 == null || !(c1700.f7838 instanceof TextView)) {
            return null;
        }
        View view = c17002.f7838;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = c1700.f7840;
        Map<String, Object> map2 = c17002.f7840;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new C2287(this, textView));
        return ofFloat;
    }
}
