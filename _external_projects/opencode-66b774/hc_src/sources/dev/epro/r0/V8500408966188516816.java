package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V8500408966188516816 implements D18043721478450045610, Set, D14639766352081121636 {
    public final E13273723708836014930 a;
    public final E13273723708836014930 b;

    public V8500408966188516816(E13273723708836014930 e13273723708836014930) {
        this.a = e13273723708836014930;
        this.b = e13273723708836014930;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        E13273723708836014930 e13273723708836014930 = this.b;
        int i = e13273723708836014930.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e13273723708836014930.k(it.next());
        }
        return i != e13273723708836014930.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V8500408966188516816.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((V8500408966188516816) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C13932356399610645840(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        E13273723708836014930 e13273723708836014930 = this.b;
        int i = e13273723708836014930.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e13273723708836014930.i(it.next());
        }
        return i != e13273723708836014930.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        E13273723708836014930 e13273723708836014930 = this.b;
        Object[] objArr = e13273723708836014930.b;
        int i = e13273723708836014930.d;
        long[] jArr = e13273723708836014930.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!R9411874267597469228.v0(collection, objArr[i5])) {
                                e13273723708836014930.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != e13273723708836014930.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return D15445857918358799638.f0(this, objArr);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return D15445857918358799638.e0(this);
    }
}
