package ads_mobile_sdk;

import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kg implements Y4798753258822141670 {
    public final y2 a;

    public kg(y2 y2Var) {
        y2Var.getClass();
        this.a = y2Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("name");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str == null) {
            xv.c("App event with no name parameter.", null);
            return o9245300239821758723;
        }
        this.a.a(str, (String) map.get("info"), r4833348786910499294);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 13;
    }
}
