package dev.epro.r0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z4023314114778119473 {
    public static final Z4023314114778119473 b;
    public final HashMap a;

    static {
        Z4023314114778119473 z4023314114778119473 = new Z4023314114778119473(new LinkedHashMap());
        Z860808776098365610.R(z4023314114778119473);
        b = z4023314114778119473;
    }

    public Z4023314114778119473(Z4023314114778119473 z4023314114778119473) {
        z4023314114778119473.getClass();
        this.a = new HashMap(z4023314114778119473.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L5
            goto L66
        L5:
            r1 = 0
            if (r8 == 0) goto L67
            java.lang.Class<dev.epro.r0.Z4023314114778119473> r2 = dev.epro.r0.Z4023314114778119473.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            dev.epro.r0.Z4023314114778119473 r8 = (dev.epro.r0.Z4023314114778119473) r8
            java.util.HashMap r8 = r8.a
            java.util.HashMap r7 = r7.a
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r2, r3)
            if (r3 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L5e
            if (r3 != 0) goto L47
            goto L5e
        L47:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L59
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = dev.epro.r0.O5378677881740157249.l0(r5, r3)
            goto L63
        L59:
            boolean r3 = r4.equals(r3)
            goto L63
        L5e:
            if (r4 != r3) goto L62
            r3 = r0
            goto L63
        L62:
            r3 = r1
        L63:
            if (r3 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z4023314114778119473.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return G6547577305291411977.u(new StringBuilder("Data {"), R9411874267597469228.J0(this.a.entrySet(), null, null, null, 0, new F17594658268783405200((byte) 28), 31), "}");
    }

    public Z4023314114778119473(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
