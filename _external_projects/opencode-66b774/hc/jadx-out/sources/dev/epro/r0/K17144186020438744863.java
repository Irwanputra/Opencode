package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17144186020438744863 {
    public final O8620973563946607355 a;
    public final List b;
    public final List c;
    public final int d;
    public G9506192477171422664 e;

    public K17144186020438744863(O8620973563946607355 o8620973563946607355, List list, List list2, int i) {
        this.a = o8620973563946607355;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        G9506192477171422664 g9506192477171422664V = this.e;
        if (g9506192477171422664V == null) {
            G9506192477171422664 g9506192477171422664F = K5751602218013079365.F();
            g9506192477171422664F.addAll(this.b);
            O8620973563946607355 o8620973563946607355 = this.a;
            if (o8620973563946607355 != null) {
                g9506192477171422664F.add(o8620973563946607355);
            }
            g9506192477171422664F.addAll(this.c);
            g9506192477171422664V = K5751602218013079365.v(g9506192477171422664F);
            this.e = g9506192477171422664V;
        }
        g9506192477171422664V.getClass();
        return g9506192477171422664V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K17144186020438744863.class != obj.getClass()) {
            return false;
        }
        K17144186020438744863 k17144186020438744863 = (K17144186020438744863) obj;
        return this.d == k17144186020438744863.d && a().equals(k17144186020438744863.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K17144186020438744863() {
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        this(null, o2161699089510411363, o2161699089510411363, -1);
    }
}
