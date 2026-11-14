package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N7756202525712935399 extends H9330595680939527366 implements List, RandomAccess {
    public static final H13215157385046624211 b = new H13215157385046624211(U15842361112894803844.e, 0);

    public static U15842361112894803844 m(int i, Object[] objArr) {
        return i == 0 ? U15842361112894803844.e : new U15842361112894803844(i, objArr);
    }

    public static N7756202525712935399 n(ArrayList arrayList) {
        Object[] array = arrayList.toArray();
        E3422549137300678133.M(array.length, array);
        return m(array.length, array);
    }

    public static U15842361112894803844 p(Integer num, Integer num2) {
        Object[] objArr = {num, num2};
        E3422549137300678133.M(2, objArr);
        return m(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // dev.epro.r0.H9330595680939527366
    public int b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // dev.epro.r0.H9330595680939527366, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && M2066880349381062048.A(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (M2066880349381062048.A(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
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
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final U1864172318023436692 l() {
        return listIterator(0);
    }

    @Override // java.util.List
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
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final H13215157385046624211 listIterator(int i) {
        U15853425786981391261.A(i, size());
        return isEmpty() ? b : new H13215157385046624211(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q */
    public N7756202525712935399 subList(int i, int i2) {
        U15853425786981391261.B(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? U15842361112894803844.e : new W16135392790107701346(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final N7756202525712935399 a() {
        return this;
    }
}
