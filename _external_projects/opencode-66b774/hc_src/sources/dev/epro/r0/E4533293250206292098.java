package dev.epro.r0;

import android.graphics.RectF;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E4533293250206292098 extends U15853425786981391261 {
    public final int s;

    public E4533293250206292098(int i) {
        this.s = i;
    }

    @Override // dev.epro.r0.U15853425786981391261
    public final float P(I11571046933844109529 i11571046933844109529) {
        float[] fArr = i11571046933844109529.B;
        if (fArr != null) {
            return fArr[this.s];
        }
        return 0.0f;
    }

    @Override // dev.epro.r0.U15853425786981391261
    public final void d0(I11571046933844109529 i11571046933844109529, float f) {
        float a;
        float[] fArr = i11571046933844109529.B;
        if (fArr != null) {
            int i = this.s;
            if (fArr[i] != f) {
                fArr[i] = f;
                L4980660535418402690 l4980660535418402690 = i11571046933844109529.D;
                if (l4980660535418402690 != null) {
                    E1005111105761972824 e1005111105761972824 = i11571046933844109529.s;
                    if (fArr != null) {
                        a = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                    } else {
                        RectF e = i11571046933844109529.e();
                        A11042752882447342413 c = i11571046933844109529.b.a.c();
                        e1005111105761972824.getClass();
                        a = (((i11571046933844109529.b.a.c().h.a(e) + c.e.a(e)) - i11571046933844109529.b.a.c().g.a(e)) - i11571046933844109529.b.a.c().f.a(e)) / 2.0f;
                    }
                    Y5360590127176187529 y5360590127176187529 = (Y5360590127176187529) l4980660535418402690.b;
                    int i2 = (int) (a * 0.11f);
                    if (y5360590127176187529.D != i2) {
                        y5360590127176187529.D = i2;
                        y5360590127176187529.s();
                        y5360590127176187529.invalidate();
                    }
                }
                i11571046933844109529.invalidateSelf();
            }
        }
    }
}
