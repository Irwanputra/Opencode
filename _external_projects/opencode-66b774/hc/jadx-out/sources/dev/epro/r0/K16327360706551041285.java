package dev.epro.r0;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K16327360706551041285 implements X509TrustManager {
    public final /* synthetic */ W2922985310300051110 a;

    static {
        izmyclvb.dpqpjfpoanwt1(462);
    }

    private native void bnwltooxdpro(W2922985310300051110 w2922985310300051110);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native X509Certificate[] getAcceptedIssuers();

    public K16327360706551041285(W2922985310300051110 w2922985310300051110) {
        this.a = w2922985310300051110;
        bnwltooxdpro(w2922985310300051110);
    }
}
