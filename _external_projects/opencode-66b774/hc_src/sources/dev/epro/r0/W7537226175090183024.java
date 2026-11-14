package dev.epro.r0;

import java.util.function.Function;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class W7537226175090183024 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ W7537226175090183024(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double d;
        double d2;
        double L;
        switch (this.a) {
            case 0:
                H1172266339307530335 h1172266339307530335 = (H1172266339307530335) obj;
                h1172266339307530335.getClass();
                return Double.valueOf(h1172266339307530335.b ? 20.0d : 100.0d);
            case 1:
                H1172266339307530335 h11722663393075303352 = (H1172266339307530335) obj;
                h11722663393075303352.getClass();
                return Double.valueOf(h11722663393075303352.b ? 20.0d : 100.0d);
            case 2:
                return Y582199805280922215.g.p();
            case 3:
                return ((H1172266339307530335) obj).d;
            case 4:
                return Double.valueOf(((H1172266339307530335) obj).b ? 40.0d : 80.0d);
            case 5:
                return E17149812035295265804.l();
            case 6:
                return ((H1172266339307530335) obj).e;
            case 7:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(90.0d);
            case 8:
                return ((H1172266339307530335) obj).d;
            case 9:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(30.0d);
            case 10:
                return Y582199805280922215.g.s();
            case 11:
                return Y582199805280922215.g.x();
            case 12:
                return Y582199805280922215.g.r();
            case 13:
                return ((H1172266339307530335) obj).f;
            case 14:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(80.0d);
            case 15:
                return ((H1172266339307530335) obj).i;
            case 16:
                return Double.valueOf(((H1172266339307530335) obj).b ? 20.0d : 100.0d);
            case 17:
                return Y582199805280922215.g.i();
            case 18:
                return ((H1172266339307530335) obj).d;
            case 19:
                E17149812035295265804 e17149812035295265804 = Y582199805280922215.g;
                H1172266339307530335 h11722663393075303353 = (H1172266339307530335) obj;
                h11722663393075303353.getClass();
                return Double.valueOf(U3985905046772670199.a(((Double) e17149812035295265804.q().c.apply(h11722663393075303353)).doubleValue(), 4.5d));
            case 20:
                return Y582199805280922215.g.q();
            case 21:
                return ((H1172266339307530335) obj).g;
            case 22:
                return ((H1172266339307530335) obj).e;
            case 23:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(80.0d);
            case 24:
                return ((H1172266339307530335) obj).h;
            case 25:
                return Double.valueOf(((H1172266339307530335) obj).b ? 30.0d : 90.0d);
            case 26:
                return ((H1172266339307530335) obj).g;
            case 27:
                H1172266339307530335 h11722663393075303354 = (H1172266339307530335) obj;
                boolean z = h11722663393075303354.b;
                double d3 = h11722663393075303354.c;
                if (z) {
                    d = 22.0d;
                    if (d3 > -1.0d) {
                        if (d3 < 0.0d) {
                            d = V12319504402545346730.L(22.0d, 22.0d, (d3 - (-1.0d)) / 1.0d);
                        } else if (d3 < 0.5d) {
                            d = V12319504402545346730.L(22.0d, 26.0d, (d3 - 0.0d) / 0.5d);
                        } else {
                            d2 = 30.0d;
                            if (d3 < 1.0d) {
                                d = V12319504402545346730.L(26.0d, 30.0d, (d3 - 0.5d) / 0.5d);
                            }
                            d = d2;
                        }
                    }
                    return Double.valueOf(d);
                }
                d = 90.0d;
                if (d3 > -1.0d) {
                    if (d3 < 0.0d) {
                        L = V12319504402545346730.L(90.0d, 90.0d, (d3 - (-1.0d)) / 1.0d);
                    } else if (d3 < 0.5d) {
                        L = V12319504402545346730.L(90.0d, 84.0d, (d3 - 0.0d) / 0.5d);
                    } else {
                        d2 = 80.0d;
                        if (d3 < 1.0d) {
                            L = V12319504402545346730.L(84.0d, 80.0d, (d3 - 0.5d) / 0.5d);
                        }
                        d = d2;
                    }
                    d = L;
                }
                return Double.valueOf(d);
            case 28:
                return ((H1172266339307530335) obj).d;
            default:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(90.0d);
        }
    }
}
