package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M14345366659885436266 implements Set, D14639766352081121636 {
    public final /* synthetic */ byte a;
    public final A4559761392562572984 b;

    public /* synthetic */ M14345366659885436266(A4559761392562572984 a4559761392562572984, byte b) {
        this.a = b;
        this.b = a4559761392562572984;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        A4559761392562572984 a4559761392562572984 = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return S10823041268949770285.t(a4559761392562572984.g(entry.getKey()), entry.getValue());
            default:
                return a4559761392562572984.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.a;
        A4559761392562572984 a4559761392562572984 = this.b;
        collection.getClass();
        switch (b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!S10823041268949770285.t(a4559761392562572984.g(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!a4559761392562572984.c(it.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.a;
        A4559761392562572984 a4559761392562572984 = this.b;
        switch (b) {
        }
        return a4559761392562572984.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        R4833348786910499294 r4833348786910499294 = null;
        switch (this.a) {
            case 0:
                return U1554499319261669842.q(new W5843991579073555742(this, r4833348786910499294, (byte) 0));
            default:
                return U1554499319261669842.q(new W5843991579073555742(this, r4833348786910499294, (byte) 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        byte b = this.a;
        A4559761392562572984 a4559761392562572984 = this.b;
        switch (b) {
        }
        return a4559761392562572984.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return D15445857918358799638.f0(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return D15445857918358799638.e0(this);
    }
}
