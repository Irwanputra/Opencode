package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ol implements dev.epro.r0.R13857032526302973615 {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final /* synthetic */ byte c = 1;

    public ol(dev.epro.r0.G16864365537574524285 g16864365537574524285) {
        g16864365537574524285.getClass();
        this.a = g16864365537574524285;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final java.lang.Object c(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objA;
        byte b = this.c;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.a;
        switch (b) {
            case 0:
                return (((java.util.concurrent.atomic.AtomicBoolean) obj).compareAndSet(false, true) && (objA = ((dev.epro.r0.G16864365537574524285) obj2).a(r4833348786910499294)) == dev.epro.r0.Z3437138737604933638.a) ? objA : o9245300239821758723;
            default:
                ads_mobile_sdk.et0 et0Var = ((ads_mobile_sdk.tx0) obj2).f113o;
                if (et0Var != null) {
                    dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) obj;
                    dev.epro.r0.R16580349318584449994 r16580349318584449994 = new dev.epro.r0.R16580349318584449994(et0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 15);
                    w5797197595347441198.getClass();
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(r16580349318584449994, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                }
                return o9245300239821758723;
        }
    }

    public ol(ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.W5797197595347441198 w5797197595347441198) {
        tx0Var.getClass();
        w5797197595347441198.getClass();
        this.a = tx0Var;
        this.b = w5797197595347441198;
    }
}
