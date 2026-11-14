package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class e80 extends dev.epro.r0.I3887072968740112330 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final ads_mobile_sdk.jr0 c;
    public final java.lang.Object e;
    public boolean f;
    public dev.epro.r0.X7175349259954592591 g;
    public long h;
    public long i;
    public final dev.epro.r0.P16422848101170923038 m;
    public final java.util.List n;

    public e80(dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.n53 n53Var) {
        dev.epro.r0.P16422848101170923038 p16422848101170923038;
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        n53Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = jr0Var;
        this.e = new java.lang.Object();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.h = 0L;
        this.i = 0L;
        try {
            p16422848101170923038 = (dev.epro.r0.P16422848101170923038) new dev.epro.r0.F14240031463097426304().b(dev.epro.r0.P16422848101170923038.class, (java.lang.String) jr0Var.a("gads:pact_active_exp_id:enabled", "[]", ads_mobile_sdk.ao.a$6));
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(e);
            p16422848101170923038 = null;
        }
        this.m = p16422848101170923038 == null ? new dev.epro.r0.P16422848101170923038() : p16422848101170923038;
        ads_mobile_sdk.jr0 jr0Var2 = this.c;
        jr0Var2.getClass();
        this.n = (java.util.List) jr0Var2.a("gads:pact_navigation_event_to_request_channel", dev.epro.r0.K5751602218013079365.U("1"), ads_mobile_sdk.ao.a$23);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ads_mobile_sdk.e80 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.y70
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.y70 r0 = (ads_mobile_sdk.y70) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.y70 r0 = new ads_mobile_sdk.y70
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r0 = r0.d
            r1 = 0
            if (r0 == 0) goto L2c
            r6 = 1
            if (r0 == r6) goto L28
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return
        L28:
            dev.epro.r0.E17665849472693074628.k(r7)
            throw r1
        L2c:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Object r7 = r6.e
            monitor-enter(r7)
            boolean r0 = r6.f     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            dev.epro.r0.E17149812035295265804 r0 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> L56
            dev.epro.r0.O16637889491137121389 r0 = r6.b     // Catch: java.lang.Throwable -> L56
            r0.getClass()     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L56
            dev.epro.r0.N13798149404328803870 r0 = dev.epro.r0.N13798149404328803870.d     // Catch: java.lang.Throwable -> L56
            long r2 = dev.epro.r0.M9216324016624295870.a0(r2, r0)     // Catch: java.lang.Throwable -> L56
            long r4 = r6.i     // Catch: java.lang.Throwable -> L56
            int r6 = dev.epro.r0.E17093345031926825464.c(r2, r4)     // Catch: java.lang.Throwable -> L56
            if (r6 <= 0) goto L50
            goto L58
        L50:
            java.lang.String r6 = "session"
            dev.epro.r0.S10823041268949770285.b0(r6)     // Catch: java.lang.Throwable -> L56
            throw r1     // Catch: java.lang.Throwable -> L56
        L56:
            r6 = move-exception
            goto L5a
        L58:
            monitor-exit(r7)
            return
        L5a:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e80.a(ads_mobile_sdk.e80, dev.epro.r0.K14749510448791472029):void");
    }

    public final void extraCallback(java.lang.String str) {
        str.getClass();
        synchronized (this.e) {
        }
    }

    public final void extraCallbackWithResult(java.lang.String str) {
        str.getClass();
        synchronized (this.e) {
        }
    }

    public final void onActivityResized(android.os.Bundle bundle) {
        bundle.getClass();
        try {
            synchronized (this.e) {
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void onMessageChannelReady() {
        synchronized (this.e) {
            this.f = false;
        }
    }

    public final void onNavigationEvent(int i) {
        long j;
        synchronized (this.e) {
            try {
                this.f = false;
                dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
                this.b.getClass();
                this.h = dev.epro.r0.M9216324016624295870.a0(java.lang.System.currentTimeMillis(), dev.epro.r0.N13798149404328803870.d);
                if (this.n.contains(java.lang.String.valueOf(i))) {
                    long j2 = this.h;
                    ads_mobile_sdk.jr0 jr0Var = this.c;
                    jr0Var.getClass();
                    if (((java.lang.Boolean) jr0Var.a("gads:pact_polling_forever:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                        j = dev.epro.r0.E17093345031926825464.c;
                    } else {
                        ads_mobile_sdk.jr0 jr0Var2 = this.c;
                        jr0Var2.getClass();
                        j = ((dev.epro.r0.E17093345031926825464) jr0Var2.a("gads:pact_polling_duration_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(60, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a;
                    }
                    this.i = dev.epro.r0.E17093345031926825464.h(j2, j);
                    dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.g;
                    if (x7175349259954592591 == null || x7175349259954592591.p()) {
                        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.a;
                        dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(this, (dev.epro.r0.R4833348786910499294) null, (byte) 3);
                        dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
                        w5797197595347441198.getClass();
                        this.g = dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void onPostMessage(java.lang.String str) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363;
        str.getClass();
        try {
            i16631908410500040363 = (dev.epro.r0.I16631908410500040363) new dev.epro.r0.F14240031463097426304().b(dev.epro.r0.I16631908410500040363.class, str);
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            i16631908410500040363 = null;
        }
        if (i16631908410500040363 == null || ads_mobile_sdk.d62.a(i16631908410500040363, "gpa", -1) != 0) {
            synchronized (this.e) {
            }
            return;
        }
        synchronized (this.e) {
            this.f = true;
        }
        ads_mobile_sdk.d62.a(i16631908410500040363, "paw_id", "");
        synchronized (this.e) {
            dev.epro.r0.J10770752472956524045 j10770752472956524045 = dev.epro.r0.H14305894327539119220.i;
            dev.epro.r0.H14305894327539119220 h14305894327539119220 = new dev.epro.r0.H14305894327539119220(false);
            dev.epro.r0.Y12917327898100101934 y12917327898100101934 = this.m;
            if (y12917327898100101934 == null) {
                y12917327898100101934 = dev.epro.r0.Y12917327898100101934.a;
            }
            h14305894327539119220.put("eids", y12917327898100101934);
            h14305894327539119220.put("gsppack", new dev.epro.r0.D16457379462628768197(java.lang.Boolean.TRUE));
            java.lang.String strValueOf = java.lang.String.valueOf(dev.epro.r0.E17093345031926825464.e(this.h));
            h14305894327539119220.put("fpt", strValueOf == null ? dev.epro.r0.Y12917327898100101934.a : new dev.epro.r0.D16457379462628768197(strValueOf));
            dev.epro.r0.S10823041268949770285.b0("session");
            throw null;
        }
    }

    public final void onRelationshipValidationResult(android.net.Uri uri) {
        uri.getClass();
        synchronized (this.e) {
        }
    }
}
