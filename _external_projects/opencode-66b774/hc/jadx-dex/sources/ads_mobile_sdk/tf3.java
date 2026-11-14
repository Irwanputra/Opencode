package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tf3 implements dev.epro.r0.J4422749016291691854 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final ads_mobile_sdk.y2 b;
    public final dev.epro.r0.F354011078084083645 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;

    public tf3(dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.of3 of3Var, dev.epro.r0.F354011078084083645 f354011078084083645) {
        w5797197595347441198.getClass();
        y2Var.getClass();
        of3Var.getClass();
        f354011078084083645.getClass();
        this.a = w5797197595347441198;
        this.b = y2Var;
        this.d = f354011078084083645;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(android.content.Context context, boolean z, boolean z2) {
        context.getClass();
        boolean andSet = this.e.getAndSet(true);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.a;
        if (andSet) {
            ads_mobile_sdk.xv.a("This ad has already been shown.", (java.lang.Exception) null);
            ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.qf3(this, null, (byte) 0));
            ads_mobile_sdk.zi3.a(6, "The ad has already been shown", null);
        } else {
            try {
                this.d.a();
                throw null;
            } catch (java.lang.Exception e) {
                ads_mobile_sdk.zi3.a(4, "Mediation Fullscreen Ad failed to show.", e);
                ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.qf3(this, null, (byte) 1));
            }
        }
    }
}
