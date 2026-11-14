package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class of1 {
    public final dev.epro.r0.R5692663580087387669 A;
    public final java.util.concurrent.atomic.AtomicBoolean B;
    public long C;
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final dev.epro.r0.G8001132634698687269 c;
    public final java.util.Set d;
    public final dev.epro.r0.A8094652504661216977 e;
    public final java.util.Set f;
    public final ads_mobile_sdk.kz2 g;
    public final ads_mobile_sdk.aw h;
    public final ads_mobile_sdk.sb i;
    public final ads_mobile_sdk.ci3 j;
    public final dev.epro.r0.O12043144740933444288 k;
    public final ads_mobile_sdk.jr0 l;
    public final dev.epro.r0.O16637889491137121389 m;
    public final ads_mobile_sdk.sv2 p;
    public final ads_mobile_sdk.e23 r;
    public final ads_mobile_sdk.b41 s;
    public final dev.epro.r0.A8094652504661216977 t;
    public final ads_mobile_sdk.wj u;
    public final dev.epro.r0.V2597580950516131749 v;
    public final dev.epro.r0.A8094652504661216977 w;
    public final dev.epro.r0.H15186625828076266306 x;
    public int y;
    public final dev.epro.r0.R5692663580087387669 z;

    public of1(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.G8001132634698687269 g8001132634698687269, java.util.Set set, dev.epro.r0.A8094652504661216977 a8094652504661216977, java.util.Set set2, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.aw awVar, ads_mobile_sdk.sb sbVar, ads_mobile_sdk.ci3 ci3Var, dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.A8094652504661216977 a80946525046612169772, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.sv2 sv2Var, dev.epro.r0.A8094652504661216977 a80946525046612169773, ads_mobile_sdk.e23 e23Var, ads_mobile_sdk.b41 b41Var, dev.epro.r0.A8094652504661216977 a80946525046612169774, ads_mobile_sdk.wj wjVar, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.A8094652504661216977 a80946525046612169775) {
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        set.getClass();
        a8094652504661216977.getClass();
        set2.getClass();
        kz2Var.getClass();
        awVar.getClass();
        sbVar.getClass();
        ci3Var.getClass();
        o12043144740933444288.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        a80946525046612169772.getClass();
        g0Var.getClass();
        sv2Var.getClass();
        a80946525046612169773.getClass();
        e23Var.getClass();
        b41Var.getClass();
        a80946525046612169774.getClass();
        wjVar.getClass();
        a80946525046612169775.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = g8001132634698687269;
        this.d = set;
        this.e = a8094652504661216977;
        this.f = set2;
        this.g = kz2Var;
        this.h = awVar;
        this.i = sbVar;
        this.j = ci3Var;
        this.k = o12043144740933444288;
        this.l = jr0Var;
        this.m = o16637889491137121389;
        this.p = sv2Var;
        this.r = e23Var;
        this.s = b41Var;
        this.t = a80946525046612169774;
        this.u = wjVar;
        this.v = v2597580950516131749;
        this.w = a80946525046612169775;
        this.x = new dev.epro.r0.H15186625828076266306();
        this.y = 1;
        this.z = dev.epro.r0.J8045362843799184672.k();
        this.A = dev.epro.r0.J8045362843799184672.k();
        this.B = new java.util.concurrent.atomic.AtomicBoolean(false);
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.C = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c3 A[Catch: all -> 0x01cf, TryCatch #9 {all -> 0x01cf, blocks: (B:108:0x01bc, B:110:0x01c3, B:112:0x01c7, B:114:0x01cb, B:117:0x01d1, B:119:0x01d5, B:121:0x01d9, B:123:0x01dd, B:124:0x01de, B:125:0x01e3, B:126:0x01e4, B:127:0x01eb, B:128:0x01ec, B:129:0x01f3, B:130:0x01f4), top: B:157:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4 A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #9 {all -> 0x01cf, blocks: (B:108:0x01bc, B:110:0x01c3, B:112:0x01c7, B:114:0x01cb, B:117:0x01d1, B:119:0x01d5, B:121:0x01d9, B:123:0x01dd, B:124:0x01de, B:125:0x01e3, B:126:0x01e4, B:127:0x01eb, B:128:0x01ec, B:129:0x01f3, B:130:0x01f4), top: B:157:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:72:0x015f, B:74:0x0166, B:76:0x016a, B:78:0x016e, B:81:0x0174, B:83:0x0178, B:85:0x017c, B:87:0x0180, B:88:0x0181, B:89:0x0186, B:90:0x0187, B:91:0x018e, B:92:0x018f, B:93:0x0196, B:94:0x0197), top: B:141:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {all -> 0x0172, blocks: (B:72:0x015f, B:74:0x0166, B:76:0x016a, B:78:0x016e, B:81:0x0174, B:83:0x0178, B:85:0x017c, B:87:0x0180, B:88:0x0181, B:89:0x0186, B:90:0x0187, B:91:0x018e, B:92:0x018f, B:93:0x0196, B:94:0x0197), top: B:141:0x015f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a2 A[LOOP:0: B:95:0x029c->B:97:0x02a2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a$1(dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.a$1(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (ads_mobile_sdk.wj.a(r10, r0) == r9) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x007a: MOVE (r14 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:123), block:B:36:0x0078 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[Catch: all -> 0x00d9, PHI: r1 r14 r15
      0x00bd: PHI (r1v21 ??) = (r1v31 ??), (r1v32 ??) binds: [B:34:0x0074, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r14v28 'this' ads_mobile_sdk.of1) = (r14v5 'this' ads_mobile_sdk.of1), (r14v30 'this' ads_mobile_sdk.of1) binds: [B:34:0x0074, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r15v29 ??) = (r15v5 ??), (r15v34 ??) binds: [B:34:0x0074, B:47:0x00ba] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x00d9, blocks: (B:49:0x00bd, B:51:0x00c5, B:46:0x00ae), top: B:114:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #6 {all -> 0x00d9, blocks: (B:49:0x00bd, B:51:0x00c5, B:46:0x00ae), top: B:114:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #7 {all -> 0x003c, blocks: (B:16:0x0037, B:65:0x0128, B:67:0x012e), top: B:116:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b A[Catch: all -> 0x0157, TryCatch #5 {all -> 0x0157, blocks: (B:75:0x0144, B:77:0x014b, B:79:0x014f, B:81:0x0153, B:84:0x0159, B:86:0x015d, B:88:0x0161, B:90:0x0165, B:91:0x0166, B:92:0x016b, B:93:0x016c, B:94:0x0173, B:95:0x0174, B:96:0x017b, B:97:0x017c), top: B:113:0x0144, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #5 {all -> 0x0157, blocks: (B:75:0x0144, B:77:0x014b, B:79:0x014f, B:81:0x0153, B:84:0x0159, B:86:0x015d, B:88:0x0161, B:90:0x0165, B:91:0x0166, B:92:0x016b, B:93:0x016c, B:94:0x0173, B:95:0x0174, B:96:0x017b, B:97:0x017c), top: B:113:0x0144, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v32, types: [ads_mobile_sdk.th3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v20, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v22, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.K14749510448791472029 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.lf1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.lf1 r0 = (ads_mobile_sdk.lf1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.lf1 r0 = new ads_mobile_sdk.lf1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            dev.epro.r0.E17665849472693074628.k(r8)
            return r3
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L33:
            ads_mobile_sdk.of1 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L4c
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r7
            r0.d = r5
            ads_mobile_sdk.wj r8 = r7.u
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.wj.c(r8, r0)
            if (r8 != r6) goto L4c
            goto L81
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6a
            dev.epro.r0.V2597580950516131749 r8 = r7.v
            java.lang.Object r8 = r8.get()
            ads_mobile_sdk.wa3 r8 = (ads_mobile_sdk.wa3) r8
            r8.getClass()
            dev.epro.r0.A8094652504661216977 r8 = r7.t
            java.lang.Object r8 = r8.get()
            ads_mobile_sdk.zj1 r8 = (ads_mobile_sdk.zj1) r8
            r8.getClass()
        L6a:
            ads_mobile_sdk.jr0 r8 = r7.l
            boolean r8 = r8.O()
            if (r8 == 0) goto L82
            ads_mobile_sdk.wj r7 = r7.u
            r0.a = r2
            r0.d = r4
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.wj.a(r7, r0)
            if (r7 != r6) goto L82
        L81:
            return r6
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.c(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.a(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
