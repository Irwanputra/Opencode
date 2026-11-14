package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M17189296052689530719 {
    public static final Object[] a = new Object[0];
    public static final U9803441765912152712 b = new U9803441765912152712(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            W4415201450379021245.a(G11450220448113054352.h(i, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            S10973172697741180971.j(G11450220448113054352.h(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            W4415201450379021245.a(G6547577305291411977.o(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
