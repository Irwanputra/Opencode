package dev.epro.r0;

import java.util.Arrays;
import java.util.List;
import javax.crypto.SecretKey;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class N9422779686621825495 {
    public static final N9422779686621825495 a;
    public static final Object b;
    public static volatile SecretKey c;

    static {
        int bgjfevbmzbld;
        izmyclvb.dpqpjfpoanwt1(1365);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                bgjfevbmzbld = bgjfevbmzbld(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (bgjfevbmzbld != 0) {
                switch (bgjfevbmzbld) {
                    case 1:
                        a = (N9422779686621825495) objArr[1];
                        continue;
                    case 2:
                        b = objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native byte[] a(int i, int i2);

    public static native byte[] b(String str);

    private static native int bgjfevbmzbld(Object[] objArr);

    public static native byte[] c(SecretKey secretKey, L11184428892680210186 l11184428892680210186, byte[] bArr);

    public static native byte[] d(SecretKey secretKey, List list);

    public static native String e(String str);

    public static native String f(String str);

    public static native String g(byte[] bArr);

    public static native String h(SecretKey secretKey, byte[] bArr);

    public static native String i(String str);

    public static native boolean k(String str);

    private native void rpxsgtuqxodb();

    public final native SecretKey j();

    private N9422779686621825495() {
        rpxsgtuqxodb();
    }
}
