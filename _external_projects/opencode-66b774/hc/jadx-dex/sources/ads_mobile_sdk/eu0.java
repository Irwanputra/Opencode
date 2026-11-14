package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class eu0 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu0(java.lang.Object obj, java.lang.Object obj2, byte b) {
        super(0);
        this.i = b;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        byte b = this.i;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.hb1 hb1Var = dev.epro.r0.U10597134596418829392.a;
                android.app.Application application = (android.app.Application) obj;
                return new ads_mobile_sdk.db0(application, application, new java.lang.ref.WeakReference((android.content.Context) obj2));
            case 1:
                ads_mobile_sdk.dj1 dj1Var = (ads_mobile_sdk.dj1) obj2;
                dev.epro.r0.V7496420559085948492 v7496420559085948492 = (dev.epro.r0.V7496420559085948492) obj;
                java.util.Iterator it = dj1Var.e.values().iterator();
                while (it.hasNext()) {
                    ((ads_mobile_sdk.m6) it.next()).a();
                }
                java.util.Timer timer = new java.util.Timer();
                timer.schedule(new ads_mobile_sdk.bj1(dj1Var, v7496420559085948492, timer), 1000L);
                return o9245300239821758723;
            case 2:
                ((ads_mobile_sdk.m6) obj2).a((android.view.View) obj);
                return o9245300239821758723;
            default:
                dev.epro.r0.I16631908410500040363 i16631908410500040363 = (dev.epro.r0.I16631908410500040363) obj2;
                dev.epro.r0.X11644140690951955496 x11644140690951955496 = (dev.epro.r0.X11644140690951955496) obj;
                ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_ADREQUEST_PARSERESPONSE, dev.epro.r0.O2161699089510411363.a, true);
                try {
                    dev.epro.r0.P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("responses");
                    int i = 0;
                    dev.epro.r0.I16631908410500040363 i16631908410500040363L = !p16422848101170923038X.a.isEmpty() ? ((dev.epro.r0.K15572083692188606544) p16422848101170923038X.a.get(0)).l() : null;
                    dev.epro.r0.P16422848101170923038 p16422848101170923038X2 = i16631908410500040363L != null ? i16631908410500040363L.x("ad_configs") : null;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (p16422848101170923038X2 != null) {
                        java.util.ArrayList arrayList2 = p16422848101170923038X2.a;
                        int size = arrayList2.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            java.lang.Object obj3 = arrayList2.get(i3);
                            i3++;
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                dev.epro.r0.K5751602218013079365.f0();
                                throw null;
                            }
                            dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) obj3;
                            k15572083692188606544.getClass();
                            java.util.List list = ads_mobile_sdk.z1.D0;
                            ads_mobile_sdk.z1 z1VarG = dev.epro.r0.B6030175592171028728.g(k15572083692188606544.l(), i2, x11644140690951955496);
                            if (z1VarG != null) {
                                arrayList.add(z1VarG);
                            }
                            i2 = i4;
                        }
                    }
                    ads_mobile_sdk.hv hvVarF = dev.epro.r0.B6030175592171028728.f(i16631908410500040363L != null ? i16631908410500040363L.y("common") : null);
                    dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("actions");
                    dev.epro.r0.P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (p16422848101170923038K != null) {
                        java.util.ArrayList arrayList4 = p16422848101170923038K.a;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            java.lang.Object obj4 = arrayList4.get(i5);
                            i5++;
                            int i6 = i + 1;
                            if (i < 0) {
                                dev.epro.r0.K5751602218013079365.f0();
                                throw null;
                            }
                            dev.epro.r0.K15572083692188606544 k155720836921886065442 = (dev.epro.r0.K15572083692188606544) obj4;
                            k155720836921886065442.getClass();
                            ads_mobile_sdk.x23 x23VarD = dev.epro.r0.Q9282725956684299602.d(k155720836921886065442.l());
                            if (x23VarD != null) {
                                arrayList3.add(x23VarD);
                            }
                            i = i6;
                        }
                    }
                    ads_mobile_sdk.z23 z23Var = new ads_mobile_sdk.z23(arrayList, hvVarF, arrayList3);
                    th3VarA.close();
                    return z23Var;
                } catch (java.lang.Throwable th) {
                    try {
                        th3VarA.b(th);
                        if (th instanceof dev.epro.r0.N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                            th3VarA.a(th);
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
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            dev.epro.r0.Z1953481206310471956.z(th3VarA, th2);
                            throw th3;
                        }
                    }
                }
        }
    }
}
