package dev.epro.r0;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U14277333103553537283 extends X4422675003582389573 implements G12005847563586305646 {
    public static final boolean d;
    public Context b;
    public final ArrayList c;

    static {
        d = Build.VERSION.SDK_INT < 29;
    }

    public U14277333103553537283() {
        H16277646803407295041 h16277646803407295041;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            h16277646803407295041 = new H16277646803407295041(cls);
        } catch (Exception unused) {
            CopyOnWriteArraySet copyOnWriteArraySet = V12265638346635935530.a;
            String name = K5458285210510848811.class.getName();
            if (((String) V12265638346635935530.b.get(name)) == null) {
                M8927913404651150384.B0(23, name);
            }
            h16277646803407295041 = null;
        }
        int i = 0;
        ArrayList arrayListB0 = O5378677881740157249.B0(new W17944177835232834043[]{h16277646803407295041, new D3724400017864063475(V6488306180078902881.e), new D3724400017864063475(T3734674749879861389.a), new D3724400017864063475(W8058067029478696854.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListB0.size();
        while (i < size) {
            Object obj = arrayListB0.get(i);
            i++;
            if (((W17944177835232834043) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // dev.epro.r0.G12005847563586305646
    public final void a(Context context) {
        this.b = context;
    }

    @Override // dev.epro.r0.G12005847563586305646
    public final Context b() {
        return this.b;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final M2066880349381062048 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Q2044931172011159037 g4819971007006730851;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        J12926241681621720267 j12926241681621720267 = x509TrustManagerExtensions != null ? new J12926241681621720267(x509TrustManager, x509TrustManagerExtensions) : null;
        if (j12926241681621720267 != null) {
            return j12926241681621720267;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            g4819971007006730851 = new T11069850353986752712(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            g4819971007006730851 = new G4819971007006730851((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new K3446433118769489612(g4819971007006730851);
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final void d(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((W17944177835232834043) obj).b(sSLSocket)) {
                break;
            }
        }
        W17944177835232834043 w17944177835232834043 = (W17944177835232834043) obj;
        if (w17944177835232834043 != null) {
            w17944177835232834043.c(sSLSocket, str, list, p5124777957357031757);
        }
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            Z3383101362411723454.q("Exception in connect", e);
        }
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((W17944177835232834043) obj).b(sSLSocket)) {
                break;
            }
        }
        W17944177835232834043 w17944177835232834043 = (W17944177835232834043) obj;
        if (w17944177835232834043 != null) {
            return w17944177835232834043.a(sSLSocket);
        }
        return null;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final SSLContext l() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    @Override // dev.epro.r0.X4422675003582389573
    public final void j(int i, String str) {
    }
}
