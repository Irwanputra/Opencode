package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k80 extends ads_mobile_sdk.c61 implements dev.epro.r0.S3216761178606715008, dev.epro.r0.I12024973293062010767, dev.epro.r0.E1738554508920355622 {
    public final ads_mobile_sdk.i80 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final ads_mobile_sdk.jr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(ads_mobile_sdk.i80 i80Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var) {
        super((ads_mobile_sdk.wv0) null, 1);
        i80Var.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.c = i80Var;
        this.d = w5797197595347441198;
        this.e = jr0Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.F11004654978627682545 f11004654978627682545, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:cct_v2_prewarm_on_ad_loaded:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            b$1();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final void b$1() {
        dev.epro.r0.R16580349318584449994 r16580349318584449994 = new dev.epro.r0.R16580349318584449994(this, (dev.epro.r0.R4833348786910499294) null, (byte) 10);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(r16580349318584449994, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    public final void f() {
        ads_mobile_sdk.jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:cct_v2_prewarm_on_signal_generated:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            b$1();
        }
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:cct_v2_prewarm_at_init:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            b$1();
        }
        return new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object q(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:cct_v2_prewarm_on_impression:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            b$1();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
