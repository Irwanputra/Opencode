package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C10101319439186475078 {
    public static final dev.epro.r0.C10101319439186475078 f = new dev.epro.r0.C10101319439186475078(0, new int[0], new java.lang.Object[0], false);
    public int a;
    public int[] b;
    public java.lang.Object[] c;
    public int d = -1;
    public boolean e;

    public C10101319439186475078(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static dev.epro.r0.C10101319439186475078 c() {
        return new dev.epro.r0.C10101319439186475078(0, new int[8], new java.lang.Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = java.util.Arrays.copyOf(iArr, i);
            this.c = java.util.Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iE;
        int iG;
        int iE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((java.lang.Long) this.c[i3]).getClass();
                    iE2 = dev.epro.r0.A5011514514014580540.e(i5) + 8;
                } else if (i6 == 2) {
                    iE2 = dev.epro.r0.A5011514514014580540.a(i5, (dev.epro.r0.N17666688112968464504) this.c[i3]);
                } else if (i6 == 3) {
                    iE = dev.epro.r0.A5011514514014580540.e(i5) * 2;
                    iG = ((dev.epro.r0.C10101319439186475078) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new java.lang.IllegalStateException((java.lang.Throwable) dev.epro.r0.N11355818201711573941.b());
                    }
                    ((java.lang.Integer) this.c[i3]).getClass();
                    iE2 = dev.epro.r0.A5011514514014580540.e(i5) + 4;
                }
                i2 = iE2 + i2;
            } else {
                long jLongValue = ((java.lang.Long) this.c[i3]).longValue();
                iE = dev.epro.r0.A5011514514014580540.e(i5);
                iG = dev.epro.r0.A5011514514014580540.g(jLongValue);
            }
            i2 = iG + iE + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, java.lang.Object obj) {
        if (!this.e) {
            dev.epro.r0.Z3383101362411723454.t();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.I8626815837691735180 */
    public final void e(dev.epro.r0.H12843822278061842084 h12843822278061842084) throws dev.epro.r0.I8626815837691735180 {
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            java.lang.Object obj = this.c[i];
            dev.epro.r0.A5011514514014580540 a5011514514014580540 = (dev.epro.r0.A5011514514014580540) h12843822278061842084.b;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                a5011514514014580540.w(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 1) {
                a5011514514014580540.n(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 2) {
                a5011514514014580540.k(i3, (dev.epro.r0.N17666688112968464504) obj);
            } else if (i4 == 3) {
                a5011514514014580540.t(i3, 3);
                ((dev.epro.r0.C10101319439186475078) obj).e(h12843822278061842084);
                a5011514514014580540.t(i3, 4);
            } else {
                if (i4 != 5) {
                    dev.epro.r0.Q11088980322693754445.k(dev.epro.r0.N11355818201711573941.b());
                    return;
                }
                a5011514514014580540.l(i3, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dev.epro.r0.C10101319439186475078)) {
            return false;
        }
        dev.epro.r0.C10101319439186475078 c10101319439186475078 = (dev.epro.r0.C10101319439186475078) obj;
        int i = this.a;
        if (i == c10101319439186475078.a) {
            int[] iArr = this.b;
            int[] iArr2 = c10101319439186475078.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.c;
                    java.lang.Object[] objArr2 = c10101319439186475078.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
