package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class C560824835210562156 implements Map, D14639766352081121636 {
    public static final C560824835210562156 c = new C560824835210562156(B14108412273878533248.e, 0);
    public final B14108412273878533248 a;
    public final int b;

    public C560824835210562156(B14108412273878533248 b14108412273878533248, int i) {
        this.a = b14108412273878533248;
        this.b = i;
    }

    public final C560824835210562156 a(Object obj, H6096100481828783755 h6096100481828783755) {
        Q6203700555324584864 q6203700555324584864U = this.a.u(obj != null ? obj.hashCode() : 0, 0, obj, h6096100481828783755);
        return q6203700555324584864U == null ? this : new C560824835210562156((B14108412273878533248) q6203700555324584864U.b, this.b + (q6203700555324584864U.a ? 1 : 0));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (S10823041268949770285.t(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new G16268979140738020860(this, (byte) 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.b != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (S10823041268949770285.t(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new G16268979140738020860(this, (byte) 1);
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.b;
    }

    public final String toString() {
        return R9411874267597469228.J0(entrySet(), ", ", "{", "}", 0, new A6662317080022852970(this, (byte) 1), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C8145984272139078584(this, (byte) 1);
    }
}
