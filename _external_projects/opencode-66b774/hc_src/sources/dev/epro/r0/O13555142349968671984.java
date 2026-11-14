package dev.epro.r0;

import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O13555142349968671984 implements R13600139557160461432, I2388620560486547149 {
    public final S7974369370986781936 a;
    public final S12944751221596631194 b;
    public boolean c;
    public R3192876217964974737 d;
    public T15443218846549482730 e = B11964701839924937722.c;

    public O13555142349968671984(S7974369370986781936 s7974369370986781936, S12944751221596631194 s12944751221596631194) {
        this.a = s7974369370986781936;
        this.b = s12944751221596631194;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            S7974369370986781936 s7974369370986781936 = this.a;
            s7974369370986781936.getView().setTag(R.id.wrapped_composition_tag, null);
            R3192876217964974737 r3192876217964974737 = this.d;
            if (r3192876217964974737 != null) {
                r3192876217964974737.b(this);
            }
            this.d = null;
            U4939199919397343421 u4939199919397343421 = s7974369370986781936.g;
            if (u4939199919397343421 != null) {
                u4939199919397343421.b.invoke();
            }
            s7974369370986781936.g = null;
        }
        this.b.p();
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        if (p72364327365747079 == P72364327365747079.ON_DESTROY) {
            a();
        } else {
            if (p72364327365747079 != P72364327365747079.ON_CREATE || this.c) {
                return;
            }
            f(this.e);
        }
    }

    public final void f(L12639328004344855510 l12639328004344855510) {
        this.a.setOnReadyForComposition(new Y14986451238933639207(this, (T15443218846549482730) l12639328004344855510, (byte) 23));
    }
}
