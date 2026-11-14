package dev.epro.r0;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Z12670897225348479586 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static boolean a(S790996689653940400 s790996689653940400) {
        for (int i = 0; i < s790996689653940400.b.size(); i++) {
            Y8831258500803408458 e = s790996689653940400.e(i);
            if (e.e && e.c == D14731132657808549702.R) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length >= bArr.length) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
