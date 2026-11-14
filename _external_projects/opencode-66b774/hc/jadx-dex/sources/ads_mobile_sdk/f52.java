package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f52 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ ads_mobile_sdk.xr0 c;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f52(java.lang.Object obj, android.view.View view, ads_mobile_sdk.xr0 xr0Var, byte b) {
        super(0);
        this.i = b;
        this.a = obj;
        this.b = view;
        this.c = xr0Var;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        byte b = this.i;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.xr0 xr0Var = this.c;
        android.view.View view = this.b;
        java.lang.Object obj = this.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.m6 m6Var = (ads_mobile_sdk.m6) obj;
                if (!m6Var.f) {
                    m6Var.b.a(view, xr0Var);
                }
                break;
            default:
                ads_mobile_sdk.dj1 dj1Var = (ads_mobile_sdk.dj1) obj;
                for (ads_mobile_sdk.m6 m6Var2 : dj1Var.e.values()) {
                    if (!m6Var2.f) {
                        m6Var2.b.a(view, xr0Var);
                    }
                }
                dj1Var.f.a(view, xr0Var);
                break;
        }
        return o9245300239821758723;
    }
}
