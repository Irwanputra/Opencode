package dev.epro.r0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N3708695931114372880 implements Iterator, D14639766352081121636 {
    public final /* synthetic */ byte a = 1;
    public final Iterator b;

    public N3708695931114372880(D13190160240050003111 d13190160240050003111) {
        Y975470382943463598[] y975470382943463598Arr = new Y975470382943463598[8];
        for (int i = 0; i < 8; i++) {
            y975470382943463598Arr[i] = new G7787024643449318697(this);
        }
        this.b = new Z11187821387800077217(d13190160240050003111, y975470382943463598Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((Z11187821387800077217) this.b).c;
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (Map.Entry) ((Z11187821387800077217) this.b).next();
            default:
                return (A16390126751166503819) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((Z11187821387800077217) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public N3708695931114372880(A9257386642212911937 a9257386642212911937) {
        this.b = a9257386642212911937.j.iterator();
    }
}
