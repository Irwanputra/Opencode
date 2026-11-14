package dev.epro.r0;

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T558270488962777544 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public T558270488962777544() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public static IOException a(T558270488962777544 t558270488962777544, long j, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            t558270488962777544.e(iOException);
        }
        if (z3) {
            Q16536459847538462718 q16536459847538462718 = ((V5252629055842691065) t558270488962777544.b).d;
            if (iOException != null) {
                q16536459847538462718.getClass();
            } else {
                Object obj = t558270488962777544.b;
                q16536459847538462718.getClass();
            }
        }
        if (z2) {
            Q16536459847538462718 q165364598475384627182 = ((V5252629055842691065) t558270488962777544.b).d;
            if (iOException != null) {
                q165364598475384627182.getClass();
            } else {
                q165364598475384627182.getClass();
            }
        }
        return ((V5252629055842691065) t558270488962777544.b).g(t558270488962777544, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public H3726261569308128079 b() {
        O4085430910208803047 o4085430910208803047G = ((R8365488887580997185) this.d).g();
        H3726261569308128079 h3726261569308128079 = o4085430910208803047G instanceof H3726261569308128079 ? (H3726261569308128079) o4085430910208803047G : null;
        if (h3726261569308128079 != null) {
            return h3726261569308128079;
        }
        S10973172697741180971.m("no connection for CONNECT tunnels");
        return null;
    }

    public J16788881807453904096 c(P10917817599008460069 p10917817599008460069) throws IOException {
        T558270488962777544 t558270488962777544;
        String strA;
        long jI;
        try {
            strA = p10917817599008460069.f.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            jI = ((R8365488887580997185) this.d).i(p10917817599008460069);
            t558270488962777544 = this;
        } catch (IOException e) {
            e = e;
            t558270488962777544 = this;
        }
        try {
            return new J16788881807453904096(strA, jI, new T13344602445187831655(new R174161856403953334(t558270488962777544, ((R8365488887580997185) this.d).h(p10917817599008460069), jI, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((V5252629055842691065) t558270488962777544.b).d.getClass();
            t558270488962777544.e(iOException);
            throw iOException;
        }
    }

    public O6225539295864356213 d(boolean z) throws IOException {
        try {
            O6225539295864356213 o6225539295864356213J = ((R8365488887580997185) this.d).j(z);
            if (o6225539295864356213J == null) {
                return o6225539295864356213J;
            }
            o6225539295864356213J.n = this;
            return o6225539295864356213J;
        } catch (IOException e) {
            ((V5252629055842691065) this.b).d.getClass();
            e(e);
            throw e;
        }
    }

    public void e(IOException iOException) {
        this.a = true;
        ((R8365488887580997185) this.d).g().b((V5252629055842691065) this.b, iOException);
    }

    public W8455343525638953052 f() throws SocketException {
        V5252629055842691065 v5252629055842691065 = (V5252629055842691065) this.b;
        if (v5252629055842691065.j) {
            S10973172697741180971.m("Check failed.");
            return null;
        }
        v5252629055842691065.j = true;
        v5252629055842691065.e.i();
        synchronized (v5252629055842691065) {
            if (v5252629055842691065.r == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (v5252629055842691065.n || v5252629055842691065.f545o) {
                throw new IllegalStateException("Check failed.");
            }
            if (v5252629055842691065.l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!v5252629055842691065.m) {
                throw new IllegalStateException("Check failed.");
            }
            v5252629055842691065.m = false;
            v5252629055842691065.n = true;
            v5252629055842691065.f545o = true;
        }
        O4085430910208803047 o4085430910208803047G = ((R8365488887580997185) this.d).g();
        o4085430910208803047G.getClass();
        H3726261569308128079 h3726261569308128079 = (H3726261569308128079) o4085430910208803047G;
        h3726261569308128079.e.setSoTimeout(0);
        h3726261569308128079.h();
        return new W8455343525638953052(this);
    }

    public void g(G842859980338292746 g842859980338292746) throws IOException {
        g842859980338292746.getClass();
        try {
            ((V5252629055842691065) this.b).d.getClass();
            ((R8365488887580997185) this.d).f(g842859980338292746);
            ((V5252629055842691065) this.b).d.getClass();
        } catch (IOException e) {
            ((V5252629055842691065) this.b).d.getClass();
            e(e);
            throw e;
        }
    }

    public T558270488962777544(V5252629055842691065 v5252629055842691065, B15682441012508903446 b15682441012508903446, R8365488887580997185 r8365488887580997185) {
        b15682441012508903446.getClass();
        this.b = v5252629055842691065;
        this.c = b15682441012508903446;
        this.d = r8365488887580997185;
    }

    public T558270488962777544(A8674383068150491476 a8674383068150491476, Y4203361013804869221 y4203361013804869221, B10711125991901730801 b10711125991901730801) {
        this.b = a8674383068150491476;
        this.c = y4203361013804869221;
        this.d = b10711125991901730801;
        this.a = true;
    }
}
