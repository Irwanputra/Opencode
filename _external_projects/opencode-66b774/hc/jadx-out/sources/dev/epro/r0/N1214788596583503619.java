package dev.epro.r0;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N1214788596583503619 {
    public final X9690969695403731552 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final F12905216483416502853 e;
    public final P2382941533350862833 f;
    public final ProxySelector g;
    public final P10208541982779414550 h;
    public final List i;
    public final List j;

    public N1214788596583503619(String str, int i, X9690969695403731552 x9690969695403731552, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, F12905216483416502853 f12905216483416502853, P2382941533350862833 p2382941533350862833, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        x9690969695403731552.getClass();
        socketFactory.getClass();
        p2382941533350862833.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = x9690969695403731552;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = f12905216483416502853;
        this.f = p2382941533350862833;
        this.g = proxySelector;
        Z17877815202129479382 z17877815202129479382 = new Z17877815202129479382();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            z17877815202129479382.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                S10973172697741180971.j("unexpected scheme: ".concat(str2));
                throw null;
            }
            z17877815202129479382.a = "https";
        }
        String strB = A4349945402702183291.b(R7033599853981556291.L(str, 0, 0, 7));
        if (strB == null) {
            S10973172697741180971.j("unexpected host: ".concat(str));
            throw null;
        }
        z17877815202129479382.d = strB;
        if (1 > i || i >= 65536) {
            S10973172697741180971.i(G6547577305291411977.n(i, "unexpected port: "));
            throw null;
        }
        z17877815202129479382.e = i;
        this.h = z17877815202129479382.a();
        this.i = C14766148968941961570.j(list);
        this.j = C14766148968941961570.j(list2);
    }

    public final boolean a(N1214788596583503619 n1214788596583503619) {
        return S10823041268949770285.t(this.a, n1214788596583503619.a) && S10823041268949770285.t(this.f, n1214788596583503619.f) && this.i.equals(n1214788596583503619.i) && this.j.equals(n1214788596583503619.j) && S10823041268949770285.t(this.g, n1214788596583503619.g) && S10823041268949770285.t(this.c, n1214788596583503619.c) && S10823041268949770285.t(this.d, n1214788596583503619.d) && S10823041268949770285.t(this.e, n1214788596583503619.e) && this.h.e == n1214788596583503619.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N1214788596583503619)) {
            return false;
        }
        N1214788596583503619 n1214788596583503619 = (N1214788596583503619) obj;
        return this.h.equals(n1214788596583503619.h) && a(n1214788596583503619);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + G6547577305291411977.h(G6547577305291411977.h((this.f.hashCode() + ((this.a.hashCode() + E12098517352909843120.h(527, 31, this.h.h)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        P10208541982779414550 p10208541982779414550 = this.h;
        sb.append(p10208541982779414550.d);
        sb.append(':');
        sb.append(p10208541982779414550.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
