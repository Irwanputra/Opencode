package dev.epro.r0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D16915965609090523564 {
    public final LinkedHashMap a;
    public final G11863310382797045262 b;

    public D16915965609090523564(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new G11863310382797045262(z);
    }

    public final Map a() {
        H9390398899829886498 h9390398899829886498;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int u0 = E4951175994894594588.u0(Z115818233709597990.k0(entrySet, 10));
        if (u0 < 16) {
            u0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                h9390398899829886498 = new H9390398899829886498(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                h9390398899829886498 = new H9390398899829886498(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(h9390398899829886498.a, h9390398899829886498.b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (this.b.a.get()) {
            S10973172697741180971.m("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(Y7640345168064557081 y7640345168064557081) {
        y7640345168064557081.getClass();
        Object obj = this.a.get(y7640345168064557081);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(Y7640345168064557081 y7640345168064557081, Object obj) {
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(y7640345168064557081);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(R9411874267597469228.h1((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(y7640345168064557081, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(y7640345168064557081, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(y7640345168064557081, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof dev.epro.r0.D16915965609090523564
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            dev.epro.r0.D16915965609090523564 r6 = (dev.epro.r0.D16915965609090523564) r6
            java.util.LinkedHashMap r6 = r6.a
            java.util.LinkedHashMap r5 = r5.a
            r0 = 1
            if (r6 != r5) goto L10
            goto L61
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            goto L60
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            goto L61
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = dev.epro.r0.S10823041268949770285.t(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D16915965609090523564.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return R9411874267597469228.J0(this.a.entrySet(), ",\n", "{\n", "\n}", 0, new P16607035664026122700((byte) 17), 24);
    }

    public /* synthetic */ D16915965609090523564(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
