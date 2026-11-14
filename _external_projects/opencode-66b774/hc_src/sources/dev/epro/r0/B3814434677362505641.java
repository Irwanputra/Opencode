package dev.epro.r0;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class B3814434677362505641 {
    public static final B3814434677362505641 a;
    public static final SecureRandom b;

    static {
        int trvbrqaxljmh;
        izmyclvb.oeynnivvrnts0(497);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                trvbrqaxljmh = trvbrqaxljmh(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (trvbrqaxljmh != 0) {
                switch (trvbrqaxljmh) {
                    case 1:
                        a = (B3814434677362505641) objArr[1];
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

    public static native byte[] e(int i);

    public static native ArrayList f(String str);

    public static native byte[] g(RSAPublicKey rSAPublicKey, byte[] bArr, String str);

    private native void tntimfzpvksj();

    private static native int trvbrqaxljmh(Object[] objArr);

    private B3814434677362505641() {
        tntimfzpvksj();
    }
}
