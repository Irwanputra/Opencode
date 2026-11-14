package dev.epro.r0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class R4678422174699242737 extends M17033320374872700920 {
    public static void l0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void m0(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
