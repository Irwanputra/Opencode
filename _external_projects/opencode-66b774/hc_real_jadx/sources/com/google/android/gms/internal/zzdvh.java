package com.google.android.gms.internal;

import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdvh {
    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    private static long zzc(byte[] bArr, int i, int i2) {
        return (zze(bArr, i) >> i2) & 67108863;
    }

    private static long zze(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static byte[] zzf(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zzc = zzc(bArr, 0, 0) & 67108863;
        int i = 3;
        long zzc2 = zzc(bArr, 3, 2) & 67108611;
        long zzc3 = zzc(bArr, 6, 4) & 67092735;
        long zzc4 = zzc(bArr, 9, 6) & 66076671;
        long zzc5 = zzc(bArr, 12, 8) & 1048575;
        long j = zzc2 * 5;
        long j2 = zzc3 * 5;
        long j3 = zzc4 * 5;
        long j4 = zzc5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long zzc6 = j9 + zzc(bArr3, 0, 0);
            long zzc7 = j5 + zzc(bArr3, i, 2);
            long zzc8 = j6 + zzc(bArr3, 6, 4);
            long zzc9 = j7 + zzc(bArr3, 9, 6);
            long zzc10 = j8 + (zzc(bArr3, 12, 8) | (bArr3[16] << 24));
            long j10 = (zzc10 * j) + (zzc9 * j2) + (zzc8 * j3) + (zzc7 * j4) + (zzc6 * zzc);
            long j11 = (zzc10 * j2) + (zzc9 * j3) + (zzc8 * j4) + (zzc7 * zzc) + (zzc6 * zzc2);
            long j12 = (zzc10 * j3) + (zzc9 * j4) + (zzc8 * zzc) + (zzc7 * zzc2) + (zzc6 * zzc3);
            long j13 = (zzc10 * j4) + (zzc9 * zzc) + (zzc8 * zzc2) + (zzc7 * zzc3) + (zzc6 * zzc4);
            long j14 = zzc9 * zzc2;
            long j15 = zzc10 * zzc;
            long j16 = j11 + (j10 >> 26);
            long j17 = j12 + (j16 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j15 + j14 + (zzc8 * zzc3) + (zzc7 * zzc4) + (zzc6 * zzc5) + (j18 >> 26);
            long j20 = j19 >> 26;
            j8 = j19 & 67108863;
            long j21 = (j20 * 5) + (j10 & 67108863);
            i3 += 16;
            j6 = j17 & 67108863;
            j7 = j18 & 67108863;
            i2 = 17;
            i = 3;
            j9 = j21 & 67108863;
            j5 = (j16 & 67108863) + (j21 >> 26);
        }
        long j22 = j6 + (j5 >> 26);
        long j23 = j22 & 67108863;
        long j24 = j7 + (j22 >> 26);
        long j25 = j24 & 67108863;
        long j26 = j8 + (j24 >> 26);
        long j27 = j26 & 67108863;
        long j28 = ((j26 >> 26) * 5) + j9;
        long j29 = j28 >> 26;
        long j30 = j28 & 67108863;
        long j31 = (j5 & 67108863) + j29;
        long j32 = j30 + 5;
        long j33 = j32 & 67108863;
        long j34 = (j32 >> 26) + j31;
        long j35 = j23 + (j34 >> 26);
        long j36 = j25 + (j35 >> 26);
        long j37 = j36 & 67108863;
        long j38 = (j27 + (j36 >> 26)) - 67108864;
        long j39 = j38 >> 63;
        long j40 = j30 & j39;
        long j41 = j31 & j39;
        long j42 = j23 & j39;
        long j43 = j25 & j39;
        long j44 = j27 & j39;
        long j45 = j39 ^ (-1);
        long j46 = j41 | (j34 & 67108863 & j45);
        long j47 = j42 | (j35 & 67108863 & j45);
        long j48 = j43 | (j37 & j45);
        long j49 = (j40 | (j33 & j45) | (j46 << 26)) & 4294967295L;
        long j50 = ((j46 >> 6) | (j47 << 20)) & 4294967295L;
        long j51 = ((j47 >> 12) | (j48 << 14)) & 4294967295L;
        long j52 = ((j48 >> 18) | ((j44 | (j38 & j45)) << 8)) & 4294967295L;
        long zze = j49 + zze(bArr, 16);
        long zze2 = j50 + zze(bArr, 20) + (zze >> 32);
        long zze3 = j51 + zze(bArr, 24) + (zze2 >> 32);
        long zze4 = (j52 + zze(bArr, 28) + (zze3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, zze & 4294967295L, 0);
        zza(bArr4, zze2 & 4294967295L, 4);
        zza(bArr4, zze3 & 4294967295L, 8);
        zza(bArr4, zze4, 12);
        return bArr4;
    }
}
