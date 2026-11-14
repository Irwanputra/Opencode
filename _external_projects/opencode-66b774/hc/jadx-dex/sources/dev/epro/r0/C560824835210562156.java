package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class C560824835210562156 implements java.util.Map, dev.epro.r0.D14639766352081121636 {
    public static final dev.epro.r0.C560824835210562156 c = new dev.epro.r0.C560824835210562156(dev.epro.r0.B14108412273878533248.e, 0);
    public final dev.epro.r0.B14108412273878533248 a;
    public final int b;

    public C560824835210562156(dev.epro.r0.B14108412273878533248 b14108412273878533248, int i) {
        this.a = b14108412273878533248;
        this.b = i;
    }

    public final dev.epro.r0.C560824835210562156 a(java.lang.Object obj, dev.epro.r0.H6096100481828783755 h6096100481828783755) {
        dev.epro.r0.Q6203700555324584864 q6203700555324584864U = this.a.u(obj != null ? obj.hashCode() : 0, 0, obj, h6096100481828783755);
        return q6203700555324584864U == null ? this : new dev.epro.r0.C560824835210562156((dev.epro.r0.B14108412273878533248) q6203700555324584864U.b, this.b + (q6203700555324584864U.a ? 1 : 0));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (dev.epro.r0.S10823041268949770285.t(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return new dev.epro.r0.G16268979140738020860(this, (byte) 0);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this.b != map.size()) {
            return false;
        }
        java.util.Set<java.util.Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (java.util.Map.Entry entry : setEntrySet) {
            if (entry != null) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Object obj2 = get(key);
                if (dev.epro.r0.S10823041268949770285.t(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
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
    public final java.util.Set keySet() {
        return new dev.epro.r0.G16268979140738020860(this, (byte) 1);
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
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.b;
    }

    public final java.lang.String toString() {
        return dev.epro.r0.R9411874267597469228.J0(entrySet(), ", ", "{", "}", 0, new dev.epro.r0.A6662317080022852970(this, (byte) 1), 24);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return new dev.epro.r0.C8145984272139078584(this, (byte) 1);
    }
}
