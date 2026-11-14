package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ca implements dev.epro.r0.G16562784700295586616 {
    public final ads_mobile_sdk.y2 a;
    public final java.util.concurrent.atomic.AtomicBoolean b;

    public ca(ads_mobile_sdk.y2 y2Var) {
        y2Var.getClass();
        this.a = y2Var;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final java.lang.Object a(ads_mobile_sdk.qo3 qo3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z = qo3Var.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (z && this.b.compareAndSet(false, true)) {
            this.a.q(r4833348786910499294);
        }
        return o9245300239821758723;
    }
}
