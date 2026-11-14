package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ru2 extends ads_mobile_sdk.yu implements dev.epro.r0.F2170640016238248049 {
    public final ads_mobile_sdk.vw2 c;
    public final ads_mobile_sdk.dq2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(ads_mobile_sdk.od1 od1Var, ads_mobile_sdk.vw2 vw2Var, ads_mobile_sdk.dq2 dq2Var) {
        super(od1Var);
        od1Var.getClass();
        dq2Var.getClass();
        this.c = vw2Var;
        this.e = dq2Var;
    }

    @Override // ads_mobile_sdk.yu
    public final dev.epro.r0.T18397286815848089648 a() {
        return (dev.epro.r0.T18397286815848089648) this.e.u.a("The backing field has not yet been initialized.");
    }

    @Override // ads_mobile_sdk.yu
    public final void destroy() {
        ads_mobile_sdk.dq2 dq2Var = this.e;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = dq2Var.b;
        ads_mobile_sdk.lp2 lp2Var = new ads_mobile_sdk.lp2(dq2Var, null, (byte) 0);
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(lp2Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }
}
