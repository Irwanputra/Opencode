package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9610972087028600954 {
    public static dev.epro.r0.C9610972087028600954 h;
    public final dev.epro.r0.F10342546226345611902 a;
    public final dev.epro.r0.S16571168858015125610 b;
    public final dev.epro.r0.V14115061890849225617 c;
    public final dev.epro.r0.U14340554418656580554 d;
    public final dev.epro.r0.S16571168858015125610 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public C9610972087028600954(dev.epro.r0.F10342546226345611902 f10342546226345611902, dev.epro.r0.S16571168858015125610 s16571168858015125610, dev.epro.r0.V14115061890849225617 v14115061890849225617, dev.epro.r0.U14340554418656580554 u14340554418656580554) {
        this.a = f10342546226345611902;
        this.b = s16571168858015125610;
        this.c = v14115061890849225617;
        this.d = u14340554418656580554;
        this.e = dev.epro.r0.H4776669175763245653.l(s16571168858015125610, f10342546226345611902);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        int i2 = 1;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            java.lang.String str = dev.epro.r0.U1857154561091831020.a;
            dev.epro.r0.S16571168858015125610 s16571168858015125610 = this.e;
            dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
            dev.epro.r0.U14340554418656580554 u14340554418656580554 = this.d;
            dev.epro.r0.V14115061890849225617 v14115061890849225617 = this.c;
            dev.epro.r0.R8360857824092671497 r8360857824092671497 = new dev.epro.r0.R8360857824092671497(new dev.epro.r0.D417720124633959953(str, s16571168858015125610, o2161699089510411363, o2161699089510411363, u14340554418656580554, v14115061890849225617, false), 1, 1, dev.epro.r0.O15160157444238005800.b(0, 0, 0, 0, 15));
            i2 = 1;
            float f3 = new dev.epro.r0.R8360857824092671497(new dev.epro.r0.D417720124633959953(dev.epro.r0.U1857154561091831020.b, s16571168858015125610, o2161699089510411363, o2161699089510411363, this.d, v14115061890849225617, true), 2, 1, dev.epro.r0.O15160157444238005800.b(0, 0, 0, 0, 15)).f;
            float f4 = r8360857824092671497.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i2) {
            int iRound = java.lang.Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = dev.epro.r0.I16980768508151520658.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = dev.epro.r0.I16980768508151520658.j(j);
        }
        return dev.epro.r0.O15160157444238005800.a(dev.epro.r0.I16980768508151520658.k(j), dev.epro.r0.I16980768508151520658.i(j), iJ, dev.epro.r0.I16980768508151520658.h(j));
    }
}
