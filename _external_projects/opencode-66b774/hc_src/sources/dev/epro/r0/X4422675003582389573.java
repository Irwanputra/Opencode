package dev.epro.r0;

import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class X4422675003582389573 {
    public static volatile X4422675003582389573 a;

    static {
        try {
            for (Map.Entry entry : V12265638346635935530.b.entrySet()) {
                String str = (String) entry.getKey();
                V12265638346635935530.a(str);
            }
        } catch (RuntimeException unused) {
            F4537322127226430183.b.getClass();
        } catch (UnsatisfiedLinkError unused2) {
            F4537322127226430183.b.getClass();
        }
        X4422675003582389573 w13501784783056305158 = W13501784783056305158.d ? new W13501784783056305158() : null;
        if (w13501784783056305158 == null) {
            w13501784783056305158 = U14277333103553537283.d ? new U14277333103553537283() : null;
        }
        if (w13501784783056305158 == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        a = w13501784783056305158;
        Logger.getLogger(K5458285210510848811.class.getName());
    }

    public abstract M2066880349381062048 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public Y5942596939223382942 f(SSLException sSLException) {
        return null;
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        Level level = Level.FINE;
        return null;
    }

    public boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void j(int i, String str) {
        if (i == 5) {
            boolean z = U14277333103553537283.d;
        } else {
            boolean z2 = U14277333103553537283.d;
        }
    }

    public void k(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(5, str);
    }

    public SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
