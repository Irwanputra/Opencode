package dev.epro.r0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O16849885747999394079 extends K10678596132709730734 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final K10678596132709730734 c;
    public final Object d;

    public O16849885747999394079(D11845360118227771236 d11845360118227771236, O16849885747999394079 o16849885747999394079, O16849885747999394079 o168498857479993940792, H4563649114871566866 h4563649114871566866) {
        this.b = o16849885747999394079;
        this.c = o168498857479993940792;
        this.d = h4563649114871566866;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        switch (this.a) {
            case 0:
                int iH = d13396727227989475489.H();
                if (iH == 9) {
                    d13396727227989475489.D();
                    return null;
                }
                Map map = (Map) ((H4563649114871566866) this.d).c();
                if (iH == 1) {
                    d13396727227989475489.b();
                    while (d13396727227989475489.p()) {
                        d13396727227989475489.b();
                        Object objB = ((O16849885747999394079) this.b).c.b(d13396727227989475489);
                        if (map.put(objB, ((O16849885747999394079) this.c).c.b(d13396727227989475489)) != null) {
                            throw new X13554947934760653097("duplicate key: " + objB);
                        }
                        d13396727227989475489.g();
                    }
                    d13396727227989475489.g();
                } else {
                    d13396727227989475489.c();
                    while (d13396727227989475489.p()) {
                        M10846389789027735899.b.getClass();
                        int iE = d13396727227989475489.g;
                        if (iE == 0) {
                            iE = d13396727227989475489.e();
                        }
                        if (iE == 13) {
                            d13396727227989475489.g = 9;
                        } else if (iE == 12) {
                            d13396727227989475489.g = 8;
                        } else {
                            if (iE != 14) {
                                throw d13396727227989475489.Q("a name");
                            }
                            d13396727227989475489.g = 10;
                        }
                        Object objB2 = ((O16849885747999394079) this.b).c.b(d13396727227989475489);
                        if (map.put(objB2, ((O16849885747999394079) this.c).c.b(d13396727227989475489)) != null) {
                            throw new X13554947934760653097("duplicate key: " + objB2);
                        }
                    }
                    d13396727227989475489.h();
                }
                return map;
            default:
                return this.c.b(d13396727227989475489);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // dev.epro.r0.K10678596132709730734
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.Y14132333989764804283 r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r3 = this;
            byte r0 = r3.a
            dev.epro.r0.K10678596132709730734 r1 = r3.c
            switch(r0) {
                case 0: goto L4a;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r5 == 0) goto L1a
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 != 0) goto L15
            boolean r2 = r0 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1a
        L15:
            java.lang.Class r2 = r5.getClass()
            goto L1b
        L1a:
            r2 = r0
        L1b:
            if (r2 == r0) goto L46
            java.lang.Object r3 = r3.b
            dev.epro.r0.F14240031463097426304 r3 = (dev.epro.r0.F14240031463097426304) r3
            dev.epro.r0.K11898134656129953686 r0 = new dev.epro.r0.K11898134656129953686
            r0.<init>(r2)
            dev.epro.r0.K10678596132709730734 r3 = r3.c(r0)
            boolean r0 = r3 instanceof dev.epro.r0.H12922621320026152513
            if (r0 != 0) goto L2f
            goto L45
        L2f:
            r0 = r1
        L30:
            boolean r2 = r0 instanceof dev.epro.r0.S3338576511881427402
            if (r2 == 0) goto L40
            r2 = r0
            dev.epro.r0.S3338576511881427402 r2 = (dev.epro.r0.S3338576511881427402) r2
            dev.epro.r0.K10678596132709730734 r2 = r2.d()
            if (r2 != r0) goto L3e
            goto L40
        L3e:
            r0 = r2
            goto L30
        L40:
            boolean r0 = r0 instanceof dev.epro.r0.H12922621320026152513
            if (r0 != 0) goto L45
            goto L46
        L45:
            r1 = r3
        L46:
            r1.c(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            dev.epro.r0.O16849885747999394079 r1 = (dev.epro.r0.O16849885747999394079) r1
            if (r5 != 0) goto L54
            r4.p()
            goto L81
        L54:
            r4.d()
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L5f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.j(r0)
            java.lang.Object r5 = r5.getValue()
            r1.c(r4, r5)
            goto L5f
        L7e:
            r4.h()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O16849885747999394079.c(dev.epro.r0.Y14132333989764804283, java.lang.Object):void");
    }

    public O16849885747999394079(F14240031463097426304 f14240031463097426304, K10678596132709730734 k10678596132709730734, Type type) {
        this.b = f14240031463097426304;
        this.c = k10678596132709730734;
        this.d = type;
    }
}
