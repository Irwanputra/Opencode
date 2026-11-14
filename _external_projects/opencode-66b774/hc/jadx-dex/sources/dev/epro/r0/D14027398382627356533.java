package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D14027398382627356533 {
    public static final java.lang.ThreadLocal d = new java.lang.ThreadLocal();
    public final int a;
    public final dev.epro.r0.J15730374346044043770 b;
    public volatile int c = 0;

    public D14027398382627356533(dev.epro.r0.J15730374346044043770 j15730374346044043770, int i) {
        this.b = j15730374346044043770;
        this.a = i;
    }

    public final int a(int i) {
        dev.epro.r0.Q5727030208712194095 q5727030208712194095B = b();
        int iA = q5727030208712194095B.a(16);
        if (iA == 0) {
            return 0;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).d;
        int i2 = iA + ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final dev.epro.r0.Q5727030208712194095 b() {
        java.lang.ThreadLocal threadLocal = d;
        dev.epro.r0.Q5727030208712194095 q5727030208712194095 = (dev.epro.r0.Q5727030208712194095) threadLocal.get();
        if (q5727030208712194095 == null) {
            q5727030208712194095 = new dev.epro.r0.Q5727030208712194095();
            threadLocal.set(q5727030208712194095);
        }
        dev.epro.r0.E13661095186259607145 e13661095186259607145 = (dev.epro.r0.E13661095186259607145) this.b.c;
        int iA = e13661095186259607145.a(6);
        if (iA != 0) {
            int i = iA + ((dev.epro.r0.H13180098919720300000) e13661095186259607145).a;
            int i2 = (this.a * 4) + ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) e13661095186259607145).d).getInt(i) + i + 4;
            int i3 = ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) e13661095186259607145).d).getInt(i2) + i2;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) e13661095186259607145).d;
            ((dev.epro.r0.H13180098919720300000) q5727030208712194095).d = byteBuffer;
            if (byteBuffer != null) {
                ((dev.epro.r0.H13180098919720300000) q5727030208712194095).a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ((dev.epro.r0.H13180098919720300000) q5727030208712194095).b = i4;
                ((dev.epro.r0.H13180098919720300000) q5727030208712194095).c = ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095).d).getShort(i4);
                return q5727030208712194095;
            }
            ((dev.epro.r0.H13180098919720300000) q5727030208712194095).a = 0;
            ((dev.epro.r0.H13180098919720300000) q5727030208712194095).b = 0;
            ((dev.epro.r0.H13180098919720300000) q5727030208712194095).c = 0;
        }
        return q5727030208712194095;
    }

    public final java.lang.String toString() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        dev.epro.r0.Q5727030208712194095 q5727030208712194095B = b();
        int iA = q5727030208712194095B.a(4);
        sb.append(java.lang.Integer.toHexString(iA != 0 ? ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).d).getInt(iA + ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).a) : 0));
        sb.append(", codepoints:");
        dev.epro.r0.Q5727030208712194095 q5727030208712194095B2 = b();
        int iA2 = q5727030208712194095B2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + ((dev.epro.r0.H13180098919720300000) q5727030208712194095B2).a;
            i = ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095B2).d).getInt(((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095B2).d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(java.lang.Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
