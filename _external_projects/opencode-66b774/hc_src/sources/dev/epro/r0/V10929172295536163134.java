package dev.epro.r0;

import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class V10929172295536163134 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        int hxvhojnxqhpq;
        izmyclvb.qgayjvbiagej2(784);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                hxvhojnxqhpq = hxvhojnxqhpq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (hxvhojnxqhpq != 0) {
                switch (hxvhojnxqhpq) {
                    case 1:
                        a = (byte[]) objArr[1];
                        continue;
                    case 2:
                        b = (byte[]) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native byte[] a(int i, long j);

    public static final native boolean b(byte[] bArr, byte[] bArr2);

    private static native int hxvhojnxqhpq(Object[] objArr);
}
