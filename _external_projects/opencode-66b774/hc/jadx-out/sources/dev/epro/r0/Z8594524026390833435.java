package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Z8594524026390833435 extends G10942763614670705019 implements List, RandomAccess {
    public static final K3123557041172724173 e = new K3123557041172724173(F10953201023776195364.h, 0);

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                K3123557041172724173 k3123557041172724173ListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (k3123557041172724173ListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(k3123557041172724173ListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public int p(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    public Z8594524026390833435 q() {
        return size() <= 1 ? this : new D5439222595724916180(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Z8594524026390833435 subList(int i, int i2) {
        E10717724117948616506.r(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? F10953201023776195364.h : new P13457606187462299342(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final K3123557041172724173 listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? e : new K3123557041172724173(this, i);
        }
        W4415201450379021245.a(E10717724117948616506.s(i, size, "index"));
        return null;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
