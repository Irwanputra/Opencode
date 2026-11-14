package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kz2 {
    public final ads_mobile_sdk.g0 a;
    public final ads_mobile_sdk.ci3 b;
    public final dev.epro.r0.O16637889491137121389 c;

    public kz2(ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.ci3 ci3Var, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        g0Var.getClass();
        ci3Var.getClass();
        o16637889491137121389.getClass();
        this.a = g0Var;
        this.b = ci3Var;
        this.c = o16637889491137121389;
    }

    public static ads_mobile_sdk.em2 a(ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.wv0 wv0Var, java.util.List list, ads_mobile_sdk.mi3 mi3Var) {
        boolean z;
        kz2Var.getClass();
        wv0Var.getClass();
        mi3Var.getClass();
        dev.epro.r0.O16637889491137121389 o16637889491137121389 = kz2Var.c;
        ads_mobile_sdk.ci3 ci3Var = kz2Var.b;
        o16637889491137121389.getClass();
        ci3Var.getClass();
        ads_mobile_sdk.c7 c7Var = new ads_mobile_sdk.c7((byte) 6);
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        uuidRandomUUID.getClass();
        ads_mobile_sdk.em2 em2Var = new ads_mobile_sdk.em2(wv0Var, list, uuidRandomUUID, mi3Var, c7Var, o16637889491137121389, ci3Var, 0, null, true, 1280);
        ((java.util.concurrent.atomic.AtomicReference) c7Var.a).set(em2Var);
        ads_mobile_sdk.ji3.a(ads_mobile_sdk.ji3.b(), null);
        ads_mobile_sdk.ji3.a(ads_mobile_sdk.ji3.b(), em2Var);
        ads_mobile_sdk.cc2 cc2Var = em2Var.k;
        ads_mobile_sdk.g0 g0Var = kz2Var.a;
        synchronized (g0Var) {
            z = g0Var.f39o;
        }
        cc2Var.x = z ? 3 : 2;
        return em2Var;
    }
}
