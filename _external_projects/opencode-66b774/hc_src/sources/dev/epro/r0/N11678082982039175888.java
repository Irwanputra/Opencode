package dev.epro.r0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N11678082982039175888 extends E2168127913664336368 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public N11678082982039175888(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else {
            if (i <= 0) {
                S10973172697741180971.j(G6547577305291411977.n(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        i(this.c + 1);
        int o2 = o(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            int length = o2 == 0 ? this.b.length - 1 : o2 - 1;
            int i4 = this.a;
            int length2 = i4 == 0 ? this.b.length - 1 : i4 - 1;
            Object[] objArr = this.b;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                O5378677881740157249.n0(i4, i4 + 1, length + 1, objArr, objArr);
            } else {
                O5378677881740157249.n0(i4 - 1, i4, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                O5378677881740157249.n0(0, 1, length + 1, objArr2, objArr2);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int o3 = o(i3 + this.a);
            Object[] objArr3 = this.b;
            if (o2 < o3) {
                O5378677881740157249.n0(o2 + 1, o2, o3, objArr3, objArr3);
            } else {
                O5378677881740157249.n0(1, 0, o3, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                O5378677881740157249.n0(o2 + 1, o2, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[o2] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        p();
        i(collection.size() + this.c);
        int o2 = o(this.c + this.a);
        int o3 = o(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = o3 + size;
            Object[] objArr = this.b;
            if (o3 < o2) {
                int i4 = size + o2;
                if (i4 <= objArr.length) {
                    O5378677881740157249.n0(i3, o3, o2, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    O5378677881740157249.n0(i3 - objArr.length, o3, o2, objArr, objArr);
                } else {
                    int length = o2 - (i4 - objArr.length);
                    O5378677881740157249.n0(0, length, o2, objArr, objArr);
                    Object[] objArr2 = this.b;
                    O5378677881740157249.n0(i3, o3, length, objArr2, objArr2);
                }
            } else {
                O5378677881740157249.n0(size, 0, o2, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    O5378677881740157249.n0(i3 - objArr3.length, o3, objArr3.length, objArr3, objArr3);
                } else {
                    O5378677881740157249.n0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    O5378677881740157249.n0(i3, o3, objArr4.length - size, objArr4, objArr4);
                }
            }
            c(o3, collection);
            return true;
        }
        int i5 = this.a;
        int i6 = i5 - size;
        Object[] objArr5 = this.b;
        if (o3 < i5) {
            O5378677881740157249.n0(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= o3) {
                O5378677881740157249.n0(objArr6.length - size, 0, o3, objArr6, objArr6);
            } else {
                O5378677881740157249.n0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                O5378677881740157249.n0(0, size, o3, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            O5378677881740157249.n0(i6, i5, o3, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = o3 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                O5378677881740157249.n0(i6, i5, o3, objArr5, objArr5);
            } else {
                O5378677881740157249.n0(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.b;
                O5378677881740157249.n0(0, this.a + length2, o3, objArr8, objArr8);
            }
        }
        this.a = i6;
        c(m(o3 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        i(this.c + 1);
        int i = this.a;
        if (i == 0) {
            i = this.b.length;
        }
        int i2 = i - 1;
        this.a = i2;
        this.b[i2] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        p();
        i(this.c + 1);
        this.b[o(this.c + this.a)] = obj;
        this.c++;
    }

    @Override // dev.epro.r0.E2168127913664336368
    public final Object b(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int o2 = o(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[o2];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (o2 >= i4) {
                O5378677881740157249.n0(i4 + 1, i4, o2, objArr, objArr);
            } else {
                O5378677881740157249.n0(1, 0, o2, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                O5378677881740157249.n0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = k(i6);
        } else {
            int o3 = o((a() - 1) + i4);
            Object[] objArr4 = this.b;
            if (o2 <= o3) {
                O5378677881740157249.n0(o2, o2 + 1, o3 + 1, objArr4, objArr4);
            } else {
                O5378677881740157249.n0(o2, o2 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                O5378677881740157249.n0(0, 1, o3 + 1, objArr5, objArr5);
            }
            this.b[o3] = null;
        }
        this.c--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.a, o(this.c + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        K2042933864045806308.n("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.b[o(this.a + i)];
        }
        W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final void i(int i) {
        if (i < 0) {
            S10973172697741180971.m("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        O5378677881740157249.n0(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        O5378677881740157249.n0(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int o2 = o(this.c + this.a);
        int i2 = this.a;
        if (i2 < o2) {
            while (i2 < o2) {
                if (S10823041268949770285.t(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.a) < o2) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < o2; i3++) {
                    if (S10823041268949770285.t(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (S10823041268949770285.t(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final int k(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.b[o((a() - 1) + this.a)];
    }

    public final Object last() {
        if (isEmpty()) {
            K2042933864045806308.n("ArrayDeque is empty.");
            return null;
        }
        return this.b[o((a() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int o2 = o(this.c + this.a);
        int i2 = this.a;
        if (i2 < o2) {
            length = o2 - 1;
            if (i2 <= length) {
                while (!S10823041268949770285.t(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= o2) {
            while (true) {
                o2--;
                Object[] objArr = this.b;
                if (-1 >= o2) {
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!S10823041268949770285.t(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else if (S10823041268949770285.t(obj, objArr[o2])) {
                    length = o2 + this.b.length;
                    i = this.a;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void n(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.b, 0, i2, (Object) null);
        }
    }

    public final int o(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int o2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int o3 = o(this.c + this.a);
            int i = this.a;
            if (i < o3) {
                o2 = i;
                while (true) {
                    objArr = this.b;
                    if (i >= o3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[o2] = obj;
                        o2++;
                    }
                    i++;
                }
                Arrays.fill(objArr, o2, o3, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                o2 = o(i2);
                for (int i3 = 0; i3 < o3; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[o2] = obj3;
                        o2 = k(o2);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.c = m(o2 - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            K2042933864045806308.n("ArrayDeque is empty.");
            return null;
        }
        p();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = k(i);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            K2042933864045806308.n("ArrayDeque is empty.");
            return null;
        }
        p();
        int o2 = o((a() - 1) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[o2];
        objArr[o2] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C9869900372345142877.r(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        p();
        int i4 = this.c - i2;
        int i5 = this.a;
        int i6 = this.a;
        if (i < i4) {
            int o2 = o((i - 1) + i5);
            int o3 = o((i2 - 1) + i6);
            while (i > 0) {
                int i7 = o2 + 1;
                int min = Math.min(i, Math.min(i7, o3 + 1));
                Object[] objArr = this.b;
                int i8 = o3 - min;
                int i9 = o2 - min;
                O5378677881740157249.n0(i8 + 1, i9 + 1, i7, objArr, objArr);
                o2 = m(i9);
                o3 = m(i8);
                i -= min;
            }
            int o4 = o(this.a + i3);
            n(this.a, o4);
            this.a = o4;
        } else {
            int o5 = o(i5 + i2);
            int o6 = o(i6 + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - o5, objArr2.length - o6));
                Object[] objArr3 = this.b;
                int i11 = o5 + i2;
                O5378677881740157249.n0(o6, o5, i11, objArr3, objArr3);
                o5 = o(i11);
                o6 = o(o6 + i2);
            }
            int o7 = o(this.c + this.a);
            n(m(o7 - i3), o7);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int o2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int o3 = o(this.c + this.a);
            int i = this.a;
            if (i < o3) {
                o2 = i;
                while (true) {
                    objArr = this.b;
                    if (i >= o3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[o2] = obj;
                        o2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, o2, o3, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                o2 = o(i2);
                for (int i3 = 0; i3 < o3; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[o2] = obj3;
                        o2 = k(o2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.c = m(o2 - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return null;
        }
        int o2 = o(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[o2];
        objArr[o2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int o2 = o(this.c + this.a);
        int i2 = this.a;
        if (i2 < o2) {
            O5378677881740157249.s0(i2, o2, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            O5378677881740157249.n0(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            O5378677881740157249.n0(objArr3.length - this.a, 0, o2, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public N11678082982039175888() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        p();
        i(collection.size() + this.c);
        c(o(this.c + this.a), collection);
        return true;
    }
}
