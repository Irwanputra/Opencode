package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class m3 implements dev.epro.r0.K3711868874634114208 {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public m3(ads_mobile_sdk.r80 r80Var) {
        this.b = this;
        this.a = r80Var;
        ads_mobile_sdk.gj0 gj0Var = new ads_mobile_sdk.gj0(dev.epro.r0.G16660188620551127941.g);
        ads_mobile_sdk.hb1 hb1Var = r80Var.b;
        ads_mobile_sdk.hb1 hb1Var2 = r80Var.d;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = r80Var.B;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = r80Var.D;
        dev.epro.r0.V2597580950516131749 v25975809505161317493 = r80Var.s;
        ads_mobile_sdk.hb1 hb1Var3 = r80Var.j;
        ads_mobile_sdk.gj0 gj0Var2 = new ads_mobile_sdk.gj0(new ads_mobile_sdk.dv2(hb1Var, hb1Var2, v2597580950516131749, (dev.epro.r0.V2597580950516131749) gj0Var, v25975809505161317492, v25975809505161317493, hb1Var3));
        this.c = gj0Var2;
        this.d = new ads_mobile_sdk.gj0(new ads_mobile_sdk.dv2(hb1Var2, (dev.epro.r0.V2597580950516131749) gj0Var2, v2597580950516131749, r80Var.A, (dev.epro.r0.V2597580950516131749) new ads_mobile_sdk.gj0(dev.epro.r0.M9216324016624295870.p), new ads_mobile_sdk.v80(this), hb1Var3));
    }

    public java.lang.Object b(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.qw2 qw2Var = (ads_mobile_sdk.qw2) this.b;
        ads_mobile_sdk.xj xjVar = (ads_mobile_sdk.xj) this.a;
        if (((java.util.concurrent.atomic.AtomicBoolean) this.c).getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) xjVar.d.get(qw2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (((java.util.concurrent.atomic.AtomicBoolean) this.d).getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = (java.util.concurrent.atomic.AtomicInteger) xjVar.e.get(qw2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public m3(ads_mobile_sdk.xj xjVar, ads_mobile_sdk.qw2 qw2Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        xjVar.getClass();
        qw2Var.getClass();
        this.a = xjVar;
        this.b = qw2Var;
        this.c = atomicBoolean;
        this.d = atomicBoolean2;
    }
}
