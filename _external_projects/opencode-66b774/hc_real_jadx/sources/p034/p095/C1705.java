package p034.p095;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: づざかべべ.は〲ぱなで.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1705 implements TypeEvaluator<Rect> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Rect f7849;

    public C1705() {
    }

    public C1705(Rect rect) {
        this.f7849 = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left + ((int) ((rect4.left - r0) * f));
        int i2 = rect3.top + ((int) ((rect4.top - r1) * f));
        int i3 = rect3.right + ((int) ((rect4.right - r2) * f));
        int i4 = rect3.bottom + ((int) ((rect4.bottom - r6) * f));
        Rect rect5 = this.f7849;
        if (rect5 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect5.set(i, i2, i3, i4);
        return this.f7849;
    }
}
