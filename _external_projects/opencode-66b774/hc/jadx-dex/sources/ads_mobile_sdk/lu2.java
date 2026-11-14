package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lu2 implements dev.epro.r0.S3216761178606715008, dev.epro.r0.G16864365537574524285 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final ads_mobile_sdk.jr0 c;
    public ads_mobile_sdk.dq2 d;
    public final dev.epro.r0.H15186625828076266306 e;
    public dev.epro.r0.X7175349259954592591 f;
    public dev.epro.r0.R5692663580087387669 g;
    public dev.epro.r0.R5692663580087387669 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f74o;
    public long p;

    public lu2(dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.jr0 jr0Var) {
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = jr0Var;
        this.e = new dev.epro.r0.H15186625828076266306();
        dev.epro.r0.R5692663580087387669 r5692663580087387669K = dev.epro.r0.J8045362843799184672.k();
        r5692663580087387669K.f0();
        this.g = r5692663580087387669K;
        dev.epro.r0.R5692663580087387669 r5692663580087387669K2 = dev.epro.r0.J8045362843799184672.k();
        r5692663580087387669K2.f0();
        this.h = r5692663580087387669K2;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.e;
        dev.epro.r0.E17093345031926825464 e17093345031926825464 = new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(60, n13798149404328803870));
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a;
        this.f74o = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:banner_refresh_time:seconds", e17093345031926825464, aoVar)).a;
        this.p = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:banner_refresh_load_ad_delay:seconds", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(30, n13798149404328803870)), aoVar)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00aa A[EXC_TOP_SPLITTER, PHI: r14 r15
      0x00aa: PHI (r14v35 ??) = (r14v16 ??), (r14v41 ??) binds: [B:45:0x008e, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r15v18 dev.epro.r0.H15186625828076266306) = (r15v6 dev.epro.r0.H15186625828076266306), (r15v21 dev.epro.r0.H15186625828076266306) binds: [B:45:0x008e, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a A[Catch: CancellationException -> 0x003c, kq2 -> 0x003f, PHI: r14
      0x009a: PHI (r14v36 ??) = (r14v38 ??), (r14v39 ??), (r14v40 ??) binds: [B:48:0x0097, B:83:0x0149, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {kq2 -> 0x003f, CancellationException -> 0x003c, blocks: (B:14:0x0037, B:49:0x009a, B:56:0x00b7, B:59:0x00bd, B:62:0x00d1, B:64:0x00d5, B:67:0x00e8, B:82:0x013c, B:90:0x0155, B:91:0x0158, B:93:0x015a, B:94:0x015d, B:38:0x007a, B:41:0x0081, B:52:0x00aa), top: B:108:0x0027, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd A[Catch: CancellationException -> 0x003c, kq2 -> 0x003f, TryCatch #6 {kq2 -> 0x003f, CancellationException -> 0x003c, blocks: (B:14:0x0037, B:49:0x009a, B:56:0x00b7, B:59:0x00bd, B:62:0x00d1, B:64:0x00d5, B:67:0x00e8, B:82:0x013c, B:90:0x0155, B:91:0x0158, B:93:0x015a, B:94:0x015d, B:38:0x007a, B:41:0x0081, B:52:0x00aa), top: B:108:0x0027, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5 A[Catch: CancellationException -> 0x003c, kq2 -> 0x003f, TryCatch #6 {kq2 -> 0x003f, CancellationException -> 0x003c, blocks: (B:14:0x0037, B:49:0x009a, B:56:0x00b7, B:59:0x00bd, B:62:0x00d1, B:64:0x00d5, B:67:0x00e8, B:82:0x013c, B:90:0x0155, B:91:0x0158, B:93:0x015a, B:94:0x015d, B:38:0x007a, B:41:0x0081, B:52:0x00aa), top: B:108:0x0027, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129 A[Catch: CancellationException -> 0x0062, kq2 -> 0x0065, TRY_LEAVE, TryCatch #7 {kq2 -> 0x0065, CancellationException -> 0x0062, blocks: (B:71:0x010a, B:76:0x0122, B:78:0x0129, B:85:0x014c, B:86:0x014f, B:88:0x0151, B:89:0x0154, B:28:0x005d, B:35:0x0070, B:75:0x0120), top: B:108:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c A[Catch: CancellationException -> 0x0062, kq2 -> 0x0065, TRY_ENTER, TryCatch #7 {kq2 -> 0x0065, CancellationException -> 0x0062, blocks: (B:71:0x010a, B:76:0x0122, B:78:0x0129, B:85:0x014c, B:86:0x014f, B:88:0x0151, B:89:0x0154, B:28:0x005d, B:35:0x0070, B:75:0x0120), top: B:108:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155 A[Catch: CancellationException -> 0x003c, kq2 -> 0x003f, TRY_ENTER, TryCatch #6 {kq2 -> 0x003f, CancellationException -> 0x003c, blocks: (B:14:0x0037, B:49:0x009a, B:56:0x00b7, B:59:0x00bd, B:62:0x00d1, B:64:0x00d5, B:67:0x00e8, B:82:0x013c, B:90:0x0155, B:91:0x0158, B:93:0x015a, B:94:0x015d, B:38:0x007a, B:41:0x0081, B:52:0x00aa), top: B:108:0x0027, inners: #6 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r10v11, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v32, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v34, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v35, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v36, types: [ads_mobile_sdk.lu2] */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0149 -> B:49:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.lu2 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(ads_mobile_sdk.lu2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r7, dev.epro.r0.R4833348786910499294 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.zt2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.zt2 r0 = (ads_mobile_sdk.zt2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.zt2 r0 = new ads_mobile_sdk.zt2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            boolean r7 = r0.c
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r6
            r6 = r0
            goto L4a
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r8 = r6.e
            r0.b = r8
            r0.c = r7
            r0.f = r2
            java.lang.Object r0 = r8.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            if (r7 == 0) goto L52
            r6.i = r0     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            goto L89
        L52:
            r6.j = r0     // Catch: java.lang.Throwable -> L50
        L54:
            boolean r7 = r6.i     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L83
            boolean r7 = r6.j     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L83
            dev.epro.r0.R5692663580087387669 r7 = r6.g     // Catch: java.lang.Throwable -> L50
            boolean r7 = r7.p()     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L83
            long r0 = r6.b()     // Catch: java.lang.Throwable -> L50
            long r4 = r6.l     // Catch: java.lang.Throwable -> L50
            long r0 = dev.epro.r0.E17093345031926825464.g(r0, r4)     // Catch: java.lang.Throwable -> L50
            long r4 = r6.n     // Catch: java.lang.Throwable -> L50
            long r4 = dev.epro.r0.E17093345031926825464.h(r4, r0)     // Catch: java.lang.Throwable -> L50
            r6.n = r4     // Catch: java.lang.Throwable -> L50
            long r4 = r6.m     // Catch: java.lang.Throwable -> L50
            long r0 = dev.epro.r0.E17093345031926825464.h(r4, r0)     // Catch: java.lang.Throwable -> L50
            r6.m = r0     // Catch: java.lang.Throwable -> L50
            dev.epro.r0.R5692663580087387669 r6 = r6.g     // Catch: java.lang.Throwable -> L50
            r6.f0()     // Catch: java.lang.Throwable -> L50
        L83:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L50
            r8.b(r3)
            return r6
        L89:
            r8.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.b(boolean, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.qt2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qt2 r0 = (ads_mobile_sdk.qt2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.qt2 r0 = new ads_mobile_sdk.qt2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            boolean r9 = r0.c
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r8
            r8 = r0
            goto L4a
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r8
            dev.epro.r0.H15186625828076266306 r10 = r8.e
            r0.b = r10
            r0.c = r9
            r0.f = r2
            java.lang.Object r0 = r10.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r8.b()     // Catch: java.lang.Throwable -> L7a
            ads_mobile_sdk.jr0 r2 = r8.c     // Catch: java.lang.Throwable -> L7a
            r2.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "gads:proactive_banner_refresh:enabled"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7a
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$11     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L7a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto La6
            long r4 = r8.p     // Catch: java.lang.Throwable -> L7a
            r6 = 0
            int r2 = dev.epro.r0.E17093345031926825464.c(r4, r6)     // Catch: java.lang.Throwable -> L7a
            if (r2 <= 0) goto La6
            if (r9 == 0) goto L7c
            long r4 = r8.p     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.h(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r8.m = r0     // Catch: java.lang.Throwable -> L7a
            goto L97
        L7a:
            r8 = move-exception
            goto Lb6
        L7c:
            long r4 = r8.n     // Catch: java.lang.Throwable -> L7a
            long r4 = dev.epro.r0.E17093345031926825464.g(r0, r4)     // Catch: java.lang.Throwable -> L7a
            long r6 = r8.p     // Catch: java.lang.Throwable -> L7a
            int r9 = dev.epro.r0.E17093345031926825464.c(r4, r6)     // Catch: java.lang.Throwable -> L7a
            if (r9 < 0) goto L8b
            goto L95
        L8b:
            long r6 = r8.p     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.h(r0, r6)     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.g(r0, r4)     // Catch: java.lang.Throwable -> L7a
        L95:
            r8.m = r0     // Catch: java.lang.Throwable -> L7a
        L97:
            long r4 = r8.f74o     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.h(r0, r4)     // Catch: java.lang.Throwable -> L7a
            long r4 = r8.p     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.g(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r8.n = r0     // Catch: java.lang.Throwable -> L7a
            goto Lb0
        La6:
            long r4 = r8.f74o     // Catch: java.lang.Throwable -> L7a
            long r0 = dev.epro.r0.E17093345031926825464.h(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r8.n = r0     // Catch: java.lang.Throwable -> L7a
            r8.m = r0     // Catch: java.lang.Throwable -> L7a
        Lb0:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L7a
            r10.b(r3)
            return r8
        Lb6:
            r10.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.c(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:29:0x0072, B:31:0x0077), top: B:57:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.gu2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.gu2 r0 = (ads_mobile_sdk.gu2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.gu2 r0 = new ads_mobile_sdk.gu2
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.E17665849472693074628.k(r8)
            return r8
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r5
        L36:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.lu2 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L72
        L3e:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.lu2 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r1
            goto L5a
        L48:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r7
            dev.epro.r0.H15186625828076266306 r8 = r7.e
            r0.b = r8
            r0.e = r4
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r6) goto L5a
            goto L94
        L5a:
            boolean r1 = r7.k     // Catch: java.lang.Throwable -> La7
            r8.b(r5)
            if (r1 != 0) goto La2
            dev.epro.r0.H15186625828076266306 r8 = r7.e
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r6) goto L70
            goto L94
        L70:
            r1 = r7
            r7 = r8
        L72:
            boolean r8 = r1.i     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            if (r8 != 0) goto L7e
            boolean r8 = r1.j     // Catch: java.lang.Throwable -> L7c
            if (r8 != 0) goto L7e
            goto L7f
        L7c:
            r8 = move-exception
            goto L9e
        L7e:
            r4 = r3
        L7f:
            r7.b(r5)
            if (r4 == 0) goto L9c
            ads_mobile_sdk.dq2 r7 = r1.d
            if (r7 == 0) goto L96
            r0.a = r5
            r0.b = r5
            r0.e = r2
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r6) goto L95
        L94:
            return r6
        L95:
            return r7
        L96:
            java.lang.String r7 = "adLoader"
            dev.epro.r0.S10823041268949770285.b0(r7)
            throw r5
        L9c:
            r4 = r3
            goto La2
        L9e:
            r7.b(r5)
            throw r8
        La2:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        La7:
            r7 = move-exception
            r8.b(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final long b() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.b.getClass();
        return dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.R4833348786910499294 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.pt2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.pt2 r0 = (ads_mobile_sdk.pt2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.pt2 r0 = new ads_mobile_sdk.pt2
            dev.epro.r0.K14749510448791472029 r5 = (dev.epro.r0.K14749510448791472029) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L48
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            dev.epro.r0.H15186625828076266306 r5 = r4.e
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L48
            return r1
        L48:
            dev.epro.r0.X7175349259954592591 r0 = r4.f     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L52
            r0.c(r3)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r4 = move-exception
            goto L5a
        L52:
            r4.j = r2     // Catch: java.lang.Throwable -> L50
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L50
            r5.b(r3)
            return r4
        L5a:
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.c(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(long r16, ads_mobile_sdk.lu2 r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            r0 = r16
            r2 = r18
            r3 = r19
            boolean r4 = r3 instanceof ads_mobile_sdk.hu2
            if (r4 == 0) goto L19
            r4 = r3
            ads_mobile_sdk.hu2 r4 = (ads_mobile_sdk.hu2) r4
            int r5 = r4.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.f = r5
            goto L1e
        L19:
            ads_mobile_sdk.hu2 r4 = new ads_mobile_sdk.hu2
            r4.<init>(r2, r3)
        L1e:
            java.lang.Object r3 = r4.d
            int r5 = r4.f
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            r7 = 3
            r8 = 2
            r9 = 1
            r14 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r5 == 0) goto L54
            if (r5 == r9) goto L48
            if (r5 == r8) goto L3d
            if (r5 != r7) goto L36
            dev.epro.r0.E17665849472693074628.k(r3)
            return r6
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            r0 = 0
            return r0
        L3d:
            dev.epro.r0.H15186625828076266306 r0 = r4.b
            ads_mobile_sdk.lu2 r1 = r4.a
            dev.epro.r0.E17665849472693074628.k(r3)
            r15 = r1
            r1 = r10
        L46:
            r2 = r0
            goto La8
        L48:
            long r0 = r4.c
            dev.epro.r0.H15186625828076266306 r2 = r4.b
            ads_mobile_sdk.lu2 r5 = r4.a
            dev.epro.r0.E17665849472693074628.k(r3)
            r15 = r5
        L52:
            r12 = r0
            goto L75
        L54:
            dev.epro.r0.E17665849472693074628.k(r3)
            r11 = 0
            int r3 = dev.epro.r0.E17093345031926825464.c(r0, r11)
            if (r3 > 0) goto L60
            goto Lba
        L60:
            dev.epro.r0.H15186625828076266306 r3 = r2.e
            r4.a = r2
            r4.b = r3
            r4.c = r0
            r4.f = r9
            java.lang.Object r5 = r3.c(r4)
            if (r5 != r10) goto L72
            r1 = r10
            goto Lb9
        L72:
            r15 = r2
            r2 = r3
            goto L52
        L75:
            dev.epro.r0.R5692663580087387669 r0 = r15.h     // Catch: java.lang.Throwable -> Lc0
            r0.f0()     // Catch: java.lang.Throwable -> Lc0
            dev.epro.r0.R5692663580087387669 r0 = dev.epro.r0.J8045362843799184672.k()     // Catch: java.lang.Throwable -> Lc0
            r15.h = r0     // Catch: java.lang.Throwable -> Lc0
            dev.epro.r0.W5797197595347441198 r0 = r15.a     // Catch: java.lang.Throwable -> Lc0
            r1 = r10
            dev.epro.r0.F3485194578516100457 r10 = new dev.epro.r0.F3485194578516100457     // Catch: java.lang.Throwable -> Lc0
            r11 = 2
            r10.<init>(r11, r12, r14, r15)     // Catch: java.lang.Throwable -> Lc0
            dev.epro.r0.I3826119971291161142 r3 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> Lc0
            r0.getClass()     // Catch: java.lang.Throwable -> Lc0
            dev.epro.r0.P7598478828797568949 r5 = new dev.epro.r0.P7598478828797568949     // Catch: java.lang.Throwable -> Lc0
            r5.<init>(r10, r14, r9)     // Catch: java.lang.Throwable -> Lc0
            dev.epro.r0.R7033599853981556291.E(r0, r3, r14, r5, r8)     // Catch: java.lang.Throwable -> Lc0
            r2.b(r14)
            dev.epro.r0.H15186625828076266306 r0 = r15.e
            r4.a = r15
            r4.b = r0
            r4.f = r8
            java.lang.Object r2 = r0.c(r4)
            if (r2 != r1) goto L46
            goto Lb9
        La8:
            dev.epro.r0.R5692663580087387669 r0 = r15.h     // Catch: java.lang.Throwable -> Lbb
            r2.b(r14)
            r4.a = r14
            r4.b = r14
            r4.f = r7
            java.lang.Object r0 = r0.v(r4)
            if (r0 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            return r6
        Lbb:
            r0 = move-exception
            r2.b(r14)
            throw r0
        Lc0:
            r0 = move-exception
            r2.b(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(long, ads_mobile_sdk.lu2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.d33 r5, dev.epro.r0.R4833348786910499294 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.wt2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.wt2 r0 = (ads_mobile_sdk.wt2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            ads_mobile_sdk.wt2 r0 = new ads_mobile_sdk.wt2
            dev.epro.r0.K14749510448791472029 r6 = (dev.epro.r0.K14749510448791472029) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.H15186625828076266306 r4 = r0.c
            ads_mobile_sdk.d33 r5 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r6 = r4
            r4 = r0
            goto L4c
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r4
            r0.b = r5
            dev.epro.r0.H15186625828076266306 r6 = r4.e
            r0.c = r6
            r0.f = r2
            java.lang.Object r0 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4c
            return r1
        L4c:
            ads_mobile_sdk.z23 r5 = r5.b     // Catch: java.lang.Throwable -> L5e
            ads_mobile_sdk.hv r5 = r5.b     // Catch: java.lang.Throwable -> L5e
            long r0 = r5.f51o     // Catch: java.lang.Throwable -> L5e
            r4.p = r0     // Catch: java.lang.Throwable -> L5e
            long r0 = r5.n     // Catch: java.lang.Throwable -> L5e
            r4.f74o = r0     // Catch: java.lang.Throwable -> L5e
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L5e
            r6.b(r3)
            return r4
        L5e:
            r4 = move-exception
            r6.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(ads_mobile_sdk.d33, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.xt2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.xt2 r0 = (ads_mobile_sdk.xt2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.xt2 r0 = new ads_mobile_sdk.xt2
            dev.epro.r0.K14749510448791472029 r5 = (dev.epro.r0.K14749510448791472029) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L48
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            dev.epro.r0.H15186625828076266306 r5 = r4.e
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r4
            r4 = r5
        L48:
            r5 = 0
            r0.i = r5     // Catch: java.lang.Throwable -> L67
            r0.j = r5     // Catch: java.lang.Throwable -> L67
            r0.k = r2     // Catch: java.lang.Throwable -> L67
            long r1 = r0.b()     // Catch: java.lang.Throwable -> L67
            r0.m = r1     // Catch: java.lang.Throwable -> L67
            r0.n = r1     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.R5692663580087387669 r5 = r0.g     // Catch: java.lang.Throwable -> L67
            r5.f0()     // Catch: java.lang.Throwable -> L67
            dev.epro.r0.R5692663580087387669 r5 = r0.h     // Catch: java.lang.Throwable -> L67
            r5.f0()     // Catch: java.lang.Throwable -> L67
            r4.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L67:
            r5 = move-exception
            r4.b(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r5, dev.epro.r0.R4833348786910499294 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.yt2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.yt2 r0 = (ads_mobile_sdk.yt2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.yt2 r0 = new ads_mobile_sdk.yt2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            boolean r5 = r0.c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.lu2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r6 = r4
            r4 = r0
            goto L4a
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r4
            dev.epro.r0.H15186625828076266306 r6 = r4.e
            r0.b = r6
            r0.c = r5
            r0.f = r2
            java.lang.Object r0 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            boolean r0 = r4.i     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L61
            boolean r0 = r4.j     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L61
            dev.epro.r0.R5692663580087387669 r0 = dev.epro.r0.J8045362843799184672.k()     // Catch: java.lang.Throwable -> L5f
            r4.g = r0     // Catch: java.lang.Throwable -> L5f
            long r0 = r4.b()     // Catch: java.lang.Throwable -> L5f
            r4.l = r0     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r4 = move-exception
            goto L6e
        L61:
            if (r5 == 0) goto L66
            r4.i = r2     // Catch: java.lang.Throwable -> L5f
            goto L68
        L66:
            r4.j = r2     // Catch: java.lang.Throwable -> L5f
        L68:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L5f
            r6.b(r3)
            return r4
        L6e:
            r6.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(boolean, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r10.invoke(r0) == r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r9 r10
      0x003f: PHI (r9v6 dev.epro.r0.H2730750034712003316) = (r9v1 dev.epro.r0.H2730750034712003316), (r9v14 dev.epro.r0.H2730750034712003316) binds: [B:31:0x008f, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r10v5 ads_mobile_sdk.lu2) = (r10v1 ads_mobile_sdk.lu2), (r10v11 ads_mobile_sdk.lu2) binds: [B:31:0x008f, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[PHI: r9 r10
      0x0083: PHI (r9v1 dev.epro.r0.H2730750034712003316) = (r9v2 dev.epro.r0.H2730750034712003316), (r9v13 dev.epro.r0.H2730750034712003316) binds: [B:28:0x0080, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r10v1 ads_mobile_sdk.lu2) = (r10v2 ads_mobile_sdk.lu2), (r10v10 ads_mobile_sdk.lu2) binds: [B:28:0x0080, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008f -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.H2730750034712003316 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.au2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.au2 r0 = (ads_mobile_sdk.au2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.au2 r0 = new ads_mobile_sdk.au2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L58
            if (r1 == r5) goto L4b
            if (r1 == r4) goto L43
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            dev.epro.r0.E17665849472693074628.k(r11)
            goto Lad
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r6
        L38:
            dev.epro.r0.F4096073349764486348 r9 = r0.b
            ads_mobile_sdk.lu2 r10 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
        L3f:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L92
        L43:
            dev.epro.r0.F4096073349764486348 r9 = r0.b
            ads_mobile_sdk.lu2 r10 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L83
        L4b:
            dev.epro.r0.H15186625828076266306 r9 = r0.c
            dev.epro.r0.F4096073349764486348 r10 = r0.b
            ads_mobile_sdk.lu2 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
            r11 = r9
            r9 = r10
            r10 = r1
            goto L6f
        L58:
            dev.epro.r0.E17665849472693074628.k(r11)
        L5b:
            dev.epro.r0.H15186625828076266306 r11 = r9.e
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r5
            java.lang.Object r1 = r11.c(r0)
            if (r1 != r7) goto L6c
            goto Lac
        L6c:
            r8 = r10
            r10 = r9
            r9 = r8
        L6f:
            dev.epro.r0.R5692663580087387669 r1 = r10.g     // Catch: java.lang.Throwable -> Lbc
            r11.b(r6)
            r0.a = r10
            r0.b = r9
            r0.c = r6
            r0.f = r4
            java.lang.Object r11 = r1.v(r0)
            if (r11 != r7) goto L83
            goto Lac
        L83:
            dev.epro.r0.H15186625828076266306 r11 = r10.e
            r0.a = r10
            r0.b = r9
            r0.f = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r7) goto L3f
            goto Lac
        L92:
            boolean r11 = r9.i     // Catch: java.lang.Throwable -> Lb0
            dev.epro.r0.H15186625828076266306 r1 = r9.e
            if (r11 != 0) goto Lb2
            boolean r11 = r9.j     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L9d
            goto Lb2
        L9d:
            r1.b(r6)
            r0.a = r6
            r0.b = r6
            r0.f = r2
            java.lang.Object r9 = r10.invoke(r0)
            if (r9 != r7) goto Lad
        Lac:
            return r7
        Lad:
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a
            return r9
        Lb0:
            r10 = move-exception
            goto Lb6
        Lb2:
            r1.b(r6)
            goto L5b
        Lb6:
            dev.epro.r0.H15186625828076266306 r9 = r9.e
            r9.b(r6)
            throw r10
        Lbc:
            r9 = move-exception
            r11.b(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(dev.epro.r0.H2730750034712003316, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r11.c(r0) == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.dq2 r12, dev.epro.r0.E14944621269592904532 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(ads_mobile_sdk.dq2, dev.epro.r0.E14944621269592904532, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[PHI: r13 r14 r15
      0x004f: PHI (r13v4 dev.epro.r0.F4096073349764486348) = (r13v7 dev.epro.r0.F4096073349764486348), (r13v13 dev.epro.r0.F4096073349764486348) binds: [B:27:0x007f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r14v3 ads_mobile_sdk.lu2) = (r14v6 ads_mobile_sdk.lu2), (r14v11 ads_mobile_sdk.lu2) binds: [B:27:0x007f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r15v6 java.lang.Object) = (r15v10 java.lang.Object), (r15v1 java.lang.Object) binds: [B:27:0x007f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[PHI: r13 r14
      0x005e: PHI (r13v8 'this' ads_mobile_sdk.lu2) = 
      (r13v0 'this' ads_mobile_sdk.lu2 A[IMMUTABLE_TYPE, THIS])
      (r13v5 'this' ads_mobile_sdk.lu2)
      (r13v10 'this' ads_mobile_sdk.lu2)
     binds: [B:21:0x005b, B:30:0x008e, B:51:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r14v7 dev.epro.r0.F4096073349764486348) = 
      (r14v0 dev.epro.r0.F4096073349764486348)
      (r14v4 dev.epro.r0.F4096073349764486348)
      (r14v9 dev.epro.r0.F4096073349764486348)
     binds: [B:21:0x005b, B:30:0x008e, B:51:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:22:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bc -> B:54:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.F4096073349764486348 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lu2.a(dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
