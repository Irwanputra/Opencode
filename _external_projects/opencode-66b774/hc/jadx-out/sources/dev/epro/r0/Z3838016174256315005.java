package dev.epro.r0;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z3838016174256315005 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ Z3838016174256315005(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double dL;
        double d;
        double dL2;
        switch (this.a) {
            case 0:
                return ((H1172266339307530335) obj).g;
            case 1:
                return Y582199805280922215.g.u();
            case 2:
                return ((H1172266339307530335) obj).d;
            case 3:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(10.0d);
            case 4:
                return Y582199805280922215.g.s();
            case 5:
                return Y582199805280922215.g.r();
            case 6:
                return ((H1172266339307530335) obj).i;
            case 7:
                return Double.valueOf(((H1172266339307530335) obj).b ? 80.0d : 40.0d);
            case 8:
                return ((H1172266339307530335) obj).g;
            case 9:
                H1172266339307530335 h1172266339307530335 = (H1172266339307530335) obj;
                boolean z = h1172266339307530335.b;
                double d2 = h1172266339307530335.c;
                if (z) {
                    dL = 12.0d;
                    if (d2 > -1.0d) {
                        if (d2 < 0.0d) {
                            dL = V12319504402545346730.L(12.0d, 12.0d, (d2 - (-1.0d)) / 1.0d);
                        } else if (d2 < 0.5d) {
                            dL = V12319504402545346730.L(12.0d, 16.0d, (d2 - 0.0d) / 0.5d);
                        } else {
                            d = 20.0d;
                            dL = d2 < 1.0d ? V12319504402545346730.L(16.0d, 20.0d, (d2 - 0.5d) / 0.5d) : d;
                        }
                    }
                } else {
                    dL = 94.0d;
                    if (d2 > -1.0d) {
                        if (d2 < 0.0d) {
                            dL2 = V12319504402545346730.L(94.0d, 94.0d, (d2 - (-1.0d)) / 1.0d);
                        } else if (d2 < 0.5d) {
                            dL2 = V12319504402545346730.L(94.0d, 92.0d, (d2 - 0.0d) / 0.5d);
                        } else {
                            d = 90.0d;
                            if (d2 < 1.0d) {
                                dL2 = V12319504402545346730.L(92.0d, 90.0d, (d2 - 0.5d) / 0.5d);
                            }
                        }
                        dL = dL2;
                    }
                }
                return Double.valueOf(dL);
            case 10:
                return ((H1172266339307530335) obj).f;
            case 11:
                return ((H1172266339307530335) obj).h;
            case 12:
                return Double.valueOf(((H1172266339307530335) obj).b ? 80.0d : 30.0d);
            case 13:
                return ((H1172266339307530335) obj).g;
            case 14:
                return Double.valueOf(((H1172266339307530335) obj).b ? 90.0d : 20.0d);
            case 15:
                return ((H1172266339307530335) obj).i;
            case 16:
                H1172266339307530335 h11722663393075303352 = (H1172266339307530335) obj;
                h11722663393075303352.getClass();
                return Double.valueOf(h11722663393075303352.b ? 90.0d : 30.0d);
            case 17:
                return Y582199805280922215.g.j();
            case 18:
                return ((H1172266339307530335) obj).i;
            case 19:
                return Double.valueOf(((H1172266339307530335) obj).b ? 30.0d : 90.0d);
            case 20:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(30.0d);
            case 21:
                return ((H1172266339307530335) obj).f;
            case 22:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(90.0d);
            case 23:
                return ((H1172266339307530335) obj).d;
            case 24:
                H1172266339307530335 h11722663393075303353 = (H1172266339307530335) obj;
                h11722663393075303353.getClass();
                return Double.valueOf(h11722663393075303353.b ? 80.0d : 40.0d);
            case 25:
                return ((H1172266339307530335) obj).g;
            case 26:
                return Double.valueOf(0.0d);
            case 27:
                return ((H1172266339307530335) obj).e;
            case 28:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(30.0d);
            default:
                return Y582199805280922215.g.A();
        }
    }
}
