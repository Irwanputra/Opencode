package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ android.os.Bundle b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(android.app.Activity activity, android.os.Bundle bundle, byte b) {
        super(1);
        this.i = b;
        this.a = activity;
        this.b = bundle;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.i;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.uo uoVar = (ads_mobile_sdk.uo) obj;
                uoVar.getClass();
                if (uoVar.f.H0()) {
                    uoVar.a(this.a, 0);
                    uoVar.b(4);
                }
                break;
            default:
                ads_mobile_sdk.uo uoVar2 = (ads_mobile_sdk.uo) obj;
                uoVar2.getClass();
                if (uoVar2.f.H0()) {
                    uoVar2.b(4);
                }
                break;
        }
        return o9245300239821758723;
    }
}
