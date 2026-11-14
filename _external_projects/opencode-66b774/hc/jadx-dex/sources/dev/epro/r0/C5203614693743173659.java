package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C5203614693743173659 implements java.util.Map, dev.epro.r0.D14639766352081121636 {
    public final dev.epro.r0.A4559761392562572984 a;
    public dev.epro.r0.M14345366659885436266 b;
    public dev.epro.r0.M14345366659885436266 c;
    public dev.epro.r0.R4355002902395871978 d;

    public C5203614693743173659(dev.epro.r0.A4559761392562572984 a4559761392562572984) {
        this.a = a4559761392562572984;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.a.d(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        dev.epro.r0.M14345366659885436266 m14345366659885436266 = this.b;
        if (m14345366659885436266 != null) {
            return m14345366659885436266;
        }
        dev.epro.r0.M14345366659885436266 m143453666598854362662 = new dev.epro.r0.M14345366659885436266(this.a, (byte) 0);
        this.b = m143453666598854362662;
        return m143453666598854362662;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.C5203614693743173659.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dev.epro.r0.C5203614693743173659) obj).a);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.i();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        dev.epro.r0.M14345366659885436266 m14345366659885436266 = this.c;
        if (m14345366659885436266 != null) {
            return m14345366659885436266;
        }
        dev.epro.r0.M14345366659885436266 m143453666598854362662 = new dev.epro.r0.M14345366659885436266(this.a, (byte) 1);
        this.c = m143453666598854362662;
        return m143453666598854362662;
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.e;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        dev.epro.r0.R4355002902395871978 r4355002902395871978 = this.d;
        if (r4355002902395871978 != null) {
            return r4355002902395871978;
        }
        dev.epro.r0.R4355002902395871978 r43550029023958719782 = new dev.epro.r0.R4355002902395871978(this.a);
        this.d = r43550029023958719782;
        return r43550029023958719782;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
