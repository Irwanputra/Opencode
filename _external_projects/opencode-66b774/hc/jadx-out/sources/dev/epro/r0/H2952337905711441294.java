package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H2952337905711441294 implements R8365488887580997185 {
    public static final List g = C14766148968941961570.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = C14766148968941961570.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final H3726261569308128079 a;
    public final N4061146215511977314 b;
    public final A13573370436844979007 c;
    public volatile W10382756971622296125 d;
    public final P10544952747155442696 e;
    public volatile boolean f;

    public H2952337905711441294(K5458285210510848811 k5458285210510848811, H3726261569308128079 h3726261569308128079, N4061146215511977314 n4061146215511977314, A13573370436844979007 a13573370436844979007) {
        k5458285210510848811.getClass();
        a13573370436844979007.getClass();
        this.a = h3726261569308128079;
        this.b = n4061146215511977314;
        this.c = a13573370436844979007;
        List list = k5458285210510848811.r;
        P10544952747155442696 p10544952747155442696 = P10544952747155442696.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(p10544952747155442696) ? p10544952747155442696 : P10544952747155442696.HTTP_2;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final U10510841700634832156 a(G842859980338292746 g842859980338292746, long j) {
        g842859980338292746.getClass();
        W10382756971622296125 w10382756971622296125 = this.d;
        w10382756971622296125.getClass();
        return w10382756971622296125.i;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void b() {
        W10382756971622296125 w10382756971622296125 = this.d;
        w10382756971622296125.getClass();
        w10382756971622296125.i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // dev.epro.r0.R8365488887580997185
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r4 = this;
            dev.epro.r0.W10382756971622296125 r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            dev.epro.r0.A6352962637471496627 r1 = r4.h     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.b     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            dev.epro.r0.P5176232750190581838 r1 = r1.d     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H2952337905711441294.c():boolean");
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void cancel() {
        this.f = true;
        W10382756971622296125 w10382756971622296125 = this.d;
        if (w10382756971622296125 != null) {
            w10382756971622296125.f(N10274084507843431211.CANCEL);
        }
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void d() {
        this.c.w.flush();
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final L6498280162989651404 e() {
        W10382756971622296125 w10382756971622296125 = this.d;
        w10382756971622296125.getClass();
        return w10382756971622296125;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void f(G842859980338292746 g842859980338292746) throws IOException {
        int i;
        W10382756971622296125 w10382756971622296125;
        boolean z;
        g842859980338292746.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = g842859980338292746.d != null;
        F12902864952249894497 f12902864952249894497 = g842859980338292746.c;
        ArrayList arrayList = new ArrayList(f12902864952249894497.size() + 4);
        arrayList.add(new O12229768880637238015(O12229768880637238015.f, g842859980338292746.b));
        P5124777957357031757 p5124777957357031757 = O12229768880637238015.g;
        P10208541982779414550 p10208541982779414550 = g842859980338292746.a;
        p10208541982779414550.getClass();
        String strB = p10208541982779414550.b();
        String strD = p10208541982779414550.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new O12229768880637238015(p5124777957357031757, strB));
        String strA = f12902864952249894497.a("Host");
        if (strA != null) {
            arrayList.add(new O12229768880637238015(O12229768880637238015.i, strA));
        }
        arrayList.add(new O12229768880637238015(O12229768880637238015.h, p10208541982779414550.a));
        int size = f12902864952249894497.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strE = X7410747940286448830.e(f12902864952249894497, i2);
            Locale locale = Locale.US;
            String strJ = G11450220448113054352.j(locale, strE, locale);
            if (!g.contains(strJ) || (strJ.equals("te") && X7410747940286448830.g(f12902864952249894497, i2).equals("trailers"))) {
                arrayList.add(new O12229768880637238015(strJ, X7410747940286448830.g(f12902864952249894497, i2)));
            }
        }
        A13573370436844979007 a13573370436844979007 = this.c;
        a13573370436844979007.getClass();
        boolean z3 = !z2;
        synchronized (a13573370436844979007.w) {
            synchronized (a13573370436844979007) {
                try {
                    if (a13573370436844979007.e > 1073741823) {
                        a13573370436844979007.e(N10274084507843431211.REFUSED_STREAM);
                    }
                    if (a13573370436844979007.f) {
                        throw new S8252648394274132723();
                    }
                    i = a13573370436844979007.e;
                    a13573370436844979007.e = i + 2;
                    w10382756971622296125 = new W10382756971622296125(i, a13573370436844979007, z3, false, null);
                    z = !z2 || a13573370436844979007.t >= a13573370436844979007.u || w10382756971622296125.d >= w10382756971622296125.e;
                    if (w10382756971622296125.j()) {
                        a13573370436844979007.b.put(Integer.valueOf(i), w10382756971622296125);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a13573370436844979007.w.g(z3, i, arrayList);
        }
        if (z) {
            a13573370436844979007.w.flush();
        }
        this.d = w10382756971622296125;
        boolean z4 = this.f;
        W10382756971622296125 w103827569716222961252 = this.d;
        if (z4) {
            w103827569716222961252.getClass();
            w103827569716222961252.f(N10274084507843431211.CANCEL);
            Q11088980322693754445.h("Canceled");
        } else {
            w103827569716222961252.getClass();
            w103827569716222961252.j.g(this.b.g);
            W10382756971622296125 w103827569716222961253 = this.d;
            w103827569716222961253.getClass();
            w103827569716222961253.k.g(this.b.h);
        }
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final O4085430910208803047 g() {
        return this.a;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final S7370861580758580261 h(P10917817599008460069 p10917817599008460069) {
        W10382756971622296125 w10382756971622296125 = this.d;
        w10382756971622296125.getClass();
        return w10382756971622296125.h;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final long i(P10917817599008460069 p10917817599008460069) {
        if (J4204243423487919855.a(p10917817599008460069)) {
            return C14766148968941961570.e(p10917817599008460069);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // dev.epro.r0.R8365488887580997185
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.O6225539295864356213 j(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H2952337905711441294.j(boolean):dev.epro.r0.O6225539295864356213");
    }
}
