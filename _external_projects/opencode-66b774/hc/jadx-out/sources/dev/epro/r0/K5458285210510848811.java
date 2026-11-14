package dev.epro.r0;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K5458285210510848811 implements B14747599855215242845 {
    public static final List E = C14766148968941961570.k(new P10544952747155442696[]{P10544952747155442696.HTTP_2, P10544952747155442696.HTTP_1_1});
    public static final List F = C14766148968941961570.k(new I17300838719998789664[]{I17300838719998789664.e, I17300838719998789664.f});
    public final short A;
    public final M9197813449740923653 B;
    public final M10634075818626712574 C;
    public final H12843822278061842084 D;
    public final J15730374346044043770 a;
    public final List b;
    public final List c;
    public final Z3383101362411723454 d;
    public final boolean e;
    public final boolean f;
    public final P2382941533350862833 g;
    public final boolean h;
    public final boolean i;
    public final P2382941533350862833 j;
    public final C1934509054487712083 k;
    public final ProxySelector l;
    public final P2382941533350862833 m;
    public final SocketFactory n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f333o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final F12905216483416502853 t;
    public final M2066880349381062048 u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final char z;

    /* JADX WARN: Type inference failed for: r1v9, types: [int, short] */
    public K5458285210510848811(N11198609108095032895 n11198609108095032895) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory sSLSocketFactory;
        X509TrustManager x509TrustManager;
        M2066880349381062048 m2066880349381062048;
        this.a = n11198609108095032895.a;
        this.b = C14766148968941961570.j(n11198609108095032895.c);
        this.c = C14766148968941961570.j(n11198609108095032895.d);
        this.d = n11198609108095032895.e;
        this.e = n11198609108095032895.f;
        this.f = n11198609108095032895.g;
        this.g = n11198609108095032895.h;
        this.h = n11198609108095032895.i;
        this.i = n11198609108095032895.j;
        this.j = n11198609108095032895.k;
        this.k = n11198609108095032895.l;
        ProxySelector proxySelector = n11198609108095032895.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = B10406853994611364628.a;
        }
        this.l = proxySelector;
        this.m = n11198609108095032895.n;
        this.n = n11198609108095032895.f379o;
        List list = n11198609108095032895.r;
        this.q = list;
        this.r = n11198609108095032895.s;
        this.s = n11198609108095032895.t;
        this.v = n11198609108095032895.w;
        this.w = n11198609108095032895.x;
        this.x = n11198609108095032895.y;
        this.y = n11198609108095032895.z;
        this.z = n11198609108095032895.A;
        this.A = n11198609108095032895.B;
        M9197813449740923653 m9197813449740923653 = n11198609108095032895.C;
        this.B = m9197813449740923653 == null ? new M9197813449740923653((byte) 2) : m9197813449740923653;
        M10634075818626712574 m10634075818626712574 = n11198609108095032895.D;
        this.C = m10634075818626712574 == null ? M10634075818626712574.k : m10634075818626712574;
        H12843822278061842084 h12843822278061842084 = n11198609108095032895.b;
        if (h12843822278061842084 == null) {
            h12843822278061842084 = new H12843822278061842084(5, 5L);
            n11198609108095032895.b = h12843822278061842084;
        }
        this.D = h12843822278061842084;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((I17300838719998789664) it.next()).a) {
                    sSLSocketFactory = n11198609108095032895.p;
                    if (sSLSocketFactory == null) {
                        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                        X4422675003582389573.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                                this.p = x509TrustManager2;
                                X4422675003582389573 x44226750035823895732 = X4422675003582389573.a;
                                x44226750035823895732.getClass();
                                try {
                                    SSLContext sSLContextL = x44226750035823895732.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager2}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    socketFactory.getClass();
                                    this.f333o = socketFactory;
                                    M2066880349381062048 m2066880349381062048C = X4422675003582389573.a.c(x509TrustManager2);
                                    this.u = m2066880349381062048C;
                                    F12905216483416502853 f12905216483416502853 = n11198609108095032895.u;
                                    f12905216483416502853.getClass();
                                    this.t = S10823041268949770285.t(f12905216483416502853.b, m2066880349381062048C) ? f12905216483416502853 : new F12905216483416502853(f12905216483416502853.a, m2066880349381062048C);
                                    x509TrustManager = x509TrustManager2;
                                    sSLSocketFactory = socketFactory;
                                    m2066880349381062048 = m2066880349381062048C;
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        Z3383101362411723454.j("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.f333o = sSLSocketFactory;
                    m2066880349381062048 = n11198609108095032895.v;
                    m2066880349381062048.getClass();
                    this.u = m2066880349381062048;
                    x509TrustManager = n11198609108095032895.q;
                    x509TrustManager.getClass();
                    this.p = x509TrustManager;
                    F12905216483416502853 f129052164834165028532 = n11198609108095032895.u;
                    f129052164834165028532.getClass();
                    this.t = S10823041268949770285.t(f129052164834165028532.b, m2066880349381062048) ? f129052164834165028532 : new F12905216483416502853(f129052164834165028532.a, m2066880349381062048);
                }
            }
            this.f333o = null;
            this.u = null;
            this.p = null;
            this.t = F12905216483416502853.c;
            sSLSocketFactory = null;
            m2066880349381062048 = null;
            x509TrustManager = null;
        } else {
            this.f333o = null;
            this.u = null;
            this.p = null;
            this.t = F12905216483416502853.c;
            sSLSocketFactory = null;
            m2066880349381062048 = null;
            x509TrustManager = null;
        }
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            D11988991656201568495.r("Null interceptor: ", list3);
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            D11988991656201568495.r("Null network interceptor: ", list2);
            throw null;
        }
        List list4 = this.q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((I17300838719998789664) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        S10973172697741180971.m("sslSocketFactory == null");
                        throw null;
                    }
                    if (m2066880349381062048 == null) {
                        S10973172697741180971.m("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    S10973172697741180971.m("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            S10973172697741180971.m("Check failed.");
            throw null;
        }
        if (m2066880349381062048 != null) {
            S10973172697741180971.m("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            S10973172697741180971.m("Check failed.");
            throw null;
        }
        if (S10823041268949770285.t(this.t, F12905216483416502853.c)) {
            return;
        }
        S10973172697741180971.m("Check failed.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [int, short] */
    public final N11198609108095032895 a() {
        N11198609108095032895 n11198609108095032895 = new N11198609108095032895();
        n11198609108095032895.a = this.a;
        n11198609108095032895.b = this.D;
        P17571903987102865660.n0(n11198609108095032895.c, this.b);
        P17571903987102865660.n0(n11198609108095032895.d, this.c);
        n11198609108095032895.e = this.d;
        n11198609108095032895.f = this.e;
        n11198609108095032895.g = this.f;
        n11198609108095032895.h = this.g;
        n11198609108095032895.i = this.h;
        n11198609108095032895.j = this.i;
        n11198609108095032895.k = this.j;
        n11198609108095032895.l = this.k;
        n11198609108095032895.m = this.l;
        n11198609108095032895.n = this.m;
        n11198609108095032895.f379o = this.n;
        n11198609108095032895.p = this.f333o;
        n11198609108095032895.q = this.p;
        n11198609108095032895.r = this.q;
        n11198609108095032895.s = this.r;
        n11198609108095032895.t = this.s;
        n11198609108095032895.u = this.t;
        n11198609108095032895.v = this.u;
        n11198609108095032895.w = this.v;
        n11198609108095032895.x = this.w;
        n11198609108095032895.y = this.x;
        n11198609108095032895.z = this.y;
        n11198609108095032895.A = this.z;
        n11198609108095032895.B = this.A;
        n11198609108095032895.C = this.B;
        n11198609108095032895.D = this.C;
        return n11198609108095032895;
    }
}
