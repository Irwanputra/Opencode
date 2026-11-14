package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R15533989166562977617 extends E2168127913664336368 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final R15533989166562977617 d;
    public final G9506192477171422664 e;

    public R15533989166562977617(Object[] objArr, int i, int i2, R15533989166562977617 r15533989166562977617, G9506192477171422664 g9506192477171422664) {
        int i3;
        objArr.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = r15533989166562977617;
        this.e = g9506192477171422664;
        i3 = ((AbstractList) g9506192477171422664).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final int a() {
        k();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        } else {
            j(this.b + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        k();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        i(this.b + i, collection, size);
        return size > 0;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final Object b(int i) {
        l();
        k();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return m(this.b + i);
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (S10823041268949770285.t(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a[this.b + i];
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        G9506192477171422664 g9506192477171422664 = this.e;
        R15533989166562977617 r15533989166562977617 = this.d;
        if (r15533989166562977617 != null) {
            r15533989166562977617.i(i, collection, i2);
        } else {
            G9506192477171422664 g95061924771714226642 = G9506192477171422664.d;
            g9506192477171422664.i(i, collection, i2);
        }
        this.a = g9506192477171422664.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.c; i++) {
            if (S10823041268949770285.t(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        G9506192477171422664 g9506192477171422664 = this.e;
        R15533989166562977617 r15533989166562977617 = this.d;
        if (r15533989166562977617 != null) {
            r15533989166562977617.j(i, obj);
        } else {
            G9506192477171422664 g95061924771714226642 = G9506192477171422664.d;
            g9506192477171422664.j(i, obj);
        }
        this.a = g9506192477171422664.a;
        this.c++;
    }

    public final void k() {
        int i;
        i = ((AbstractList) this.e).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        U15384774985926769650.c();
    }

    public final void l() {
        if (this.e.c) {
            Z3383101362411723454.t();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.c - 1; i >= 0; i--) {
            if (S10823041268949770285.t(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            return new E12552353581788229419(this, i);
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final Object m(int i) {
        Object m;
        ((AbstractList) this).modCount++;
        R15533989166562977617 r15533989166562977617 = this.d;
        if (r15533989166562977617 != null) {
            m = r15533989166562977617.m(i);
        } else {
            G9506192477171422664 g9506192477171422664 = G9506192477171422664.d;
            m = this.e.m(i);
        }
        this.c--;
        return m;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        R15533989166562977617 r15533989166562977617 = this.d;
        if (r15533989166562977617 != null) {
            r15533989166562977617.n(i, i2);
        } else {
            G9506192477171422664 g9506192477171422664 = G9506192477171422664.d;
            this.e.n(i, i2);
        }
        this.c -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int o2;
        R15533989166562977617 r15533989166562977617 = this.d;
        if (r15533989166562977617 != null) {
            o2 = r15533989166562977617.o(i, i2, collection, z);
        } else {
            G9506192477171422664 g9506192477171422664 = G9506192477171422664.d;
            o2 = this.e.o(i, i2, collection, z);
        }
        if (o2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= o2;
        return o2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        l();
        k();
        return o(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        k();
        return o(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C9869900372345142877.r(i, i2, this.c);
        return new R15533989166562977617(this.a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        k();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        O5378677881740157249.n0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return C9869900372345142877.S(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return O5378677881740157249.v0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        k();
        int size = collection.size();
        i(this.b + this.c, collection, size);
        return size > 0;
    }
}
