package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I2828680009210448000 {
    public final A4559761392562572984 a;
    public N12245111110189169079 b;
    public int c;
    public final E13273723708836014930 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public B14741976151982460670 j;

    public I2828680009210448000() {
        long[] jArr = X4026756943680612204.a;
        this.a = new A4559761392562572984();
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        this.d = new E13273723708836014930();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(I6148490667470006645 i6148490667470006645, int i, E8793254571815685242 e8793254571815685242, boolean z) {
        int i2 = 0;
        long jC = i6148490667470006645.c(0);
        long jA = z ? Q2551293802323679034.a(0, i, 1, jC) : Q2551293802323679034.a(i, 0, 2, jC);
        I13087925019311684776[] i13087925019311684776Arr = e8793254571815685242.a;
        int length = i13087925019311684776Arr.length;
        int i3 = 0;
        while (i2 < length) {
            I13087925019311684776 i13087925019311684776 = i13087925019311684776Arr[i2];
            int i4 = i3 + 1;
            if (i13087925019311684776 != null) {
                i13087925019311684776.l = Q2551293802323679034.d(jA, Q2551293802323679034.c(i6148490667470006645.c(i3), jC));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, I6148490667470006645 i6148490667470006645, boolean z) {
        int iE = i6148490667470006645.e();
        int iD = i6148490667470006645.d() + iE;
        int iMax = 0;
        while (iE < iD) {
            int iC = E686369837194379706.C(i6148490667470006645, z) + iArr[iE];
            iArr[iE] = iC;
            iMax = Math.max(iMax, iC);
            iE++;
        }
        return iMax;
    }

    public final I13087925019311684776 a(int i, Object obj) {
        E8793254571815685242 e8793254571815685242 = (E8793254571815685242) this.a.g(obj);
        if (e8793254571815685242 != null) {
            return e8793254571815685242.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            I13087925019311684776 i13087925019311684776 = (I13087925019311684776) arrayList.get(i);
            B9692660393722135472 b9692660393722135472 = i13087925019311684776.f285o;
            if (b9692660393722135472 != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (i13087925019311684776.l >> 32)) + ((int) (b9692660393722135472.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (i13087925019311684776.l & 4294967295L)) + ((int) (b9692660393722135472.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [dev.epro.r0.G8001132634698687269, dev.epro.r0.L856869997670741194] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r3v33, types: [dev.epro.r0.I13087925019311684776[]] */
    /* JADX WARN: Type inference failed for: r6v50, types: [dev.epro.r0.I13087925019311684776[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r53, int r54, int r55, java.util.ArrayList r56, dev.epro.r0.N12245111110189169079 r57, dev.epro.r0.L6855102173777462404 r58, boolean r59, boolean r60, int r61, boolean r62, int r63, int r64, dev.epro.r0.W5797197595347441198 r65, dev.epro.r0.Y17698807562857349923 r66) {
        /*
            Method dump skipped, instruction units count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I2828680009210448000.d(int, int, int, java.util.ArrayList, dev.epro.r0.N12245111110189169079, dev.epro.r0.L6855102173777462404, boolean, boolean, int, boolean, int, int, dev.epro.r0.W5797197595347441198, dev.epro.r0.Y17698807562857349923):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r14 = this;
            dev.epro.r0.A4559761392562572984 r14 = r14.a
            boolean r0 = r14.j()
            if (r0 == 0) goto L5d
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L13:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2d:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            dev.epro.r0.E8793254571815685242 r10 = (dev.epro.r0.E8793254571815685242) r10
            dev.epro.r0.I13087925019311684776[] r10 = r10.a
            int r11 = r10.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r10[r12]
            if (r13 == 0) goto L4c
            r13.c()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2d
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L13
        L5a:
            r14.a()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I2828680009210448000.e():void");
    }

    public final void f(Object obj) {
        E8793254571815685242 e8793254571815685242 = (E8793254571815685242) this.a.l(obj);
        if (e8793254571815685242 != null) {
            for (I13087925019311684776 i13087925019311684776 : e8793254571815685242.a) {
                if (i13087925019311684776 != null) {
                    i13087925019311684776.c();
                }
            }
        }
    }

    public final void g(I6148490667470006645 i6148490667470006645, boolean z) {
        Object objG = this.a.g(i6148490667470006645.getKey());
        objG.getClass();
        I13087925019311684776[] i13087925019311684776Arr = ((E8793254571815685242) objG).a;
        int length = i13087925019311684776Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            I13087925019311684776 i13087925019311684776 = i13087925019311684776Arr[i];
            int i3 = i2 + 1;
            if (i13087925019311684776 != null) {
                long jC = i6148490667470006645.c(i2);
                long j = i13087925019311684776.l;
                if (!Q2551293802323679034.b(j, 9223372034707292159L) && !Q2551293802323679034.b(j, jC)) {
                    long jC2 = Q2551293802323679034.c(jC, j);
                    A10693687560045094360 a10693687560045094360 = i13087925019311684776.e;
                    if (a10693687560045094360 != null) {
                        long jC3 = Q2551293802323679034.c(((Q2551293802323679034) i13087925019311684776.r.getValue()).a, jC2);
                        i13087925019311684776.d(jC3);
                        i13087925019311684776.h.setValue(Boolean.TRUE);
                        i13087925019311684776.g = z;
                        R7033599853981556291.E(i13087925019311684776.a, null, null, new F3485194578516100457(i13087925019311684776, a10693687560045094360, jC3, (R4833348786910499294) null), 3);
                    }
                }
                i13087925019311684776.l = jC;
            }
            i++;
            i2 = i3;
        }
    }
}
