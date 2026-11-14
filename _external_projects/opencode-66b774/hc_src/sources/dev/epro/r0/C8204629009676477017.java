package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class C8204629009676477017 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ F9886074403848142923 b;

    public /* synthetic */ C8204629009676477017(F9886074403848142923 f9886074403848142923, byte b) {
        this.a = b;
        this.b = f9886074403848142923;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        float f = 0.0f;
        F9886074403848142923 f9886074403848142923 = this.b;
        switch (b) {
            case 0:
                Object value = f9886074403848142923.d.getValue();
                if (value != null) {
                    return value;
                }
                float g = f9886074403848142923.f.g();
                boolean isNaN = Float.isNaN(g);
                V697849047308847220 v697849047308847220 = f9886074403848142923.c;
                return !isNaN ? f9886074403848142923.c(g, 0.0f, v697849047308847220.getValue()) : v697849047308847220.getValue();
            case 1:
                Object value2 = f9886074403848142923.d.getValue();
                if (value2 != null) {
                    return value2;
                }
                float g2 = f9886074403848142923.f.g();
                boolean isNaN2 = Float.isNaN(g2);
                V697849047308847220 v6978490473088472202 = f9886074403848142923.c;
                if (isNaN2) {
                    return v6978490473088472202.getValue();
                }
                Object value3 = v6978490473088472202.getValue();
                D17840030713596081464 e = f9886074403848142923.e();
                float d = e.d(value3);
                if (d != g2 && !Float.isNaN(d)) {
                    if (d < g2) {
                        Object b2 = e.b(g2, true);
                        if (b2 != null) {
                            return b2;
                        }
                    } else {
                        Object b3 = e.b(g2, false);
                        if (b3 != null) {
                            return b3;
                        }
                    }
                }
                return value3;
            case 2:
                float d2 = f9886074403848142923.e().d(f9886074403848142923.c.getValue());
                float d3 = f9886074403848142923.e().d(((B4739506393801054036) f9886074403848142923.n).getValue()) - d2;
                float abs = Math.abs(d3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float i = (f9886074403848142923.i() - d2) / d3;
                    if (i >= 1.0E-6f) {
                        if (i <= 0.999999f) {
                            f = i;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return f9886074403848142923.e();
            default:
                return new H9390398899829886498(f9886074403848142923.e(), f9886074403848142923.e.getValue());
        }
    }
}
