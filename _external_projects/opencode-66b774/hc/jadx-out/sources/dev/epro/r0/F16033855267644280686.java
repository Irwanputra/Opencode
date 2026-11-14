package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class F16033855267644280686 {
    public static final O1657317982372758125 f;
    public static final byte[] g;
    public static final F16033855267644280686 h;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final A10016694258797505845 d;
    public final int e;

    static {
        A10016694258797505845 a10016694258797505845 = A10016694258797505845.a;
        f = new O1657317982372758125(false, false, -1, a10016694258797505845);
        g = new byte[]{13, 10};
        h = new F16033855267644280686(true, false, -1, a10016694258797505845);
        new F16033855267644280686(false, true, 76, a10016694258797505845);
        new F16033855267644280686(false, true, 64, a10016694258797505845);
    }

    public F16033855267644280686(boolean z, boolean z2, int i, A10016694258797505845 a10016694258797505845) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = a10016694258797505845;
        if (z && z2) {
            S10973172697741180971.j("Failed requirement.");
            throw null;
        }
        this.e = i / 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(dev.epro.r0.F16033855267644280686 r21, java.lang.CharSequence r22) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F16033855267644280686.a(dev.epro.r0.F16033855267644280686, java.lang.CharSequence):byte[]");
    }

    public static String b(F16033855267644280686 f16033855267644280686, byte[] bArr) {
        int i;
        int length = bArr.length;
        f16033855267644280686.getClass();
        A10016694258797505845 a10016694258797505845 = f16033855267644280686.d;
        bArr.getClass();
        C9869900372345142877.q(0, length, bArr.length);
        int iC = f16033855267644280686.c(length);
        byte[] bArr2 = new byte[iC];
        C9869900372345142877.q(0, length, bArr.length);
        int iC2 = f16033855267644280686.c(length);
        if (iC < 0) {
            W4415201450379021245.a(G6547577305291411977.n(iC, "destination offset: 0, destination size: "));
            return null;
        }
        if (iC2 < 0 || iC2 > iC) {
            W4415201450379021245.a(E12098517352909843120.l("The destination array does not have enough capacity, destination offset: 0, destination size: ", iC, iC2, ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = f16033855267644280686.a ? C17663784384705554951.c : C17663784384705554951.a;
        int i2 = f16033855267644280686.b ? f16033855267644280686.e : Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = g;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        A10016694258797505845 a100166942587975058452 = A10016694258797505845.c;
        A10016694258797505845 a100166942587975058453 = A10016694258797505845.a;
        if (i12 == 1) {
            int i13 = i3 + 1;
            int i14 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i14 >>> 6];
            int i15 = i4 + 2;
            bArr2[i4 + 1] = bArr3[i14 & 63];
            if (a10016694258797505845 == a100166942587975058453 || a10016694258797505845 == a100166942587975058452) {
                bArr2[i15] = 61;
                bArr2[i4 + 3] = 61;
            }
            i3 = i13;
        } else if (i12 == 2) {
            int i16 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i16 >>> 12];
            int i17 = i4 + 2;
            bArr2[i4 + 1] = bArr3[(i16 >>> 6) & 63];
            int i18 = i4 + 3;
            bArr2[i17] = bArr3[i16 & 63];
            if (a10016694258797505845 == a100166942587975058453 || a10016694258797505845 == a100166942587975058452) {
                bArr2[i18] = 61;
            }
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, F16059529287866721367.e);
        }
        S10973172697741180971.m("Check failed.");
        return null;
    }

    public final int c(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int iF = i2 * 4;
        if (i3 != 0) {
            A10016694258797505845 a10016694258797505845 = A10016694258797505845.a;
            A10016694258797505845 a100166942587975058452 = this.d;
            if (a100166942587975058452 != a10016694258797505845 && a100166942587975058452 != A10016694258797505845.c) {
                i4 = i3 + 1;
            }
            iF += i4;
        }
        if (iF < 0) {
            S10973172697741180971.j("Input is too big");
            return 0;
        }
        if (this.b) {
            iF = E12098517352909843120.f(iF - 1, this.c, 2, iF);
        }
        if (iF >= 0) {
            return iF;
        }
        S10973172697741180971.j("Input is too big");
        return 0;
    }
}
