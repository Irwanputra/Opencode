package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q9839587184380308437 {
    public final int a;
    public final int b;
    public final String c;
    public final List d;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q9839587184380308437(java.util.ArrayList r2, int r3, int r4) {
        /*
            r1 = this;
            r1.<init>()
            r1.a = r3
            r1.b = r4
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L21
            r3 = 0
            java.lang.Object r3 = r2.get(r3)
            dev.epro.r0.V17780983785905150922 r3 = (dev.epro.r0.V17780983785905150922) r3
            java.lang.String r4 = "Name"
            java.lang.String r0 = r3.a
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L21
            java.lang.String r3 = r3.b
            goto L22
        L21:
            r3 = 0
        L22:
            r1.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q9839587184380308437.<init>(java.util.ArrayList, int, int):void");
    }

    public final String a(String str) {
        for (V17780983785905150922 v17780983785905150922 : this.d) {
            if (v17780983785905150922.a.equalsIgnoreCase(str)) {
                return v17780983785905150922.b;
            }
        }
        return null;
    }
}
