package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G4425564197697489570 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public G4425564197697489570(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a(double d) {
        if (d <= -1.0d) {
            return this.a;
        }
        if (d < 0.0d) {
            return V12319504402545346730.L(this.a, this.b, (d - (-1.0d)) / 1.0d);
        }
        if (d < 0.5d) {
            return V12319504402545346730.L(this.b, this.c, (d - 0.0d) / 0.5d);
        }
        if (d >= 1.0d) {
            return this.d;
        }
        return V12319504402545346730.L(this.c, this.d, (d - 0.5d) / 0.5d);
    }
}
