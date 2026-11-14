package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4239627874707364917;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z5089078543653785389;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class w62 extends R4239627874707364917 implements Z5089078543653785389 {
    public final W5797197595347441198 c;
    public final z1 d;
    public final x52 e;
    public final jy0 f;
    public final m72 g;
    public final H15186625828076266306 h;
    public m6 i;
    public final List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w62(G8001132634698687269 g8001132634698687269, W5797197595347441198 w5797197595347441198, z1 z1Var, x52 x52Var, jy0 jy0Var, m72 m72Var, jr0 jr0Var) {
        super(jr0Var, g8001132634698687269);
        g8001132634698687269.getClass();
        w5797197595347441198.getClass();
        z1Var.getClass();
        x52Var.getClass();
        jy0Var.getClass();
        m72Var.getClass();
        jr0Var.getClass();
        this.c = w5797197595347441198;
        this.d = z1Var;
        this.e = x52Var;
        this.f = jy0Var;
        this.g = m72Var;
        this.h = new H15186625828076266306();
        this.j = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ads_mobile_sdk.w62] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.w62] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ads_mobile_sdk.w62, dev.epro.r0.R4239627874707364917] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w62 r11, android.view.View r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.u62
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.u62 r0 = (ads_mobile_sdk.u62) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.u62 r0 = new ads_mobile_sdk.u62
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r8 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L47
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            dev.epro.r0.R8015591507171738907 r11 = r0.c
            android.view.View r12 = r0.b
            ads_mobile_sdk.w62 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Throwable -> L31
            goto L79
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
            dev.epro.r0.R8015591507171738907 r11 = r0.c
            android.view.View r12 = r0.b
            ads_mobile_sdk.w62 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)
            r5 = r1
        L45:
            r7 = r12
            goto L5e
        L47:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.H15186625828076266306 r13 = r11.h
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.f = r3
            java.lang.Object r1 = r13.c(r0)
            if (r1 != r10) goto L5b
            goto L76
        L5b:
            r5 = r11
            r11 = r13
            goto L45
        L5e:
            ads_mobile_sdk.m6 r6 = r5.i     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7e
            ads_mobile_sdk.r62 r4 = new ads_mobile_sdk.r62     // Catch: java.lang.Throwable -> L31
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L31
            r0.a = r5     // Catch: java.lang.Throwable -> L31
            r0.b = r7     // Catch: java.lang.Throwable -> L31
            r0.c = r11     // Catch: java.lang.Throwable -> L31
            r0.f = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r5.a$1(r4, r0)     // Catch: java.lang.Throwable -> L31
            if (r12 != r10) goto L77
        L76:
            return r10
        L77:
            r0 = r5
            r12 = r7
        L79:
            java.util.List r13 = r0.j     // Catch: java.lang.Throwable -> L31
            r13.add(r12)     // Catch: java.lang.Throwable -> L31
        L7e:
            dev.epro.r0.O9245300239821758723 r12 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L31
            r11.b(r8)
            return r12
        L84:
            r11.b(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.a(ads_mobile_sdk.w62, android.view.View, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.w62 r7, dev.epro.r0.K14749510448791472029 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.p62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.p62 r0 = (ads_mobile_sdk.p62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.p62 r0 = new ads_mobile_sdk.p62
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            dev.epro.r0.R8015591507171738907 r7 = (dev.epro.r0.R8015591507171738907) r7
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r8 = move-exception
            goto L85
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w62 r1 = (ads_mobile_sdk.w62) r1
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r1
            goto L55
        L43:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.H15186625828076266306 r8 = r7.h
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L55
            goto L6a
        L55:
            ads_mobile_sdk.m6 r1 = r7.i     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            ads_mobile_sdk.m72 r7 = r7.g     // Catch: java.lang.Throwable -> L7a
            r0.a = r8     // Catch: java.lang.Throwable -> L7a
            r0.b = r4     // Catch: java.lang.Throwable -> L7a
            r0.e = r2     // Catch: java.lang.Throwable -> L7a
            r7.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = ads_mobile_sdk.m72.a(r7, r0)     // Catch: java.lang.Throwable -> L7a
            if (r7 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r8
            r8 = r7
            r7 = r6
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L78
            r8 = r7
            goto L7c
        L78:
            r3 = 0
            goto L7d
        L7a:
            r7 = move-exception
            goto L88
        L7c:
            r7 = r8
        L7d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            r7.b(r4)
            return r8
        L85:
            r6 = r8
            r8 = r7
            r7 = r6
        L88:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.b(ads_mobile_sdk.w62, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r5.a$1(r4, r0) == r10) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.w62, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ads_mobile_sdk.w62, dev.epro.r0.R4239627874707364917] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.w62 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            boolean r0 = r12 instanceof ads_mobile_sdk.q62
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.q62 r0 = (ads_mobile_sdk.q62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.q62 r0 = new ads_mobile_sdk.q62
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r8 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r11 = r0.a
            dev.epro.r0.R8015591507171738907 r11 = (dev.epro.r0.R8015591507171738907) r11
            dev.epro.r0.E17665849472693074628.k(r12)     // Catch: java.lang.Throwable -> L7f
            goto L82
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L36:
            dev.epro.r0.H15186625828076266306 r11 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w62 r1 = (ads_mobile_sdk.w62) r1
            dev.epro.r0.E17665849472693074628.k(r12)
            r5 = r1
            goto L55
        L41:
            dev.epro.r0.E17665849472693074628.k(r12)
            dev.epro.r0.H15186625828076266306 r12 = r11.h
            r0.a = r11
            r0.b = r12
            r0.e = r3
            java.lang.Object r1 = r12.c(r0)
            if (r1 != r10) goto L53
            goto L7e
        L53:
            r5 = r11
            r11 = r12
        L55:
            ads_mobile_sdk.m6 r6 = r5.i     // Catch: java.lang.Throwable -> L7f
            java.util.List r12 = r5.j
            if (r6 == 0) goto L82
            r12.getClass()     // Catch: java.lang.Throwable -> L7f
            dev.epro.r0.P17571903987102865660.s0(r12)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r12 = dev.epro.r0.R9411874267597469228.L0(r12)     // Catch: java.lang.Throwable -> L7f
            android.view.View r12 = (android.view.View) r12     // Catch: java.lang.Throwable -> L7f
            if (r12 != 0) goto L6b
            ads_mobile_sdk.jy0 r12 = r5.f     // Catch: java.lang.Throwable -> L7f
        L6b:
            r7 = r12
            ads_mobile_sdk.r62 r4 = new ads_mobile_sdk.r62     // Catch: java.lang.Throwable -> L7f
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7f
            r0.a = r11     // Catch: java.lang.Throwable -> L7f
            r0.b = r8     // Catch: java.lang.Throwable -> L7f
            r0.e = r2     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r12 = r5.a$1(r4, r0)     // Catch: java.lang.Throwable -> L7f
            if (r12 != r10) goto L82
        L7e:
            return r10
        L7f:
            r0 = move-exception
            r12 = r0
            goto L88
        L82:
            dev.epro.r0.O9245300239821758723 r12 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L7f
            r11.b(r8)
            return r12
        L88:
            r11.b(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.c(ads_mobile_sdk.w62, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r10.a(r4, "onSdkImpression", r0) == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.w62 r9, dev.epro.r0.K14749510448791472029 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.s62
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.s62 r0 = (ads_mobile_sdk.s62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.s62 r0 = new ads_mobile_sdk.s62
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L60
            if (r1 == r5) goto L51
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L38
            java.lang.Object r9 = r0.a
            dev.epro.r0.R8015591507171738907 r9 = (dev.epro.r0.R8015591507171738907) r9
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L35
            goto Lb1
        L35:
            r10 = move-exception
            goto Lb5
        L38:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r6
        L3e:
            java.lang.Object r9 = r0.b
            ads_mobile_sdk.tx0 r9 = (ads_mobile_sdk.tx0) r9
            java.lang.Object r1 = r0.a
            dev.epro.r0.R8015591507171738907 r1 = (dev.epro.r0.R8015591507171738907) r1
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L4e
            r8 = r10
            r10 = r9
            r9 = r1
            r1 = r8
            goto L90
        L4e:
            r9 = move-exception
            goto Lb7
        L51:
            java.lang.Object r9 = r0.b
            dev.epro.r0.R8015591507171738907 r9 = (dev.epro.r0.R8015591507171738907) r9
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w62 r1 = (ads_mobile_sdk.w62) r1
            dev.epro.r0.E17665849472693074628.k(r10)
            r8 = r1
            r1 = r9
            r9 = r8
            goto L73
        L60:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.H15186625828076266306 r10 = r9.h
            r0.a = r9
            r0.b = r10
            r0.e = r5
            java.lang.Object r1 = r10.c(r0)
            if (r1 != r7) goto L72
            goto Lb0
        L72:
            r1 = r10
        L73:
            ads_mobile_sdk.jy0 r10 = r9.f     // Catch: java.lang.Throwable -> L4e
            ads_mobile_sdk.tx0 r10 = r10.a     // Catch: java.lang.Throwable -> L4e
            ads_mobile_sdk.m6 r5 = r9.i     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L9c
            ads_mobile_sdk.m72 r9 = r9.g     // Catch: java.lang.Throwable -> L4e
            r0.a = r1     // Catch: java.lang.Throwable -> L4e
            r0.b = r10     // Catch: java.lang.Throwable -> L4e
            r0.e = r4     // Catch: java.lang.Throwable -> L4e
            r9.getClass()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r9 = ads_mobile_sdk.m72.a(r9, r0)     // Catch: java.lang.Throwable -> L4e
            if (r9 != r7) goto L8d
            goto Lb0
        L8d:
            r8 = r1
            r1 = r9
            r9 = r8
        L90:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L9d
            r9.b(r6)
            return r2
        L9c:
            r9 = r1
        L9d:
            java.lang.String r1 = "onSdkImpression"
            dev.epro.r0.I16631908410500040363 r4 = new dev.epro.r0.I16631908410500040363     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r0.a = r9     // Catch: java.lang.Throwable -> L35
            r0.b = r6     // Catch: java.lang.Throwable -> L35
            r0.e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r10.a(r4, r1, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r7) goto Lb1
        Lb0:
            return r7
        Lb1:
            r9.b(r6)
            return r2
        Lb5:
            r1 = r9
            r9 = r10
        Lb7:
            r1.b(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.d(ads_mobile_sdk.w62, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.w62 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.t62
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.t62 r0 = (ads_mobile_sdk.t62) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.t62 r0 = new ads_mobile_sdk.t62
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            dev.epro.r0.E17665849472693074628.k(r9)
            return r6
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L36:
            dev.epro.r0.E17665849472693074628.k(r9)
            return r6
        L3a:
            ads_mobile_sdk.w62 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L5a
        L40:
            dev.epro.r0.E17665849472693074628.k(r9)
            ads_mobile_sdk.z1 r9 = r8.d
            boolean r9 = r9.O
            if (r9 != 0) goto L4a
            goto L81
        L4a:
            ads_mobile_sdk.m72 r9 = r8.g
            r0.a = r8
            r0.d = r5
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.m72.a(r9, r0)
            if (r9 != r7) goto L5a
            goto L80
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L74
            ads_mobile_sdk.m72 r9 = r8.g
            ads_mobile_sdk.jy0 r8 = r8.f
            r0.a = r2
            r0.d = r4
            r9.getClass()
            java.lang.Object r8 = ads_mobile_sdk.m72.a(r9, r8, r0)
            if (r8 != r7) goto L81
            goto L80
        L74:
            ads_mobile_sdk.jy0 r9 = r8.f
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.e(ads_mobile_sdk.w62, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object i(R4833348786910499294 r4833348786910499294) {
        return e(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object l(mq3 mq3Var) {
        return b(this, mq3Var);
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object m(ht0 ht0Var) {
        return c(this, ht0Var);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        return d(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w62 r11, android.view.ViewGroup r12, ads_mobile_sdk.xr0 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            boolean r0 = r14 instanceof ads_mobile_sdk.i62
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.i62 r0 = (ads_mobile_sdk.i62) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.i62 r0 = new ads_mobile_sdk.i62
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            dev.epro.r0.E17665849472693074628.k(r14)
            return r14
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L31:
            ads_mobile_sdk.xr0 r13 = r0.c
            android.view.ViewGroup r12 = r0.b
            ads_mobile_sdk.w62 r11 = r0.a
            dev.epro.r0.E17665849472693074628.k(r14)
        L3a:
            r6 = r11
            r7 = r12
            r8 = r13
            goto L55
        L3e:
            dev.epro.r0.E17665849472693074628.k(r14)
            ads_mobile_sdk.m72 r14 = r11.g
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.g = r3
            r14.getClass()
            java.lang.Object r14 = ads_mobile_sdk.m72.a(r14, r0)
            if (r14 != r4) goto L3a
            goto L72
        L55:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
            if (r11 == 0) goto L74
            dev.epro.r0.Y14712737278372885690 r5 = new dev.epro.r0.Y14712737278372885690
            r10 = 3
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.a = r9
            r0.b = r9
            r0.c = r9
            r0.g = r2
            java.lang.Object r11 = r6.a$1(r5, r0)
            if (r11 != r4) goto L73
        L72:
            return r4
        L73:
            return r11
        L74:
            dev.epro.r0.O9245300239821758723 r11 = dev.epro.r0.O9245300239821758723.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.a(ads_mobile_sdk.w62, android.view.ViewGroup, ads_mobile_sdk.xr0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.jy0 r7, dev.epro.r0.K14749510448791472029 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.k62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.k62 r0 = (ads_mobile_sdk.k62) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.k62 r0 = new ads_mobile_sdk.k62
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
            goto L72
        L2f:
            r7 = move-exception
            goto L78
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r6 = r0.c
            ads_mobile_sdk.jy0 r7 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w62 r1 = (ads_mobile_sdk.w62) r1
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r6
            r6 = r1
            goto L59
        L45:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            r0.b = r7
            dev.epro.r0.H15186625828076266306 r8 = r6.h
            r0.c = r8
            r0.f = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L59
            goto L70
        L59:
            java.lang.Object r1 = r6.b     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.G8001132634698687269 r1 = (dev.epro.r0.G8001132634698687269) r1     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.S14769385926647291222 r3 = new dev.epro.r0.S14769385926647291222     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L7a
            r0.a = r8     // Catch: java.lang.Throwable -> L7a
            r0.b = r4     // Catch: java.lang.Throwable -> L7a
            r0.c = r4     // Catch: java.lang.Throwable -> L7a
            r0.f = r2     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = dev.epro.r0.R7033599853981556291.d0(r1, r3, r0)     // Catch: java.lang.Throwable -> L7a
            if (r6 != r5) goto L71
        L70:
            return r5
        L71:
            r6 = r8
        L72:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r6.b(r4)
            return r7
        L78:
            r8 = r6
            goto L7c
        L7a:
            r6 = move-exception
            r7 = r6
        L7c:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.a(ads_mobile_sdk.jy0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(mq3 mq3Var) {
        return a(this, mq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.w62 r8, dev.epro.r0.K14749510448791472029 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.m62
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.m62 r0 = (ads_mobile_sdk.m62) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.m62 r0 = new ads_mobile_sdk.m62
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r8 = r0.a
            dev.epro.r0.R8015591507171738907 r8 = (dev.epro.r0.R8015591507171738907) r8
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6d
        L2f:
            r9 = move-exception
            goto L77
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r4
        L37:
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            java.lang.Object r1 = r0.a
            ads_mobile_sdk.w62 r1 = (ads_mobile_sdk.w62) r1
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r8
            r8 = r1
            goto L55
        L43:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.H15186625828076266306 r9 = r8.h
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L55
            goto L6b
        L55:
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L73
            dev.epro.r0.G8001132634698687269 r1 = (dev.epro.r0.G8001132634698687269) r1     // Catch: java.lang.Throwable -> L73
            dev.epro.r0.I15284427961769500538 r3 = new dev.epro.r0.I15284427961769500538     // Catch: java.lang.Throwable -> L73
            r6 = 6
            r3.<init>(r8, r4, r6)     // Catch: java.lang.Throwable -> L73
            r0.a = r9     // Catch: java.lang.Throwable -> L73
            r0.b = r4     // Catch: java.lang.Throwable -> L73
            r0.e = r2     // Catch: java.lang.Throwable -> L73
            java.lang.Object r8 = dev.epro.r0.R7033599853981556291.d0(r1, r3, r0)     // Catch: java.lang.Throwable -> L73
            if (r8 != r5) goto L6c
        L6b:
            return r5
        L6c:
            r8 = r9
        L6d:
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r8.b(r4)
            return r9
        L73:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L77:
            r8.b(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w62.a(ads_mobile_sdk.w62, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(View view, R4833348786910499294 r4833348786910499294) {
        return a(this, view, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.Z5089078543653785389
    public final Object a(View view, xr0 xr0Var, R14062301455140331524 r14062301455140331524) {
        return a(this, (ViewGroup) view, xr0Var, r14062301455140331524);
    }
}
