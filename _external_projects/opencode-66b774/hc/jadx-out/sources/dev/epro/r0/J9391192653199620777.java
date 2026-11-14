package dev.epro.r0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J9391192653199620777 {
    public static final Z1790011097603746219 a = new Z1790011097603746219();
    public static final K17532359216101686545 b = new K17532359216101686545();

    public void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) J3288146055636008296.j(j, obj);
        if (list instanceof M9021326446326000287) {
            objUnmodifiableList = ((M9021326446326000287) list).f();
        } else if (Z1790011097603746219.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        J3288146055636008296.p(j, obj, objUnmodifiableList);
    }

    public void b(long j, Object obj, Object obj2) {
        List list = (List) J3288146055636008296.j(j, obj2);
        List listD = Z1790011097603746219.d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        J3288146055636008296.p(j, obj, list);
    }

    public List c(long j, Object obj) {
        return Z1790011097603746219.d(10, j, obj);
    }
}
