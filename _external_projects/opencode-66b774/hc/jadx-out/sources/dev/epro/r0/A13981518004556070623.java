package dev.epro.r0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A13981518004556070623 implements Map, Serializable {
    public static final A13981518004556070623 g = new A13981518004556070623(0, null, new Object[0]);
    public transient B18372450834991815898 a;
    public transient L2699665550100775762 b;
    public transient E15660526696589003737 c;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public A13981518004556070623(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static N12245111110189169079 a(int i) {
        U15853425786981391261.y(i, "expectedSize");
        return new N12245111110189169079(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.A13981518004556070623 b(int r19, java.lang.Object[] r20, dev.epro.r0.N12245111110189169079 r21) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A13981518004556070623.b(int, java.lang.Object[], dev.epro.r0.N12245111110189169079):dev.epro.r0.A13981518004556070623");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final F12738319475220657879 entrySet() {
        B18372450834991815898 b18372450834991815898 = this.a;
        if (b18372450834991815898 != null) {
            return b18372450834991815898;
        }
        B18372450834991815898 b183724508349918158982 = new B18372450834991815898(this, this.e, this.f);
        this.a = b183724508349918158982;
        return b183724508349918158982;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        E15660526696589003737 e15660526696589003737 = this.c;
        if (e15660526696589003737 == null) {
            e15660526696589003737 = new E15660526696589003737(this.e, 1, this.f);
            this.c = e15660526696589003737;
        }
        return e15660526696589003737.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L6
        L3:
            r7 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r7.e
            int r2 = r7.f
            r3 = 1
            if (r2 != r3) goto L20
            r7 = 0
            r7 = r1[r7]
            java.util.Objects.requireNonNull(r7)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3
            r7 = r1[r3]
            java.util.Objects.requireNonNull(r7)
            goto L9c
        L20:
            java.lang.Object r7 = r7.d
            if (r7 != 0) goto L25
            goto L3
        L25:
            boolean r2 = r7 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r7
            byte[] r2 = (byte[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = dev.epro.r0.U16229988784104357932.Q(r7)
        L37:
            r7 = r7 & r4
            r5 = r2[r7]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            if (r5 != r6) goto L40
            goto L3
        L40:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L4d
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L4d:
            int r7 = r7 + 1
            goto L37
        L50:
            boolean r2 = r7 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r7
            short[] r2 = (short[]) r2
            int r7 = r2.length
            int r4 = r7 + (-1)
            int r7 = r8.hashCode()
            int r7 = dev.epro.r0.U16229988784104357932.Q(r7)
        L62:
            r7 = r7 & r4
            short r5 = r2[r7]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L6c
            goto L3
        L6c:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L79
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L79:
            int r7 = r7 + 1
            goto L62
        L7c:
            int[] r7 = (int[]) r7
            int r2 = r7.length
            int r2 = r2 - r3
            int r4 = r8.hashCode()
            int r4 = dev.epro.r0.U16229988784104357932.Q(r4)
        L88:
            r4 = r4 & r2
            r5 = r7[r4]
            r6 = -1
            if (r5 != r6) goto L90
            goto L3
        L90:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La0
            r7 = r5 ^ 1
            r7 = r1[r7]
        L9c:
            if (r7 != 0) goto L9f
            return r0
        L9f:
            return r7
        La0:
            int r4 = r4 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A13981518004556070623.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        L2699665550100775762 l2699665550100775762 = this.b;
        if (l2699665550100775762 != null) {
            return l2699665550100775762;
        }
        L2699665550100775762 l26996655501007757622 = new L2699665550100775762(this, new E15660526696589003737(this.e, 0, this.f));
        this.b = l26996655501007757622;
        return l26996655501007757622;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public final String toString() {
        int i = this.f;
        U15853425786981391261.y(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        U1864172318023436692 it = ((B18372450834991815898) entrySet()).iterator();
        boolean z = true;
        while (true) {
            Z2226534976664502299 z2226534976664502299 = (Z2226534976664502299) it;
            if (!z2226534976664502299.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) z2226534976664502299.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        E15660526696589003737 e15660526696589003737 = this.c;
        if (e15660526696589003737 != null) {
            return e15660526696589003737;
        }
        E15660526696589003737 e156605266965890037372 = new E15660526696589003737(this.e, 1, this.f);
        this.c = e156605266965890037372;
        return e156605266965890037372;
    }
}
