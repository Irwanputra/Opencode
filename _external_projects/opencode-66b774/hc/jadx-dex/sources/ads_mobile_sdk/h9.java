package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class h9 implements dev.epro.r0.I12024973293062010767 {
    public final java.lang.String a;
    public final dev.epro.r0.U4857089234315512256 b;
    public final ads_mobile_sdk.g9 c;
    public final dev.epro.r0.O16637889491137121389 d;

    public h9(java.lang.String str, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.g9 g9Var, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        str.getClass();
        u4857089234315512256.getClass();
        g9Var.getClass();
        o16637889491137121389.getClass();
        this.a = str;
        this.b = u4857089234315512256;
        this.c = g9Var;
        this.d = o16637889491137121389;
    }

    public final java.lang.Object a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.F11004654978627682545 f11004654978627682545, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String strE = this.b.e();
        this.d.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ads_mobile_sdk.g9 g9Var = this.c;
        g9Var.getClass();
        java.lang.String str = this.a;
        str.getClass();
        dev.epro.r0.E17093345031926825464 e17093345031926825464 = (dev.epro.r0.E17093345031926825464) g9Var.c.get(str);
        if (e17093345031926825464 != null && strE != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = g9Var.d;
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
            concurrentHashMap.put(strE, new dev.epro.r0.E17093345031926825464(dev.epro.r0.E17093345031926825464.g(dev.epro.r0.M9216324016624295870.a0(jElapsedRealtime, dev.epro.r0.N13798149404328803870.d), e17093345031926825464.a)));
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
