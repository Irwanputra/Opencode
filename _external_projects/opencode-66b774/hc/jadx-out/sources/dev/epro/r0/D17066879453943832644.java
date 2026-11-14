package dev.epro.r0;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D17066879453943832644 {
    public final double a;
    public final double b;
    public final HashMap c = new HashMap();

    public D17066879453943832644(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (map.get(numValueOf) == null) {
            map.put(Integer.valueOf(i), Double.valueOf(W10545060672287394780.a(this.a, 200.0d, i).b));
        }
        return ((Double) map.get(Integer.valueOf(i))).doubleValue();
    }
}
