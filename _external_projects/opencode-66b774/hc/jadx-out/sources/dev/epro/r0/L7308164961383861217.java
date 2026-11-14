package dev.epro.r0;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L7308164961383861217 {
    public final N1214788596583503619 a;
    public final Proxy b;
    public final InetSocketAddress c;
    public final P5124777957357031757 d;

    public L7308164961383861217(N1214788596583503619 n1214788596583503619, Proxy proxy, InetSocketAddress inetSocketAddress, P5124777957357031757 p5124777957357031757) {
        n1214788596583503619.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = n1214788596583503619;
        this.b = proxy;
        this.c = inetSocketAddress;
        this.d = p5124777957357031757;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L7308164961383861217)) {
            return false;
        }
        L7308164961383861217 l7308164961383861217 = (L7308164961383861217) obj;
        return S10823041268949770285.t(l7308164961383861217.a, this.a) && S10823041268949770285.t(l7308164961383861217.b, this.b) && S10823041268949770285.t(l7308164961383861217.c, this.c) && S10823041268949770285.t(l7308164961383861217.d, this.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31;
        P5124777957357031757 p5124777957357031757 = this.d;
        return iHashCode + (p5124777957357031757 != null ? p5124777957357031757.hashCode() : 0);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        N1214788596583503619 n1214788596583503619 = this.a;
        P10208541982779414550 p10208541982779414550 = n1214788596583503619.h;
        P10208541982779414550 p102085419827794145502 = n1214788596583503619.h;
        String str = p10208541982779414550.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : A4349945402702183291.b(hostAddress);
        if (M8927913404651150384.M(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (p102085419827794145502.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(p102085419827794145502.e);
        }
        if (!str.equals(strB)) {
            if (S10823041268949770285.t(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (M8927913404651150384.M(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        if (this.d != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }
}
