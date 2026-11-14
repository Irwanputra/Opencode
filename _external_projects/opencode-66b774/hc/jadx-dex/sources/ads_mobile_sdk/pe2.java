package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pe2 {
    public final ads_mobile_sdk.j1 a;
    public final ads_mobile_sdk.c6 b;
    public final dev.epro.r0.B7506245556754967052 c;
    public final dev.epro.r0.O16637889491137121389 d;
    public final android.content.Context e;
    public final dev.epro.r0.P10813970601447104553 f;
    public final ads_mobile_sdk.kz2 g;
    public final dev.epro.r0.V2597580950516131749 h;
    public final dev.epro.r0.V2597580950516131749 i;
    public final dev.epro.r0.H15186625828076266306 j;
    public volatile boolean k;
    public final java.util.concurrent.ConcurrentHashMap l;

    public pe2(ads_mobile_sdk.j1 j1Var, ads_mobile_sdk.c6 c6Var, dev.epro.r0.B7506245556754967052 b7506245556754967052, dev.epro.r0.O16637889491137121389 o16637889491137121389, android.content.Context context, dev.epro.r0.P10813970601447104553 p10813970601447104553, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        j1Var.getClass();
        c6Var.getClass();
        b7506245556754967052.getClass();
        o16637889491137121389.getClass();
        context.getClass();
        p10813970601447104553.getClass();
        kz2Var.getClass();
        rg0Var.getClass();
        v2597580950516131749.getClass();
        this.a = j1Var;
        this.b = c6Var;
        this.c = b7506245556754967052;
        this.d = o16637889491137121389;
        this.e = context;
        this.f = p10813970601447104553;
        this.g = kz2Var;
        this.h = rg0Var;
        this.i = v2597580950516131749;
        this.j = new dev.epro.r0.H15186625828076266306();
        this.l = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0270 A[Catch: all -> 0x024a, TRY_LEAVE, TryCatch #7 {all -> 0x024a, blocks: (B:86:0x0237, B:88:0x023e, B:90:0x0242, B:92:0x0246, B:95:0x024d, B:97:0x0251, B:99:0x0255, B:101:0x0259, B:102:0x025a, B:103:0x025f, B:104:0x0260, B:105:0x0267, B:106:0x0268, B:107:0x026f, B:108:0x0270), top: B:181:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0317 A[Catch: all -> 0x004f, LOOP:0: B:129:0x0311->B:131:0x0317, LOOP_END, TRY_LEAVE, TryCatch #9 {all -> 0x004f, blocks: (B:15:0x004a, B:128:0x0307, B:129:0x0311, B:131:0x0317), top: B:183:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0331 A[Catch: all -> 0x033d, TryCatch #8 {all -> 0x033d, blocks: (B:138:0x032a, B:140:0x0331, B:142:0x0335, B:144:0x0339, B:147:0x0340, B:149:0x0344, B:151:0x0348, B:153:0x034c, B:154:0x034d, B:155:0x0352, B:156:0x0353, B:157:0x035a, B:158:0x035b, B:159:0x0362, B:160:0x0363), top: B:182:0x032a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0363 A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #8 {all -> 0x033d, blocks: (B:138:0x032a, B:140:0x0331, B:142:0x0335, B:144:0x0339, B:147:0x0340, B:149:0x0344, B:151:0x0348, B:153:0x034c, B:154:0x034d, B:155:0x0352, B:156:0x0353, B:157:0x035a, B:158:0x035b, B:159:0x0362, B:160:0x0363), top: B:182:0x032a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224 A[Catch: all -> 0x0081, LOOP:1: B:77:0x021e->B:79:0x0224, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0081, blocks: (B:27:0x007c, B:76:0x0214, B:77:0x021e, B:79:0x0224), top: B:167:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e A[Catch: all -> 0x024a, TryCatch #7 {all -> 0x024a, blocks: (B:86:0x0237, B:88:0x023e, B:90:0x0242, B:92:0x0246, B:95:0x024d, B:97:0x0251, B:99:0x0255, B:101:0x0259, B:102:0x025a, B:103:0x025f, B:104:0x0260, B:105:0x0267, B:106:0x0268, B:107:0x026f, B:108:0x0270), top: B:181:0x0237 }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r7v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v6, types: [ads_mobile_sdk.em2, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r17, ads_mobile_sdk.qc2 r18, boolean r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.qc2, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:157|(1:(4:(1:(1:(2:14|15)(4:16|153|17|113))(8:21|159|22|23|24|151|83|(8:85|(2:87|(1:89))|90|(1:92)(1:93)|94|95|96|97)(6:99|100|(1:45)(1:46)|47|(4:50|158|51|(4:(1:(1:55)(1:56))|57|96|97)(15:58|(1:60)(1:61)|62|161|63|64|166|65|(1:67)(1:70)|(1:72)(1:73)|74|75|(1:77)(1:78)|79|(5:82|24|151|83|(0)(0))))|111)))(7:27|164|28|29|158|51|(0)(0))|163|120|(4:122|(1:126)|129|(2:131|(2:133|(1:135)(2:136|137))(2:138|139))(2:140|141))(1:142))(3:32|33|34))(3:37|38|(2:40|111))|41|155|42|43|(0)(0)|47|(0)|111|(2:(0)|(1:150))) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0279, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027a, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[Catch: all -> 0x023b, TryCatch #5 {all -> 0x023b, blocks: (B:51:0x0115, B:55:0x0126, B:57:0x012a, B:58:0x0138, B:62:0x015a, B:75:0x0190, B:79:0x019b, B:105:0x0240, B:109:0x024b), top: B:158:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd A[Catch: all -> 0x0277, TryCatch #1 {all -> 0x0277, blocks: (B:83:0x01d9, B:85:0x01dd, B:87:0x01e5, B:89:0x01fc, B:90:0x020e, B:94:0x0221, B:99:0x0235, B:47:0x00ea), top: B:151:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235 A[Catch: all -> 0x0277, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0277, blocks: (B:83:0x01d9, B:85:0x01dd, B:87:0x01e5, B:89:0x01fc, B:90:0x020e, B:94:0x0221, B:99:0x0235, B:47:0x00ea), top: B:151:0x01d9 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.th3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01cd -> B:24:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.qw2 r25, java.lang.String r26, dev.epro.r0.K14749510448791472029 r27) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.qw2, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean b(dev.epro.r0.S4967920478913205567 s4967920478913205567, ads_mobile_sdk.qw2 qw2Var) {
        int iOrdinal;
        qw2Var.getClass();
        dev.epro.r0.B7506245556754967052 b7506245556754967052 = this.c;
        b7506245556754967052.getClass();
        if (!((java.lang.Boolean) b7506245556754967052.a("gads:pc:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() || (iOrdinal = qw2Var.ordinal()) == 1 || iOrdinal == 3 || iOrdinal != 5) {
            return false;
        }
        dev.epro.r0.T18375584833185129273 t18375584833185129273 = s4967920478913205567 instanceof dev.epro.r0.T18375584833185129273 ? (dev.epro.r0.T18375584833185129273) s4967920478913205567 : null;
        return t18375584833185129273 != null && t18375584833185129273.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:44:0x00b4, B:21:0x0042, B:36:0x007a, B:38:0x0097, B:40:0x009f, B:39:0x009c), top: B:52:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:44:0x00b4, B:21:0x0042, B:36:0x007a, B:38:0x0097, B:40:0x009f, B:39:0x009c), top: B:52:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r13) throws java.lang.Throwable {
        /*
            r12 = this;
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r13 instanceof ads_mobile_sdk.be2
            if (r1 == 0) goto L15
            r1 = r13
            ads_mobile_sdk.be2 r1 = (ads_mobile_sdk.be2) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.be2 r1 = new ads_mobile_sdk.be2
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.c
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.e
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L50
            if (r3 == r6) goto L46
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L38
            dev.epro.r0.R8015591507171738907 r12 = r1.b
            ads_mobile_sdk.pe2 r1 = r1.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L35
            goto Lb4
        L35:
            r13 = move-exception
            goto Lc1
        L38:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r12)
            return r7
        L3e:
            dev.epro.r0.R8015591507171738907 r12 = r1.b
            ads_mobile_sdk.pe2 r3 = r1.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L35
            goto L7a
        L46:
            dev.epro.r0.R8015591507171738907 r12 = r1.b
            ads_mobile_sdk.pe2 r3 = r1.a
            dev.epro.r0.E17665849472693074628.k(r13)
            r13 = r12
            r12 = r3
            goto L67
        L50:
            dev.epro.r0.E17665849472693074628.k(r13)
            boolean r13 = r12.k
            if (r13 == 0) goto L58
            return r0
        L58:
            dev.epro.r0.H15186625828076266306 r13 = r12.j
            r1.a = r12
            r1.b = r13
            r1.e = r6
            java.lang.Object r3 = r13.c(r1)
            if (r3 != r2) goto L67
            goto Lb2
        L67:
            boolean r3 = r12.k     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto Lbd
            r1.a = r12     // Catch: java.lang.Throwable -> Lb8
            r1.b = r13     // Catch: java.lang.Throwable -> Lb8
            r1.e = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r3 = b(r12, r1)     // Catch: java.lang.Throwable -> Lb8
            if (r3 != r2) goto L78
            goto Lb2
        L78:
            r3 = r12
            r12 = r13
        L7a:
            r1.a = r3     // Catch: java.lang.Throwable -> L35
            r1.b = r12     // Catch: java.lang.Throwable -> L35
            r1.e = r4     // Catch: java.lang.Throwable -> L35
            android.content.Context r13 = r3.e     // Catch: java.lang.Throwable -> L35
            java.lang.String r13 = r13.getPackageName()     // Catch: java.lang.Throwable -> L35
            android.content.Context r4 = r3.e     // Catch: java.lang.Throwable -> L35
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L35
            r5 = 0
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r13, r5)     // Catch: java.lang.Throwable -> L35
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35
            r8 = 28
            if (r5 < r8) goto L9c
            long r8 = dev.epro.r0.U14881866531452519068.c(r4)     // Catch: java.lang.Throwable -> L35
            goto L9f
        L9c:
            int r4 = r4.versionCode     // Catch: java.lang.Throwable -> L35
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L35
        L9f:
            ads_mobile_sdk.wk0 r4 = new ads_mobile_sdk.wk0     // Catch: java.lang.Throwable -> L35
            r13.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L35
            r10.getClass()     // Catch: java.lang.Throwable -> L35
            r4.<init>(r13, r5, r8)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r13 = r3.a(r4, r1)     // Catch: java.lang.Throwable -> L35
            if (r13 != r2) goto Lb3
        Lb2:
            return r2
        Lb3:
            r1 = r3
        Lb4:
            r1.k = r6     // Catch: java.lang.Throwable -> L35
            r13 = r12
            goto Lbd
        Lb8:
            r12 = move-exception
            r11 = r13
            r13 = r12
            r12 = r11
            goto Lc1
        Lbd:
            r13.b(r7)
            return r0
        Lc1:
            r12.b(r7)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e0 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:112:0x01bf, B:128:0x01dc, B:130:0x01e0, B:127:0x01d5), top: B:161:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f2 A[Catch: all -> 0x01fe, TryCatch #19 {all -> 0x01fe, blocks: (B:134:0x01eb, B:136:0x01f2, B:138:0x01f6, B:140:0x01fa, B:143:0x0201, B:145:0x0205, B:147:0x0209, B:149:0x020d, B:150:0x020e, B:151:0x0213, B:152:0x0214, B:153:0x021b, B:154:0x021c, B:155:0x0223, B:156:0x0224), top: B:173:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #19 {all -> 0x01fe, blocks: (B:134:0x01eb, B:136:0x01f2, B:138:0x01f6, B:140:0x01fa, B:143:0x0201, B:145:0x0205, B:147:0x0209, B:149:0x020d, B:150:0x020e, B:151:0x0213, B:152:0x0214, B:153:0x021b, B:154:0x021c, B:155:0x0223, B:156:0x0224), top: B:173:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #17 {all -> 0x007a, blocks: (B:31:0x0075, B:55:0x010b, B:71:0x0128, B:73:0x012c, B:70:0x0121), top: B:168:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f A[Catch: all -> 0x014b, TryCatch #6 {all -> 0x014b, blocks: (B:76:0x0138, B:78:0x013f, B:80:0x0143, B:82:0x0147, B:85:0x014e, B:87:0x0152, B:89:0x0156, B:91:0x015a, B:92:0x015b, B:93:0x0160, B:94:0x0161, B:95:0x0168, B:96:0x0169, B:97:0x0170, B:98:0x0171), top: B:165:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #6 {all -> 0x014b, blocks: (B:76:0x0138, B:78:0x013f, B:80:0x0143, B:82:0x0147, B:85:0x014e, B:87:0x0152, B:89:0x0156, B:91:0x015a, B:92:0x015b, B:93:0x0160, B:94:0x0161, B:95:0x0168, B:96:0x0169, B:97:0x0170, B:98:0x0171), top: B:165:0x0138 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [ads_mobile_sdk.ue2] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ads_mobile_sdk.ue2] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.ie2, dev.epro.r0.K14749510448791472029, dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ads_mobile_sdk.j1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ads_mobile_sdk.j1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.pe2 r16, ads_mobile_sdk.ue2 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.pe2, ads_mobile_sdk.ue2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.pe2 r20, dev.epro.r0.K14749510448791472029 r21) throws android.content.pm.PackageManager.NameNotFoundException, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.b(ads_mobile_sdk.pe2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if (r0 == r14) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c3 -> B:27:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(ads_mobile_sdk.qw2 r16, java.lang.String r17, boolean r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.qw2, java.lang.String, boolean, dev.epro.r0.K14749510448791472029):java.io.Serializable");
    }

    public final int a(dev.epro.r0.S4967920478913205567 s4967920478913205567, ads_mobile_sdk.qw2 qw2Var) {
        s4967920478913205567.getClass();
        qw2Var.getClass();
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        java.lang.String str = s4967920478913205567.i;
        java.lang.String strH = dev.epro.r0.P5733283974459951585.h(str);
        if (strH != null) {
            str = strH;
        }
        if (dev.epro.r0.S10823041268949770285.t(this.l.get(str), java.lang.Boolean.FALSE)) {
            return 4;
        }
        if (!((ads_mobile_sdk.iz) ((ads_mobile_sdk.dr0) this.f).k.get()).p().p().contains(ads_mobile_sdk.yw.API_PERSISTENT_CACHE)) {
            return 3;
        }
        if (a(qw2Var) > 0) {
            dev.epro.r0.B7506245556754967052 b7506245556754967052 = this.c;
            b7506245556754967052.getClass();
            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$18;
            if (((java.lang.Number) b7506245556754967052.a("gads:pc:max_total_cached_ads", (java.lang.Object) 10, (dev.epro.r0.F4096073349764486348) aoVar)).intValue() > 0 && ((java.lang.Number) b7506245556754967052.a("gads:pc:cache_fill_count_per_request", (java.lang.Object) 2, (dev.epro.r0.F4096073349764486348) aoVar)).intValue() > 0) {
                return 0;
            }
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r9 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r9) throws java.security.NoSuchAlgorithmException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.zd2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.zd2 r0 = (ads_mobile_sdk.zd2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.zd2 r0 = new ads_mobile_sdk.zd2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            ads_mobile_sdk.pe2 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L67
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L33:
            ads_mobile_sdk.pe2 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L51
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.V2597580950516131749 r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.fz r9 = (ads_mobile_sdk.fz) r9
            dev.epro.r0.R5692663580087387669 r9 = r9.B
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r9.v(r0)
            if (r9 != r4) goto L51
            goto L66
        L51:
            dev.epro.r0.V2597580950516131749 r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.fz r9 = (ads_mobile_sdk.fz) r9
            r0.a = r8
            r0.d = r2
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.fz.d(r9, r0)
            if (r9 != r4) goto L67
        L66:
            return r4
        L67:
            dev.epro.r0.I16631908410500040363 r9 = (dev.epro.r0.I16631908410500040363) r9
            r8.getClass()
            r9.getClass()
            dev.epro.r0.H14305894327539119220 r8 = r9.a
            java.util.Set r8 = r8.entrySet()
            dev.epro.r0.J10770752472956524045 r9 = new dev.epro.r0.J10770752472956524045
            r0 = 20
            r9.<init>(r0)
            java.util.List r1 = dev.epro.r0.R9411874267597469228.W0(r8, r9)
            ads_mobile_sdk.ao r6 = ads_mobile_sdk.ao.a$12
            r5 = 0
            r7 = 30
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            java.lang.String r8 = dev.epro.r0.R9411874267597469228.J0(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "SHA-256"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)
            java.nio.charset.Charset r0 = dev.epro.r0.F16059529287866721367.a
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            byte[] r8 = r9.digest(r8)
            r8.getClass()
            ads_mobile_sdk.ao r9 = ads_mobile_sdk.ao.a$10
            java.lang.String r0 = ""
            r1 = 30
            java.lang.String r8 = dev.epro.r0.O5378677881740157249.L0(r8, r0, r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final int a(ads_mobile_sdk.qw2 qw2Var) {
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$18;
        qw2Var.getClass();
        int iOrdinal = qw2Var.ordinal();
        dev.epro.r0.B7506245556754967052 b7506245556754967052 = this.c;
        switch (iOrdinal) {
            case 1:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_app_open_ads", (java.lang.Object) 2, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 2:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_banner_ads", (java.lang.Object) 0, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 3:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_icon_ads", (java.lang.Object) 2, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 4:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_interstitial_ads", (java.lang.Object) 0, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 5:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_native_ads", (java.lang.Object) 2, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 6:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_rewarded_ads", (java.lang.Object) 0, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 7:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_rewarded_interstitial_ads", (java.lang.Object) 0, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            case 8:
                b7506245556754967052.getClass();
                return ((java.lang.Number) b7506245556754967052.a("gads:pc:max_swipeable_interstitial_ads", (java.lang.Object) 0, (dev.epro.r0.F4096073349764486348) aoVar)).intValue();
            default:
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.qw2 r5, java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.qw2, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0178 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #3 {all -> 0x0152, blocks: (B:96:0x013f, B:98:0x0146, B:100:0x014a, B:102:0x014e, B:105:0x0155, B:107:0x0159, B:109:0x015d, B:111:0x0161, B:112:0x0162, B:113:0x0167, B:114:0x0168, B:115:0x016f, B:116:0x0170, B:117:0x0177, B:118:0x0178), top: B:126:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #8 {all -> 0x004c, blocks: (B:22:0x0048, B:35:0x0096, B:44:0x00ad, B:46:0x00b2, B:43:0x00a5), top: B:124:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: all -> 0x00d1, TryCatch #1 {all -> 0x00d1, blocks: (B:49:0x00be, B:51:0x00c5, B:53:0x00c9, B:55:0x00cd, B:58:0x00d4, B:60:0x00d8, B:62:0x00dc, B:64:0x00e0, B:65:0x00e1, B:66:0x00e6, B:67:0x00e7, B:68:0x00ee, B:69:0x00ef, B:70:0x00f6, B:71:0x00f7), top: B:123:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:49:0x00be, B:51:0x00c5, B:53:0x00c9, B:55:0x00cd, B:58:0x00d4, B:60:0x00d8, B:62:0x00dc, B:64:0x00e0, B:65:0x00e1, B:66:0x00e6, B:67:0x00e7, B:68:0x00ee, B:69:0x00ef, B:70:0x00f6, B:71:0x00f7), top: B:123:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #5 {all -> 0x0038, blocks: (B:13:0x0033, B:81:0x0118, B:90:0x012f, B:92:0x0134, B:89:0x0127), top: B:127:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146 A[Catch: all -> 0x0152, TryCatch #3 {all -> 0x0152, blocks: (B:96:0x013f, B:98:0x0146, B:100:0x014a, B:102:0x014e, B:105:0x0155, B:107:0x0159, B:109:0x015d, B:111:0x0161, B:112:0x0162, B:113:0x0167, B:114:0x0168, B:115:0x016f, B:116:0x0170, B:117:0x0177, B:118:0x0178), top: B:126:0x013f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r16, ads_mobile_sdk.ue2 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.ue2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final dev.epro.r0.H9390398899829886498 a(ads_mobile_sdk.g6 g6Var, long j) {
        dev.epro.r0.B7506245556754967052 b7506245556754967052 = this.c;
        b7506245556754967052.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        long j2 = ((dev.epro.r0.E17093345031926825464) b7506245556754967052.a("gads:pc:ad_ttl_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(24, dev.epro.r0.N13798149404328803870.g)), ads_mobile_sdk.ao.a)).a;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
        long jA0 = dev.epro.r0.M9216324016624295870.a0(j, n13798149404328803870);
        dev.epro.r0.O6641393078261985068 o6641393078261985068R = g6Var.r();
        o6641393078261985068R.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : o6641393078261985068R) {
            dev.epro.r0.E17149812035295265804 e171498120352952658042 = dev.epro.r0.E17093345031926825464.b;
            if (dev.epro.r0.E17093345031926825464.c(dev.epro.r0.E17093345031926825464.g(jA0, dev.epro.r0.M9216324016624295870.a0(((ads_mobile_sdk.b6) obj).p(), n13798149404328803870)), j2) <= 0) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new dev.epro.r0.H9390398899829886498(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:
    
        if (r1 == r9) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:48:0x013d, B:43:0x0106, B:45:0x010c, B:49:0x0140, B:50:0x014a, B:52:0x014e, B:21:0x0061, B:42:0x00fe), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:48:0x013d, B:43:0x0106, B:45:0x010c, B:49:0x0140, B:50:0x014a, B:52:0x014e, B:21:0x0061, B:42:0x00fe), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:14:0x0041, B:48:0x013d, B:43:0x0106, B:45:0x010c, B:49:0x0140, B:50:0x014a, B:52:0x014e, B:21:0x0061, B:42:0x00fe), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x013a -> B:48:0x013d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r21, ads_mobile_sdk.qw2 r22, java.lang.String r23, java.lang.String r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, ads_mobile_sdk.qw2, java.lang.String, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.util.LinkedHashMap a(java.util.Map map, long j, java.util.ArrayList arrayList) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ads_mobile_sdk.g6 g6Var = (ads_mobile_sdk.g6) entry.getValue();
            dev.epro.r0.H9390398899829886498 h9390398899829886498A = a(g6Var, j);
            java.util.List list = (java.util.List) h9390398899829886498A.a;
            for (ads_mobile_sdk.b6 b6Var : (java.util.List) h9390398899829886498A.b) {
                java.util.WeakHashMap weakHashMap = ads_mobile_sdk.ji3.a;
                ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_EXPIRE, dev.epro.r0.O2161699089510411363.a, true);
                try {
                    java.lang.String strQ = b6Var.q();
                    strQ.getClass();
                    arrayList.add(strQ);
                    th3VarA.close();
                } catch (java.lang.Throwable th) {
                    try {
                        th3VarA.b(th);
                        if (!(th instanceof dev.epro.r0.N340633841638932414)) {
                            if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                                th3VarA.a(th);
                            }
                            if (!(th instanceof dev.epro.r0.P2480554073835519965)) {
                                if (!(th instanceof java.util.concurrent.CancellationException)) {
                                    if (th instanceof ads_mobile_sdk.dv0) {
                                        throw th;
                                    }
                                    throw new ads_mobile_sdk.iu0(th);
                                }
                                throw new ads_mobile_sdk.du0(th);
                            }
                            throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                        }
                        throw th;
                    } finally {
                    }
                }
            }
            if (!list.isEmpty()) {
                dev.epro.r0.Y12531765857967015337 y12531765857967015337N = g6Var.n();
                y12531765857967015337N.f().getClass();
                y12531765857967015337N.e();
                y12531765857967015337N.f().getClass();
                y12531765857967015337N.d(list);
                linkedHashMap.put(str, (ads_mobile_sdk.g6) y12531765857967015337N.a());
            }
        }
        return linkedHashMap;
    }

    public static ads_mobile_sdk.g1 a(ads_mobile_sdk.g1 g1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ads_mobile_sdk.g6 g6Var;
        ads_mobile_sdk.vr0 vr0Var = (ads_mobile_sdk.vr0) g1Var.u().get(str);
        if (vr0Var == null || (g6Var = (ads_mobile_sdk.g6) vr0Var.o().get(str2)) == null) {
            return g1Var;
        }
        dev.epro.r0.O6641393078261985068 o6641393078261985068R = g6Var.r();
        o6641393078261985068R.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : o6641393078261985068R) {
            if (!dev.epro.r0.S10823041268949770285.t(((ads_mobile_sdk.b6) obj).q(), str3)) {
                arrayList.add(obj);
            }
        }
        dev.epro.r0.S2322588539201815831 s2322588539201815831N = g1Var.n();
        if (arrayList.isEmpty()) {
            dev.epro.r0.C7584963549263810245 c7584963549263810245 = (dev.epro.r0.C7584963549263810245) vr0Var.n();
            c7584963549263810245.e().getClass();
            str2.getClass();
            c7584963549263810245.c(str2);
            ads_mobile_sdk.vr0 vr0Var2 = (ads_mobile_sdk.vr0) c7584963549263810245.a();
            if (vr0Var2.o().isEmpty()) {
                s2322588539201815831N.e().getClass();
                str.getClass();
                s2322588539201815831N.c(str);
            } else {
                s2322588539201815831N.e().getClass();
                str.getClass();
                s2322588539201815831N.d(str, vr0Var2);
            }
        } else {
            s2322588539201815831N.e().getClass();
            dev.epro.r0.C7584963549263810245 c75849635492638102452 = (dev.epro.r0.C7584963549263810245) vr0Var.n();
            c75849635492638102452.e().getClass();
            dev.epro.r0.Y12531765857967015337 y12531765857967015337N = g6Var.n();
            y12531765857967015337N.f().getClass();
            y12531765857967015337N.e();
            y12531765857967015337N.f().getClass();
            y12531765857967015337N.d(arrayList);
            ads_mobile_sdk.g6 g6Var2 = (ads_mobile_sdk.g6) y12531765857967015337N.a();
            str2.getClass();
            c75849635492638102452.d(str2, g6Var2);
            ads_mobile_sdk.vr0 vr0Var3 = (ads_mobile_sdk.vr0) c75849635492638102452.a();
            str.getClass();
            s2322588539201815831N.d(str, vr0Var3);
        }
        return (ads_mobile_sdk.g1) s2322588539201815831N.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x016e A[Catch: all -> 0x0148, TRY_LEAVE, TryCatch #7 {all -> 0x0148, blocks: (B:96:0x0135, B:98:0x013c, B:100:0x0140, B:102:0x0144, B:105:0x014b, B:107:0x014f, B:109:0x0153, B:111:0x0157, B:112:0x0158, B:113:0x015d, B:114:0x015e, B:115:0x0165, B:116:0x0166, B:117:0x016d, B:118:0x016e), top: B:131:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #11 {all -> 0x004d, blocks: (B:22:0x0049, B:35:0x0092, B:44:0x00a8, B:46:0x00ad, B:43:0x00a1), top: B:123:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0 A[Catch: all -> 0x00cc, TryCatch #10 {all -> 0x00cc, blocks: (B:49:0x00b9, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:58:0x00cf, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:65:0x00dc, B:66:0x00e1, B:67:0x00e2, B:68:0x00e9, B:69:0x00ea, B:70:0x00f1, B:71:0x00f2), top: B:133:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #10 {all -> 0x00cc, blocks: (B:49:0x00b9, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:58:0x00cf, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:65:0x00dc, B:66:0x00e1, B:67:0x00e2, B:68:0x00e9, B:69:0x00ea, B:70:0x00f1, B:71:0x00f2), top: B:133:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #9 {all -> 0x0039, blocks: (B:13:0x0034, B:81:0x010f, B:90:0x0125, B:92:0x012a, B:89:0x011e), top: B:129:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c A[Catch: all -> 0x0148, TryCatch #7 {all -> 0x0148, blocks: (B:96:0x0135, B:98:0x013c, B:100:0x0140, B:102:0x0144, B:105:0x014b, B:107:0x014f, B:109:0x0153, B:111:0x0157, B:112:0x0158, B:113:0x015d, B:114:0x015e, B:115:0x0165, B:116:0x0166, B:117:0x016d, B:118:0x016e), top: B:131:0x0135 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pe2 r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.pe2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.a(r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.wk0 r7, dev.epro.r0.K14749510448791472029 r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.me2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.me2 r0 = (ads_mobile_sdk.me2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.me2 r0 = new ads_mobile_sdk.me2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.wk0 r7 = r0.b
            ads_mobile_sdk.pe2 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L49
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r5) goto L49
            goto L5e
        L49:
            java.lang.String r8 = (java.lang.String) r8
            ads_mobile_sdk.j1 r6 = r6.a
            dev.epro.r0.N9977563481342542108 r1 = new dev.epro.r0.N9977563481342542108
            r1.<init>(r7, r8, r3)
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.a(r1, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pe2.a(ads_mobile_sdk.wk0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
