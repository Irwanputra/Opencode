package dev.epro.r0;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A8512287753625267110 implements P11191550465322624469, O4085430910208803047 {
    public final M10634075818626712574 a;
    public final J9884070742191057945 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final V5252629055842691065 h;
    public final T15985366153370019177 i;
    public final L7308164961383861217 j;
    public final List k;
    public final G842859980338292746 l;
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y5942596939223382942 f164o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public F3187248827616951674 s;
    public P10544952747155442696 t;
    public Q7316561721656982910 u;
    public H3726261569308128079 v;

    public A8512287753625267110(M10634075818626712574 m10634075818626712574, J9884070742191057945 j9884070742191057945, int i, int i2, int i3, int i4, boolean z, V5252629055842691065 v5252629055842691065, T15985366153370019177 t15985366153370019177, L7308164961383861217 l7308164961383861217, List list, G842859980338292746 g842859980338292746, int i5, boolean z2, Y5942596939223382942 y5942596939223382942) {
        m10634075818626712574.getClass();
        l7308164961383861217.getClass();
        this.a = m10634075818626712574;
        this.b = j9884070742191057945;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = v5252629055842691065;
        this.i = t15985366153370019177;
        this.j = l7308164961383861217;
        this.k = list;
        this.l = g842859980338292746;
        this.m = i5;
        this.n = z2;
        this.f164o = y5942596939223382942;
    }

    public static A8512287753625267110 l(A8512287753625267110 a8512287753625267110, L7308164961383861217 l7308164961383861217, int i, boolean z, Y5942596939223382942 y5942596939223382942, int i2) {
        return new A8512287753625267110(a8512287753625267110.a, a8512287753625267110.b, a8512287753625267110.c, a8512287753625267110.d, a8512287753625267110.e, a8512287753625267110.f, a8512287753625267110.g, a8512287753625267110.h, a8512287753625267110.i, (i2 & 1) != 0 ? a8512287753625267110.j : l7308164961383861217, a8512287753625267110.k, a8512287753625267110.l, (i2 & 8) != 0 ? a8512287753625267110.m : i, (i2 & 16) != 0 ? a8512287753625267110.n : z, (i2 & 32) != 0 ? a8512287753625267110.f164o : y5942596939223382942);
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final P11191550465322624469 a() {
        return new A8512287753625267110(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f164o);
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 c() throws Throwable {
        Socket socket = this.q;
        if (socket == null) {
            S10973172697741180971.j("TCP not connected");
            return null;
        }
        if (e()) {
            S10973172697741180971.m("already connected");
            return null;
        }
        List list = this.j.a.j;
        this.h.s.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    J14476340649358081657 j14476340649358081657K = k();
                    if (j14476340649358081657K.c != null) {
                        this.h.s.remove(this);
                        Socket socket2 = this.r;
                        if (socket2 != null) {
                            C14766148968941961570.c(socket2);
                        }
                        C14766148968941961570.c(socket);
                        return j14476340649358081657K;
                    }
                }
                N1214788596583503619 n1214788596583503619 = this.j.a;
                if (n1214788596583503619.c != null) {
                    Q7316561721656982910 q7316561721656982910 = this.u;
                    if (q7316561721656982910 == null) {
                        S10823041268949770285.b0("socket");
                        throw null;
                    }
                    if (((T13344602445187831655) q7316561721656982910.c).b.c()) {
                        Q7316561721656982910 q73165617216569829102 = this.u;
                        if (q73165617216569829102 == null) {
                            S10823041268949770285.b0("socket");
                            throw null;
                        }
                        if (((L673873344574563461) q73165617216569829102.d).b.c()) {
                            this.h.d.getClass();
                            N1214788596583503619 n12147885965835036192 = this.j.a;
                            SSLSocketFactory sSLSocketFactory = n12147885965835036192.c;
                            P10208541982779414550 p10208541982779414550 = n12147885965835036192.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, p10208541982779414550.d, p10208541982779414550.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            A8512287753625267110 a8512287753625267110O = o(list, sSLSocket);
                            I17300838719998789664 i17300838719998789664 = (I17300838719998789664) list.get(a8512287753625267110O.m);
                            i17300838719998789664.a(sSLSocket, a8512287753625267110O.n);
                            try {
                                j(sSLSocket, i17300838719998789664);
                                this.h.d.getClass();
                            } catch (SSLException e) {
                                a8512287753625267110O.n(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket;
                List list2 = n1214788596583503619.i;
                P10544952747155442696 p10544952747155442696 = P10544952747155442696.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(p10544952747155442696)) {
                    p10544952747155442696 = P10544952747155442696.HTTP_1_1;
                }
                this.t = p10544952747155442696;
                M10634075818626712574 m10634075818626712574 = this.a;
                J9884070742191057945 j9884070742191057945 = this.b;
                L7308164961383861217 l7308164961383861217 = this.j;
                Socket socket3 = this.r;
                socket3.getClass();
                F3187248827616951674 f3187248827616951674 = this.s;
                P10544952747155442696 p105449527471554426962 = this.t;
                p105449527471554426962.getClass();
                Q7316561721656982910 q73165617216569829103 = this.u;
                if (q73165617216569829103 == null) {
                    S10823041268949770285.b0("socket");
                    throw null;
                }
                H3726261569308128079 h3726261569308128079 = new H3726261569308128079(m10634075818626712574, j9884070742191057945, l7308164961383861217, socket, socket3, f3187248827616951674, p105449527471554426962, q73165617216569829103);
                this.v = h3726261569308128079;
                h3726261569308128079.i();
                Q16536459847538462718 q16536459847538462718 = this.h.d;
                L7308164961383861217 l73081649613838612172 = this.j;
                InetSocketAddress inetSocketAddress = l73081649613838612172.c;
                Proxy proxy = l73081649613838612172.b;
                q16536459847538462718.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                try {
                    J14476340649358081657 j14476340649358081657 = new J14476340649358081657(this, (Throwable) null, 6);
                    this.h.s.remove(this);
                    return j14476340649358081657;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    Q16536459847538462718 q165364598475384627182 = this.h.d;
                    L7308164961383861217 l73081649613838612173 = this.j;
                    InetSocketAddress inetSocketAddress2 = l73081649613838612173.c;
                    Proxy proxy2 = l73081649613838612173.b;
                    q165364598475384627182.getClass();
                    inetSocketAddress2.getClass();
                    proxy2.getClass();
                    this.j.getClass();
                    J14476340649358081657 j144763406493580816572 = new J14476340649358081657(this, (A8512287753625267110) null, e);
                    this.h.s.remove(this);
                    if (!z) {
                        Socket socket4 = this.r;
                        if (socket4 != null) {
                            C14766148968941961570.c(socket4);
                        }
                        C14766148968941961570.c(socket);
                    }
                    return j144763406493580816572;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.h.s.remove(this);
                    if (!z) {
                        Socket socket5 = this.r;
                        if (socket5 != null) {
                            C14766148968941961570.c(socket5);
                        }
                        C14766148968941961570.c(socket);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            C14766148968941961570.c(socket);
        }
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final H3726261569308128079 d() {
        M9197813449740923653 m9197813449740923653 = this.h.a.B;
        L7308164961383861217 l7308164961383861217 = this.j;
        synchronized (m9197813449740923653) {
            l7308164961383861217.getClass();
            ((LinkedHashSet) m9197813449740923653.b).remove(l7308164961383861217);
        }
        H3726261569308128079 h3726261569308128079 = this.v;
        h3726261569308128079.getClass();
        this.j.getClass();
        O7265813552375631487 o7265813552375631487D = this.i.d(this, this.k);
        if (o7265813552375631487D != null) {
            return o7265813552375631487D.a;
        }
        synchronized (h3726261569308128079) {
            J9884070742191057945 j9884070742191057945 = this.b;
            TimeZone timeZone = C14766148968941961570.a;
            ((ConcurrentLinkedQueue) j9884070742191057945.e).add(h3726261569308128079);
            ((Z9658010704151025794) j9884070742191057945.c).c((E17483539623558463245) j9884070742191057945.d, 0L);
            this.h.a(h3726261569308128079);
        }
        this.h.d.getClass();
        return h3726261569308128079;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final boolean e() {
        return this.t != null;
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final L7308164961383861217 f() {
        return this.j;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 g() {
        Socket socket;
        Socket socket2;
        if (this.q != null) {
            S10973172697741180971.m("TCP already connected");
            return null;
        }
        this.h.s.add(this);
        boolean z = false;
        try {
            try {
                Q16536459847538462718 q16536459847538462718 = this.h.d;
                L7308164961383861217 l7308164961383861217 = this.j;
                InetSocketAddress inetSocketAddress = l7308164961383861217.c;
                Proxy proxy = l7308164961383861217.b;
                q16536459847538462718.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                this.j.getClass();
                i();
                z = true;
                J14476340649358081657 j14476340649358081657 = new J14476340649358081657(this, (Throwable) null, 6);
                this.h.s.remove(this);
                return j14476340649358081657;
            } catch (IOException e) {
                L7308164961383861217 l73081649613838612172 = this.j;
                l73081649613838612172.a.getClass();
                if (l73081649613838612172.b.type() != Proxy.Type.DIRECT) {
                    N1214788596583503619 n1214788596583503619 = this.j.a;
                    n1214788596583503619.g.connectFailed(n1214788596583503619.h.g(), this.j.b.address(), e);
                }
                Q16536459847538462718 q165364598475384627182 = this.h.d;
                L7308164961383861217 l73081649613838612173 = this.j;
                InetSocketAddress inetSocketAddress2 = l73081649613838612173.c;
                Proxy proxy2 = l73081649613838612173.b;
                q165364598475384627182.getClass();
                inetSocketAddress2.getClass();
                proxy2.getClass();
                this.j.getClass();
                J14476340649358081657 j144763406493580816572 = new J14476340649358081657(this, e, 2);
                this.h.s.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    C14766148968941961570.c(socket2);
                }
                return j144763406493580816572;
            }
        } catch (Throwable th) {
            this.h.s.remove(this);
            if (!z && (socket = this.q) != null) {
                C14766148968941961570.c(socket);
            }
            throw th;
        }
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : V16221078908248291615.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            Q11088980322693754445.h("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
            X4422675003582389573.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new Q7316561721656982910(new J15730374346044043770(socketCreateSocket));
            } catch (NullPointerException e) {
                if (S10823041268949770285.t(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, I17300838719998789664 i17300838719998789664) {
        P10544952747155442696 p10544952747155442696V;
        N1214788596583503619 n1214788596583503619 = this.j.a;
        try {
            if (i17300838719998789664.b) {
                X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                X4422675003582389573.a.d(sSLSocket, n1214788596583503619.h.d, n1214788596583503619.i, this.j.d);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            F3187248827616951674 f3187248827616951674S = C12265524002282074474.S(session);
            HostnameVerifier hostnameVerifier = n1214788596583503619.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(n1214788596583503619.h.d, session)) {
                List listA = f3187248827616951674S.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + n1214788596583503619.h.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(n1214788596583503619.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                F12905216483416502853 f12905216483416502853 = F12905216483416502853.c;
                sb.append(V1475975160983963926.I(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(R9411874267597469228.O0(Q14852350147222728147.a(x509Certificate, 7), Q14852350147222728147.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(G5759126466240281083.u(sb.toString()));
            }
            F12905216483416502853 f129052164834165028532 = n1214788596583503619.e;
            f129052164834165028532.getClass();
            this.s = new F3187248827616951674(f3187248827616951674S.a, f3187248827616951674S.b, f3187248827616951674S.c, new A7716877927750495196(f129052164834165028532, f3187248827616951674S, n1214788596583503619, (byte) 10));
            n1214788596583503619.h.d.getClass();
            Iterator it = f129052164834165028532.a.iterator();
            String strG = null;
            if (it.hasNext()) {
                L11610354117192841236.y(it.next());
                throw null;
            }
            if (i17300838719998789664.b) {
                X4422675003582389573 x44226750035823895732 = X4422675003582389573.a;
                strG = X4422675003582389573.a.g(sSLSocket);
            }
            this.r = sSLSocket;
            this.u = new Q7316561721656982910(new J15730374346044043770(sSLSocket));
            if (strG != null) {
                P10544952747155442696.b.getClass();
                p10544952747155442696V = J3301701597851028733.v(strG);
            } else {
                p10544952747155442696V = P10544952747155442696.HTTP_1_1;
            }
            this.t = p10544952747155442696V;
            X4422675003582389573 x44226750035823895733 = X4422675003582389573.a;
            X4422675003582389573.a.getClass();
        } catch (Throwable th) {
            X4422675003582389573 x44226750035823895734 = X4422675003582389573.a;
            X4422675003582389573.a.getClass();
            C14766148968941961570.c(sSLSocket);
            throw th;
        }
    }

    public final J14476340649358081657 k() throws IOException {
        G842859980338292746 g842859980338292746 = this.l;
        g842859980338292746.getClass();
        L7308164961383861217 l7308164961383861217 = this.j;
        String str = "CONNECT " + C14766148968941961570.i(l7308164961383861217.a.h, true) + " HTTP/1.1";
        Q7316561721656982910 q7316561721656982910 = this.u;
        if (q7316561721656982910 == null) {
            S10823041268949770285.b0("socket");
            throw null;
        }
        V13312380994896612392 v13312380994896612392 = new V13312380994896612392(null, this, q7316561721656982910);
        Q7316561721656982910 q73165617216569829102 = this.u;
        if (q73165617216569829102 == null) {
            S10823041268949770285.b0("socket");
            throw null;
        }
        ((T13344602445187831655) q73165617216569829102.c).a.a().g(this.c);
        Q7316561721656982910 q73165617216569829103 = this.u;
        if (q73165617216569829103 == null) {
            S10823041268949770285.b0("socket");
            throw null;
        }
        ((L673873344574563461) q73165617216569829103.d).a.a().g(this.d);
        v13312380994896612392.l(g842859980338292746.c, str);
        v13312380994896612392.b();
        O6225539295864356213 o6225539295864356213J = v13312380994896612392.j(false);
        o6225539295864356213J.getClass();
        o6225539295864356213J.a = g842859980338292746;
        P10917817599008460069 p10917817599008460069A = o6225539295864356213J.a();
        int i = p10917817599008460069A.d;
        long jE = C14766148968941961570.e(p10917817599008460069A);
        if (jE != -1) {
            P4575683796390162177 p4575683796390162177K = v13312380994896612392.k(p10917817599008460069A.a.a, jE);
            C14766148968941961570.g(p4575683796390162177K, Integer.MAX_VALUE);
            p4575683796390162177K.close();
        }
        if (i == 200) {
            return new J14476340649358081657(this, (Throwable) null, 6);
        }
        if (i != 407) {
            Q11088980322693754445.h(G6547577305291411977.n(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        l7308164961383861217.a.f.getClass();
        Q11088980322693754445.h("Failed to authenticate with proxy");
        return null;
    }

    public final A8512287753625267110 m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            I17300838719998789664 i17300838719998789664 = (I17300838719998789664) list.get(i2);
            i17300838719998789664.getClass();
            if (i17300838719998789664.a && (((strArr = i17300838719998789664.d) == null || L14928198200995638215.e(strArr, sSLSocket.getEnabledProtocols(), J16924082299779570240.b)) && ((strArr2 = i17300838719998789664.c) == null || L14928198200995638215.e(strArr2, sSLSocket.getEnabledCipherSuites(), F2833317347889062771.c)))) {
                return l(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    public final A8512287753625267110 n(List list, SSLSocket sSLSocket, SSLException sSLException) throws A9104873785792518488 {
        if (this.f164o != null) {
            return null;
        }
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        Y5942596939223382942 y5942596939223382942F = X4422675003582389573.a.f(sSLException);
        if (y5942596939223382942F != null) {
            HostnameVerifier hostnameVerifier = this.j.a.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(y5942596939223382942F.a, sSLSocket.getSession())) {
                throw new A9104873785792518488(G6547577305291411977.u(new StringBuilder("public_name '"), y5942596939223382942F.a, "' not verified"), sSLException);
            }
            L7308164961383861217 l7308164961383861217 = this.j;
            return l(this, new L7308164961383861217(l7308164961383861217.a, l7308164961383861217.b, l7308164961383861217.c, y5942596939223382942F.b), 0, false, y5942596939223382942F, 30);
        }
        if (!this.g) {
            return null;
        }
        if (((sSLException instanceof SSLHandshakeException) && (sSLException.getCause() instanceof CertificateException)) || (sSLException instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        return m(list, sSLSocket);
    }

    public final A8512287753625267110 o(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.m != -1) {
            return this;
        }
        A8512287753625267110 a8512287753625267110M = m(list, sSLSocket);
        if (a8512287753625267110M != null) {
            return a8512287753625267110M;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final void h() {
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final void b(V5252629055842691065 v5252629055842691065, IOException iOException) {
    }
}
