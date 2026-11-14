package dev.epro.r0;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E17436120295797655087 extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile I8586442731552441025 d;
    public Map e;

    public static E17436120295797655087 f() {
        E17436120295797655087 e17436120295797655087 = new E17436120295797655087();
        e17436120295797655087.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
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
            Z3383101362411723454.t();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.a.get(i);
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
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Set d() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new I8586442731552441025(this, (byte) 2);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E17436120295797655087)) {
            return super.equals(obj);
        }
        E17436120295797655087 e17436120295797655087 = (E17436120295797655087) obj;
        int size = size();
        if (size == e17436120295797655087.size()) {
            int size2 = this.a.size();
            if (size2 != e17436120295797655087.a.size()) {
                return ((AbstractSet) entrySet()).equals(e17436120295797655087.entrySet());
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
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((R10649547914803008705) this.a.get(iA)).setValue(obj);
        }
        b();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            R10649547914803008705 r10649547914803008705 = (R10649547914803008705) this.a.remove(15);
            e().put(r10649547914803008705.a, r10649547914803008705.b);
        }
        this.a.add(i, new R10649547914803008705(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((R10649547914803008705) this.a.get(iA)).b : this.b.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((R10649547914803008705) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new R10649547914803008705(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((R10649547914803008705) this.a.get(i)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
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
