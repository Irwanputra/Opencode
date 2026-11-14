package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C13398002342190360892 {
    public final int a;
    public final R5670552972627103399 b;
    public final R5670552972627103399 c;

    public C13398002342190360892(List list, List list2, int i) {
        this.a = i;
        if (!(i >= 0)) {
            Y16081827717826519461.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            Y16081827717826519461.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        R5670552972627103399 r5670552972627103399 = new R5670552972627103399();
        r5670552972627103399.addAll(list);
        this.b = r5670552972627103399;
        R5670552972627103399 r56705529726271033992 = new R5670552972627103399();
        r56705529726271033992.addAll(list2);
        this.c = r56705529726271033992;
    }
}
