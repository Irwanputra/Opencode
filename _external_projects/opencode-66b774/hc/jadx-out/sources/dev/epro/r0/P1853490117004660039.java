package dev.epro.r0;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P1853490117004660039 {
    public static final G6653507854629384154 a = new G6653507854629384154(0);

    public static boolean a(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static K15572083692188606544 b(String str) throws IOException {
        try {
            D13396727227989475489 d13396727227989475489 = new D13396727227989475489(new StringReader(str));
            d13396727227989475489.f194o = 2;
            return a.b(d13396727227989475489);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }
}
