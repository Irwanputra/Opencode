package ads_mobile_sdk;

import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.R4239627874707364917;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class m72 extends R4239627874707364917 {
    public final x52 c;
    public final z1 d;
    public final H15186625828076266306 e;
    public dj1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m72(x52 x52Var, z1 z1Var, jr0 jr0Var, G8001132634698687269 g8001132634698687269) {
        super(jr0Var, g8001132634698687269);
        x52Var.getClass();
        z1Var.getClass();
        jr0Var.getClass();
        g8001132634698687269.getClass();
        this.c = x52Var;
        this.d = z1Var;
        this.e = new H15186625828076266306();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m72 r9, ads_mobile_sdk.tx0 r10, boolean r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m72.a(ads_mobile_sdk.m72, ads_mobile_sdk.tx0, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.m72] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [ads_mobile_sdk.m72] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ads_mobile_sdk.m72, dev.epro.r0.R4239627874707364917, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m72 r11, dev.epro.r0.V7496420559085948492 r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.f72
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.f72 r0 = (ads_mobile_sdk.f72) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.f72 r0 = new ads_mobile_sdk.f72
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r8 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            java.lang.Object r11 = r0.b
            dev.epro.r0.R8015591507171738907 r11 = (dev.epro.r0.R8015591507171738907) r11
            ads_mobile_sdk.m72 r12 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L31
            goto L7a
        L31:
            r0 = move-exception
            r12 = r0
            goto L84
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L3b:
            dev.epro.r0.H15186625828076266306 r11 = r0.c
            java.lang.Object r12 = r0.b
            dev.epro.r0.V7496420559085948492 r12 = (dev.epro.r0.V7496420559085948492) r12
            ads_mobile_sdk.m72 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)
            r5 = r1
        L47:
            r7 = r12
            goto L60
        L49:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.H15186625828076266306 r13 = r11.e
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.f = r3
            java.lang.Object r1 = r13.c(r0)
            if (r1 != r10) goto L5d
            goto L78
        L5d:
            r5 = r11
            r11 = r13
            goto L47
        L60:
            ads_mobile_sdk.dj1 r6 = r5.f     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7f
            dev.epro.r0.M3461266234580785862 r4 = new dev.epro.r0.M3461266234580785862     // Catch: java.lang.Throwable -> L31
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L31
            r0.a = r5     // Catch: java.lang.Throwable -> L31
            r0.b = r11     // Catch: java.lang.Throwable -> L31
            r0.c = r8     // Catch: java.lang.Throwable -> L31
            r0.f = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r5.a$1(r4, r0)     // Catch: java.lang.Throwable -> L31
            if (r12 != r10) goto L79
        L78:
            return r10
        L79:
            r12 = r5
        L7a:
            r12.f = r8     // Catch: java.lang.Throwable -> L31
            dev.epro.r0.O9245300239821758723 r12 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L31
            goto L80
        L7f:
            r12 = r8
        L80:
            r11.b(r8)
            return r12
        L84:
            r11.b(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m72.a(ads_mobile_sdk.m72, dev.epro.r0.V7496420559085948492, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r6.a$1(r4, r0) == r10) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.m72, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ads_mobile_sdk.m72, dev.epro.r0.R4239627874707364917, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m72 r11, ads_mobile_sdk.jy0 r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.h72
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.h72 r0 = (ads_mobile_sdk.h72) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.h72 r0 = new ads_mobile_sdk.h72
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r8 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L47
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            java.lang.Object r11 = r0.a
            dev.epro.r0.R8015591507171738907 r11 = (dev.epro.r0.R8015591507171738907) r11
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r0 = move-exception
            r12 = r0
            goto L7e
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L39:
            dev.epro.r0.H15186625828076266306 r11 = r0.c
            ads_mobile_sdk.jy0 r12 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.m72 r1 = (ads_mobile_sdk.m72) r1
            dev.epro.r0.E17665849472693074628.k(r13)
            r6 = r1
        L45:
            r5 = r12
            goto L5e
        L47:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.H15186625828076266306 r13 = r11.e
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.f = r3
            java.lang.Object r1 = r13.c(r0)
            if (r1 != r10) goto L5b
            goto L77
        L5b:
            r6 = r11
            r11 = r13
            goto L45
        L5e:
            ads_mobile_sdk.dj1 r7 = r6.f     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L63
            goto L78
        L63:
            dev.epro.r0.Y14712737278372885690 r4 = new dev.epro.r0.Y14712737278372885690     // Catch: java.lang.Throwable -> L2f
            r9 = 2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r0.a = r11     // Catch: java.lang.Throwable -> L2f
            r0.b = r8     // Catch: java.lang.Throwable -> L2f
            r0.c = r8     // Catch: java.lang.Throwable -> L2f
            r0.f = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r12 = r6.a$1(r4, r0)     // Catch: java.lang.Throwable -> L2f
            if (r12 != r10) goto L78
        L77:
            return r10
        L78:
            dev.epro.r0.O9245300239821758723 r12 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r11.b(r8)
            return r12
        L7e:
            r11.b(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m72.a(ads_mobile_sdk.m72, ads_mobile_sdk.jy0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m72 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.j72
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.j72 r0 = (ads_mobile_sdk.j72) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.j72 r0 = new ads_mobile_sdk.j72
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.m72 r0 = r0.a
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
            dev.epro.r0.H15186625828076266306 r5 = r4.e
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.dj1 r4 = r4.f     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L54
            r5.b(r3)
            return r4
        L54:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m72.a(ads_mobile_sdk.m72, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r7.a$1(r6, r0) == r5) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [ads_mobile_sdk.m72, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ads_mobile_sdk.m72, dev.epro.r0.R4239627874707364917] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.m72 r12, android.view.View r13, ads_mobile_sdk.xr0 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.d72
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.d72 r0 = (ads_mobile_sdk.d72) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.d72 r0 = new ads_mobile_sdk.d72
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r12 = r0.a
            dev.epro.r0.R8015591507171738907 r12 = (dev.epro.r0.R8015591507171738907) r12
            dev.epro.r0.E17665849472693074628.k(r15)     // Catch: java.lang.Throwable -> L2f
            goto L7e
        L2f:
            r0 = move-exception
            r13 = r0
            goto L84
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r12)
            return r4
        L38:
            dev.epro.r0.H15186625828076266306 r12 = r0.e
            ads_mobile_sdk.xr0 r14 = r0.c
            android.view.View r13 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.m72 r1 = (ads_mobile_sdk.m72) r1
            dev.epro.r0.E17665849472693074628.k(r15)
            r7 = r1
        L46:
            r9 = r13
            r10 = r14
            goto L62
        L49:
            dev.epro.r0.E17665849472693074628.k(r15)
            dev.epro.r0.H15186625828076266306 r15 = r12.e
            r0.a = r12
            r0.b = r13
            r0.c = r14
            r0.e = r15
            r0.h = r3
            java.lang.Object r1 = r15.c(r0)
            if (r1 != r5) goto L5f
            goto L7d
        L5f:
            r7 = r12
            r12 = r15
            goto L46
        L62:
            ads_mobile_sdk.dj1 r8 = r7.f     // Catch: java.lang.Throwable -> L2f
            if (r8 != 0) goto L67
            goto L7e
        L67:
            ads_mobile_sdk.e72 r6 = new ads_mobile_sdk.e72     // Catch: java.lang.Throwable -> L2f
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f
            r0.a = r12     // Catch: java.lang.Throwable -> L2f
            r0.b = r4     // Catch: java.lang.Throwable -> L2f
            r0.c = r4     // Catch: java.lang.Throwable -> L2f
            r0.e = r4     // Catch: java.lang.Throwable -> L2f
            r0.h = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r13 = r7.a$1(r6, r0)     // Catch: java.lang.Throwable -> L2f
            if (r13 != r5) goto L7e
        L7d:
            return r5
        L7e:
            dev.epro.r0.O9245300239821758723 r13 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r12.b(r4)
            return r13
        L84:
            r12.b(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.m72.a(ads_mobile_sdk.m72, android.view.View, ads_mobile_sdk.xr0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
