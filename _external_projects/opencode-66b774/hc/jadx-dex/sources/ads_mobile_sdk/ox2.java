package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ox2 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.C7508661312750798838 a;
    public final ads_mobile_sdk.z1 b;

    public ox2(dev.epro.r0.C7508661312750798838 c7508661312750798838, ads_mobile_sdk.z1 z1Var) {
        c7508661312750798838.getClass();
        z1Var.getClass();
        this.a = c7508661312750798838;
        this.b = z1Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("action");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str != null) {
            int iHashCode = str.hashCode();
            dev.epro.r0.C7508661312750798838 c7508661312750798838 = this.a;
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
                ads_mobile_sdk.sx2 sx2Var = this.b.k0;
                if (sx2Var != null) {
                    c7508661312750798838.a(sx2Var, r4833348786910499294);
                    return o9245300239821758723;
                }
                int i = 1;
                try {
                    java.lang.String str2 = (java.lang.String) map.get("amount");
                    if (str2 != null) {
                        i = java.lang.Integer.parseInt(str2);
                    }
                } catch (java.lang.NumberFormatException e) {
                    ads_mobile_sdk.xv.c("Unable to parse reward amount: " + e, null);
                }
                java.lang.String str3 = (java.lang.String) map.get("type");
                if (str3 == null) {
                    str3 = "";
                }
                c7508661312750798838.a(new ads_mobile_sdk.mu3(str3, i), r4833348786910499294);
            }
        }
        return o9245300239821758723;
    }

    public final int b() {
        return 19;
    }
}
