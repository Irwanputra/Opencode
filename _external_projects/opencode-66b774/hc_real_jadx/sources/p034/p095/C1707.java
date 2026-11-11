package p034.p095;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: づざかべべ.は〲ぱなで.けときぜと, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1707 extends C1739 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean f7858 = true;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static boolean f7859 = true;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static boolean f7860 = true;

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: 〳ぜぞぜべっ */
    public void mo3747(View view, Matrix matrix) {
        if (f7858) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7858 = false;
            }
        }
    }

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: びぐびあび */
    public void mo3751(View view, Matrix matrix) {
        if (f7859) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f7859 = false;
            }
        }
    }

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: ぺぁあねじ */
    public void mo3752(View view, Matrix matrix) {
        if (f7860) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7860 = false;
            }
        }
    }
}
