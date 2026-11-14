package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mg2 implements dev.epro.r0.E1738554508920355622 {
    public final ads_mobile_sdk.z1 a;
    public final ads_mobile_sdk.rg2 b;
    public final ads_mobile_sdk.jr0 c;
    public final ads_mobile_sdk.kz2 d;
    public final ads_mobile_sdk.j01 e;
    public final ads_mobile_sdk.ci3 f;
    public final dev.epro.r0.W5797197595347441198 g;
    public final ads_mobile_sdk.g0 h;

    public mg2(android.content.Context context, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.rg2 rg2Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.j01 j01Var, ads_mobile_sdk.ci3 ci3Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.g0 g0Var) {
        context.getClass();
        z1Var.getClass();
        rg2Var.getClass();
        jr0Var.getClass();
        kz2Var.getClass();
        j01Var.getClass();
        ci3Var.getClass();
        w5797197595347441198.getClass();
        g0Var.getClass();
        this.a = z1Var;
        this.b = rg2Var;
        this.c = jr0Var;
        this.d = kz2Var;
        this.e = j01Var;
        this.f = ci3Var;
        this.g = w5797197595347441198;
        this.h = g0Var;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.cc2 cc2VarE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.ug2 ug2Var = this.a.v0;
        if (ug2Var != null) {
            java.lang.String str = ug2Var.e;
            if (a()) {
                ads_mobile_sdk.jr0 jr0Var = this.c;
                jr0Var.getClass();
                if (((java.lang.Boolean) jr0Var.a("gads:hsdp_service_end_session:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue() && str.length() > 0) {
                    ads_mobile_sdk.kz2 kz2Var = this.d;
                    ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_HSDP_SERVICE;
                    dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
                    ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                    java.lang.String str2 = "";
                    if (ads_mobile_sdk.ji3.b().a == null) {
                        ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                        try {
                            try {
                                ads_mobile_sdk.th3 th3Var = ads_mobile_sdk.ji3.b().a;
                                ads_mobile_sdk.cc2 cc2VarE2 = th3Var != null ? th3Var.e() : null;
                                if (cc2VarE2 != null) {
                                    dev.epro.r0.W17652710899820817444 w17652710899820817444O = ads_mobile_sdk.n01.o();
                                    w17652710899820817444O.c(5);
                                    cc2VarE2.I = (ads_mobile_sdk.n01) w17652710899820817444O.a();
                                }
                                this.e.a(str);
                            } catch (java.lang.Throwable th) {
                                try {
                                    em2VarA.b(th);
                                    if (th instanceof dev.epro.r0.N340633841638932414) {
                                        throw th;
                                    }
                                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                                        em2VarA.a(th);
                                    }
                                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                                    }
                                    if (th instanceof java.util.concurrent.CancellationException) {
                                        throw new ads_mobile_sdk.du0(th);
                                    }
                                    if (th instanceof ads_mobile_sdk.dv0) {
                                        throw th;
                                    }
                                    throw new ads_mobile_sdk.iu0(th);
                                } finally {
                                }
                            }
                        } catch (java.lang.Exception e) {
                            ads_mobile_sdk.th3 th3Var2 = ads_mobile_sdk.ji3.b().a;
                            cc2VarE = th3Var2 != null ? th3Var2.e() : null;
                            if (cc2VarE != null) {
                                dev.epro.r0.W17652710899820817444 w17652710899820817444O2 = ads_mobile_sdk.n01.o();
                                w17652710899820817444O2.c(5);
                                java.lang.String message = e.getMessage();
                                if (message != null) {
                                    str2 = message;
                                }
                                w17652710899820817444O2.b();
                                ((ads_mobile_sdk.n01) w17652710899820817444O2.b).b(str2);
                                cc2VarE.I = (ads_mobile_sdk.n01) w17652710899820817444O2.a();
                            }
                            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a();
                            th3VarA.e().m = false;
                            th3VarA.a(e);
                            ads_mobile_sdk.jr0 jr0Var2 = this.c;
                            jr0Var2.getClass();
                            boolean zBooleanValue = ((java.lang.Boolean) jr0Var2.a("gads:hsdp_unsampled_crash_reporting:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue();
                            ads_mobile_sdk.ci3 ci3Var = this.f;
                            if (zBooleanValue) {
                                ci3Var.a("HsdpServiceUnsampled.endSession", e);
                            } else {
                                ci3Var.a("HsdpService.endSession", (java.lang.Throwable) e);
                            }
                        }
                        em2VarA.close();
                    } else {
                        ads_mobile_sdk.th3 th3VarA2 = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
                        try {
                            try {
                                ads_mobile_sdk.th3 th3Var3 = ads_mobile_sdk.ji3.b().a;
                                ads_mobile_sdk.cc2 cc2VarE3 = th3Var3 != null ? th3Var3.e() : null;
                                if (cc2VarE3 != null) {
                                    dev.epro.r0.W17652710899820817444 w17652710899820817444O3 = ads_mobile_sdk.n01.o();
                                    w17652710899820817444O3.c(5);
                                    cc2VarE3.I = (ads_mobile_sdk.n01) w17652710899820817444O3.a();
                                }
                                this.e.a(str);
                            } catch (java.lang.Exception e2) {
                                ads_mobile_sdk.th3 th3Var4 = ads_mobile_sdk.ji3.b().a;
                                cc2VarE = th3Var4 != null ? th3Var4.e() : null;
                                if (cc2VarE != null) {
                                    dev.epro.r0.W17652710899820817444 w17652710899820817444O4 = ads_mobile_sdk.n01.o();
                                    w17652710899820817444O4.c(5);
                                    java.lang.String message2 = e2.getMessage();
                                    if (message2 != null) {
                                        str2 = message2;
                                    }
                                    w17652710899820817444O4.b();
                                    ((ads_mobile_sdk.n01) w17652710899820817444O4.b).b(str2);
                                    cc2VarE.I = (ads_mobile_sdk.n01) w17652710899820817444O4.a();
                                }
                                ads_mobile_sdk.th3 th3VarA3 = ads_mobile_sdk.ji3.a();
                                th3VarA3.e().m = false;
                                th3VarA3.a(e2);
                                ads_mobile_sdk.jr0 jr0Var3 = this.c;
                                jr0Var3.getClass();
                                boolean zBooleanValue2 = ((java.lang.Boolean) jr0Var3.a("gads:hsdp_unsampled_crash_reporting:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue();
                                ads_mobile_sdk.ci3 ci3Var2 = this.f;
                                if (zBooleanValue2) {
                                    ci3Var2.a("HsdpServiceUnsampled.endSession", e2);
                                } else {
                                    ci3Var2.a("HsdpService.endSession", (java.lang.Throwable) e2);
                                }
                            }
                            th3VarA2.close();
                        } catch (java.lang.Throwable th2) {
                            try {
                                th3VarA2.b(th2);
                                if (th2 instanceof dev.epro.r0.N340633841638932414) {
                                    throw th2;
                                }
                                if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                                    th3VarA2.a(th2);
                                }
                                if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                                    throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                                }
                                if (th2 instanceof java.util.concurrent.CancellationException) {
                                    throw new ads_mobile_sdk.du0(th2);
                                }
                                if (th2 instanceof ads_mobile_sdk.dv0) {
                                    throw th2;
                                }
                                throw new ads_mobile_sdk.iu0(th2);
                            } finally {
                            }
                        }
                    }
                }
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object i(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.ug2 ug2Var = this.a.v0;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (ug2Var != null) {
            boolean zA = a();
            byte b = 2;
            dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
            dev.epro.r0.R4833348786910499294 r48333487869104992942 = null;
            if (!zA) {
                ads_mobile_sdk.jr0 jr0Var = this.c;
                jr0Var.getClass();
                if (((java.lang.Boolean) jr0Var.a("gads:play_prewarm:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() && ug2Var.a) {
                    java.lang.String str = ug2Var.b;
                    ads_mobile_sdk.rg2 rg2Var = this.b;
                    dev.epro.r0.W5797197595347441198 w5797197595347441198 = rg2Var.a;
                    dev.epro.r0.X14700554270388218583 x14700554270388218583 = new dev.epro.r0.X14700554270388218583(rg2Var, str, (dev.epro.r0.R4833348786910499294) null);
                    w5797197595347441198.getClass();
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(x14700554270388218583, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                }
            } else if (a(1)) {
                dev.epro.r0.B9486205464174482320 b9486205464174482320 = new dev.epro.r0.B9486205464174482320(this, a(2), r48333487869104992942, b);
                dev.epro.r0.W5797197595347441198 w57971975953474411982 = this.g;
                w57971975953474411982.getClass();
                dev.epro.r0.R7033599853981556291.E(w57971975953474411982, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(b9486205464174482320, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                return o9245300239821758723;
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.ug2 ug2Var = this.a.v0;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (ug2Var != null) {
            boolean zA = a();
            byte b = 1;
            dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
            dev.epro.r0.R4833348786910499294 r48333487869104992942 = null;
            if (zA) {
                if (a(4)) {
                    dev.epro.r0.B9486205464174482320 b9486205464174482320 = new dev.epro.r0.B9486205464174482320(this, a(8), r48333487869104992942, b);
                    dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.g;
                    w5797197595347441198.getClass();
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(b9486205464174482320, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                    return o9245300239821758723;
                }
            } else if (a(256)) {
                java.lang.String str = a(512) ? ug2Var.b : "";
                ads_mobile_sdk.rg2 rg2Var = this.b;
                dev.epro.r0.W5797197595347441198 w57971975953474411982 = rg2Var.a;
                dev.epro.r0.X14700554270388218583 x14700554270388218583 = new dev.epro.r0.X14700554270388218583(rg2Var, str, (dev.epro.r0.R4833348786910499294) null);
                w57971975953474411982.getClass();
                dev.epro.r0.R7033599853981556291.E(w57971975953474411982, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(x14700554270388218583, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
        }
        return o9245300239821758723;
    }

    public final boolean a(int i) {
        ads_mobile_sdk.ug2 ug2Var = this.a.v0;
        return ((ug2Var != null ? ug2Var.f : 0) & i) != 0;
    }

    public final boolean a() {
        ads_mobile_sdk.ug2 ug2Var;
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        return ((java.lang.Boolean) jr0Var.a("gads:hsdp_service:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue() && (ug2Var = this.a.v0) != null && ug2Var.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.mg2 r12, boolean r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mg2.a(ads_mobile_sdk.mg2, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
