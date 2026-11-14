package ads_mobile_sdk;

import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z13168519540281190457;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class rr0 implements Y4798753258822141670 {
    public final W5797197595347441198 a;

    public rr0(W5797197595347441198 w5797197595347441198) {
        w5797197595347441198.getClass();
        this.a = w5797197595347441198;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        int i;
        String str = (String) map.get("height");
        Integer G = str != null ? Z13168519540281190457.G(10, str) : null;
        if (G != null) {
            synchronized (tx0Var) {
                i = tx0Var.s;
            }
            if (i != G.intValue()) {
                int intValue = G.intValue();
                synchronized (tx0Var) {
                    tx0Var.s = intValue;
                }
                zi3.a(this.a, new ex0(tx0Var, null, (byte) 3));
            }
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 55;
    }
}
