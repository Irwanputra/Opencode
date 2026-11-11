package p010.p011.p012.p013;

import java.util.Locale;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0749 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f4862;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f4863;

    public C0749(String str, int i) {
        this.f4862 = i;
        this.f4863 = str;
    }

    public C0749(String str, String str2) {
        this.f4863 = str;
        this.f4862 = m2024(str2);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static long m2023(String str) {
        return (Long.parseLong(str.split("\\.")[0]) << 24) + 0 + (Integer.parseInt(r4[1]) << 16) + (Integer.parseInt(r4[2]) << 8) + Integer.parseInt(r4[3]);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m2024(String str) {
        long m2023 = m2023(str) + 4294967296L;
        int i = 0;
        while ((1 & m2023) == 0) {
            i++;
            m2023 >>= 1;
        }
        if (m2023 != (8589934591 >> i)) {
            return 32;
        }
        return 32 - i;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, Crypt.a(Crypt.xrc("IghK7hI6m@c=NfoLbiLkkKjg\u0019cj\u001ec>L4")), this.f4863, Integer.valueOf(this.f4862));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m2025() {
        long m2023 = m2023(this.f4863);
        long j = (4294967295 << (32 - this.f4862)) & m2023;
        if (j == m2023) {
            return false;
        }
        this.f4863 = String.format(Locale.US, Crypt.a(Crypt.xrc("\u001dk<Acj\u001d69N0i\u001c4<N1f\u001ec<O4h\u0019gi@d9\u001d1")), Long.valueOf(((-16777216) & j) >> 24), Long.valueOf((16711680 & j) >> 16), Long.valueOf((65280 & j) >> 8), Long.valueOf(j & 255));
        return true;
    }
}
