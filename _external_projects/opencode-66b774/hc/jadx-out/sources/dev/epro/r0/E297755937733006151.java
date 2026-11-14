package dev.epro.r0;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class E297755937733006151 {
    public static final E297755937733006151 a;

    static {
        int iAfmdhrsegwow;
        izmyclvb.oeynnivvrnts0(172);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iAfmdhrsegwow = afmdhrsegwow(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iAfmdhrsegwow != 0) {
                switch (iAfmdhrsegwow) {
                    case 1:
                        a = (E297755937733006151) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native String a(List list);

    private static native int afmdhrsegwow(Object[] objArr);

    public static native Y3952957706175349126 b(X509Certificate x509Certificate, int i, byte[] bArr, long j);

    public static native S17135094063410587600 c(E297755937733006151 e297755937733006151, List list);

    public static native String d(byte[] bArr);

    private native void rghpquslewdy();

    private E297755937733006151() {
        rghpquslewdy();
    }
}
