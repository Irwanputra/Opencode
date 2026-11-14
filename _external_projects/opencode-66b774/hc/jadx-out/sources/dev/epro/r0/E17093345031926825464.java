package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E17093345031926825464 implements Comparable {
    public static final E17149812035295265804 b = new E17149812035295265804(9);
    public static final long c = M9216324016624295870.y(4611686018427387903L);
    public static final long d = M9216324016624295870.y(-4611686018427387903L);
    public final long a;

    public /* synthetic */ E17093345031926825464(long j) {
        this.a = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jN = M9216324016624295870.n(j, j3);
        if (-4611686018426L > jN || jN >= 4611686018427L) {
            return M9216324016624295870.y(jN);
        }
        return M9216324016624295870.A((jN * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strF0 = M8927913404651150384.f0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strF0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strF0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strF0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strF0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return S10823041268949770285.A(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? k(j, N13798149404328803870.MILLISECONDS) : j >> 1;
    }

    public static final boolean f(long j) {
        return j == c || j == d;
    }

    public static final long g(long j, long j2) {
        return h(j, m(j2));
    }

    public static final long h(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? M9216324016624295870.y(j3 / 1000000) : M9216324016624295870.A(j3);
        }
        long jN = M9216324016624295870.n(j >> 1, j2 >> 1);
        if (jN != 9223372036854759646L) {
            return (jN == 4611686018427387903L || jN == -4611686018427387903L) ? M9216324016624295870.y(jN) : M9216324016624295870.z(jN);
        }
        S10973172697741180971.j("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        return dev.epro.r0.E17093345031926825464.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        return dev.epro.r0.E17093345031926825464.d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17093345031926825464.i(int, long):long");
    }

    public static final long j(long j, double d2) {
        double dW;
        int iY = T18016951143603335921.Y(d2);
        if (iY == d2) {
            return i(iY, j);
        }
        int i = ((int) j) & 1;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        N13798149404328803870 n137981494043288038702 = N13798149404328803870.NANOSECONDS;
        N13798149404328803870 n137981494043288038703 = i == 0 ? n137981494043288038702 : n13798149404328803870;
        if (j == c) {
            dW = Double.POSITIVE_INFINITY;
        } else if (j == d) {
            dW = Double.NEGATIVE_INFINITY;
        } else {
            dW = G16660188620551127941.w(j >> 1, i == 0 ? n137981494043288038702 : n13798149404328803870, n137981494043288038703);
        }
        double d3 = dW * d2;
        double dW2 = G16660188620551127941.w(d3, n137981494043288038703, n137981494043288038702);
        if (Double.isNaN(dW2)) {
            S10973172697741180971.j("Duration value cannot be NaN.");
            return 0L;
        }
        long jA0 = T18016951143603335921.a0(dW2);
        return (-4611686018426999999L > jA0 || jA0 >= 4611686018427000000L) ? M9216324016624295870.z(T18016951143603335921.a0(G16660188620551127941.w(d3, n137981494043288038703, n13798149404328803870))) : M9216324016624295870.A(jA0);
    }

    public static final long k(long j, N13798149404328803870 n13798149404328803870) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return n13798149404328803870.a.convert(j >> 1, ((((int) j) & 1) == 0 ? N13798149404328803870.NANOSECONDS : N13798149404328803870.MILLISECONDS).a);
    }

    public static String l(long j) {
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m(j);
        }
        long jK = k(j, N13798149404328803870.DAYS);
        int iK = f(j) ? 0 : (int) (k(j, N13798149404328803870.HOURS) % 24);
        int iK2 = f(j) ? 0 : (int) (k(j, N13798149404328803870.MINUTES) % 60);
        int iK3 = f(j) ? 0 : (int) (k(j, N13798149404328803870.SECONDS) % 60);
        if (f(j)) {
            i = 0;
        } else {
            i = (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
        }
        boolean z2 = jK != 0;
        boolean z3 = iK != 0;
        boolean z4 = iK2 != 0;
        boolean z5 = (iK3 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(jK);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iK);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iK2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iK3 != 0 || z2 || z3 || z4) {
                b(sb, iK3, i, 9, "s", false);
            } else if (i >= 1000000) {
                b(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                b(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long m(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = Z4849893357590011812.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((E17093345031926825464) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E17093345031926825464) {
            return this.a == ((E17093345031926825464) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return l(this.a);
    }
}
