package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D17066879453943832644 {
    public final double a;
    public final double b;
    public final java.util.HashMap c = new java.util.HashMap();

    public D17066879453943832644(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(int i) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.util.HashMap map = this.c;
        if (map.get(numValueOf) == null) {
            map.put(java.lang.Integer.valueOf(i), java.lang.Double.valueOf(dev.epro.r0.W10545060672287394780.a(this.a, 200.0d, i).b));
        }
        return ((java.lang.Double) map.get(java.lang.Integer.valueOf(i))).doubleValue();
    }
}
