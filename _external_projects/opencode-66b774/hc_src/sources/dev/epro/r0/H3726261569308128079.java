package dev.epro.r0;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H3726261569308128079 extends P2679692661144251490 implements O4085430910208803047 {
    public final M10634075818626712574 b;
    public final L7308164961383861217 c;
    public final Socket d;
    public final Socket e;
    public final F3187248827616951674 f;
    public final P10544952747155442696 g;
    public final Q7316561721656982910 h;
    public A13573370436844979007 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f272o;
    public final ArrayList p;
    public long q;

    public H3726261569308128079(M10634075818626712574 m10634075818626712574, J9884070742191057945 j9884070742191057945, L7308164961383861217 l7308164961383861217, Socket socket, Socket socket2, F3187248827616951674 f3187248827616951674, P10544952747155442696 p10544952747155442696, Q7316561721656982910 q7316561721656982910) {
        m10634075818626712574.getClass();
        l7308164961383861217.getClass();
        socket.getClass();
        socket2.getClass();
        p10544952747155442696.getClass();
        q7316561721656982910.getClass();
        this.b = m10634075818626712574;
        this.c = l7308164961383861217;
        this.d = socket;
        this.e = socket2;
        this.f = f3187248827616951674;
        this.g = p10544952747155442696;
        this.h = q7316561721656982910;
        this.f272o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(K5458285210510848811 k5458285210510848811, L7308164961383861217 l7308164961383861217, IOException iOException) {
        k5458285210510848811.getClass();
        l7308164961383861217.getClass();
        iOException.getClass();
        if (l7308164961383861217.b.type() != Proxy.Type.DIRECT) {
            N1214788596583503619 n1214788596583503619 = l7308164961383861217.a;
            n1214788596583503619.g.connectFailed(n1214788596583503619.h.g(), l7308164961383861217.b.address(), iOException);
        }
        M9197813449740923653 m9197813449740923653 = k5458285210510848811.B;
        synchronized (m9197813449740923653) {
            ((LinkedHashSet) m9197813449740923653.b).add(l7308164961383861217);
        }
    }

    @Override // dev.epro.r0.P2679692661144251490
    public final void a(A13573370436844979007 a13573370436844979007, P15116306960523597113 p15116306960523597113) {
        p15116306960523597113.getClass();
        synchronized (this) {
            this.f272o = (p15116306960523597113.a & 8) != 0 ? p15116306960523597113.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final void b(V5252629055842691065 v5252629055842691065, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof L12800179862900820669)) {
                    if (!(this.i != null) || (iOException instanceof S8252648394274132723)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                d(v5252629055842691065.a, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((L12800179862900820669) iOException).a == N10274084507843431211.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((L12800179862900820669) iOException).a != N10274084507843431211.CANCEL || !v5252629055842691065.q) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final void cancel() {
        C14766148968941961570.c(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (dev.epro.r0.Q14852350147222728147.c(r1, (java.security.cert.X509Certificate) r8) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(dev.epro.r0.N1214788596583503619 r9, java.util.List r10) {
        /*
            r8 = this;
            dev.epro.r0.P10208541982779414550 r0 = r9.h
            java.lang.String r1 = r0.d
            java.util.TimeZone r2 = dev.epro.r0.C14766148968941961570.a
            java.util.ArrayList r2 = r8.p
            int r2 = r2.size()
            int r3 = r8.f272o
            r4 = 0
            if (r2 >= r3) goto Ld4
            boolean r2 = r8.j
            if (r2 == 0) goto L17
            goto Ld4
        L17:
            dev.epro.r0.L7308164961383861217 r2 = r8.c
            dev.epro.r0.N1214788596583503619 r3 = r2.a
            dev.epro.r0.N1214788596583503619 r5 = r2.a
            boolean r3 = r3.a(r9)
            if (r3 != 0) goto L25
            goto Ld4
        L25:
            dev.epro.r0.P10208541982779414550 r3 = r5.h
            java.lang.String r3 = r3.d
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r1, r3)
            if (r3 == 0) goto L31
            goto Lc9
        L31:
            dev.epro.r0.A13573370436844979007 r3 = r8.i
            if (r3 != 0) goto L37
            goto Ld4
        L37:
            if (r10 == 0) goto Ld4
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L41
            goto Ld4
        L41:
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld4
            java.lang.Object r3 = r10.next()
            dev.epro.r0.L7308164961383861217 r3 = (dev.epro.r0.L7308164961383861217) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L45
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L45
            java.net.InetSocketAddress r6 = r2.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r6, r3)
            if (r3 == 0) goto L45
            javax.net.ssl.HostnameVerifier r10 = r9.d
            dev.epro.r0.Q14852350147222728147 r2 = dev.epro.r0.Q14852350147222728147.a
            if (r10 == r2) goto L74
            goto Ld4
        L74:
            java.util.TimeZone r10 = dev.epro.r0.C14766148968941961570.a
            dev.epro.r0.P10208541982779414550 r10 = r5.h
            int r0 = r0.e
            int r2 = r10.e
            if (r0 == r2) goto L7f
            goto Ld4
        L7f:
            java.lang.String r10 = r10.d
            boolean r10 = dev.epro.r0.S10823041268949770285.t(r1, r10)
            dev.epro.r0.F3187248827616951674 r0 = r8.f
            if (r10 == 0) goto L8a
            goto La9
        L8a:
            boolean r8 = r8.k
            if (r8 != 0) goto Ld4
            if (r0 == 0) goto Ld4
            java.util.List r8 = r0.a()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ld4
            java.lang.Object r8 = r8.get(r4)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = dev.epro.r0.Q14852350147222728147.c(r1, r8)
            if (r8 == 0) goto Ld4
        La9:
            dev.epro.r0.F12905216483416502853 r8 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.List r9 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r1.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.Set r8 = r8.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            if (r9 != 0) goto Lcb
        Lc9:
            r8 = 1
            return r8
        Lcb:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            dev.epro.r0.L11610354117192841236.y(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H3726261569308128079.e(dev.epro.r0.N1214788596583503619, java.util.List):boolean");
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final L7308164961383861217 f() {
        return this.c;
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = C14766148968941961570.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        A13573370436844979007 a13573370436844979007 = this.i;
        if (a13573370436844979007 != null) {
            synchronized (a13573370436844979007) {
                if (a13573370436844979007.f) {
                    return false;
                }
                if (a13573370436844979007.n < a13573370436844979007.m) {
                    if (nanoTime >= a13573370436844979007.f150o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        T13344602445187831655 t13344602445187831655 = (T13344602445187831655) this.h.c;
        socket.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !t13344602445187831655.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // dev.epro.r0.O4085430910208803047
    public final void h() {
        synchronized (this) {
            this.j = true;
        }
    }

    public final void i() {
        this.q = System.nanoTime();
        P10544952747155442696 p10544952747155442696 = this.g;
        if (p10544952747155442696 == P10544952747155442696.HTTP_2 || p10544952747155442696 == P10544952747155442696.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            B14824868959299866349 b14824868959299866349 = B14824868959299866349.d;
            R7318511160048941271 r7318511160048941271 = R7318511160048941271.a;
            M10634075818626712574 m10634075818626712574 = this.b;
            m10634075818626712574.getClass();
            I1581330382723795749 i1581330382723795749 = new I1581330382723795749();
            i1581330382723795749.a = m10634075818626712574;
            i1581330382723795749.d = P2679692661144251490.a;
            i1581330382723795749.e = R7318511160048941271.a;
            Q7316561721656982910 q7316561721656982910 = this.h;
            String str = this.c.a.h.d;
            q7316561721656982910.getClass();
            str.getClass();
            i1581330382723795749.b = q7316561721656982910;
            i1581330382723795749.c = C14766148968941961570.b + ' ' + str;
            i1581330382723795749.d = this;
            i1581330382723795749.e = r7318511160048941271;
            A13573370436844979007 a13573370436844979007 = new A13573370436844979007(i1581330382723795749);
            this.i = a13573370436844979007;
            P15116306960523597113 p15116306960523597113 = A13573370436844979007.z;
            this.f272o = (p15116306960523597113.a & 8) != 0 ? p15116306960523597113.b[3] : Integer.MAX_VALUE;
            R13387896995173874905 r13387896995173874905 = a13573370436844979007.w;
            synchronized (r13387896995173874905) {
                if (r13387896995173874905.d) {
                    throw new IOException("closed");
                }
                Level level = Level.FINE;
                L673873344574563461 l673873344574563461 = r13387896995173874905.a;
                P5124777957357031757 p5124777957357031757 = K15662838989169835869.a;
                p5124777957357031757.getClass();
                if (l673873344574563461.c) {
                    throw new IllegalStateException("closed");
                }
                l673873344574563461.b.B(p5124777957357031757);
                l673873344574563461.b();
                r13387896995173874905.a.flush();
            }
            R13387896995173874905 r133878969951738749052 = a13573370436844979007.w;
            P15116306960523597113 p151163069605235971132 = a13573370436844979007.q;
            r133878969951738749052.getClass();
            p151163069605235971132.getClass();
            synchronized (r133878969951738749052) {
                try {
                    if (r133878969951738749052.d) {
                        throw new IOException("closed");
                    }
                    r133878969951738749052.d(0, Integer.bitCount(p151163069605235971132.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & p151163069605235971132.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            L673873344574563461 l6738733445745634612 = r133878969951738749052.a;
                            if (l6738733445745634612.c) {
                                throw new IllegalStateException("closed");
                            }
                            P5176232750190581838 p5176232750190581838 = l6738733445745634612.b;
                            P5586796822028136504 z2 = p5176232750190581838.z(2);
                            byte[] bArr = z2.a;
                            int i2 = z2.c;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            z2.c = i2 + 2;
                            p5176232750190581838.b += 2;
                            l6738733445745634612.b();
                            r133878969951738749052.a.d(p151163069605235971132.b[i]);
                        }
                    }
                    r133878969951738749052.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (a13573370436844979007.q.a() != 65535) {
                a13573370436844979007.w.o(0, r11 - 65535);
            }
            Z9658010704151025794.b(a13573370436844979007.g.d(), a13573370436844979007.c, a13573370436844979007.x);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        L7308164961383861217 l7308164961383861217 = this.c;
        sb.append(l7308164961383861217.a.h.d);
        sb.append(':');
        sb.append(l7308164961383861217.a.h.e);
        sb.append(", proxy=");
        sb.append(l7308164961383861217.b);
        sb.append(" hostAddress=");
        sb.append(l7308164961383861217.c);
        sb.append(" cipherSuite=");
        F3187248827616951674 f3187248827616951674 = this.f;
        sb.append(f3187248827616951674 != null ? f3187248827616951674.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
