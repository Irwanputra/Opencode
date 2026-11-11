package p034.p035.p038;

import android.graphics.Color;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1011 {
    static {
        new ThreadLocal();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m2350(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * Base64.BASELENGTH) * i2)) / (i5 * Base64.BASELENGTH);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m2351(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m2352(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / Base64.BASELENGTH);
        return Color.argb(i3, m2350(Color.red(i), alpha2, Color.red(i2), alpha, i3), m2350(Color.green(i), alpha2, Color.green(i2), alpha, i3), m2350(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }
}
