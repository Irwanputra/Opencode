package dev.epro.r0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L3530692241870850490 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapZ0 = E4951175994894594588.z0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapZ0.values().iterator();
        while (it.hasNext()) {
            ((J14024120050125738337) it.next()).b();
        }
    }

    public final String toString() {
        String strC = J17975719213314763068.a(L3530692241870850490.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        M9216324016624295870.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + R9411874267597469228.h1(this.a.keySet()) + ")";
    }
}
