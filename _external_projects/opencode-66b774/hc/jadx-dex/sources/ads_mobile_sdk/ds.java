package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ds extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.hs b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds(ads_mobile_sdk.hs hsVar, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = hsVar;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.hs hsVar = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ds(hsVar, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.ds(hsVar, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.hs hsVar = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ds(hsVar, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.ds(hsVar, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:24:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.t
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            ads_mobile_sdk.hs r2 = r8.b
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            r6 = 1
            switch(r0) {
                case 0: goto L2e;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r8.a
            if (r0 == 0) goto L1e
            if (r0 != r6) goto L19
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L2d
        L19:
            dev.epro.r0.S10973172697741180971.m(r4)
            r1 = r3
            goto L2d
        L1e:
            dev.epro.r0.E17665849472693074628.k(r9)
            r8.a = r6
            r2.getClass()
            java.lang.Object r8 = ads_mobile_sdk.hs.a(r2, r8)
            if (r8 != r5) goto L2d
            r1 = r5
        L2d:
            return r1
        L2e:
            ads_mobile_sdk.jr0 r0 = r2.f
            boolean r7 = r8.a
            if (r7 == 0) goto L3f
            if (r7 != r6) goto L3a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L7f
        L3a:
            dev.epro.r0.S10973172697741180971.m(r4)
            r1 = r3
            goto L83
        L3f:
            dev.epro.r0.E17665849472693074628.k(r9)
        L42:
            r0.getClass()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r3 = ads_mobile_sdk.ao.a$11
            java.lang.String r4 = "gads:chrome_variations_refresh_enabled"
            java.lang.Object r9 = r0.a(r4, r9, r3)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L83
            r0.getClass()
            dev.epro.r0.E17149812035295265804 r9 = dev.epro.r0.E17093345031926825464.b
            r9 = 30
            dev.epro.r0.N13798149404328803870 r3 = dev.epro.r0.N13798149404328803870.f
            long r3 = dev.epro.r0.M9216324016624295870.Z(r9, r3)
            dev.epro.r0.E17093345031926825464 r9 = new dev.epro.r0.E17093345031926825464
            r9.<init>(r3)
            ads_mobile_sdk.ao r3 = ads_mobile_sdk.ao.a$1
            java.lang.String r4 = "gads:chrome_variations_refresh_interval_min"
            java.lang.Object r9 = r0.a(r4, r9, r3)
            dev.epro.r0.E17093345031926825464 r9 = (dev.epro.r0.E17093345031926825464) r9
            long r3 = r9.a
            r8.a = r6
            java.lang.Object r9 = dev.epro.r0.J8045362843799184672.J(r3, r8)
            if (r9 != r5) goto L7f
            r1 = r5
            goto L83
        L7f:
            ads_mobile_sdk.hs.a(r2)
            goto L42
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ds.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
