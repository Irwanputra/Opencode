package dev.epro.r0;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J12926241681621720267 extends M2066880349381062048 {
    public final X509TrustManager W;
    public final X509TrustManagerExtensions X;

    public J12926241681621720267(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.W = x509TrustManager;
        this.X = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J12926241681621720267) && ((J12926241681621720267) obj).W == this.W;
    }

    public final int hashCode() {
        return System.identityHashCode(this.W);
    }

    @Override // dev.epro.r0.M2066880349381062048
    public final List x(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.X.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
