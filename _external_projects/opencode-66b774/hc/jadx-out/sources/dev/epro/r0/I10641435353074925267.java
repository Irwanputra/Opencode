package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class I10641435353074925267 {
    public static final I10641435353074925267 a;

    static {
        int iHjlnkcnemnci;
        izmyclvb.dpqpjfpoanwt1(pd.d1);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iHjlnkcnemnci = hjlnkcnemnci(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHjlnkcnemnci != 0) {
                switch (iHjlnkcnemnci) {
                    case 1:
                        a = (I10641435353074925267) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native boolean a(URL url, int i, String str, String str2, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482);

    public static native boolean b(URL url, int i, String str, Z11244019023321623390 z11244019023321623390, String str2, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482);

    public static native void c(Set set);

    public static native SSLSocket d(Socket socket, String str, int i);

    public static native Object e(I10641435353074925267 i10641435353074925267, String str, int i, Z11244019023321623390 z11244019023321623390, B2138252231653711516 b2138252231653711516, I12007476123594936550 i12007476123594936550, K14749510448791472029 k14749510448791472029, int i2);

    public static native Socket f(URL url, int i, F4096073349764486348 f4096073349764486348);

    public static native Socket g(URL url, int i, Z11244019023321623390 z11244019023321623390, F4096073349764486348 f4096073349764486348);

    public static native int h(Socket socket);

    private static native int hjlnkcnemnci(Object[] objArr);

    public static native Integer i(long j);

    public static native int j(URL url);

    public static native void k(OutputStream outputStream, URL url, String str, String str2);

    private native void wuiwmtxfpgsb();

    public static final class Z11244019023321623390 {
        public final String a;
        public final int b;

        static {
            izmyclvb.dpqpjfpoanwt1(1579);
        }

        private native void pypgtrckftca(String str, int i);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, int i) {
            str.getClass();
            pypgtrckftca(str, i);
        }
    }

    private I10641435353074925267() {
        wuiwmtxfpgsb();
    }
}
