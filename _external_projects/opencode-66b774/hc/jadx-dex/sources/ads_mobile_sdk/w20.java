package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w20 implements dev.epro.r0.O12043144740933444288 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final ads_mobile_sdk.jr0 b;
    public final dev.epro.r0.K12714355155332733186 c;
    public final android.content.Context d;
    public final ads_mobile_sdk.kz2 e;
    public final ads_mobile_sdk.b41 f;
    public final ads_mobile_sdk.fi0 g;
    public final dev.epro.r0.F7878618420024429111 h;
    public ads_mobile_sdk.hs i;
    public ads_mobile_sdk.w81 j;
    public final dev.epro.r0.H15186625828076266306 k;
    public final java.util.concurrent.atomic.AtomicReference l;
    public final java.util.concurrent.atomic.AtomicReference m;
    public final dev.epro.r0.R5692663580087387669 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.R5692663580087387669 f119o;
    public final java.util.concurrent.atomic.AtomicBoolean p;
    public final java.util.concurrent.atomic.AtomicBoolean q;
    public final dev.epro.r0.O12494175665883759871 r;

    public w20(dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.G8001132634698687269 g8001132634698687269, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.aw awVar, dev.epro.r0.K12714355155332733186 k12714355155332733186, android.content.Context context, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.b41 b41Var, ads_mobile_sdk.fi0 fi0Var) {
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        awVar.getClass();
        k12714355155332733186.getClass();
        context.getClass();
        this.a = w5797197595347441198;
        this.b = jr0Var;
        this.c = k12714355155332733186;
        this.d = context;
        this.e = kz2Var;
        this.f = b41Var;
        this.g = fi0Var;
        this.h = awVar.d;
        this.k = new dev.epro.r0.H15186625828076266306();
        this.l = new java.util.concurrent.atomic.AtomicReference();
        this.m = new java.util.concurrent.atomic.AtomicReference();
        this.n = dev.epro.r0.J8045362843799184672.k();
        this.f119o = dev.epro.r0.J8045362843799184672.k();
        this.p = new java.util.concurrent.atomic.AtomicBoolean();
        this.q = new java.util.concurrent.atomic.AtomicBoolean();
        this.r = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.H2607093550274855851(this, (byte) 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0353, code lost:
    
        if (r12.a(r2, r15, r3) == r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0168, code lost:
    
        if (r13 == r4) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[PHI: r0 r3 r5 r8 r11 r12
      0x011d: PHI (r0v7 boolean) = (r0v3 boolean), (r0v8 boolean) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r3v9 boolean) = (r3v6 boolean), (r3v10 boolean) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r5v4 java.util.UUID) = (r5v1 java.util.UUID), (r5v5 java.util.UUID) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r8v8 org.chromium.net.CronetEngine) = (r8v4 org.chromium.net.CronetEngine), (r8v9 org.chromium.net.CronetEngine) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r11v8 ads_mobile_sdk.y11) = (r11v5 ads_mobile_sdk.y11), (r11v9 ads_mobile_sdk.y11) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r12v7 ads_mobile_sdk.w20) = (r12v4 ads_mobile_sdk.w20), (r12v8 ads_mobile_sdk.w20) binds: [B:24:0x00ca, B:36:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf A[LOOP:2: B:53:0x01b9->B:55:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0214 -> B:64:0x021c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.y11 r21, org.chromium.net.CronetEngine r22, boolean r23, boolean r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(ads_mobile_sdk.y11, org.chromium.net.CronetEngine, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.Object a(ads_mobile_sdk.ef1 ef1Var) {
        boolean andSet = this.p.getAndSet(true);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (andSet) {
            return o9245300239821758723;
        }
        dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(this, (dev.epro.r0.R4833348786910499294) null, (byte) 10);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.a;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        return o9245300239821758723;
    }

    public final java.lang.Object a(int i, long j, ads_mobile_sdk.l5 l5Var) {
        boolean andSet = this.q.getAndSet(true);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (andSet) {
            return o9245300239821758723;
        }
        dev.epro.r0.H1843233428029030203 h1843233428029030203 = new dev.epro.r0.H1843233428029030203((byte) 1, j, (dev.epro.r0.R4833348786910499294) null, this);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.a;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(h1843233428029030203, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        return o9245300239821758723;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r0.invoke(r8) == r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0121, code lost:
    
        if (r0.invoke(r8) == r9) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0163 A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #6 {all -> 0x013d, blocks: (B:87:0x012a, B:89:0x0131, B:91:0x0135, B:93:0x0139, B:96:0x0140, B:98:0x0144, B:100:0x0148, B:102:0x014c, B:103:0x014d, B:104:0x0152, B:105:0x0153, B:106:0x015a, B:107:0x015b, B:108:0x0162, B:109:0x0163), top: B:129:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[Catch: all -> 0x00e6, TryCatch #4 {all -> 0x00e6, blocks: (B:52:0x00d3, B:54:0x00da, B:56:0x00de, B:58:0x00e2, B:61:0x00e9, B:63:0x00ed, B:65:0x00f1, B:67:0x00f5, B:68:0x00f6, B:69:0x00fb, B:70:0x00fc, B:71:0x0103, B:72:0x0104, B:73:0x010b, B:74:0x010c), top: B:126:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #4 {all -> 0x00e6, blocks: (B:52:0x00d3, B:54:0x00da, B:56:0x00de, B:58:0x00e2, B:61:0x00e9, B:63:0x00ed, B:65:0x00f1, B:67:0x00f5, B:68:0x00f6, B:69:0x00fb, B:70:0x00fc, B:71:0x0103, B:72:0x0104, B:73:0x010b, B:74:0x010c), top: B:126:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131 A[Catch: all -> 0x013d, TryCatch #6 {all -> 0x013d, blocks: (B:87:0x012a, B:89:0x0131, B:91:0x0135, B:93:0x0139, B:96:0x0140, B:98:0x0144, B:100:0x0148, B:102:0x014c, B:103:0x014d, B:104:0x0152, B:105:0x0153, B:106:0x015a, B:107:0x015b, B:108:0x0162, B:109:0x0163), top: B:129:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.concurrent.atomic.AtomicReference r16, dev.epro.r0.R5692663580087387669 r17, java.lang.Long r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(java.util.concurrent.atomic.AtomicReference, dev.epro.r0.R5692663580087387669, java.lang.Long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.util.UUID r8, dev.epro.r0.I16631908410500040363 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.n20
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.n20 r0 = (ads_mobile_sdk.n20) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.n20 r0 = new ads_mobile_sdk.n20
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            dev.epro.r0.I16631908410500040363 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L7d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L30:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.I16631908410500040363 r10 = new dev.epro.r0.I16631908410500040363
            r10.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            java.lang.String r4 = "timestamp"
            r10.s(r4, r1)
            java.lang.String r1 = "event"
            r10.t(r1, r7)
            dev.epro.r0.P16422848101170923038 r7 = new dev.epro.r0.P16422848101170923038
            r7.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "network_request_"
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.r(r8)
            java.lang.String r8 = "components"
            r10.q(r8, r7)
            java.lang.String r7 = "params"
            r10.q(r7, r9)
            r0.a = r10
            dev.epro.r0.H15186625828076266306 r6 = r6.k
            r0.b = r6
            r0.e = r2
            java.lang.Object r7 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L7c
            return r8
        L7c:
            r7 = r10
        L7d:
            java.util.Objects.toString(r7)     // Catch: java.lang.Throwable -> L86
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L86
            r6.b(r3)
            return r7
        L86:
            r7 = move-exception
            r6.b(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(java.lang.String, java.util.UUID, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r0.a("onNetworkRequestError", r2, r3, r4) == r11) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.a21 r18, java.util.UUID r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(ads_mobile_sdk.a21, java.util.UUID, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.util.Map r10, dev.epro.r0.R4833348786910499294 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.p20
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.p20 r0 = (ads_mobile_sdk.p20) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L1a
        L13:
            ads_mobile_sdk.p20 r0 = new ads_mobile_sdk.p20
            dev.epro.r0.K14749510448791472029 r11 = (dev.epro.r0.K14749510448791472029) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L46
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            dev.epro.r0.E17665849472693074628.k(r11)
            return r3
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r6
        L35:
            java.lang.String r8 = r0.d
            ads_mobile_sdk.x11 r9 = r0.c
            ads_mobile_sdk.x11 r10 = r0.b
            ads_mobile_sdk.w20 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
            r7 = r9
            r9 = r8
            r8 = r1
            r1 = r11
            r11 = r7
            goto L93
        L46:
            dev.epro.r0.E17665849472693074628.k(r11)
            ads_mobile_sdk.x11 r11 = new ads_mobile_sdk.x11
            r11.<init>()
            r11.b(r9)
            java.lang.String r9 = "GET"
            r11.a(r9, r6)
            if (r10 == 0) goto L7c
            java.util.Set r9 = r10.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L7c
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            r11.a(r1, r10)
            goto L60
        L7c:
            r0.a = r8
            r0.b = r11
            r0.c = r11
            java.lang.String r9 = "User-Agent"
            r0.d = r9
            r0.g = r5
            dev.epro.r0.K12714355155332733186 r10 = r8.c
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r2) goto L91
            goto Lc0
        L91:
            r1 = r10
            r10 = r11
        L93:
            java.lang.String r1 = (java.lang.String) r1
            r11.a(r9, r1)
            ads_mobile_sdk.y11 r9 = r10.a()
            java.util.UUID r10 = java.util.UUID.randomUUID()
            r10.getClass()
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.d = r6
            r0.g = r4
            r8.getClass()
            dev.epro.r0.I16631908410500040363 r9 = dev.epro.r0.T3224757362656795885.b(r9)
            java.lang.String r11 = "onNetworkRequest"
            java.lang.Object r8 = r8.a(r11, r10, r9, r0)
            if (r8 != r2) goto Lbd
            goto Lbe
        Lbd:
            r8 = r3
        Lbe:
            if (r8 != r2) goto Lc1
        Lc0:
            return r2
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(java.lang.String, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final java.lang.Object a(ads_mobile_sdk.y11 y11Var, dev.epro.r0.E17093345031926825464 e17093345031926825464, ads_mobile_sdk.x22 x22Var) {
        return dev.epro.r0.O12043144740933444288.b(this, y11Var, e17093345031926825464, x22Var, 20);
    }

    public final java.lang.Object a(java.net.URL url, ads_mobile_sdk.bn0 bn0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.net.URL url2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.net.URL urlC = dev.epro.r0.T8598786036980488824.c(url, bn0Var, this.b);
        if (arrayList.isEmpty()) {
            url2 = urlC;
        } else {
            java.lang.String string = urlC.toString();
            string.getClass();
            android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(string).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                dev.epro.r0.H9390398899829886498 h9390398899829886498 = (dev.epro.r0.H9390398899829886498) obj;
                builderBuildUpon.appendQueryParameter((java.lang.String) h9390398899829886498.a, (java.lang.String) h9390398899829886498.b);
            }
            url2 = new java.net.URL(builderBuildUpon.build().toString());
        }
        return dev.epro.r0.O12043144740933444288.b(this, new ads_mobile_sdk.y11(url2, "GET", dev.epro.r0.E4951175994894594588.z0(linkedHashMap), null, bn0Var, null), (dev.epro.r0.E17093345031926825464) null, (dev.epro.r0.K14749510448791472029) r4833348786910499294, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.net.URL r10, dev.epro.r0.R4833348786910499294 r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(java.net.URL, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b5, code lost:
    
        if (r2 != r9) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.y11 r25, dev.epro.r0.E17093345031926825464 r26, java.util.Map r27, boolean r28, boolean r29, dev.epro.r0.K14749510448791472029 r30) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(ads_mobile_sdk.y11, dev.epro.r0.E17093345031926825464, java.util.Map, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.Object a(java.net.URL url, java.util.Map map, boolean z, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        java.net.URL url2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (arrayList.isEmpty()) {
            url2 = url;
        } else {
            java.lang.String string = url.toString();
            string.getClass();
            android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(string).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                dev.epro.r0.H9390398899829886498 h9390398899829886498 = (dev.epro.r0.H9390398899829886498) obj;
                builderBuildUpon.appendQueryParameter((java.lang.String) h9390398899829886498.a, (java.lang.String) h9390398899829886498.b);
            }
            url2 = new java.net.URL(builderBuildUpon.build().toString());
        }
        return a(new ads_mobile_sdk.y11(url2, "GET", dev.epro.r0.E4951175994894594588.z0(linkedHashMap), null, null, null), null, map, false, z, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.w20 r7, org.chromium.net.CronetEngine.Builder r8, java.lang.Long r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w20.a(ads_mobile_sdk.w20, org.chromium.net.CronetEngine$Builder, java.lang.Long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(ads_mobile_sdk.hs hsVar) {
        hsVar.getClass();
        this.i = hsVar;
    }

    public final void a(ads_mobile_sdk.w81 w81Var) {
        w81Var.getClass();
        this.j = w81Var;
    }
}
