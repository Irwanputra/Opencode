package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C1629617973188005475 {
    public final dev.epro.r0.A4559761392562572984 a;

    public static final void a(dev.epro.r0.A4559761392562572984 a4559761392562572984, java.lang.Object obj, java.lang.Object obj2) {
        int iF = a4559761392562572984.f(obj);
        boolean z = iF < 0;
        java.lang.Object obj3 = z ? null : a4559761392562572984.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof dev.epro.r0.U9803441765912152712) {
                dev.epro.r0.U9803441765912152712 u9803441765912152712 = (dev.epro.r0.U9803441765912152712) obj3;
                u9803441765912152712.a(obj2);
                obj2 = u9803441765912152712;
            } else {
                java.lang.Object[] objArr = dev.epro.r0.M17189296052689530719.a;
                dev.epro.r0.U9803441765912152712 u98034417659121527122 = new dev.epro.r0.U9803441765912152712(2);
                u98034417659121527122.a(obj3);
                u98034417659121527122.a(obj2);
                obj2 = u98034417659121527122;
            }
        }
        if (!z) {
            a4559761392562572984.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        a4559761392562572984.b[i] = obj;
        a4559761392562572984.c[i] = obj2;
    }

    public static final java.lang.Object b(dev.epro.r0.A4559761392562572984 a4559761392562572984, dev.epro.r0.C4085811703908263224 c4085811703908263224) {
        java.lang.Object objG = a4559761392562572984.g(c4085811703908263224);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof dev.epro.r0.U9803441765912152712)) {
            a4559761392562572984.l(c4085811703908263224);
            return objG;
        }
        dev.epro.r0.U9803441765912152712 u9803441765912152712 = (dev.epro.r0.U9803441765912152712) objG;
        if (u9803441765912152712.h()) {
            dev.epro.r0.K2042933864045806308.n("List is empty.");
            return null;
        }
        int i = u9803441765912152712.b - 1;
        java.lang.Object objF = u9803441765912152712.f(i);
        u9803441765912152712.k(i);
        objF.getClass();
        if (u9803441765912152712.h()) {
            a4559761392562572984.l(c4085811703908263224);
        }
        if (u9803441765912152712.b == 1) {
            a4559761392562572984.n(c4085811703908263224, u9803441765912152712.e());
        }
        return objF;
    }

    public static final void c(dev.epro.r0.A4559761392562572984 a4559761392562572984, dev.epro.r0.C4085811703908263224 c4085811703908263224, dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        java.lang.Object objG = a4559761392562572984.g(c4085811703908263224);
        if (objG != null) {
            if (!(objG instanceof dev.epro.r0.U9803441765912152712)) {
                if (((java.lang.Boolean) f4096073349764486348.invoke(objG)).booleanValue()) {
                    a4559761392562572984.l(c4085811703908263224);
                    return;
                }
                return;
            }
            dev.epro.r0.U9803441765912152712 u9803441765912152712 = (dev.epro.r0.U9803441765912152712) objG;
            int i = u9803441765912152712.b;
            java.lang.Object[] objArr = u9803441765912152712.a;
            int i2 = 0;
            dev.epro.r0.P8646985343900033725 p8646985343900033725N = dev.epro.r0.W7808703833045379622.N(0, i);
            int i3 = ((dev.epro.r0.I12982432556619280823) p8646985343900033725N).a;
            int i4 = ((dev.epro.r0.I12982432556619280823) p8646985343900033725N).b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((java.lang.Boolean) f4096073349764486348.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            dev.epro.r0.O5378677881740157249.x0(i - i2, i, (java.lang.Object) null, objArr);
            u9803441765912152712.b -= i2;
            if (u9803441765912152712.h()) {
                a4559761392562572984.l(c4085811703908263224);
            }
            if (u9803441765912152712.b == 1) {
                a4559761392562572984.n(c4085811703908263224, u9803441765912152712.e());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.U9803441765912152712 d(dev.epro.r0.A4559761392562572984 r14) {
        /*
            boolean r0 = r14.i()
            if (r0 == 0) goto Lc
            dev.epro.r0.U9803441765912152712 r14 = dev.epro.r0.M17189296052689530719.b
            r14.getClass()
            return r14
        Lc:
            dev.epro.r0.U9803441765912152712 r0 = new dev.epro.r0.U9803441765912152712
            r0.<init>()
            java.lang.Object[] r1 = r14.c
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof dev.epro.r0.U9803441765912152712
            if (r11 == 0) goto L50
            dev.epro.r0.U9803441765912152712 r10 = (dev.epro.r0.U9803441765912152712) r10
            r0.b(r10)
            goto L56
        L50:
            r10.getClass()
            r0.a(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C1629617973188005475.d(dev.epro.r0.A4559761392562572984):dev.epro.r0.U9803441765912152712");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.C1629617973188005475) {
            return this.a.equals(((dev.epro.r0.C1629617973188005475) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
