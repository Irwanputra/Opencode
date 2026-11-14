package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H1172266339307530335 {
    public final W10545060672287394780 a;
    public final boolean b;
    public final double c;
    public final N15736424885242183871 d;
    public final N15736424885242183871 e;
    public final N15736424885242183871 f;
    public final N15736424885242183871 g;
    public final N15736424885242183871 h;
    public final N15736424885242183871 i;

    public H1172266339307530335(W10545060672287394780 w10545060672287394780, boolean z, double d) {
        ArrayList arrayList;
        N15736424885242183871 a = N15736424885242183871.a(w10545060672287394780.a, w10545060672287394780.b);
        double d2 = w10545060672287394780.a;
        double d3 = w10545060672287394780.b;
        N15736424885242183871 a2 = N15736424885242183871.a(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((Object) w10545060672287394780, (byte) 18);
        int round = (int) Math.round(w10545060672287394780.a);
        W10545060672287394780 w105450606722873947802 = (W10545060672287394780) j15730374346044043770.H().get(round);
        double J = j15730374346044043770.J(w105450606722873947802);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(w105450606722873947802);
        int i = 0;
        double d4 = 0.0d;
        while (i < 360) {
            int i2 = (round + i) % 360;
            if (i2 < 0) {
                i2 += 360;
            }
            double J2 = j15730374346044043770.J((W10545060672287394780) j15730374346044043770.H().get(i2));
            d4 += Math.abs(J2 - J);
            i++;
            J = J2;
        }
        double d5 = d4 / 6.0d;
        double J3 = j15730374346044043770.J(w105450606722873947802);
        int i3 = 1;
        double d6 = 0.0d;
        while (true) {
            if (arrayList2.size() >= 6) {
                arrayList = arrayList2;
                break;
            }
            int i4 = (round + i3) % 360;
            W10545060672287394780 w105450606722873947803 = (W10545060672287394780) j15730374346044043770.H().get(i4 < 0 ? i4 + 360 : i4);
            double J4 = j15730374346044043770.J(w105450606722873947803);
            d6 = Math.abs(J4 - J3) + d6;
            boolean z2 = d6 >= ((double) arrayList2.size()) * d5;
            int i5 = 1;
            for (int i6 = 6; z2 && arrayList2.size() < i6; i6 = 6) {
                arrayList2.add(w105450606722873947803);
                ArrayList arrayList3 = arrayList2;
                z2 = d6 >= ((double) (arrayList2.size() + i5)) * d5;
                i5++;
                arrayList2 = arrayList3;
            }
            arrayList = arrayList2;
            i3++;
            if (i3 > 360) {
                while (arrayList.size() < 6) {
                    arrayList.add(w105450606722873947803);
                }
            } else {
                arrayList2 = arrayList;
                J3 = J4;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(w10545060672287394780);
        int floor = (int) Math.floor(1.0d);
        for (int i7 = 1; i7 < floor + 1; i7++) {
            int i8 = 0 - i7;
            while (i8 < 0) {
                i8 += arrayList.size();
            }
            if (i8 >= arrayList.size()) {
                i8 %= arrayList.size();
            }
            arrayList4.add(0, (W10545060672287394780) arrayList.get(i8));
        }
        int i9 = 3 - floor;
        for (int i10 = 1; i10 < i9; i10++) {
            int i11 = i10;
            while (i11 < 0) {
                i11 += arrayList.size();
            }
            if (i11 >= arrayList.size()) {
                i11 %= arrayList.size();
            }
            arrayList4.add((W10545060672287394780) arrayList.get(i11));
        }
        W10545060672287394780 G = S10823041268949770285.G((W10545060672287394780) arrayList4.get(2));
        N15736424885242183871 n15736424885242183871 = new N15736424885242183871(G.a, G.b);
        N15736424885242183871 a3 = N15736424885242183871.a(w10545060672287394780.a, w10545060672287394780.b / 8.0d);
        N15736424885242183871 a4 = N15736424885242183871.a(w10545060672287394780.a, (w10545060672287394780.b / 8.0d) + 4.0d);
        this.a = w10545060672287394780;
        this.b = z;
        this.c = d;
        this.d = a;
        this.e = a2;
        this.f = n15736424885242183871;
        this.g = a3;
        this.h = a4;
        this.i = N15736424885242183871.a(25.0d, 84.0d);
    }
}
