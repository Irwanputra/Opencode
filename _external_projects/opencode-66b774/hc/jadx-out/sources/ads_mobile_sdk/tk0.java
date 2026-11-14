package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J14475820558843029256;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O12152244488187446230;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Z3437138737604933638;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class tk0 implements J14475820558843029256 {
    public final H15186625828076266306 a = new H15186625828076266306();
    public re1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x00b1, PHI: r9 r11
      0x009c: PHI (r9v8 'this' ??) = (r9v18 'this' ??), (r9v19 'this' ??) binds: [B:39:0x0099, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:39:0x0099, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:21:0x004b, B:41:0x009c, B:24:0x0055, B:38:0x008f, B:35:0x0082), top: B:52:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ads_mobile_sdk.re1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.O12152244488187446230 r10, dev.epro.r0.K14749510448791472029 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.ok0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.ok0 r0 = (ads_mobile_sdk.ok0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ok0 r0 = new ads_mobile_sdk.ok0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L62
            if (r1 == r6) goto L59
            if (r1 == r5) goto L4f
            if (r1 == r4) goto L47
            if (r1 == r3) goto L3f
            if (r1 == r2) goto L36
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r7
        L36:
            java.lang.Object r9 = r0.a
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            dev.epro.r0.E17665849472693074628.k(r11)
            goto Lc7
        L3f:
            java.lang.Object r9 = r0.a
            dev.epro.r0.M16184408391440927034 r9 = (dev.epro.r0.M16184408391440927034) r9
            dev.epro.r0.E17665849472693074628.k(r11)
            return r9
        L47:
            java.lang.Object r9 = r0.a
            ads_mobile_sdk.re1 r9 = (ads_mobile_sdk.re1) r9
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Throwable -> Lb1
            goto L9c
        L4f:
            ads_mobile_sdk.re1 r9 = r0.b
            java.lang.Object r10 = r0.a
            dev.epro.r0.L12639328004344855510 r10 = (dev.epro.r0.L12639328004344855510) r10
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Throwable -> Lb1
            goto L8f
        L59:
            java.lang.Object r9 = r0.a
            r10 = r9
            dev.epro.r0.L12639328004344855510 r10 = (dev.epro.r0.L12639328004344855510) r10
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L70
        L62:
            dev.epro.r0.E17665849472693074628.k(r11)
            r0.a = r10
            r0.e = r6
            java.lang.Object r11 = r9.b(r0)
            if (r11 != r8) goto L70
            goto Lc5
        L70:
            dev.epro.r0.M16184408391440927034 r11 = (dev.epro.r0.M16184408391440927034) r11
            boolean r9 = r11 instanceof ads_mobile_sdk.pu0
            if (r9 == 0) goto L79
            ads_mobile_sdk.pu0 r11 = (ads_mobile_sdk.pu0) r11
            return r11
        L79:
            r11.getClass()
            ads_mobile_sdk.xu0 r11 = (ads_mobile_sdk.xu0) r11
            java.lang.Object r9 = r11.b
            ads_mobile_sdk.re1 r9 = (ads_mobile_sdk.re1) r9
            r0.a = r10     // Catch: java.lang.Throwable -> Lb1
            r0.b = r9     // Catch: java.lang.Throwable -> Lb1
            r0.e = r5     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r11 = r9.d(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r8) goto L8f
            goto Lc5
        L8f:
            r0.a = r9     // Catch: java.lang.Throwable -> Lb1
            r0.b = r7     // Catch: java.lang.Throwable -> Lb1
            r0.e = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r8) goto L9c
            goto Lc5
        L9c:
            dev.epro.r0.M16184408391440927034 r11 = (dev.epro.r0.M16184408391440927034) r11     // Catch: java.lang.Throwable -> Lb1
            dev.epro.r0.U2722688686349128662 r10 = dev.epro.r0.U2722688686349128662.b
            ads_mobile_sdk.pe1 r1 = new ads_mobile_sdk.pe1
            r1.<init>(r9, r7, r6)
            r0.a = r11
            r0.e = r3
            java.lang.Object r9 = dev.epro.r0.R7033599853981556291.d0(r10, r1, r0)
            if (r9 != r8) goto Lb0
            goto Lc5
        Lb0:
            return r11
        Lb1:
            r10 = move-exception
            dev.epro.r0.U2722688686349128662 r11 = dev.epro.r0.U2722688686349128662.b
            ads_mobile_sdk.pe1 r1 = new ads_mobile_sdk.pe1
            r1.<init>(r9, r7, r6)
            r0.a = r10
            r0.b = r7
            r0.e = r2
            java.lang.Object r9 = dev.epro.r0.R7033599853981556291.d0(r11, r1, r0)
            if (r9 != r8) goto Lc6
        Lc5:
            return r8
        Lc6:
            r9 = r10
        Lc7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.a(dev.epro.r0.O12152244488187446230, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public abstract Object a(String str, R4833348786910499294 r4833348786910499294);

    /* JADX WARN: Removed duplicated region for block: B:45:0x009c A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:21:0x0048, B:43:0x0096, B:45:0x009c, B:46:0x009f), top: B:59:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:21:0x0048, B:43:0x0096, B:45:0x009c, B:46:0x009f), top: B:59:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ads_mobile_sdk.re1 r7, dev.epro.r0.K14749510448791472029 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ik0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ik0 r0 = (ads_mobile_sdk.ik0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.ik0 r0 = new ads_mobile_sdk.ik0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L45
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.a
            dev.epro.r0.R8015591507171738907 r6 = (dev.epro.r0.R8015591507171738907) r6
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L6f
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r6 = r0.c
            ads_mobile_sdk.re1 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.tk0 r1 = (ads_mobile_sdk.tk0) r1
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r6
            r6 = r1
            goto L59
        L45:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            r0.b = r7
            dev.epro.r0.H15186625828076266306 r8 = r6.a
            r0.c = r8
            r0.f = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L59
            goto L67
        L59:
            r0.a = r8     // Catch: java.lang.Throwable -> L71
            r0.b = r4     // Catch: java.lang.Throwable -> L71
            r0.c = r4     // Catch: java.lang.Throwable -> L71
            r0.f = r2     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r6.b(r7, r0)     // Catch: java.lang.Throwable -> L71
            if (r6 != r5) goto L68
        L67:
            return r5
        L68:
            r6 = r8
        L69:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r6.b(r4)
            return r7
        L6f:
            r8 = r6
            goto L73
        L71:
            r6 = move-exception
            r7 = r6
        L73:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.c(ads_mobile_sdk.re1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.K14749510448791472029 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.nk0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.nk0 r0 = (ads_mobile_sdk.nk0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.nk0 r0 = new ads_mobile_sdk.nk0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.c = r2
            java.lang.Object r5 = r4.b(r0)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            dev.epro.r0.M16184408391440927034 r5 = (dev.epro.r0.M16184408391440927034) r5
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.d(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.mk0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.mk0 r0 = (ads_mobile_sdk.mk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.mk0 r0 = new ads_mobile_sdk.mk0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.tk0 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            dev.epro.r0.H15186625828076266306 r5 = r4.a
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.re1 r4 = r4.c     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L5b
            ads_mobile_sdk.tx0 r4 = r4.a     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.k     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L5b
            boolean r4 = r4.get()     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L5b
            goto L5c
        L59:
            r4 = move-exception
            goto L64
        L5b:
            r2 = 0
        L5c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r5.b(r3)
            return r4
        L64:
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.c(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.J14475820558843029256
    public final Object a(String str, String str2, K14749510448791472029 k14749510448791472029) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return a(new O12152244488187446230(str, str2, uuidRandomUUID, null, (byte) 1), k14749510448791472029);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r6.a(r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.re1 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.hk0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.hk0 r0 = (ads_mobile_sdk.hk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.hk0 r0 = new ads_mobile_sdk.hk0
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
            goto L5c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.re1 r7 = r0.b
            ads_mobile_sdk.tk0 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L4f
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.re1 r8 = r6.c
            r6.c = r7
            if (r8 == 0) goto L4f
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r5) goto L4f
            goto L5b
        L4f:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.b(ads_mobile_sdk.re1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.J14475820558843029256
    public final Object a(I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294) throws Throwable {
        Object objA = a(new fb((Object) i16631908410500040363, (R4833348786910499294) null, (byte) 12), r4833348786910499294);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[PHI: r10
      0x0098: PHI (r10v7 ads_mobile_sdk.re1) = (r10v6 ads_mobile_sdk.re1), (r10v12 ads_mobile_sdk.re1) binds: [B:38:0x0095, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.fb r11, dev.epro.r0.R4833348786910499294 r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.qk0
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.qk0 r0 = (ads_mobile_sdk.qk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qk0 r0 = new ads_mobile_sdk.qk0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L60
            if (r1 == r7) goto L57
            if (r1 == r6) goto L4d
            if (r1 == r5) goto L45
            if (r1 == r4) goto L41
            if (r1 == r3) goto L38
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r8
        L38:
            java.lang.Object r10 = r0.a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            dev.epro.r0.E17665849472693074628.k(r12)
            goto Lc1
        L41:
            dev.epro.r0.E17665849472693074628.k(r12)
            return r2
        L45:
            java.lang.Object r10 = r0.a
            ads_mobile_sdk.re1 r10 = (ads_mobile_sdk.re1) r10
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: java.lang.Throwable -> Lab
            goto L98
        L4d:
            ads_mobile_sdk.re1 r10 = r0.b
            java.lang.Object r11 = r0.a
            dev.epro.r0.L12639328004344855510 r11 = (dev.epro.r0.L12639328004344855510) r11
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: java.lang.Throwable -> Lab
            goto L8b
        L57:
            java.lang.Object r10 = r0.a
            r11 = r10
            dev.epro.r0.L12639328004344855510 r11 = (dev.epro.r0.L12639328004344855510) r11
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L6e
        L60:
            dev.epro.r0.E17665849472693074628.k(r12)
            r0.a = r11
            r0.e = r7
            java.lang.Object r12 = r10.b(r0)
            if (r12 != r9) goto L6e
            goto Lbf
        L6e:
            dev.epro.r0.M16184408391440927034 r12 = (dev.epro.r0.M16184408391440927034) r12
            boolean r10 = r12 instanceof ads_mobile_sdk.pu0
            if (r10 == 0) goto L75
            goto Laa
        L75:
            r12.getClass()
            ads_mobile_sdk.xu0 r12 = (ads_mobile_sdk.xu0) r12
            java.lang.Object r10 = r12.b
            ads_mobile_sdk.re1 r10 = (ads_mobile_sdk.re1) r10
            r0.a = r11     // Catch: java.lang.Throwable -> Lab
            r0.b = r10     // Catch: java.lang.Throwable -> Lab
            r0.e = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r12 = r10.d(r0)     // Catch: java.lang.Throwable -> Lab
            if (r12 != r9) goto L8b
            goto Lbf
        L8b:
            r0.a = r10     // Catch: java.lang.Throwable -> Lab
            r0.b = r8     // Catch: java.lang.Throwable -> Lab
            r0.e = r5     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r11 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lab
            if (r11 != r9) goto L98
            goto Lbf
        L98:
            dev.epro.r0.U2722688686349128662 r11 = dev.epro.r0.U2722688686349128662.b
            ads_mobile_sdk.pe1 r12 = new ads_mobile_sdk.pe1
            r12.<init>(r10, r8, r6)
            r0.a = r8
            r0.e = r4
            java.lang.Object r10 = dev.epro.r0.R7033599853981556291.d0(r11, r12, r0)
            if (r10 != r9) goto Laa
            goto Lbf
        Laa:
            return r2
        Lab:
            r11 = move-exception
            dev.epro.r0.U2722688686349128662 r12 = dev.epro.r0.U2722688686349128662.b
            ads_mobile_sdk.pe1 r1 = new ads_mobile_sdk.pe1
            r1.<init>(r10, r8, r6)
            r0.a = r11
            r0.b = r8
            r0.e = r3
            java.lang.Object r10 = dev.epro.r0.R7033599853981556291.d0(r12, r1, r0)
            if (r10 != r9) goto Lc0
        Lbf:
            return r9
        Lc0:
            r10 = r11
        Lc1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tk0.a(ads_mobile_sdk.fb, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public Object a(re1 re1Var, R4833348786910499294 r4833348786910499294) {
        return O9245300239821758723.a;
    }
}
