package p034.p081.p082.p083;

import android.view.animation.Interpolator;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractInterpolatorC1511 implements Interpolator {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float f6962;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final float[] f6963;

    public AbstractInterpolatorC1511(float[] fArr) {
        this.f6963 = fArr;
        this.f6962 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6963;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f6962;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f6963;
        return C2098.m4188(fArr2[min + 1], fArr2[min], f3, fArr2[min]);
    }
}
