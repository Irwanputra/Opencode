package ads_mobile_sdk;

import dev.epro.r0.C7508661312750798838;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ox2 implements Y4798753258822141670 {
    public final C7508661312750798838 a;
    public final z1 b;

    public ox2(C7508661312750798838 c7508661312750798838, z1 z1Var) {
        c7508661312750798838.getClass();
        z1Var.getClass();
        this.a = c7508661312750798838;
        this.b = z1Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("action");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str != null) {
            int iHashCode = str.hashCode();
            C7508661312750798838 c7508661312750798838 = this.a;
            if (iHashCode != 98615580) {
                if (iHashCode != 1385608094) {
                    if (iHashCode == 2098866301 && str.equals("video_complete")) {
                        c7508661312750798838.f(r4833348786910499294);
                        return o9245300239821758723;
                    }
                } else if (str.equals("video_start")) {
                    c7508661312750798838.k(r4833348786910499294);
                    return o9245300239821758723;
                }
            } else if (str.equals("grant")) {
                sx2 sx2Var = this.b.k0;
                if (sx2Var != null) {
                    c7508661312750798838.a(sx2Var, r4833348786910499294);
                    return o9245300239821758723;
                }
                int i = 1;
                try {
                    String str2 = (String) map.get("amount");
                    if (str2 != null) {
                        i = Integer.parseInt(str2);
                    }
                } catch (NumberFormatException e) {
                    xv.c("Unable to parse reward amount: " + e, null);
                }
                String str3 = (String) map.get("type");
                if (str3 == null) {
                    str3 = "";
                }
                c7508661312750798838.a(new mu3(str3, i), r4833348786910499294);
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 19;
    }
}
