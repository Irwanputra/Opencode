package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1644299864327434647 extends H18172316468146598624 {
    public final G1840519957725232630 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1644299864327434647(G1840519957725232630 g1840519957725232630, String str) {
        super(g1840519957725232630.b(B11964701839924937722.y(A10188109575003443817.class)), (String) null);
        g1840519957725232630.getClass();
        str.getClass();
        this.h = new ArrayList();
        this.f = g1840519957725232630;
        this.g = str;
    }

    public final Q4132023691817090890 g() {
        int iHashCode;
        Q4132023691817090890 q4132023691817090890 = (Q4132023691817090890) super.a();
        G5793569464912558238 g5793569464912558238 = q4132023691817090890.f;
        g5793569464912558238.getClass();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            V7801742040189616406 v7801742040189616406 = (V7801742040189616406) obj;
            if (v7801742040189616406 != null) {
                E8321115364184429049 e8321115364184429049 = (E8321115364184429049) g5793569464912558238.e;
                Q4132023691817090890 q41320236918170908902 = (Q4132023691817090890) g5793569464912558238.d;
                G6575252167976303972 g6575252167976303972 = q41320236918170908902.b;
                G6575252167976303972 g65752521679763039722 = v7801742040189616406.b;
                int i2 = g65752521679763039722.a;
                String str = (String) g65752521679763039722.e;
                if (i2 == 0 && str == null) {
                    S10973172697741180971.j("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) g6575252167976303972.e;
                if (str2 != null && S10823041268949770285.t(str, str2)) {
                    D11988991656201568495.n("Destination ", v7801742040189616406, " cannot have the same route as graph ", q41320236918170908902);
                    return null;
                }
                if (i2 == g6575252167976303972.a) {
                    D11988991656201568495.n("Destination ", v7801742040189616406, " cannot have the same id as graph ", q41320236918170908902);
                    return null;
                }
                V7801742040189616406 v78017420401896164062 = (V7801742040189616406) V1475975160983963926.p(e8321115364184429049, i2);
                if (v78017420401896164062 == v7801742040189616406) {
                    continue;
                } else {
                    if (v7801742040189616406.c != null) {
                        S10973172697741180971.m("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (v78017420401896164062 != null) {
                        v78017420401896164062.c = null;
                    }
                    v7801742040189616406.c = q41320236918170908902;
                    e8321115364184429049.c(g65752521679763039722.a, v7801742040189616406);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (((String) this.b) != null) {
                S10973172697741180971.m("You must set a start destination route");
                return null;
            }
            S10973172697741180971.m("You must set a start destination id");
            return null;
        }
        Q4132023691817090890 q41320236918170908903 = (Q4132023691817090890) g5793569464912558238.d;
        if (str3 != null) {
            if (str3.equals((String) q41320236918170908903.b.e)) {
                D11988991656201568495.n("Start destination ", str3, " cannot use the same route as the graph ", q41320236918170908903);
            } else if (M8927913404651150384.Y(str3)) {
                S10973172697741180971.j("Cannot have an empty start destination route");
            } else {
                int i3 = V7801742040189616406.e;
                iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return q4132023691817090890;
        }
        iHashCode = 0;
        g5793569464912558238.b = iHashCode;
        g5793569464912558238.c = str3;
        return q4132023691817090890;
    }
}
