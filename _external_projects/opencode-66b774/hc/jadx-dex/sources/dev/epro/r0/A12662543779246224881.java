package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A12662543779246224881 implements java.util.function.Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ A12662543779246224881(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
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
                return dev.epro.r0.Y582199805280922215.g.w();
            case 1:
                return dev.epro.r0.Y582199805280922215.g.v();
            case 2:
                return ((dev.epro.r0.H1172266339307530335) obj).f;
            case 3:
                dev.epro.r0.H1172266339307530335 h1172266339307530335 = (dev.epro.r0.H1172266339307530335) obj;
                h1172266339307530335.getClass();
                return java.lang.Double.valueOf(h1172266339307530335.b ? 80.0d : 40.0d);
            case 4:
                return dev.epro.r0.Y582199805280922215.g.z();
            case 5:
                return ((dev.epro.r0.H1172266339307530335) obj).g;
            case 6:
                dev.epro.r0.H1172266339307530335 h11722663393075303352 = (dev.epro.r0.H1172266339307530335) obj;
                boolean z = h11722663393075303352.b;
                double d4 = h11722663393075303352.c;
                if (z) {
                    dL = 10.0d;
                    if (d4 > -1.0d) {
                        if (d4 < 0.0d) {
                            dL = dev.epro.r0.V12319504402545346730.L(10.0d, 10.0d, (d4 - (-1.0d)) / 1.0d);
                        } else if (d4 < 0.5d) {
                            dL = dev.epro.r0.V12319504402545346730.L(10.0d, 11.0d, (d4 - 0.0d) / 0.5d);
                        } else {
                            d = 12.0d;
                            dL = d4 < 1.0d ? dev.epro.r0.V12319504402545346730.L(11.0d, 12.0d, (d4 - 0.5d) / 0.5d) : d;
                        }
                    }
                } else {
                    dL = 96.0d;
                    if (d4 > -1.0d) {
                        if (d4 < 0.0d) {
                            dL2 = dev.epro.r0.V12319504402545346730.L(96.0d, 96.0d, (d4 - (-1.0d)) / 1.0d);
                        } else if (d4 < 0.5d) {
                            dL2 = dev.epro.r0.V12319504402545346730.L(96.0d, 96.0d, (d4 - 0.0d) / 0.5d);
                        } else {
                            d = 95.0d;
                            if (d4 < 1.0d) {
                                dL2 = dev.epro.r0.V12319504402545346730.L(96.0d, 95.0d, (d4 - 0.5d) / 0.5d);
                            }
                        }
                        dL = dL2;
                    }
                }
                return java.lang.Double.valueOf(dL);
            case 7:
                return ((dev.epro.r0.H1172266339307530335) obj).e;
            case 8:
                dev.epro.r0.H1172266339307530335 h11722663393075303353 = (dev.epro.r0.H1172266339307530335) obj;
                boolean z2 = h11722663393075303353.b;
                double d5 = z2 ? 30.0d : 90.0d;
                dev.epro.r0.N15736424885242183871 n15736424885242183871 = h11722663393075303353.e;
                double d6 = n15736424885242183871.a;
                double d7 = n15736424885242183871.b;
                dev.epro.r0.W10545060672287394780 w10545060672287394780A = dev.epro.r0.W10545060672287394780.a(d6, d7, d5);
                double d8 = w10545060672287394780A.b;
                if (d8 < d7) {
                    double dMax = d8;
                    while (w10545060672287394780A.b < d7) {
                        double d9 = (!z2 ? -1.0d : 1.0d) + d5;
                        dev.epro.r0.W10545060672287394780 w10545060672287394780A2 = dev.epro.r0.W10545060672287394780.a(d6, d7, d9);
                        double d10 = w10545060672287394780A2.b;
                        if (dMax <= d10 && java.lang.Math.abs(d10 - d7) >= 0.4d) {
                            if (java.lang.Math.abs(w10545060672287394780A2.b - d7) < java.lang.Math.abs(w10545060672287394780A.b - d7)) {
                                w10545060672287394780A = w10545060672287394780A2;
                            }
                            dMax = java.lang.Math.max(dMax, w10545060672287394780A2.b);
                            d5 = d9;
                        } else {
                            d5 = d9;
                        }
                    }
                }
                return java.lang.Double.valueOf(d5);
            case 9:
                return dev.epro.r0.E17149812035295265804.k((dev.epro.r0.H1172266339307530335) obj);
            case 10:
                return java.lang.Double.valueOf(((dev.epro.r0.H1172266339307530335) obj).b ? 6.0d : 98.0d);
            case 11:
                return ((dev.epro.r0.H1172266339307530335) obj).f;
            case 12:
                ((dev.epro.r0.H1172266339307530335) obj).getClass();
                return java.lang.Double.valueOf(10.0d);
            case 13:
                return dev.epro.r0.Y582199805280922215.g.A();
            case 14:
                return dev.epro.r0.Y582199805280922215.g.z();
            case 15:
                return ((dev.epro.r0.H1172266339307530335) obj).d;
            case 16:
                dev.epro.r0.H1172266339307530335 h11722663393075303354 = (dev.epro.r0.H1172266339307530335) obj;
                h11722663393075303354.getClass();
                return java.lang.Double.valueOf(h11722663393075303354.a.c);
            case 17:
                return ((dev.epro.r0.H1172266339307530335) obj).g;
            case 18:
                return java.lang.Double.valueOf(((dev.epro.r0.H1172266339307530335) obj).b ? 6.0d : 98.0d);
            case 19:
                return ((dev.epro.r0.H1172266339307530335) obj).g;
            case 20:
                return ((dev.epro.r0.H1172266339307530335) obj).f;
            case 21:
                dev.epro.r0.H1172266339307530335 h11722663393075303355 = (dev.epro.r0.H1172266339307530335) obj;
                boolean z3 = h11722663393075303355.b;
                double d11 = h11722663393075303355.c;
                if (z3) {
                    dL3 = 17.0d;
                    if (d11 > -1.0d) {
                        if (d11 < 0.0d) {
                            dL3 = dev.epro.r0.V12319504402545346730.L(17.0d, 17.0d, (d11 - (-1.0d)) / 1.0d);
                        } else if (d11 < 0.5d) {
                            dL3 = dev.epro.r0.V12319504402545346730.L(17.0d, 21.0d, (d11 - 0.0d) / 0.5d);
                        } else {
                            d2 = 25.0d;
                            dL3 = d11 < 1.0d ? dev.epro.r0.V12319504402545346730.L(21.0d, 25.0d, (d11 - 0.5d) / 0.5d) : d2;
                        }
                    }
                } else {
                    dL3 = 92.0d;
                    if (d11 > -1.0d) {
                        if (d11 < 0.0d) {
                            dL4 = dev.epro.r0.V12319504402545346730.L(92.0d, 92.0d, (d11 - (-1.0d)) / 1.0d);
                        } else if (d11 < 0.5d) {
                            dL4 = dev.epro.r0.V12319504402545346730.L(92.0d, 88.0d, (d11 - 0.0d) / 0.5d);
                        } else {
                            d2 = 85.0d;
                            if (d11 < 1.0d) {
                                dL4 = dev.epro.r0.V12319504402545346730.L(88.0d, 85.0d, (d11 - 0.5d) / 0.5d);
                            }
                        }
                        dL3 = dL4;
                    }
                }
                return java.lang.Double.valueOf(dL3);
            case 22:
                return ((dev.epro.r0.H1172266339307530335) obj).g;
            case 23:
                return java.lang.Double.valueOf(((dev.epro.r0.H1172266339307530335) obj).b ? 90.0d : 10.0d);
            case 24:
                return new dev.epro.r0.U3985905046772670199("background", new dev.epro.r0.A12662543779246224881((byte) 17), new dev.epro.r0.A12662543779246224881((byte) 18), true, (java.util.function.Function) null, (java.util.function.Function) null, (dev.epro.r0.G4425564197697489570) null, (java.util.function.Function) null);
            case 25:
                return ((dev.epro.r0.H1172266339307530335) obj).h;
            case 26:
                return java.lang.Double.valueOf(((dev.epro.r0.H1172266339307530335) obj).b ? 30.0d : 80.0d);
            case 27:
                return ((dev.epro.r0.H1172266339307530335) obj).g;
            case 28:
                dev.epro.r0.H1172266339307530335 h11722663393075303356 = (dev.epro.r0.H1172266339307530335) obj;
                if (h11722663393075303356.b) {
                    double d12 = h11722663393075303356.c;
                    if (d12 <= -1.0d) {
                        d3 = 24.0d;
                    } else {
                        if (d12 < 0.0d) {
                            dL5 = dev.epro.r0.V12319504402545346730.L(24.0d, 24.0d, (d12 - (-1.0d)) / 1.0d);
                        } else if (d12 < 0.5d) {
                            dL5 = dev.epro.r0.V12319504402545346730.L(24.0d, 29.0d, (d12 - 0.0d) / 0.5d);
                        } else if (d12 < 1.0d) {
                            dL5 = dev.epro.r0.V12319504402545346730.L(29.0d, 34.0d, (d12 - 0.5d) / 0.5d);
                        } else {
                            d3 = 34.0d;
                        }
                        d3 = dL5;
                    }
                }
                return java.lang.Double.valueOf(d3);
            default:
                return ((dev.epro.r0.H1172266339307530335) obj).d;
        }
    }
}
