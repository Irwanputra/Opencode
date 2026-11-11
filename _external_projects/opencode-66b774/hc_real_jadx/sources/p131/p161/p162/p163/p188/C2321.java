package p131.p161.p162.p163.p188;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2321 implements TypeEvaluator<Float> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public FloatEvaluator f9602 = new FloatEvaluator();

    public C2321(C2301 c2301) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.f9602.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
