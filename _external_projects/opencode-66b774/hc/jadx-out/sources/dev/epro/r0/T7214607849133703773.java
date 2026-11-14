package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T7214607849133703773 {
    public static final ArrayList a;

    static {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"chacha20-poly1305@openssh.com"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        a = new ArrayList(Collections.unmodifiableList(arrayList));
    }
}
