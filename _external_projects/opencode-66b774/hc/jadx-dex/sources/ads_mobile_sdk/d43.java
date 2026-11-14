package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d43 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.rw0 a;

    public d43(ads_mobile_sdk.rw0 rw0Var) {
        rw0Var.getClass();
        this.a = rw0Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("text");
        java.lang.String str2 = (java.lang.String) map.get("title");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str != null && !dev.epro.r0.M8927913404651150384.Y(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            if (str2 != null && !dev.epro.r0.M8927913404651150384.Y(str2)) {
                intent.putExtra("android.intent.extra.TITLE", str2);
            }
            this.a.a(intent);
        }
        return o9245300239821758723;
    }

    public final int b() {
        return 43;
    }
}
