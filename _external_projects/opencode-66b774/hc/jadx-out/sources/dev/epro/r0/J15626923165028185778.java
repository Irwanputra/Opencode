package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J15626923165028185778 {
    public long[] a = X4026756943680612204.a;
    public long[] b = F12915125522169806569.a;
    public int c;
    public int d;
    public int e;

    public J15626923165028185778(int i) {
        if (i >= 0) {
            c(X4026756943680612204.d(i));
        } else {
            S10973172697741180971.j("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15626923165028185778.a(long):boolean");
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, X4026756943680612204.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = X4026756943680612204.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = X4026756943680612204.a(this.c) - this.d;
        this.b = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = b(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r38.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r38.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r29 = 255;
        r27 = r10;
        r33 = 0;
        r35 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r1 = r38.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (java.lang.Long.compare((((long) r38.d) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r1 = r38.a;
        r2 = r38.c;
        r4 = r38.b;
        r5 = (r2 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d0, code lost:
    
        if (r6 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        r29 = r7;
        r7 = r1[r6] & (-9187201950435737472L);
        r1[r6] = (-72340172838076674L) & ((~r7) + (r7 >>> 7));
        r6 = r6 + 1;
        r10 = r10;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        r29 = r7;
        r27 = r10;
        r11 = 7;
        r5 = dev.epro.r0.O5378677881740157249.G0(r1);
        r6 = r5 - 1;
        r9 = 72057594037927935L;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r5] = r1[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
    
        if (r5 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010c, code lost:
    
        r6 = r5 >> 3;
        r14 = (r5 & 7) << 3;
        r7 = (r1[r6] >> r14) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0119, code lost:
    
        if (r7 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        if (r7 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        r7 = java.lang.Long.hashCode(r4[r5]) * r19;
        r7 = r7 ^ (r7 << 16);
        r8 = r7 >>> 7;
        r15 = b(r8);
        r8 = r8 & r2;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0142, code lost:
    
        if ((((r15 - r8) & r2) / 8) != (((r5 - r8) & r2) / 8)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0144, code lost:
    
        r33 = r12;
        r1[r6] = (((long) (r7 & 127)) << r14) | (r1[r6] & (~(r29 << r14)));
        r1[r1.length - r13] = (r1[r33] & r31) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r11;
        r9 = r31;
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0168, code lost:
    
        r18 = r11;
        r33 = r12;
        r8 = r15 >> 3;
        r9 = r1[r8];
        r11 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
    
        if (((r9 >> r11) & r29) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017c, code lost:
    
        r35 = r13;
        r1[r8] = (r9 & (~(r29 << r11))) | (((long) (r7 & 127)) << r11);
        r1[r6] = (r1[r6] & (~(r29 << r14))) | (128 << r14);
        r4[r15] = r4[r5];
        r4[r5] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a1, code lost:
    
        r35 = r13;
        r1[r8] = (((long) (r7 & 127)) << r11) | (r9 & (~(r29 << r11)));
        r6 = r4[r15];
        r4[r15] = r4[r5];
        r4[r5] = r6;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b8, code lost:
    
        r1[r1.length - 1] = (r1[r33] & r31) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r18;
        r9 = r31;
        r12 = r33;
        r13 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cf, code lost:
    
        r33 = r12;
        r35 = r13;
        r38.e = dev.epro.r0.X4026756943680612204.a(r38.c) - r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e2, code lost:
    
        r29 = 255;
        r27 = r10;
        r33 = 0;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ed, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f0, code lost:
    
        r1 = dev.epro.r0.X4026756943680612204.b(r38.c);
        r2 = r38.a;
        r4 = r38.b;
        r5 = r38.c;
        c(r1);
        r1 = r38.a;
        r6 = r38.b;
        r7 = r38.c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0207, code lost:
    
        if (r8 >= r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0216, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0218, code lost:
    
        r9 = r4[r8];
        r11 = java.lang.Long.hashCode(r9) * r19;
        r11 = r11 ^ (r11 << 16);
        r12 = b(r11 >>> 7);
        r13 = r11 & 127;
        r11 = r12 >> 3;
        r15 = (r12 & 7) << 3;
        r23 = r1;
        r22 = r2;
        r1 = (r1[r11] & (~(255 << r15))) | (r13 << r15);
        r23[r11] = r1;
        r23[(((r12 - 7) & r7) + (r7 & 7)) >> 3] = r1;
        r6[r12] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x024e, code lost:
    
        r23 = r1;
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0252, code lost:
    
        r8 = r8 + 1;
        r2 = r22;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0259, code lost:
    
        r1 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025d, code lost:
    
        r16 = r1;
        r38.d++;
        r1 = r38.e;
        r2 = r38.a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
    
        if (((r4 >> r6) & r29) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0279, code lost:
    
        r33 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027b, code lost:
    
        r38.e = r1 - r33;
        r1 = r38.c;
        r4 = (r4 & (~(r29 << r6))) | (r27 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r39) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15626923165028185778.d(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L92
            r10 = -1
        L66:
            if (r10 < 0) goto L91
            int r0 = r14.d
            int r0 = r0 + (-1)
            r14.d = r0
            long[] r0 = r14.a
            int r14 = r14.c
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            r5 = 254(0xfe, double:1.255E-321)
            long r5 = r5 << r2
            long r2 = r3 | r5
            r0[r1] = r2
            int r10 = r10 + (-7)
            r1 = r10 & r14
            r14 = r14 & 7
            int r1 = r1 + r14
            int r14 = r1 >> 3
            r0[r14] = r2
        L91:
            return
        L92:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15626923165028185778.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof dev.epro.r0.J15626923165028185778
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dev.epro.r0.J15626923165028185778 r15 = (dev.epro.r0.J15626923165028185778) r15
            int r1 = r15.d
            int r3 = r14.d
            if (r1 == r3) goto L13
            return r2
        L13:
            long[] r1 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.a(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15626923165028185778.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[PHI: r5
      0x0058: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0021, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            long[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5d
            r3 = 0
            r4 = r3
            r5 = r4
        L13:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L58
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L2d:
            if (r10 >= r8) goto L56
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r13 = -1
            if (r5 != r13) goto L46
            java.lang.String r15 = "..."
            r0.append(r15)
            goto L62
        L46:
            if (r5 == 0) goto L4d
            java.lang.String r13 = ", "
            r0.append(r13)
        L4d:
            r0.append(r11)
            int r5 = r5 + 1
        L52:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L56:
            if (r8 != r9) goto L5d
        L58:
            if (r4 == r2) goto L5d
            int r4 = r4 + 1
            goto L13
        L5d:
            java.lang.String r15 = "]"
            r0.append(r15)
        L62:
            java.lang.String r15 = r0.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J15626923165028185778.toString():java.lang.String");
    }
}
