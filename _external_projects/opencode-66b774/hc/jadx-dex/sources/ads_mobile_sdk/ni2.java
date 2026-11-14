package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ni2 implements dev.epro.r0.E1738554508920355622 {
    public final ads_mobile_sdk.fl2 a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.qw2 c;
    public final ads_mobile_sdk.jr0 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final dev.epro.r0.H15186625828076266306 f;
    public dev.epro.r0.X7175349259954592591 g;
    public final boolean h;

    public ni2(ads_mobile_sdk.fl2 fl2Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.kz2 kz2Var) {
        fl2Var.getClass();
        w5797197595347441198.getClass();
        qw2Var.getClass();
        jr0Var.getClass();
        kz2Var.getClass();
        this.a = fl2Var;
        this.b = w5797197595347441198;
        this.c = qw2Var;
        this.d = jr0Var;
        boolean z = false;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new dev.epro.r0.H15186625828076266306();
        if (((java.lang.Boolean) jr0Var.a("gads:ad_close_listener:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue() && dev.epro.r0.O5378677881740157249.V0(new ads_mobile_sdk.qw2[]{ads_mobile_sdk.qw2.h, ads_mobile_sdk.qw2.j, ads_mobile_sdk.qw2.k, ads_mobile_sdk.qw2.e}).contains(qw2Var)) {
            z = true;
        }
        this.h = z;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final dev.epro.r0.O9245300239821758723 e() {
        long j;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a;
        boolean z = this.h;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (!z) {
            return o9245300239821758723;
        }
        int iOrdinal = this.c.ordinal();
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.f;
        ads_mobile_sdk.jr0 jr0Var = this.d;
        if (iOrdinal == 1) {
            jr0Var.getClass();
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            j = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:app_open_ad_close_timeout", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3, n13798149404328803870)), aoVar)).a;
        } else if (iOrdinal == 4) {
            jr0Var.getClass();
            dev.epro.r0.E17149812035295265804 e171498120352952658042 = dev.epro.r0.E17093345031926825464.b;
            j = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:interstitial_ad_close_timeout", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3, n13798149404328803870)), aoVar)).a;
        } else if (iOrdinal == 6) {
            jr0Var.getClass();
            dev.epro.r0.E17149812035295265804 e171498120352952658043 = dev.epro.r0.E17093345031926825464.b;
            j = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:rewarded_ad_close_timeout", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3, n13798149404328803870)), aoVar)).a;
        } else if (iOrdinal != 7) {
            dev.epro.r0.E17149812035295265804 e171498120352952658044 = dev.epro.r0.E17093345031926825464.b;
            j = 0;
        } else {
            jr0Var.getClass();
            dev.epro.r0.E17149812035295265804 e171498120352952658045 = dev.epro.r0.E17093345031926825464.b;
            j = ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:rewarded_interstitial_ad_close_timeout", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(3, n13798149404328803870)), aoVar)).a;
        }
        if (j > 0) {
            ads_mobile_sdk.mi2 mi2Var = new ads_mobile_sdk.mi2(j, this, null);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(mi2Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return o9245300239821758723;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.E1738554508920355622
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.R4833348786910499294 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ji2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ji2 r0 = (ads_mobile_sdk.ji2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.ji2 r0 = new ads_mobile_sdk.ji2
            dev.epro.r0.K14749510448791472029 r6 = (dev.epro.r0.K14749510448791472029) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            dev.epro.r0.H15186625828076266306 r5 = r0.b
            ads_mobile_sdk.ni2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r6 = r5
            r5 = r0
            goto L58
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r4
        L36:
            dev.epro.r0.E17665849472693074628.k(r6)
            boolean r6 = r5.h
            if (r6 != 0) goto L3e
            goto L83
        L3e:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.e
            r1 = 0
            boolean r6 = r6.compareAndSet(r1, r3)
            if (r6 == 0) goto L83
            r0.a = r5
            dev.epro.r0.H15186625828076266306 r6 = r5.f
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L58
            return r1
        L58:
            dev.epro.r0.X7175349259954592591 r0 = r5.g     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L62
            r0.c(r4)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r5 = move-exception
            goto L7f
        L62:
            r5.g = r4     // Catch: java.lang.Throwable -> L60
            r6.b(r4)
            dev.epro.r0.W5797197595347441198 r6 = r5.b
            dev.epro.r0.N4024785987441166868 r0 = new dev.epro.r0.N4024785987441166868
            r1 = 15
            r0.<init>(r5, r4, r1)
            r6.getClass()
            dev.epro.r0.P7598478828797568949 r5 = new dev.epro.r0.P7598478828797568949
            r5.<init>(r0, r4, r3)
            r0 = 2
            dev.epro.r0.I3826119971291161142 r1 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r6, r1, r4, r5, r0)
            return r2
        L7f:
            r6.b(r4)
            throw r5
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ni2.g(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
