package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L8383256292871170816 extends Z17471428274427141949 implements G17613326942144185441, P10552808509296666343, Z3857703353417784960 {
    public final L2507713026531741258 A;
    public final L2507713026531741258 B;
    public boolean C;
    public final R8000300579679385019 f;
    public boolean g;
    public boolean k;
    public boolean l;
    public boolean m;
    public I16980768508151520658 n;
    public F4096073349764486348 p;
    public B9692660393722135472 q;
    public boolean v;
    public final L2507713026531741258 w;
    public Object y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public Q8181337811809788579 j = Q8181337811809788579.c;

    /* renamed from: o, reason: collision with root package name */
    public long f352o = 0;
    public J4871791287292782500 r = J4871791287292782500.c;
    public final V13058232089047844042 s = new V13058232089047844042(this, (byte) 1);
    public final D389890677992184566 t = new D389890677992184566(0, new L8383256292871170816[16]);
    public boolean u = true;
    public boolean x = true;
    public long z = O15160157444238005800.b(0, 0, 0, 0, 15);

    /* JADX WARN: Type inference failed for: r0v6, types: [dev.epro.r0.L2507713026531741258] */
    /* JADX WARN: Type inference failed for: r5v4, types: [dev.epro.r0.L2507713026531741258] */
    /* JADX WARN: Type inference failed for: r5v5, types: [dev.epro.r0.L2507713026531741258] */
    public L8383256292871170816(R8000300579679385019 r8000300579679385019) {
        this.f = r8000300579679385019;
        final byte b = 1;
        final byte b2 = 0;
        this.w = new B13729205492206812220(this) { // from class: dev.epro.r0.L2507713026531741258
            public final /* synthetic */ L8383256292871170816 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                L5844152868342410893 c1;
                byte b3 = b2;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                U9803441765912152712 u9803441765912152712 = null;
                r2 = null;
                r2 = null;
                Y2066038017114788875 y2066038017114788875 = null;
                L8383256292871170816 l8383256292871170816 = this.b;
                switch (b3) {
                    case 0:
                        R8000300579679385019 r80003005796793850192 = l8383256292871170816.f;
                        r80003005796793850192.h = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            L8383256292871170816 l83832562928711708162 = ((H11725168162114556860) objArr[i2]).G.q;
                            l83832562928711708162.getClass();
                            l83832562928711708162.h = l83832562928711708162.i;
                            l83832562928711708162.i = Integer.MAX_VALUE;
                            if (l83832562928711708162.j == Q8181337811809788579.b) {
                                l83832562928711708162.j = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            L8383256292871170816 l83832562928711708163 = ((H11725168162114556860) objArr2[i4]).G.q;
                            l83832562928711708163.getClass();
                            l83832562928711708163.s.d = false;
                        }
                        N2516046390769984807 n2516046390769984807 = l8383256292871170816.p().d0;
                        if (n2516046390769984807 == null) {
                            S10973172697741180971.m("Expected lookahead delegate");
                            break;
                        } else {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) k7217096618580727896.get(i6);
                                L5844152868342410893 c12 = ((Y4989033692226475498) h117251681621145568602.F.e).c1();
                                if (c12 != null) {
                                    if (c12.f283o) {
                                        if (u9803441765912152712 == null) {
                                            u9803441765912152712 = new U9803441765912152712();
                                        }
                                        u9803441765912152712.a(h117251681621145568602);
                                    }
                                    c12.f283o = n2516046390769984807.f283o;
                                }
                            }
                            n2516046390769984807.H0().b();
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    D389890677992184566 z3 = h11725168162114556860.z();
                                    Object[] objArr3 = z3.a;
                                    int i9 = z3.c;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        L8383256292871170816 l83832562928711708164 = ((H11725168162114556860) objArr3[i10]).G.q;
                                        l83832562928711708164.getClass();
                                        int i11 = l83832562928711708164.h;
                                        int i12 = l83832562928711708164.i;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            l83832562928711708164.u0(true);
                                        }
                                    }
                                    D389890677992184566 z4 = h11725168162114556860.z();
                                    Object[] objArr4 = z4.a;
                                    int i13 = z4.c;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        L8383256292871170816 l83832562928711708165 = ((H11725168162114556860) objArr4[i14]).G.q;
                                        l83832562928711708165.getClass();
                                        V13058232089047844042 v13058232089047844042 = l83832562928711708165.s;
                                        v13058232089047844042.e = v13058232089047844042.d;
                                    }
                                    break;
                                } else {
                                    H11725168162114556860 h117251681621145568603 = (H11725168162114556860) k72170966185807278962.get(i8);
                                    boolean z5 = u9803441765912152712 != null && u9803441765912152712.g(h117251681621145568603) >= 0;
                                    L5844152868342410893 c13 = ((Y4989033692226475498) h117251681621145568603.F.e).c1();
                                    if (c13 != null) {
                                        c13.f283o = z5;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        L5844152868342410893 c14 = l8383256292871170816.f.a().c1();
                        c14.getClass();
                        c14.d(l8383256292871170816.z);
                        break;
                    default:
                        R8000300579679385019 r80003005796793850193 = l8383256292871170816.f;
                        if (O4077903568229246.y(r80003005796793850193.a) || r80003005796793850193.c) {
                            Y4989033692226475498 y4989033692226475498 = r80003005796793850193.a().w;
                            if (y4989033692226475498 != null) {
                                y2066038017114788875 = y4989033692226475498.p;
                            }
                        } else {
                            Y4989033692226475498 y49890336922264754982 = r80003005796793850193.a().w;
                            if (y49890336922264754982 != null && (c1 = y49890336922264754982.c1()) != null) {
                                y2066038017114788875 = c1.p;
                            }
                        }
                        if (y2066038017114788875 == null) {
                            y2066038017114788875 = ((S7974369370986781936) P12010630787994328224.a(r80003005796793850193.a)).getPlacementScope();
                        }
                        L5844152868342410893 c15 = r80003005796793850193.a().c1();
                        c15.getClass();
                        Y2066038017114788875.i(y2066038017114788875, c15, l8383256292871170816.f352o);
                        break;
                }
                return o9245300239821758723;
            }
        };
        this.y = r8000300579679385019.p.s;
        this.A = new B13729205492206812220(this) { // from class: dev.epro.r0.L2507713026531741258
            public final /* synthetic */ L8383256292871170816 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                L5844152868342410893 c1;
                byte b3 = b;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                U9803441765912152712 u9803441765912152712 = null;
                y2066038017114788875 = null;
                y2066038017114788875 = null;
                Y2066038017114788875 y2066038017114788875 = null;
                L8383256292871170816 l8383256292871170816 = this.b;
                switch (b3) {
                    case 0:
                        R8000300579679385019 r80003005796793850192 = l8383256292871170816.f;
                        r80003005796793850192.h = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            L8383256292871170816 l83832562928711708162 = ((H11725168162114556860) objArr[i2]).G.q;
                            l83832562928711708162.getClass();
                            l83832562928711708162.h = l83832562928711708162.i;
                            l83832562928711708162.i = Integer.MAX_VALUE;
                            if (l83832562928711708162.j == Q8181337811809788579.b) {
                                l83832562928711708162.j = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            L8383256292871170816 l83832562928711708163 = ((H11725168162114556860) objArr2[i4]).G.q;
                            l83832562928711708163.getClass();
                            l83832562928711708163.s.d = false;
                        }
                        N2516046390769984807 n2516046390769984807 = l8383256292871170816.p().d0;
                        if (n2516046390769984807 == null) {
                            S10973172697741180971.m("Expected lookahead delegate");
                            break;
                        } else {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) k7217096618580727896.get(i6);
                                L5844152868342410893 c12 = ((Y4989033692226475498) h117251681621145568602.F.e).c1();
                                if (c12 != null) {
                                    if (c12.f283o) {
                                        if (u9803441765912152712 == null) {
                                            u9803441765912152712 = new U9803441765912152712();
                                        }
                                        u9803441765912152712.a(h117251681621145568602);
                                    }
                                    c12.f283o = n2516046390769984807.f283o;
                                }
                            }
                            n2516046390769984807.H0().b();
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    D389890677992184566 z3 = h11725168162114556860.z();
                                    Object[] objArr3 = z3.a;
                                    int i9 = z3.c;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        L8383256292871170816 l83832562928711708164 = ((H11725168162114556860) objArr3[i10]).G.q;
                                        l83832562928711708164.getClass();
                                        int i11 = l83832562928711708164.h;
                                        int i12 = l83832562928711708164.i;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            l83832562928711708164.u0(true);
                                        }
                                    }
                                    D389890677992184566 z4 = h11725168162114556860.z();
                                    Object[] objArr4 = z4.a;
                                    int i13 = z4.c;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        L8383256292871170816 l83832562928711708165 = ((H11725168162114556860) objArr4[i14]).G.q;
                                        l83832562928711708165.getClass();
                                        V13058232089047844042 v13058232089047844042 = l83832562928711708165.s;
                                        v13058232089047844042.e = v13058232089047844042.d;
                                    }
                                    break;
                                } else {
                                    H11725168162114556860 h117251681621145568603 = (H11725168162114556860) k72170966185807278962.get(i8);
                                    boolean z5 = u9803441765912152712 != null && u9803441765912152712.g(h117251681621145568603) >= 0;
                                    L5844152868342410893 c13 = ((Y4989033692226475498) h117251681621145568603.F.e).c1();
                                    if (c13 != null) {
                                        c13.f283o = z5;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        L5844152868342410893 c14 = l8383256292871170816.f.a().c1();
                        c14.getClass();
                        c14.d(l8383256292871170816.z);
                        break;
                    default:
                        R8000300579679385019 r80003005796793850193 = l8383256292871170816.f;
                        if (O4077903568229246.y(r80003005796793850193.a) || r80003005796793850193.c) {
                            Y4989033692226475498 y4989033692226475498 = r80003005796793850193.a().w;
                            if (y4989033692226475498 != null) {
                                y2066038017114788875 = y4989033692226475498.p;
                            }
                        } else {
                            Y4989033692226475498 y49890336922264754982 = r80003005796793850193.a().w;
                            if (y49890336922264754982 != null && (c1 = y49890336922264754982.c1()) != null) {
                                y2066038017114788875 = c1.p;
                            }
                        }
                        if (y2066038017114788875 == null) {
                            y2066038017114788875 = ((S7974369370986781936) P12010630787994328224.a(r80003005796793850193.a)).getPlacementScope();
                        }
                        L5844152868342410893 c15 = r80003005796793850193.a().c1();
                        c15.getClass();
                        Y2066038017114788875.i(y2066038017114788875, c15, l8383256292871170816.f352o);
                        break;
                }
                return o9245300239821758723;
            }
        };
        final byte b3 = 2;
        this.B = new B13729205492206812220(this) { // from class: dev.epro.r0.L2507713026531741258
            public final /* synthetic */ L8383256292871170816 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                L5844152868342410893 c1;
                byte b32 = b3;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                U9803441765912152712 u9803441765912152712 = null;
                y2066038017114788875 = null;
                y2066038017114788875 = null;
                Y2066038017114788875 y2066038017114788875 = null;
                L8383256292871170816 l8383256292871170816 = this.b;
                switch (b32) {
                    case 0:
                        R8000300579679385019 r80003005796793850192 = l8383256292871170816.f;
                        r80003005796793850192.h = 0;
                        H11725168162114556860 h11725168162114556860 = r80003005796793850192.a;
                        D389890677992184566 z = h11725168162114556860.z();
                        Object[] objArr = z.a;
                        int i = z.c;
                        for (int i2 = 0; i2 < i; i2++) {
                            L8383256292871170816 l83832562928711708162 = ((H11725168162114556860) objArr[i2]).G.q;
                            l83832562928711708162.getClass();
                            l83832562928711708162.h = l83832562928711708162.i;
                            l83832562928711708162.i = Integer.MAX_VALUE;
                            if (l83832562928711708162.j == Q8181337811809788579.b) {
                                l83832562928711708162.j = Q8181337811809788579.c;
                            }
                        }
                        D389890677992184566 z2 = h11725168162114556860.z();
                        Object[] objArr2 = z2.a;
                        int i3 = z2.c;
                        for (int i4 = 0; i4 < i3; i4++) {
                            L8383256292871170816 l83832562928711708163 = ((H11725168162114556860) objArr2[i4]).G.q;
                            l83832562928711708163.getClass();
                            l83832562928711708163.s.d = false;
                        }
                        N2516046390769984807 n2516046390769984807 = l8383256292871170816.p().d0;
                        if (n2516046390769984807 == null) {
                            S10973172697741180971.m("Expected lookahead delegate");
                            break;
                        } else {
                            K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860.n();
                            int i5 = ((D389890677992184566) k7217096618580727896.b).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) k7217096618580727896.get(i6);
                                L5844152868342410893 c12 = ((Y4989033692226475498) h117251681621145568602.F.e).c1();
                                if (c12 != null) {
                                    if (c12.f283o) {
                                        if (u9803441765912152712 == null) {
                                            u9803441765912152712 = new U9803441765912152712();
                                        }
                                        u9803441765912152712.a(h117251681621145568602);
                                    }
                                    c12.f283o = n2516046390769984807.f283o;
                                }
                            }
                            n2516046390769984807.H0().b();
                            K7217096618580727896 k72170966185807278962 = (K7217096618580727896) h11725168162114556860.n();
                            int i7 = ((D389890677992184566) k72170966185807278962.b).c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    D389890677992184566 z3 = h11725168162114556860.z();
                                    Object[] objArr3 = z3.a;
                                    int i9 = z3.c;
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        L8383256292871170816 l83832562928711708164 = ((H11725168162114556860) objArr3[i10]).G.q;
                                        l83832562928711708164.getClass();
                                        int i11 = l83832562928711708164.h;
                                        int i12 = l83832562928711708164.i;
                                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                                            l83832562928711708164.u0(true);
                                        }
                                    }
                                    D389890677992184566 z4 = h11725168162114556860.z();
                                    Object[] objArr4 = z4.a;
                                    int i13 = z4.c;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        L8383256292871170816 l83832562928711708165 = ((H11725168162114556860) objArr4[i14]).G.q;
                                        l83832562928711708165.getClass();
                                        V13058232089047844042 v13058232089047844042 = l83832562928711708165.s;
                                        v13058232089047844042.e = v13058232089047844042.d;
                                    }
                                    break;
                                } else {
                                    H11725168162114556860 h117251681621145568603 = (H11725168162114556860) k72170966185807278962.get(i8);
                                    boolean z5 = u9803441765912152712 != null && u9803441765912152712.g(h117251681621145568603) >= 0;
                                    L5844152868342410893 c13 = ((Y4989033692226475498) h117251681621145568603.F.e).c1();
                                    if (c13 != null) {
                                        c13.f283o = z5;
                                    }
                                    i8++;
                                }
                            }
                        }
                        break;
                    case 1:
                        L5844152868342410893 c14 = l8383256292871170816.f.a().c1();
                        c14.getClass();
                        c14.d(l8383256292871170816.z);
                        break;
                    default:
                        R8000300579679385019 r80003005796793850193 = l8383256292871170816.f;
                        if (O4077903568229246.y(r80003005796793850193.a) || r80003005796793850193.c) {
                            Y4989033692226475498 y4989033692226475498 = r80003005796793850193.a().w;
                            if (y4989033692226475498 != null) {
                                y2066038017114788875 = y4989033692226475498.p;
                            }
                        } else {
                            Y4989033692226475498 y49890336922264754982 = r80003005796793850193.a().w;
                            if (y49890336922264754982 != null && (c1 = y49890336922264754982.c1()) != null) {
                                y2066038017114788875 = c1.p;
                            }
                        }
                        if (y2066038017114788875 == null) {
                            y2066038017114788875 = ((S7974369370986781936) P12010630787994328224.a(r80003005796793850193.a)).getPlacementScope();
                        }
                        L5844152868342410893 c15 = r80003005796793850193.a().c1();
                        c15.getClass();
                        Y2066038017114788875.i(y2066038017114788875, c15, l8383256292871170816.f352o);
                        break;
                }
                return o9245300239821758723;
            }
        };
    }

    public final void B0() {
        J4327291511168983093 j4327291511168983093;
        this.C = true;
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 u = r8000300579679385019.a.u();
        J4871791287292782500 j4871791287292782500 = this.r;
        if ((j4871791287292782500 != J4871791287292782500.a && !r8000300579679385019.c) || (j4871791287292782500 != J4871791287292782500.b && r8000300579679385019.c)) {
            w0();
            if (this.g && u != null) {
                u.T(false);
            }
        }
        if (u != null) {
            R8000300579679385019 r80003005796793850192 = u.G;
            if (!this.g && ((j4327291511168983093 = r80003005796793850192.d) == J4327291511168983093.c || j4327291511168983093 == J4327291511168983093.d)) {
                if (this.i != Integer.MAX_VALUE) {
                    P753981624812481271.b("Place was called on a node which was placed already");
                }
                int i = r80003005796793850192.h;
                this.i = i;
                r80003005796793850192.h = i + 1;
            }
        } else {
            this.i = 0;
        }
        x();
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void F(A6662317080022852970 a6662317080022852970) {
        D389890677992184566 z = this.f.a.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            L8383256292871170816 l8383256292871170816 = ((H11725168162114556860) objArr[i2]).G.q;
            l8383256292871170816.getClass();
            a6662317080022852970.invoke(l8383256292871170816);
        }
    }

    public final void F0(long j, F4096073349764486348 f4096073349764486348, B9692660393722135472 b9692660393722135472) {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 h117251681621145568602 = r8000300579679385019.a;
        try {
            H11725168162114556860 u = h11725168162114556860.u();
            J4327291511168983093 j4327291511168983093 = u != null ? u.G.d : null;
            J4327291511168983093 j43272915111689830932 = J4327291511168983093.d;
            if (j4327291511168983093 == j43272915111689830932) {
                r8000300579679385019.c = false;
            }
            if (h117251681621145568602.Q) {
                P753981624812481271.a("place is called on a deactivated node");
            }
            r8000300579679385019.d = j43272915111689830932;
            boolean z = true;
            this.l = true;
            this.C = false;
            if (!Q2551293802323679034.b(j, this.f352o)) {
                if (r8000300579679385019.n || r8000300579679385019.m) {
                    r8000300579679385019.f = true;
                }
                x0();
            }
            Y633750919412282388 a = P12010630787994328224.a(h117251681621145568602);
            this.f352o = j;
            if (!r8000300579679385019.f) {
                if (this.r == J4871791287292782500.c) {
                    z = false;
                }
                if (z) {
                    L5844152868342410893 c1 = r8000300579679385019.a().c1();
                    c1.getClass();
                    c1.U0(Q2551293802323679034.d(j, c1.e));
                    B0();
                    this.p = f4096073349764486348;
                    this.q = b9692660393722135472;
                    r8000300579679385019.d = J4327291511168983093.e;
                }
            }
            r8000300579679385019.h(false);
            this.s.g = false;
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) a).getSnapshotObserver();
            snapshotObserver.a.d(h117251681621145568602, snapshotObserver.g, this.B);
            this.p = f4096073349764486348;
            this.q = b9692660393722135472;
            r8000300579679385019.d = J4327291511168983093.e;
        } catch (Throwable th) {
            h11725168162114556860.Z(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G0(long r14) {
        /*
            r13 = this;
            dev.epro.r0.R8000300579679385019 r0 = r13.f
            dev.epro.r0.H11725168162114556860 r1 = r0.a
            dev.epro.r0.H11725168162114556860 r2 = r0.a
            boolean r3 = r1.Q     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            dev.epro.r0.P753981624812481271.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbb
        L13:
            dev.epro.r0.H11725168162114556860 r3 = r2.u()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.E     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.E     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.E = r3     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.R8000300579679385019 r3 = r2.G     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            dev.epro.r0.I16980768508151520658 r3 = r13.n     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = dev.epro.r0.I16980768508151520658.c(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            dev.epro.r0.Y633750919412282388 r13 = r2.n     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            dev.epro.r0.S7974369370986781936 r13 = (dev.epro.r0.S7974369370986781936) r13     // Catch: java.lang.Throwable -> L10
            r13.l(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.Y()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            dev.epro.r0.I16980768508151520658 r3 = new dev.epro.r0.I16980768508151520658     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.n = r3     // Catch: java.lang.Throwable -> L10
            r13.r0(r14)     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.V13058232089047844042 r3 = r13.s     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.D389890677992184566 r2 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.a     // Catch: java.lang.Throwable -> L10
            int r2 = r2.c     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.H11725168162114556860 r7 = (dev.epro.r0.H11725168162114556860) r7     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.R8000300579679385019 r7 = r7.G     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.L8383256292871170816 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.V13058232089047844042 r7 = r7.s     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.m     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.c     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.m = r5     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.Y4989033692226475498 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            dev.epro.r0.L5844152868342410893 r4 = r4.c1()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8f
            goto L94
        L8f:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            dev.epro.r0.P753981624812481271.b(r7)     // Catch: java.lang.Throwable -> L10
        L94:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.a     // Catch: java.lang.Throwable -> L10
            int r15 = r4.b     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.q0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.a     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lba
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.b     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lb9
            goto Lba
        Lb9:
            return r6
        Lba:
            return r5
        Lbb:
            r1.Z(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L8383256292871170816.G0(long):boolean");
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int V(int i) {
        z0();
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.V(i);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final int W() {
        return this.i;
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void Z() {
        H11725168162114556860.U(this.f.a, false, 7);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final V13058232089047844042 a() {
        return this.s;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int a0(int i) {
        z0();
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.a0(i);
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int b0(int i) {
        z0();
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.b0(i);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int c0(P777117574205674816 p777117574205674816) {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860 u = r8000300579679385019.a.u();
        J4327291511168983093 j4327291511168983093 = u != null ? u.G.d : null;
        J4327291511168983093 j43272915111689830932 = J4327291511168983093.b;
        V13058232089047844042 v13058232089047844042 = this.s;
        if (j4327291511168983093 == j43272915111689830932) {
            v13058232089047844042.c = true;
        } else {
            H11725168162114556860 u2 = r8000300579679385019.a.u();
            if ((u2 != null ? u2.G.d : null) == J4327291511168983093.d) {
                v13058232089047844042.d = true;
            }
        }
        this.k = true;
        L5844152868342410893 c1 = r8000300579679385019.a().c1();
        c1.getClass();
        int c0 = c1.c0(p777117574205674816);
        this.k = false;
        return c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.G.d : null) == dev.epro.r0.J4327291511168983093.d) goto L14;
     */
    @Override // dev.epro.r0.G17613326942144185441
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.Z17471428274427141949 d(long r7) {
        /*
            r6 = this;
            dev.epro.r0.R8000300579679385019 r0 = r6.f
            dev.epro.r0.H11725168162114556860 r1 = r0.a
            dev.epro.r0.H11725168162114556860 r2 = r0.a
            dev.epro.r0.H11725168162114556860 r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            dev.epro.r0.R8000300579679385019 r1 = r1.G
            dev.epro.r0.J4327291511168983093 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            dev.epro.r0.J4327291511168983093 r4 = dev.epro.r0.J4327291511168983093.b
            if (r1 == r4) goto L27
            dev.epro.r0.H11725168162114556860 r1 = r2.u()
            if (r1 == 0) goto L22
            dev.epro.r0.R8000300579679385019 r1 = r1.G
            dev.epro.r0.J4327291511168983093 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            dev.epro.r0.J4327291511168983093 r4 = dev.epro.r0.J4327291511168983093.d
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            dev.epro.r0.H11725168162114556860 r0 = r2.u()
            dev.epro.r0.Q8181337811809788579 r1 = dev.epro.r0.Q8181337811809788579.c
            if (r0 == 0) goto L64
            dev.epro.r0.R8000300579679385019 r0 = r0.G
            dev.epro.r0.Q8181337811809788579 r4 = r6.j
            if (r4 == r1) goto L42
            boolean r4 = r2.E
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            dev.epro.r0.P753981624812481271.b(r4)
        L42:
            dev.epro.r0.J4327291511168983093 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            dev.epro.r0.J4327291511168983093 r6 = r0.d
            java.lang.String r7 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            dev.epro.r0.D11988991656201568495.k(r7, r6)
            return r3
        L5c:
            dev.epro.r0.Q8181337811809788579 r0 = dev.epro.r0.Q8181337811809788579.b
            goto L61
        L5f:
            dev.epro.r0.Q8181337811809788579 r0 = dev.epro.r0.Q8181337811809788579.a
        L61:
            r6.j = r0
            goto L66
        L64:
            r6.j = r1
        L66:
            dev.epro.r0.Q8181337811809788579 r0 = r2.C
            if (r0 != r1) goto L6d
            r2.c()
        L6d:
            r6.G0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L8383256292871170816.d(long):dev.epro.r0.Z17471428274427141949");
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int d0() {
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.d0();
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int f(int i) {
        z0();
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.f(i);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int j0() {
        L5844152868342410893 c1 = this.f.a().c1();
        c1.getClass();
        return c1.j0();
    }

    @Override // dev.epro.r0.Z17471428274427141949, dev.epro.r0.G17613326942144185441
    public final Object k() {
        return this.y;
    }

    @Override // dev.epro.r0.Z3857703353417784960
    public final void n(boolean z) {
        L5844152868342410893 c1;
        R8000300579679385019 r8000300579679385019 = this.f;
        L5844152868342410893 c12 = r8000300579679385019.a().c1();
        if (Boolean.valueOf(z).equals(c12 != null ? Boolean.valueOf(c12.l) : null) || (c1 = r8000300579679385019.a().c1()) == null) {
            return;
        }
        c1.l = z;
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void n0(long j, float f, F4096073349764486348 f4096073349764486348) {
        F0(j, f4096073349764486348, null);
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void o0(long j, float f, B9692660393722135472 b9692660393722135472) {
        F0(j, null, b9692660393722135472);
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final I16141028645763443416 p() {
        return (I16141028645763443416) this.f.a.F.d;
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void requestLayout() {
        this.f.a.T(false);
    }

    public final boolean s0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        return O4077903568229246.y(r8000300579679385019.a) || r8000300579679385019.c;
    }

    public final void u0(boolean z) {
        if (z && s0()) {
            return;
        }
        if (z || s0()) {
            this.r = J4871791287292782500.c;
            D389890677992184566 z2 = this.f.a.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                L8383256292871170816 l8383256292871170816 = ((H11725168162114556860) objArr[i2]).G.q;
                l8383256292871170816.getClass();
                l8383256292871170816.u0(true);
            }
        }
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final P10552808509296666343 v() {
        R8000300579679385019 r8000300579679385019;
        H11725168162114556860 u = this.f.a.u();
        if (u == null || (r8000300579679385019 = u.G) == null) {
            return null;
        }
        return r8000300579679385019.q;
    }

    public final void w0() {
        J4871791287292782500 j4871791287292782500 = this.r;
        R8000300579679385019 r8000300579679385019 = this.f;
        boolean z = r8000300579679385019.c;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        J4871791287292782500 j48717912872927825002 = J4871791287292782500.a;
        if (z) {
            this.r = J4871791287292782500.b;
        } else {
            this.r = j48717912872927825002;
        }
        if (j4871791287292782500 != j48717912872927825002 && r8000300579679385019.e) {
            H11725168162114556860.U(h11725168162114556860, true, 6);
        }
        D389890677992184566 z2 = h11725168162114556860.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
            L8383256292871170816 l8383256292871170816 = h117251681621145568602.G.q;
            if (l8383256292871170816 == null) {
                S10973172697741180971.j("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (l8383256292871170816.i != Integer.MAX_VALUE) {
                l8383256292871170816.w0();
                H11725168162114556860.X(h117251681621145568602);
            }
        }
    }

    @Override // dev.epro.r0.P10552808509296666343
    public final void x() {
        this.v = true;
        V13058232089047844042 v13058232089047844042 = this.s;
        v13058232089047844042.h();
        R8000300579679385019 r8000300579679385019 = this.f;
        boolean z = r8000300579679385019.f;
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        if (z) {
            D389890677992184566 z2 = h11725168162114556860.z();
            Object[] objArr = z2.a;
            int i = z2.c;
            for (int i2 = 0; i2 < i; i2++) {
                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) objArr[i2];
                R8000300579679385019 r80003005796793850192 = h117251681621145568602.G;
                if (r80003005796793850192.e && h117251681621145568602.s() == Q8181337811809788579.a) {
                    L8383256292871170816 l8383256292871170816 = r80003005796793850192.q;
                    l8383256292871170816.getClass();
                    L8383256292871170816 l83832562928711708162 = r80003005796793850192.q;
                    I16980768508151520658 i16980768508151520658 = l83832562928711708162 != null ? l83832562928711708162.n : null;
                    i16980768508151520658.getClass();
                    if (l8383256292871170816.G0(i16980768508151520658.a)) {
                        H11725168162114556860.U(h11725168162114556860, false, 7);
                    }
                }
            }
        }
        N2516046390769984807 n2516046390769984807 = p().d0;
        n2516046390769984807.getClass();
        if (r8000300579679385019.g || (!this.k && !n2516046390769984807.f283o && r8000300579679385019.f)) {
            r8000300579679385019.f = false;
            J4327291511168983093 j4327291511168983093 = r8000300579679385019.d;
            r8000300579679385019.d = J4327291511168983093.d;
            r8000300579679385019.i(false);
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getSnapshotObserver();
            snapshotObserver.a.d(h11725168162114556860, snapshotObserver.h, this.w);
            r8000300579679385019.d = j4327291511168983093;
            if (r8000300579679385019.m && n2516046390769984807.f283o) {
                requestLayout();
            }
            r8000300579679385019.g = false;
        }
        if (v13058232089047844042.d) {
            v13058232089047844042.e = true;
        }
        if (v13058232089047844042.b && v13058232089047844042.e()) {
            v13058232089047844042.g();
        }
        this.v = false;
    }

    public final void x0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        if (r8000300579679385019.f474o > 0) {
            D389890677992184566 z = r8000300579679385019.a.z();
            Object[] objArr = z.a;
            int i = z.c;
            for (int i2 = 0; i2 < i; i2++) {
                H11725168162114556860 h11725168162114556860 = (H11725168162114556860) objArr[i2];
                R8000300579679385019 r80003005796793850192 = h11725168162114556860.G;
                if ((r80003005796793850192.m || r80003005796793850192.n) && !r80003005796793850192.f) {
                    h11725168162114556860.T(false);
                }
                L8383256292871170816 l8383256292871170816 = r80003005796793850192.q;
                if (l8383256292871170816 != null) {
                    l8383256292871170816.x0();
                }
            }
        }
    }

    public final void z0() {
        R8000300579679385019 r8000300579679385019 = this.f;
        H11725168162114556860.U(r8000300579679385019.a, false, 7);
        H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
        H11725168162114556860 u = h11725168162114556860.u();
        if (u == null || h11725168162114556860.C != Q8181337811809788579.c) {
            return;
        }
        int ordinal = u.G.d.ordinal();
        h11725168162114556860.C = ordinal != 0 ? ordinal != 2 ? u.C : Q8181337811809788579.b : Q8181337811809788579.a;
    }
}
