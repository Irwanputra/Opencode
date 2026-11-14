package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
        long n = M9216324016624295870.n(j, j3);
        if (-4611686018426L > n || n >= 4611686018427L) {
            return M9216324016624295870.y(n);
        }
        return M9216324016624295870.A((n * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String f0 = M8927913404651150384.f0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = f0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (f0.charAt(length) != '0') {
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
                sb.append((CharSequence) f0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) f0, 0, i6);
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
        long n = M9216324016624295870.n(j >> 1, j2 >> 1);
        if (n != 9223372036854759646L) {
            return (n == 4611686018427387903L || n == -4611686018427387903L) ? M9216324016624295870.y(n) : M9216324016624295870.z(n);
        }
        S10973172697741180971.j("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        return dev.epro.r0.E17093345031926825464.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        return dev.epro.r0.E17093345031926825464.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(int r20, long r21) {
        /*
            r0 = r20
            r1 = r21
            boolean r3 = f(r1)
            if (r3 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            return r1
        Lf:
            long r0 = m(r1)
            return r0
        L14:
            java.lang.String r0 = "Multiplying infinite duration by zero yields an undefined result."
            dev.epro.r0.S10973172697741180971.j(r0)
            r0 = 0
            return r0
        L1c:
            r3 = 0
            if (r0 != 0) goto L21
            return r3
        L21:
            r5 = 1
            long r6 = r1 >> r5
            long r8 = (long) r0
            long r10 = r6 * r8
            int r1 = (int) r1
            r1 = r1 & r5
            r12 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r14 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r1 != 0) goto La4
            r1 = -2147483647(0xffffffff80000001, double:NaN)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L4a
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4a
            long r0 = dev.epro.r0.M9216324016624295870.A(r10)
            return r0
        L4a:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r16 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L71
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L6a
            r0 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6a
            long r0 = dev.epro.r0.M9216324016624295870.A(r10)
            return r0
        L6a:
            long r10 = r10 / r16
            long r0 = dev.epro.r0.M9216324016624295870.y(r10)
            return r0
        L71:
            long r1 = r6 / r16
            long r10 = r1 * r16
            long r10 = r6 - r10
            long r18 = r1 * r8
            long r10 = r10 * r8
            long r10 = r10 / r16
            long r10 = r10 + r18
            long r8 = r18 / r8
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L98
            long r1 = r10 ^ r18
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L98
            dev.epro.r0.B1946763318172869485 r0 = new dev.epro.r0.B1946763318172869485
            r0.<init>(r14, r12)
            long r0 = dev.epro.r0.W7808703833045379622.t(r10, r0)
            long r0 = dev.epro.r0.M9216324016624295870.y(r0)
            return r0
        L98:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lc6
            goto Lc3
        La4:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto Lb8
            dev.epro.r0.B1946763318172869485 r0 = new dev.epro.r0.B1946763318172869485
            r0.<init>(r14, r12)
            long r0 = dev.epro.r0.W7808703833045379622.t(r10, r0)
            long r0 = dev.epro.r0.M9216324016624295870.y(r0)
            return r0
        Lb8:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lc6
        Lc3:
            long r0 = dev.epro.r0.E17093345031926825464.c
            return r0
        Lc6:
            long r0 = dev.epro.r0.E17093345031926825464.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17093345031926825464.i(int, long):long");
    }

    public static final long j(long j, double d2) {
        double w;
        int Y = T18016951143603335921.Y(d2);
        if (Y == d2) {
            return i(Y, j);
        }
        int i = ((int) j) & 1;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        N13798149404328803870 n137981494043288038702 = N13798149404328803870.NANOSECONDS;
        N13798149404328803870 n137981494043288038703 = i == 0 ? n137981494043288038702 : n13798149404328803870;
        if (j == c) {
            w = Double.POSITIVE_INFINITY;
        } else if (j == d) {
            w = Double.NEGATIVE_INFINITY;
        } else {
            w = G16660188620551127941.w(j >> 1, i == 0 ? n137981494043288038702 : n13798149404328803870, n137981494043288038703);
        }
        double d3 = w * d2;
        double w2 = G16660188620551127941.w(d3, n137981494043288038703, n137981494043288038702);
        if (Double.isNaN(w2)) {
            S10973172697741180971.j("Duration value cannot be NaN.");
            return 0L;
        }
        long a0 = T18016951143603335921.a0(w2);
        return (-4611686018426999999L > a0 || a0 >= 4611686018427000000L) ? M9216324016624295870.z(T18016951143603335921.a0(G16660188620551127941.w(d3, n137981494043288038703, n13798149404328803870))) : M9216324016624295870.A(a0);
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
        long k = k(j, N13798149404328803870.DAYS);
        int k2 = f(j) ? 0 : (int) (k(j, N13798149404328803870.HOURS) % 24);
        int k3 = f(j) ? 0 : (int) (k(j, N13798149404328803870.MINUTES) % 60);
        int k4 = f(j) ? 0 : (int) (k(j, N13798149404328803870.SECONDS) % 60);
        if (f(j)) {
            i = 0;
        } else {
            i = (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
        }
        boolean z2 = k != 0;
        boolean z3 = k2 != 0;
        boolean z4 = k3 != 0;
        boolean z5 = (k4 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(k);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(k2);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(k3);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (k4 != 0 || z2 || z3 || z4) {
                b(sb, k4, i, 9, "s", false);
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
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
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
