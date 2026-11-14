package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y16350503129143940616 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(int i, int i2, List list) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(G11450220448113054352.h(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(G6547577305291411977.o(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(G11450220448113054352.h(i, i2, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(G11450220448113054352.h(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
