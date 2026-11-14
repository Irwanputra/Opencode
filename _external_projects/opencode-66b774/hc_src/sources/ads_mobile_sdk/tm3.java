package ads_mobile_sdk;

import dev.epro.r0.Y4798753258822141670;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class tm3 implements Y4798753258822141670 {
    public final fz a;
    public final ci3 b;

    public tm3(fz fzVar, ci3 ci3Var) {
        fzVar.getClass();
        ci3Var.getClass();
        this.a = fzVar;
        this.b = ci3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // dev.epro.r0.Y4798753258822141670
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r6, java.util.Map r7, dev.epro.r0.R4833348786910499294 r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof ads_mobile_sdk.sm3
            if (r6 == 0) goto L13
            r6 = r8
            ads_mobile_sdk.sm3 r6 = (ads_mobile_sdk.sm3) r6
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.d = r0
            goto L18
        L13:
            ads_mobile_sdk.sm3 r6 = new ads_mobile_sdk.sm3
            r6.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r6.b
            int r0 = r6.d
            r1 = 0
            r2 = 0
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L2d
            ads_mobile_sdk.tm3 r5 = r6.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: ads_mobile_sdk.yi1 -> L2b
            return r3
        L2b:
            r6 = move-exception
            goto L70
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L33:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.lang.String r8 = "allowlist"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Allowlist is missing from an updateAllowlist GMSG: "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6 = 6
            ads_mobile_sdk.zi3.a(r6, r5, r2)
            return r3
        L53:
            dev.epro.r0.P12817159812099202599 r7 = dev.epro.r0.W1349480363743553773.e     // Catch: java.lang.IllegalArgumentException -> L7b
            byte[] r7 = r7.a(r8)     // Catch: java.lang.IllegalArgumentException -> L7b
            ads_mobile_sdk.fz r8 = r5.a     // Catch: ads_mobile_sdk.yi1 -> L2b
            ads_mobile_sdk.ax r7 = ads_mobile_sdk.ax.a(r7)     // Catch: ads_mobile_sdk.yi1 -> L2b
            r7.getClass()     // Catch: ads_mobile_sdk.yi1 -> L2b
            r6.a = r5     // Catch: ads_mobile_sdk.yi1 -> L2b
            r6.d = r4     // Catch: ads_mobile_sdk.yi1 -> L2b
            java.lang.Object r5 = r8.b(r7, r6)     // Catch: ads_mobile_sdk.yi1 -> L2b
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r6) goto L6f
            return r6
        L6f:
            return r3
        L70:
            ads_mobile_sdk.zi3.a(r4, r2, r6, r1)
            ads_mobile_sdk.ci3 r5 = r5.b
            java.lang.String r7 = "Allowlist proto deserialization failed."
            r5.a(r7, r6)
            return r3
        L7b:
            r6 = move-exception
            ads_mobile_sdk.zi3.a(r4, r2, r6, r1)
            ads_mobile_sdk.ci3 r5 = r5.b
            java.lang.String r7 = "Allowlist gmsg param is not a valid encoded string."
            r5.a(r7, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tm3.a(ads_mobile_sdk.tx0, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 12;
    }
}
