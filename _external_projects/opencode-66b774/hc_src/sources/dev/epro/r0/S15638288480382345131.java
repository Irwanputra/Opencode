package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class S15638288480382345131 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new H17306840337920354701(bArr, 0, 0, false).e(0);
        } catch (N11355818201711573941 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(String str, Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
