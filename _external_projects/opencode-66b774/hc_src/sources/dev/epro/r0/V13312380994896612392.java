package dev.epro.r0;

import java.io.EOFException;
import java.net.Proxy;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V13312380994896612392 implements R8365488887580997185 {
    public static final F12902864952249894497 f;
    public final K5458285210510848811 a;
    public final O4085430910208803047 b;
    public final Q7316561721656982910 c;
    public byte d;
    public final P11184147566986477297 e;

    static {
        F12902864952249894497 f12902864952249894497 = F12902864952249894497.b;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            S10973172697741180971.j("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                S10973172697741180971.j("Headers cannot be null");
                return;
            }
            strArr2[i2] = M8927913404651150384.D0(strArr[i2]).toString();
        }
        int P = T18016951143603335921.P(0, strArr2.length - 1, 2);
        if (P >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                X7410747940286448830.k(str);
                X7410747940286448830.l(str2, str);
                if (i == P) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f = new F12902864952249894497(strArr2);
    }

    public V13312380994896612392(K5458285210510848811 k5458285210510848811, O4085430910208803047 o4085430910208803047, Q7316561721656982910 q7316561721656982910) {
        q7316561721656982910.getClass();
        this.a = k5458285210510848811;
        this.b = o4085430910208803047;
        this.c = q7316561721656982910;
        T13344602445187831655 t13344602445187831655 = (T13344602445187831655) q7316561721656982910.c;
        P11184147566986477297 p11184147566986477297 = new P11184147566986477297();
        p11184147566986477297.b = t13344602445187831655;
        p11184147566986477297.a = 262144L;
        this.e = p11184147566986477297;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final U10510841700634832156 a(G842859980338292746 g842859980338292746, long j) {
        g842859980338292746.getClass();
        if ("chunked".equalsIgnoreCase(g842859980338292746.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = (byte) 2;
                return new V16875916958359145989(this);
            }
            D11988991656201568495.q(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            S10973172697741180971.m("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = (byte) 2;
            return new J9716453200335353630(this);
        }
        D11988991656201568495.q(this.d, "state: ");
        return null;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void b() {
        ((L673873344574563461) this.c.d).flush();
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final boolean c() {
        return this.d == 6;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void cancel() {
        this.b.cancel();
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void d() {
        ((L673873344574563461) this.c.d).flush();
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final L6498280162989651404 e() {
        return this.c;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final void f(G842859980338292746 g842859980338292746) {
        g842859980338292746.getClass();
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(g842859980338292746.b);
        sb.append(' ');
        P10208541982779414550 p10208541982779414550 = g842859980338292746.a;
        if (S10823041268949770285.t(p10208541982779414550.a, "https") || type != Proxy.Type.HTTP) {
            String b = p10208541982779414550.b();
            String d = p10208541982779414550.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(p10208541982779414550);
        }
        sb.append(" HTTP/1.1");
        l(g842859980338292746.c, sb.toString());
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final O4085430910208803047 g() {
        return this.b;
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final S7370861580758580261 h(P10917817599008460069 p10917817599008460069) {
        G842859980338292746 g842859980338292746 = p10917817599008460069.a;
        if (!J4204243423487919855.a(p10917817599008460069)) {
            return k(g842859980338292746.a, 0L);
        }
        String a = p10917817599008460069.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            P10208541982779414550 p10208541982779414550 = g842859980338292746.a;
            if (this.d == 4) {
                this.d = (byte) 5;
                return new Z1569018999417763290(this, p10208541982779414550);
            }
            D11988991656201568495.q(this.d, "state: ");
            return null;
        }
        long e = C14766148968941961570.e(p10917817599008460069);
        if (e != -1) {
            return k(g842859980338292746.a, e);
        }
        P10208541982779414550 p102085419827794145502 = g842859980338292746.a;
        if (this.d != 4) {
            D11988991656201568495.q(this.d, "state: ");
            return null;
        }
        this.d = (byte) 5;
        this.b.h();
        p102085419827794145502.getClass();
        return new N12634487253252232083(this, p102085419827794145502);
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final long i(P10917817599008460069 p10917817599008460069) {
        if (!J4204243423487919855.a(p10917817599008460069)) {
            return 0L;
        }
        String a = p10917817599008460069.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return C14766148968941961570.e(p10917817599008460069);
    }

    @Override // dev.epro.r0.R8365488887580997185
    public final O6225539295864356213 j(boolean z) {
        P11184147566986477297 p11184147566986477297 = this.e;
        byte b = this.d;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            D11988991656201568495.q(this.d, "state: ");
            return null;
        }
        try {
            String o2 = ((T13344602445187831655) p11184147566986477297.b).o(p11184147566986477297.a);
            p11184147566986477297.a -= o2.length();
            N12245111110189169079 k = E14308387479134424328.k(o2);
            int i = k.b;
            O6225539295864356213 o6225539295864356213 = new O6225539295864356213();
            o6225539295864356213.b = (P10544952747155442696) k.c;
            o6225539295864356213.c = i;
            o6225539295864356213.d = (String) k.d;
            o6225539295864356213.f = X7410747940286448830.f(p11184147566986477297.c());
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.d = (byte) 3;
                return o6225539295864356213;
            }
            if (102 > i || i >= 200) {
                this.d = (byte) 4;
                return o6225539295864356213;
            }
            this.d = (byte) 3;
            return o6225539295864356213;
        } catch (EOFException e) {
            Z3383101362411723454.q("unexpected end of stream on ".concat(this.b.f().a.h.f()), e);
            return null;
        }
    }

    public final P4575683796390162177 k(P10208541982779414550 p10208541982779414550, long j) {
        if (this.d == 4) {
            this.d = (byte) 5;
            return new P4575683796390162177(this, p10208541982779414550, j);
        }
        D11988991656201568495.q(this.d, "state: ");
        return null;
    }

    public final void l(F12902864952249894497 f12902864952249894497, String str) {
        if (this.d != 0) {
            D11988991656201568495.q(this.d, "state: ");
            return;
        }
        Q7316561721656982910 q7316561721656982910 = this.c;
        L673873344574563461 l673873344574563461 = (L673873344574563461) q7316561721656982910.d;
        l673873344574563461.t(str);
        l673873344574563461.t("\r\n");
        int size = f12902864952249894497.size();
        int i = 0;
        while (true) {
            L673873344574563461 l6738733445745634612 = (L673873344574563461) q7316561721656982910.d;
            if (i >= size) {
                l6738733445745634612.t("\r\n");
                this.d = (byte) 1;
                return;
            } else {
                l6738733445745634612.t(X7410747940286448830.e(f12902864952249894497, i));
                l6738733445745634612.t(": ");
                l6738733445745634612.t(X7410747940286448830.g(f12902864952249894497, i));
                l6738733445745634612.t("\r\n");
                i++;
            }
        }
    }
}
