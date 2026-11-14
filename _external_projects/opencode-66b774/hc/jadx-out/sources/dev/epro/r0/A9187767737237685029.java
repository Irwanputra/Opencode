package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class A9187767737237685029 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new O1656706300835000069(bArr, 0, 0, false).j(0);
        } catch (A9458650138667563085 e) {
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
