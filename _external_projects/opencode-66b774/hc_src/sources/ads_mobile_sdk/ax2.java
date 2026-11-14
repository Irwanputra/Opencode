package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.Y4798753258822141670;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ax2 implements Y4798753258822141670 {
    public final H15186625828076266306 a = new H15186625828076266306();
    public final HashMap b = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // dev.epro.r0.Y4798753258822141670
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r7, java.util.Map r8, dev.epro.r0.R4833348786910499294 r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ax2.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.I16631908410500040363 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.yw2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.yw2 r0 = (ads_mobile_sdk.yw2) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ads_mobile_sdk.yw2 r0 = new ads_mobile_sdk.yw2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L39
            dev.epro.r0.H15186625828076266306 r7 = r0.f
            dev.epro.r0.I16631908410500040363 r8 = r0.e
            java.lang.String r1 = r0.d
            java.lang.String r2 = r0.c
            dev.epro.r0.I16631908410500040363 r5 = r0.b
            ads_mobile_sdk.ax2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r6 = r5
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r0
            goto L72
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L3f:
            dev.epro.r0.E17665849472693074628.k(r9)
            java.lang.String r9 = "id"
            java.lang.String r9 = ads_mobile_sdk.d62.a(r8, r9, r3)
            java.lang.String r1 = "fail"
            java.lang.String r1 = ads_mobile_sdk.d62.a(r8, r1, r3)
            java.lang.String r5 = "result"
            if (r8 != 0) goto L54
        L52:
            r5 = r4
            goto L58
        L54:
            dev.epro.r0.I16631908410500040363 r5 = r8.y(r5)     // Catch: java.lang.Exception -> L52
        L58:
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.d = r1
            r0.e = r5
            dev.epro.r0.H15186625828076266306 r6 = r7.a
            r0.f = r6
            r0.i = r2
            java.lang.Object r0 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r2) goto L71
            return r2
        L71:
            r2 = r9
        L72:
            java.util.HashMap r7 = r7.b     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r7 = r7.remove(r2)     // Catch: java.lang.Throwable -> Lcc
            dev.epro.r0.H5998176783492007232 r7 = (dev.epro.r0.H5998176783492007232) r7     // Catch: java.lang.Throwable -> Lcc
            r6.b(r4)
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a
            if (r7 != 0) goto L82
            return r9
        L82:
            java.lang.String r0 = "fail_stack"
            java.lang.String r0 = ads_mobile_sdk.d62.a(r8, r0, r3)
            java.lang.String r2 = "fail_reason"
            java.lang.String r8 = ads_mobile_sdk.d62.a(r8, r2, r3)
            int r2 = r0.length()
            if (r2 != 0) goto L96
            java.lang.String r8 = "Unknown Fail Reason."
        L96:
            int r2 = r0.length()
            if (r2 != 0) goto L9d
            goto La1
        L9d:
            java.lang.String r3 = dev.epro.r0.G5759126466240281083.t(r0)
        La1:
            int r0 = r1.length()
            if (r0 <= 0) goto Lbe
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = r8.concat(r3)
            r0.<init>(r1)
            dev.epro.r0.U4020053660465689583 r7 = (dev.epro.r0.U4020053660465689583) r7
            r7.A(r0)
            java.lang.String r7 = r8.concat(r3)
            r8 = 6
            ads_mobile_sdk.zi3.a(r8, r7, r4)
            return r9
        Lbe:
            if (r5 != 0) goto Lc6
            dev.epro.r0.A18119328133183277592 r7 = (dev.epro.r0.A18119328133183277592) r7
            r7.S(r4)
            return r9
        Lc6:
            dev.epro.r0.A18119328133183277592 r7 = (dev.epro.r0.A18119328133183277592) r7
            r7.S(r5)
            return r9
        Lcc:
            r7 = move-exception
            r6.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ax2.a(dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, dev.epro.r0.H5998176783492007232 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.zw2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.zw2 r0 = (ads_mobile_sdk.zw2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.zw2 r0 = new ads_mobile_sdk.zw2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.H15186625828076266306 r4 = r0.d
            dev.epro.r0.H5998176783492007232 r6 = r0.c
            java.lang.String r5 = r0.b
            ads_mobile_sdk.ax2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r4
            r4 = r0
            goto L4e
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r4
            r0.b = r5
            r0.c = r6
            dev.epro.r0.H15186625828076266306 r7 = r4.a
            r0.d = r7
            r0.g = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.HashMap r4 = r4.b     // Catch: java.lang.Throwable -> L59
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L59
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L59
            r7.b(r3)
            return r4
        L59:
            r4 = move-exception
            r7.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ax2.a(java.lang.String, dev.epro.r0.H5998176783492007232, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
