package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j9 implements dev.epro.r0.E1738554508920355622 {
    public final ads_mobile_sdk.g9 a;
    public final dev.epro.r0.U4857089234315512256 b;

    public j9(ads_mobile_sdk.g9 g9Var, dev.epro.r0.U4857089234315512256 u4857089234315512256) {
        g9Var.getClass();
        u4857089234315512256.getClass();
        this.a = g9Var;
        this.b = u4857089234315512256;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final java.lang.Object n(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        ads_mobile_sdk.g9 g9Var = this.a;
        java.lang.String strE = this.b.e();
        if (strE != null) {
            synchronized (g9Var.a) {
                try {
                    java.lang.Integer num = (java.lang.Integer) g9Var.b.get(strE);
                    if (num == null) {
                        num = 0;
                    }
                    g9Var.b.put(strE, java.lang.Integer.valueOf(num.intValue() + 1));
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } else {
            g9Var.getClass();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
