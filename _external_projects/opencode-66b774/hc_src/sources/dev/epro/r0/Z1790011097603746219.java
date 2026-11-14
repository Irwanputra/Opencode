package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z1790011097603746219 extends J9391192653199620777 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List list = (List) J3288146055636008296.j(j, obj);
        if (list.isEmpty()) {
            List i8742515246535873114 = list instanceof M9021326446326000287 ? new I8742515246535873114(i) : new ArrayList(i);
            J3288146055636008296.p(j, obj, i8742515246535873114);
            return i8742515246535873114;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            J3288146055636008296.p(j, obj, arrayList);
            return arrayList;
        }
        if (!(list instanceof G6682437202242600944)) {
            return list;
        }
        I8742515246535873114 i87425152465358731142 = new I8742515246535873114(list.size() + i);
        i87425152465358731142.addAll((G6682437202242600944) list);
        J3288146055636008296.p(j, obj, i87425152465358731142);
        return i87425152465358731142;
    }
}
