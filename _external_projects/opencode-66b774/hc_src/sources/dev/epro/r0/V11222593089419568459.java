package dev.epro.r0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class V11222593089419568459 {
    public static final V11222593089419568459 a;
    public static final byte[] b;

    static {
        int hubjnoziicfh;
        izmyclvb.qgayjvbiagej2(820);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                hubjnoziicfh = hubjnoziicfh(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (hubjnoziicfh != 0) {
                switch (hubjnoziicfh) {
                    case 1:
                        a = (V11222593089419568459) objArr[1];
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

    public static native List a(byte[] bArr);

    public static native ByteBuffer b(ByteBuffer byteBuffer, int i);

    private static native int hubjnoziicfh(Object[] objArr);

    private native void ttvpleykpvjl();

    private V11222593089419568459() {
        ttvpleykpvjl();
    }
}
