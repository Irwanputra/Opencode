package dev.epro.r0;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(dev.epro.r0.N1214788596583503619 r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
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
        long jNanoTime = System.nanoTime();
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
                    if (jNanoTime >= a13573370436844979007.f150o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
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

    public final void i() throws SocketException {
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
                            P5586796822028136504 p5586796822028136504Z = p5176232750190581838.z(2);
                            byte[] bArr = p5586796822028136504Z.a;
                            int i2 = p5586796822028136504Z.c;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            p5586796822028136504Z.c = i2 + 2;
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
