package dev.epro.r0;

import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class G3897288548436920626 {
    public static final G3897288548436920626 a;
    public static final Z11244019023321623390 b;

    static {
        int dawzhxjfmahi;
        izmyclvb.dpqpjfpoanwt1(684);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                dawzhxjfmahi = dawzhxjfmahi(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (dawzhxjfmahi != 0) {
                switch (dawzhxjfmahi) {
                    case 1:
                        a = (G3897288548436920626) objArr[1];
                        continue;
                    case 2:
                        b = (Z11244019023321623390) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native SSLSocketFactory a(boolean z);

    public static native SSLSocket b(Socket socket, String str, int i, boolean z);

    public static native SSLSocket c(Socket socket, String str, int i, boolean z, String str2, SSLSocketFactory sSLSocketFactory);

    private static native int dawzhxjfmahi(Object[] objArr);

    private native void peplvneqxoun();

    public static final class Z11244019023321623390 implements X509TrustManager {
        static {
            izmyclvb.dpqpjfpoanwt1(643);
        }

        private native void eiesgrqpermb();

        @Override // javax.net.ssl.X509TrustManager
        public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

        @Override // javax.net.ssl.X509TrustManager
        public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

        @Override // javax.net.ssl.X509TrustManager
        public final native X509Certificate[] getAcceptedIssuers();

        public Z11244019023321623390() {
            eiesgrqpermb();
        }
    }

    private G3897288548436920626() {
        peplvneqxoun();
    }
}
