package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A1960181136934585864 {
    public java.util.HashMap a;
    public java.util.HashMap b;

    public A1960181136934585864(dev.epro.r0.C3286149729114985901 c3286149729114985901) {
        this.a = new java.util.HashMap(c3286149729114985901.a);
        this.b = new java.util.HashMap(c3286149729114985901.b);
    }

    public void a(java.lang.Enum r2, java.lang.Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public dev.epro.r0.K12477491117444883648 b() {
        return new dev.epro.r0.K12477491117444883648(java.util.Collections.unmodifiableMap(this.a), java.util.Collections.unmodifiableMap(this.b));
    }

    public void c(dev.epro.r0.O2211401162397821294 o2211401162397821294) throws java.security.GeneralSecurityException {
        java.util.HashMap map = this.a;
        if (o2211401162397821294 == null) {
            dev.epro.r0.Z3383101362411723454.k("primitive constructor must be non-null");
            return;
        }
        dev.epro.r0.C5577211331494591160 c5577211331494591160 = new dev.epro.r0.C5577211331494591160(o2211401162397821294.a, o2211401162397821294.b);
        if (!map.containsKey(c5577211331494591160)) {
            map.put(c5577211331494591160, o2211401162397821294);
            return;
        }
        dev.epro.r0.O2211401162397821294 o22114011623978212942 = (dev.epro.r0.O2211401162397821294) map.get(c5577211331494591160);
        if (!o22114011623978212942.equals(o2211401162397821294) || o2211401162397821294 != o22114011623978212942) {
            throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(java.lang.String.valueOf(c5577211331494591160)));
        }
    }
}
