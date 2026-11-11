package p034.p095;

import android.animation.TypeEvaluator;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.は〲ぱなで.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1718 implements TypeEvaluator<float[]> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float[] f7883;

    public C1718(float[] fArr) {
        this.f7883 = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f7883;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i = 0; i < fArr5.length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = C2098.m4188(fArr4[i], f2, f, f2);
        }
        return fArr5;
    }
}
