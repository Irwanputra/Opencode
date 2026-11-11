package p034.p095;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;

/* renamed from: づざかべべ.は〲ぱなで.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1706 extends AnimatorListenerAdapter {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ ChangeTransform f7850;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Matrix f7851 = new Matrix();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ ChangeTransform.C0272 f7852;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7853;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f7854;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ View f7855;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ ChangeTransform.C0271 f7856;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Matrix f7857;

    public C1706(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.C0271 c0271, ChangeTransform.C0272 c0272) {
        this.f7850 = changeTransform;
        this.f7853 = z;
        this.f7857 = matrix;
        this.f7855 = view;
        this.f7856 = c0271;
        this.f7852 = c0272;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f7854 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f7854) {
            if (this.f7853 && this.f7850.f1747) {
                this.f7851.set(this.f7857);
                this.f7855.setTag(C1740.transition_transform, this.f7851);
                this.f7856.m1001(this.f7855);
            } else {
                this.f7855.setTag(C1740.transition_transform, null);
                this.f7855.setTag(C1740.parent_matrix, null);
            }
        }
        C1714.f7881.mo3751(this.f7855, null);
        this.f7856.m1001(this.f7855);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        this.f7851.set(this.f7852.f1762);
        this.f7855.setTag(C1740.transition_transform, this.f7851);
        this.f7856.m1001(this.f7855);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        ChangeTransform.m999(this.f7855);
    }
}
