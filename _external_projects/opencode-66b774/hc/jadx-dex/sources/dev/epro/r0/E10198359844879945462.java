package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10198359844879945462 implements dev.epro.r0.S2460821117650695638, java.lang.Iterable, dev.epro.r0.D14639766352081121636 {
    public final dev.epro.r0.A4559761392562572984 a;
    public dev.epro.r0.C5203614693743173659 b;
    public boolean c;
    public boolean d;

    public E10198359844879945462() {
        long[] jArr = dev.epro.r0.X4026756943680612204.a;
        this.a = new dev.epro.r0.A4559761392562572984();
    }

    public final void a(dev.epro.r0.P14992748401341948828 p14992748401341948828, java.lang.Object obj) {
        boolean z = obj instanceof dev.epro.r0.R17587901753867651123;
        dev.epro.r0.A4559761392562572984 a4559761392562572984 = this.a;
        if (z && a4559761392562572984.c(p14992748401341948828)) {
            java.lang.Object objG = a4559761392562572984.g(p14992748401341948828);
            objG.getClass();
            dev.epro.r0.R17587901753867651123 r17587901753867651123 = (dev.epro.r0.R17587901753867651123) objG;
            dev.epro.r0.R17587901753867651123 r175879017538676511232 = (dev.epro.r0.R17587901753867651123) obj;
            java.lang.String str = r175879017538676511232.a;
            if (str == null) {
                str = r17587901753867651123.a;
            }
            dev.epro.r0.S8977162183056139880 s8977162183056139880 = r175879017538676511232.b;
            if (s8977162183056139880 == null) {
                s8977162183056139880 = r17587901753867651123.b;
            }
            a4559761392562572984.n(p14992748401341948828, new dev.epro.r0.R17587901753867651123(str, s8977162183056139880));
        } else {
            a4559761392562572984.n(p14992748401341948828, obj);
        }
        p14992748401341948828.getClass();
    }

    public final java.lang.Object b(dev.epro.r0.P14992748401341948828 p14992748401341948828) {
        java.lang.Object objG = this.a.g(p14992748401341948828);
        if (objG != null) {
            return objG;
        }
        dev.epro.r0.Q11088980322693754445.j("Key not present: ", p14992748401341948828, " - consider getOrElse or getOrNull");
        return null;
    }

    public final void c(dev.epro.r0.E10198359844879945462 e10198359844879945462) {
        dev.epro.r0.A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        java.lang.Object[] objArr = a4559761392562572984.b;
        java.lang.Object[] objArr2 = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        java.lang.Object obj2 = objArr2[i4];
                        dev.epro.r0.P14992748401341948828 p14992748401341948828 = (dev.epro.r0.P14992748401341948828) obj;
                        dev.epro.r0.A4559761392562572984 a45597613925625729842 = this.a;
                        java.lang.Object objG = a45597613925625729842.g(p14992748401341948828);
                        p14992748401341948828.getClass();
                        java.lang.Object objInvoke = p14992748401341948828.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            a45597613925625729842.n(p14992748401341948828, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E10198359844879945462)) {
            return false;
        }
        dev.epro.r0.E10198359844879945462 e10198359844879945462 = (dev.epro.r0.E10198359844879945462) obj;
        return this.a.equals(e10198359844879945462.a) && this.c == e10198359844879945462.c && this.d == e10198359844879945462.d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.d) + dev.epro.r0.G6547577305291411977.i(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        dev.epro.r0.C5203614693743173659 c5203614693743173659 = this.b;
        if (c5203614693743173659 == null) {
            c5203614693743173659 = new dev.epro.r0.C5203614693743173659(this.a);
            this.b = c5203614693743173659;
        }
        return c5203614693743173659.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            dev.epro.r0.A4559761392562572984 r4 = r0.a
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            dev.epro.r0.P14992748401341948828 r8 = (dev.epro.r0.P14992748401341948828) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.String r0 = dev.epro.r0.O5354877807466160604.a0(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E10198359844879945462.toString():java.lang.String");
    }
}
