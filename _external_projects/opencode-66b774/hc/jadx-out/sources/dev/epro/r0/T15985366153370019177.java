package dev.epro.r0;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T15985366153370019177 {
    public final M10634075818626712574 a;
    public final J9884070742191057945 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final N1214788596583503619 i;
    public final M9197813449740923653 j;
    public final V5252629055842691065 k;
    public final boolean l;
    public T17032536773975598836 m;
    public L13631305552474926529 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L7308164961383861217 f498o;
    public final N11678082982039175888 p;

    public T15985366153370019177(M10634075818626712574 m10634075818626712574, J9884070742191057945 j9884070742191057945, int i, int i2, int i3, int i4, boolean z, boolean z2, N1214788596583503619 n1214788596583503619, M9197813449740923653 m9197813449740923653, V5252629055842691065 v5252629055842691065, G842859980338292746 g842859980338292746) {
        m10634075818626712574.getClass();
        m9197813449740923653.getClass();
        this.a = m10634075818626712574;
        this.b = j9884070742191057945;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = n1214788596583503619;
        this.j = m9197813449740923653;
        this.k = v5252629055842691065;
        this.l = !S10823041268949770285.t(g842859980338292746.b, "GET");
        this.p = new N11678082982039175888();
    }

    public final boolean a(H3726261569308128079 h3726261569308128079) {
        L13631305552474926529 l13631305552474926529;
        L7308164961383861217 l7308164961383861217;
        if (this.p.isEmpty() && this.f498o == null) {
            if (h3726261569308128079 != null) {
                synchronized (h3726261569308128079) {
                    l7308164961383861217 = null;
                    if (h3726261569308128079.l == 0 && h3726261569308128079.j && C14766148968941961570.a(h3726261569308128079.c.a.h, this.i.h)) {
                        l7308164961383861217 = h3726261569308128079.c;
                    }
                }
                if (l7308164961383861217 != null) {
                    this.f498o = l7308164961383861217;
                    return true;
                }
            }
            T17032536773975598836 t17032536773975598836 = this.m;
            if ((t17032536773975598836 == null || t17032536773975598836.a >= ((ArrayList) t17032536773975598836.b).size()) && (l13631305552474926529 = this.n) != null) {
                return l13631305552474926529.a();
            }
        }
        return true;
    }

    public final P11191550465322624469 b() {
        Socket socketI;
        O7265813552375631487 o7265813552375631487;
        A8512287753625267110 a8512287753625267110C;
        String hostAddress;
        int port;
        List<L7308164961383861217> listV;
        boolean zContains;
        H3726261569308128079 h3726261569308128079 = this.k.i;
        if (h3726261569308128079 == null) {
            o7265813552375631487 = null;
        } else {
            boolean zG = h3726261569308128079.g(this.l);
            synchronized (h3726261569308128079) {
                boolean z = h3726261569308128079.j;
                try {
                    if (!zG) {
                        h3726261569308128079.j = true;
                        socketI = this.k.i();
                    } else if (!z) {
                        P10208541982779414550 p10208541982779414550 = h3726261569308128079.c.a.h;
                        P10208541982779414550 p102085419827794145502 = this.i.h;
                        socketI = !(p10208541982779414550.e == p102085419827794145502.e && S10823041268949770285.t(p10208541982779414550.d, p102085419827794145502.d)) ? this.k.i() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.i == null) {
                if (socketI != null) {
                    C14766148968941961570.c(socketI);
                }
                this.k.d.getClass();
                o7265813552375631487 = null;
            } else {
                if (socketI != null) {
                    S10973172697741180971.m("Check failed.");
                    return null;
                }
                o7265813552375631487 = new O7265813552375631487(h3726261569308128079);
            }
        }
        if (o7265813552375631487 != null) {
            return o7265813552375631487;
        }
        O7265813552375631487 o7265813552375631487D = d(null, null);
        if (o7265813552375631487D != null) {
            return o7265813552375631487D;
        }
        if (!this.p.isEmpty()) {
            return (P11191550465322624469) this.p.removeFirst();
        }
        L7308164961383861217 l7308164961383861217 = this.f498o;
        if (l7308164961383861217 != null) {
            this.f498o = null;
            a8512287753625267110C = c(l7308164961383861217, null);
        } else {
            T17032536773975598836 t17032536773975598836 = this.m;
            if (t17032536773975598836 == null || t17032536773975598836.a >= ((ArrayList) t17032536773975598836.b).size()) {
                L13631305552474926529 l13631305552474926529 = this.n;
                if (l13631305552474926529 == null) {
                    l13631305552474926529 = new L13631305552474926529(this.i, this.j, this.k, this.h);
                    this.n = l13631305552474926529;
                }
                if (!l13631305552474926529.a()) {
                    Q11088980322693754445.h("exhausted all routes");
                    return null;
                }
                if (!l13631305552474926529.a()) {
                    Z3383101362411723454.u();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (l13631305552474926529.f < l13631305552474926529.e.size()) {
                    if (l13631305552474926529.f >= l13631305552474926529.e.size()) {
                        throw new SocketException("No route to " + l13631305552474926529.a.h.d + "; exhausted proxy configurations: " + l13631305552474926529.e);
                    }
                    List list = l13631305552474926529.e;
                    int i = l13631305552474926529.f;
                    l13631305552474926529.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        P10208541982779414550 p102085419827794145503 = l13631305552474926529.a.h;
                        hostAddress = p102085419827794145503.d;
                        port = p102085419827794145503.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            Z3383101362411723454.l("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        N1214788596583503619 n1214788596583503619 = l13631305552474926529.a;
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(hostAddress, port);
                        inetSocketAddressCreateUnresolved.getClass();
                        listV = K5751602218013079365.U(new L7308164961383861217(n1214788596583503619, proxy, inetSocketAddressCreateUnresolved, null));
                    } else {
                        H5336160545165318150 h5336160545165318150 = A4349945402702183291.a;
                        hostAddress.getClass();
                        if (A4349945402702183291.a.f(hostAddress)) {
                            listV = K5751602218013079365.U(new L7308164961383861217(l13631305552474926529.a, proxy, new InetSocketAddress(InetAddress.getByName(hostAddress), port), null));
                        } else {
                            Q16536459847538462718 q16536459847538462718 = l13631305552474926529.c.d;
                            V5252629055842691065 v5252629055842691065 = l13631305552474926529.c;
                            q16536459847538462718.getClass();
                            l13631305552474926529.a.a.a(new N968209583691202713(hostAddress, (S10823041268949770285.t(l13631305552474926529.a.h.a, "https") || port != 80) ? port : -1));
                            List listLookup = l13631305552474926529.a.a.lookup(hostAddress);
                            ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(listLookup, 10));
                            Iterator it = listLookup.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new L7308164961383861217(l13631305552474926529.a, proxy, new InetSocketAddress((InetAddress) it.next(), port), null));
                            }
                            if (arrayList2.isEmpty()) {
                                throw new UnknownHostException(l13631305552474926529.a.a + " returned no addresses for " + hostAddress);
                            }
                            Q16536459847538462718 q165364598475384627182 = l13631305552474926529.c.d;
                            ArrayList arrayList3 = new ArrayList(Z115818233709597990.k0(arrayList2, 10));
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                arrayList3.add(((L7308164961383861217) obj).c.getAddress());
                            }
                            q165364598475384627182.getClass();
                            ArrayList arrayList4 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayList2.get(i3);
                                i3++;
                                if (((L7308164961383861217) obj2).d != null) {
                                    arrayList4.add(obj2);
                                }
                            }
                            boolean zIsEmpty = arrayList4.isEmpty();
                            ArrayList arrayList5 = arrayList4;
                            if (zIsEmpty) {
                                arrayList5 = arrayList2;
                            }
                            listV = arrayList5;
                            if (l13631305552474926529.d) {
                                int size3 = arrayList5.size();
                                listV = arrayList5;
                                if (size3 >= 2) {
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList5.size();
                                    int i4 = 0;
                                    while (i4 < size4) {
                                        Object obj3 = arrayList5.get(i4);
                                        i4++;
                                        if (((L7308164961383861217) obj3).c.getAddress() instanceof Inet6Address) {
                                            arrayList6.add(obj3);
                                        } else {
                                            arrayList7.add(obj3);
                                        }
                                    }
                                    listV = arrayList5;
                                    if (!arrayList6.isEmpty()) {
                                        listV = arrayList5;
                                        if (!arrayList7.isEmpty()) {
                                            byte[] bArr = L14928198200995638215.a;
                                            Iterator it2 = arrayList6.iterator();
                                            Iterator it3 = arrayList7.iterator();
                                            G9506192477171422664 g9506192477171422664F = K5751602218013079365.F();
                                            while (true) {
                                                if (!it2.hasNext() && !it3.hasNext()) {
                                                    break;
                                                }
                                                if (it2.hasNext()) {
                                                    g9506192477171422664F.add(it2.next());
                                                }
                                                if (it3.hasNext()) {
                                                    g9506192477171422664F.add(it3.next());
                                                }
                                            }
                                            listV = K5751602218013079365.v(g9506192477171422664F);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (L7308164961383861217 l73081649613838612172 : listV) {
                        M9197813449740923653 m9197813449740923653 = l13631305552474926529.b;
                        synchronized (m9197813449740923653) {
                            l73081649613838612172.getClass();
                            zContains = ((LinkedHashSet) m9197813449740923653.b).contains(l73081649613838612172);
                        }
                        if (zContains) {
                            l13631305552474926529.g.add(l73081649613838612172);
                        } else {
                            arrayList.add(l73081649613838612172);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    P17571903987102865660.n0(arrayList, l13631305552474926529.g);
                    l13631305552474926529.g.clear();
                }
                T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
                t170325367739755988362.b = arrayList;
                this.m = t170325367739755988362;
                if (this.k.q) {
                    Q11088980322693754445.h("Canceled");
                    return null;
                }
                if (t170325367739755988362.a >= arrayList.size()) {
                    Z3383101362411723454.u();
                    return null;
                }
                int i5 = t170325367739755988362.a;
                t170325367739755988362.a = i5 + 1;
                a8512287753625267110C = c((L7308164961383861217) arrayList.get(i5), arrayList);
            } else {
                int i6 = t17032536773975598836.a;
                ArrayList arrayList8 = (ArrayList) t17032536773975598836.b;
                if (i6 >= arrayList8.size()) {
                    Z3383101362411723454.u();
                    return null;
                }
                int i7 = t17032536773975598836.a;
                t17032536773975598836.a = i7 + 1;
                a8512287753625267110C = c((L7308164961383861217) arrayList8.get(i7), null);
            }
        }
        O7265813552375631487 o7265813552375631487D2 = d(a8512287753625267110C, a8512287753625267110C.k);
        return o7265813552375631487D2 != null ? o7265813552375631487D2 : a8512287753625267110C;
    }

    public final A8512287753625267110 c(L7308164961383861217 l7308164961383861217, ArrayList arrayList) throws UnknownServiceException {
        P10544952747155442696 p10544952747155442696 = P10544952747155442696.H2_PRIOR_KNOWLEDGE;
        l7308164961383861217.getClass();
        N1214788596583503619 n1214788596583503619 = l7308164961383861217.a;
        if (n1214788596583503619.c == null) {
            if (!n1214788596583503619.j.contains(I17300838719998789664.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = l7308164961383861217.a.h.d;
            X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
            if (!X4422675003582389573.a.i(str)) {
                throw new UnknownServiceException(G6547577305291411977.s("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (n1214788596583503619.i.contains(p10544952747155442696)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        G842859980338292746 g842859980338292746 = null;
        if (l7308164961383861217.b.type() == Proxy.Type.HTTP) {
            N1214788596583503619 n12147885965835036192 = l7308164961383861217.a;
            if (n12147885965835036192.c != null || n12147885965835036192.i.contains(p10544952747155442696)) {
                I1581330382723795749 i1581330382723795749 = new I1581330382723795749((byte) 5);
                i1581330382723795749.a = l7308164961383861217.a.h;
                i1581330382723795749.n("CONNECT", null);
                N1214788596583503619 n12147885965835036193 = l7308164961383861217.a;
                i1581330382723795749.l("Host", C14766148968941961570.i(n12147885965835036193.h, true));
                i1581330382723795749.l("Proxy-Connection", "Keep-Alive");
                i1581330382723795749.l("User-Agent", "okhttp/5.5.0");
                g842859980338292746 = new G842859980338292746(i1581330382723795749);
                H7893955938892024746 h7893955938892024746 = W7378377772343420238.a;
                V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 2);
                X7410747940286448830.k("Proxy-Authenticate");
                X7410747940286448830.l("OkHttp-Preemptive", "Proxy-Authenticate");
                v14323974914327418545.p("Proxy-Authenticate");
                X7410747940286448830.c(v14323974914327418545, "Proxy-Authenticate", "OkHttp-Preemptive");
                X7410747940286448830.d(v14323974914327418545);
                h7893955938892024746.getClass();
                n12147885965835036193.f.getClass();
            }
        }
        return new A8512287753625267110(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, l7308164961383861217, arrayList, g842859980338292746, -1, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0033, B:22:0x0040, B:25:0x0047), top: B:53:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.O7265813552375631487 d(dev.epro.r0.A8512287753625267110 r11, java.util.List r12) {
        /*
            r10 = this;
            dev.epro.r0.J9884070742191057945 r0 = r10.b
            boolean r1 = r10.l
            dev.epro.r0.N1214788596583503619 r2 = r10.i
            dev.epro.r0.V5252629055842691065 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.e()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            java.lang.Object r0 = r0.e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L20:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L68
            java.lang.Object r7 = r0.next()
            dev.epro.r0.H3726261569308128079 r7 = (dev.epro.r0.H3726261569308128079) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L40
            dev.epro.r0.A13573370436844979007 r9 = r7.i     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L39
            r9 = r5
            goto L3a
        L39:
            r9 = r4
        L3a:
            if (r9 != 0) goto L40
        L3c:
            r9 = r4
            goto L4b
        L3e:
            r10 = move-exception
            goto L66
        L40:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L47
            goto L3c
        L47:
            r3.a(r7)     // Catch: java.lang.Throwable -> L3e
            r9 = r5
        L4b:
            monitor-exit(r7)
            if (r9 == 0) goto L20
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L55
            goto L69
        L55:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L63
            java.net.Socket r8 = r3.i()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r7)
            if (r8 == 0) goto L20
            dev.epro.r0.C14766148968941961570.c(r8)
            goto L20
        L63:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L66:
            monitor-exit(r7)
            throw r10
        L68:
            r7 = r8
        L69:
            if (r7 != 0) goto L6c
            return r8
        L6c:
            if (r11 == 0) goto L79
            dev.epro.r0.L7308164961383861217 r12 = r11.j
            r10.f498o = r12
            java.net.Socket r11 = r11.r
            if (r11 == 0) goto L79
            dev.epro.r0.C14766148968941961570.c(r11)
        L79:
            dev.epro.r0.V5252629055842691065 r10 = r10.k
            dev.epro.r0.Q16536459847538462718 r10 = r10.d
            r10.getClass()
            dev.epro.r0.O7265813552375631487 r10 = new dev.epro.r0.O7265813552375631487
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T15985366153370019177.d(dev.epro.r0.A8512287753625267110, java.util.List):dev.epro.r0.O7265813552375631487");
    }
}
