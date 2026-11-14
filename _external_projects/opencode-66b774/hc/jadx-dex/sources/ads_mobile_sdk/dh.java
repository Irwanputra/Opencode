package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class dh implements dev.epro.r0.G16562784700295586616 {
    public final ads_mobile_sdk.ed1 a;
    public final dev.epro.r0.J4422749016291691854 b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    public dh(ads_mobile_sdk.ed1 ed1Var, dev.epro.r0.J4422749016291691854 j4422749016291691854) {
        ed1Var.getClass();
        j4422749016291691854.getClass();
        this.a = ed1Var;
        this.b = j4422749016291691854;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final java.lang.Object a(ads_mobile_sdk.qo3 qo3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        if (qo3Var.b && this.c.compareAndSet(false, true) && this.a.i().u) {
            this.b.d();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
