package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fo3 implements dev.epro.r0.Y4798753258822141670 {
    public final dev.epro.r0.G8001132634698687269 a;

    public fo3(dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        this.a = g8001132634698687269;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("action");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str == null || dev.epro.r0.M8927913404651150384.Y(str)) {
            ads_mobile_sdk.zi3.a(6, "Action is missing from a video GMSG: " + map, null);
            return o9245300239821758723;
        }
        ads_mobile_sdk.sy0 sy0VarD = tx0Var.d();
        if (sy0VarD != null) {
            int iHashCode = str.hashCode();
            dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
            dev.epro.r0.G8001132634698687269 g8001132634698687269 = this.a;
            if (iHashCode == 114148) {
                if (str.equals("src")) {
                    java.lang.Object objD0 = dev.epro.r0.R7033599853981556291.d0(g8001132634698687269, new ads_mobile_sdk.co3(map, sy0VarD, null, (byte) 1), r4833348786910499294);
                    if (objD0 == z3437138737604933638) {
                        return objD0;
                    }
                }
                ads_mobile_sdk.zi3.a(6, "Unhandled video GMSG: " + map, null);
                return o9245300239821758723;
            }
            if (iHashCode == 3532159) {
                if (str.equals("skip")) {
                    java.lang.Object objD02 = dev.epro.r0.R7033599853981556291.d0(g8001132634698687269, new dev.epro.r0.R16580349318584449994(sy0VarD, (dev.epro.r0.R4833348786910499294) null, (byte) 5), r4833348786910499294);
                    if (objD02 == z3437138737604933638) {
                        return objD02;
                    }
                }
                ads_mobile_sdk.zi3.a(6, "Unhandled video GMSG: " + map, null);
                return o9245300239821758723;
            }
            if (iHashCode == 1762557398 && str.equals("timeupdate")) {
                java.lang.Object objD03 = dev.epro.r0.R7033599853981556291.d0(g8001132634698687269, new ads_mobile_sdk.co3(map, sy0VarD, null, (byte) 0), r4833348786910499294);
                if (objD03 == z3437138737604933638) {
                    return objD03;
                }
            }
            ads_mobile_sdk.zi3.a(6, "Unhandled video GMSG: " + map, null);
            return o9245300239821758723;
        }
        return o9245300239821758723;
    }

    public final int b() {
        return 11;
    }

    public final boolean c() {
        return true;
    }
}
