package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G9506192477171422664 extends E2168127913664336368 implements RandomAccess, Serializable {
    public static final G9506192477171422664 d;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        G9506192477171422664 g9506192477171422664 = new G9506192477171422664(0);
        g9506192477171422664.c = true;
        d = g9506192477171422664;
    }

    public G9506192477171422664(int i) {
        if (i >= 0) {
            this.a = new Object[i];
        } else {
            S10973172697741180971.j("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final int a() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        int i2 = this.b;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        k();
        int i2 = this.b;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        i(i, collection, size);
        return size > 0;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final Object b(int i) {
        k();
        int i2 = this.b;
        if (i >= 0 && i < i2) {
            return m(i);
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (S10823041268949770285.t(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i >= 0 && i < i2) {
            return this.a[i];
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (S10823041268949770285.t(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.a[i] = obj;
    }

    public final void k() {
        if (this.c) {
            Z3383101362411723454.t();
        }
    }

    public final void l(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.a;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.a = objArrCopyOf;
        }
        O5378677881740157249.n0(i + i2, i, this.b, objArrCopyOf, objArrCopyOf);
        this.b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (S10823041268949770285.t(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            return new E12552353581788229419(this, i);
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        O5378677881740157249.n0(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        O5378677881740157249.n0(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        C9869900372345142877.Q(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        O5378677881740157249.n0(i + i4, i2 + i, this.b, objArr, objArr);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        C9869900372345142877.Q(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        k();
        return o(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        k();
        return o(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C9869900372345142877.r(i, i2, this.b);
        return new R15533989166562977617(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.b;
        Object[] objArr2 = this.a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        O5378677881740157249.n0(0, 0, i, objArr2, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C9869900372345142877.S(this.a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.b;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return O5378677881740157249.v0(this.a, 0, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k();
        int size = collection.size();
        i(this.b, collection, size);
        return size > 0;
    }
}
