package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class T739303342369911896 implements L12639328004344855510 {
    public final /* synthetic */ J12078565427869724451 a;
    public final /* synthetic */ S16571168858015125610 b;
    public final /* synthetic */ I2076339260272013590 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ P10756132848474239277 g;
    public final /* synthetic */ F13241018602672925865 h;
    public final /* synthetic */ H14763425654620554740 i;
    public final /* synthetic */ I1722681268793429505 j;
    public final /* synthetic */ I1722681268793429505 k;
    public final /* synthetic */ I1722681268793429505 l;
    public final /* synthetic */ I1722681268793429505 m;
    public final /* synthetic */ N18033783269298797248 n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ L9852841107405549527 f508o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ H18157283590851071619 r;
    public final /* synthetic */ W5797197595347441198 s;
    public final /* synthetic */ F4096073349764486348 t;
    public final /* synthetic */ R17143752899285419206 u;
    public final /* synthetic */ R8540738700654750557 v;

    public /* synthetic */ T739303342369911896(J12078565427869724451 j12078565427869724451, S16571168858015125610 s16571168858015125610, I2076339260272013590 i2076339260272013590, int i, int i2, boolean z, P10756132848474239277 p10756132848474239277, F13241018602672925865 f13241018602672925865, H14763425654620554740 h14763425654620554740, I1722681268793429505 i1722681268793429505, I1722681268793429505 i17226812687934295052, I1722681268793429505 i17226812687934295053, I1722681268793429505 i17226812687934295054, N18033783269298797248 n18033783269298797248, L9852841107405549527 l9852841107405549527, boolean z2, boolean z3, H18157283590851071619 h18157283590851071619, W5797197595347441198 w5797197595347441198, F4096073349764486348 f4096073349764486348, R17143752899285419206 r17143752899285419206, R8540738700654750557 r8540738700654750557) {
        this.a = j12078565427869724451;
        this.b = s16571168858015125610;
        this.c = i2076339260272013590;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = p10756132848474239277;
        this.h = f13241018602672925865;
        this.i = h14763425654620554740;
        this.j = i1722681268793429505;
        this.k = i17226812687934295052;
        this.l = i17226812687934295053;
        this.m = i17226812687934295054;
        this.n = n18033783269298797248;
        this.f508o = l9852841107405549527;
        this.p = z2;
        this.q = z3;
        this.r = h18157283590851071619;
        this.s = w5797197595347441198;
        this.t = f4096073349764486348;
        this.u = r17143752899285419206;
        this.v = r8540738700654750557;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Integer) obj2).intValue();
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            final S16571168858015125610 s16571168858015125610 = this.b;
            final I2076339260272013590 i2076339260272013590 = this.c;
            final int i = this.d;
            final int i2 = this.e;
            final boolean z = this.f;
            final P10756132848474239277 p10756132848474239277 = this.g;
            final F13241018602672925865 f13241018602672925865 = this.h;
            final H14763425654620554740 h14763425654620554740 = this.i;
            final I1722681268793429505 i1722681268793429505 = this.j;
            final I1722681268793429505 i17226812687934295052 = this.k;
            final I1722681268793429505 i17226812687934295053 = this.l;
            final I1722681268793429505 i17226812687934295054 = this.m;
            final N18033783269298797248 n18033783269298797248 = this.n;
            final L9852841107405549527 l9852841107405549527 = this.f508o;
            final boolean z2 = this.p;
            final boolean z3 = this.q;
            final H18157283590851071619 h18157283590851071619 = this.r;
            final W5797197595347441198 w5797197595347441198 = this.s;
            final F4096073349764486348 f4096073349764486348 = this.t;
            final R17143752899285419206 r17143752899285419206 = this.u;
            final R8540738700654750557 r8540738700654750557 = this.v;
            this.a.invoke(S10823041268949770285.T(-44346382, new L12639328004344855510() { // from class: dev.epro.r0.M6063975736865624517
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj3, Object obj4) {
                    I1722681268793429505 h14390007865053637179;
                    M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (m37272810273311398392.R(intValue2 & 1, (intValue2 & 3) != 2)) {
                        final I2076339260272013590 i20763392602720135902 = i2076339260272013590;
                        float f = ((A891803927997771281) i20763392602720135902.g.getValue()).a;
                        I1722681268793429505 d = V16747615581620678882.d(V10993962107938880611.a, f, A891803927997771281.b(f, 0.0f) ? Float.NaN : f);
                        int i3 = i;
                        final int i4 = i2;
                        V933048422416352811.N(i3, i4);
                        S16571168858015125610 s165711688580151256102 = S16571168858015125610.this;
                        if ((i3 != 1 || i4 != Integer.MAX_VALUE) && z) {
                            d = d.Q0(new M17049272064870275792(s165711688580151256102, i3, i4));
                        }
                        boolean h = m37272810273311398392.h(i20763392602720135902);
                        Object M = m37272810273311398392.M();
                        if (h || M == O9023047933786425027.a) {
                            M = new S464754454553842217(i20763392602720135902, (byte) 18);
                            m37272810273311398392.k0(M);
                        }
                        B13729205492206812220 b13729205492206812220 = (B13729205492206812220) M;
                        P10756132848474239277 p107561328484742392772 = p10756132848474239277;
                        R7000310675073492254 r7000310675073492254 = (R7000310675073492254) p107561328484742392772.f.getValue();
                        final F13241018602672925865 f132410186026729258652 = f13241018602672925865;
                        long j = f132410186026729258652.b;
                        int i5 = F12478849263529740365.c;
                        int i6 = (int) (j >> 32);
                        long j2 = p107561328484742392772.e;
                        if (i6 == ((int) (j2 >> 32)) && (i6 = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
                            i6 = F12478849263529740365.g(j);
                        }
                        p107561328484742392772.e = f132410186026729258652.b;
                        W12973714701299903186 a = N2420111770332391767.a(h14763425654620554740, f132410186026729258652.a);
                        int ordinal = r7000310675073492254.ordinal();
                        if (ordinal == 0) {
                            h14390007865053637179 = new H14390007865053637179(p107561328484742392772, i6, a, b13729205492206812220);
                        } else {
                            if (ordinal != 1) {
                                Z3383101362411723454.g();
                                return null;
                            }
                            h14390007865053637179 = new C18014685612837461274(p107561328484742392772, i6, a, b13729205492206812220);
                        }
                        I1722681268793429505 Q0 = R7033599853981556291.q(F12841283984235263986.a(d)).Q0(h14390007865053637179).Q0(i1722681268793429505).Q0(i17226812687934295052).Q0(new T3849321412154095251(s165711688580151256102)).Q0(i17226812687934295053).Q0(i17226812687934295054);
                        final N18033783269298797248 n180337832692987972482 = n18033783269298797248;
                        I1722681268793429505 v = E18444280280170001567.v(Q0, n180337832692987972482);
                        final L9852841107405549527 l98528411074055495272 = l9852841107405549527;
                        final boolean z4 = z2;
                        final boolean z5 = z3;
                        final H18157283590851071619 h181572835908510716192 = h18157283590851071619;
                        final W5797197595347441198 w57971975953474411982 = w5797197595347441198;
                        final F4096073349764486348 f40960733497644863482 = f4096073349764486348;
                        final R17143752899285419206 r171437528992854192062 = r17143752899285419206;
                        final R8540738700654750557 r85407387006547505572 = r8540738700654750557;
                        Y2666402291564931474.c(v, S10823041268949770285.T(1412697320, new L12639328004344855510() { // from class: dev.epro.r0.K2600798886140165432
                            /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
                            
                                if (r4 != false) goto L21;
                             */
                            @Override // dev.epro.r0.L12639328004344855510
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
                                /*
                                    r18 = this;
                                    r0 = r18
                                    r1 = r19
                                    dev.epro.r0.M3727281027331139839 r1 = (dev.epro.r0.M3727281027331139839) r1
                                    r2 = r20
                                    java.lang.Integer r2 = (java.lang.Integer) r2
                                    int r2 = r2.intValue()
                                    r3 = r2 & 3
                                    r4 = 2
                                    r5 = 1
                                    r6 = 0
                                    if (r3 == r4) goto L17
                                    r3 = r5
                                    goto L18
                                L17:
                                    r3 = r6
                                L18:
                                    r2 = r2 & r5
                                    boolean r2 = r1.R(r2, r3)
                                    if (r2 == 0) goto Lc8
                                    dev.epro.r0.R2897871380689134506 r7 = new dev.epro.r0.R2897871380689134506
                                    dev.epro.r0.I2076339260272013590 r8 = r2
                                    dev.epro.r0.L9852841107405549527 r9 = dev.epro.r0.L9852841107405549527.this
                                    dev.epro.r0.H18157283590851071619 r10 = r5
                                    dev.epro.r0.W5797197595347441198 r11 = r6
                                    dev.epro.r0.F4096073349764486348 r12 = r7
                                    dev.epro.r0.F13241018602672925865 r13 = r8
                                    dev.epro.r0.R17143752899285419206 r14 = r9
                                    dev.epro.r0.R8540738700654750557 r15 = r10
                                    dev.epro.r0.N18033783269298797248 r2 = r11
                                    int r3 = r12
                                    r16 = r2
                                    r17 = r3
                                    r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                    long r2 = r1.T
                                    int r2 = java.lang.Long.hashCode(r2)
                                    dev.epro.r0.P3648740535677465818 r3 = r1.l()
                                    dev.epro.r0.V10993962107938880611 r4 = dev.epro.r0.V10993962107938880611.a
                                    dev.epro.r0.I1722681268793429505 r4 = dev.epro.r0.V12319504402545346730.N(r1, r4)
                                    dev.epro.r0.P2382941533350862833 r10 = dev.epro.r0.X4572652335386916693.Po
                                    r10.getClass()
                                    r1.d0()
                                    boolean r10 = r1.S
                                    if (r10 == 0) goto L5e
                                    dev.epro.r0.D2443437645761252362 r10 = dev.epro.r0.H11725168162114556860.S
                                    r1.k(r10)
                                    goto L61
                                L5e:
                                    r1.n0()
                                L61:
                                    dev.epro.r0.X4712621039624176170 r10 = dev.epro.r0.P2382941533350862833.i
                                    dev.epro.r0.W7808703833045379622.J(r10, r1, r7)
                                    dev.epro.r0.X4712621039624176170 r7 = dev.epro.r0.P2382941533350862833.h
                                    dev.epro.r0.W7808703833045379622.J(r7, r1, r3)
                                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                                    dev.epro.r0.X4712621039624176170 r3 = dev.epro.r0.P2382941533350862833.j
                                    dev.epro.r0.W7808703833045379622.J(r3, r1, r2)
                                    dev.epro.r0.W7808703833045379622.H(r1)
                                    dev.epro.r0.X4712621039624176170 r2 = dev.epro.r0.P2382941533350862833.g
                                    dev.epro.r0.W7808703833045379622.J(r2, r1, r4)
                                    r1.q(r5)
                                    dev.epro.r0.I3645473568512758926 r2 = r8.a()
                                    dev.epro.r0.I3645473568512758926 r3 = dev.epro.r0.I3645473568512758926.a
                                    boolean r4 = r3
                                    if (r2 == r3) goto L9f
                                    dev.epro.r0.B1029012102904255937 r2 = r8.c()
                                    if (r2 == 0) goto L9f
                                    dev.epro.r0.B1029012102904255937 r2 = r8.c()
                                    r2.getClass()
                                    boolean r2 = r2.C()
                                    if (r2 == 0) goto L9f
                                    if (r4 == 0) goto L9f
                                    goto La0
                                L9f:
                                    r5 = r6
                                La0:
                                    dev.epro.r0.Y582199805280922215.j(r9, r5, r1, r6)
                                    dev.epro.r0.I3645473568512758926 r2 = r8.a()
                                    dev.epro.r0.I3645473568512758926 r3 = dev.epro.r0.I3645473568512758926.c
                                    if (r2 != r3) goto Lbe
                                    boolean r0 = r4
                                    if (r0 != 0) goto Lbe
                                    if (r4 == 0) goto Lbe
                                    r0 = -713510518(0xffffffffd578b18a, float:-1.7090088E13)
                                    r1.a0(r0)
                                    dev.epro.r0.Y582199805280922215.k(r9, r1, r6)
                                    r1.q(r6)
                                    goto Lcb
                                Lbe:
                                    r0 = -713433638(0xffffffffd579ddda, float:-1.71707025E13)
                                    r1.a0(r0)
                                    r1.q(r6)
                                    goto Lcb
                                Lc8:
                                    r1.U()
                                Lcb:
                                    dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K2600798886140165432.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, m37272810273311398392), m37272810273311398392, 48);
                    } else {
                        m37272810273311398392.U();
                    }
                    return O9245300239821758723.a;
                }
            }, m3727281027331139839), m3727281027331139839, 6);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
