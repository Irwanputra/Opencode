package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import dev.epro.r0.A5459349068949265291;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U2595023890546017274;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z5089078543653785389;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pk3 extends kt0 {
    public static final /* synthetic */ int Y = 0;
    public final x60 Q;
    public final mi3 R;
    public final sp3 S;
    public final A5459349068949265291 T;
    public final kz2 U;
    public tx0 V;
    public boolean W;
    public String X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk3(Context context, W5797197595347441198 w5797197595347441198, G8001132634698687269 g8001132634698687269, W5797197595347441198 w57971975953474411982, jr0 jr0Var, ci3 ci3Var, String str, qw2 qw2Var, z1 z1Var, g0 g0Var, y2 y2Var, Z5089078543653785389 z5089078543653785389, rw0 rw0Var, x60 x60Var, mi3 mi3Var, sp3 sp3Var, A5459349068949265291 a5459349068949265291, U2595023890546017274 u2595023890546017274, kz2 kz2Var) {
        super(context, w5797197595347441198, g8001132634698687269, w57971975953474411982, jr0Var, ci3Var, str, qw2Var, z1Var, g0Var, y2Var, z5089078543653785389, rw0Var, u2595023890546017274);
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        str.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        g0Var.getClass();
        y2Var.getClass();
        z5089078543653785389.getClass();
        rw0Var.getClass();
        x60Var.getClass();
        mi3Var.getClass();
        sp3Var.getClass();
        a5459349068949265291.getClass();
        u2595023890546017274.getClass();
        kz2Var.getClass();
        this.Q = x60Var;
        this.R = mi3Var;
        this.S = sp3Var;
        this.T = a5459349068949265291;
        this.U = kz2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r6.a(r7, (dev.epro.r0.K14749510448791472029) r0) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r7 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.pk3 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.gk3
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.gk3 r0 = (ads_mobile_sdk.gk3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.gk3 r0 = new ads_mobile_sdk.gk3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.pk3 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L45
        L37:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = ads_mobile_sdk.kt0.b(r6, r0)
            if (r7 != r5) goto L45
            goto L5b
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L62
            ads_mobile_sdk.tx0 r7 = r6.V
            if (r7 == 0) goto L5c
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r5) goto L63
        L5b:
            return r5
        L5c:
            java.lang.String r6 = "previousWebView"
            dev.epro.r0.S10823041268949770285.b0(r6)
            throw r2
        L62:
            r4 = 0
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pk3.b(ads_mobile_sdk.pk3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0155 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:102:0x014e, B:104:0x0155, B:106:0x0159, B:108:0x015d, B:109:0x0164, B:111:0x0168, B:113:0x016c, B:115:0x0170, B:116:0x0171, B:117:0x0176, B:118:0x0177, B:119:0x017e, B:120:0x017f, B:121:0x0186, B:122:0x0187), top: B:101:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0187 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #1 {all -> 0x0161, blocks: (B:102:0x014e, B:104:0x0155, B:106:0x0159, B:108:0x015d, B:109:0x0164, B:111:0x0168, B:113:0x016c, B:115:0x0170, B:116:0x0171, B:117:0x0176, B:118:0x0177, B:119:0x017e, B:120:0x017f, B:121:0x0186, B:122:0x0187), top: B:101:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01db A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #6 {all -> 0x01e6, blocks: (B:26:0x01d7, B:28:0x01db, B:31:0x01e8, B:33:0x01ec), top: B:25:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e8 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #6 {all -> 0x01e6, blocks: (B:26:0x01d7, B:28:0x01db, B:31:0x01e8, B:33:0x01ec), top: B:25:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0224 A[Catch: all -> 0x0230, TryCatch #0 {all -> 0x0230, blocks: (B:41:0x021d, B:43:0x0224, B:45:0x0228, B:47:0x022c, B:48:0x0233, B:50:0x0237, B:52:0x023b, B:54:0x023f, B:55:0x0240, B:56:0x0245, B:57:0x0246, B:58:0x024d, B:59:0x024e, B:60:0x0255, B:61:0x0256), top: B:40:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0256 A[Catch: all -> 0x0230, TRY_LEAVE, TryCatch #0 {all -> 0x0230, blocks: (B:41:0x021d, B:43:0x0224, B:45:0x0228, B:47:0x022c, B:48:0x0233, B:50:0x0237, B:52:0x023b, B:54:0x023f, B:55:0x0240, B:56:0x0245, B:57:0x0246, B:58:0x024d, B:59:0x024e, B:60:0x0255, B:61:0x0256), top: B:40:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #4 {all -> 0x0115, blocks: (B:88:0x0106, B:90:0x010a, B:93:0x0117, B:95:0x011b), top: B:87:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117 A[Catch: all -> 0x0115, TRY_ENTER, TryCatch #4 {all -> 0x0115, blocks: (B:88:0x0106, B:90:0x010a, B:93:0x0117, B:95:0x011b), top: B:87:0x0106 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.tx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v43, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pk3.a(ads_mobile_sdk.tx0, java.lang.String, java.lang.String, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final Object c(R14062301455140331524 r14062301455140331524) {
        return b(this, (K14749510448791472029) r14062301455140331524);
    }

    @Override // ads_mobile_sdk.kt0, ads_mobile_sdk.et0
    public final Object b(K14749510448791472029 k14749510448791472029) {
        return a(this, k14749510448791472029);
    }

    @Override // ads_mobile_sdk.et0
    public final Toolbar a(RelativeLayout relativeLayout) {
        return a(relativeLayout, this.X);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r6.a(r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (ads_mobile_sdk.kt0.a((ads_mobile_sdk.kt0) r6, (dev.epro.r0.K14749510448791472029) r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pk3 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.fk3
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.fk3 r0 = (ads_mobile_sdk.fk3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.fk3 r0 = new ads_mobile_sdk.fk3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.pk3 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L45
        L37:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = ads_mobile_sdk.kt0.a(r6, r0)
            if (r7 != r5) goto L45
            goto L57
        L45:
            dev.epro.r0.O12494175665883759871 r6 = r6.H
            java.lang.Object r6 = r6.getValue()
            ads_mobile_sdk.tx0 r6 = (ads_mobile_sdk.tx0) r6
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pk3.a(ads_mobile_sdk.pk3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.kt0, ads_mobile_sdk.cs0, ads_mobile_sdk.et0
    public final Object a(View view, R4833348786910499294 r4833348786910499294) {
        return a(this, (RelativeLayout) view, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r8, r9, r0) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r8.a(r0) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (ads_mobile_sdk.kt0.a(r7, r8, r0) == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.pk3 r7, android.widget.RelativeLayout r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.jk3
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.jk3 r0 = (ads_mobile_sdk.jk3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.jk3 r0 = new ads_mobile_sdk.jk3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L92
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r5
        L34:
            ads_mobile_sdk.pk3 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L6b
        L3a:
            ads_mobile_sdk.pk3 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L4e
        L40:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = ads_mobile_sdk.kt0.a(r7, r8, r0)
            if (r8 != r6) goto L4e
            goto L91
        L4e:
            boolean r8 = r7.W
            if (r8 == 0) goto L6b
            ads_mobile_sdk.tx0 r8 = r7.V
            if (r8 == 0) goto L65
            ads_mobile_sdk.et0 r8 = r8.f113o
            if (r8 == 0) goto L6b
            r0.a = r7
            r0.d = r3
            dev.epro.r0.O9245300239821758723 r8 = r8.a(r0)
            if (r8 != r6) goto L6b
            goto L91
        L65:
            java.lang.String r7 = "previousWebView"
            dev.epro.r0.S10823041268949770285.b0(r7)
            throw r5
        L6b:
            dev.epro.r0.W5797197595347441198 r8 = r7.d
            ads_mobile_sdk.kk3 r9 = new ads_mobile_sdk.kk3
            r1 = 0
            r9.<init>(r7, r5, r1)
            r8.getClass()
            dev.epro.r0.P7598478828797568949 r1 = new dev.epro.r0.P7598478828797568949
            r1.<init>(r9, r5, r4)
            dev.epro.r0.I3826119971291161142 r9 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r8, r9, r5, r1, r3)
            dev.epro.r0.G8001132634698687269 r8 = r7.c
            ads_mobile_sdk.kk3 r9 = new ads_mobile_sdk.kk3
            r9.<init>(r7, r5, r4)
            r0.a = r5
            r0.d = r2
            java.lang.Object r7 = dev.epro.r0.R7033599853981556291.d0(r8, r9, r0)
            if (r7 != r6) goto L92
        L91:
            return r6
        L92:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pk3.a(ads_mobile_sdk.pk3, android.widget.RelativeLayout, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r29, int r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, ads_mobile_sdk.tx0 r35, boolean r36, boolean r37, dev.epro.r0.K14749510448791472029 r38) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pk3.a(boolean, int, boolean, java.lang.String, java.lang.String, java.lang.String, ads_mobile_sdk.tx0, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
