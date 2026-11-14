package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G7496843890255952685 {
    public final int a;
    public final int b;
    public final boolean c;

    public G7496843890255952685(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G7496843890255952685)) {
            return false;
        }
        G7496843890255952685 g7496843890255952685 = (G7496843890255952685) obj;
        return this.a == g7496843890255952685.a && this.b == g7496843890255952685.b && this.c == g7496843890255952685.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return E12098517352909843120.o(E12098517352909843120.p(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c, ")");
    }
}
