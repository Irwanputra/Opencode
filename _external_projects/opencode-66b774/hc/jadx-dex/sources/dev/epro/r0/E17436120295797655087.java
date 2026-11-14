package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17436120295797655087 extends java.util.AbstractMap {
    public static final /* synthetic */ int f = 0;
    public java.util.List a;
    public java.util.Map b;
    public boolean c;
    public volatile dev.epro.r0.I8586442731552441025 d;
    public java.util.Map e;

    public static dev.epro.r0.E17436120295797655087 f() {
        dev.epro.r0.E17436120295797655087 e17436120295797655087 = new dev.epro.r0.E17436120295797655087();
        e17436120295797655087.a = java.util.Collections.EMPTY_LIST;
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        e17436120295797655087.b = map;
        e17436120295797655087.e = map;
        return e17436120295797655087;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.a
            java.lang.Object r2 = r2.get(r1)
            dev.epro.r0.R10649547914803008705 r2 = (dev.epro.r0.R10649547914803008705) r2
            java.lang.Comparable r2 = r2.a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r4 = -r0
            return r4
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.a
            java.lang.Object r3 = r3.get(r2)
            dev.epro.r0.R10649547914803008705 r3 = (dev.epro.r0.R10649547914803008705) r3
            java.lang.Comparable r3 = r3.a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17436120295797655087.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.c) {
            dev.epro.r0.Z3383101362411723454.t();
        }
    }

    public final java.util.Map.Entry c(int i) {
        return (java.util.Map.Entry) this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final java.util.Set d() {
        return this.b.isEmpty() ? java.util.Collections.EMPTY_SET : this.b.entrySet();
    }

    public final java.util.SortedMap e() {
        b();
        if (this.b.isEmpty() && !(this.b instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.d == null) {
            this.d = new dev.epro.r0.I8586442731552441025(this, (byte) 2);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E17436120295797655087)) {
            return super.equals(obj);
        }
        dev.epro.r0.E17436120295797655087 e17436120295797655087 = (dev.epro.r0.E17436120295797655087) obj;
        int size = size();
        if (size == e17436120295797655087.size()) {
            int size2 = this.a.size();
            if (size2 != e17436120295797655087.a.size()) {
                return ((java.util.AbstractSet) entrySet()).equals(e17436120295797655087.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(e17436120295797655087.c(i))) {
                }
            }
            if (size2 != size) {
                return this.b.equals(e17436120295797655087.b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((dev.epro.r0.R10649547914803008705) this.a.get(iA)).setValue(obj);
        }
        b();
        if (this.a.isEmpty() && !(this.a instanceof java.util.ArrayList)) {
            this.a = new java.util.ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            dev.epro.r0.R10649547914803008705 r10649547914803008705 = (dev.epro.r0.R10649547914803008705) this.a.remove(15);
            e().put(r10649547914803008705.a, r10649547914803008705.b);
        }
        this.a.add(i, new dev.epro.r0.R10649547914803008705(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((dev.epro.r0.R10649547914803008705) this.a.get(iA)).b : this.b.get(comparable);
    }

    public final java.lang.Object h(int i) {
        b();
        java.lang.Object obj = ((dev.epro.r0.R10649547914803008705) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            java.util.Iterator it = e().entrySet().iterator();
            java.util.List list = this.a;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new dev.epro.r0.R10649547914803008705(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((dev.epro.r0.R10649547914803008705) this.a.get(i)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.a.size();
    }
}
