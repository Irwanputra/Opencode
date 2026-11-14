package dev.epro.r0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H4368712076085988621 implements Map {
    public final A13981518004556070623 a;

    public H4368712076085988621(A13981518004556070623 a13981518004556070623) {
        this.a = a13981518004556070623;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.a.containsKey(((Class) obj).getName());
        }
        S10973172697741180971.j("Key must be a class");
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.a.get(((Class) obj).getName());
        }
        S10973172697741180971.j("Key must be a class");
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.f;
    }

    @Override // java.util.Map
    public final Collection values() {
        A13981518004556070623 a13981518004556070623 = this.a;
        E15660526696589003737 e15660526696589003737 = a13981518004556070623.c;
        if (e15660526696589003737 != null) {
            return e15660526696589003737;
        }
        E15660526696589003737 e156605266965890037372 = new E15660526696589003737(a13981518004556070623.e, 1, a13981518004556070623.f);
        a13981518004556070623.c = e156605266965890037372;
        return e156605266965890037372;
    }
}
