package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j23 extends ads_mobile_sdk.c61 {
    public final dev.epro.r0.W5797197595347441198 c;
    public final ads_mobile_sdk.jr0 d;
    public final ads_mobile_sdk.zj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j23(dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.zj1 zj1Var) {
        super((ads_mobile_sdk.wv0) null, 1);
        w5797197595347441198.getClass();
        jr0Var.getClass();
        zj1Var.getClass();
        this.c = w5797197595347441198;
        this.d = jr0Var;
        this.e = zj1Var;
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.F6899175859206092457 f6899175859206092457 = this.d.s;
        f6899175859206092457.getClass();
        if (((java.lang.Boolean) f6899175859206092457.a("gads:initialize_sdk_core_as_init_task:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(this, (dev.epro.r0.R4833348786910499294) null, (byte) 13);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.c;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        return new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
    }
}
