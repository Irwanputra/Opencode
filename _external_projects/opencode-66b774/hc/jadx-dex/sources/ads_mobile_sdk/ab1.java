package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ab1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.fb1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab1(ads_mobile_sdk.fb1 fb1Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = fb1Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.fb1 fb1Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ab1(fb1Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.ab1(fb1Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.fb1 fb1Var = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.ab1(fb1Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.ab1(fb1Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = 3;
        switch (this.t) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.qa1 qa1Var = this.a.h.b;
                if (qa1Var != null) {
                    qa1Var.a = (byte) 3;
                    ads_mobile_sdk.pa1 pa1Var = qa1Var.e;
                    if (pa1Var != null) {
                        qa1Var.b.unbindService(pa1Var);
                        qa1Var.e = null;
                    }
                    qa1Var.d = null;
                }
                return dev.epro.r0.O9245300239821758723.a;
            default:
                dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.fb1 fb1Var = this.a;
                ads_mobile_sdk.kz2 kz2Var = fb1Var.g;
                ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_INSTALL_REFERRER_TASK;
                dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
                ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                if (ads_mobile_sdk.ji3.b().a == null) {
                    ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        fb1Var.h.a(new ads_mobile_sdk.c7(fb1Var, b));
                        em2VarA.close();
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
                } else {
                    ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        fb1Var.h.a(new ads_mobile_sdk.c7(fb1Var, b));
                        th3VarA.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            th3VarA.b(th2);
                            if (th2 instanceof dev.epro.r0.N340633841638932414) {
                                throw th2;
                            }
                            if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                                th3VarA.a(th2);
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
                return o9245300239821758723;
        }
    }
}
