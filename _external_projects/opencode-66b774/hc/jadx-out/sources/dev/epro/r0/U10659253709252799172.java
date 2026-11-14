package dev.epro.r0;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class U10659253709252799172 {
    public static final U10659253709252799172 a;

    static {
        int iZnwcefhqonbo;
        izmyclvb.qgayjvbiagej2(2125);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iZnwcefhqonbo = znwcefhqonbo(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZnwcefhqonbo != 0) {
                switch (iZnwcefhqonbo) {
                    case 1:
                        a = (U10659253709252799172) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(DataInputStream dataInputStream, int i, byte[] bArr, long j);

    public static native L1776201576658992480 b(InputStream inputStream, byte[] bArr, X7661261485523370262 x7661261485523370262, M17934926394694525382 m17934926394694525382, U7770669172681767357 u7770669172681767357);

    private native void vkkreaeoozfk();

    private static native int znwcefhqonbo(Object[] objArr);

    private U10659253709252799172() {
        vkkreaeoozfk();
    }
}
