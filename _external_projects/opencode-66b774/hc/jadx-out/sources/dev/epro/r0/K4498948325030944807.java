package dev.epro.r0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K4498948325030944807 implements Collection, Set, S3000285732458222736, D18043721478450045610 {
    public int[] a;
    public Object[] b;
    public int c;

    public K4498948325030944807(int i) {
        this.a = I3887072968740112330.x;
        this.b = I3887072968740112330.z;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iY;
        int i2 = this.c;
        if (obj == null) {
            iY = R7033599853981556291.y(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iY = R7033599853981556291.y(this, obj, iHashCode);
        }
        if (iY >= 0) {
            return false;
        }
        int i3 = ~iY;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                U15384774985926769650.c();
                return false;
            }
            if (iArr2.length != 0) {
                O5378677881740157249.r0(0, iArr.length, 6, iArr, iArr2);
                O5378677881740157249.s0(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            O5378677881740157249.m0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            O5378677881740157249.n0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        U15384774985926769650.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i > 0) {
                O5378677881740157249.r0(0, i, 6, iArr, iArr2);
                O5378677881740157249.s0(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i) {
            U15384774985926769650.c();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                O5378677881740157249.m0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                O5378677881740157249.n0(i, i4, i2, objArr2, objArr2);
            }
            this.b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new Object[i5];
            if (i > 0) {
                O5378677881740157249.r0(0, i, 6, iArr, iArr2);
                O5378677881740157249.s0(0, i, 6, objArr, this.b);
            }
            if (i < i3) {
                int i6 = i + 1;
                O5378677881740157249.m0(i, i6, i2, iArr, this.a);
                O5378677881740157249.n0(i, i6, i2, objArr, this.b);
            }
        }
        if (i2 == this.c) {
            this.c = i3;
            return obj;
        }
        U15384774985926769650.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.c;
        if (i != 0) {
            this.a = I3887072968740112330.x;
            this.b = I3887072968740112330.z;
            i = 0;
            this.c = 0;
        }
        if (i == 0) {
            return;
        }
        U15384774985926769650.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? R7033599853981556291.y(this, null, 0) : R7033599853981556291.y(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new L7502288025406801017(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iY = obj == null ? R7033599853981556291.y(this, null, 0) : R7033599853981556291.y(this, obj, obj.hashCode());
        if (iY < 0) {
            return false;
        }
        b(iY);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!R9411874267597469228.v0(collection, this.b[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        O5378677881740157249.n0(0, 0, this.c, this.b, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return O5378677881740157249.v0(this.b, 0, this.c);
    }
}
