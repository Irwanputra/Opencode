package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class im1 implements Y4798753258822141670 {
    public final um0 a;
    public final z1 b;

    public im1(um0 um0Var, z1 z1Var) {
        um0Var.getClass();
        z1Var.getClass();
        this.a = um0Var;
        this.b = z1Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str;
        int i;
        String str2 = (String) map.get("eventName");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str2 != null && (str = (String) map.get("eventId")) != null) {
            if (!str2.equals("_ac")) {
                i = str2.equals("_ai") ? 2 : 1;
            }
            Bundle bundle = this.b.q;
            um0 um0Var = this.a;
            um0Var.getClass();
            um0.a(um0Var, i, bundle, str);
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 49;
    }
}
