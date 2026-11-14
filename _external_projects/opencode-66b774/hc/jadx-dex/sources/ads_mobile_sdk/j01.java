package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j01 {
    public final android.content.Context a;
    public final ads_mobile_sdk.jr0 b;
    public final dev.epro.r0.O12494175665883759871 c;

    public j01(android.content.Context context, ads_mobile_sdk.jr0 jr0Var) {
        context.getClass();
        jr0Var.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.H2607093550274855851(this, (byte) 2));
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z, ads_mobile_sdk.h92 h92Var) {
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return dev.epro.r0.V16504496955554646429.s(dev.epro.r0.E17093345031926825464.e(((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:hsdp_open_timeout:ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(60, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a), new ads_mobile_sdk.g01(this, str, str2, map, z, null), h92Var);
    }

    public final void a(java.lang.String str) {
        synchronized (((dev.epro.r0.K8888766238980911980) this.c.getValue())) {
            ((dev.epro.r0.K8888766238980911980) this.c.getValue()).a(str);
        }
    }

    public final java.lang.Object a(dev.epro.r0.B2825725843028148090 b2825725843028148090, ads_mobile_sdk.jg2 jg2Var) {
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return dev.epro.r0.V16504496955554646429.s(dev.epro.r0.E17093345031926825464.e(((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:hsdp_prewarm_timeout:ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(60, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a), new ads_mobile_sdk.fb((java.lang.Object) this, (java.lang.Object) b2825725843028148090, (dev.epro.r0.R4833348786910499294) null, (byte) 10), jg2Var);
    }
}
