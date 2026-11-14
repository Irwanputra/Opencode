package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T11069850353986752712 implements Q2044931172011159037 {
    public final X509TrustManager a;
    public final Method b;

    public T11069850353986752712(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // dev.epro.r0.Q2044931172011159037
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.b.invoke(this.a, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            W4415201450379021245.b("unable to get issues and signature", e);
            return null;
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T11069850353986752712)) {
            return false;
        }
        T11069850353986752712 t11069850353986752712 = (T11069850353986752712) obj;
        return this.a.equals(t11069850353986752712.a) && this.b.equals(t11069850353986752712.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
