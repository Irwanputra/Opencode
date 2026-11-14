package ads_mobile_sdk;

import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U4857089234315512256;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class j9 implements E1738554508920355622 {
    public final g9 a;
    public final U4857089234315512256 b;

    public j9(g9 g9Var, U4857089234315512256 u4857089234315512256) {
        g9Var.getClass();
        u4857089234315512256.getClass();
        this.a = g9Var;
        this.b = u4857089234315512256;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object n(R4833348786910499294 r4833348786910499294) {
        g9 g9Var = this.a;
        String strE = this.b.e();
        if (strE != null) {
            synchronized (g9Var.a) {
                try {
                    Integer num = (Integer) g9Var.b.get(strE);
                    if (num == null) {
                        num = 0;
                    }
                    g9Var.b.put(strE, Integer.valueOf(num.intValue() + 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            g9Var.getClass();
        }
        return O9245300239821758723.a;
    }
}
