package dev.epro.r0;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N4061146215511977314 {
    public final V5252629055842691065 a;
    public final ArrayList b;
    public final int c;
    public final T558270488962777544 d;
    public final G842859980338292746 e;
    public final int f;
    public final int g;
    public final int h;
    public final P2382941533350862833 i;
    public final F12905216483416502853 j;
    public final H12843822278061842084 k;
    public final P2382941533350862833 l;
    public final X9690969695403731552 m;
    public final HostnameVerifier n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final P2382941533350862833 f386o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final M2066880349381062048 u;
    public int v;

    public N4061146215511977314(V5252629055842691065 v5252629055842691065, ArrayList arrayList, int i, T558270488962777544 t558270488962777544, G842859980338292746 g842859980338292746, int i2, int i3, int i4, P2382941533350862833 p2382941533350862833, F12905216483416502853 f12905216483416502853, H12843822278061842084 h12843822278061842084, P2382941533350862833 p23829415333508628332, X9690969695403731552 x9690969695403731552, HostnameVerifier hostnameVerifier, P2382941533350862833 p23829415333508628333, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, M2066880349381062048 m2066880349381062048) {
        g842859980338292746.getClass();
        p2382941533350862833.getClass();
        f12905216483416502853.getClass();
        h12843822278061842084.getClass();
        p23829415333508628332.getClass();
        x9690969695403731552.getClass();
        hostnameVerifier.getClass();
        p23829415333508628333.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = v5252629055842691065;
        this.b = arrayList;
        this.c = i;
        this.d = t558270488962777544;
        this.e = g842859980338292746;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = p2382941533350862833;
        this.j = f12905216483416502853;
        this.k = h12843822278061842084;
        this.l = p23829415333508628332;
        this.m = x9690969695403731552;
        this.n = hostnameVerifier;
        this.f386o = p23829415333508628333;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = m2066880349381062048;
    }

    public static N4061146215511977314 a(N4061146215511977314 n4061146215511977314, int i, T558270488962777544 t558270488962777544, G842859980338292746 g842859980338292746, int i2) {
        int i3 = (i2 & 1) != 0 ? n4061146215511977314.c : i;
        T558270488962777544 t5582704889627775442 = (i2 & 2) != 0 ? n4061146215511977314.d : t558270488962777544;
        G842859980338292746 g8428599803382927462 = (i2 & 4) != 0 ? n4061146215511977314.e : g842859980338292746;
        int i4 = n4061146215511977314.f;
        int i5 = n4061146215511977314.g;
        int i6 = n4061146215511977314.h;
        P2382941533350862833 p2382941533350862833 = n4061146215511977314.i;
        F12905216483416502853 f12905216483416502853 = n4061146215511977314.j;
        H12843822278061842084 h12843822278061842084 = n4061146215511977314.k;
        P2382941533350862833 p23829415333508628332 = n4061146215511977314.l;
        X9690969695403731552 x9690969695403731552 = n4061146215511977314.m;
        HostnameVerifier hostnameVerifier = n4061146215511977314.n;
        P2382941533350862833 p23829415333508628333 = n4061146215511977314.f386o;
        ProxySelector proxySelector = n4061146215511977314.p;
        boolean z = n4061146215511977314.q;
        SocketFactory socketFactory = n4061146215511977314.r;
        SSLSocketFactory sSLSocketFactory = n4061146215511977314.s;
        X509TrustManager x509TrustManager = n4061146215511977314.t;
        M2066880349381062048 m2066880349381062048 = n4061146215511977314.u;
        g8428599803382927462.getClass();
        p2382941533350862833.getClass();
        f12905216483416502853.getClass();
        h12843822278061842084.getClass();
        p23829415333508628332.getClass();
        x9690969695403731552.getClass();
        hostnameVerifier.getClass();
        p23829415333508628333.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new N4061146215511977314(n4061146215511977314.a, n4061146215511977314.b, i3, t5582704889627775442, g8428599803382927462, i4, i5, i6, p2382941533350862833, f12905216483416502853, h12843822278061842084, p23829415333508628332, x9690969695403731552, hostnameVerifier, p23829415333508628333, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, m2066880349381062048);
    }

    public final P10917817599008460069 b(G842859980338292746 g842859980338292746) {
        g842859980338292746.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            S10973172697741180971.m("Check failed.");
            return null;
        }
        this.v++;
        T558270488962777544 t558270488962777544 = this.d;
        if (t558270488962777544 != null) {
            T15985366153370019177 t15985366153370019177C = ((B15682441012508903446) t558270488962777544.c).c();
            P10208541982779414550 p10208541982779414550 = g842859980338292746.a;
            t15985366153370019177C.getClass();
            p10208541982779414550.getClass();
            P10208541982779414550 p102085419827794145502 = t15985366153370019177C.i.h;
            if (p10208541982779414550.e != p102085419827794145502.e || !S10823041268949770285.t(p10208541982779414550.d, p102085419827794145502.d)) {
                D11988991656201568495.m("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.v != 1) {
                D11988991656201568495.m("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        N4061146215511977314 n4061146215511977314A = a(this, i2, null, g842859980338292746, 2097146);
        E16285158603488107888 e16285158603488107888 = (E16285158603488107888) arrayList.get(i);
        P10917817599008460069 p10917817599008460069Intercept = e16285158603488107888.intercept(n4061146215511977314A);
        if (p10917817599008460069Intercept == null) {
            throw new NullPointerException("interceptor " + e16285158603488107888 + " returned null");
        }
        if (t558270488962777544 == null || i2 >= arrayList.size() || n4061146215511977314A.v == 1) {
            return p10917817599008460069Intercept;
        }
        D11988991656201568495.m("network interceptor ", e16285158603488107888, " must call proceed() exactly once");
        return null;
    }
}
