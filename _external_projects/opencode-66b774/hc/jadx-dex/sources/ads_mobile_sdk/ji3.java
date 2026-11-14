package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class ji3 {
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap();
    public static final dev.epro.r0.H10984080903272140752 b = new dev.epro.r0.H10984080903272140752((byte) 10);

    public static ads_mobile_sdk.th3 a(ads_mobile_sdk.ii3 ii3Var, ads_mobile_sdk.th3 th3Var) {
        ads_mobile_sdk.th3 th3Var2 = ii3Var.a;
        if (th3Var2 == th3Var) {
            return th3Var;
        }
        long jCurrentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        if (th3Var2 != null) {
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            th3Var2.e.addAndGet(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.M9216324016624295870.a0(jCurrentThreadTimeMillis - ii3Var.b, dev.epro.r0.N13798149404328803870.d)));
        }
        ii3Var.b = jCurrentThreadTimeMillis;
        ii3Var.a = th3Var;
        ads_mobile_sdk.c7 c7Var = ii3Var.c;
        if (c7Var == null) {
            return th3Var2;
        }
        c7Var.a = th3Var;
        return th3Var2;
    }

    public static ads_mobile_sdk.xp1 b(ads_mobile_sdk.wv0 wv0Var, java.util.List list, boolean z) {
        ads_mobile_sdk.xv.a("Attempted to start a trace " + wv0Var.name() + " without a parent. Did you forget to start a root trace or propagate an existing one?");
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        uuidRandomUUID.getClass();
        return new ads_mobile_sdk.xp1(wv0Var, list, uuidRandomUUID, new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8()), 0, 0, null, z);
    }

    public static ads_mobile_sdk.th3 a(ads_mobile_sdk.wv0 wv0Var, java.util.List list, boolean z) {
        ads_mobile_sdk.th3 th3VarB;
        wv0Var.getClass();
        ads_mobile_sdk.th3 th3Var = b().a;
        if (th3Var != null) {
            th3VarB = th3Var.a(wv0Var, list, z);
        } else {
            th3VarB = b(wv0Var, list, z);
        }
        a(b(), th3VarB);
        return th3VarB;
    }

    public static ads_mobile_sdk.th3 a() {
        ads_mobile_sdk.th3 th3Var = b().a;
        if (th3Var != null) {
            return th3Var;
        }
        ads_mobile_sdk.xp1 xp1VarB = b(ads_mobile_sdk.wv0.CUI_NAME_UNKNOWN, dev.epro.r0.O2161699089510411363.a, true);
        a(b(), xp1VarB);
        return xp1VarB;
    }

    public static ads_mobile_sdk.ii3 b() {
        dev.epro.r0.H10984080903272140752 h10984080903272140752 = b;
        java.lang.Object ii3Var = h10984080903272140752.get();
        if (ii3Var == null) {
            ii3Var = new ads_mobile_sdk.ii3(android.os.SystemClock.currentThreadTimeMillis());
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            java.util.WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
            }
            h10984080903272140752.set(ii3Var);
        }
        return (ads_mobile_sdk.ii3) ii3Var;
    }
}
