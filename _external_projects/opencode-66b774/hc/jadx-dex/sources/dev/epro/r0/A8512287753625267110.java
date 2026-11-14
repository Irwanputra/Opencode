package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8512287753625267110 implements dev.epro.r0.P11191550465322624469, dev.epro.r0.O4085430910208803047 {
    public final dev.epro.r0.M10634075818626712574 a;
    public final dev.epro.r0.J9884070742191057945 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final dev.epro.r0.V5252629055842691065 h;
    public final dev.epro.r0.T15985366153370019177 i;
    public final dev.epro.r0.L7308164961383861217 j;
    public final java.util.List k;
    public final dev.epro.r0.G842859980338292746 l;
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.Y5942596939223382942 f164o;
    public volatile boolean p;
    public java.net.Socket q;
    public java.net.Socket r;
    public dev.epro.r0.F3187248827616951674 s;
    public dev.epro.r0.P10544952747155442696 t;
    public dev.epro.r0.Q7316561721656982910 u;
    public dev.epro.r0.H3726261569308128079 v;

    public A8512287753625267110(dev.epro.r0.M10634075818626712574 m10634075818626712574, dev.epro.r0.J9884070742191057945 j9884070742191057945, int i, int i2, int i3, int i4, boolean z, dev.epro.r0.V5252629055842691065 v5252629055842691065, dev.epro.r0.T15985366153370019177 t15985366153370019177, dev.epro.r0.L7308164961383861217 l7308164961383861217, java.util.List list, dev.epro.r0.G842859980338292746 g842859980338292746, int i5, boolean z2, dev.epro.r0.Y5942596939223382942 y5942596939223382942) {
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

    public static dev.epro.r0.A8512287753625267110 l(dev.epro.r0.A8512287753625267110 a8512287753625267110, dev.epro.r0.L7308164961383861217 l7308164961383861217, int i, boolean z, dev.epro.r0.Y5942596939223382942 y5942596939223382942, int i2) {
        return new dev.epro.r0.A8512287753625267110(a8512287753625267110.a, a8512287753625267110.b, a8512287753625267110.c, a8512287753625267110.d, a8512287753625267110.e, a8512287753625267110.f, a8512287753625267110.g, a8512287753625267110.h, a8512287753625267110.i, (i2 & 1) != 0 ? a8512287753625267110.j : l7308164961383861217, a8512287753625267110.k, a8512287753625267110.l, (i2 & 8) != 0 ? a8512287753625267110.m : i, (i2 & 16) != 0 ? a8512287753625267110.n : z, (i2 & 32) != 0 ? a8512287753625267110.f164o : y5942596939223382942);
    }

    public final dev.epro.r0.P11191550465322624469 a() {
        return new dev.epro.r0.A8512287753625267110(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f164o);
    }

    public final dev.epro.r0.J14476340649358081657 c() throws java.lang.Throwable {
        java.net.Socket socket = this.q;
        if (socket == null) {
            dev.epro.r0.S10973172697741180971.j("TCP not connected");
            return null;
        }
        if (e()) {
            dev.epro.r0.S10973172697741180971.m("already connected");
            return null;
        }
        java.util.List list = this.j.a.j;
        this.h.s.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    dev.epro.r0.J14476340649358081657 j14476340649358081657K = k();
                    if (j14476340649358081657K.c != null) {
                        this.h.s.remove(this);
                        java.net.Socket socket2 = this.r;
                        if (socket2 != null) {
                            dev.epro.r0.C14766148968941961570.c(socket2);
                        }
                        dev.epro.r0.C14766148968941961570.c(socket);
                        return j14476340649358081657K;
                    }
                }
                dev.epro.r0.N1214788596583503619 n1214788596583503619 = this.j.a;
                if (n1214788596583503619.c != null) {
                    dev.epro.r0.Q7316561721656982910 q7316561721656982910 = this.u;
                    if (q7316561721656982910 == null) {
                        dev.epro.r0.S10823041268949770285.b0("socket");
                        throw null;
                    }
                    if (((dev.epro.r0.T13344602445187831655) q7316561721656982910.c).b.c()) {
                        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = this.u;
                        if (q73165617216569829102 == null) {
                            dev.epro.r0.S10823041268949770285.b0("socket");
                            throw null;
                        }
                        if (((dev.epro.r0.L673873344574563461) q73165617216569829102.d).b.c()) {
                            this.h.d.getClass();
                            dev.epro.r0.N1214788596583503619 n12147885965835036192 = this.j.a;
                            javax.net.ssl.SSLSocketFactory sSLSocketFactory = n12147885965835036192.c;
                            dev.epro.r0.P10208541982779414550 p10208541982779414550 = n12147885965835036192.h;
                            java.net.Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, p10208541982779414550.d, p10208541982779414550.e, true);
                            socketCreateSocket.getClass();
                            javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) socketCreateSocket;
                            dev.epro.r0.A8512287753625267110 a8512287753625267110O = o(list, sSLSocket);
                            dev.epro.r0.I17300838719998789664 i17300838719998789664 = (dev.epro.r0.I17300838719998789664) list.get(a8512287753625267110O.m);
                            i17300838719998789664.a(sSLSocket, a8512287753625267110O.n);
                            try {
                                j(sSLSocket, i17300838719998789664);
                                this.h.d.getClass();
                            } catch (javax.net.ssl.SSLException e) {
                                a8512287753625267110O.n(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new java.io.IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket;
                java.util.List list2 = n1214788596583503619.i;
                dev.epro.r0.P10544952747155442696 p10544952747155442696 = dev.epro.r0.P10544952747155442696.g;
                if (!list2.contains(p10544952747155442696)) {
                    p10544952747155442696 = dev.epro.r0.P10544952747155442696.d;
                }
                this.t = p10544952747155442696;
                dev.epro.r0.M10634075818626712574 m10634075818626712574 = this.a;
                dev.epro.r0.J9884070742191057945 j9884070742191057945 = this.b;
                dev.epro.r0.L7308164961383861217 l7308164961383861217 = this.j;
                java.net.Socket socket3 = this.r;
                socket3.getClass();
                dev.epro.r0.F3187248827616951674 f3187248827616951674 = this.s;
                dev.epro.r0.P10544952747155442696 p105449527471554426962 = this.t;
                p105449527471554426962.getClass();
                dev.epro.r0.Q7316561721656982910 q73165617216569829103 = this.u;
                if (q73165617216569829103 == null) {
                    dev.epro.r0.S10823041268949770285.b0("socket");
                    throw null;
                }
                dev.epro.r0.H3726261569308128079 h3726261569308128079 = new dev.epro.r0.H3726261569308128079(m10634075818626712574, j9884070742191057945, l7308164961383861217, socket, socket3, f3187248827616951674, p105449527471554426962, q73165617216569829103);
                this.v = h3726261569308128079;
                h3726261569308128079.i();
                dev.epro.r0.Q16536459847538462718 q16536459847538462718 = this.h.d;
                dev.epro.r0.L7308164961383861217 l73081649613838612172 = this.j;
                java.net.InetSocketAddress inetSocketAddress = l73081649613838612172.c;
                java.net.Proxy proxy = l73081649613838612172.b;
                q16536459847538462718.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                try {
                    dev.epro.r0.J14476340649358081657 j14476340649358081657 = new dev.epro.r0.J14476340649358081657(this, (java.lang.Throwable) null, 6);
                    this.h.s.remove(this);
                    return j14476340649358081657;
                } catch (java.io.IOException e2) {
                    e = e2;
                    z = true;
                    dev.epro.r0.Q16536459847538462718 q165364598475384627182 = this.h.d;
                    dev.epro.r0.L7308164961383861217 l73081649613838612173 = this.j;
                    java.net.InetSocketAddress inetSocketAddress2 = l73081649613838612173.c;
                    java.net.Proxy proxy2 = l73081649613838612173.b;
                    q165364598475384627182.getClass();
                    inetSocketAddress2.getClass();
                    proxy2.getClass();
                    this.j.getClass();
                    dev.epro.r0.J14476340649358081657 j144763406493580816572 = new dev.epro.r0.J14476340649358081657(this, (dev.epro.r0.A8512287753625267110) null, e);
                    this.h.s.remove(this);
                    if (!z) {
                        java.net.Socket socket4 = this.r;
                        if (socket4 != null) {
                            dev.epro.r0.C14766148968941961570.c(socket4);
                        }
                        dev.epro.r0.C14766148968941961570.c(socket);
                    }
                    return j144763406493580816572;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = true;
                    this.h.s.remove(this);
                    if (!z) {
                        java.net.Socket socket5 = this.r;
                        if (socket5 != null) {
                            dev.epro.r0.C14766148968941961570.c(socket5);
                        }
                        dev.epro.r0.C14766148968941961570.c(socket);
                    }
                    throw th;
                }
            } catch (java.io.IOException e3) {
                e = e3;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final void cancel() {
        this.p = true;
        java.net.Socket socket = this.q;
        if (socket != null) {
            dev.epro.r0.C14766148968941961570.c(socket);
        }
    }

    public final dev.epro.r0.H3726261569308128079 d() {
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = this.h.a.B;
        dev.epro.r0.L7308164961383861217 l7308164961383861217 = this.j;
        synchronized (m9197813449740923653) {
            l7308164961383861217.getClass();
            ((java.util.LinkedHashSet) m9197813449740923653.b).remove(l7308164961383861217);
        }
        dev.epro.r0.H3726261569308128079 h3726261569308128079 = this.v;
        h3726261569308128079.getClass();
        this.j.getClass();
        dev.epro.r0.O7265813552375631487 o7265813552375631487D = this.i.d(this, this.k);
        if (o7265813552375631487D != null) {
            return o7265813552375631487D.a;
        }
        synchronized (h3726261569308128079) {
            dev.epro.r0.J9884070742191057945 j9884070742191057945 = this.b;
            java.util.TimeZone timeZone = dev.epro.r0.C14766148968941961570.a;
            ((java.util.concurrent.ConcurrentLinkedQueue) j9884070742191057945.e).add(h3726261569308128079);
            ((dev.epro.r0.Z9658010704151025794) j9884070742191057945.c).c((dev.epro.r0.E17483539623558463245) j9884070742191057945.d, 0L);
            this.h.a(h3726261569308128079);
        }
        this.h.d.getClass();
        return h3726261569308128079;
    }

    public final boolean e() {
        return this.t != null;
    }

    public final dev.epro.r0.L7308164961383861217 f() {
        return this.j;
    }

    public final dev.epro.r0.J14476340649358081657 g() {
        java.net.Socket socket;
        java.net.Socket socket2;
        if (this.q != null) {
            dev.epro.r0.S10973172697741180971.m("TCP already connected");
            return null;
        }
        this.h.s.add(this);
        boolean z = false;
        try {
            try {
                dev.epro.r0.Q16536459847538462718 q16536459847538462718 = this.h.d;
                dev.epro.r0.L7308164961383861217 l7308164961383861217 = this.j;
                java.net.InetSocketAddress inetSocketAddress = l7308164961383861217.c;
                java.net.Proxy proxy = l7308164961383861217.b;
                q16536459847538462718.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                this.j.getClass();
                i();
                z = true;
                dev.epro.r0.J14476340649358081657 j14476340649358081657 = new dev.epro.r0.J14476340649358081657(this, (java.lang.Throwable) null, 6);
                this.h.s.remove(this);
                return j14476340649358081657;
            } catch (java.io.IOException e) {
                dev.epro.r0.L7308164961383861217 l73081649613838612172 = this.j;
                l73081649613838612172.a.getClass();
                if (l73081649613838612172.b.type() != java.net.Proxy.Type.DIRECT) {
                    dev.epro.r0.N1214788596583503619 n1214788596583503619 = this.j.a;
                    n1214788596583503619.g.connectFailed(n1214788596583503619.h.g(), this.j.b.address(), e);
                }
                dev.epro.r0.Q16536459847538462718 q165364598475384627182 = this.h.d;
                dev.epro.r0.L7308164961383861217 l73081649613838612173 = this.j;
                java.net.InetSocketAddress inetSocketAddress2 = l73081649613838612173.c;
                java.net.Proxy proxy2 = l73081649613838612173.b;
                q165364598475384627182.getClass();
                inetSocketAddress2.getClass();
                proxy2.getClass();
                this.j.getClass();
                dev.epro.r0.J14476340649358081657 j144763406493580816572 = new dev.epro.r0.J14476340649358081657(this, e, 2);
                this.h.s.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    dev.epro.r0.C14766148968941961570.c(socket2);
                }
                return j144763406493580816572;
            }
        } catch (java.lang.Throwable th) {
            this.h.s.remove(this);
            if (!z && (socket = this.q) != null) {
                dev.epro.r0.C14766148968941961570.c(socket);
            }
            throw th;
        }
    }

    public final void i() throws java.io.IOException {
        java.net.Socket socketCreateSocket;
        java.net.Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : dev.epro.r0.V16221078908248291615.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new java.net.Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            dev.epro.r0.Q11088980322693754445.h("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
            dev.epro.r0.X4422675003582389573.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new dev.epro.r0.Q7316561721656982910(new dev.epro.r0.J15730374346044043770(socketCreateSocket));
            } catch (java.lang.NullPointerException e) {
                if (dev.epro.r0.S10823041268949770285.t(e.getMessage(), "throw with null exception")) {
                    throw new java.io.IOException(e);
                }
            }
        } catch (java.net.ConnectException e2) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(javax.net.ssl.SSLSocket sSLSocket, dev.epro.r0.I17300838719998789664 i17300838719998789664) {
        dev.epro.r0.P10544952747155442696 p10544952747155442696V;
        dev.epro.r0.N1214788596583503619 n1214788596583503619 = this.j.a;
        try {
            if (i17300838719998789664.b) {
                dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
                dev.epro.r0.X4422675003582389573.a.d(sSLSocket, n1214788596583503619.h.d, n1214788596583503619.i, this.j.d);
            }
            sSLSocket.startHandshake();
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            session.getClass();
            dev.epro.r0.F3187248827616951674 f3187248827616951674S = dev.epro.r0.C12265524002282074474.S(session);
            javax.net.ssl.HostnameVerifier hostnameVerifier = n1214788596583503619.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(n1214788596583503619.h.d, session)) {
                java.util.List listA = f3187248827616951674S.a();
                if (listA.isEmpty()) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + n1214788596583503619.h.d + " not verified (no certificates)");
                }
                java.lang.Object obj = listA.get(0);
                obj.getClass();
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Hostname ");
                sb.append(n1214788596583503619.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                dev.epro.r0.F12905216483416502853 f12905216483416502853 = dev.epro.r0.F12905216483416502853.c;
                sb.append(dev.epro.r0.V1475975160983963926.I(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(dev.epro.r0.R9411874267597469228.O0(dev.epro.r0.Q14852350147222728147.a(x509Certificate, 7), dev.epro.r0.Q14852350147222728147.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new javax.net.ssl.SSLPeerUnverifiedException(dev.epro.r0.G5759126466240281083.u(sb.toString()));
            }
            dev.epro.r0.F12905216483416502853 f129052164834165028532 = n1214788596583503619.e;
            f129052164834165028532.getClass();
            this.s = new dev.epro.r0.F3187248827616951674(f3187248827616951674S.a, f3187248827616951674S.b, f3187248827616951674S.c, new dev.epro.r0.A7716877927750495196(f129052164834165028532, f3187248827616951674S, n1214788596583503619, (byte) 10));
            n1214788596583503619.h.d.getClass();
            java.util.Iterator it = f129052164834165028532.a.iterator();
            java.lang.String strG = null;
            if (it.hasNext()) {
                dev.epro.r0.L11610354117192841236.y(it.next());
                throw null;
            }
            if (i17300838719998789664.b) {
                dev.epro.r0.X4422675003582389573 x44226750035823895732 = dev.epro.r0.X4422675003582389573.a;
                strG = dev.epro.r0.X4422675003582389573.a.g(sSLSocket);
            }
            this.r = sSLSocket;
            this.u = new dev.epro.r0.Q7316561721656982910(new dev.epro.r0.J15730374346044043770(sSLSocket));
            if (strG != null) {
                dev.epro.r0.P10544952747155442696.b.getClass();
                p10544952747155442696V = dev.epro.r0.J3301701597851028733.v(strG);
            } else {
                p10544952747155442696V = dev.epro.r0.P10544952747155442696.d;
            }
            this.t = p10544952747155442696V;
            dev.epro.r0.X4422675003582389573 x44226750035823895733 = dev.epro.r0.X4422675003582389573.a;
            dev.epro.r0.X4422675003582389573.a.getClass();
        } catch (java.lang.Throwable th) {
            dev.epro.r0.X4422675003582389573 x44226750035823895734 = dev.epro.r0.X4422675003582389573.a;
            dev.epro.r0.X4422675003582389573.a.getClass();
            dev.epro.r0.C14766148968941961570.c(sSLSocket);
            throw th;
        }
    }

    public final dev.epro.r0.J14476340649358081657 k() {
        dev.epro.r0.G842859980338292746 g842859980338292746 = this.l;
        g842859980338292746.getClass();
        dev.epro.r0.L7308164961383861217 l7308164961383861217 = this.j;
        java.lang.String str = "CONNECT " + dev.epro.r0.C14766148968941961570.i(l7308164961383861217.a.h, true) + " HTTP/1.1";
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = this.u;
        if (q7316561721656982910 == null) {
            dev.epro.r0.S10823041268949770285.b0("socket");
            throw null;
        }
        dev.epro.r0.V13312380994896612392 v13312380994896612392 = new dev.epro.r0.V13312380994896612392((dev.epro.r0.K5458285210510848811) null, this, q7316561721656982910);
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = this.u;
        if (q73165617216569829102 == null) {
            dev.epro.r0.S10823041268949770285.b0("socket");
            throw null;
        }
        ((dev.epro.r0.T13344602445187831655) q73165617216569829102.c).a.a().g(this.c);
        dev.epro.r0.Q7316561721656982910 q73165617216569829103 = this.u;
        if (q73165617216569829103 == null) {
            dev.epro.r0.S10823041268949770285.b0("socket");
            throw null;
        }
        ((dev.epro.r0.L673873344574563461) q73165617216569829103.d).a.a().g(this.d);
        v13312380994896612392.l(g842859980338292746.c, str);
        v13312380994896612392.b();
        dev.epro.r0.O6225539295864356213 o6225539295864356213J = v13312380994896612392.j(false);
        o6225539295864356213J.getClass();
        o6225539295864356213J.a = g842859980338292746;
        dev.epro.r0.P10917817599008460069 p10917817599008460069A = o6225539295864356213J.a();
        int i = p10917817599008460069A.d;
        long jE = dev.epro.r0.C14766148968941961570.e(p10917817599008460069A);
        if (jE != -1) {
            dev.epro.r0.P4575683796390162177 p4575683796390162177K = v13312380994896612392.k(p10917817599008460069A.a.a, jE);
            dev.epro.r0.C14766148968941961570.g(p4575683796390162177K, Integer.MAX_VALUE);
            p4575683796390162177K.close();
        }
        if (i == 200) {
            return new dev.epro.r0.J14476340649358081657(this, (java.lang.Throwable) null, 6);
        }
        if (i != 407) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        l7308164961383861217.a.f.getClass();
        dev.epro.r0.Q11088980322693754445.h("Failed to authenticate with proxy");
        return null;
    }

    public final dev.epro.r0.A8512287753625267110 m(java.util.List list, javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            dev.epro.r0.I17300838719998789664 i17300838719998789664 = (dev.epro.r0.I17300838719998789664) list.get(i2);
            i17300838719998789664.getClass();
            if (i17300838719998789664.a && (((strArr = i17300838719998789664.d) == null || dev.epro.r0.L14928198200995638215.e(strArr, sSLSocket.getEnabledProtocols(), dev.epro.r0.J16924082299779570240.b)) && ((strArr2 = i17300838719998789664.c) == null || dev.epro.r0.L14928198200995638215.e(strArr2, sSLSocket.getEnabledCipherSuites(), dev.epro.r0.F2833317347889062771.c)))) {
                return l(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    public final dev.epro.r0.A8512287753625267110 n(java.util.List list, javax.net.ssl.SSLSocket sSLSocket, javax.net.ssl.SSLException sSLException) throws dev.epro.r0.A9104873785792518488 {
        if (this.f164o != null) {
            return null;
        }
        dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
        dev.epro.r0.Y5942596939223382942 y5942596939223382942F = dev.epro.r0.X4422675003582389573.a.f(sSLException);
        if (y5942596939223382942F != null) {
            javax.net.ssl.HostnameVerifier hostnameVerifier = this.j.a.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(y5942596939223382942F.a, sSLSocket.getSession())) {
                throw new dev.epro.r0.A9104873785792518488(dev.epro.r0.G6547577305291411977.u(new java.lang.StringBuilder("public_name '"), y5942596939223382942F.a, "' not verified"), sSLException);
            }
            dev.epro.r0.L7308164961383861217 l7308164961383861217 = this.j;
            return l(this, new dev.epro.r0.L7308164961383861217(l7308164961383861217.a, l7308164961383861217.b, l7308164961383861217.c, y5942596939223382942F.b), 0, false, y5942596939223382942F, 30);
        }
        if (!this.g) {
            return null;
        }
        if (((sSLException instanceof javax.net.ssl.SSLHandshakeException) && (sSLException.getCause() instanceof java.security.cert.CertificateException)) || (sSLException instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
            return null;
        }
        return m(list, sSLSocket);
    }

    public final dev.epro.r0.A8512287753625267110 o(java.util.List list, javax.net.ssl.SSLSocket sSLSocket) throws java.net.UnknownServiceException {
        if (this.m != -1) {
            return this;
        }
        dev.epro.r0.A8512287753625267110 a8512287753625267110M = m(list, sSLSocket);
        if (a8512287753625267110M != null) {
            return a8512287753625267110M;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        java.lang.String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        java.lang.String string = java.util.Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new java.net.UnknownServiceException(sb.toString());
    }

    public final void h() {
    }

    public final void b(dev.epro.r0.V5252629055842691065 v5252629055842691065, java.io.IOException iOException) {
    }
}
