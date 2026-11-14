package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x60 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final ads_mobile_sdk.jr0 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final ads_mobile_sdk.kx2 d;
    public final dev.epro.r0.H15186625828076266306 e;
    public final java.util.LinkedHashMap f;
    public final java.util.ArrayList g;
    public final java.util.LinkedHashMap h;

    public x60(dev.epro.r0.W5797197595347441198 w5797197595347441198, android.content.Context context, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.kx2 kx2Var, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.di0 di0Var, ads_mobile_sdk.hv hvVar) {
        w5797197595347441198.getClass();
        context.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        kx2Var.getClass();
        qw2Var.getClass();
        di0Var.getClass();
        hvVar.getClass();
        this.a = w5797197595347441198;
        this.b = jr0Var;
        this.c = o16637889491137121389;
        this.d = kx2Var;
        this.e = new dev.epro.r0.H15186625828076266306();
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = new dev.epro.r0.H9390398899829886498("ad_format", qw2Var.a);
        dev.epro.r0.H9390398899829886498 h93903988998298864982 = new dev.epro.r0.H9390398899829886498("api_v", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        dev.epro.r0.H9390398899829886498 h93903988998298864983 = new dev.epro.r0.H9390398899829886498("app", context.getPackageName());
        dev.epro.r0.H9390398899829886498 h93903988998298864984 = new dev.epro.r0.H9390398899829886498("s", "gmob_sdk");
        dev.epro.r0.H9390398899829886498 h93903988998298864985 = new dev.epro.r0.H9390398899829886498("v", "3");
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        str2.getClass();
        str.getClass();
        this.f = dev.epro.r0.E4951175994894594588.w0(h9390398899829886498, h93903988998298864982, h93903988998298864983, h93903988998298864984, h93903988998298864985, new dev.epro.r0.H9390398899829886498("device", dev.epro.r0.Z13168519540281190457.F(str2, str, false) ? str2 : dev.epro.r0.G6547577305291411977.s(str, " ", str2)), new dev.epro.r0.H9390398899829886498("is_bstar", ((java.lang.Boolean) di0Var.f.getValue()).booleanValue() ? "1" : "0"), new dev.epro.r0.H9390398899829886498("is_lite_sdk", "0"), new dev.epro.r0.H9390398899829886498("gqi", hvVar.h), new dev.epro.r0.H9390398899829886498("os", android.os.Build.VERSION.RELEASE));
        this.g = new java.util.ArrayList();
        this.h = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x60.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.x60 r6, java.lang.String r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.r60
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.r60 r0 = (ads_mobile_sdk.r60) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.r60 r0 = new ads_mobile_sdk.r60
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            dev.epro.r0.H15186625828076266306 r6 = r0.e
            ads_mobile_sdk.kh3 r7 = r0.d
            ads_mobile_sdk.kh3 r1 = r0.c
            java.lang.String r2 = r0.b
            ads_mobile_sdk.x60 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r2
            goto L6b
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L38:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.kh3 r8 = new ads_mobile_sdk.kh3
            dev.epro.r0.E17149812035295265804 r1 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.O16637889491137121389 r1 = r6.c
            r1.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            dev.epro.r0.N13798149404328803870 r1 = dev.epro.r0.N13798149404328803870.d
            long r4 = dev.epro.r0.M9216324016624295870.a0(r4, r1)
            r8.<init>(r4, r7)
            dev.epro.r0.H15186625828076266306 r1 = r6.e
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.d = r8
            r0.e = r1
            r0.h = r2
            java.lang.Object r0 = r1.c(r0)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r2) goto L68
            return r2
        L68:
            r0 = r6
            r6 = r1
            r1 = r8
        L6b:
            java.util.LinkedHashMap r0 = r0.h     // Catch: java.lang.Throwable -> L74
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> L74
            r6.b(r3)
            return r1
        L74:
            r7 = move-exception
            r6.b(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x60.a(ads_mobile_sdk.x60, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, boolean r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.v60
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.v60 r0 = (ads_mobile_sdk.v60) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.v60 r0 = new ads_mobile_sdk.v60
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            boolean r7 = r0.e
            dev.epro.r0.H15186625828076266306 r4 = r0.d
            java.lang.String r6 = r0.c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.x60 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r4
            r4 = r0
            goto L52
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L38:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r4
            r0.b = r5
            r0.c = r6
            dev.epro.r0.H15186625828076266306 r8 = r4.e
            r0.d = r8
            r0.e = r7
            r0.h = r2
            java.lang.Object r0 = r8.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L52
            return r1
        L52:
            if (r7 == 0) goto L5c
            java.util.LinkedHashMap r4 = r4.f     // Catch: java.lang.Throwable -> L5a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r4 = move-exception
            goto L67
        L5c:
            java.util.LinkedHashMap r4 = r4.f     // Catch: java.lang.Throwable -> L5a
            r4.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L5a
        L61:
            r8.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L67:
            r8.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x60.a(java.lang.String, java.lang.String, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, long r7, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.w60
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.w60 r0 = (ads_mobile_sdk.w60) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.w60 r0 = new ads_mobile_sdk.w60
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            long r7 = r0.e
            dev.epro.r0.H15186625828076266306 r4 = r0.d
            java.lang.String r6 = r0.c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.x60 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r4
            r4 = r0
            goto L52
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L38:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r4
            r0.b = r5
            r0.c = r6
            dev.epro.r0.H15186625828076266306 r9 = r4.e
            r0.d = r9
            r0.e = r7
            r0.h = r2
            java.lang.Object r0 = r9.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L52
            return r1
        L52:
            java.util.LinkedHashMap r0 = r4.h     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L67
            ads_mobile_sdk.kh3 r6 = (ads_mobile_sdk.kh3) r6     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L69
            java.util.ArrayList r4 = r4.g     // Catch: java.lang.Throwable -> L67
            ads_mobile_sdk.p60 r0 = new ads_mobile_sdk.p60     // Catch: java.lang.Throwable -> L67
            r0.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L67
            r4.add(r0)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r4 = move-exception
            goto L6f
        L69:
            r9.b(r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L6f:
            r9.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x60.a(java.lang.String, java.lang.String, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
