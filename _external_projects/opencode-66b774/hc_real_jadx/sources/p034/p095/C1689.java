package p034.p095;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* renamed from: づざかべべ.は〲ぱなで.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1689 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final boolean f7819;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final boolean f7820;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final boolean f7821;

    /* renamed from: づざかべべ.は〲ぱなで.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1690 implements TypeEvaluator<Matrix> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final float[] f7824 = new float[9];

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final float[] f7822 = new float[9];

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Matrix f7823 = new Matrix();

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f7824);
            matrix2.getValues(this.f7822);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f7822;
                float f2 = fArr[i];
                float[] fArr2 = this.f7824;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f7823.setValues(this.f7822);
            return this.f7823;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f7821 = i >= 19;
        f7819 = i >= 18;
        f7820 = i >= 28;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Animator m3739(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
