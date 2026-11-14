package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class os3 implements dev.epro.r0.L1518091290833714583 {
    public final dev.epro.r0.W5797197595347441198 a;
    public final java.util.Optional b;

    public os3(dev.epro.r0.W5797197595347441198 w5797197595347441198, java.util.Optional optional) {
        w5797197595347441198.getClass();
        optional.getClass();
        this.a = w5797197595347441198;
        this.b = optional;
    }

    public final dev.epro.r0.O9245300239821758723 a(boolean z) {
        ads_mobile_sdk.tx0 tx0Var = (ads_mobile_sdk.tx0) dev.epro.r0.M18113111391818111737.H(this.b);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (tx0Var == null) {
            return o9245300239821758723;
        }
        java.lang.String str = z ? "1" : "0";
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.t("isVisible", str);
        dev.epro.r0.R7033599853981556291.E(this.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, null, (byte) 1), 3);
        return o9245300239821758723;
    }
}
