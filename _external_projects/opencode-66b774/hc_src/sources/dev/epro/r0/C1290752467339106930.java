package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class C1290752467339106930 {
    public static final J7406921379779620091 a = new J7406921379779620091();
    public static final U12539945048130217525 b;

    static {
        Integer num = V3851083512923939985.a;
        b = (num == null || num.intValue() >= 34) ? new I14333812743650240278() : new X16389606429011467707();
    }

    public int a(int i) {
        return b.a(i);
    }

    public void b(int i, byte[] bArr, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            StringBuilder p = E12098517352909843120.p(i, i2, "fromIndex (", ") or toIndex (", ") are out of range: 0..");
            p.append(bArr.length);
            p.append('.');
            throw new IllegalArgumentException(p.toString().toString());
        }
        if (i > i2) {
            S10973172697741180971.i(G11450220448113054352.h(i, i2, "fromIndex (", ") must be not greater than toIndex (", ")."));
            return;
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int f = f();
            bArr[i] = (byte) f;
            bArr[i + 1] = (byte) (f >>> 8);
            bArr[i + 2] = (byte) (f >>> 16);
            bArr[i + 3] = (byte) (f >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int a2 = a(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (a2 >>> (i6 * 8));
        }
    }

    public double c() {
        return b.c();
    }

    public double d() {
        return e();
    }

    public double e() {
        double c;
        if (!Double.isInfinite(1.0d) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(1.0d) > Double.MAX_VALUE) {
            c = 0.0d + (c() * 1.0d);
        } else {
            double c2 = c() * 0.5d;
            c = 0.0d + c2 + c2;
        }
        return c >= 1.0d ? Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY) : c;
    }

    public int f() {
        return b.f();
    }

    public int g(int i) {
        int f;
        int i2;
        if (i <= 0) {
            S10973172697741180971.i(Q9282725956684299602.e(0, Integer.valueOf(i)));
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                f = f() >>> 1;
                i2 = f % i;
            } while ((i - 1) + (f - i2) < 0);
            return i2;
        }
        while (true) {
            int f2 = f();
            if (f2 >= 0 && f2 < i) {
                return f2;
            }
        }
    }

    public long h() {
        return b.h();
    }

    public long i(long j, long j2) {
        long h;
        long j3;
        long j4;
        int f;
        if (j2 <= j) {
            S10973172697741180971.i(Q9282725956684299602.e(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    f = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    f = f();
                } else {
                    j4 = (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (f() & 4294967295L);
                }
                j4 = f & 4294967295L;
            } else {
                do {
                    h = h() >>> 1;
                    j3 = h % j5;
                } while ((j5 - 1) + (h - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long h2 = h();
            if (j <= h2 && h2 < j2) {
                return h2;
            }
        }
    }
}
