package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X4685569590240598738 implements List, S3000285732458222736 {
    public final R5670552972627103399 a;
    public final int b;
    public int c;
    public int d;

    public X4685569590240598738(R5670552972627103399 r5670552972627103399, int i, int i2) {
        this.a = r5670552972627103399;
        this.b = i;
        this.c = E3422549137300678133.T(r5670552972627103399);
        this.d = i2 - i;
    }

    public final void a() {
        if (E3422549137300678133.T(this.a) == this.c) {
            return;
        }
        U15384774985926769650.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        R5670552972627103399 r5670552972627103399 = this.a;
        r5670552972627103399.add(i, obj);
        this.d++;
        this.c = E3422549137300678133.T(r5670552972627103399);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        R5670552972627103399 r5670552972627103399 = this.a;
        boolean zAddAll = r5670552972627103399.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = E3422549137300678133.T(r5670552972627103399);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            a();
            int i = this.d;
            int i2 = this.b;
            R5670552972627103399 r5670552972627103399 = this.a;
            r5670552972627103399.i(i2, i + i2);
            this.d = 0;
            this.c = E3422549137300678133.T(r5670552972627103399);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        E3422549137300678133.e0(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator it = W7808703833045379622.N(i2, i + i2).iterator();
        while (((M18282718993909554674) it).c) {
            int iNextInt = ((B16024634506412482045) it).nextInt();
            if (S10823041268949770285.t(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (S10823041268949770285.t(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        a8284336046188466534.a = i - 1;
        return new I13152702509604143947(a8284336046188466534, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        R5670552972627103399 r5670552972627103399 = this.a;
        Object objRemove = r5670552972627103399.remove(i2);
        this.d--;
        this.c = E3422549137300678133.T(r5670552972627103399);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        a();
        R5670552972627103399 r5670552972627103399 = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = r5670552972627103399.size();
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            J15049672055732829618 j15049672055732829618J = a4783298371339261043.j();
            j15049672055732829618J.subList(i2, i3).retainAll(collection);
            A4783298371339261043 a4783298371339261043C = j15049672055732829618J.c();
            if (S10823041268949770285.t(a4783298371339261043C, a4783298371339261043)) {
                break;
            }
            I4622425004907418771 i46224250049074187713 = r5670552972627103399.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, r5670552972627103399, m4722199849958580248H), i, a4783298371339261043C, true);
            }
            D459204867321966484.l(m4722199849958580248H, r5670552972627103399);
        } while (!zK);
        int size2 = size - r5670552972627103399.size();
        if (size2 > 0) {
            this.c = E3422549137300678133.T(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        E3422549137300678133.e0(i, this.d);
        a();
        int i2 = i + this.b;
        R5670552972627103399 r5670552972627103399 = this.a;
        Object obj2 = r5670552972627103399.set(i2, obj);
        this.c = E3422549137300678133.T(r5670552972627103399);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            L4738636499147270068.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new X4685569590240598738(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return D15445857918358799638.e0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return D15445857918358799638.f0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        R5670552972627103399 r5670552972627103399 = this.a;
        r5670552972627103399.add(i2, obj);
        this.d++;
        this.c = E3422549137300678133.T(r5670552972627103399);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
