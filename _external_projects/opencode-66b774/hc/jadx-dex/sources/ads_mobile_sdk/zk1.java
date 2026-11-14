package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class zk1 implements dev.epro.r0.C9731525580007922156 {
    public final ads_mobile_sdk.kz2 a;
    public final ads_mobile_sdk.mi3 b;
    public final ads_mobile_sdk.rw0 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final ads_mobile_sdk.jr0 e;
    public final dev.epro.r0.H15186625828076266306 f;
    public final java.util.LinkedHashMap g;
    public final java.util.LinkedHashMap h;
    public final ads_mobile_sdk.ft1 i;

    public zk1(ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.rw0 rw0Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var) {
        kz2Var.getClass();
        mi3Var.getClass();
        rw0Var.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.a = kz2Var;
        this.b = mi3Var;
        this.c = rw0Var;
        this.d = w5797197595347441198;
        this.e = jr0Var;
        this.f = new dev.epro.r0.H15186625828076266306();
        this.g = new java.util.LinkedHashMap();
        this.h = new java.util.LinkedHashMap();
        this.i = new ads_mobile_sdk.ft1(null);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:39:0x0105, B:41:0x010f, B:46:0x011b, B:48:0x0121, B:50:0x0136, B:54:0x0141), top: B:149:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r27, ads_mobile_sdk.tx0 r28, android.net.Uri r29, dev.epro.r0.K14749510448791472029 r30) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, ads_mobile_sdk.tx0, android.net.Uri, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, android.net.Uri uri, ads_mobile_sdk.vx0 vx0Var) {
        return a(this, tx0Var, uri, (dev.epro.r0.K14749510448791472029) vx0Var);
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.lang.String str, ads_mobile_sdk.fb fbVar) {
        return a(this, str, (dev.epro.r0.K14749510448791472029) fbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r5, java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.uk1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.uk1 r0 = (ads_mobile_sdk.uk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.uk1 r0 = new ads_mobile_sdk.uk1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r2) goto L31
            r5 = 2
            if (r1 != r5) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            return r3
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r4
        L31:
            java.lang.String r6 = r0.b
            ads_mobile_sdk.zk1 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4d
        L39:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.ft1 r7 = r5.i
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r7 = r7.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto L4d
            return r0
        L4d:
            ads_mobile_sdk.ax2 r7 = (ads_mobile_sdk.ax2) r7
            if (r7 != 0) goto L5b
            java.lang.String r5 = "Unknown/Unexpected GMSG without a handler: result"
            ads_mobile_sdk.xv.c(r5, r4)
            r6 = 6
            ads_mobile_sdk.zi3.a(r6, r5, r4)
            return r3
        L5b:
            dev.epro.r0.F14240031463097426304 r0 = new dev.epro.r0.F14240031463097426304     // Catch: java.lang.Exception -> L69
            r0.<init>()     // Catch: java.lang.Exception -> L69
            java.lang.Class<dev.epro.r0.I16631908410500040363> r1 = dev.epro.r0.I16631908410500040363.class
            java.lang.Object r6 = r0.b(r1, r6)     // Catch: java.lang.Exception -> L69
            dev.epro.r0.I16631908410500040363 r6 = (dev.epro.r0.I16631908410500040363) r6     // Catch: java.lang.Exception -> L69
            goto L82
        L69:
            r6 = move-exception
            ads_mobile_sdk.cc2 r0 = dev.epro.r0.G6547577305291411977.l(r6)
            java.util.ArrayList r0 = r0.s
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L7e
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = r6.getName()
        L7e:
            r0.add(r1)
            r6 = r4
        L82:
            if (r6 != 0) goto L85
            return r3
        L85:
            ads_mobile_sdk.ix1 r0 = new ads_mobile_sdk.ix1
            r0.<init>(r5, r7, r6, r4)
            dev.epro.r0.W5797197595347441198 r5 = r5.d
            dev.epro.r0.N4024785987441166868 r6 = new dev.epro.r0.N4024785987441166868
            r7 = 26
            r6.<init>(r0, r4, r7)
            r7 = 3
            dev.epro.r0.R7033599853981556291.E(r5, r4, r4, r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final java.lang.Object a(java.lang.String str, dev.epro.r0.Y4798753258822141670 y4798753258822141670, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        return a(this, str, y4798753258822141670, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:34:0x0097, B:36:0x00a1, B:39:0x00a9), top: B:54:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r9, java.lang.String r10, dev.epro.r0.Y4798753258822141670 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.Y4798753258822141670, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.C9731525580007922156
    public final java.lang.Object a(java.lang.String str, dev.epro.r0.A18119328133183277592 a18119328133183277592, ads_mobile_sdk.zw0 zw0Var) {
        return a(this, str, a18119328133183277592, zw0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r9.a(r7, r8, r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.zk1 r6, java.lang.String r7, dev.epro.r0.A18119328133183277592 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.yk1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.yk1 r0 = (ads_mobile_sdk.yk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yk1 r0 = new ads_mobile_sdk.yk1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            dev.epro.r0.H5998176783492007232 r8 = r0.b
            java.lang.String r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L4b
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.ft1 r6 = r6.i
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r6.a(r0)
            if (r9 != r5) goto L4b
            goto L5e
        L4b:
            ads_mobile_sdk.ax2 r9 = (ads_mobile_sdk.ax2) r9
            if (r9 != 0) goto L52
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L52:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r9.a(r7, r8, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zk1.a(ads_mobile_sdk.zk1, java.lang.String, dev.epro.r0.A18119328133183277592, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
