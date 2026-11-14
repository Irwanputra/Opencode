package dev.epro.r0;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F11242842454977356935 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ F11242842454977356935(E17149812035295265804 e17149812035295265804) {
        this.a = (byte) 4;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double dL;
        switch (this.a) {
            case 0:
                return Double.valueOf(((H1172266339307530335) obj).b ? 90.0d : 10.0d);
            case 1:
                return ((H1172266339307530335) obj).d;
            case 2:
                ((H1172266339307530335) obj).getClass();
                return Double.valueOf(80.0d);
            case 3:
                return ((H1172266339307530335) obj).f;
            case 4:
                H1172266339307530335 h1172266339307530335 = (H1172266339307530335) obj;
                h1172266339307530335.getClass();
                N15736424885242183871 n15736424885242183871 = h1172266339307530335.f;
                return Double.valueOf(S10823041268949770285.G(W10545060672287394780.a(n15736424885242183871.a, n15736424885242183871.b, h1172266339307530335.a.c)).c);
            case 5:
                return ((H1172266339307530335) obj).e;
            case 6:
                H1172266339307530335 h11722663393075303352 = (H1172266339307530335) obj;
                h11722663393075303352.getClass();
                return Double.valueOf(h11722663393075303352.b ? 20.0d : 100.0d);
            case 7:
                return Y582199805280922215.g.t();
            case 8:
                return ((H1172266339307530335) obj).e;
            case 9:
                return E17149812035295265804.k((H1172266339307530335) obj);
            case 10:
                return Double.valueOf(((H1172266339307530335) obj).b ? 80.0d : 40.0d);
            case 11:
                return ((H1172266339307530335) obj).g;
            case 12:
                H1172266339307530335 h11722663393075303353 = (H1172266339307530335) obj;
                if (h11722663393075303353.b) {
                    double d = h11722663393075303353.c;
                    if (d <= -1.0d) {
                        d = 4.0d;
                    } else {
                        if (d < 0.0d) {
                            dL = V12319504402545346730.L(4.0d, 4.0d, (d - (-1.0d)) / 1.0d);
                        } else if (d < 0.5d) {
                            dL = V12319504402545346730.L(4.0d, 2.0d, (d - 0.0d) / 0.5d);
                        } else if (d < 1.0d) {
                            dL = V12319504402545346730.L(2.0d, 0.0d, (d - 0.5d) / 0.5d);
                        } else {
                            d = 0.0d;
                        }
                        d = dL;
                    }
                }
                return Double.valueOf(d);
            case 13:
                return ((H1172266339307530335) obj).h;
            case 14:
                return Double.valueOf(((H1172266339307530335) obj).b ? 60.0d : 50.0d);
            case 15:
                return ((H1172266339307530335) obj).d;
            case 16:
                return Double.valueOf(((H1172266339307530335) obj).b ? 80.0d : 40.0d);
            case 17:
                return ((H1172266339307530335) obj).e;
            case 18:
                return Double.valueOf(10.0d);
            case 19:
                return ((H1172266339307530335) obj).g;
            case 20:
                return Y582199805280922215.g.w();
            case 21:
                return Y582199805280922215.g.v();
            case 22:
                return ((H1172266339307530335) obj).g;
            case 23:
                return Double.valueOf(((H1172266339307530335) obj).b ? 20.0d : 95.0d);
            case 24:
                return E17149812035295265804.l();
            case 25:
                return ((H1172266339307530335) obj).f;
            case 26:
                E17149812035295265804 e17149812035295265804 = Y582199805280922215.g;
                H1172266339307530335 h11722663393075303354 = (H1172266339307530335) obj;
                h11722663393075303354.getClass();
                return Double.valueOf(U3985905046772670199.a(((Double) e17149812035295265804.y().c.apply(h11722663393075303354)).doubleValue(), 4.5d));
            case 27:
                return Y582199805280922215.g.y();
            case 28:
                return ((H1172266339307530335) obj).e;
            default:
                E17149812035295265804 e171498120352952658042 = Y582199805280922215.g;
                H1172266339307530335 h11722663393075303355 = (H1172266339307530335) obj;
                h11722663393075303355.getClass();
                return Double.valueOf(U3985905046772670199.a(((Double) e171498120352952658042.u().c.apply(h11722663393075303355)).doubleValue(), 4.5d));
        }
    }

    public /* synthetic */ F11242842454977356935(byte b) {
        this.a = b;
    }
}
