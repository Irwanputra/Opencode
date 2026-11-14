package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9396819467345428326 implements java.util.Collection, dev.epro.r0.D14639766352081121636 {
    public final java.lang.Object[] a;
    public final boolean b;

    public C9396819467345428326(java.lang.Object[] objArr, boolean z) {
        this.a = objArr;
        this.b = z;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return dev.epro.r0.O5378677881740157249.j0(obj, this.a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!dev.epro.r0.O5378677881740157249.j0(it.next(), this.a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dev.epro.r0.Z1085125311131623997(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.a;
        if (this.b && objArr.getClass().equals(java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return dev.epro.r0.D15445857918358799638.f0(this, objArr);
    }
}
