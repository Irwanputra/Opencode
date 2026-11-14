package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class eh implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final dev.epro.r0.B8427392651679410143 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ eh(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.B8427392651679410143 b8427392651679410143, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = b8427392651679410143;
    }

    public final java.lang.Object get() {
        java.util.LinkedHashMap linkedHashMap;
        long jElapsedRealtime;
        dev.epro.r0.C11752927553109765869 c11752927553109765869;
        switch (this.c) {
            case 0:
                return new ads_mobile_sdk.dh((ads_mobile_sdk.ed1) this.a.get(), (dev.epro.r0.J4422749016291691854) ((ads_mobile_sdk.az1) this.b).get());
            case 1:
                ads_mobile_sdk.c7 c7Var = (ads_mobile_sdk.c7) ((ads_mobile_sdk.ff) this.b).get();
                ads_mobile_sdk.jr0 jr0Var = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var.getClass();
                return new ads_mobile_sdk.x32(c7Var, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var, ads_mobile_sdk.cw0.DEVICE_TIER));
            case 2:
                return new ads_mobile_sdk.zx1((ads_mobile_sdk.y2) ((ads_mobile_sdk.rg0) this.a).get(), (ads_mobile_sdk.kx2) ((ads_mobile_sdk.z2) this.b).get());
            case 3:
                ads_mobile_sdk.ib1 ib1Var = (ads_mobile_sdk.ib1) ((ads_mobile_sdk.d6) this.b).get();
                ads_mobile_sdk.jr0 jr0Var2 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var2.getClass();
                return new ads_mobile_sdk.x32(ib1Var, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var2, ads_mobile_sdk.cw0.DISPLAY_COUNT));
            case 4:
                ads_mobile_sdk.c7 c7Var2 = (ads_mobile_sdk.c7) ((ads_mobile_sdk.da) this.b).get();
                ads_mobile_sdk.jr0 jr0Var3 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var3.getClass();
                return new ads_mobile_sdk.x32(c7Var2, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var3, ads_mobile_sdk.cw0.INSPECTOR_SIGNAL));
            case 5:
                ads_mobile_sdk.jr0 jr0Var4 = (ads_mobile_sdk.jr0) this.a.get();
                ads_mobile_sdk.c7 c7Var3 = (ads_mobile_sdk.c7) ((ads_mobile_sdk.lv) this.b).get();
                jr0Var4.getClass();
                return new ads_mobile_sdk.x32(c7Var3, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var4, ads_mobile_sdk.cw0.MEMORY));
            case 6:
                dev.epro.r0.G6575252167976303972 g6575252167976303972 = (dev.epro.r0.G6575252167976303972) ((ads_mobile_sdk.rk) this.b).get();
                ads_mobile_sdk.jr0 jr0Var5 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var5.getClass();
                return new ads_mobile_sdk.x32(g6575252167976303972, 1, 2, dev.epro.r0.O14838623545224379975.f(jr0Var5, ads_mobile_sdk.cw0.NATIVE_AD));
            case 7:
                ads_mobile_sdk.f8 f8Var = (ads_mobile_sdk.f8) ((ads_mobile_sdk.g8) this.b).get();
                ads_mobile_sdk.jr0 jr0Var6 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var6.getClass();
                return new ads_mobile_sdk.x32(f8Var, 1, 1, dev.epro.r0.O14838623545224379975.f(jr0Var6, ads_mobile_sdk.cw0.AD_SIZE));
            case 8:
                ads_mobile_sdk.f8 f8Var2 = (ads_mobile_sdk.f8) ((ads_mobile_sdk.h0) this.b).get();
                ads_mobile_sdk.jr0 jr0Var7 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var7.getClass();
                return new ads_mobile_sdk.x32(f8Var2, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var7, ads_mobile_sdk.cw0.RTB_SIGNAL));
            case 9:
                ads_mobile_sdk.c7 c7Var4 = (ads_mobile_sdk.c7) ((ads_mobile_sdk.o7) this.b).get();
                ads_mobile_sdk.jr0 jr0Var8 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var8.getClass();
                return new ads_mobile_sdk.x32(c7Var4, 1, 2, dev.epro.r0.O14838623545224379975.f(jr0Var8, ads_mobile_sdk.cw0.AD_SPAM));
            case 10:
                ads_mobile_sdk.w8 w8Var = (ads_mobile_sdk.w8) ((ads_mobile_sdk.b7) this.b).get();
                ads_mobile_sdk.jr0 jr0Var9 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var9.getClass();
                return new ads_mobile_sdk.x32(w8Var, 1, 1, dev.epro.r0.O14838623545224379975.f(jr0Var9, ads_mobile_sdk.cw0.AD_TYPE));
            case 11:
                ads_mobile_sdk.ck ckVar = (ads_mobile_sdk.ck) this.a.get();
                ads_mobile_sdk.qw2 qw2Var = (ads_mobile_sdk.qw2) this.b.get();
                ckVar.getClass();
                qw2Var.getClass();
                synchronized (ckVar.c) {
                    try {
                        if (ckVar.g == null) {
                            ckVar.a.getClass();
                            ckVar.g = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                        }
                        ckVar.d++;
                        ckVar.e++;
                        java.lang.String strName = qw2Var.name();
                        int iIntValue = ((java.lang.Number) ckVar.f.getOrDefault(strName, 0)).intValue();
                        ads_mobile_sdk.jr0 jr0Var10 = ckVar.b;
                        jr0Var10.getClass();
                        if (((java.lang.Boolean) jr0Var10.a("gads:enable_per_format_prior_requests_signal", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                            linkedHashMap = new java.util.LinkedHashMap(ckVar.f);
                            linkedHashMap.put(strName, java.lang.Integer.valueOf(iIntValue));
                        } else {
                            linkedHashMap = dev.epro.r0.X9852054718446117252.a;
                        }
                        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                        ckVar.f.put(strName, java.lang.Integer.valueOf(iIntValue + 1));
                        java.lang.Long l = ckVar.g;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            ckVar.a.getClass();
                            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - jLongValue;
                        } else {
                            jElapsedRealtime = 0;
                        }
                        c11752927553109765869 = new dev.epro.r0.C11752927553109765869(java.lang.String.valueOf(ckVar.d), ckVar.d, ckVar.e, jElapsedRealtime, linkedHashMap2);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return c11752927553109765869;
            case 12:
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((ads_mobile_sdk.rg0) this.a).get();
                java.util.Map map = (java.util.Map) this.b.get();
                w5797197595347441198.getClass();
                map.getClass();
                return new dev.epro.r0.K182608585094072039(w5797197595347441198, map);
            default:
                ads_mobile_sdk.ls lsVar = (ads_mobile_sdk.ls) ((ads_mobile_sdk.ev) this.b).get();
                ads_mobile_sdk.jr0 jr0Var11 = (ads_mobile_sdk.jr0) this.a.get();
                jr0Var11.getClass();
                return new ads_mobile_sdk.x32(lsVar, 2, 2, dev.epro.r0.O14838623545224379975.f(jr0Var11, ads_mobile_sdk.cw0.CLD));
        }
    }

    public /* synthetic */ eh(dev.epro.r0.B8427392651679410143 b8427392651679410143, dev.epro.r0.V2597580950516131749 v2597580950516131749, byte b) {
        this.c = b;
        this.b = b8427392651679410143;
        this.a = v2597580950516131749;
    }
}
