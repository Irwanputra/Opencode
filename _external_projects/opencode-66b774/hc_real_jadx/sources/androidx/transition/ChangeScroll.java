package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p034.p095.C1689;
import p034.p095.C1700;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChangeScroll extends Transition {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final String[] f1742 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m997(c1700);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return f1742;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m997(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m997(C1700 c1700) {
        c1700.f7840.put("android:changeScroll:x", Integer.valueOf(c1700.f7838.getScrollX()));
        c1700.f7840.put("android:changeScroll:y", Integer.valueOf(c1700.f7838.getScrollY()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (c1700 == null || c17002 == null) {
            return null;
        }
        View view = c17002.f7838;
        int intValue = ((Integer) c1700.f7840.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) c17002.f7840.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) c1700.f7840.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) c17002.f7840.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return C1689.m3739(objectAnimator, objectAnimator2);
    }
}
