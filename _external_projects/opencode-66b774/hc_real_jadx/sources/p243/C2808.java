package p243;

import java.nio.charset.Charset;
import org.jasypt.digest.StandardStringDigester;

/* renamed from: ぺぁあねじ.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2808 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Charset f10476 = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4880(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4881(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
