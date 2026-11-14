package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xy1 {
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.sp3 c;
    public final dev.epro.r0.A5459349068949265291 d;
    public final ads_mobile_sdk.jr0 e;
    public final dev.epro.r0.P16188089657974175786 f;

    public xy1(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.sp3 sp3Var, dev.epro.r0.A5459349068949265291 a5459349068949265291, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.P16188089657974175786 p16188089657974175786) {
        context.getClass();
        w5797197595347441198.getClass();
        sp3Var.getClass();
        a5459349068949265291.getClass();
        jr0Var.getClass();
        p16188089657974175786.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = sp3Var;
        this.d = a5459349068949265291;
        this.e = jr0Var;
        this.f = p16188089657974175786;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r12.a(r13, r7) == r10) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[Catch: all -> 0x00cc, TryCatch #4 {all -> 0x00cc, blocks: (B:47:0x00b9, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00cf, B:58:0x00d3, B:60:0x00d7, B:62:0x00db, B:63:0x00dc, B:64:0x00e1, B:65:0x00e2, B:66:0x00e9, B:67:0x00ea, B:68:0x00f1, B:69:0x00f2), top: B:82:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #4 {all -> 0x00cc, blocks: (B:47:0x00b9, B:49:0x00c0, B:51:0x00c4, B:53:0x00c8, B:56:0x00cf, B:58:0x00d3, B:60:0x00d7, B:62:0x00db, B:63:0x00dc, B:64:0x00e1, B:65:0x00e2, B:66:0x00e9, B:67:0x00ea, B:68:0x00f1, B:69:0x00f2), top: B:82:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.xy1 r11, ads_mobile_sdk.fs3 r12, ads_mobile_sdk.eg2 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xy1.a(ads_mobile_sdk.xy1, ads_mobile_sdk.fs3, ads_mobile_sdk.eg2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.xy1 r4, ads_mobile_sdk.tx0 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof ads_mobile_sdk.wy1
            if (r0 == 0) goto L16
            r0 = r6
            ads_mobile_sdk.wy1 r0 = (ads_mobile_sdk.wy1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.wy1 r0 = new ads_mobile_sdk.wy1
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            ads_mobile_sdk.tx0 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            return r4
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L31:
            dev.epro.r0.E17665849472693074628.k(r6)
            ads_mobile_sdk.sy0 r6 = r5.d()
            if (r6 == 0) goto L4f
            dev.epro.r0.P16188089657974175786 r4 = r4.f
            dev.epro.r0.T18375584833185129273 r4 = (dev.epro.r0.T18375584833185129273) r4
            dev.epro.r0.L17551298460506453774 r4 = r4.o
            if (r4 == 0) goto L4f
            r0.a = r5
            r0.d = r2
            java.lang.Object r4 = r6.a(r4, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L4f
            return r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xy1.a(ads_mobile_sdk.xy1, ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
