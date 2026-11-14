package dev.epro.r0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D14027398382627356533 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final J15730374346044043770 b;
    public volatile int c = 0;

    public D14027398382627356533(J15730374346044043770 j15730374346044043770, int i) {
        this.b = j15730374346044043770;
        this.a = i;
    }

    public final int a(int i) {
        Q5727030208712194095 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final Q5727030208712194095 b() {
        ThreadLocal threadLocal = d;
        Q5727030208712194095 q5727030208712194095 = (Q5727030208712194095) threadLocal.get();
        if (q5727030208712194095 == null) {
            q5727030208712194095 = new Q5727030208712194095();
            threadLocal.set(q5727030208712194095);
        }
        E13661095186259607145 e13661095186259607145 = (E13661095186259607145) this.b.c;
        int a = e13661095186259607145.a(6);
        if (a != 0) {
            int i = a + e13661095186259607145.a;
            int i2 = (this.a * 4) + ((ByteBuffer) e13661095186259607145.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) e13661095186259607145.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) e13661095186259607145.d;
            q5727030208712194095.d = byteBuffer;
            if (byteBuffer != null) {
                q5727030208712194095.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                q5727030208712194095.b = i4;
                q5727030208712194095.c = ((ByteBuffer) q5727030208712194095.d).getShort(i4);
                return q5727030208712194095;
            }
            q5727030208712194095.a = 0;
            q5727030208712194095.b = 0;
            q5727030208712194095.c = 0;
        }
        return q5727030208712194095;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        Q5727030208712194095 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        Q5727030208712194095 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
