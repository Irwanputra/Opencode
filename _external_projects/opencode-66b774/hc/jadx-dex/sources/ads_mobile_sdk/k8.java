package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k8 extends ads_mobile_sdk.c61 {
    public final android.content.Context c;
    public final ads_mobile_sdk.jr0 d;
    public final ads_mobile_sdk.rw0 e;
    public final ads_mobile_sdk.g0 f;
    public final ads_mobile_sdk.aw g;
    public final java.lang.String h;
    public final ads_mobile_sdk.kz2 i;
    public ads_mobile_sdk.c7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(android.content.Context context, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.rw0 rw0Var, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.aw awVar, java.lang.String str, ads_mobile_sdk.kz2 kz2Var) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_INIT_SPAM, 2);
        context.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        g0Var.getClass();
        awVar.getClass();
        str.getClass();
        kz2Var.getClass();
        this.c = context;
        this.d = jr0Var;
        this.e = rw0Var;
        this.f = g0Var;
        this.g = awVar;
        this.h = str;
        this.i = kz2Var;
    }

    public final java.lang.String a(java.util.List list, android.view.View view) {
        java.lang.String queryParameter;
        java.lang.String strA;
        if (list.isEmpty()) {
            return "";
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            ads_mobile_sdk.rw0 rw0Var = this.e;
            rw0Var.getClass();
            uri.getClass();
            if (rw0Var.b(uri) && rw0Var.a(uri) && ((queryParameter = uri.getQueryParameter("ms")) == null || dev.epro.r0.M8927913404651150384.Y(queryParameter))) {
                ads_mobile_sdk.kz2 kz2Var = this.i;
                ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_CLICK_SIGNALS;
                dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
                ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                if (ads_mobile_sdk.ji3.b().a == null) {
                    ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        strA = ((ads_mobile_sdk.f7) b().a).a(c(), a(list), view, this.f.b());
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
                        } catch (java.lang.Throwable th2) {
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                dev.epro.r0.Z1953481206310471956.z(em2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        strA = ((ads_mobile_sdk.f7) b().a).a(c(), a(list), view, this.f.b());
                        th3VarA.close();
                    } catch (java.lang.Throwable th4) {
                        try {
                            th3VarA.b(th4);
                            if (th4 instanceof dev.epro.r0.N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof dev.epro.r0.P2480554073835519965) && !(th4 instanceof java.util.concurrent.CancellationException)) {
                                th3VarA.a(th4);
                            }
                            if (th4 instanceof dev.epro.r0.P2480554073835519965) {
                                throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th4);
                            }
                            if (th4 instanceof java.util.concurrent.CancellationException) {
                                throw new ads_mobile_sdk.du0(th4);
                            }
                            if (th4 instanceof ads_mobile_sdk.dv0) {
                                throw th4;
                            }
                            throw new ads_mobile_sdk.iu0(th4);
                        } catch (java.lang.Throwable th5) {
                            try {
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                dev.epro.r0.Z1953481206310471956.z(th3VarA, th5);
                                throw th6;
                            }
                        }
                    }
                }
                strA.getClass();
                return strA;
            }
        }
        return "";
    }

    public final java.lang.String b(java.util.ArrayList arrayList, android.view.View view) {
        java.lang.String strB;
        if (arrayList.isEmpty()) {
            return "";
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            if (this.e.b((android.net.Uri) obj)) {
                ads_mobile_sdk.kz2 kz2Var = this.i;
                ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_VIEW_SIGNALS;
                dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
                ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
                if (ads_mobile_sdk.ji3.b().a == null) {
                    ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        ads_mobile_sdk.c7 c7VarB = b();
                        strB = ((ads_mobile_sdk.f7) c7VarB.a).b(c(), a(arrayList), view, this.f.b());
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
                        } catch (java.lang.Throwable th2) {
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                dev.epro.r0.Z1953481206310471956.z(em2VarA, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
                    try {
                        ads_mobile_sdk.c7 c7VarB2 = b();
                        strB = ((ads_mobile_sdk.f7) c7VarB2.a).b(c(), a(arrayList), view, this.f.b());
                        th3VarA.close();
                    } catch (java.lang.Throwable th4) {
                        try {
                            th3VarA.b(th4);
                            if (th4 instanceof dev.epro.r0.N340633841638932414) {
                                throw th4;
                            }
                            if (!(th4 instanceof dev.epro.r0.P2480554073835519965) && !(th4 instanceof java.util.concurrent.CancellationException)) {
                                th3VarA.a(th4);
                            }
                            if (th4 instanceof dev.epro.r0.P2480554073835519965) {
                                throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th4);
                            }
                            if (th4 instanceof java.util.concurrent.CancellationException) {
                                throw new ads_mobile_sdk.du0(th4);
                            }
                            if (th4 instanceof ads_mobile_sdk.dv0) {
                                throw th4;
                            }
                            throw new ads_mobile_sdk.iu0(th4);
                        } catch (java.lang.Throwable th5) {
                            try {
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                dev.epro.r0.Z1953481206310471956.z(th3VarA, th5);
                                throw th6;
                            }
                        }
                    }
                }
                strB.getClass();
                return strB;
            }
        }
        return "";
    }

    public final android.content.Context c() {
        android.app.Activity activityB = this.f.b();
        return activityB != null ? activityB : this.c;
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.c7 c7Var;
        android.content.Context context = this.c;
        dev.epro.r0.F7878618420024429111 f7878618420024429111 = this.g.d;
        dev.epro.r0.Q4869062626651831947 q4869062626651831947 = this.d.u;
        q4869062626651831947.getClass();
        dev.epro.r0.R735986421272980610 r735986421272980610P = ads_mobile_sdk.j7.P();
        r735986421272980610P.getClass();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var.getClass();
        j7Var.hostType_ = dev.epro.r0.E12098517352909843120.d(2);
        j7Var.bitField0_ |= 64;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        boolean zBooleanValue = ((java.lang.Boolean) q4869062626651831947.a("gads:ad_spam_gass_call:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var2 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var2.bitField0_ |= 128;
        j7Var2.enableGassClient_ = zBooleanValue;
        boolean zBooleanValue2 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_af:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var3 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var3.bitField0_ |= 4;
        j7Var3.allowFallback_ = zBooleanValue2;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        boolean zBooleanValue3 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_afsp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var4 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var4.bitField0_ |= 8;
        j7Var4.allowFallbackToStaticProgram_ = zBooleanValue3;
        boolean zBooleanValue4 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_fisp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var5 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var5.bitField0_ |= 16;
        j7Var5.forceInitializeWithStaticProgram_ = zBooleanValue4;
        boolean zBooleanValue5 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_spuwsp:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var6 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var6.bitField0_ |= 33554432;
        j7Var6.skipProgramUpdateWithStaticProgram_ = zBooleanValue5;
        ads_mobile_sdk.ao aoVar2 = ads_mobile_sdk.ao.a$18;
        int i_a$2 = dev.epro.r0.G6547577305291411977._a$2(((java.lang.Number) q4869062626651831947.a("gads:as_rav", 2, aoVar2)).intValue());
        if (i_a$2 == 0) {
            i_a$2 = 2;
        }
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var7 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var7.getClass();
        j7Var7.requestedAdshieldVersion_ = dev.epro.r0.G6547577305291411977.g(i_a$2);
        j7Var7.bitField0_ |= 1;
        int i_a$22 = dev.epro.r0.G6547577305291411977._a$2(((java.lang.Number) q4869062626651831947.a("gads:as_fav", 1, aoVar2)).intValue());
        if (i_a$22 == 0) {
            i_a$22 = 2;
        }
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var8 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var8.getClass();
        j7Var8.fallbackAdshieldVersion_ = dev.epro.r0.G6547577305291411977.g(i_a$22);
        j7Var8.bitField0_ |= 2;
        boolean zBooleanValue6 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_emcs:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var9 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var9.bitField0_ |= 16777216;
        j7Var9.enableMinimalCerSignal_ = zBooleanValue6;
        dev.epro.r0.X13739385577301502566 x13739385577301502566T = ads_mobile_sdk.tm1.t();
        x13739385577301502566T.getClass();
        ads_mobile_sdk.ao aoVar3 = ads_mobile_sdk.ao.a$6;
        java.lang.String str = (java.lang.String) q4869062626651831947.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", aoVar3);
        x13739385577301502566T.b();
        ((ads_mobile_sdk.tm1) x13739385577301502566T.b).b(str);
        float fFloatValue = ((java.lang.Number) q4869062626651831947.a("gads:as_lsr", java.lang.Float.valueOf(0.01f), ads_mobile_sdk.ao.a$17)).floatValue();
        x13739385577301502566T.b();
        ads_mobile_sdk.tm1 tm1Var = (ads_mobile_sdk.tm1) x13739385577301502566T.b;
        tm1Var.bitField0_ |= 2;
        tm1Var.logSampleRate_ = fFloatValue;
        ads_mobile_sdk.ao aoVar4 = ads_mobile_sdk.ao.a$26;
        long jLongValue = ((java.lang.Number) q4869062626651831947.a("gads:as_lbs", 1000L, aoVar4)).longValue();
        x13739385577301502566T.b();
        ads_mobile_sdk.tm1 tm1Var2 = (ads_mobile_sdk.tm1) x13739385577301502566T.b;
        tm1Var2.bitField0_ |= 4;
        tm1Var2.logBufferSize_ = jLongValue;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.f;
        long jLongValue2 = ((java.lang.Number) q4869062626651831947.a("gads:as_li_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(1, n13798149404328803870))), aoVar4)).longValue();
        x13739385577301502566T.b();
        ads_mobile_sdk.tm1 tm1Var3 = (ads_mobile_sdk.tm1) x13739385577301502566T.b;
        tm1Var3.bitField0_ |= 8;
        tm1Var3.logIntervalMs_ = jLongValue2;
        ads_mobile_sdk.tm1 tm1Var4 = (ads_mobile_sdk.tm1) x13739385577301502566T.a();
        r735986421272980610P.b();
        ((ads_mobile_sdk.j7) r735986421272980610P.b).a(tm1Var4);
        boolean zBooleanValue7 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_vsb:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var10 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var10.bitField0_ |= 512;
        j7Var10.enableViewstringBinding_ = zBooleanValue7;
        dev.epro.r0.N13798149404328803870 n137981494043288038702 = dev.epro.r0.N13798149404328803870.e;
        long jLongValue3 = ((java.lang.Number) q4869062626651831947.a("gads:as_st_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(1, n137981494043288038702))), aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var11 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var11.bitField0_ |= 2048;
        j7Var11.signalsTimeoutMs_ = jLongValue3;
        long jLongValue4 = ((java.lang.Number) q4869062626651831947.a("gads:as_asqs_ms", 100L, aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var12 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var12.bitField0_ |= 1024;
        j7Var12.appStartQuerySignalsTimeoutMs_ = jLongValue4;
        long jLongValue5 = ((java.lang.Number) q4869062626651831947.a("gads:as_asw_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(5, n137981494043288038702))), aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var13 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var13.bitField0_ |= 524288;
        j7Var13.appStartWindowMs_ = jLongValue5;
        boolean zBooleanValue8 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_emassqs:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var14 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var14.bitField0_ |= 1048576;
        j7Var14.enableMinimalAppStartQuerySignals_ = zBooleanValue8;
        long jLongValue6 = ((java.lang.Number) q4869062626651831947.a("gads:as_gst_ms", 200L, aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var15 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var15.bitField0_ |= 8192;
        j7Var15.gassSignalTimeoutMs_ = jLongValue6;
        long jLongValue7 = ((java.lang.Number) q4869062626651831947.a("gads:as_list_ms", 200L, aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var16 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var16.bitField0_ |= 16384;
        j7Var16.localIntSignalTimeoutMs_ = jLongValue7;
        long jLongValue8 = ((java.lang.Number) q4869062626651831947.a("gads:as_hrt_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(10, n13798149404328803870))), aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var17 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var17.bitField0_ |= 32768;
        j7Var17.httpRequestTimeoutMs_ = jLongValue8;
        java.lang.String str2 = (java.lang.String) q4869062626651831947.a("gads:as_pic", "", aoVar3);
        r735986421272980610P.b();
        ((ads_mobile_sdk.j7) r735986421272980610P.b).d(str2);
        java.lang.String str3 = (java.lang.String) q4869062626651831947.a("gads:as_dic", "", aoVar3);
        r735986421272980610P.b();
        ((ads_mobile_sdk.j7) r735986421272980610P.b).b(str3);
        long jLongValue9 = ((java.lang.Number) q4869062626651831947.a("gads:as_mt_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(500, dev.epro.r0.N13798149404328803870.d))), aoVar4)).longValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var18 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var18.bitField0_ |= 262144;
        j7Var18.methodTimeoutMs_ = jLongValue9;
        boolean zBooleanValue9 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_caau:enabled", bool, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var19 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var19.bitField0_ |= 2097152;
        j7Var19.clearDgArgsAfterUse_ = zBooleanValue9;
        boolean zBooleanValue10 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_ls:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var20 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var20.bitField0_ |= 8388608;
        j7Var20.enableLazyScheduler_ = zBooleanValue10;
        boolean zBooleanValue11 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_eaiep:enabled", bool2, aoVar)).booleanValue();
        r735986421272980610P.b();
        ads_mobile_sdk.j7 j7Var21 = (ads_mobile_sdk.j7) r735986421272980610P.b;
        j7Var21.bitField0_ |= 67108864;
        j7Var21.enableAsyncInputEventProcessing_ = zBooleanValue11;
        dev.epro.r0.N6751852577264376817 n6751852577264376817W = ads_mobile_sdk.cn2.w();
        n6751852577264376817W.getClass();
        boolean zBooleanValue12 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_ubi:enabled", bool2, aoVar)).booleanValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var.bitField0_ |= 4;
        cn2Var.updateBeforeInitialization_ = zBooleanValue12;
        long jLongValue10 = ((java.lang.Number) q4869062626651831947.a("gads:as_aspud_ms", 0L, aoVar4)).longValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var2 = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var2.bitField0_ |= 64;
        cn2Var2.appStartProgramUpdateDelayMs_ = jLongValue10;
        long jLongValue11 = ((java.lang.Number) q4869062626651831947.a("gads:as_pae_ms", java.lang.Long.valueOf(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.Z(1, dev.epro.r0.N13798149404328803870.g))), aoVar4)).longValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var3 = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var3.bitField0_ |= 16;
        cn2Var3.programAlmostExpiredMs_ = jLongValue11;
        java.lang.String str4 = (java.lang.String) q4869062626651831947.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", aoVar3);
        n6751852577264376817W.b();
        ((ads_mobile_sdk.cn2) n6751852577264376817W.b).b(str4);
        boolean zBooleanValue13 = ((java.lang.Boolean) q4869062626651831947.a("gads:as_rpd:enabled", bool2, aoVar)).booleanValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var4 = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var4.bitField0_ |= 128;
        cn2Var4.enableRetryDownload_ = zBooleanValue13;
        long jLongValue12 = ((java.lang.Number) q4869062626651831947.a("gads:as_mrpda", 5L, aoVar4)).longValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var5 = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var5.bitField0_ |= 256;
        cn2Var5.maxRetryCount_ = jLongValue12;
        long jLongValue13 = ((java.lang.Number) q4869062626651831947.a("gads:as_rbi_ms", 60000L, aoVar4)).longValue();
        n6751852577264376817W.b();
        ads_mobile_sdk.cn2 cn2Var6 = (ads_mobile_sdk.cn2) n6751852577264376817W.b;
        cn2Var6.bitField0_ |= 512;
        cn2Var6.retryBaseIntervalMs_ = jLongValue13;
        ads_mobile_sdk.cn2 cn2Var7 = (ads_mobile_sdk.cn2) n6751852577264376817W.a();
        r735986421272980610P.b();
        ((ads_mobile_sdk.j7) r735986421272980610P.b).a(cn2Var7);
        dev.epro.r0.R735986421272980610 r735986421272980610N = ((ads_mobile_sdk.j7) r735986421272980610P.a()).n();
        java.lang.String str5 = this.h;
        r735986421272980610N.b();
        ((ads_mobile_sdk.j7) r735986421272980610N.b).c(str5);
        ads_mobile_sdk.j7 j7Var22 = (ads_mobile_sdk.j7) r735986421272980610N.a();
        synchronized (ads_mobile_sdk.c7.b) {
            try {
                c7Var = ads_mobile_sdk.c7.c;
                if (c7Var == null) {
                    context.getClass();
                    ads_mobile_sdk.c7 c7Var2 = new ads_mobile_sdk.c7(new ads_mobile_sdk.r80(new dev.epro.r0.P5733283974459951585((byte) 12), new dev.epro.r0.U11450443558875589191((byte) 15), new dev.epro.r0.P5733283974459951585((byte) 15), new dev.epro.r0.O12545633033254628644((byte) 7), f7878618420024429111, context, j7Var22));
                    ads_mobile_sdk.c7.c = c7Var2;
                    c7Var = c7Var2;
                }
            } finally {
            }
        }
        this.j = c7Var;
        ads_mobile_sdk.f61 f61Var = ((ads_mobile_sdk.f7) b().a).a;
        synchronized (f61Var) {
            try {
                if (f61Var.e == null) {
                    java.util.Set set = (java.util.Set) f61Var.b.get();
                    java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dev.epro.r0.L17385865533161060024) it.next()).a());
                    }
                    ads_mobile_sdk.vi3 vi3Var = (ads_mobile_sdk.vi3) f61Var.d.get();
                    ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_INITIALIZATION;
                    dev.epro.r0.T7468265282056741718 t7468265282056741718S = dev.epro.r0.B11509606741455062017.s(new dev.epro.r0.W10763134803956330397(dev.epro.r0.N7756202525712935399.n(arrayList)), new dev.epro.r0.A14169635274474290551((byte) 2), f61Var.c);
                    vi3Var.a(yk0Var, (dev.epro.r0.L7743116545240101509) t7468265282056741718S);
                    f61Var.e = t7468265282056741718S;
                    java.util.Iterator it2 = ((java.util.Set) f61Var.a.get()).iterator();
                    while (it2.hasNext()) {
                        ((dev.epro.r0.L17385865533161060024) it2.next()).a();
                    }
                    f61Var.e.getClass();
                }
            } finally {
            }
        }
        return new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
    }

    public final ads_mobile_sdk.c7 b() {
        ads_mobile_sdk.c7 c7Var = this.j;
        if (c7Var != null) {
            return c7Var;
        }
        dev.epro.r0.S10823041268949770285.b0("adShieldClient");
        throw null;
    }

    public final void b(java.util.List list) {
        ads_mobile_sdk.pb3 pb3Var = ((ads_mobile_sdk.f7) b().a).c.b;
        synchronized (pb3Var) {
            pb3Var.a.clear();
            pb3Var.a.addAll(list);
        }
    }

    public final java.lang.String a(android.view.ViewGroup viewGroup) {
        ads_mobile_sdk.c7 c7VarB = b();
        java.lang.String strB = ((ads_mobile_sdk.f7) c7VarB.a).b(c(), null, viewGroup, this.f.b());
        strB.getClass();
        return strB;
    }

    public final java.lang.String a(ads_mobile_sdk.tx0 tx0Var, ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.m31 m31Var) {
        java.lang.String strA = a(tx0Var);
        long j = eg2Var != null ? eg2Var.a.get() : 0L;
        java.lang.String strA2 = m31Var != null ? m31Var.a() : null;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.t("ms", strA);
        if (j > 0) {
            i16631908410500040363.s("plcmtid", java.lang.Long.valueOf(j));
        }
        ads_mobile_sdk.jr0 jr0Var = this.d;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:enable_impression_data:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() && strA2 != null && strA2.length() != 0) {
            i16631908410500040363.t("subpn", strA2);
        }
        return i16631908410500040363.toString();
    }

    public final android.net.Uri a(android.net.Uri uri, android.view.View view) {
        uri.getClass();
        view.getClass();
        java.lang.String strA = a(dev.epro.r0.K5751602218013079365.U(uri), view);
        if (dev.epro.r0.M8927913404651150384.Y(strA)) {
            return uri;
        }
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        return dev.epro.r0.P5733283974459951585.b(uri, strA);
    }

    public final java.lang.String a(android.view.View view, java.lang.String str) {
        ads_mobile_sdk.c7 c7VarB = b();
        java.lang.String strA = ((ads_mobile_sdk.f7) c7VarB.a).a(c(), str, view, this.f.b());
        strA.getClass();
        return strA;
    }

    public final java.lang.String a(java.util.List list) {
        java.lang.Object next;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            android.net.Uri uri = (android.net.Uri) next;
            if (this.e.b(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        android.net.Uri uri2 = (android.net.Uri) next;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }
}
