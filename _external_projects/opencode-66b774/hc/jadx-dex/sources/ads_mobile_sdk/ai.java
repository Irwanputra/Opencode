package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ai implements dev.epro.r0.K4548097313143615345 {
    public final ads_mobile_sdk.g0 a;

    public ai(ads_mobile_sdk.g0 g0Var) {
        g0Var.getClass();
        this.a = g0Var;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.APP_OPEN;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z;
        ads_mobile_sdk.g0 g0Var = this.a;
        synchronized (g0Var) {
            z = g0Var.n;
        }
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.zh(z));
    }
}
