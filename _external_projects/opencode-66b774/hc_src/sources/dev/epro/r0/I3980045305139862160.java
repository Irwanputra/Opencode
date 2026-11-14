package dev.epro.r0;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I3980045305139862160 implements X509TrustManager {
    public static final I3980045305139862160 a;

    static {
        int bjmyrjljpobx;
        izmyclvb.dpqpjfpoanwt1(2040);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                bjmyrjljpobx = bjmyrjljpobx(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (bjmyrjljpobx != 0) {
                switch (bjmyrjljpobx) {
                    case 1:
                        a = (I3980045305139862160) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int bjmyrjljpobx(Object[] objArr);

    private native void hshncgsiwwnt();

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native X509Certificate[] getAcceptedIssuers();

    private I3980045305139862160() {
        hshncgsiwwnt();
    }
}
