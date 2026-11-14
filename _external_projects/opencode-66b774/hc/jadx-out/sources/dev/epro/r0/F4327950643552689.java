package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
                float fG = f9886074403848142923.f.g();
                V697849047308847220 v697849047308847220 = f9886074403848142923.c;
                if (Float.isNaN(fG)) {
                    return v697849047308847220.getValue();
                }
                float fC = f9886074403848142923.d().c(v697849047308847220.getValue());
                if (Float.isNaN(fC) || fG == fC) {
                    return v697849047308847220.getValue();
                }
                Object objA = f9886074403848142923.d().a(fG);
                return objA == null ? v697849047308847220.getValue() : objA;
            case 1:
                float fC2 = f9886074403848142923.d().c(f9886074403848142923.d.getValue());
                float fC3 = f9886074403848142923.d().c(f9886074403848142923.e.getValue()) - fC2;
                float fAbs = Math.abs(fC3);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fI = (f9886074403848142923.i() - fC2) / fC3;
                    if (fI < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fI <= 0.999999f) {
                        f = fI;
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
