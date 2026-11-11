package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jasypt.digest.StandardStringDigester;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffz {
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static ByteBuffer zzphu;
    private static zzffb zzphv;
    public static final Charset UTF_8 = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);
    private static Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        zzphu = ByteBuffer.wrap(bArr);
        zzphv = zzffb.zzbb(bArr);
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static <T> T zzc(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int zzde(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzdg(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zzh(zzfhe zzfheVar) {
        return false;
    }
}
