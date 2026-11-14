package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        G9506192477171422664 g9506192477171422664 = this.e;
        if (g9506192477171422664 == null) {
            G9506192477171422664 F = K5751602218013079365.F();
            F.addAll(this.b);
            O8620973563946607355 o8620973563946607355 = this.a;
            if (o8620973563946607355 != null) {
                F.add(o8620973563946607355);
            }
            F.addAll(this.c);
            g9506192477171422664 = K5751602218013079365.v(F);
            this.e = g9506192477171422664;
        }
        g9506192477171422664.getClass();
        return g9506192477171422664;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K17144186020438744863() {
        /*
            r3 = this;
            r0 = -1
            dev.epro.r0.O2161699089510411363 r1 = dev.epro.r0.O2161699089510411363.a
            r2 = 0
            r3.<init>(r2, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K17144186020438744863.<init>():void");
    }
}
