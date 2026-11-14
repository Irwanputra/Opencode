package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ju0 extends dev.epro.r0.Z4899479314060394891 implements dev.epro.r0.G15142808377942141248 {
    public final ads_mobile_sdk.ci3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(ads_mobile_sdk.ci3 ci3Var) {
        super(dev.epro.r0.B14824868959299866349.e);
        ci3Var.getClass();
        this.a = ci3Var;
    }

    public final void handleException(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Throwable th) {
        g8001132634698687269.getClass();
        th.getClass();
        ads_mobile_sdk.xv.c("Uncaught exception on context " + g8001132634698687269 + ": " + th, null);
        try {
            this.a.b(th);
        } catch (java.lang.Throwable th2) {
            ads_mobile_sdk.xv.c("Failed to report untrapped exception: " + th2, null);
        }
    }
}
