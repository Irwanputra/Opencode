package dev.epro.r0;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class P6947448571008303701 {
    public static final P6947448571008303701 a;
    public static final SecureRandom b;

    static {
        int iLqkwcnvkiwfb;
        izmyclvb.qgayjvbiagej2(1925);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iLqkwcnvkiwfb = lqkwcnvkiwfb(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iLqkwcnvkiwfb != 0) {
                switch (iLqkwcnvkiwfb) {
                    case 1:
                        a = (P6947448571008303701) objArr[1];
                        continue;
                    case 2:
                        b = (SecureRandom) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native byte[] b(int i, String str);

    public static native byte[] c(byte[] bArr);

    public static native String d(byte[] bArr);

    public static native byte[] e(String str, String str2, String str3, long j, byte[] bArr);

    public static native byte[] f(int i);

    public static native ArrayList g();

    public static native byte[] h(RSAPublicKey rSAPublicKey, byte[] bArr);

    private static native int lqkwcnvkiwfb(Object[] objArr);

    private native void ygjttnplzpvh();

    private P6947448571008303701() {
        ygjttnplzpvh();
    }
}
