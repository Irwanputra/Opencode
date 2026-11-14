package dev.epro.r0;

import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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

    /* renamed from: o, reason: collision with root package name */
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

    /* JADX WARN: Removed duplicated region for block: B:5:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.P11191550465322624469 b() {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T15985366153370019177.b():dev.epro.r0.P11191550465322624469");
    }

    public final A8512287753625267110 c(L7308164961383861217 l7308164961383861217, ArrayList arrayList) {
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

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if ((r7.i != null) == false) goto L19;
     */
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
