package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K7217096618580727896 implements List, S3000285732458222736 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ K7217096618580727896(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj2;
                if (i < 0 || i > (i2 = u9803441765912152712.b)) {
                    u9803441765912152712.p(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = u9803441765912152712.a;
                if (objArr.length < i3) {
                    u9803441765912152712.m(i3, objArr);
                }
                Object[] objArr2 = u9803441765912152712.a;
                int i4 = u9803441765912152712.b;
                if (i != i4) {
                    O5378677881740157249.n0(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                u9803441765912152712.b++;
                return;
            default:
                ((D389890677992184566) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                if (i < 0 || i > u9803441765912152712.b) {
                    u9803441765912152712.p(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + u9803441765912152712.b;
                Object[] objArr = u9803441765912152712.a;
                if (objArr.length < size) {
                    u9803441765912152712.m(size, objArr);
                }
                Object[] objArr2 = u9803441765912152712.a;
                if (i != u9803441765912152712.b) {
                    O5378677881740157249.n0(collection.size() + i, i, u9803441765912152712.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                u9803441765912152712.b = collection.size() + u9803441765912152712.b;
                return true;
            default:
                return ((D389890677992184566) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((U9803441765912152712) obj).d();
                break;
            default:
                ((D389890677992184566) obj).i();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((U9803441765912152712) obj2).g(obj) >= 0;
            default:
                return ((D389890677992184566) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (u9803441765912152712.g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                D389890677992184566 d389890677992184566 = (D389890677992184566) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d389890677992184566.j(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                M17189296052689530719.a(i, this);
                return ((U9803441765912152712) obj).f(i);
            default:
                Y16350503129143940616.a(i, this);
                return ((D389890677992184566) obj).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((U9803441765912152712) obj2).g(obj);
            default:
                return ((D389890677992184566) obj2).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((U9803441765912152712) obj).h();
            default:
                return ((D389890677992184566) obj).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new P13985259139345137289(this, 0, (byte) 0);
            default:
                return new P13985259139345137289(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj2;
                Object[] objArr = u9803441765912152712.a;
                int i2 = u9803441765912152712.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                D389890677992184566 d389890677992184566 = (D389890677992184566) obj2;
                Object[] objArr2 = d389890677992184566.a;
                for (int i3 = d389890677992184566.c - 1; i3 >= 0; i3--) {
                    if (S10823041268949770285.t(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new P13985259139345137289(this, 0, (byte) 0);
            default:
                return new P13985259139345137289(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                M17189296052689530719.a(i, this);
                return ((U9803441765912152712) obj).k(i);
            default:
                Y16350503129143940616.a(i, this);
                return ((D389890677992184566) obj).m(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                int i = u9803441765912152712.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    u9803441765912152712.j(it.next());
                }
                if (i == u9803441765912152712.b) {
                    break;
                }
                break;
            default:
                D389890677992184566 d389890677992184566 = (D389890677992184566) obj;
                if (!collection.isEmpty()) {
                    int i2 = d389890677992184566.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        d389890677992184566.l(it2.next());
                    }
                    if (i2 != d389890677992184566.c) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                int i = u9803441765912152712.b;
                Object[] objArr = u9803441765912152712.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        u9803441765912152712.k(i2);
                    }
                }
                if (i != u9803441765912152712.b) {
                    break;
                }
                break;
            default:
                D389890677992184566 d389890677992184566 = (D389890677992184566) obj;
                int i3 = d389890677992184566.c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(d389890677992184566.a[i4])) {
                        d389890677992184566.m(i4);
                    }
                }
                if (i3 != d389890677992184566.c) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                M17189296052689530719.a(i, this);
                return ((U9803441765912152712) obj2).n(i, obj);
            default:
                Y16350503129143940616.a(i, this);
                Object[] objArr = ((D389890677992184566) obj2).a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((U9803441765912152712) obj).b;
            default:
                return ((D389890677992184566) obj).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                M17189296052689530719.b(i, i2, this);
                return new S11139932333544878978(this, i, i2, (byte) 0);
            default:
                Y16350503129143940616.b(i, i2, this);
                return new S11139932333544878978(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                break;
        }
        return D15445857918358799638.f0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return D15445857918358799638.e0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new P13985259139345137289(this, i, (byte) 0);
            default:
                return new P13985259139345137289(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((U9803441765912152712) obj2).j(obj);
            default:
                return ((D389890677992184566) obj2).l(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((U9803441765912152712) obj2).a(obj);
                break;
            default:
                ((D389890677992184566) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                int i = u9803441765912152712.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    u9803441765912152712.a(it.next());
                }
                return i != u9803441765912152712.b;
            default:
                D389890677992184566 d389890677992184566 = (D389890677992184566) obj;
                return d389890677992184566.e(d389890677992184566.c, collection);
        }
    }
}
