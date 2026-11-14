package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pm0 implements dev.epro.r0.Z17140323912468745023, dev.epro.r0.K3615309688696506893 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final ads_mobile_sdk.um0 b;
    public final ads_mobile_sdk.z1 c;
    public final dev.epro.r0.W5797197595347441198 d;

    public pm0(dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.um0 um0Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        u4857089234315512256.getClass();
        um0Var.getClass();
        z1Var.getClass();
        w5797197595347441198.getClass();
        this.a = u4857089234315512256;
        this.b = um0Var;
        this.c = z1Var;
        this.d = w5797197595347441198;
    }

    public final dev.epro.r0.O9245300239821758723 a(dev.epro.r0.R12517428114166698439 r12517428114166698439, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String strE;
        java.lang.Object objA = this.b.a("generateEventId");
        java.lang.String string = objA != null ? objA.toString() : null;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (string == null || (strE = this.a.e()) == null) {
            return o9245300239821758723;
        }
        android.os.Bundle bundleZ = dev.epro.r0.O5354877807466160604.z(new dev.epro.r0.H9390398899829886498[]{new dev.epro.r0.H9390398899829886498("_ai", strE), new dev.epro.r0.H9390398899829886498("reward_type", r12517428114166698439.getType()), new dev.epro.r0.H9390398899829886498("reward_value", new java.lang.Integer(r12517428114166698439.getAmount()))});
        android.os.Bundle bundle = this.c.q;
        bundle.putBundle("_ar", bundleZ);
        dev.epro.r0.H4546125934900659656 h4546125934900659656 = new dev.epro.r0.H4546125934900659656(this, bundle, string, (dev.epro.r0.R4833348786910499294) null, (byte) 18);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(h4546125934900659656, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        return o9245300239821758723;
    }

    public final java.lang.Object a(boolean z, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String strE = this.a.e();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (strE == null) {
            return o9245300239821758723;
        }
        ads_mobile_sdk.fb fbVar = new ads_mobile_sdk.fb(this, strE, z, (dev.epro.r0.R4833348786910499294) null);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(fbVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        return o9245300239821758723;
    }
}
