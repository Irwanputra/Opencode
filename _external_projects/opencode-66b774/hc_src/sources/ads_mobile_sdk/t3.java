package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z17063040099457330719;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class t3 implements Y4798753258822141670 {
    public final v3 a;
    public final Z17063040099457330719 b;

    public t3(v3 v3Var, Z17063040099457330719 z17063040099457330719) {
        v3Var.getClass();
        z17063040099457330719.getClass();
        this.a = v3Var;
        this.b = z17063040099457330719;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("info");
        if (str == null) {
            str = "";
        }
        Bundle a = d62.a(str);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (a == null) {
            zi3.a(6, "Unable to parse ad metadata info: ".concat(str), null);
            return o9245300239821758723;
        }
        v3 v3Var = this.a;
        v3Var.a.setValue(v3Var, v3.b[0], a);
        this.b.a(a, r4833348786910499294);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 20;
    }
}
