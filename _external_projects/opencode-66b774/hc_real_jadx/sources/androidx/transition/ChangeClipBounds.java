package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p034.p035.p045.C1096;
import p034.p095.C1700;
import p034.p095.C1705;
import p034.p095.C1714;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final String[] f1736 = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0264 extends AnimatorListenerAdapter {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ View f1737;

        public C0264(ChangeClipBounds changeClipBounds, View view) {
            this.f1737 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1096.m2494(this.f1737, null);
        }
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m995(c1700);
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぉざぅち〻 */
    public String[] mo987() {
        return f1736;
    }

    @Override // androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m995(c1700);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m995(C1700 c1700) {
        View view = c1700.f7838;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect m2481 = C1096.m2481(view);
        c1700.f7840.put("android:clipBounds:clip", m2481);
        if (m2481 == null) {
            c1700.f7840.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: ぺふねづ〺 */
    public Animator mo990(ViewGroup viewGroup, C1700 c1700, C1700 c17002) {
        ObjectAnimator objectAnimator = null;
        if (c1700 != null && c17002 != null && c1700.f7840.containsKey("android:clipBounds:clip") && c17002.f7840.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) c1700.f7840.get("android:clipBounds:clip");
            Rect rect2 = (Rect) c17002.f7840.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) c1700.f7840.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) c17002.f7840.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            C1096.m2494(c17002.f7838, rect);
            objectAnimator = ObjectAnimator.ofObject(c17002.f7838, (Property<View, V>) C1714.f7880, (TypeEvaluator) new C1705(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimator.addListener(new C0264(this, c17002.f7838));
            }
        }
        return objectAnimator;
    }
}
