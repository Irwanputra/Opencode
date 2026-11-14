package ads_mobile_sdk;

import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R16580349318584449994;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fo3 implements Y4798753258822141670 {
    public final G8001132634698687269 a;

    public fo3(G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        this.a = g8001132634698687269;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("action");
        R4833348786910499294 r48333487869104992942 = null;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str == null || M8927913404651150384.Y(str)) {
            zi3.a(6, "Action is missing from a video GMSG: " + map, null);
            return o9245300239821758723;
        }
        sy0 sy0VarD = tx0Var.d();
        if (sy0VarD != null) {
            int iHashCode = str.hashCode();
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            G8001132634698687269 g8001132634698687269 = this.a;
            if (iHashCode == 114148) {
                if (str.equals("src")) {
                    Object objD0 = R7033599853981556291.d0(g8001132634698687269, new co3(map, sy0VarD, r48333487869104992942, (byte) 1), r4833348786910499294);
                    if (objD0 == z3437138737604933638) {
                        return objD0;
                    }
                }
                zi3.a(6, "Unhandled video GMSG: " + map, null);
                return o9245300239821758723;
            }
            if (iHashCode == 3532159) {
                if (str.equals("skip")) {
                    Object objD02 = R7033599853981556291.d0(g8001132634698687269, new R16580349318584449994(sy0VarD, r48333487869104992942, (byte) 5), r4833348786910499294);
                    if (objD02 == z3437138737604933638) {
                        return objD02;
                    }
                }
                zi3.a(6, "Unhandled video GMSG: " + map, null);
                return o9245300239821758723;
            }
            if (iHashCode == 1762557398 && str.equals("timeupdate")) {
                Object objD03 = R7033599853981556291.d0(g8001132634698687269, new co3(map, sy0VarD, r48333487869104992942, (byte) 0), r4833348786910499294);
                if (objD03 == z3437138737604933638) {
                    return objD03;
                }
            }
            zi3.a(6, "Unhandled video GMSG: " + map, null);
            return o9245300239821758723;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 11;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final boolean c() {
        return true;
    }
}
