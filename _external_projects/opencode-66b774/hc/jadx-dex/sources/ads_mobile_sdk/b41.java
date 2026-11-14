package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class b41 {
    public volatile dev.epro.r0.V10300877997588547986 a;

    public final dev.epro.r0.V10300877997588547986 a() {
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = this.a;
        if (v10300877997588547986 == null) {
            dev.epro.r0.M9197813449740923653 m9197813449740923653 = ads_mobile_sdk.xv.f4a;
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("InitializationConfig is requested but null. MobileAds.initialize() must be called first.");
            ads_mobile_sdk.ci3 ci3Var = ads_mobile_sdk.xv.a;
            if (ci3Var != null) {
                ci3Var.a("InitializationConfig is requested but null. MobileAds.initialize() must be called first.", (java.lang.Throwable) illegalStateException);
            }
        }
        return v10300877997588547986;
    }
}
