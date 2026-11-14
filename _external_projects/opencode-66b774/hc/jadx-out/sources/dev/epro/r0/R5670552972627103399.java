package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R5670552972627103399 implements Parcelable, O13595511762861117873, List, RandomAccess, S3000285732458222736 {
    public static final Parcelable.Creator<R5670552972627103399> CREATOR = new H8663435198548398754((byte) 0);
    public I4622425004907418771 a;

    public R5670552972627103399(A4783298371339261043 a4783298371339261043) {
        M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
        I4622425004907418771 i4622425004907418771 = new I4622425004907418771(m4722199849958580248H.g(), a4783298371339261043);
        if (!(m4722199849958580248H instanceof J15946920862211647593)) {
            i4622425004907418771.b = new I4622425004907418771(1L, a4783298371339261043);
        }
        this.a = i4622425004907418771;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043C = a4783298371339261043.c(obj);
            if (a4783298371339261043C.equals(a4783298371339261043)) {
                return false;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i, a4783298371339261043C, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043I = a4783298371339261043.i(collection);
            if (S10823041268949770285.t(a4783298371339261043I, a4783298371339261043)) {
                return false;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i, a4783298371339261043I, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return true;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        t9533098554585011700.b = this.a;
        this.a = (I4622425004907418771) t9533098554585011700;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        M4722199849958580248 m4722199849958580248H;
        I4622425004907418771 i4622425004907418771 = this.a;
        i4622425004907418771.getClass();
        synchronized (D459204867321966484.c) {
            m4722199849958580248H = D459204867321966484.h();
            I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.w(i4622425004907418771, this, m4722199849958580248H);
            synchronized (E3422549137300678133.m) {
                i46224250049074187712.c = A13457896839052192887.b;
                i46224250049074187712.d++;
                i46224250049074187712.e++;
            }
        }
        D459204867321966484.l(m4722199849958580248H, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return E3422549137300678133.S(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return E3422549137300678133.S(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return E3422549137300678133.S(this).c.get(i);
    }

    public final void i(int i, int i2) {
        int i3;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i3 = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            J15049672055732829618 j15049672055732829618J = a4783298371339261043.j();
            j15049672055732829618J.subList(i, i2).clear();
            A4783298371339261043 a4783298371339261043C = j15049672055732829618J.c();
            if (S10823041268949770285.t(a4783298371339261043C, a4783298371339261043)) {
                return;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i3, a4783298371339261043C, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return E3422549137300678133.S(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return E3422549137300678133.S(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return E3422549137300678133.S(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new E12552353581788229419(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            int iIndexOf = a4783298371339261043.indexOf(obj);
            A4783298371339261043 a4783298371339261043L = iIndexOf != -1 ? a4783298371339261043.l(iIndexOf) : a4783298371339261043;
            if (a4783298371339261043L.equals(a4783298371339261043)) {
                return false;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i, a4783298371339261043L, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043K = a4783298371339261043.k(new X4434822404034665133(collection, (byte) 0));
            if (S10823041268949770285.t(a4783298371339261043K, a4783298371339261043)) {
                return false;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i, a4783298371339261043K, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return E3422549137300678133.W(this, new X4434822404034665133(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        Object obj2 = get(i);
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i2 = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043M = a4783298371339261043.m(i, obj);
            if (a4783298371339261043M.equals(a4783298371339261043)) {
                break;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i2, a4783298371339261043M, false);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return E3422549137300678133.S(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            L4738636499147270068.a("fromIndex or toIndex are out of bounds");
        }
        return new X4685569590240598738(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return D15445857918358799638.e0(this);
    }

    public final String toString() {
        I4622425004907418771 i4622425004907418771 = this.a;
        i4622425004907418771.getClass();
        return "SnapshotStateList(value=" + ((I4622425004907418771) D459204867321966484.f(i4622425004907418771)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A4783298371339261043 a4783298371339261043 = E3422549137300678133.S(this).c;
        int iA = a4783298371339261043.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(a4783298371339261043.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return D15445857918358799638.f0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new E12552353581788229419(this, i);
    }

    public R5670552972627103399() {
        this(A13457896839052192887.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i2 = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043B = a4783298371339261043.b(i, obj);
            if (a4783298371339261043B.equals(a4783298371339261043)) {
                return;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i2, a4783298371339261043B, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return E3422549137300678133.W(this, new B5635736699687884861(i, collection, (byte) 8));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        A4783298371339261043 a4783298371339261043;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        Object obj = get(i);
        do {
            synchronized (E3422549137300678133.m) {
                I4622425004907418771 i4622425004907418771 = this.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i2 = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            A4783298371339261043 a4783298371339261043L = a4783298371339261043.l(i);
            if (a4783298371339261043L.equals(a4783298371339261043)) {
                break;
            }
            I4622425004907418771 i46224250049074187713 = this.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = E3422549137300678133.K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, this, m4722199849958580248H), i2, a4783298371339261043L, true);
            }
            D459204867321966484.l(m4722199849958580248H, this);
        } while (!zK);
        return obj;
    }
}
