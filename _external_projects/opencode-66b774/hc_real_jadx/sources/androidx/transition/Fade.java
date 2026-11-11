package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.p044.C1056;
import p034.p035.p045.C1096;
import p034.p095.C1700;
import p034.p095.C1708;
import p034.p095.C1711;
import p034.p095.C1712;
import p034.p095.C1714;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$〺つふすそ, reason: contains not printable characters */
    public static class C0273 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1768 = false;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View f1769;

        public C0273(View view) {
            this.f1769 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1714.f7881.mo3750(this.f1769, 1.0f);
            if (this.f1768) {
                this.f1769.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f1769;
            AtomicInteger atomicInteger = C1096.f5578;
            if ((Build.VERSION.SDK_INT >= 16 ? view.hasOverlappingRendering() : true) && this.f1769.getLayerType() == 0) {
                this.f1768 = true;
                this.f1769.setLayerType(2, null);
            }
        }
    }

    /* renamed from: androidx.transition.Fade$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0274 extends C1711 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ View f1770;

        public C0274(Fade fade, View view) {
            this.f1770 = view;
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            View view = this.f1770;
            C1708 c1708 = C1714.f7881;
            c1708.mo3750(view, 1.0f);
            c1708.mo3757(this.f1770);
            transition.mo1038(this);
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        m1052(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7874);
        m1052(C1056.m2395(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f1819));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m1053(c1700);
        c1700.f7840.put("android:fade:transitionAlpha", Float.valueOf(C1714.m3762(c1700.f7838)));
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final Animator m1007(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1714.f7881.mo3750(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1714.f7879, f2);
        ofFloat.addListener(new C0273(view));
        mo1024(new C0274(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility
    /* renamed from: ぇとしたべど */
    public Animator mo1005(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        C1714.f7881.mo3756(view);
        Float f = (Float) c1700.f7840.get("android:fade:transitionAlpha");
        return m1007(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: おかぷせ〱 */
    public Animator mo1006(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        Float f;
        float floatValue = (c1700 == null || (f = (Float) c1700.f7840.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        return m1007(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }
}
