package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pa2 {
    public final ads_mobile_sdk.jr0 a;
    public final android.content.Context b;
    public final dev.epro.r0.O12494175665883759871 c;
    public final dev.epro.r0.O12494175665883759871 d;
    public final dev.epro.r0.O12494175665883759871 e;

    public pa2(android.content.Context context, ads_mobile_sdk.jr0 jr0Var) {
        jr0Var.getClass();
        context.getClass();
        this.a = jr0Var;
        this.b = context;
        this.c = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ma2(this, (byte) 1));
        this.d = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ma2(this, (byte) 2));
        this.e = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ma2(this, (byte) 0));
    }

    public final void a() {
        try {
            java.lang.Object value = this.c.getValue();
            value.getClass();
            ads_mobile_sdk.sa2 sa2Var = (ads_mobile_sdk.sa2) value;
            synchronized (ads_mobile_sdk.sa2.class) {
                sa2Var.f.a(sa2Var.c);
                sa2Var.f.a(sa2Var.a);
            }
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(4, "Exception while clearing PAIDV1", e);
        }
    }

    public final void b() {
        try {
            java.lang.Object value = this.d.getValue();
            value.getClass();
            ads_mobile_sdk.ua2 ua2Var = (ads_mobile_sdk.ua2) value;
            synchronized (ads_mobile_sdk.ua2.class) {
                try {
                    ads_mobile_sdk.ii iiVar = ua2Var.f;
                    if (((android.content.SharedPreferences) iiVar.b).contains(ua2Var.a)) {
                        ua2Var.f.a(ua2Var.c);
                        ua2Var.f.a(ua2Var.a);
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(4, "Exception while clearing PAIDV2", e);
        }
    }
}
