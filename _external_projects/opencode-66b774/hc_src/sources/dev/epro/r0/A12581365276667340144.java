package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A12581365276667340144 implements Y1249283782686518426 {
    public final H11725168162114556860 a;
    public Y5209789131793062978 b;
    public V7541548809599293348 c;
    public int d;
    public int e;
    public final A4559761392562572984 f;
    public final A4559761392562572984 g;
    public final M8258878446506793937 h;
    public final A12484292429157515813 i;
    public final A4559761392562572984 j;
    public final R4355002902395871978 k;
    public final A4559761392562572984 l;
    public final D389890677992184566 m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f149o;
    public final String p;

    public A12581365276667340144(H11725168162114556860 h11725168162114556860, V7541548809599293348 v7541548809599293348) {
        this.a = h11725168162114556860;
        this.c = v7541548809599293348;
        long[] jArr = X4026756943680612204.a;
        this.f = new A4559761392562572984();
        this.g = new A4559761392562572984();
        this.h = new M8258878446506793937(this);
        this.i = new A12484292429157515813(this);
        this.j = new A4559761392562572984();
        this.k = new R4355002902395871978();
        this.l = new A4559761392562572984();
        this.m = new D389890677992184566(0, new Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void b(C10361380324006518393 c10361380324006518393) {
        E13273723708836014930 e13273723708836014930;
        Y979168416190219423 y979168416190219423 = c10361380324006518393.f;
        if (y979168416190219423 != null) {
            y979168416190219423.h.set(Z3361759032029918772.b);
            E1005111105761972824 e1005111105761972824 = y979168416190219423.k;
            if (((E13273723708836014930) e1005111105761972824.g).h()) {
                e13273723708836014930 = (E13273723708836014930) e1005111105761972824.g;
                E13273723708836014930 e132737237088360149302 = L12621230156277355451.a;
                e1005111105761972824.g = new E13273723708836014930();
                ((D389890677992184566) e1005111105761972824.c).i();
            } else {
                e13273723708836014930 = null;
            }
            e1005111105761972824.c();
            S12944751221596631194 s12944751221596631194 = y979168416190219423.a;
            s12944751221596631194.q = null;
            if (e13273723708836014930 != null) {
                s12944751221596631194.u.i = e13273723708836014930;
                s12944751221596631194.w = (byte) 2;
            }
            c10361380324006518393.f = null;
            S12944751221596631194 s129447512215966311942 = c10361380324006518393.c;
            if (s129447512215966311942 != null) {
                s129447512215966311942.p();
            }
            c10361380324006518393.c = null;
        }
    }

    public final void a(C10361380324006518393 c10361380324006518393, boolean z) {
        Y979168416190219423 y979168416190219423 = c10361380324006518393.f;
        if (y979168416190219423 != null) {
            M4722199849958580248 h = T8598786036980488824.h();
            F4096073349764486348 e = h != null ? h.e() : null;
            M4722199849958580248 o2 = T8598786036980488824.o(h);
            try {
                H11725168162114556860 h11725168162114556860 = this.a;
                h11725168162114556860.q = true;
                if (z) {
                    while (!y979168416190219423.c()) {
                        try {
                            y979168416190219423.e(new D11988991656201568495((byte) 4));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                y979168416190219423.a();
                c10361380324006518393.f = null;
                h11725168162114556860.q = false;
            } finally {
                T8598786036980488824.x(h, o2, e);
            }
        }
    }

    public final N12973910657118401350 c(Object obj) {
        return !this.a.H() ? new V10811459894919367810() : new S17347912324758884158(this, obj);
    }

    public final void d(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List o2 = this.a.o();
        K7217096618580727896 k7217096618580727896 = (K7217096618580727896) o2;
        int i2 = (((D389890677992184566) k7217096618580727896.b).c - this.f149o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.f.g((H11725168162114556860) k7217096618580727896.get(i3));
                    g.getClass();
                    ((K18075763046227786881) this.k.b).a(((C10361380324006518393) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.c(this.k);
            M4722199849958580248 h = T8598786036980488824.h();
            F4096073349764486348 e = h != null ? h.e() : null;
            M4722199849958580248 o3 = T8598786036980488824.o(h);
            z = false;
            while (i2 >= i) {
                try {
                    H11725168162114556860 h11725168162114556860 = (H11725168162114556860) ((K7217096618580727896) o2).get(i2);
                    Object g2 = this.f.g(h11725168162114556860);
                    g2.getClass();
                    C10361380324006518393 c10361380324006518393 = (C10361380324006518393) g2;
                    Object obj = c10361380324006518393.a;
                    if (((K18075763046227786881) this.k.b).c(obj)) {
                        this.n++;
                        if (((Boolean) c10361380324006518393.g.getValue()).booleanValue()) {
                            R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
                            T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
                            Q8181337811809788579 q8181337811809788579 = Q8181337811809788579.c;
                            t8458668874796040341.l = q8181337811809788579;
                            L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
                            if (l8383256292871170816 != null) {
                                l8383256292871170816.j = q8181337811809788579;
                            }
                            l(c10361380324006518393, false);
                            if (c10361380324006518393.h) {
                                z = true;
                            }
                        }
                    } else {
                        H11725168162114556860 h117251681621145568602 = this.a;
                        h117251681621145568602.q = true;
                        this.f.l(h11725168162114556860);
                        S12944751221596631194 s12944751221596631194 = c10361380324006518393.c;
                        if (s12944751221596631194 != null) {
                            s12944751221596631194.p();
                        }
                        this.a.R(i2, 1);
                        h117251681621145568602.q = false;
                    }
                    this.g.l(obj);
                    i2--;
                } catch (Throwable th) {
                    T8598786036980488824.x(h, o3, e);
                    throw th;
                }
            }
            T8598786036980488824.x(h, o3, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (D459204867321966484.c) {
                E13273723708836014930 e13273723708836014930 = D459204867321966484.j.h;
                if (e13273723708836014930 != null) {
                    if (e13273723708836014930.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                D459204867321966484.c();
            }
        }
        h();
    }

    public final void e(Object obj) {
        h();
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) this.j.l(obj);
        H11725168162114556860 h117251681621145568602 = this.a;
        if (h11725168162114556860 != null) {
            if (this.f149o <= 0) {
                P753981624812481271.b("No pre-composed items to dispose");
            }
            int k = ((D389890677992184566) ((K7217096618580727896) h117251681621145568602.o()).b).k(h11725168162114556860);
            if (k < ((D389890677992184566) ((K7217096618580727896) h117251681621145568602.o()).b).c - this.f149o) {
                P753981624812481271.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.f149o--;
            C10361380324006518393 c10361380324006518393 = (C10361380324006518393) this.f.g(h11725168162114556860);
            if (c10361380324006518393 != null) {
                b(c10361380324006518393);
            }
            int i = (((D389890677992184566) ((K7217096618580727896) h117251681621145568602.o()).b).c - this.f149o) - this.n;
            j(k, i);
            d(i);
        }
        if (this.m.j(obj)) {
            H11725168162114556860.W(h117251681621145568602, true, 6);
        }
    }

    @Override // dev.epro.r0.Y1249283782686518426
    public final void f() {
        S12944751221596631194 s12944751221596631194;
        H11725168162114556860 h11725168162114556860 = this.a;
        h11725168162114556860.q = true;
        A4559761392562572984 a4559761392562572984 = this.f;
        Object[] objArr = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (s12944751221596631194 = ((C10361380324006518393) objArr[(i << 3) + i3]).c) != null) {
                            s12944751221596631194.p();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        h11725168162114556860.Q();
        h11725168162114556860.q = false;
        a4559761392562572984.a();
        this.g.a();
        this.f149o = 0;
        this.n = 0;
        this.j.a();
        h();
    }

    @Override // dev.epro.r0.Y1249283782686518426
    public final void g() {
        i(true);
    }

    public final void h() {
        int i = ((D389890677992184566) ((K7217096618580727896) this.a.o()).b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            P753981624812481271.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.n;
        int i4 = this.f149o;
        if ((i - i3) - i4 < 0) {
            StringBuilder p = E12098517352909843120.p(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            p.append(i4);
            P753981624812481271.a(p.toString());
        }
        int i5 = this.j.e;
        int i6 = this.f149o;
        if (i5 == i6) {
            return;
        }
        P753981624812481271.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.f149o = 0;
        this.j.a();
        List o2 = this.a.o();
        int i = ((D389890677992184566) ((K7217096618580727896) o2).b).c;
        if (this.n != i) {
            this.n = i;
            M4722199849958580248 h = T8598786036980488824.h();
            F4096073349764486348 e = h != null ? h.e() : null;
            M4722199849958580248 o3 = T8598786036980488824.o(h);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    H11725168162114556860 h11725168162114556860 = (H11725168162114556860) ((K7217096618580727896) o2).get(i2);
                    C10361380324006518393 c10361380324006518393 = (C10361380324006518393) this.f.g(h11725168162114556860);
                    if (c10361380324006518393 != null && ((Boolean) c10361380324006518393.g.getValue()).booleanValue()) {
                        R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
                        T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
                        Q8181337811809788579 q8181337811809788579 = Q8181337811809788579.c;
                        t8458668874796040341.l = q8181337811809788579;
                        L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
                        if (l8383256292871170816 != null) {
                            l8383256292871170816.j = q8181337811809788579;
                        }
                        l(c10361380324006518393, z);
                        c10361380324006518393.a = Z860808776098365610.i;
                    }
                } catch (Throwable th) {
                    T8598786036980488824.x(h, o3, e);
                    throw th;
                }
            }
            T8598786036980488824.x(h, o3, e);
            this.g.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        H11725168162114556860 h11725168162114556860 = this.a;
        h11725168162114556860.q = true;
        h11725168162114556860.M(i, i2, 1);
        h11725168162114556860.q = false;
    }

    public final void k(Object obj, L12639328004344855510 l12639328004344855510, boolean z) {
        H11725168162114556860 h11725168162114556860 = this.a;
        if (h11725168162114556860.H()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.l.l(obj);
            A4559761392562572984 a4559761392562572984 = this.j;
            Object g = a4559761392562572984.g(obj);
            if (g == null) {
                g = n(obj);
                if (g != null) {
                    j(((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).k(g), ((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).c);
                    this.f149o++;
                } else {
                    int i = ((D389890677992184566) ((K7217096618580727896) h11725168162114556860.o()).b).c;
                    H11725168162114556860 h117251681621145568602 = new H11725168162114556860(2);
                    h11725168162114556860.q = true;
                    h11725168162114556860.B(i, h117251681621145568602);
                    h11725168162114556860.q = false;
                    this.f149o++;
                    g = h117251681621145568602;
                }
                a4559761392562572984.n(obj, g);
            }
            m((H11725168162114556860) g, obj, z, l12639328004344855510);
        }
    }

    public final void l(C10361380324006518393 c10361380324006518393, boolean z) {
        S12944751221596631194 s12944751221596631194;
        if (z || !c10361380324006518393.h) {
            c10361380324006518393.g = V4416135141588678913.t(Boolean.FALSE);
        } else {
            c10361380324006518393.g.setValue(Boolean.FALSE);
        }
        if (c10361380324006518393.f != null) {
            b(c10361380324006518393);
            return;
        }
        if (z) {
            S12944751221596631194 s129447512215966311942 = c10361380324006518393.c;
            if (s129447512215966311942 != null) {
                s129447512215966311942.o();
                return;
            }
            return;
        }
        Z14727533345643435323 m32getOutOfFrameExecutor = ((S7974369370986781936) P12010630787994328224.a(this.a)).m32getOutOfFrameExecutor();
        if (m32getOutOfFrameExecutor != null) {
            ((S7974369370986781936) m32getOutOfFrameExecutor).I(new W2269277550458425547(c10361380324006518393, (byte) 8));
        } else {
            if (c10361380324006518393.h || (s12944751221596631194 = c10361380324006518393.c) == null) {
                return;
            }
            s12944751221596631194.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x011b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:60:0x0108, B:63:0x0112, B:64:0x010d, B:65:0x0118, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0125, B:73:0x012f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x011b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:60:0x0108, B:63:0x0112, B:64:0x010d, B:65:0x0118, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0125, B:73:0x012f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x011b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:60:0x0108, B:63:0x0112, B:64:0x010d, B:65:0x0118, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0125, B:73:0x012f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x011b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:60:0x0108, B:63:0x0112, B:64:0x010d, B:65:0x0118, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0125, B:73:0x012f), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(dev.epro.r0.H11725168162114556860 r10, java.lang.Object r11, boolean r12, dev.epro.r0.L12639328004344855510 r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A12581365276667340144.m(dev.epro.r0.H11725168162114556860, java.lang.Object, boolean, dev.epro.r0.L12639328004344855510):void");
    }

    public final H11725168162114556860 n(Object obj) {
        A4559761392562572984 a4559761392562572984;
        int i;
        if (this.n == 0) {
            return null;
        }
        K7217096618580727896 k7217096618580727896 = (K7217096618580727896) this.a.o();
        int i2 = ((D389890677992184566) k7217096618580727896.b).c - this.f149o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            a4559761392562572984 = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = a4559761392562572984.g((H11725168162114556860) k7217096618580727896.get(i5));
            g.getClass();
            if (S10823041268949770285.t(((C10361380324006518393) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = a4559761392562572984.g((H11725168162114556860) k7217096618580727896.get(i4));
                g2.getClass();
                C10361380324006518393 c10361380324006518393 = (C10361380324006518393) g2;
                Object obj2 = c10361380324006518393.a;
                if (obj2 == Z860808776098365610.i || this.c.e(obj, obj2)) {
                    c10361380324006518393.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.n--;
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) k7217096618580727896.get(i3);
        Object g3 = a4559761392562572984.g(h11725168162114556860);
        g3.getClass();
        C10361380324006518393 c103613803240065183932 = (C10361380324006518393) g3;
        c103613803240065183932.g = V4416135141588678913.t(Boolean.TRUE);
        c103613803240065183932.e = true;
        c103613803240065183932.d = true;
        return h11725168162114556860;
    }
}
