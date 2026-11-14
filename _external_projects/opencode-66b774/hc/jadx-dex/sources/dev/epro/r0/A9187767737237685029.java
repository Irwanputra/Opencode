package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A9187767737237685029 {
    public static final java.nio.charset.Charset a;
    public static final byte[] b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        try {
            new dev.epro.r0.O1656706300835000069(bArr, 0, 0, false).j(0);
        } catch (dev.epro.r0.A9458650138667563085 e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static void a(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            return;
        }
        dev.epro.r0.Z3383101362411723454.k(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
