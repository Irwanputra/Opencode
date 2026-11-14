package dev.epro.r0;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K1186241071261229227 implements Iterable {
    public D11758182151919292105 a;
    public D11758182151919292105 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((dev.epro.r0.L16174742707221671437) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof dev.epro.r0.K1186241071261229227
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dev.epro.r0.K1186241071261229227 r6 = (dev.epro.r0.K1186241071261229227) r6
            int r1 = r5.d
            int r3 = r6.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            dev.epro.r0.L16174742707221671437 r1 = (dev.epro.r0.L16174742707221671437) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            dev.epro.r0.L16174742707221671437 r3 = (dev.epro.r0.L16174742707221671437) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            dev.epro.r0.L16174742707221671437 r6 = (dev.epro.r0.L16174742707221671437) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K1186241071261229227.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            L16174742707221671437 l16174742707221671437 = (L16174742707221671437) it;
            if (!l16174742707221671437.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) l16174742707221671437.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        D11758182151919292105 d11758182151919292105 = this.a;
        D11758182151919292105 d117581821519192921052 = this.b;
        L16174742707221671437 l16174742707221671437 = new L16174742707221671437();
        l16174742707221671437.a = d117581821519192921052;
        l16174742707221671437.b = d11758182151919292105;
        this.c.put(l16174742707221671437, Boolean.FALSE);
        return l16174742707221671437;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            L16174742707221671437 l16174742707221671437 = (L16174742707221671437) it;
            if (!l16174742707221671437.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) l16174742707221671437.next()).toString());
            if (l16174742707221671437.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
