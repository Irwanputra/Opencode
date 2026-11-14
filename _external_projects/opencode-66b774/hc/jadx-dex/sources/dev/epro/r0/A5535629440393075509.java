package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A5535629440393075509 implements java.util.Collection, dev.epro.r0.D14639766352081121636 {
    public static final dev.epro.r0.A5535629440393075509 c = new dev.epro.r0.A5535629440393075509(dev.epro.r0.O2161699089510411363.a);
    public final java.util.List a;
    public final int b;

    public A5535629440393075509(java.util.List list) {
        this.a = list;
        this.b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
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
        if (!(obj instanceof dev.epro.r0.L6737218101458117862)) {
            return false;
        }
        return this.a.contains((dev.epro.r0.L6737218101458117862) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.A5535629440393075509) {
            return this.a.equals(((dev.epro.r0.A5535629440393075509) obj).a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
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
    public final boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return dev.epro.r0.D15445857918358799638.e0(this);
    }

    public final java.lang.String toString() {
        return "LocaleList(localeList=" + this.a + ")";
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return dev.epro.r0.D15445857918358799638.f0(this, objArr);
    }
}
