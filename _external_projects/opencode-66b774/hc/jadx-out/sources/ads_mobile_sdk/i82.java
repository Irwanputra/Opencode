package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4239627874707364917;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Z3437138737604933638;
import dev.epro.r0.Z5089078543653785389;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class i82 extends R4239627874707364917 implements Z5089078543653785389 {
    public final W5797197595347441198 c;
    public final I16631908410500040363 d;
    public final z1 e;
    public final x52 f;
    public final it1 g;
    public final z03 h;
    public final H15186625828076266306 i;
    public X7175349259954592591 j;
    public tx0 k;
    public m6 l;
    public final boolean m;
    public final List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(G8001132634698687269 g8001132634698687269, W5797197595347441198 w5797197595347441198, I16631908410500040363 i16631908410500040363, z1 z1Var, x52 x52Var, it1 it1Var, jr0 jr0Var, z03 z03Var) {
        super(jr0Var, g8001132634698687269);
        g8001132634698687269.getClass();
        w5797197595347441198.getClass();
        i16631908410500040363.getClass();
        z1Var.getClass();
        x52Var.getClass();
        it1Var.getClass();
        jr0Var.getClass();
        z03Var.getClass();
        this.c = w5797197595347441198;
        this.d = i16631908410500040363;
        this.e = z1Var;
        this.f = x52Var;
        this.g = it1Var;
        this.h = z03Var;
        this.i = new H15186625828076266306();
        q82 q82Var = it1Var.n;
        this.m = (q82Var != null ? q82Var.a : 0) == 1;
        this.n = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        if (r12.a(r0) == r7) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x0036, PHI: r1 r11
      0x00d3: PHI (r1v12 ??) = (r1v7 ??), (r1v18 ??), (r1v19 ??) binds: [B:48:0x00d1, B:46:0x00ce, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r11v9 dev.epro.r0.R8015591507171738907) = 
      (r11v6 dev.epro.r0.R8015591507171738907)
      (r11v19 dev.epro.r0.R8015591507171738907)
      (r11v20 dev.epro.r0.R8015591507171738907)
     binds: [B:48:0x00d1, B:46:0x00ce, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0036, blocks: (B:15:0x0031, B:55:0x00e5, B:22:0x0043, B:49:0x00d3, B:51:0x00d7, B:25:0x004c, B:45:0x00a4), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x0031, B:55:0x00e5, B:22:0x0043, B:49:0x00d3, B:51:0x00d7, B:25:0x004c, B:45:0x00a4), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ads_mobile_sdk.i82] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.i82] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [ads_mobile_sdk.i82, dev.epro.r0.R4239627874707364917, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ads_mobile_sdk.i82, dev.epro.r0.R4239627874707364917] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ads_mobile_sdk.i82] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.i82 r11, dev.epro.r0.K14749510448791472029 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i82.b(ads_mobile_sdk.i82, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.i82 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.b82
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.b82 r0 = (ads_mobile_sdk.b82) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.b82 r0 = new ads_mobile_sdk.b82
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.i82 r0 = r0.a
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
            dev.epro.r0.H15186625828076266306 r5 = r4.i
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.m6 r0 = r4.l     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L53
            dev.epro.r0.X7175349259954592591 r4 = r4.j     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L4f
            goto L53
        L4f:
            r2 = 0
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L51
            r5.b(r3)
            return r4
        L5b:
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i82.c(ads_mobile_sdk.i82, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.i82 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.f82
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.f82 r0 = (ads_mobile_sdk.f82) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.f82 r0 = new ads_mobile_sdk.f82
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 2
            r4 = 0
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            return r2
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r4
        L33:
            ads_mobile_sdk.i82 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L77
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.x52 r9 = r8.f
            ads_mobile_sdk.ci3 r9 = r9.f
            r9.getClass()
            ads_mobile_sdk.z62 r1 = dev.epro.r0.K5751602218013079365.C     // Catch: java.lang.Exception -> L4c
            boolean r1 = r1.a     // Catch: java.lang.Exception -> L4c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L4c
            goto L53
        L4c:
            r1 = move-exception
            java.lang.String r7 = "IsActive"
            r9.a(r7, r1)
            r9 = r4
        L53:
            if (r9 == 0) goto L9f
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9f
            dev.epro.r0.I16631908410500040363 r9 = r8.d
            java.lang.String r1 = "enable_omid"
            if (r9 != 0) goto L62
            goto L9f
        L62:
            dev.epro.r0.K15572083692188606544 r9 = r9.w(r1)     // Catch: java.lang.Exception -> L9f
            boolean r9 = r9.b()     // Catch: java.lang.Exception -> L9f
            if (r9 == 0) goto L9f
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = c(r8, r0)
            if (r9 != r6) goto L77
            goto L9e
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L9f
            ads_mobile_sdk.it1 r9 = r8.g
            int r1 = r9.b
            if (r1 != r3) goto L90
            ads_mobile_sdk.q82 r9 = r9.n
            if (r9 == 0) goto L8c
            int r9 = r9.a
            goto L8d
        L8c:
            r9 = 0
        L8d:
            if (r9 != r3) goto L90
            goto L9f
        L90:
            r0.a = r4
            r0.d = r3
            java.lang.String r9 = "Google"
            ads_mobile_sdk.q31 r1 = ads_mobile_sdk.q31.e
            java.lang.Object r8 = r8.a(r9, r5, r1, r0)
            if (r8 != r6) goto L9f
        L9e:
            return r6
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i82.d(ads_mobile_sdk.i82, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, boolean r20, ads_mobile_sdk.q31 r21, dev.epro.r0.K14749510448791472029 r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i82.a(java.lang.String, boolean, ads_mobile_sdk.q31, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object i(R4833348786910499294 r4833348786910499294) {
        return d(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object l(mq3 mq3Var) {
        return c(this, mq3Var);
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object m(ht0 ht0Var) throws Throwable {
        Object objA = a("measurePreviousView", new c82(this, null), ht0Var);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object n(R4833348786910499294 r4833348786910499294) {
        Object objA;
        q82 q82Var = this.g.n;
        return ((q82Var != null ? q82Var.a : 0) == 1 && (objA = a("onAdClicked", new d82(3, null, (byte) 0), (K14749510448791472029) r4833348786910499294)) == Z3437138737604933638.a) ? objA : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) throws Throwable {
        Object objA = a("onAdImpression", new d82(3, null, (byte) 1), (K14749510448791472029) r4833348786910499294);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(View view, xr0 xr0Var, R14062301455140331524 r14062301455140331524) throws Throwable {
        Object objA = a("addFriendlyObstruction", new r72(this, view, xr0Var, null), r14062301455140331524);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[PHI: r0 r1 r3 r6
      0x005c: PHI (r0v4 dev.epro.r0.H15186625828076266306) = (r0v3 dev.epro.r0.H15186625828076266306), (r0v13 dev.epro.r0.H15186625828076266306) binds: [B:42:0x00cb, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:42:0x00cb, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r3v4 dev.epro.r0.J12078565427869724451) = (r3v3 dev.epro.r0.J12078565427869724451), (r3v12 dev.epro.r0.J12078565427869724451) binds: [B:42:0x00cb, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r6v4 ads_mobile_sdk.i82) = (r6v3 ads_mobile_sdk.i82), (r6v8 ads_mobile_sdk.i82) binds: [B:42:0x00cb, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[Catch: CancellationException -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x00de, blocks: (B:46:0x00d2, B:50:0x00da, B:41:0x00bb, B:37:0x00a9), top: B:80:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6 A[Catch: all -> 0x00fe, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00fe, blocks: (B:44:0x00ce, B:48:0x00d6, B:53:0x00e0), top: B:83:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, dev.epro.r0.J12078565427869724451 r18, dev.epro.r0.K14749510448791472029 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i82.a(java.lang.String, dev.epro.r0.J12078565427869724451, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(mq3 mq3Var) {
        return b(this, mq3Var);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(R4833348786910499294 r4833348786910499294) throws Throwable {
        Object objB = b(this, (K14749510448791472029) r4833348786910499294);
        return objB == Z3437138737604933638.a ? objB : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(View view, R4833348786910499294 r4833348786910499294) {
        Object objA;
        return (!this.m && (objA = a("updateRegisteredAdView", new h82(this, view, null), (K14749510448791472029) r4833348786910499294)) == Z3437138737604933638.a) ? objA : O9245300239821758723.a;
    }
}
