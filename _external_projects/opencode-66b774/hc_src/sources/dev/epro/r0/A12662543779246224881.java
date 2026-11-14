package dev.epro.r0;

import java.util.function.Function;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class A12662543779246224881 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ A12662543779246224881(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double d;
        double d2;
        double L;
        double d3;
        double d4;
        double L2;
        double L3;
        double d5 = 98.0d;
        switch (this.a) {
            case 0:
                return Y582199805280922215.g.w();
            case 1:
                return Y582199805280922215.g.v();
            case 2:
                return ((H1172266339307530335) obj).f;
            case 3:
                H1172266339307530335 h1172266339307530335 = (H1172266339307530335) obj;
                h1172266339307530335.getClass();
                return Double.valueOf(h1172266339307530335.b ? 80.0d : 40.0d);
            case 4:
                return Y582199805280922215.g.z();
            case 5:
                return ((H1172266339307530335) obj).g;
            case 6:
                H1172266339307530335 h11722663393075303352 = (H1172266339307530335) obj;
                boolean z = h11722663393075303352.b;
                double d6 = h11722663393075303352.c;
                if (z) {
                    d = 10.0d;
                    if (d6 > -1.0d) {
                        if (d6 < 0.0d) {
                            d = V12319504402545346730.L(10.0d, 10.0d, (d6 - (-1.0d)) / 1.0d);
                        } else if (d6 < 0.5d) {
                            d = V12319504402545346730.L(10.0d, 11.0d, (d6 - 0.0d) / 0.5d);
                        } else {
                            d2 = 12.0d;
                            if (d6 < 1.0d) {
                                d = V12319504402545346730.L(11.0d, 12.0d, (d6 - 0.5d) / 0.5d);
                            }
                            d = d2;
                        }
                    }
                    return Double.valueOf(d);
                }
                d = 96.0d;
                if (d6 > -1.0d) {
                    if (d6 < 0.0d) {
                        L = V12319504402545346730.L(96.0d, 96.0d, (d6 - (-1.0d)) / 1.0d);
                    } else if (d6 < 0.5d) {
                        L = V12319504402545346730.L(96.0d, 96.0d, (d6 - 0.0d) / 0.5d);
                    } else {
                        d2 = 95.0d;
                        if (d6 < 1.0d) {
                            L = V12319504402545346730.L(96.0d, 95.0d, (d6 - 0.5d) / 0.5d);
                        }
                        d = d2;
                    }
                    d = L;
                }
                return Double.valueOf(d);
            case 7:
                return ((H1172266339307530335) obj).e;
            case 8:
                H1172266339307530335 h11722663393075303353 = (H1172266339307530335) obj;
                boolean z2 = h11722663393075303353.b;
                double d7 = z2 ? 30.0d : 90.0d;
                N15736424885242183871 n15736424885242183871 = h11722663393075303353.e;
                double d8 = n15736424885242183871.a;
                double d9 = n15736424885242183871.b;
                W10545060672287394780 a = W10545060672287394780.a(d8, d9, d7);
                double d10 = a.b;
                if (d10 < d9) {
                    double d11 = d10;
                    while (a.b < d9) {
                        double d12 = (!z2 ? -1.0d : 1.0d) + d7;
                        W10545060672287394780 a2 = W10545060672287394780.a(d8, d9, d12);
                        double d13 = a2.b;
                        if (d11 <= d13 && Math.abs(d13 - d9) >= 0.4d) {
                            if (Math.abs(a2.b - d9) < Math.abs(a.b - d9)) {
                                a = a2;
                            }
                            d11 = Math.max(d11, a2.b);
                            d7 = d12;
                        } else {
                            d7 = d12;
                        }
                    }
                }
                return Double.valueOf(d7);
            case 9:
                return E17149812035295265804.k((H1172266339307530335) obj);
            case 10:
                return Double.valueOf(((H1172266339307530335) obj).b ? 6.0d : 98.0d);
            case 11:
                return ((H1172266339307530335) obj).f;
            case 12:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(10.0d);
            case 13:
                return Y582199805280922215.g.A();
            case 14:
                return Y582199805280922215.g.z();
            case 15:
                return ((H1172266339307530335) obj).d;
            case 16:
                H1172266339307530335 h11722663393075303354 = (H1172266339307530335) obj;
                h11722663393075303354.getClass();
                return Double.valueOf(h11722663393075303354.a.c);
            case 17:
                return ((H1172266339307530335) obj).g;
            case 18:
                return Double.valueOf(((H1172266339307530335) obj).b ? 6.0d : 98.0d);
            case 19:
                return ((H1172266339307530335) obj).g;
            case 20:
                return ((H1172266339307530335) obj).f;
            case 21:
                H1172266339307530335 h11722663393075303355 = (H1172266339307530335) obj;
                boolean z3 = h11722663393075303355.b;
                double d14 = h11722663393075303355.c;
                if (z3) {
                    d3 = 17.0d;
                    if (d14 > -1.0d) {
                        if (d14 < 0.0d) {
                            d3 = V12319504402545346730.L(17.0d, 17.0d, (d14 - (-1.0d)) / 1.0d);
                        } else if (d14 < 0.5d) {
                            d3 = V12319504402545346730.L(17.0d, 21.0d, (d14 - 0.0d) / 0.5d);
                        } else {
                            d4 = 25.0d;
                            if (d14 < 1.0d) {
                                d3 = V12319504402545346730.L(21.0d, 25.0d, (d14 - 0.5d) / 0.5d);
                            }
                            d3 = d4;
                        }
                    }
                    return Double.valueOf(d3);
                }
                d3 = 92.0d;
                if (d14 > -1.0d) {
                    if (d14 < 0.0d) {
                        L2 = V12319504402545346730.L(92.0d, 92.0d, (d14 - (-1.0d)) / 1.0d);
                    } else if (d14 < 0.5d) {
                        L2 = V12319504402545346730.L(92.0d, 88.0d, (d14 - 0.0d) / 0.5d);
                    } else {
                        d4 = 85.0d;
                        if (d14 < 1.0d) {
                            L2 = V12319504402545346730.L(88.0d, 85.0d, (d14 - 0.5d) / 0.5d);
                        }
                        d3 = d4;
                    }
                    d3 = L2;
                }
                return Double.valueOf(d3);
            case 22:
                return ((H1172266339307530335) obj).g;
            case 23:
                return Double.valueOf(((H1172266339307530335) obj).b ? 90.0d : 10.0d);
            case 24:
                return new U3985905046772670199("background", new A12662543779246224881((byte) 17), new A12662543779246224881((byte) 18), true, null, null, null, null);
            case 25:
                return ((H1172266339307530335) obj).h;
            case 26:
                return Double.valueOf(((H1172266339307530335) obj).b ? 30.0d : 80.0d);
            case 27:
                return ((H1172266339307530335) obj).g;
            case 28:
                H1172266339307530335 h11722663393075303356 = (H1172266339307530335) obj;
                if (h11722663393075303356.b) {
                    double d15 = h11722663393075303356.c;
                    if (d15 <= -1.0d) {
                        d5 = 24.0d;
                    } else {
                        if (d15 < 0.0d) {
                            L3 = V12319504402545346730.L(24.0d, 24.0d, (d15 - (-1.0d)) / 1.0d);
                        } else if (d15 < 0.5d) {
                            L3 = V12319504402545346730.L(24.0d, 29.0d, (d15 - 0.0d) / 0.5d);
                        } else if (d15 < 1.0d) {
                            L3 = V12319504402545346730.L(29.0d, 34.0d, (d15 - 0.5d) / 0.5d);
                        } else {
                            d5 = 34.0d;
                        }
                        d5 = L3;
                    }
                }
                return Double.valueOf(d5);
            default:
                return ((H1172266339307530335) obj).d;
        }
    }

    public /* synthetic */ A12662543779246224881(E17149812035295265804 e17149812035295265804, byte b) {
        this.a = b;
    }
}
