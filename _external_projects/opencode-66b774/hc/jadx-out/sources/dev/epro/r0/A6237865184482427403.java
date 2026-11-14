package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class A6237865184482427403 extends M4722199849958580248 {
    public static final int[] n = new int[0];
    public final F4096073349764486348 e;
    public final F4096073349764486348 f;
    public int g;
    public E13273723708836014930 h;
    public ArrayList i;
    public D7201182503133677242 j;
    public int[] k;
    public int l;
    public boolean m;

    public A6237865184482427403(long j, D7201182503133677242 d7201182503133677242, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        super(j, d7201182503133677242);
        this.e = f4096073349764486348;
        this.f = f40960733497644863482;
        this.j = D7201182503133677242.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (D459204867321966484.c) {
            this.j = this.j.j(j);
        }
    }

    public void B(E13273723708836014930 e13273723708836014930) {
        this.h = e13273723708836014930;
    }

    public A6237865184482427403 C(F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        E4222303495286338467 e4222303495286338467;
        if (this.c) {
            L4738636499147270068.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            L4738636499147270068.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = D459204867321966484.c;
        synchronized (obj) {
            long j = D459204867321966484.e;
            D459204867321966484.e = j + 1;
            D459204867321966484.d = D459204867321966484.d.j(j);
            D7201182503133677242 d7201182503133677242D = d();
            r(d7201182503133677242D.j(j));
            e4222303495286338467 = new E4222303495286338467(j, D459204867321966484.a(d7201182503133677242D, g() + 1, j), D459204867321966484.i(f4096073349764486348, e(), true), D459204867321966484.j(f40960733497644863482, i()), this);
        }
        if (this.m || this.c) {
            return e4222303495286338467;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = D459204867321966484.e;
            D459204867321966484.e = j2 + 1;
            s(j2);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), jG + 1, g()));
        return e4222303495286338467;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void b() {
        D459204867321966484.d = D459204867321966484.d.b(g()).a(this.j);
    }

    @Override // dev.epro.r0.M4722199849958580248
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (D459204867321966484.c) {
            o();
        }
        l();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public int h() {
        return this.g;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public F4096073349764486348 i() {
        return this.f;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // dev.epro.r0.M4722199849958580248
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            dev.epro.r0.L4738636499147270068.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            dev.epro.r0.E13273723708836014930 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            dev.epro.r0.L4738636499147270068.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            dev.epro.r0.O13595511762861117873 r13 = (dev.epro.r0.O13595511762861117873) r13
            dev.epro.r0.T9533098554585011700 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            dev.epro.r0.D7201182503133677242 r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = dev.epro.r0.R9411874267597469228.v0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            dev.epro.r0.Y13361005827119333637 r6 = dev.epro.r0.D459204867321966484.a
            r14 = 0
            r13.a = r14
        L83:
            dev.epro.r0.T9533098554585011700 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A6237865184482427403.l():void");
    }

    @Override // dev.epro.r0.M4722199849958580248
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public void n(O13595511762861117873 o13595511762861117873) {
        E13273723708836014930 e13273723708836014930X = x();
        if (e13273723708836014930X == null) {
            E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
            e13273723708836014930X = new E13273723708836014930();
            B(e13273723708836014930X);
        }
        e13273723708836014930X.a(o13595511762861117873);
    }

    @Override // dev.epro.r0.M4722199849958580248
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            D459204867321966484.t(this.k[i]);
        }
        o();
    }

    @Override // dev.epro.r0.M4722199849958580248
    public void t(int i) {
        this.g = i;
    }

    @Override // dev.epro.r0.M4722199849958580248
    public M4722199849958580248 u(F4096073349764486348 f4096073349764486348) {
        D13420466064020214464 d13420466064020214464;
        if (this.c) {
            L4738636499147270068.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            L4738636499147270068.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = D459204867321966484.c;
        synchronized (obj) {
            long j = D459204867321966484.e;
            D459204867321966484.e = j + 1;
            D459204867321966484.d = D459204867321966484.d.j(j);
            d13420466064020214464 = new D13420466064020214464(j, D459204867321966484.a(d(), jG + 1, j), D459204867321966484.i(f4096073349764486348, e(), true), this);
        }
        if (this.m || this.c) {
            return d13420466064020214464;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = D459204867321966484.e;
            D459204867321966484.e = j2 + 1;
            s(j2);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), jG2 + 1, g()));
        return d13420466064020214464;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (D459204867321966484.c) {
            long j = D459204867321966484.e;
            D459204867321966484.e = j + 1;
            s(j);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dev.epro.r0.E14308387479134424328 w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A6237865184482427403.w():dev.epro.r0.E14308387479134424328");
    }

    public E13273723708836014930 x() {
        return this.h;
    }

    @Override // dev.epro.r0.M4722199849958580248
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public F4096073349764486348 e() {
        return this.e;
    }

    public final E14308387479134424328 z(long j, E13273723708836014930 e13273723708836014930, HashMap map, D7201182503133677242 d7201182503133677242) {
        ArrayList arrayList;
        ArrayList arrayListO0;
        ArrayList arrayList2;
        D7201182503133677242 d72011825031336772422;
        Object[] objArr;
        long[] jArr;
        D7201182503133677242 d72011825031336772423;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        T9533098554585011700 t9533098554585011700B;
        D7201182503133677242 d7201182503133677242I = d().j(g()).i(this.j);
        Object[] objArr3 = e13273723708836014930.b;
        long[] jArr3 = e13273723708836014930.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListO0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            O13595511762861117873 o13595511762861117873 = (O13595511762861117873) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            T9533098554585011700 t9533098554585011700A = o13595511762861117873.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            T9533098554585011700 t9533098554585011700R = D459204867321966484.r(t9533098554585011700A, j, d7201182503133677242);
                            if (t9533098554585011700R == null) {
                                arrayList3 = arrayListO0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListO0;
                                j2 = j3;
                                T9533098554585011700 t9533098554585011700R2 = D459204867321966484.r(t9533098554585011700A, g(), d7201182503133677242I);
                                if (t9533098554585011700R2 != null && t9533098554585011700R2.a != 1 && !t9533098554585011700R.equals(t9533098554585011700R2)) {
                                    d72011825031336772423 = d7201182503133677242I;
                                    T9533098554585011700 t9533098554585011700R3 = D459204867321966484.r(t9533098554585011700A, g(), d());
                                    if (t9533098554585011700R3 == null) {
                                        D459204867321966484.q();
                                        throw null;
                                    }
                                    if (map == null || (t9533098554585011700B = (T9533098554585011700) map.get(t9533098554585011700R)) == null) {
                                        t9533098554585011700B = o13595511762861117873.b(t9533098554585011700R2, t9533098554585011700R, t9533098554585011700R3);
                                    }
                                    if (t9533098554585011700B == null) {
                                        return new Y12702511936777569777(this);
                                    }
                                    if (!t9533098554585011700B.equals(t9533098554585011700R3)) {
                                        if (t9533098554585011700B.equals(t9533098554585011700R)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new H9390398899829886498(o13595511762861117873, t9533098554585011700R.c(g())));
                                            arrayListO0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListO0.add(o13595511762861117873);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!t9533098554585011700B.equals(t9533098554585011700R2) ? new H9390398899829886498(o13595511762861117873, t9533098554585011700B) : new H9390398899829886498(o13595511762861117873, t9533098554585011700R2.c(g())));
                                        }
                                    }
                                    arrayListO0 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListO0 = arrayList3;
                            }
                            d72011825031336772423 = d7201182503133677242I;
                            arrayList2 = arrayList4;
                            arrayListO0 = arrayList3;
                        } else {
                            d72011825031336772423 = d7201182503133677242I;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d7201182503133677242I = d72011825031336772423;
                    }
                    d72011825031336772422 = d7201182503133677242I;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    d72011825031336772422 = d7201182503133677242I;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                d7201182503133677242I = d72011825031336772422;
            }
        } else {
            arrayList = null;
            arrayListO0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) arrayList2.get(i5);
                O13595511762861117873 o135955117628611178732 = (O13595511762861117873) h9390398899829886498.a;
                T9533098554585011700 t9533098554585011700 = (T9533098554585011700) h9390398899829886498.b;
                t9533098554585011700.a = j;
                synchronized (D459204867321966484.c) {
                    t9533098554585011700.b = o135955117628611178732.a();
                    o135955117628611178732.c(t9533098554585011700);
                }
            }
        }
        if (arrayListO0 != null) {
            int size2 = arrayListO0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                e13273723708836014930.l((O13595511762861117873) arrayListO0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListO0 = R9411874267597469228.O0(arrayList6, arrayListO0);
            }
            this.i = arrayListO0;
        }
        return V14274201939977296242.c;
    }
}
