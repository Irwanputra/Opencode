package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cn0 implements dev.epro.r0.E16285158603488107888 {
    public final ads_mobile_sdk.bn0 a;
    public final ads_mobile_sdk.jr0 b;

    public cn0(ads_mobile_sdk.bn0 bn0Var, ads_mobile_sdk.jr0 jr0Var) {
        bn0Var.getClass();
        jr0Var.getClass();
        this.a = bn0Var;
        this.b = jr0Var;
    }

    @Override // dev.epro.r0.E16285158603488107888
    public final dev.epro.r0.P10917817599008460069 intercept(dev.epro.r0.N4061146215511977314 n4061146215511977314) {
        java.lang.String str = n4061146215511977314.e.a.h;
        java.lang.String strR = this.b.R();
        ads_mobile_sdk.bn0 bn0Var = this.a;
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse(dev.epro.r0.Z13168519540281190457.D(false, str, strR, bn0Var.c)).buildUpon().appendQueryParameter("gmp_app_id", bn0Var.a).appendQueryParameter("fbs_aiid", bn0Var.b);
        if (builderAppendQueryParameter.build().getQueryParameter("fbs_aeid") == null) {
            builderAppendQueryParameter.appendQueryParameter("fbs_aeid", bn0Var.c);
        }
        android.net.Uri uriBuild = builderAppendQueryParameter.build();
        dev.epro.r0.I1581330382723795749 i1581330382723795749 = new dev.epro.r0.I1581330382723795749((byte) 5);
        java.lang.String string = uriBuild.toString();
        string.getClass();
        i1581330382723795749.p(string);
        return n4061146215511977314.b(new dev.epro.r0.G842859980338292746(i1581330382723795749));
    }
}
