package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class F4327950643552689 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ F9886074403848142923 b;

    public /* synthetic */ F4327950643552689(F9886074403848142923 f9886074403848142923, byte b) {
        this.a = b;
        this.b = f9886074403848142923;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        F9886074403848142923 f9886074403848142923 = this.b;
        switch (b) {
            case 0:
                Object value = f9886074403848142923.h.getValue();
                if (value != null) {
                    return value;
                }
                float g = f9886074403848142923.f.g();
                V697849047308847220 v697849047308847220 = f9886074403848142923.c;
                if (Float.isNaN(g)) {
                    return v697849047308847220.getValue();
                }
                float c = f9886074403848142923.d().c(v697849047308847220.getValue());
                if (Float.isNaN(c) || g == c) {
                    return v697849047308847220.getValue();
                }
                Object a = f9886074403848142923.d().a(g);
                return a == null ? v697849047308847220.getValue() : a;
            case 1:
                float c2 = f9886074403848142923.d().c(f9886074403848142923.d.getValue());
                float c3 = f9886074403848142923.d().c(f9886074403848142923.e.getValue()) - c2;
                float abs = Math.abs(c3);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float i = (f9886074403848142923.i() - c2) / c3;
                    if (i < 1.0E-6f) {
                        f = 0.0f;
                    } else if (i <= 0.999999f) {
                        f = i;
                    }
                }
                return Float.valueOf(f);
            case 2:
                return f9886074403848142923.d();
            default:
                return new H9390398899829886498(f9886074403848142923.d(), f9886074403848142923.e.getValue());
        }
    }
}
