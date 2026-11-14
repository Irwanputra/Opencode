package dev.epro.r0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C5203614693743173659 implements Map, D14639766352081121636 {
    public final A4559761392562572984 a;
    public M14345366659885436266 b;
    public M14345366659885436266 c;
    public R4355002902395871978 d;

    public C5203614693743173659(A4559761392562572984 a4559761392562572984) {
        this.a = a4559761392562572984;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        M14345366659885436266 m14345366659885436266 = this.b;
        if (m14345366659885436266 != null) {
            return m14345366659885436266;
        }
        M14345366659885436266 m143453666598854362662 = new M14345366659885436266(this.a, (byte) 0);
        this.b = m143453666598854362662;
        return m143453666598854362662;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5203614693743173659.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C5203614693743173659) obj).a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
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
    public final Set keySet() {
        M14345366659885436266 m14345366659885436266 = this.c;
        if (m14345366659885436266 != null) {
            return m14345366659885436266;
        }
        M14345366659885436266 m143453666598854362662 = new M14345366659885436266(this.a, (byte) 1);
        this.c = m143453666598854362662;
        return m143453666598854362662;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.e;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        R4355002902395871978 r4355002902395871978 = this.d;
        if (r4355002902395871978 != null) {
            return r4355002902395871978;
        }
        R4355002902395871978 r43550029023958719782 = new R4355002902395871978(this.a);
        this.d = r43550029023958719782;
        return r43550029023958719782;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
