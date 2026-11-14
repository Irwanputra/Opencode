package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G17001453823809908244 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public G17001453823809908244(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            P72364327365747079 p72364327365747079 = (P72364327365747079) entry.getValue();
            List arrayList = (List) this.a.get(p72364327365747079);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(p72364327365747079, arrayList);
            }
            arrayList.add((C1309492667323693710) entry.getKey());
        }
    }

    public static void a(List list, I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079, N16594346128251165883 n16594346128251165883) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1309492667323693710 c1309492667323693710 = (C1309492667323693710) list.get(size);
                Method method = c1309492667323693710.b;
                try {
                    int i = c1309492667323693710.a;
                    if (i == 0) {
                        method.invoke(n16594346128251165883, null);
                    } else if (i == 1) {
                        method.invoke(n16594346128251165883, i4293432593871965076);
                    } else if (i == 2) {
                        method.invoke(n16594346128251165883, i4293432593871965076, p72364327365747079);
                    }
                } catch (IllegalAccessException e) {
                    Q11088980322693754445.k(e);
                    return;
                } catch (InvocationTargetException e2) {
                    Z3383101362411723454.m("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
