package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class A5540824790408504619 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = U10174709222559481877.i;
    }

    public static final List a(String str) {
        Y15884005729456015309 y15884005729456015309 = new Y15884005729456015309((byte) 1);
        ArrayList arrayList = y15884005729456015309.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            y15884005729456015309.a = arrayList;
        } else {
            arrayList.clear();
        }
        y15884005729456015309.b(str, arrayList);
        ArrayList arrayList2 = y15884005729456015309.a;
        return arrayList2 != null ? arrayList2 : O2161699089510411363.a;
    }
}
