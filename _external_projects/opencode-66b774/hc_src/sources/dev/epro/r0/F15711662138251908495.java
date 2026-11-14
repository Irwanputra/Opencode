package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F15711662138251908495 {
    public final boolean a;
    public final X1811697371052142341 b;
    public final int c;
    public final G7776536204130748107[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public F15711662138251908495(boolean z, X1811697371052142341 x1811697371052142341) {
        int i;
        this.a = z;
        this.b = x1811697371052142341;
        if (z && x1811697371052142341.equals(X1811697371052142341.a)) {
            S10973172697741180971.m("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = x1811697371052142341.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                Z3383101362411723454.g();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new G7776536204130748107[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        G7776536204130748107[] g7776536204130748107Arr = this.d;
        G7776536204130748107 g7776536204130748107 = g7776536204130748107Arr[i];
        if (g7776536204130748107 != null) {
            g7776536204130748107.a = j;
            g7776536204130748107.b = f;
        } else {
            G7776536204130748107 g77765362041307481072 = new G7776536204130748107();
            g77765362041307481072.a = j;
            g77765362041307481072.b = f;
            g7776536204130748107Arr[i] = g77765362041307481072;
        }
    }

    public final float b() {
        boolean z;
        X1811697371052142341 x1811697371052142341;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        int i3 = this.e;
        G7776536204130748107[] g7776536204130748107Arr = this.d;
        G7776536204130748107 g7776536204130748107 = g7776536204130748107Arr[i3];
        if (g7776536204130748107 == null) {
            return 0.0f;
        }
        int i4 = 0;
        G7776536204130748107 g77765362041307481072 = g7776536204130748107;
        do {
            G7776536204130748107 g77765362041307481073 = g7776536204130748107Arr[i3];
            z = this.a;
            x1811697371052142341 = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (g77765362041307481073 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = g7776536204130748107.a;
                i = i4;
                f = 0.0f;
                long j2 = g77765362041307481073.a;
                float f4 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float abs = Math.abs(j2 - g77765362041307481072.a);
                g77765362041307481072 = (x1811697371052142341 == X1811697371052142341.a || z) ? g77765362041307481073 : g7776536204130748107;
                if (f4 <= 100.0f && abs <= 40.0f) {
                    fArr2[i] = g77765362041307481073.b;
                    fArr[i] = -f4;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int ordinal = x1811697371052142341.ordinal();
        if (ordinal == 0) {
            try {
                float[] fArr4 = this.h;
                T13998044911588922055.l(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            f3 = f2;
        } else {
            if (ordinal != i2) {
                Z3383101362411723454.g();
                return f;
            }
            int i5 = i4 - i2;
            float f5 = fArr[i5];
            int i6 = i5;
            float f6 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f7 = fArr[i7];
                if (f5 != f7) {
                    float f8 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f5 - f7);
                    float abs2 = (Math.abs(f8) * (f8 - (Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2.0f))))) + f6;
                    if (i6 == i5) {
                        abs2 *= 0.5f;
                    }
                    f6 = abs2;
                }
                i6--;
                f5 = f7;
            }
            f3 = Math.signum(f6) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
        }
        return f3 * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            P753981624812481271.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float b = b();
        if (b == 0.0f || Float.isNaN(b)) {
            return 0.0f;
        }
        if (b <= 0.0f) {
            float f2 = -f;
            if (b < f2) {
                return f2;
            }
        } else if (b > f) {
            return f;
        }
        return b;
    }

    public /* synthetic */ F15711662138251908495() {
        this(false, X1811697371052142341.a);
    }

    public F15711662138251908495(boolean z) {
        this(z, X1811697371052142341.b);
    }
}
