package dev.epro.r0;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A12662543779246224881 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ A12662543779246224881(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double dL;
        double d;
        double dL2;
        double dL3;
        double d2;
        double dL4;
        double dL5;
        double d3 = 98.0d;
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
                double d4 = h11722663393075303352.c;
                if (z) {
                    dL = 10.0d;
                    if (d4 > -1.0d) {
                        if (d4 < 0.0d) {
                            dL = V12319504402545346730.L(10.0d, 10.0d, (d4 - (-1.0d)) / 1.0d);
                        } else if (d4 < 0.5d) {
                            dL = V12319504402545346730.L(10.0d, 11.0d, (d4 - 0.0d) / 0.5d);
                        } else {
                            d = 12.0d;
                            dL = d4 < 1.0d ? V12319504402545346730.L(11.0d, 12.0d, (d4 - 0.5d) / 0.5d) : d;
                        }
                    }
                } else {
                    dL = 96.0d;
                    if (d4 > -1.0d) {
                        if (d4 < 0.0d) {
                            dL2 = V12319504402545346730.L(96.0d, 96.0d, (d4 - (-1.0d)) / 1.0d);
                        } else if (d4 < 0.5d) {
                            dL2 = V12319504402545346730.L(96.0d, 96.0d, (d4 - 0.0d) / 0.5d);
                        } else {
                            d = 95.0d;
                            if (d4 < 1.0d) {
                                dL2 = V12319504402545346730.L(96.0d, 95.0d, (d4 - 0.5d) / 0.5d);
                            }
                        }
                        dL = dL2;
                    }
                }
                return Double.valueOf(dL);
            case 7:
                return ((H1172266339307530335) obj).e;
            case 8:
                H1172266339307530335 h11722663393075303353 = (H1172266339307530335) obj;
                boolean z2 = h11722663393075303353.b;
                double d5 = z2 ? 30.0d : 90.0d;
                N15736424885242183871 n15736424885242183871 = h11722663393075303353.e;
                double d6 = n15736424885242183871.a;
                double d7 = n15736424885242183871.b;
                W10545060672287394780 w10545060672287394780A = W10545060672287394780.a(d6, d7, d5);
                double d8 = w10545060672287394780A.b;
                if (d8 < d7) {
                    double dMax = d8;
                    while (w10545060672287394780A.b < d7) {
                        double d9 = (!z2 ? -1.0d : 1.0d) + d5;
                        W10545060672287394780 w10545060672287394780A2 = W10545060672287394780.a(d6, d7, d9);
                        double d10 = w10545060672287394780A2.b;
                        if (dMax <= d10 && Math.abs(d10 - d7) >= 0.4d) {
                            if (Math.abs(w10545060672287394780A2.b - d7) < Math.abs(w10545060672287394780A.b - d7)) {
                                w10545060672287394780A = w10545060672287394780A2;
                            }
                            dMax = Math.max(dMax, w10545060672287394780A2.b);
                            d5 = d9;
                        } else {
                            d5 = d9;
                        }
                    }
                }
                return Double.valueOf(d5);
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
                double d11 = h11722663393075303355.c;
                if (z3) {
                    dL3 = 17.0d;
                    if (d11 > -1.0d) {
                        if (d11 < 0.0d) {
                            dL3 = V12319504402545346730.L(17.0d, 17.0d, (d11 - (-1.0d)) / 1.0d);
                        } else if (d11 < 0.5d) {
                            dL3 = V12319504402545346730.L(17.0d, 21.0d, (d11 - 0.0d) / 0.5d);
                        } else {
                            d2 = 25.0d;
                            dL3 = d11 < 1.0d ? V12319504402545346730.L(21.0d, 25.0d, (d11 - 0.5d) / 0.5d) : d2;
                        }
                    }
                } else {
                    dL3 = 92.0d;
                    if (d11 > -1.0d) {
                        if (d11 < 0.0d) {
                            dL4 = V12319504402545346730.L(92.0d, 92.0d, (d11 - (-1.0d)) / 1.0d);
                        } else if (d11 < 0.5d) {
                            dL4 = V12319504402545346730.L(92.0d, 88.0d, (d11 - 0.0d) / 0.5d);
                        } else {
                            d2 = 85.0d;
                            if (d11 < 1.0d) {
                                dL4 = V12319504402545346730.L(88.0d, 85.0d, (d11 - 0.5d) / 0.5d);
                            }
                        }
                        dL3 = dL4;
                    }
                }
                return Double.valueOf(dL3);
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
                    double d12 = h11722663393075303356.c;
                    if (d12 <= -1.0d) {
                        d3 = 24.0d;
                    } else {
                        if (d12 < 0.0d) {
                            dL5 = V12319504402545346730.L(24.0d, 24.0d, (d12 - (-1.0d)) / 1.0d);
                        } else if (d12 < 0.5d) {
                            dL5 = V12319504402545346730.L(24.0d, 29.0d, (d12 - 0.0d) / 0.5d);
                        } else if (d12 < 1.0d) {
                            dL5 = V12319504402545346730.L(29.0d, 34.0d, (d12 - 0.5d) / 0.5d);
                        } else {
                            d3 = 34.0d;
                        }
                        d3 = dL5;
                    }
                }
                return Double.valueOf(d3);
            default:
                return ((H1172266339307530335) obj).d;
        }
    }

    public /* synthetic */ A12662543779246224881(E17149812035295265804 e17149812035295265804, byte b) {
        this.a = b;
    }
}
