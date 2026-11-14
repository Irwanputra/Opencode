package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
            D7201182503133677242 d = d();
            r(d.j(j));
            e4222303495286338467 = new E4222303495286338467(j, D459204867321966484.a(d, g() + 1, j), D459204867321966484.i(f4096073349764486348, e(), true), D459204867321966484.j(f40960733497644863482, i()), this);
        }
        if (this.m || this.c) {
            return e4222303495286338467;
        }
        long g = g();
        synchronized (obj) {
            long j2 = D459204867321966484.e;
            D459204867321966484.e = j2 + 1;
            s(j2);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), g + 1, g()));
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

    @Override // dev.epro.r0.M4722199849958580248
    public void l() {
        if (this.l <= 0) {
            L4738636499147270068.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        E13273723708836014930 x = x();
        if (x != null) {
            if (this.m) {
                L4738636499147270068.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (T9533098554585011700 a = ((O13595511762861117873) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                    long j2 = a.a;
                                    if (j2 == g || R9411874267597469228.v0(this.j, Long.valueOf(j2))) {
                                        Y13361005827119333637 y13361005827119333637 = D459204867321966484.a;
                                        a.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
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
        E13273723708836014930 x = x();
        if (x == null) {
            E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
            x = new E13273723708836014930();
            B(x);
        }
        x.a(o13595511762861117873);
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
        long g = g();
        A(g());
        Object obj = D459204867321966484.c;
        synchronized (obj) {
            long j = D459204867321966484.e;
            D459204867321966484.e = j + 1;
            D459204867321966484.d = D459204867321966484.d.j(j);
            d13420466064020214464 = new D13420466064020214464(j, D459204867321966484.a(d(), g + 1, j), D459204867321966484.i(f4096073349764486348, e(), true), this);
        }
        if (this.m || this.c) {
            return d13420466064020214464;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = D459204867321966484.e;
            D459204867321966484.e = j2 + 1;
            s(j2);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), g2 + 1, g()));
        return d13420466064020214464;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (D459204867321966484.c) {
            long j = D459204867321966484.e;
            D459204867321966484.e = j + 1;
            s(j);
            D459204867321966484.d = D459204867321966484.d.j(g());
        }
        r(D459204867321966484.a(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dev.epro.r0.E14308387479134424328 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A6237865184482427403.w():dev.epro.r0.E14308387479134424328");
    }

    public E13273723708836014930 x() {
        return this.h;
    }

    @Override // dev.epro.r0.M4722199849958580248
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public F4096073349764486348 e() {
        return this.e;
    }

    public final E14308387479134424328 z(long j, E13273723708836014930 e13273723708836014930, HashMap hashMap, D7201182503133677242 d7201182503133677242) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        D7201182503133677242 d72011825031336772422;
        Object[] objArr;
        long[] jArr;
        D7201182503133677242 d72011825031336772423;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        T9533098554585011700 b;
        D7201182503133677242 i2 = d().j(g()).i(this.j);
        Object[] objArr3 = e13273723708836014930.b;
        long[] jArr3 = e13273723708836014930.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            O13595511762861117873 o13595511762861117873 = (O13595511762861117873) objArr3[(i3 << 3) + i5];
                            jArr2 = jArr3;
                            T9533098554585011700 a = o13595511762861117873.a();
                            i = i5;
                            ArrayList arrayList5 = arrayList3;
                            T9533098554585011700 r = D459204867321966484.r(a, j, d7201182503133677242);
                            if (r == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                T9533098554585011700 r2 = D459204867321966484.r(a, g(), i2);
                                if (r2 != null && r2.a != 1 && !r.equals(r2)) {
                                    d72011825031336772423 = i2;
                                    T9533098554585011700 r3 = D459204867321966484.r(a, g(), d());
                                    if (r3 == null) {
                                        D459204867321966484.q();
                                        throw null;
                                    }
                                    if (hashMap == null || (b = (T9533098554585011700) hashMap.get(r)) == null) {
                                        b = o13595511762861117873.b(r2, r, r3);
                                    }
                                    if (b == null) {
                                        return new Y12702511936777569777(this);
                                    }
                                    if (!b.equals(r3)) {
                                        if (b.equals(r)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new H9390398899829886498(o13595511762861117873, r.c(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(o13595511762861117873);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!b.equals(r2) ? new H9390398899829886498(o13595511762861117873, b) : new H9390398899829886498(o13595511762861117873, r2.c(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            d72011825031336772423 = i2;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            d72011825031336772423 = i2;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i5;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i5 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        i2 = d72011825031336772423;
                    }
                    d72011825031336772422 = i2;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    d72011825031336772422 = i2;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i3++;
                jArr3 = jArr;
                objArr3 = objArr;
                i2 = d72011825031336772422;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i6 = 0; i6 < size; i6++) {
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) arrayList3.get(i6);
                O13595511762861117873 o135955117628611178732 = (O13595511762861117873) h9390398899829886498.a;
                T9533098554585011700 t9533098554585011700 = (T9533098554585011700) h9390398899829886498.b;
                t9533098554585011700.a = j;
                synchronized (D459204867321966484.c) {
                    t9533098554585011700.b = o135955117628611178732.a();
                    o135955117628611178732.c(t9533098554585011700);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                e13273723708836014930.l((O13595511762861117873) arrayList2.get(i7));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = R9411874267597469228.O0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return V14274201939977296242.c;
    }
}
