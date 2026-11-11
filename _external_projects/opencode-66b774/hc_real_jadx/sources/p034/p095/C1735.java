package p034.p095;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.は〲ぱなで.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1735 {

    /* renamed from: づざかべべ.は〲ぱなで.びえぁぜい$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1736 extends AnimatorListenerAdapter implements Transition.InterfaceC0287 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final float f7917;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final View f7918;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float f7919;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f7920;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View f7921;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int[] f7922;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f7923;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f7924;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public final float f7925;

        public C1736(View view, View view2, int i, int i2, float f, float f2) {
            this.f7918 = view;
            this.f7921 = view2;
            this.f7920 = i - Math.round(view.getTranslationX());
            this.f7924 = i2 - Math.round(view.getTranslationY());
            this.f7917 = f;
            this.f7925 = f2;
            int i3 = C1740.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f7922 = iArr;
            if (iArr != null) {
                view2.setTag(i3, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f7922 == null) {
                this.f7922 = new int[2];
            }
            this.f7922[0] = Math.round(this.f7918.getTranslationX() + this.f7920);
            this.f7922[1] = Math.round(this.f7918.getTranslationY() + this.f7924);
            this.f7921.setTag(C1740.transition_position, this.f7922);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f7923 = this.f7918.getTranslationX();
            this.f7919 = this.f7918.getTranslationY();
            this.f7918.setTranslationX(this.f7917);
            this.f7918.setTranslationY(this.f7925);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f7918.setTranslationX(this.f7923);
            this.f7918.setTranslationY(this.f7919);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: 〺つふすそ */
        public void mo991(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: くし〴〺ぅ */
        public void mo992(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: げつ〴ぬぐ */
        public void mo1043(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: づざかべべ */
        public void mo993(Transition transition) {
            this.f7918.setTranslationX(this.f7917);
            this.f7918.setTranslationY(this.f7925);
            transition.mo1038(this);
        }

        @Override // androidx.transition.Transition.InterfaceC0287
        /* renamed from: びぐびあび */
        public void mo994(Transition transition) {
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Animator m3782(View view, C1700 c1700, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c1700.f7838.getTag(C1740.transition_position)) != null) {
            f5 = (r4[0] - i) + translationX;
            f6 = (r4[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        C1736 c1736 = new C1736(view, c1700.f7838, round, round2, translationX, translationY);
        transition.mo1024(c1736);
        ofPropertyValuesHolder.addListener(c1736);
        C2786.m4796(ofPropertyValuesHolder, c1736);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
