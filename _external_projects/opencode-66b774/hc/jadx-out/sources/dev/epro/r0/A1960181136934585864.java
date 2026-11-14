package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A1960181136934585864 {
    public HashMap a;
    public HashMap b;

    public A1960181136934585864(C3286149729114985901 c3286149729114985901) {
        this.a = new HashMap(c3286149729114985901.a);
        this.b = new HashMap(c3286149729114985901.b);
    }

    public void a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public K12477491117444883648 b() {
        return new K12477491117444883648(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b));
    }

    public void c(O2211401162397821294 o2211401162397821294) throws GeneralSecurityException {
        HashMap map = this.a;
        if (o2211401162397821294 == null) {
            Z3383101362411723454.k("primitive constructor must be non-null");
            return;
        }
        C5577211331494591160 c5577211331494591160 = new C5577211331494591160(o2211401162397821294.a, o2211401162397821294.b);
        if (!map.containsKey(c5577211331494591160)) {
            map.put(c5577211331494591160, o2211401162397821294);
            return;
        }
        O2211401162397821294 o22114011623978212942 = (O2211401162397821294) map.get(c5577211331494591160);
        if (!o22114011623978212942.equals(o2211401162397821294) || o2211401162397821294 != o22114011623978212942) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(c5577211331494591160)));
        }
    }
}
