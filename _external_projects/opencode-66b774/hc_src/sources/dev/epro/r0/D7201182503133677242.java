package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D7201182503133677242 implements Iterable, D14639766352081121636 {
    public static final D7201182503133677242 e = new D7201182503133677242(0, 0, 0, null);
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

    public final D7201182503133677242 a(D7201182503133677242 d7201182503133677242) {
        long[] jArr;
        D7201182503133677242 d72011825031336772422 = this;
        D7201182503133677242 d72011825031336772423 = e;
        if (d7201182503133677242 == d72011825031336772423) {
            return d72011825031336772422;
        }
        if (d72011825031336772422 == d72011825031336772423) {
            return d72011825031336772423;
        }
        long j = d7201182503133677242.c;
        long j2 = d7201182503133677242.c;
        long[] jArr2 = d7201182503133677242.d;
        long j3 = d7201182503133677242.b;
        long j4 = d7201182503133677242.a;
        long j5 = d72011825031336772422.c;
        if (j == j5 && jArr2 == (jArr = d72011825031336772422.d)) {
            return new D7201182503133677242(d72011825031336772422.a & (~j4), d72011825031336772422.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                d72011825031336772422 = d72011825031336772422.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    d72011825031336772422 = d72011825031336772422.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    d72011825031336772422 = d72011825031336772422.b(i2 + j2 + 64);
                }
            }
        }
        return d72011825031336772422;
    }

    public final D7201182503133677242 b(long j) {
        long[] jArr;
        int k;
        long[] jArr2;
        long j2 = j - this.c;
        if (S10823041268949770285.A(j2, 0L) >= 0 && S10823041268949770285.A(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new D7201182503133677242(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (S10823041268949770285.A(j2, 64L) >= 0 && S10823041268949770285.A(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new D7201182503133677242(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (S10823041268949770285.A(j2, 0L) < 0 && (jArr = this.d) != null && (k = Y14426093132713118191.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (k > 0) {
                    O5378677881740157249.q0(jArr, jArr3, 0, 0, k);
                }
                if (k < i) {
                    O5378677881740157249.q0(jArr, jArr3, k, k + 1, length);
                }
                jArr2 = jArr3;
            }
            return new D7201182503133677242(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (S10823041268949770285.A(j2, 0L) < 0 || S10823041268949770285.A(j2, 64L) >= 0) ? (S10823041268949770285.A(j2, 64L) < 0 || S10823041268949770285.A(j2, 128L) >= 0) ? S10823041268949770285.A(j2, 0L) <= 0 && (jArr = this.d) != null && Y14426093132713118191.k(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final D7201182503133677242 i(D7201182503133677242 d7201182503133677242) {
        D7201182503133677242 d72011825031336772422;
        long[] jArr;
        D7201182503133677242 d72011825031336772423 = this;
        D7201182503133677242 d72011825031336772424 = e;
        if (d7201182503133677242 == d72011825031336772424) {
            return d72011825031336772423;
        }
        if (d72011825031336772423 == d72011825031336772424) {
            return d7201182503133677242;
        }
        long j = d7201182503133677242.c;
        long j2 = d7201182503133677242.c;
        long[] jArr2 = d7201182503133677242.d;
        long j3 = d7201182503133677242.b;
        long j4 = d7201182503133677242.a;
        long j5 = d72011825031336772423.c;
        long j6 = d72011825031336772423.b;
        long j7 = d72011825031336772423.a;
        if (j == j5 && jArr2 == (jArr = d72011825031336772423.d)) {
            return new D7201182503133677242(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = d72011825031336772423.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    d72011825031336772423 = d72011825031336772423.j(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        d72011825031336772423 = d72011825031336772423.j(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        d72011825031336772423 = d72011825031336772423.j(i + j2 + 64);
                    }
                    i++;
                }
            }
            return d72011825031336772423;
        }
        if (jArr3 != null) {
            d72011825031336772422 = d7201182503133677242;
            for (long j9 : jArr3) {
                d72011825031336772422 = d72011825031336772422.j(j9);
            }
        } else {
            d72011825031336772422 = d7201182503133677242;
        }
        long j10 = d72011825031336772423.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    d72011825031336772422 = d72011825031336772422.j(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    d72011825031336772422 = d72011825031336772422.j(i + j10 + 64);
                }
                i++;
            }
        }
        return d72011825031336772422;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return U1554499319261669842.q(new O8813908168807160714(this, null));
    }

    public final D7201182503133677242 j(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.c;
        long j6 = j - j5;
        long j7 = 0;
        int A = S10823041268949770285.A(j6, 0L);
        long j8 = this.b;
        if (A < 0 || S10823041268949770285.A(j6, 64L) >= 0) {
            int A2 = S10823041268949770285.A(j6, 64L);
            long j9 = this.a;
            int i2 = 64;
            if (A2 < 0 || S10823041268949770285.A(j6, 128L) >= 0) {
                int A3 = S10823041268949770285.A(j6, 128L);
                long[] jArr3 = this.d;
                if (A3 < 0) {
                    if (jArr3 == null) {
                        return new D7201182503133677242(this.a, this.b, this.c, new long[]{j});
                    }
                    int k = Y14426093132713118191.k(jArr3, j);
                    if (k < 0) {
                        int i3 = -(k + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        O5378677881740157249.q0(jArr3, jArr4, 0, 0, i3);
                        O5378677881740157249.q0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new D7201182503133677242(this.a, this.b, this.c, jArr4);
                    }
                } else if (!c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (S10823041268949770285.A(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    M9197813449740923653 m9197813449740923653 = null;
                    while (true) {
                        if (S10823041268949770285.A(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (m9197813449740923653 == null) {
                                m9197813449740923653 = new M9197813449740923653(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((Q5456326841214199073) m9197813449740923653.b).a(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (m9197813449740923653 != null) {
                        Q5456326841214199073 q5456326841214199073 = (Q5456326841214199073) m9197813449740923653.b;
                        int i5 = q5456326841214199073.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = q5456326841214199073.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new D7201182503133677242(j11, j3, j2, jArr).j(j);
                        }
                    }
                    jArr = jArr3;
                    return new D7201182503133677242(j11, j3, j2, jArr).j(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new D7201182503133677242(j9 | j13, this.b, this.c, this.d);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new D7201182503133677242(this.a, j8 | j14, this.c, this.d);
            }
        }
        return this;
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null ? obj2 instanceof CharSequence : true) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return obj + " [" + sb.toString() + "]";
    }
}
