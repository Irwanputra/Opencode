package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C1290752467339106930 {
    public static final dev.epro.r0.J7406921379779620091 a = new dev.epro.r0.J7406921379779620091();
    public static final dev.epro.r0.U12539945048130217525 b;

    static {
        java.lang.Integer num = dev.epro.r0.V3851083512923939985.a;
        b = (num == null || num.intValue() >= 34) ? new dev.epro.r0.I14333812743650240278() : new dev.epro.r0.X16389606429011467707();
    }

    public int a(int i) {
        return b.a(i);
    }

    public void b(int i, byte[] bArr, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i, i2, "fromIndex (", ") or toIndex (", ") are out of range: 0..");
            sbP.append(bArr.length);
            sbP.append('.');
            throw new java.lang.IllegalArgumentException(sbP.toString().toString());
        }
        if (i > i2) {
            dev.epro.r0.S10973172697741180971.i(dev.epro.r0.G11450220448113054352.h(i, i2, "fromIndex (", ") must be not greater than toIndex (", ")."));
            return;
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int iF = f();
            bArr[i] = (byte) iF;
            bArr[i + 1] = (byte) (iF >>> 8);
            bArr[i + 2] = (byte) (iF >>> 16);
            bArr[i + 3] = (byte) (iF >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int iA = a(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (iA >>> (i6 * 8));
        }
    }

    public double c() {
        return b.c();
    }

    public double d() {
        return e();
    }

    public double e() {
        double dC;
        if (!java.lang.Double.isInfinite(1.0d) || java.lang.Math.abs(0.0d) > Double.MAX_VALUE || java.lang.Math.abs(1.0d) > Double.MAX_VALUE) {
            dC = 0.0d + (c() * 1.0d);
        } else {
            double dC2 = c() * 0.5d;
            dC = 0.0d + dC2 + dC2;
        }
        return dC >= 1.0d ? java.lang.Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY) : dC;
    }

    public int f() {
        return b.f();
    }

    public int g(int i) {
        int iF;
        int i2;
        if (i <= 0) {
            dev.epro.r0.S10973172697741180971.i(dev.epro.r0.Q9282725956684299602.e(0, java.lang.Integer.valueOf(i)));
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - java.lang.Integer.numberOfLeadingZeros(i));
            }
            do {
                iF = f() >>> 1;
                i2 = iF % i;
            } while ((i - 1) + (iF - i2) < 0);
            return i2;
        }
        while (true) {
            int iF2 = f();
            if (iF2 >= 0 && iF2 < i) {
                return iF2;
            }
        }
    }

    public long h() {
        return b.h();
    }

    public long i(long j, long j2) {
        long jH;
        long j3;
        long jA;
        int iF;
        if (j2 <= j) {
            dev.epro.r0.S10973172697741180971.i(dev.epro.r0.Q9282725956684299602.e(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iF = a(31 - java.lang.Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iF = f();
                } else {
                    jA = (((long) a(31 - java.lang.Integer.numberOfLeadingZeros(i2))) << 32) + (((long) f()) & 4294967295L);
                }
                jA = ((long) iF) & 4294967295L;
            } else {
                do {
                    jH = h() >>> 1;
                    j3 = jH % j4;
                } while ((j4 - 1) + (jH - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jH2 = h();
            if (j <= jH2 && jH2 < j2) {
                return jH2;
            }
        }
    }
}
