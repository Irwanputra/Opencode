package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U3985905046772670199 {
    public final String a;
    public final Function b;
    public final Function c;
    public final boolean d;
    public final Function e;
    public final Function f;
    public final G4425564197697489570 g;
    public final Function h;
    public final HashMap i = new HashMap();

    public U3985905046772670199(String str, Function function, Function function2, boolean z, Function function3, Function function4, G4425564197697489570 g4425564197697489570, Function function5) {
        this.a = str;
        this.b = function;
        this.c = function2;
        this.d = z;
        this.e = function3;
        this.f = function4;
        this.g = g4425564197697489570;
        this.h = function5;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double a(double r10, double r12) {
        /*
            double r0 = dev.epro.r0.Z1953481206310471956.S(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = dev.epro.r0.Z1953481206310471956.D(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = dev.epro.r0.Z1953481206310471956.U(r0, r10)
            double r6 = dev.epro.r0.Z1953481206310471956.U(r2, r10)
            long r10 = java.lang.Math.round(r10)
            r8 = 60
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            r10 = 1
            goto L40
        L3f:
            r10 = 0
        L40:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L54
            if (r10 == 0) goto L55
            goto L54
        L4b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U3985905046772670199.a(double, double):double");
    }

    public final double b(H1172266339307530335 h1172266339307530335) {
        double d;
        double min;
        double d2 = h1172266339307530335.c;
        boolean z = h1172266339307530335.b;
        boolean z2 = false;
        boolean z3 = d2 < 0.0d;
        Function function = this.e;
        Function function2 = this.h;
        if (function2 == null) {
            double doubleValue = ((Double) this.c.apply(h1172266339307530335)).doubleValue();
            if (function == null) {
                return doubleValue;
            }
            double b = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
            double a = this.g.a(d2);
            if (Z1953481206310471956.U(b, doubleValue) < a) {
                doubleValue = a(b, a);
            }
            if (z3) {
                doubleValue = a(b, a);
            }
            if (this.d && 50.0d <= doubleValue && doubleValue < 60.0d) {
                doubleValue = Z1953481206310471956.U(49.0d, b) >= a ? 49.0d : 60.0d;
            }
            Function function3 = this.f;
            if (function3 != null) {
                double b2 = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
                double b3 = ((U3985905046772670199) function3.apply(h1172266339307530335)).b(h1172266339307530335);
                double max = Math.max(b2, b3);
                double min2 = Math.min(b2, b3);
                if (Z1953481206310471956.U(max, doubleValue) < a || Z1953481206310471956.U(min2, doubleValue) < a) {
                    double S = Z1953481206310471956.S(max, a);
                    double D = Z1953481206310471956.D(min2, a);
                    ArrayList arrayList = new ArrayList();
                    if (S != -1.0d) {
                        arrayList.add(Double.valueOf(S));
                    }
                    if (D != -1.0d) {
                        arrayList.add(Double.valueOf(D));
                    }
                    if (Math.round(b2) < 60 || Math.round(b3) < 60) {
                        if (S == -1.0d) {
                            return 100.0d;
                        }
                        return S;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (D == -1.0d) {
                        return 0.0d;
                    }
                    return D;
                }
            }
            return doubleValue;
        }
        U7699830253384260203 u7699830253384260203 = (U7699830253384260203) function2.apply(h1172266339307530335);
        U3985905046772670199 u3985905046772670199 = u7699830253384260203.a;
        U3985905046772670199 u39859050467726701992 = u7699830253384260203.b;
        int i = u7699830253384260203.c;
        boolean z4 = u7699830253384260203.d;
        double b4 = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
        if (i == 3 || ((i == 2 && !z) || (i == 1 && z))) {
            z2 = true;
        }
        U3985905046772670199 u39859050467726701993 = z2 ? u3985905046772670199 : u39859050467726701992;
        if (z2) {
            u3985905046772670199 = u39859050467726701992;
        }
        boolean equals = this.a.equals(u39859050467726701993.a);
        double d3 = z ? 1.0d : -1.0d;
        double a2 = u39859050467726701993.g.a(d2);
        double a3 = u3985905046772670199.g.a(d2);
        double doubleValue2 = ((Double) u39859050467726701993.c.apply(h1172266339307530335)).doubleValue();
        if (Z1953481206310471956.U(b4, doubleValue2) < a2) {
            doubleValue2 = a(b4, a2);
        }
        double doubleValue3 = ((Double) u3985905046772670199.c.apply(h1172266339307530335)).doubleValue();
        if (Z1953481206310471956.U(b4, doubleValue3) < a3) {
            doubleValue3 = a(b4, a3);
        }
        if (z3) {
            doubleValue2 = a(b4, a2);
            doubleValue3 = a(b4, a3);
        }
        if ((doubleValue3 - doubleValue2) * d3 < 10.0d) {
            double d4 = 10.0d * d3;
            double d5 = doubleValue2 + d4;
            doubleValue3 = d5 < 0.0d ? 0.0d : d5 > 100.0d ? 100.0d : d5;
            if ((doubleValue3 - doubleValue2) * d3 < 10.0d) {
                double d6 = doubleValue3 - d4;
                doubleValue2 = d6 < 0.0d ? 0.0d : d6 > 100.0d ? 100.0d : d6;
            }
        }
        if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
            if (50.0d > doubleValue3 || doubleValue3 >= 60.0d) {
                d = doubleValue3;
            } else if (!z4) {
                d = d3 > 0.0d ? 60.0d : 49.0d;
            } else if (d3 > 0.0d) {
                d = Math.max(doubleValue3, (10.0d * d3) + 60.0d);
                doubleValue2 = 60.0d;
            } else {
                min = Math.min(doubleValue3, (10.0d * d3) + 49.0d);
                d = min;
                doubleValue2 = 49.0d;
            }
        } else if (d3 > 0.0d) {
            d = Math.max(doubleValue3, (10.0d * d3) + 60.0d);
            doubleValue2 = 60.0d;
        } else {
            min = Math.min(doubleValue3, (10.0d * d3) + 49.0d);
            d = min;
            doubleValue2 = 49.0d;
        }
        return equals ? doubleValue2 : d;
    }
}
