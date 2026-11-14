package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
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
        double dMax;
        double dMin;
        double d = h1172266339307530335.c;
        boolean z = h1172266339307530335.b;
        boolean z2 = false;
        boolean z3 = d < 0.0d;
        Function function = this.e;
        Function function2 = this.h;
        if (function2 == null) {
            double dDoubleValue = ((Double) this.c.apply(h1172266339307530335)).doubleValue();
            if (function == null) {
                return dDoubleValue;
            }
            double dB = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
            double dA = this.g.a(d);
            if (Z1953481206310471956.U(dB, dDoubleValue) < dA) {
                dDoubleValue = a(dB, dA);
            }
            if (z3) {
                dDoubleValue = a(dB, dA);
            }
            if (this.d && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = Z1953481206310471956.U(49.0d, dB) >= dA ? 49.0d : 60.0d;
            }
            Function function3 = this.f;
            if (function3 != null) {
                double dB2 = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
                double dB3 = ((U3985905046772670199) function3.apply(h1172266339307530335)).b(h1172266339307530335);
                double dMax2 = Math.max(dB2, dB3);
                double dMin2 = Math.min(dB2, dB3);
                if (Z1953481206310471956.U(dMax2, dDoubleValue) < dA || Z1953481206310471956.U(dMin2, dDoubleValue) < dA) {
                    double dS = Z1953481206310471956.S(dMax2, dA);
                    double D = Z1953481206310471956.D(dMin2, dA);
                    ArrayList arrayList = new ArrayList();
                    if (dS != -1.0d) {
                        arrayList.add(Double.valueOf(dS));
                    }
                    if (D != -1.0d) {
                        arrayList.add(Double.valueOf(D));
                    }
                    if (Math.round(dB2) < 60 || Math.round(dB3) < 60) {
                        if (dS == -1.0d) {
                            return 100.0d;
                        }
                        return dS;
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
            return dDoubleValue;
        }
        U7699830253384260203 u7699830253384260203 = (U7699830253384260203) function2.apply(h1172266339307530335);
        U3985905046772670199 u3985905046772670199 = u7699830253384260203.a;
        U3985905046772670199 u39859050467726701992 = u7699830253384260203.b;
        int i = u7699830253384260203.c;
        boolean z4 = u7699830253384260203.d;
        double dB4 = ((U3985905046772670199) function.apply(h1172266339307530335)).b(h1172266339307530335);
        if (i == 3 || ((i == 2 && !z) || (i == 1 && z))) {
            z2 = true;
        }
        U3985905046772670199 u39859050467726701993 = z2 ? u3985905046772670199 : u39859050467726701992;
        if (z2) {
            u3985905046772670199 = u39859050467726701992;
        }
        boolean zEquals = this.a.equals(u39859050467726701993.a);
        double d2 = z ? 1.0d : -1.0d;
        double dA2 = u39859050467726701993.g.a(d);
        double dA3 = u3985905046772670199.g.a(d);
        double dDoubleValue2 = ((Double) u39859050467726701993.c.apply(h1172266339307530335)).doubleValue();
        if (Z1953481206310471956.U(dB4, dDoubleValue2) < dA2) {
            dDoubleValue2 = a(dB4, dA2);
        }
        double dDoubleValue3 = ((Double) u3985905046772670199.c.apply(h1172266339307530335)).doubleValue();
        if (Z1953481206310471956.U(dB4, dDoubleValue3) < dA3) {
            dDoubleValue3 = a(dB4, dA3);
        }
        if (z3) {
            dDoubleValue2 = a(dB4, dA2);
            dDoubleValue3 = a(dB4, dA3);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d2 < 10.0d) {
            double d3 = 10.0d * d2;
            double d4 = dDoubleValue2 + d3;
            dDoubleValue3 = d4 < 0.0d ? 0.0d : d4 > 100.0d ? 100.0d : d4;
            if ((dDoubleValue3 - dDoubleValue2) * d2 < 10.0d) {
                double d5 = dDoubleValue3 - d3;
                dDoubleValue2 = d5 < 0.0d ? 0.0d : d5 > 100.0d ? 100.0d : d5;
            }
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMax = dDoubleValue3;
            } else if (!z4) {
                dMax = d2 > 0.0d ? 60.0d : 49.0d;
            } else if (d2 > 0.0d) {
                dMax = Math.max(dDoubleValue3, (10.0d * d2) + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (10.0d * d2) + 49.0d);
                dMax = dMin;
                dDoubleValue2 = 49.0d;
            }
        } else if (d2 > 0.0d) {
            dMax = Math.max(dDoubleValue3, (10.0d * d2) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dMin = Math.min(dDoubleValue3, (10.0d * d2) + 49.0d);
            dMax = dMin;
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dMax;
    }
}
