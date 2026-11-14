package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D7201182503133677242 implements java.lang.Iterable, dev.epro.r0.D14639766352081121636 {
    public static final dev.epro.r0.D7201182503133677242 e = new dev.epro.r0.D7201182503133677242(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public D7201182503133677242(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final dev.epro.r0.D7201182503133677242 a(dev.epro.r0.D7201182503133677242 d7201182503133677242) {
        long[] jArr;
        dev.epro.r0.D7201182503133677242 d7201182503133677242B = this;
        dev.epro.r0.D7201182503133677242 d72011825031336772422 = e;
        if (d7201182503133677242 == d72011825031336772422) {
            return d7201182503133677242B;
        }
        if (d7201182503133677242B == d72011825031336772422) {
            return d72011825031336772422;
        }
        long j = d7201182503133677242.c;
        long j2 = d7201182503133677242.c;
        long[] jArr2 = d7201182503133677242.d;
        long j3 = d7201182503133677242.b;
        long j4 = d7201182503133677242.a;
        long j5 = d7201182503133677242B.c;
        if (j == j5 && jArr2 == (jArr = d7201182503133677242B.d)) {
            return new dev.epro.r0.D7201182503133677242(d7201182503133677242B.a & (~j4), d7201182503133677242B.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                d7201182503133677242B = d7201182503133677242B.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    d7201182503133677242B = d7201182503133677242B.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    d7201182503133677242B = d7201182503133677242B.b(((long) i2) + j2 + 64);
                }
            }
        }
        return d7201182503133677242B;
    }

    public final dev.epro.r0.D7201182503133677242 b(long j) {
        long[] jArr;
        int iK;
        long[] jArr2;
        long j2 = j - this.c;
        if (dev.epro.r0.S10823041268949770285.A(j2, 0L) >= 0 && dev.epro.r0.S10823041268949770285.A(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new dev.epro.r0.D7201182503133677242(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (dev.epro.r0.S10823041268949770285.A(j2, 64L) >= 0 && dev.epro.r0.S10823041268949770285.A(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new dev.epro.r0.D7201182503133677242(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (dev.epro.r0.S10823041268949770285.A(j2, 0L) < 0 && (jArr = this.d) != null && (iK = dev.epro.r0.Y14426093132713118191.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iK > 0) {
                    dev.epro.r0.O5378677881740157249.q0(jArr, jArr3, 0, 0, iK);
                }
                if (iK < i) {
                    dev.epro.r0.O5378677881740157249.q0(jArr, jArr3, iK, iK + 1, length);
                }
                jArr2 = jArr3;
            }
            return new dev.epro.r0.D7201182503133677242(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (dev.epro.r0.S10823041268949770285.A(j2, 0L) < 0 || dev.epro.r0.S10823041268949770285.A(j2, 64L) >= 0) ? (dev.epro.r0.S10823041268949770285.A(j2, 64L) < 0 || dev.epro.r0.S10823041268949770285.A(j2, 128L) >= 0) ? dev.epro.r0.S10823041268949770285.A(j2, 0L) <= 0 && (jArr = this.d) != null && dev.epro.r0.Y14426093132713118191.k(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final dev.epro.r0.D7201182503133677242 i(dev.epro.r0.D7201182503133677242 d7201182503133677242) {
        dev.epro.r0.D7201182503133677242 d7201182503133677242J;
        long[] jArr;
        dev.epro.r0.D7201182503133677242 d7201182503133677242J2 = this;
        dev.epro.r0.D7201182503133677242 d72011825031336772422 = e;
        if (d7201182503133677242 == d72011825031336772422) {
            return d7201182503133677242J2;
        }
        if (d7201182503133677242J2 == d72011825031336772422) {
            return d7201182503133677242;
        }
        long j = d7201182503133677242.c;
        long j2 = d7201182503133677242.c;
        long[] jArr2 = d7201182503133677242.d;
        long j3 = d7201182503133677242.b;
        long j4 = d7201182503133677242.a;
        long j5 = d7201182503133677242J2.c;
        long j6 = d7201182503133677242J2.b;
        long j7 = d7201182503133677242J2.a;
        if (j == j5 && jArr2 == (jArr = d7201182503133677242J2.d)) {
            return new dev.epro.r0.D7201182503133677242(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = d7201182503133677242J2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    d7201182503133677242J2 = d7201182503133677242J2.j(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        d7201182503133677242J2 = d7201182503133677242J2.j(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        d7201182503133677242J2 = d7201182503133677242J2.j(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return d7201182503133677242J2;
        }
        if (jArr3 != null) {
            d7201182503133677242J = d7201182503133677242;
            for (long j9 : jArr3) {
                d7201182503133677242J = d7201182503133677242J.j(j9);
            }
        } else {
            d7201182503133677242J = d7201182503133677242;
        }
        long j10 = d7201182503133677242J2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    d7201182503133677242J = d7201182503133677242J.j(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    d7201182503133677242J = d7201182503133677242J.j(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return d7201182503133677242J;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return dev.epro.r0.U1554499319261669842.q(new dev.epro.r0.O8813908168807160714(this, (dev.epro.r0.R4833348786910499294) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.D7201182503133677242 j(long r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D7201182503133677242.j(long):dev.epro.r0.D7201182503133677242");
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
